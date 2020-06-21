package compiler.items;

import compiler.G;


import compiler.Scope;
import compiler.configs.Modifiers;
import gen.MiniJavaParser;

import java.util.List;

public class InterfaceMethodDeclarationMiddleMan extends MiddleMan<MiniJavaParser.InterfaceMethodDeclarationContext> {
    public InterfaceMethodDeclarationMiddleMan(MiniJavaParser.InterfaceMethodDeclarationContext head, Scope whoseScopeIamIn) {
        super(head, whoseScopeIamIn);
    }

    @Override
    public String toString() {

        String modifier = G.getModifier(this.head.accessModifier());
        String out = "Method: " +  "(name: " + this.head.methodName.getText() + ") (returnType: " +
                (this.head.returnType().getText() ) + ") (accessModifier: "
                + G.getModifier(this.head.accessModifier()) + ")";

        if (this.head.parameterList() == null ) return out;
        return out + " " + G.getParameters(this.head.parameterList().parameter(), whoseScopeIamIn);
    }
}
