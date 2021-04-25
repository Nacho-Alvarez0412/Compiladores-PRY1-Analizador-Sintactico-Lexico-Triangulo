package Core.Visitors;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import Triangle.AbstractSyntaxTrees.*;

import java.io.File;

public class XMLVisitor implements Visitor {

  public XMLVisitor(){

  }

  private Document doc;

  public Object visitAssignCommand(AssignCommand ast, Object o) {
    Element elemento = doc.createElement("Assign Command");

    elemento.appendChild((Node) ast.E.visitXML(this, null));

    elemento.appendChild((Node) ast.V.visitXML(this, null));

    return elemento;
  }

  @Override
  public Object visitCallCommand(CallCommand ast, Object o) {
    Element elemento = doc.createElement("Call Command");

    elemento.appendChild((Node) ast.APS.visitXML(this, null));

    elemento.appendChild((Node) ast.LI.visitXML(this, null));

    return elemento;
  }

  @Override
  public Object visitEmptyCommand(EmptyCommand ast, Object o) {
    Element elemento = doc.createElement("Empty Command");


    return elemento;
  }

  @Override
  public Object visitCompoundIfCommand(CompoundIfCommand ast, Object o) {
    Element elemento = doc.createElement("Compound If Command");

    elemento.appendChild((Node) ast.E.visitXML(this, null));

    elemento.appendChild((Node) ast.C1.visitXML(this, null));

    elemento.appendChild((Node) ast.C2.visitXML(this, null));

    return elemento;
  }

  @Override
  public Object visitIfCommand(IfCommand ast, Object o) {
    Element elemento = doc.createElement("If Command");

    elemento.appendChild((Node) ast.C1.visitXML(this, null));

    elemento.appendChild((Node) ast.C2.visitXML(this, null));

    elemento.appendChild((Node) ast.E.visitXML(this, null));

    return elemento;
  }

  @Override
  public Object visitLetCommand(LetCommand ast, Object o) {
    Element elemento = doc.createElement("Let Command");

    elemento.appendChild((Node) ast.C.visitXML(this, null));
    
    elemento.appendChild((Node) ast.D.visitXML(this, null));


    return elemento;
  }

  @Override
  public Object visitSequentialCommand(SequentialCommand ast, Object o) {
    Element elemento = doc.createElement("Sequential Command");

    elemento.appendChild((Node) ast.C1.visitXML(this, null));
    
    elemento.appendChild((Node) ast.C2.visitXML(this, null));

    return elemento;
  }

  @Override
  public Object visitWhileLoopCommand(WhileLoopCommand ast, Object o) {
    Element elemento = doc.createElement("While Loop Command");
    
    elemento.appendChild((Node) ast.C.visitXML(this, null));

    elemento.appendChild((Node) ast.E.visitXML(this, null));

    return elemento;
  }

  @Override
  public Object visitUntilLoopCommand(UntilLoopCommand ast, Object o) {
    Element elemento = doc.createElement("Until Loop Command");

    elemento.appendChild((Node) ast.C.visitXML(this, null));

    elemento.appendChild((Node) ast.E.visitXML(this, null));

    return elemento;
  }

  @Override
  public Object visitDoLoopUntilCommand(DoLoopUntilCommand ast, Object o) {
    Element elemento = doc.createElement("Do Loop Until Command");
    
    elemento.appendChild((Node) ast.C.visitXML(this, null));

    elemento.appendChild((Node) ast.E.visitXML(this, null));

    return elemento;
  }

  @Override
  public Object visitDoLoopWhileCommand(DoLoopWhileCommand ast, Object o) {
    Element elemento = doc.createElement("Do Loop While Command");

    elemento.appendChild((Node) ast.C.visitXML(this, null));

    elemento.appendChild((Node) ast.E.visitXML(this, null));

    return elemento;
  }

