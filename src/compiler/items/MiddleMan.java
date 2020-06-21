package compiler.items;

import compiler.Scope;
import org.antlr.v4.runtime.ParserRuleContext;

public abstract class MiddleMan <T extends ParserRuleContext>{
    protected T head;
    protected Scope whoseScopeIamIn;
    public MiddleMan(T head, Scope whoseScopeIamIn){
        this.head = head;
        this.whoseScopeIamIn = whoseScopeIamIn;
    }

    public T getHead() {
        return head;
    }
}
