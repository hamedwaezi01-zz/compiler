package compiler;

import compiler.items.MiddleMan;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.HashMap;
import java.util.Map;

public class Scope {
    private HashMap<String, MiddleMan> map;
    private ParserRuleContext head;
    private int indent;
    private String indentation = null;
    private Scope parent;
    public int nesteds;
    private String name;


    public Scope(ParserRuleContext head, Scope parent, String name) {
        this.name = name; // This string is used as header name of scope
        this.head = head;
        this.map = new HashMap<String, MiddleMan>();
        if (parent == null)
            this.indent = 1;
        else
            this.indent = parent.indent + 1;
        this.parent = parent;
        this.nesteds = 0;
    }

    public Scope getParent() {
        return parent;
    }

    public HashMap<String, MiddleMan> getMap() {
        return map;
    }

    public ParserRuleContext getHead() {
        return head;
    }
    public void decreaseIndent(){
        this.indent -= 1;
    }

    public int getIndent() {
        return indent;
    }

    public String makeIndent() {
        if (this.indentation == null) {
            indentation = "";
            for (int i = 0; i < indent; i++) indentation += '\t';
        }
        return indentation;
    }

    public String getName(){return this.name;}

    @Override
    public String toString() {
        return "-------------  " + this.name + " : " + this.head.getStart().getLine() + "  -------------\n" +
                getItemsString() +
                "-----------------------------------------\n";
    }

    public String getItemsString(){
        String out = "";
        for (Map.Entry<String, MiddleMan> entry: this.map.entrySet()){
            out += "Key = " + entry.getKey() + " | Value = " + entry.getValue() + '\n';
        }
        return out;
    }
}