  @Override
  public Object visitSequentialElsifCommand(SequentialElsifCommand ast, Object o) {
    Element elemento = doc.createElement("Sequential Else If Command");

    elemento.appendChild((Node) ast.SE1.visitXML(this, null));

    elemento.appendChild((Node) ast.SE2.visitXML(this, null));

    return elemento;
  }

  @Override
  public Object visitSingleElsifCommand(SingleElsifCommand ast, Object o) {
    Element elemento = doc.createElement("Single Else If Command");
    
    elemento.appendChild((Node) ast.C.visitXML(this, null));

    elemento.appendChild((Node) ast.E.visitXML(this, null));

    return elemento;
  }

  @Override
  public Object visitForLoopDoCommand(ForLoopDoCommand ast, Object o) {
    Element elemento = doc.createElement("For Loop Do Command");

    elemento.appendChild((Node) ast.C.visitXML(this, null));

    elemento.appendChild((Node) ast.E.visitXML(this, null));

    elemento.appendChild((Node) ast.FFC.visitXML(this, null));

    return elemento;
  }

  @Override
  public Object visitForLoopWhileCommand(ForLoopWhileCommand ast, Object o) {
    Element elemento = doc.createElement("For Loop While Command");

    elemento.appendChild((Node) ast.C.visitXML(this, null));

    elemento.appendChild((Node) ast.E1.visitXML(this, null));

    elemento.appendChild((Node) ast.E2.visitXML(this, null));

    elemento.appendChild((Node) ast.FFC.visitXML(this, null));

    return elemento;
  }

  @Override
  public Object visitForLoopUntilCommand(ForLoopUntilCommand ast, Object o) {
    Element elemento = doc.createElement("For Loop Until Command");

    elemento.appendChild((Node) ast.C.visitXML(this, null));

    elemento.appendChild((Node) ast.E1.visitXML(this, null));

    elemento.appendChild((Node) ast.E2.visitXML(this, null));

    elemento.appendChild((Node) ast.FFC.visitXML(this, null));

    return elemento;
  }

  @Override
  public Object visitProcedure(Procedure ast, Object o) {
    Element elemento = doc.createElement("Procedure");

    elemento.appendChild((Node) ast.C.visitXML(this, null));

    elemento.appendChild((Node) ast.FPS.visitXML(this, null));

    elemento.appendChild((Node) ast.I.visitXML(this, null));


    return elemento;
  }

  @Override
  public Object visitFunction(Function ast, Object o) {
    Element elemento = doc.createElement("ProcFuncs");

    elemento.appendChild((Node) ast.E.visitXML(this, null));

    elemento.appendChild((Node) ast.FPS.visitXML(this, null));

    elemento.appendChild((Node) ast.I.visitXML(this, null));

    elemento.appendChild((Node) ast.TD.visitXML(this, null));

    return elemento;
  }

  @Override
  public Object visitSequentialProcFuncs(SequentialProcFuncs ast, Object o) {
    Element elemento = doc.createElement("ProcFuncs");

    elemento.appendChild((Node) ast.PF1.visitXML(this, null));

    elemento.appendChild((Node) ast.PF2.visitXML(this, null));

    return elemento;
  }

  @Override
  public Object visitChooseCommand(ChooseCommand ast, Object o) {
    Element elemento = doc.createElement("Choose Command");

    elemento.appendChild((Node) ast.CS.visitXML(this, null));

    elemento.appendChild((Node) ast.E.visitXML(this, null));


    return elemento;
  }

  @Override
  public Object visitForFromCommand(ForFromCommand ast, Object o) {
    Element elemento = doc.createElement("For From Command");

    elemento.appendChild((Node) ast.E.visitXML(this, null));

    elemento.appendChild((Node) ast.I.visitXML(this, null));

    return elemento;
  }

  @Override
  public Object visitCaseLiteral(CaseLiteral ast, Object o) {
    Element elemento = doc.createElement("Case Literal");

    elemento.appendChild((Node) ast.T.visitXML(this, null));


    return elemento;
  }

