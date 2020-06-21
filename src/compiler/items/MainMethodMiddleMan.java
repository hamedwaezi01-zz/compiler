package compiler.items;

import compiler.G;
import compiler.Scope;
import gen.MiniJavaParser;

import java.util.LinkedList;


public class MainMethodMiddleMan extends MiddleMan<MiniJavaParser.MainMethodContext> {
    public MainMethodMiddleMan(MiniJavaParser.MainMethodContext head, Scope whoseScopeIamIn) {
        super(head, whoseScopeIamIn);
    }

    @Override
    public String toString() {
        LinkedList<MiniJavaParser.ParameterContext> params = new LinkedList<>();
        params.add(this.head.parameter());
        return "Method: (name: main) (returnType: void) " +
                "(accessModifier: ACCESS_MODIFIER_PUBLIC) " +
                G.getParameters(params, whoseScopeIamIn);

    }
}
