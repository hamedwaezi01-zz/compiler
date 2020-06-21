package compiler.items;

import compiler.Scope;
import compiler.configs.BuiltinTypes;
import compiler.configs.PrimitiveJavaTypes;
import gen.MiniJavaParser;

import java.util.Map;

public class TypeMiddleMan extends MiddleMan<MiniJavaParser.TypeContext> {

    public TypeMiddleMan(MiniJavaParser.TypeContext head, Scope whoseScopeIamIn) {
        super(head, whoseScopeIamIn);
    }

    public boolean isDefined(String identifier) {
        for (BuiltinTypes type : BuiltinTypes.values())
            if (identifier.equals(type.getName())) return true;
        Scope tmp = this.whoseScopeIamIn;
        do {
            if (tmp.getMap().containsKey("class_" + identifier))
                return true;
            tmp = tmp.getParent();

        } while (tmp != null);
        return false;
    }

    @Override
    public String toString() {
        String out = "";

        if (this.head.javaType() != null)
//            out = (this.head.javaType().getText().equals("int") ? this.head.javaType().getText() : "bool");
            out = PrimitiveJavaTypes.getInstance().getType(this.head.javaType().getText());
        else
            out = "[classType = " + this.head.Identifier().getText() + ", isDefined = "
                    + this.isDefined(this.head.Identifier().getText()) + "]";

        if (this.head.LSB() == null) return out;
        return "array of " + out;

    }
}