  @Override
  public Object visitSimpleCaseRange(SimpleCaseRange ast, Object o) {
    Element elemento = doc.createElement("Simple Case Range");

    elemento.appendChild((Node) ast.CL.visitXML(this, null));

    return elemento;
  }

  @Override
  public Object visitCompoundCaseRange(CompoundCaseRange ast, Object o) {
    Element elemento = doc.createElement("Compound Case Range");

    elemento.appendChild((Node) ast.CL1.visitXML(this, null));

    elemento.appendChild((Node) ast.CL2.visitXML(this, null));

    return elemento;
  }

  @Override
  public Object visitSequentialCaseRange(SequentialCaseRange ast, Object o) {
    Element elemento = doc.createElement("Sequential Case Range");

    elemento.appendChild((Node) ast.CR1.visitXML(this, null));

    elemento.appendChild((Node) ast.CR2.visitXML(this, null));

    return elemento;
  }

  @Override
  public Object visitCaseLiterals(CaseLiterals ast, Object o) {
    Element elemento = doc.createElement("Case Literals");

    elemento.appendChild((Node) ast.CR.visitXML(this, null));

    return elemento;
  }

  @Override
  public Object visitCompoundCases(CompoundCases ast, Object o) {
    Element elemento = doc.createElement("Compund Cases");

    elemento.appendChild((Node) ast.C.visitXML(this, null));

    elemento.appendChild((Node) ast.EC.visitXML(this, null));

    return elemento;
  }

  @Override
  public Object visitElseCase(ElseCase ast, Object o) {
    Element elemento = doc.createElement("Else Case");

    elemento.appendChild((Node) ast.C.visitXML(this, null));


    return elemento;
  }

  @Override
  public Object visitSequentialCase(SequentialCase ast, Object o) {
    Element elemento = doc.createElement("Sequential Case");

    elemento.appendChild((Node) ast.C1.visitXML(this, null));

    elemento.appendChild((Node) ast.C2.visitXML(this, null));

    return elemento;
  }

  @Override
  public Object visitSimpleCases(SimpleCases ast, Object o) {
    Element elemento = doc.createElement("Simple Cases");

    elemento.appendChild((Node) ast.C.visitXML(this, null));

    return elemento;
  }

  @Override
  public Object visitSingleCase(SingleCase ast, Object o) {
    Element elemento = doc.createElement("Single Case");

    elemento.appendChild((Node) ast.C.visitXML(this, null));

    elemento.appendChild((Node) ast.CL.visitXML(this, null));

    return elemento;
  }

  @Override
  public Object visitArrayExpression(ArrayExpression ast, Object o) {
    Element elemento = doc.createElement("Array Expression");

    return elemento;
  }

  @Override
  public Object visitBinaryExpression(BinaryExpression ast, Object o) {
    Element elemento = doc.createElement("Binary Expression");

    elemento.appendChild((Node) ast.E1.visitXML(this, null));

    elemento.appendChild((Node) ast.E2.visitXML(this, null));

    elemento.appendChild((Node) ast.O.visitXML(this, null));


    return elemento;
  }

  @Override
  public Object visitCallExpression(CallExpression ast, Object o) {
    Element elemento = doc.createElement("Call Expression");

    elemento.appendChild((Node) ast.APS.visitXML(this, null));

    elemento.appendChild((Node) ast.LI.visitXML(this, null));

    return elemento;
  }

  @Override
  public Object visitCharacterExpression(CharacterExpression ast, Object o) {
    Element elemento = doc.createElement("Character Expression");

    elemento.appendChild((Node) ast.CL.visitXML(this, null));


    return elemento;
  }

  @Override
  public Object visitEmptyExpression(EmptyExpression ast, Object o) {
    Element elemento = doc.createElement("Empty Expression");

    return elemento;
  }

