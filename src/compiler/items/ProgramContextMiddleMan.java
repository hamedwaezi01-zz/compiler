package compiler.items;

import compiler.Scope;
import gen.MiniJavaParser;

// We gotta use it as hash table input and gotta handle
//  the value part of process and other related things
public class ProgramContextMiddleMan extends MiddleMan<MiniJavaParser.ProgramContext> {


    public ProgramContextMiddleMan(MiniJavaParser.ProgramContext head, Scope whoseScopeIamIn) {
        super(head, whoseScopeIamIn);
    }

    @Override
    public String toString() {
        return "";
    }
}
