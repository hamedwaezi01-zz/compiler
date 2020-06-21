package compiler.items;

import compiler.G;
import compiler.Scope;
import gen.MiniJavaParser;

public class MethodDeclarationMiddleMan extends MiddleMan<MiniJavaParser.MethodDeclarationContext> {
    public MethodDeclarationMiddleMan(MiniJavaParser.MethodDeclarationContext head, Scope whoseScopeIamIn) {
        super(head, whoseScopeIamIn);
    }

    @Override
    public String toString() {
        String out = "Method: " +  "(name: " + this.head.methodName.getText() + ") (returnType: " +
                (this.head.returnType().getText() ) + ") (accessModifier: "
                + G.getModifier(this.head.accessModifier()) + ") ";

        if (this.head.parameterList() == null ) return out;
        return out + G.getParameters(this.head.parameterList().parameter(), whoseScopeIamIn);
    }
}