  @Override
  public Object visitIfExpression(IfExpression ast, Object o) {
    Element elemento = doc.createElement("If Expression");

    elemento.appendChild((Node) ast.E1.visitXML(this, null));

    elemento.appendChild((Node) ast.E2.visitXML(this, null));

    elemento.appendChild((Node) ast.E3.visitXML(this, null));

    return elemento;
  }

  @Override
  public Object visitIntegerExpression(IntegerExpression ast, Object o) {
    Element elemento = doc.createElement("Integer Expression");

    elemento.appendChild((Node) ast.IL.visitXML(this, null));

    return elemento;
  }

  @Override
  public Object visitLetExpression(LetExpression ast, Object o) {
    Element elemento = doc.createElement("Let Expression");

    elemento.appendChild((Node) ast.D.visitXML(this, null));

    elemento.appendChild((Node) ast.E.visitXML(this, null));

    return elemento;
  }

  @Override
  public Object visitRecordExpression(RecordExpression ast, Object o) {
    Element elemento = doc.createElement("Record Expression");

    elemento.appendChild((Node) ast.RA.visitXML(this, null));

    return elemento;
  }

  @Override
  public Object visitUnaryExpression(UnaryExpression ast, Object o) {
    Element elemento = doc.createElement("Unary Expression");

    elemento.appendChild((Node) ast.O.visitXML(this, null));

    elemento.appendChild((Node) ast.E.visitXML(this, null));

    return elemento;
  }

  @Override
  public Object visitVnameExpression(VnameExpression ast, Object o) {
    Element elemento = doc.createElement("Vname Expression");

    elemento.appendChild((Node) ast.V.visitXML(this, null));

    return elemento;
  }

  @Override
  public Object visitBinaryOperatorDeclaration(BinaryOperatorDeclaration ast, Object o) {
    Element elemento = doc.createElement("Binary Operator Declaration");

    elemento.appendChild((Node) ast.ARG1.visitXML(this, null));

    elemento.appendChild((Node) ast.ARG2.visitXML(this, null));

    elemento.appendChild((Node) ast.O.visitXML(this, null));

    elemento.appendChild((Node) ast.RES.visitXML(this, null));

    return elemento;
  }

  @Override
  public Object visitConstDeclaration(ConstDeclaration ast, Object o) {
    Element elemento = doc.createElement("Constant Declaration");

    elemento.appendChild((Node) ast.I.visitXML(this, null));

    elemento.appendChild((Node) ast.E.visitXML(this, null));

    return elemento;
  }

  @Override
  public Object visitFuncDeclaration(FuncDeclaration ast, Object o) {
    Element elemento = doc.createElement("Function Declaration");

    elemento.appendChild((Node) ast.FPS.visitXML(this, null));

    elemento.appendChild((Node) ast.E.visitXML(this, null));

    elemento.appendChild((Node) ast.I.visitXML(this, null));

    elemento.appendChild((Node) ast.T.visitXML(this, null));

    return elemento;
  }

  @Override
  public Object visitProcDeclaration(ProcDeclaration ast, Object o) {
    Element elemento = doc.createElement("Procedure Declaration");

    elemento.appendChild((Node) ast.C.visitXML(this, null));

    elemento.appendChild((Node) ast.FPS.visitXML(this, null));

    elemento.appendChild((Node) ast.I.visitXML(this, null));

    return elemento;
  }

  @Override
  public Object visitSequentialDeclaration(SequentialDeclaration ast, Object o) {
    Element elemento = doc.createElement("Sequential Declaration");

    elemento.appendChild((Node) ast.D1.visitXML(this, null));

    elemento.appendChild((Node) ast.D2.visitXML(this, null));

    return elemento;
  }

  @Override
  public Object visitTypeDeclaration(TypeDeclaration ast, Object o) {
    Element elemento = doc.createElement("Type Declaration");

    elemento.appendChild((Node) ast.I.visitXML(this, null));

    elemento.appendChild((Node) ast.T.visitXML(this, null));

    return elemento;
  }

