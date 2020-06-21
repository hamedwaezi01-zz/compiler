package compiler;

import compiler.configs.Modifiers;
import compiler.configs.PrimitiveJavaTypes;
import compiler.items.TypeMiddleMan;
import gen.MiniJavaParser;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

// Global Class of high level functions
public class G {

    public static String getModifier(MiniJavaParser.AccessModifierContext acc) {

        String out = "NON-VALID";

        if (acc == null)
            out = Modifiers.pub.toString();
        else
            switch (acc.getText()) {
                case "private":
                    out = Modifiers.priv.toString();
                    break;
                case "public":
                    out = Modifiers.pub.toString();
                    break;
            }
        return out;
    }

    public static String getParameters(List<MiniJavaParser.ParameterContext> params, Scope scope) {
        String out = "(parametersType:";
        for (int i = 0; i < params.size(); i++) {
            out += " [" + new TypeMiddleMan(params.get(i).type(), scope).toString() + " , index: " + (i + 1) + "] ";
        }
        return out + ")";
    }

    public static String getImplementations(List<TerminalNode> identifiers) {
        String out = "";
        int i = 0;
        out += identifiers.get(i).getText();
        for (i = 1; i < identifiers.size(); i++)
            out += ", " + identifiers.get(i).getText();
        return out;
    }
}
