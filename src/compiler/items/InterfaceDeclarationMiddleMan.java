package compiler.items;

import compiler.Scope;
import gen.MiniJavaParser;

public class InterfaceDeclarationMiddleMan extends MiddleMan<MiniJavaParser.InterfaceDeclarationContext> {
    public InterfaceDeclarationMiddleMan(MiniJavaParser.InterfaceDeclarationContext head, Scope whoseScopeIamIn) {
        super(head, whoseScopeIamIn);
    }

    @Override
    public String toString() {
        return "Interface: " + "(name: " + this.head.interfaceName.getText() + ")";
    }
}