  @Override
  public Object visitUnaryOperatorDeclaration(UnaryOperatorDeclaration ast, Object o) {
    Element elemento = doc.createElement("Unary Operator Declaration");

    elemento.appendChild((Node) ast.ARG.visitXML(this, null));

    elemento.appendChild((Node) ast.O.visitXML(this, null));

    elemento.appendChild((Node) ast.RES.visitXML(this, null));

    return elemento;
  }

  @Override
  public Object visitVarTDDeclaration(VarTDDeclaration ast, Object o) {
    Element elemento = doc.createElement("Variable Typed-denoted Declaration");

    elemento.appendChild((Node) ast.I.visitXML(this, null));

    elemento.appendChild((Node) ast.T.visitXML(this, null));

    return elemento;
  }

  @Override
  public Object visitVarExpDeclaration(VarExpDeclaration ast, Object o) {
    Element elemento = doc.createElement("Initialized Variable Declaration");

    elemento.appendChild((Node) ast.I.visitXML(this, null));

    elemento.appendChild((Node) ast.E.visitXML(this, null));

    return elemento;
  }

  @Override
  public Object visitRecDeclaration(RecDeclaration ast, Object o) {
    Element elemento = doc.createElement("Recursive declaration");

    elemento.appendChild((Node) ast.PFs.visitXML(this, null));

    return elemento;
  }

  @Override
  public Object visitPrivDeclaration(PrivDeclaration ast, Object o) {
    Element elemento = doc.createElement("Private declaration");

    elemento.appendChild((Node) ast.D1.visitXML(this, null));

    elemento.appendChild((Node) ast.D2.visitXML(this, null));

    return elemento;
  }

 
  @Override
  public Object visitMultipleArrayAggregate(MultipleArrayAggregate ast, Object o) {
    Element elemento = doc.createElement("Multiple Array Aggregate");

    elemento.appendChild((Node) ast.AA.visitXML(this, null));

    elemento.appendChild((Node) ast.E.visitXML(this, null));

    return elemento;
  }

  @Override
  public Object visitSingleArrayAggregate(SingleArrayAggregate ast, Object o) {
    Element elemento = doc.createElement("Single Array Aggregate");

    elemento.appendChild((Node) ast.E.visitXML(this, null));


    return elemento;
  }

  @Override
  public Object visitMultipleRecordAggregate(MultipleRecordAggregate ast, Object o) {
    Element elemento = doc.createElement("Multiple Record Aggregate");

    elemento.appendChild((Node) ast.I.visitXML(this, null));

    elemento.appendChild((Node) ast.E.visitXML(this, null));

    elemento.appendChild((Node) ast.RA.visitXML(this, null));

    return elemento;
  }

  @Override
  public Object visitSingleRecordAggregate(SingleRecordAggregate ast, Object o) {
    Element elemento = doc.createElement("Single Record Aggregate");

    elemento.appendChild((Node) ast.I.visitXML(this, null));

    elemento.appendChild((Node) ast.E.visitXML(this, null));

    return elemento;
  }


  @Override
  public Object visitConstFormalParameter(ConstFormalParameter ast, Object o) {
    Element elemento = doc.createElement("Constant Formal Parameter");

    elemento.appendChild((Node) ast.I.visitXML(this, null));

    elemento.appendChild((Node) ast.T.visitXML(this, null));

    return elemento;
  }

  @Override
  public Object visitFuncFormalParameter(FuncFormalParameter ast, Object o) {
    Element elemento = doc.createElement("Function Formal Parameter");

    elemento.appendChild((Node) ast.FPS.visitXML(this, null));

    elemento.appendChild((Node) ast.I.visitXML(this, null));

    elemento.appendChild((Node) ast.T.visitXML(this, null));


    return elemento;
  }

  @Override
  public Object visitProcFormalParameter(ProcFormalParameter ast, Object o) {
    Element elemento = doc.createElement("Procedure Formal Parameter");

    elemento.appendChild((Node) ast.FPS.visitXML(this, null));

    elemento.appendChild((Node) ast.I.visitXML(this, null));
 

    return elemento;
  }

