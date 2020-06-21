package compiler.items;

import compiler.Scope;
import gen.MiniJavaParser;

public class LocalDeclarationMiddleMan extends MiddleMan<MiniJavaParser.LocalDeclarationContext> {
    public LocalDeclarationMiddleMan(MiniJavaParser.LocalDeclarationContext head, Scope whoseScopeIamIn) {
        super(head, whoseScopeIamIn);
    }

    @Override
    public String toString() {
        return "LocalVar: (name: " + this.head.verName.getText() + ") (type: " +
                new TypeMiddleMan(this.head.type(),whoseScopeIamIn) + ")";
    }
}
