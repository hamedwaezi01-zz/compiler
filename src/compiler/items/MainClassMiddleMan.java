package compiler.items;

import compiler.Scope;
import gen.MiniJavaParser;

public class MainClassMiddleMan extends MiddleMan<MiniJavaParser.MainClassContext> {
    public MainClassMiddleMan(MiniJavaParser.MainClassContext head, Scope whoseScopeIamIn) {
        super(head, whoseScopeIamIn);
    }

    @Override
    public String toString() {
        return "MainClass: (name: " + this.head.className.getText() + ")";
    }
}