  @Override
  public Object visitVarFormalParameter(VarFormalParameter ast, Object o) {
    Element elemento = doc.createElement("Variable Formal Parameter");

    elemento.appendChild((Node) ast.I.visitXML(this, null));

    elemento.appendChild((Node) ast.T.visitXML(this, null));

    return elemento;
  }

  @Override
  public Object visitEmptyFormalParameterSequence(EmptyFormalParameterSequence ast, Object o) {
    Element elemento = doc.createElement("Empty Formal Parameter Sequence");

    return elemento;
  }

  @Override
  public Object visitMultipleFormalParameterSequence(MultipleFormalParameterSequence ast, Object o) {
    Element elemento = doc.createElement("Multiple Formal Parameter Sequence");
    
    elemento.appendChild((Node) ast.FP.visitXML(this, null));

    elemento.appendChild((Node) ast.FPS.visitXML(this, null));

    return elemento;
  }

  @Override
  public Object visitSingleFormalParameterSequence(SingleFormalParameterSequence ast, Object o) {
    Element elemento = doc.createElement("Single Formal Parameter Sequence");

    elemento.appendChild((Node) ast.FP.visitXML(this, null));

    return elemento;
  }

  @Override
  public Object visitConstActualParameter(ConstActualParameter ast, Object o) {
    Element elemento = doc.createElement("Constant Actual Parameter");

    elemento.appendChild((Node) ast.E.visitXML(this, null));

    return elemento;
  }

  @Override
  public Object visitFuncActualParameter(FuncActualParameter ast, Object o) {
    Element elemento = doc.createElement("Function Actual Parameter");

    elemento.appendChild((Node) ast.I.visitXML(this, null));

    return elemento;
  }

  @Override
  public Object visitProcActualParameter(ProcActualParameter ast, Object o) {
    Element elemento = doc.createElement("Procedure Actual Parameter");

    elemento.appendChild((Node) ast.I.visitXML(this, null));

    return elemento;
  }

  @Override
  public Object visitVarActualParameter(VarActualParameter ast, Object o) {
    Element elemento = doc.createElement("Variable Formal Parameter");

    elemento.appendChild((Node) ast.V.visitXML(this, null));

    return elemento;
  }

  @Override
  public Object visitEmptyActualParameterSequence(EmptyActualParameterSequence ast, Object o) {
    Element elemento = doc.createElement("Empty Formal Parameter Sequence");

    return elemento;
  }

  @Override
  public Object visitMultipleActualParameterSequence(MultipleActualParameterSequence ast, Object o) {
    Element elemento = doc.createElement("Multiple Formal Parameter Sequence");

    elemento.appendChild((Node) ast.AP.visitXML(this, null));

    elemento.appendChild((Node) ast.APS.visitXML(this, null));

    return elemento;
  }

  @Override
  public Object visitSingleActualParameterSequence(SingleActualParameterSequence ast, Object o) {
    Element elemento = doc.createElement("Single Formal Parameter Sequence");

    elemento.appendChild((Node) ast.AP.visitXML(this, null));

    return elemento;
  }


  @Override
  public Object visitAnyTypeDenoter(AnyTypeDenoter ast, Object o) {
    Element elemento = doc.createElement("any");

    return elemento;
  }

  @Override
  public Object visitArrayTypeDenoter(ArrayTypeDenoter ast, Object o) {
    Element elemento = doc.createElement("Array Type Denoter");

    elemento.appendChild((Node) ast.IL.visitXML(this, null));

    elemento.appendChild((Node) ast.T.visitXML(this, null));

    return elemento;
  }


  @Override
  public Object visitBoolTypeDenoter(BoolTypeDenoter ast, Object o) {
    Element elemento = doc.createElement("bool");


    return elemento;
  }

