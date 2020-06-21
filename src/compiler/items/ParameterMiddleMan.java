package compiler.items;

import compiler.Scope;
import gen.MiniJavaParser;

public class ParameterMiddleMan extends MiddleMan<MiniJavaParser.ParameterContext> {
    private int index;

    public ParameterMiddleMan(MiniJavaParser.ParameterContext head, Scope whoseScopeIamIn, int index) {
        super(head, whoseScopeIamIn);
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    @Override
    public String toString() {
        return "Parameter: (name: " + this.head.Identifier().getText() + ") (type: " +
                new TypeMiddleMan(this.head.type(), whoseScopeIamIn) + ") (index: " + this.getIndex() + ")";
    }
}
