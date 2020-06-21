package compiler.items;

import compiler.G;
import compiler.Scope;
import gen.MiniJavaParser;

public class ClassDeclarationMiddleMan extends MiddleMan<MiniJavaParser.ClassDeclarationContext> {
    public ClassDeclarationMiddleMan(MiniJavaParser.ClassDeclarationContext head, Scope whoseScopeIamIn) {
        super(head, whoseScopeIamIn);
    }

    @Override
    public String toString() {
        String parent = "Object";
        int hasParent = 0;
        if (this.head.parentName != null) {
            parent = this.head.parentName.getText();
            hasParent++;
        }
        StringBuilder out = new StringBuilder("Class: (name: " + this.head.className.getText() + ") (extends : " + parent);
        if (this.head.Identifier().size() > 1 + hasParent) {
//            System.out.print(this.head.className.getText() +"  " + this.head.Identifier().size()+" : ");
            for (int i = 0; i < this.head.Identifier().size(); ++i)
//                System.out.print(this.head.Identifier(i) + " |    ");
//            System.out.println();
                out.append(" | implements: ").append(G.getImplementations(this.head.Identifier().subList(1 + hasParent, this.head.Identifier().size())));
        }
        return out + ")";
    }
}
