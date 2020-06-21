package compiler;

import compiler.configs.Modifiers;
import compiler.items.MiddleMan;
import gen.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class Compiler {
    public static void main(String[] args) throws IOException {
        int index = 1;
        CharStream stream = CharStreams.fromFileName("src/inputs/input"+index+".mj");
        MiniJavaLexer lexer = new MiniJavaLexer(stream);
        TokenStream tokens = new CommonTokenStream(lexer);
        MiniJavaParser parser = new MiniJavaParser(tokens);
        parser.setBuildParseTree(true);
        ParseTree tree = parser.program();

        ParseTreeWalker walker = new ParseTreeWalker();
        MiniJavaListener listener = new MiniJavaListener();
        walker.walk(listener, tree);
        String res = symbolTableToString(listener);

        FileWriter writer = new FileWriter("src/outputs/output"+index+".txt");
        writer.write(res);
        writer.close();
        System.out.println("Successfully wrote to file");
    }

    private static String symbolTableToString(MiniJavaListener listener){
        StringBuilder res = new StringBuilder();
        for(Scope scope: listener.getPrintQ()){
            res.append("-------------  ").append(scope.getName()).append(" : ").append(scope.getHead().getStart().getLine()).append("  -------------\n");
            res.append(itemsToString(scope));
            res.append("-----------------------------------------\n\n");
        }
        return res.toString();
    }

    private static String itemsToString(Scope scope){
        StringBuilder res = new StringBuilder();
        for (Map.Entry<String, MiddleMan> entry : scope.getMap().entrySet())
            res.append("Key = ").append(entry.getKey()).append("  | Value = ").append(entry.getValue().toString()).append("\n");
        return res.toString();
    }
}
