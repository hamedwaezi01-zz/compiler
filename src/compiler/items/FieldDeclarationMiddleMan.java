package compiler.items;

import compiler.G;
import compiler.Scope;
import compiler.configs.Modifiers;
import gen.MiniJavaParser;

public class FieldDeclarationMiddleMan extends MiddleMan<MiniJavaParser.FieldDeclarationContext> {
    public FieldDeclarationMiddleMan(MiniJavaParser.FieldDeclarationContext head, Scope whoseScopeIamIn) {
        super(head, whoseScopeIamIn);
    }

    @Override
    public String toString() {

        return "Field: (name: " + this.head.fieldName.getText() + ") (type: " +
                new  TypeMiddleMan(this.head.type(), this.whoseScopeIamIn).toString() +
                ") (accessModifier: " + G.getModifier(this.head.accessModifier()) + ")";
    }
}