  @Override
  public Object visitCharTypeDenoter(CharTypeDenoter ast, Object o) {
    Element elemento = doc.createElement("char");

    return elemento;
  }

  @Override
  public Object visitErrorTypeDenoter(ErrorTypeDenoter ast, Object o) {
    Element elemento = doc.createElement("error");

    return elemento;
  }

  @Override
  public Object visitSimpleTypeDenoter(SimpleTypeDenoter ast, Object o) {

    Element elemento = doc.createElement("Simple Type Denoter");

    elemento.appendChild((Node) ast.LI.visitXML(this, null));

    return elemento;
  }

  @Override
  public Object visitIntTypeDenoter(IntTypeDenoter ast, Object o) {

    Element elemento = doc.createElement("int");

    return elemento;
  }

  @Override
  public Object visitRecordTypeDenoter(RecordTypeDenoter ast, Object o) {

    Element elemento = doc.createElement("Record Type Denoter");

    elemento.appendChild((Node) ast.FT.visitXML(this, null));

    return elemento;
  }

  @Override
  public Object visitMultipleFieldTypeDenoter(MultipleFieldTypeDenoter ast, Object o) {

    Element elemento = doc.createElement("Multiple Field Type Denoter");

    elemento.appendChild((Node) ast.FT.visitXML(this, null));

    elemento.appendChild((Node) ast.I.visitXML(this, null));

    elemento.appendChild((Node) ast.T.visitXML(this, null));

    return elemento;
  }

  @Override
  public Object visitSingleFieldTypeDenoter(SingleFieldTypeDenoter ast, Object o) {

    Element elemento = doc.createElement("Single Field Type Denoter");

    elemento.appendChild((Node) ast.I.visitXML(this, null));

    elemento.appendChild((Node) ast.T.visitXML(this, null));

    return elemento;
  }

  @Override
  public Object visitCharacterLiteral(CharacterLiteral ast, Object o) {

    Element elemento = doc.createElement("Character Literal");

    return elemento;
  }

  @Override
  public Object visitIdentifier(Identifier ast, Object o) {

    Element elemento = doc.createElement("Identifier");

    elemento.appendChild((Node) ast.decl.visitXML(this, null));

    return elemento;
  }

  @Override
  public Object visitIntegerLiteral(IntegerLiteral ast, Object o) {

    Element elemento = doc.createElement("Integer Literal");

    return elemento;
  }

  @Override
  public Object visitOperator(Operator ast, Object o) {

    Element elemento = doc.createElement("Operator");

    elemento.appendChild((Node) ast.decl.visitXML(this, null));


    return elemento;
  }

  @Override
  public Object visitDotVarName(DotVarName ast, Object o) {

    Element elemento = doc.createElement("Dot Var Name");

    elemento.appendChild((Node) ast.I.visitXML(this, null));

    elemento.appendChild((Node) ast.V.visitXML(this, null));

    return elemento;
  }

  @Override
  public Object visitSimpleVarName(SimpleVarName ast, Object o) {

    Element elemento = doc.createElement("Simple Var Name");

    elemento.appendChild((Node) ast.I.visitXML(this, null));


    return elemento;
  }

  @Override
  public Object visitSubscriptVarName(SubscriptVarName ast, Object o) {

    Element elemento = doc.createElement("Subscript Var Name");

    elemento.appendChild((Node) ast.V.visitXML(this, null));

    elemento.appendChild((Node) ast.E.visitXML(this, null));

    return elemento;
  }

  @Override
  public Object visitSimpleVname(SimpleVname ast, Object o) {

    Element elemento = doc.createElement("Simple Vname");

    elemento.appendChild((Node) ast.VN.visitXML(this, null));

    return elemento;
  }

  @Override
  public Object visitPackageIdentifier(PackageIdentifier ast, Object o) {

    Element elemento = doc.createElement("Package Identifier");

    elemento.appendChild((Node) ast.I.visitXML(this, null));

    return elemento;
  }

