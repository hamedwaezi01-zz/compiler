package compiler;

import compiler.items.*;
import gen.MiniJavaBaseListener;
import gen.MiniJavaParser;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.LinkedList;


public class MiniJavaListener extends MiniJavaBaseListener {

    private Scope program;
    private LinkedList<Scope> printQ;
    private Scope currentScope;


    @Override
    public void enterProgram(MiniJavaParser.ProgramContext ctx) {
        super.enterProgram(ctx);
        program = new Scope(ctx, null, "program");
        printQ = new LinkedList<Scope>();
        this.currentScope = program;
        this.printQ.add(program);
    }

    @Override
    public void exitProgram(MiniJavaParser.ProgramContext ctx) {
        super.exitProgram(ctx);


    }

    @Override
    public void enterMainClass(MiniJavaParser.MainClassContext ctx) {
        super.enterMainClass(ctx);

        this.currentScope.getMap().put
                ("mainClass_" + ctx.className.getText(), new MainClassMiddleMan(ctx, currentScope));
        Scope tmp = new Scope(ctx, this.currentScope, ctx.className.getText());
        this.printQ.add(tmp);
        this.currentScope = tmp;

    }

    @Override
    public void exitMainClass(MiniJavaParser.MainClassContext ctx) {
        super.exitMainClass(ctx);

        this.currentScope = this.currentScope.getParent();
    }

    @Override
    public void enterMainMethod(MiniJavaParser.MainMethodContext ctx) {
        super.enterMainMethod(ctx);

        this.currentScope.getMap().put("method_main", new MainMethodMiddleMan(ctx, currentScope));
        Scope tmp = new Scope(ctx, currentScope, "mainMethod");
        this.printQ.add(tmp);
        this.currentScope = tmp;

        this.currentScope.getMap().
                put("var_" + ctx.parameter().Identifier().getText(),
                        new ParameterMiddleMan(ctx.parameter(), currentScope, 1));

    }

    @Override
    public void exitMainMethod(MiniJavaParser.MainMethodContext ctx) {
        super.exitMainMethod(ctx);
        this.currentScope = this.currentScope.getParent();
    }