  @Override
  public Object visitPackageVname(PackageVname ast, Object o) {

    Element elemento = doc.createElement("Package Vname");

    elemento.appendChild((Node) ast.PI.visitXML(this, null));

    elemento.appendChild((Node) ast.VN.visitXML(this, null));

    return elemento;
  }

  @Override
  public Object visitSimpleLongIdentifier(SimpleLongIdentifier ast, Object o) {

    Element elemento = doc.createElement("Simple Long Identifier");

    elemento.appendChild((Node) ast.I.visitXML(this, null));
    
    return elemento;
  }

  @Override
  public Object visitPackageLongIdentifier(PackageLongIdentifier ast, Object o) {

    Element elemento = doc.createElement("Package Long Identifier");

    elemento.appendChild((Node) ast.I.visitXML(this, null));

    elemento.appendChild((Node) ast.PI.visitXML(this, null));
  
    return elemento;
  }

  @Override
  public Object visitSinglePackageDeclaration(SinglePackageDeclaration ast, Object o) {

    Element elemento = doc.createElement("Single Package Declaration");

    elemento.appendChild((Node) ast.D.visitXML(this, null));

    elemento.appendChild((Node) ast.PI.visitXML(this, null));

    return elemento;
  }

  @Override
  public Object visitSequentialPackageDeclaration(SequentialPackageDeclaration ast, Object o) {
   
    Element elemento = doc.createElement("Sequential Package Declaration");

    elemento.appendChild((Node) ast.PD1.visitXML(this, null));

    elemento.appendChild((Node) ast.PD2.visitXML(this, null));

    return elemento;
  }

  @Override
  public Object visitSimpleProgram(SimpleProgram ast, Object o) {
    Element elemento = this.doc.createElement("Simple Program");

    elemento.appendChild((Node) ast.C.visitXML(this, null));

    return elemento;
  }

  @Override
  public Object visitCompoundProgram(CompoundProgram ast, Object o) {
    
    Element elemento = this.doc.createElement("Compound Program");

    elemento.appendChild((Node) ast.C.visitXML(this, null));

    elemento.appendChild((Node) ast.PD.visitXML(this, null));

    return elemento;
  }

  public Object generateXML(AST rootElement){
    
    try {

      //Primero crea el documento

      DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();

      DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

      this.doc = dBuilder.newDocument();

      //Crea la raiz
      
      //Element rootElement = doc.createElement("Program");
      //doc.appendChild(rootElement);

      this.doc.appendChild((Node) rootElement.visitXML(this, null));

      //crea y agrega el primer elemento anidado a la raiz

      /*Element primerElemento = doc.createElement("primerElemento");
      rootElement.appendChild(primerElemento);

      Attr attr = doc.createAttribute("company");
      attr.setValue("Ferrari");
      primerElemento.setAttributeNode(attr);

      Element carname = doc.createElement("carname");
      Attr attrType = doc.createAttribute("type");
      attrType.setValue("formula one");
      carname.setAttributeNode(attrType);
      carname.appendChild(doc.createTextNode("Ferrari 101"));
      primerElemento.appendChild(carname);

      Element carname1 = doc.createElement("carname");
      Attr attrType1 = doc.createAttribute("type");
      attrType1.setValue("sports");
      carname1.setAttributeNode(attrType1);
      carname1.appendChild(doc.createTextNode("Ferrari 202"));
      primerElemento.appendChild(carname1);*/

      TransformerFactory transformerFactory = TransformerFactory.newInstance();
      Transformer transformer = transformerFactory.newTransformer();
      DOMSource source = new DOMSource(this.doc);
      StreamResult result = new StreamResult(new File("C:\\tree.xml"));
      transformer.transform(source, result);
      
      StreamResult consoleResult = new StreamResult(System.out);
      transformer.transform(source, consoleResult);

   } catch (Exception e) {
      e.printStackTrace();
   }
    return null;

  }
  
}