    @Override
    public void enterClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx) {
        super.enterClassDeclaration(ctx);
//        System.out.println(ctx.className.getText() + "\t" + ctx.getStart().getLine());
//        System.out.println(this.currentScope == null);
        this.currentScope.getMap().put("class_" + ctx.className.getText(), new ClassDeclarationMiddleMan(ctx, currentScope));
        Scope tmp = new Scope(ctx, currentScope, ctx.className.getText());
        this.printQ.add(tmp);
        this.currentScope = tmp;
    }

    @Override
    public void exitClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx) {
        super.exitClassDeclaration(ctx);
        this.currentScope = this.currentScope.getParent();
    }

    @Override
    public void enterInterfaceDeclaration(MiniJavaParser.InterfaceDeclarationContext ctx) {
        super.enterInterfaceDeclaration(ctx);

        this.currentScope.getMap().put("interface_" + ctx.interfaceName.getText(), new InterfaceDeclarationMiddleMan(ctx, currentScope));
        Scope tmp = new Scope(ctx, currentScope, ctx.interfaceName.getText());
        this.printQ.add(tmp);
        this.currentScope = tmp;
    }

    @Override
    public void exitInterfaceDeclaration(MiniJavaParser.InterfaceDeclarationContext ctx) {
        super.exitInterfaceDeclaration(ctx);
        this.currentScope = this.currentScope.getParent();
    }

    @Override
    public void enterInterfaceMethodDeclaration(MiniJavaParser.InterfaceMethodDeclarationContext ctx) {
        super.enterInterfaceMethodDeclaration(ctx);

        this.currentScope.getMap().put("method_" + ctx.methodName.getText(), new InterfaceMethodDeclarationMiddleMan(ctx, currentScope));
//        Scope tmp = new Scope(ctx, currentScope, ctx.methodName.getText());
//        this.printQ.add(tmp);
//        this.currentScope = tmp;
    }

    @Override
    public void exitInterfaceMethodDeclaration(MiniJavaParser.InterfaceMethodDeclarationContext ctx) {
        super.exitInterfaceMethodDeclaration(ctx);
    }

    @Override
    public void enterFieldDeclaration(MiniJavaParser.FieldDeclarationContext ctx) {
        super.enterFieldDeclaration(ctx);
        this.currentScope.getMap().put("var_" + ctx.fieldName.getText(), new FieldDeclarationMiddleMan(ctx, currentScope));
    }

    @Override
    public void exitFieldDeclaration(MiniJavaParser.FieldDeclarationContext ctx) {
        super.exitFieldDeclaration(ctx);
    }

    @Override
    public void enterLocalDeclaration(MiniJavaParser.LocalDeclarationContext ctx) {
        super.enterLocalDeclaration(ctx);
        this.currentScope.getMap().put("var_" + ctx.verName.getText(), new LocalDeclarationMiddleMan(ctx, currentScope));
    }

    @Override
    public void exitLocalDeclaration(MiniJavaParser.LocalDeclarationContext ctx) {
        super.exitLocalDeclaration(ctx);
    }

    @Override
    public void enterMethodDeclaration(MiniJavaParser.MethodDeclarationContext ctx) {
        super.enterMethodDeclaration(ctx);

        this.currentScope.getMap().put("method_" + ctx.methodName.getText(), new MethodDeclarationMiddleMan(ctx, currentScope));
        Scope tmp = new Scope(ctx, currentScope, ctx.methodName.getText());
        this.printQ.add(tmp);
        this.currentScope = tmp;

        if (ctx.parameterList() != null)
            for (int i = 0; i < ctx.parameterList().parameter().size(); i++)
                this.currentScope.getMap().
                        put("var_" + ctx.parameterList().parameter(i).Identifier().getText(),
                                new ParameterMiddleMan(ctx.parameterList().parameter(i), currentScope, i + 1));


    }

    @Override
    public void exitMethodDeclaration(MiniJavaParser.MethodDeclarationContext ctx) {
        super.exitMethodDeclaration(ctx);

        this.currentScope = this.currentScope.getParent();
    }

    @Override
    public void enterParameterList(MiniJavaParser.ParameterListContext ctx) {
        super.enterParameterList(ctx);
    }

    @Override
    public void exitParameterList(MiniJavaParser.ParameterListContext ctx) {
        super.exitParameterList(ctx);
    }

    @Override
    public void enterParameter(MiniJavaParser.ParameterContext ctx) {
        super.enterParameter(ctx);
    }

    @Override
    public void exitParameter(MiniJavaParser.ParameterContext ctx) {
        super.exitParameter(ctx);
    }

    @Override
    public void enterMethodBody(MiniJavaParser.MethodBodyContext ctx) {
        super.enterMethodBody(ctx);
    }

    @Override
    public void exitMethodBody(MiniJavaParser.MethodBodyContext ctx) {
        super.exitMethodBody(ctx);
    }

    @Override
    public void enterType(MiniJavaParser.TypeContext ctx) {
        super.enterType(ctx);
    }

    @Override
    public void exitType(MiniJavaParser.TypeContext ctx) {
        super.exitType(ctx);
    }

    @Override
    public void enterBooleanType(MiniJavaParser.BooleanTypeContext ctx) {
        super.enterBooleanType(ctx);
    }

    @Override
    public void exitBooleanType(MiniJavaParser.BooleanTypeContext ctx) {
        super.exitBooleanType(ctx);
    }

    @Override
    public void enterIntType(MiniJavaParser.IntTypeContext ctx) {
        super.enterIntType(ctx);
    }

    @Override
    public void exitIntType(MiniJavaParser.IntTypeContext ctx) {
        super.exitIntType(ctx);
    }

    @Override
    public void enterReturnType(MiniJavaParser.ReturnTypeContext ctx) {
        super.enterReturnType(ctx);
    }

    @Override
    public void exitReturnType(MiniJavaParser.ReturnTypeContext ctx) {
        super.exitReturnType(ctx);
    }

    @Override
    public void enterAccessModifier(MiniJavaParser.AccessModifierContext ctx) {
        super.enterAccessModifier(ctx);
    }

    @Override
    public void exitAccessModifier(MiniJavaParser.AccessModifierContext ctx) {
        super.exitAccessModifier(ctx);
    }

    @Override
    public void enterNestedStatement(MiniJavaParser.NestedStatementContext ctx) {
        super.enterNestedStatement(ctx);

        Scope tmp = new Scope(ctx, currentScope, "nested");
        printQ.add(tmp);
        this.currentScope = tmp;
    }

    @Override
    public void exitNestedStatement(MiniJavaParser.NestedStatementContext ctx) {
        super.exitNestedStatement(ctx);
        this.currentScope = this.currentScope.getParent();
    }

    @Override
    public void enterIfElseStatement(MiniJavaParser.IfElseStatementContext ctx) {
        super.enterIfElseStatement(ctx);
    }

    @Override
    public void exitIfElseStatement(MiniJavaParser.IfElseStatementContext ctx) {
        super.exitIfElseStatement(ctx);
    }

    @Override
    public void enterWhileStatement(MiniJavaParser.WhileStatementContext ctx) {
        super.enterWhileStatement(ctx);
    }

    @Override
    public void exitWhileStatement(MiniJavaParser.WhileStatementContext ctx) {
        super.exitWhileStatement(ctx);
    }

    @Override
    public void enterPrintStatement(MiniJavaParser.PrintStatementContext ctx) {
        super.enterPrintStatement(ctx);
    }

    @Override
    public void exitPrintStatement(MiniJavaParser.PrintStatementContext ctx) {
        super.exitPrintStatement(ctx);
    }

    @Override
    public void enterVariableAssignmentStatement(MiniJavaParser.VariableAssignmentStatementContext ctx) {
        super.enterVariableAssignmentStatement(ctx);
    }

    @Override
    public void exitVariableAssignmentStatement(MiniJavaParser.VariableAssignmentStatementContext ctx) {
        super.exitVariableAssignmentStatement(ctx);
    }

    @Override
    public void enterArrayAssignmentStatement(MiniJavaParser.ArrayAssignmentStatementContext ctx) {
        super.enterArrayAssignmentStatement(ctx);
    }

    @Override
    public void exitArrayAssignmentStatement(MiniJavaParser.ArrayAssignmentStatementContext ctx) {
        super.exitArrayAssignmentStatement(ctx);
    }

    @Override
    public void enterLocalVarDeclaration(MiniJavaParser.LocalVarDeclarationContext ctx) {
        super.enterLocalVarDeclaration(ctx);
    }

    @Override
    public void exitLocalVarDeclaration(MiniJavaParser.LocalVarDeclarationContext ctx) {
        super.exitLocalVarDeclaration(ctx);
    }

    @Override
    public void enterExpressioncall(MiniJavaParser.ExpressioncallContext ctx) {
        super.enterExpressioncall(ctx);
    }

    @Override
    public void exitExpressioncall(MiniJavaParser.ExpressioncallContext ctx) {
        super.exitExpressioncall(ctx);
    }

    @Override
    public void enterIfBlock(MiniJavaParser.IfBlockContext ctx) {
        super.enterIfBlock(ctx);

        if (ctx.statement().getClass() != MiniJavaParser.NestedStatementContext.class) {
            Scope tmp = new Scope(ctx, currentScope, "if");
            printQ.add(tmp);
            this.currentScope = tmp;
        }
    }

    @Override
    public void exitIfBlock(MiniJavaParser.IfBlockContext ctx) {
        super.exitIfBlock(ctx);
        if (ctx.statement().getClass() != MiniJavaParser.NestedStatementContext.class)
            this.currentScope = this.currentScope.getParent();
    }

    @Override
    public void enterElseBlock(MiniJavaParser.ElseBlockContext ctx) {
        super.enterElseBlock(ctx);

        if (ctx.statement().getClass() != MiniJavaParser.NestedStatementContext.class) {
            Scope tmp = new Scope(ctx, currentScope, "else");
            printQ.add(tmp);
            this.currentScope = tmp;
        }
    }

    @Override
    public void exitElseBlock(MiniJavaParser.ElseBlockContext ctx) {
        super.exitElseBlock(ctx);
        if (ctx.statement().getClass() != MiniJavaParser.NestedStatementContext.class)
            this.currentScope = this.currentScope.getParent();
    }

    @Override
    public void enterWhileBlock(MiniJavaParser.WhileBlockContext ctx) {
        super.enterWhileBlock(ctx);
        if (ctx.statement().getClass() != MiniJavaParser.NestedStatementContext.class) {
            Scope tmp = new Scope(ctx, this.currentScope, "while");
            this.printQ.add(tmp);
            currentScope = tmp;
        }
    }

    @Override
    public void exitWhileBlock(MiniJavaParser.WhileBlockContext ctx) {
        super.exitWhileBlock(ctx);
        if (ctx.statement().getClass() != MiniJavaParser.NestedStatementContext.class)
            this.currentScope = this.currentScope.getParent();
    }

    @Override
    public void enterLtExpression(MiniJavaParser.LtExpressionContext ctx) {
        super.enterLtExpression(ctx);
    }

    @Override
    public void exitLtExpression(MiniJavaParser.LtExpressionContext ctx) {
        super.exitLtExpression(ctx);
    }

    @Override
    public void enterObjectInstantiationExpression(MiniJavaParser.ObjectInstantiationExpressionContext ctx) {
        super.enterObjectInstantiationExpression(ctx);
    }

    @Override
    public void exitObjectInstantiationExpression(MiniJavaParser.ObjectInstantiationExpressionContext ctx) {
        super.exitObjectInstantiationExpression(ctx);
    }

    @Override
    public void enterArrayInstantiationExpression(MiniJavaParser.ArrayInstantiationExpressionContext ctx) {
        super.enterArrayInstantiationExpression(ctx);
    }

    @Override
    public void exitArrayInstantiationExpression(MiniJavaParser.ArrayInstantiationExpressionContext ctx) {
        super.exitArrayInstantiationExpression(ctx);
    }

    @Override
    public void enterPowExpression(MiniJavaParser.PowExpressionContext ctx) {
        super.enterPowExpression(ctx);
    }

    @Override
    public void exitPowExpression(MiniJavaParser.PowExpressionContext ctx) {
        super.exitPowExpression(ctx);
    }

    @Override
    public void enterIdentifierExpression(MiniJavaParser.IdentifierExpressionContext ctx) {
        super.enterIdentifierExpression(ctx);
    }

    @Override
    public void exitIdentifierExpression(MiniJavaParser.IdentifierExpressionContext ctx) {
        super.exitIdentifierExpression(ctx);
    }

    @Override
    public void enterMethodCallExpression(MiniJavaParser.MethodCallExpressionContext ctx) {
        super.enterMethodCallExpression(ctx);
    }

    @Override
    public void exitMethodCallExpression(MiniJavaParser.MethodCallExpressionContext ctx) {
        super.exitMethodCallExpression(ctx);
    }

    @Override
    public void enterNotExpression(MiniJavaParser.NotExpressionContext ctx) {
        super.enterNotExpression(ctx);
    }

    @Override
    public void exitNotExpression(MiniJavaParser.NotExpressionContext ctx) {
        super.exitNotExpression(ctx);
    }

    @Override
    public void enterBooleanLitExpression(MiniJavaParser.BooleanLitExpressionContext ctx) {
        super.enterBooleanLitExpression(ctx);
    }

    @Override
    public void exitBooleanLitExpression(MiniJavaParser.BooleanLitExpressionContext ctx) {
        super.exitBooleanLitExpression(ctx);
    }

    @Override
    public void enterParenExpression(MiniJavaParser.ParenExpressionContext ctx) {
        super.enterParenExpression(ctx);
    }

    @Override
    public void exitParenExpression(MiniJavaParser.ParenExpressionContext ctx) {
        super.exitParenExpression(ctx);
    }

    @Override
    public void enterIntLitExpression(MiniJavaParser.IntLitExpressionContext ctx) {
        super.enterIntLitExpression(ctx);
    }

    @Override
    public void exitIntLitExpression(MiniJavaParser.IntLitExpressionContext ctx) {
        super.exitIntLitExpression(ctx);
    }

    @Override
    public void enterStringLitExpression(MiniJavaParser.StringLitExpressionContext ctx) {
        super.enterStringLitExpression(ctx);
    }

    @Override
    public void exitStringLitExpression(MiniJavaParser.StringLitExpressionContext ctx) {
        super.exitStringLitExpression(ctx);
    }

    @Override
    public void enterNullLitExpression(MiniJavaParser.NullLitExpressionContext ctx) {
        super.enterNullLitExpression(ctx);
    }

    @Override
    public void exitNullLitExpression(MiniJavaParser.NullLitExpressionContext ctx) {
        super.exitNullLitExpression(ctx);
    }

    @Override
    public void enterAndExpression(MiniJavaParser.AndExpressionContext ctx) {
        super.enterAndExpression(ctx);
    }

    @Override
    public void exitAndExpression(MiniJavaParser.AndExpressionContext ctx) {
        super.exitAndExpression(ctx);
    }

    @Override
    public void enterArrayAccessExpression(MiniJavaParser.ArrayAccessExpressionContext ctx) {
        super.enterArrayAccessExpression(ctx);
    }

    @Override
    public void exitArrayAccessExpression(MiniJavaParser.ArrayAccessExpressionContext ctx) {
        super.exitArrayAccessExpression(ctx);
    }

    @Override
    public void enterAddExpression(MiniJavaParser.AddExpressionContext ctx) {
        super.enterAddExpression(ctx);
    }

    @Override
    public void exitAddExpression(MiniJavaParser.AddExpressionContext ctx) {
        super.exitAddExpression(ctx);
    }

    @Override
    public void enterThisExpression(MiniJavaParser.ThisExpressionContext ctx) {
        super.enterThisExpression(ctx);
    }

    @Override
    public void exitThisExpression(MiniJavaParser.ThisExpressionContext ctx) {
        super.exitThisExpression(ctx);
    }

    @Override
    public void enterFieldCallExpression(MiniJavaParser.FieldCallExpressionContext ctx) {
        super.enterFieldCallExpression(ctx);
    }

    @Override
    public void exitFieldCallExpression(MiniJavaParser.FieldCallExpressionContext ctx) {
        super.exitFieldCallExpression(ctx);
    }

    @Override
    public void enterArrayLengthExpression(MiniJavaParser.ArrayLengthExpressionContext ctx) {
        super.enterArrayLengthExpression(ctx);
    }

    @Override
    public void exitArrayLengthExpression(MiniJavaParser.ArrayLengthExpressionContext ctx) {
        super.exitArrayLengthExpression(ctx);
    }

    @Override
    public void enterIntarrayInstantiationExpression(MiniJavaParser.IntarrayInstantiationExpressionContext ctx) {
        super.enterIntarrayInstantiationExpression(ctx);
    }

    @Override
    public void exitIntarrayInstantiationExpression(MiniJavaParser.IntarrayInstantiationExpressionContext ctx) {
        super.exitIntarrayInstantiationExpression(ctx);
    }

    @Override
    public void enterSubExpression(MiniJavaParser.SubExpressionContext ctx) {
        super.enterSubExpression(ctx);
    }

    @Override
    public void exitSubExpression(MiniJavaParser.SubExpressionContext ctx) {
        super.exitSubExpression(ctx);
    }

    @Override
    public void enterMulExpression(MiniJavaParser.MulExpressionContext ctx) {
        super.enterMulExpression(ctx);
    }

    @Override
    public void exitMulExpression(MiniJavaParser.MulExpressionContext ctx) {
        super.exitMulExpression(ctx);
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        super.enterEveryRule(ctx);
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        super.exitEveryRule(ctx);
    }

    public Scope getProgram() {
        return program;
    }

    public LinkedList<Scope> getPrintQ() {
        return printQ;
    }
}
