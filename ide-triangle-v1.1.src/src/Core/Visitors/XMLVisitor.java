package Core.Visitors;

import Triangle.AbstractSyntaxTrees.AnyTypeDenoter;
import Triangle.AbstractSyntaxTrees.ArrayExpression;
import Triangle.AbstractSyntaxTrees.ArrayTypeDenoter;
import Triangle.AbstractSyntaxTrees.AssignCommand;
import Triangle.AbstractSyntaxTrees.BinaryExpression;
import Triangle.AbstractSyntaxTrees.BinaryOperatorDeclaration;
import Triangle.AbstractSyntaxTrees.BoolTypeDenoter;
import Triangle.AbstractSyntaxTrees.CallCommand;
import Triangle.AbstractSyntaxTrees.CallExpression;
import Triangle.AbstractSyntaxTrees.CaseLiteral;
import Triangle.AbstractSyntaxTrees.CaseLiterals;
import Triangle.AbstractSyntaxTrees.CharTypeDenoter;
import Triangle.AbstractSyntaxTrees.CharacterExpression;
import Triangle.AbstractSyntaxTrees.CharacterLiteral;
import Triangle.AbstractSyntaxTrees.ChooseCommand;
import Triangle.AbstractSyntaxTrees.CompoundCaseRange;
import Triangle.AbstractSyntaxTrees.CompoundCases;
import Triangle.AbstractSyntaxTrees.CompoundIfCommand;
import Triangle.AbstractSyntaxTrees.CompoundProgram;
import Triangle.AbstractSyntaxTrees.ConstActualParameter;
import Triangle.AbstractSyntaxTrees.ConstDeclaration;
import Triangle.AbstractSyntaxTrees.ConstFormalParameter;
import Triangle.AbstractSyntaxTrees.DoLoopUntilCommand;
import Triangle.AbstractSyntaxTrees.DoLoopWhileCommand;
import Triangle.AbstractSyntaxTrees.DotVarName;
import Triangle.AbstractSyntaxTrees.ElseCase;
import Triangle.AbstractSyntaxTrees.EmptyActualParameterSequence;
import Triangle.AbstractSyntaxTrees.EmptyCommand;
import Triangle.AbstractSyntaxTrees.EmptyExpression;
import Triangle.AbstractSyntaxTrees.EmptyFormalParameterSequence;
import Triangle.AbstractSyntaxTrees.ErrorTypeDenoter;
import Triangle.AbstractSyntaxTrees.ForFromCommand;
import Triangle.AbstractSyntaxTrees.ForLoopDoCommand;
import Triangle.AbstractSyntaxTrees.ForLoopUntilCommand;
import Triangle.AbstractSyntaxTrees.ForLoopWhileCommand;
import Triangle.AbstractSyntaxTrees.FuncActualParameter;
import Triangle.AbstractSyntaxTrees.FuncDeclaration;
import Triangle.AbstractSyntaxTrees.FuncFormalParameter;
import Triangle.AbstractSyntaxTrees.Function;
import Triangle.AbstractSyntaxTrees.Identifier;
import Triangle.AbstractSyntaxTrees.IfCommand;
import Triangle.AbstractSyntaxTrees.IfExpression;
import Triangle.AbstractSyntaxTrees.IntTypeDenoter;
import Triangle.AbstractSyntaxTrees.IntegerExpression;
import Triangle.AbstractSyntaxTrees.IntegerLiteral;
import Triangle.AbstractSyntaxTrees.LetCommand;
import Triangle.AbstractSyntaxTrees.LetExpression;
import Triangle.AbstractSyntaxTrees.MultipleActualParameterSequence;
import Triangle.AbstractSyntaxTrees.MultipleArrayAggregate;
import Triangle.AbstractSyntaxTrees.MultipleFieldTypeDenoter;
import Triangle.AbstractSyntaxTrees.MultipleFormalParameterSequence;
import Triangle.AbstractSyntaxTrees.MultipleRecordAggregate;
import Triangle.AbstractSyntaxTrees.Operator;
import Triangle.AbstractSyntaxTrees.PackageIdentifier;
import Triangle.AbstractSyntaxTrees.PackageLongIdentifier;
import Triangle.AbstractSyntaxTrees.PackageVname;
import Triangle.AbstractSyntaxTrees.PrivDeclaration;
import Triangle.AbstractSyntaxTrees.ProcActualParameter;
import Triangle.AbstractSyntaxTrees.ProcDeclaration;
import Triangle.AbstractSyntaxTrees.ProcFormalParameter;
import Triangle.AbstractSyntaxTrees.Procedure;
import Triangle.AbstractSyntaxTrees.RecDeclaration;
import Triangle.AbstractSyntaxTrees.RecordExpression;
import Triangle.AbstractSyntaxTrees.RecordTypeDenoter;
import Triangle.AbstractSyntaxTrees.SequentialCase;
import Triangle.AbstractSyntaxTrees.SequentialCaseRange;
import Triangle.AbstractSyntaxTrees.SequentialCommand;
import Triangle.AbstractSyntaxTrees.SequentialDeclaration;
import Triangle.AbstractSyntaxTrees.SequentialElsifCommand;
import Triangle.AbstractSyntaxTrees.SequentialPackageDeclaration;
import Triangle.AbstractSyntaxTrees.SequentialProcFuncs;
import Triangle.AbstractSyntaxTrees.SimpleCaseRange;
import Triangle.AbstractSyntaxTrees.SimpleCases;
import Triangle.AbstractSyntaxTrees.SimpleLongIdentifier;
import Triangle.AbstractSyntaxTrees.SimpleProgram;
import Triangle.AbstractSyntaxTrees.SimpleTypeDenoter;
import Triangle.AbstractSyntaxTrees.SimpleVarName;
import Triangle.AbstractSyntaxTrees.SimpleVname;
import Triangle.AbstractSyntaxTrees.SingleActualParameterSequence;
import Triangle.AbstractSyntaxTrees.SingleArrayAggregate;
import Triangle.AbstractSyntaxTrees.SingleCase;
import Triangle.AbstractSyntaxTrees.SingleElsifCommand;
import Triangle.AbstractSyntaxTrees.SingleFieldTypeDenoter;
import Triangle.AbstractSyntaxTrees.SingleFormalParameterSequence;
import Triangle.AbstractSyntaxTrees.SinglePackageDeclaration;
import Triangle.AbstractSyntaxTrees.SingleRecordAggregate;
import Triangle.AbstractSyntaxTrees.SubscriptVarName;
import Triangle.AbstractSyntaxTrees.TypeDeclaration;
import Triangle.AbstractSyntaxTrees.UnaryExpression;
import Triangle.AbstractSyntaxTrees.UnaryOperatorDeclaration;
import Triangle.AbstractSyntaxTrees.UntilLoopCommand;
import Triangle.AbstractSyntaxTrees.VarActualParameter;
import Triangle.AbstractSyntaxTrees.VarExpDeclaration;
import Triangle.AbstractSyntaxTrees.VarFormalParameter;
import Triangle.AbstractSyntaxTrees.VarTDDeclaration;
import Triangle.AbstractSyntaxTrees.Visitor;
import Triangle.AbstractSyntaxTrees.VnameExpression;
import Triangle.AbstractSyntaxTrees.WhileLoopCommand;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import java.io.File;

public class XMLVisitor implements Visitor {

  public XMLVisitor(){

  }

  private Document doc;

  public Object visitAssignCommand(AssignCommand ast, Object o) {
    Element elemento = doc.createElement("Assign Command");

    return elemento;
  }

  @Override
  public Object visitCallCommand(CallCommand ast, Object o) {
    Element elemento = doc.createElement("Call Command");

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

    return elemento;
  }

  @Override
  public Object visitIfCommand(IfCommand ast, Object o) {
    Element elemento = doc.createElement("If Command");

    return elemento;
  }

  @Override
  public Object visitLetCommand(LetCommand ast, Object o) {
    Element elemento = doc.createElement("Let Command");

    return elemento;
  }

  @Override
  public Object visitSequentialCommand(SequentialCommand ast, Object o) {
    Element elemento = doc.createElement("Sequential Command");

    return elemento;
  }

  @Override
  public Object visitWhileLoopCommand(WhileLoopCommand ast, Object o) {
    Element elemento = doc.createElement("While Loop Command");

    return elemento;
  }

  @Override
  public Object visitUntilLoopCommand(UntilLoopCommand ast, Object o) {
    Element elemento = doc.createElement("Until Loop Command");

    return elemento;
  }

  @Override
  public Object visitDoLoopUntilCommand(DoLoopUntilCommand ast, Object o) {
    Element elemento = doc.createElement("Do Loop Until Command");

    return elemento;
  }

  @Override
  public Object visitDoLoopWhileCommand(DoLoopWhileCommand ast, Object o) {
    Element elemento = doc.createElement("Do Loop While Command");

    return elemento;
  }

  @Override
  public Object visitSequentialElsifCommand(SequentialElsifCommand ast, Object o) {
    Element elemento = doc.createElement("Sequential Else If Command");

    return elemento;
  }

  @Override
  public Object visitSingleElsifCommand(SingleElsifCommand ast, Object o) {
    Element elemento = doc.createElement("Single Else If Command");

    return elemento;
  }

  @Override
  public Object visitForLoopDoCommand(ForLoopDoCommand ast, Object o) {
    Element elemento = doc.createElement("For Loop Do Command");

    return elemento;
  }

  @Override
  public Object visitForLoopWhileCommand(ForLoopWhileCommand ast, Object o) {
    Element elemento = doc.createElement("For Loop While Command");

    return elemento;
  }

  @Override
  public Object visitForLoopUntilCommand(ForLoopUntilCommand ast, Object o) {
    Element elemento = doc.createElement("For Loop Until Command");

    return elemento;
  }

  @Override
  public Object visitProcedure(Procedure ast, Object o) {
    Element elemento = doc.createElement("Procedure");

    return elemento;
  }

  @Override
  public Object visitFunction(Function ast, Object o) {
    Element elemento = doc.createElement("ProcFuncs");

    return elemento;
  }

  @Override
  public Object visitSequentialProcFuncs(SequentialProcFuncs ast, Object o) {
    Element elemento = doc.createElement("ProcFuncs");

    return elemento;
  }

  @Override
  public Object visitChooseCommand(ChooseCommand ast, Object o) {
    Element elemento = doc.createElement("Choose Command");

    return elemento;
  }

  @Override
  public Object visitForFromCommand(ForFromCommand ast, Object o) {
    Element elemento = doc.createElement("For From Command");

    return elemento;
  }

  @Override
  public Object visitCaseLiteral(CaseLiteral ast, Object o) {
    Element elemento = doc.createElement("Case Literal");

    return elemento;
  }

  @Override
  public Object visitSimpleCaseRange(SimpleCaseRange ast, Object o) {
    Element elemento = doc.createElement("Simple Case Range");

    return elemento;
  }

  @Override
  public Object visitCompoundCaseRange(CompoundCaseRange ast, Object o) {
    Element elemento = doc.createElement("Compound Case Range");

    return elemento;
  }

  @Override
  public Object visitSequentialCaseRange(SequentialCaseRange ast, Object o) {
    Element elemento = doc.createElement("Sequential Case Range");

    return elemento;
  }

  @Override
  public Object visitCaseLiterals(CaseLiterals ast, Object o) {
    Element elemento = doc.createElement("Case Literals");

    return elemento;
  }

  @Override
  public Object visitCompoundCases(CompoundCases ast, Object o) {
    Element elemento = doc.createElement("Compund Cases");

    return elemento;
  }

  @Override
  public Object visitElseCase(ElseCase ast, Object o) {
    Element elemento = doc.createElement("Else Case");

    return elemento;
  }

  @Override
  public Object visitSequentialCase(SequentialCase ast, Object o) {
    Element elemento = doc.createElement("Sequential Case");

    return elemento;
  }

  @Override
  public Object visitSimpleCases(SimpleCases ast, Object o) {
    Element elemento = doc.createElement("Simple Cases");

    return elemento;
  }

  @Override
  public Object visitSingleCase(SingleCase ast, Object o) {
    Element elemento = doc.createElement("Single Case");

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

    return elemento;
  }

  @Override
  public Object visitCallExpression(CallExpression ast, Object o) {
    Element elemento = doc.createElement("Call Expression");

    return elemento;
  }

  @Override
  public Object visitCharacterExpression(CharacterExpression ast, Object o) {
    Element elemento = doc.createElement("Character Expression");

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

    return elemento;
  }

  @Override
  public Object visitIntegerExpression(IntegerExpression ast, Object o) {
    Element elemento = doc.createElement("Integer Expression");

    return elemento;
  }

  @Override
  public Object visitLetExpression(LetExpression ast, Object o) {
    Element elemento = doc.createElement("Let Expression");

    return elemento;
  }

  @Override
  public Object visitRecordExpression(RecordExpression ast, Object o) {
    Element elemento = doc.createElement("Record Expression");

    return elemento;
  }

  @Override
  public Object visitUnaryExpression(UnaryExpression ast, Object o) {
    Element elemento = doc.createElement("Unary Expression");

    return elemento;
  }

  @Override
  public Object visitVnameExpression(VnameExpression ast, Object o) {
    Element elemento = doc.createElement("Vname Expression");

    return elemento;
  }

  @Override
  public Object visitBinaryOperatorDeclaration(BinaryOperatorDeclaration ast, Object o) {
    Element elemento = doc.createElement("Binary Operator Declaration");

    return elemento;
  }

  @Override
  public Object visitConstDeclaration(ConstDeclaration ast, Object o) {
    Element elemento = doc.createElement("Constant Declaration");

    return elemento;
  }

  @Override
  public Object visitFuncDeclaration(FuncDeclaration ast, Object o) {
    Element elemento = doc.createElement("Function Declaration");

    return elemento;
  }

  @Override
  public Object visitProcDeclaration(ProcDeclaration ast, Object o) {
    Element elemento = doc.createElement("Procedure Declaration");

    return elemento;
  }

  @Override
  public Object visitSequentialDeclaration(SequentialDeclaration ast, Object o) {
    Element elemento = doc.createElement("Sequential Declaration");

    return elemento;
  }

  @Override
  public Object visitTypeDeclaration(TypeDeclaration ast, Object o) {
    Element elemento = doc.createElement("Type Declaration");

    return elemento;
  }

  @Override
  public Object visitUnaryOperatorDeclaration(UnaryOperatorDeclaration ast, Object o) {
    Element elemento = doc.createElement("Unary Operator Declaration");

    return elemento;
  }

  @Override
  public Object visitVarTDDeclaration(VarTDDeclaration ast, Object o) {
    Element elemento = doc.createElement("Variable Typed-denoted Declaration");

    return elemento;
  }

  @Override
  public Object visitVarExpDeclaration(VarExpDeclaration ast, Object o) {
    Element elemento = doc.createElement("Initialized Variable Declaration");

    return elemento;
  }

  @Override
  public Object visitRecDeclaration(RecDeclaration ast, Object o) {
    Element elemento = doc.createElement("Recursive declaration");

    return elemento;
  }

  @Override
  public Object visitPrivDeclaration(PrivDeclaration ast, Object o) {
    Element elemento = doc.createElement("Private declaration");

    return elemento;
  }

 
  @Override
  public Object visitMultipleArrayAggregate(MultipleArrayAggregate ast, Object o) {
    Element elemento = doc.createElement("Multiple Array Aggregate");

    return elemento;
  }

  @Override
  public Object visitSingleArrayAggregate(SingleArrayAggregate ast, Object o) {
    Element elemento = doc.createElement("Single Array Aggregate");

    return elemento;
  }

  @Override
  public Object visitMultipleRecordAggregate(MultipleRecordAggregate ast, Object o) {
    Element elemento = doc.createElement("Multiple Record Aggregate");

    return elemento;
  }

  @Override
  public Object visitSingleRecordAggregate(SingleRecordAggregate ast, Object o) {
    Element elemento = doc.createElement("Single Record Aggregate");

    return elemento;
  }


  @Override
  public Object visitConstFormalParameter(ConstFormalParameter ast, Object o) {
    Element elemento = doc.createElement("Constant Formal Parameter");

    return elemento;
  }

  @Override
  public Object visitFuncFormalParameter(FuncFormalParameter ast, Object o) {
    Element elemento = doc.createElement("Function Formal Parameter");

    return elemento;
  }

  @Override
  public Object visitProcFormalParameter(ProcFormalParameter ast, Object o) {
    Element elemento = doc.createElement("Procedure Formal Parameter");

    return elemento;
  }

  @Override
  public Object visitVarFormalParameter(VarFormalParameter ast, Object o) {
    Element elemento = doc.createElement("Variable Formal Parameter");

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

    return elemento;
  }

  @Override
  public Object visitSingleFormalParameterSequence(SingleFormalParameterSequence ast, Object o) {
    Element elemento = doc.createElement("Single Formal Parameter Sequence");

    return elemento;
  }

  @Override
  public Object visitConstActualParameter(ConstActualParameter ast, Object o) {
    Element elemento = doc.createElement("Constant Actual Parameter");

    return elemento;
  }

  @Override
  public Object visitFuncActualParameter(FuncActualParameter ast, Object o) {
    Element elemento = doc.createElement("Function Actual Parameter");

    return elemento;
  }

  @Override
  public Object visitProcActualParameter(ProcActualParameter ast, Object o) {
    Element elemento = doc.createElement("Procedure Actual Parameter");

    return elemento;
  }

  @Override
  public Object visitVarActualParameter(VarActualParameter ast, Object o) {
    Element elemento = doc.createElement("Variable Formal Parameter");

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

    return elemento;
  }

  @Override
  public Object visitSingleActualParameterSequence(SingleActualParameterSequence ast, Object o) {
    Element elemento = doc.createElement("Single Formal Parameter Sequence");

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

    return elemento;
  }

  @Override
  public Object visitMultipleFieldTypeDenoter(MultipleFieldTypeDenoter ast, Object o) {

    Element elemento = doc.createElement("Multiple Field Type Denoter");

    return elemento;
  }

  @Override
  public Object visitSingleFieldTypeDenoter(SingleFieldTypeDenoter ast, Object o) {

    Element elemento = doc.createElement("Single Field Type Denoter");

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

    return elemento;
  }

  @Override
  public Object visitDotVarName(DotVarName ast, Object o) {

    Element elemento = doc.createElement("Dot Var Name");

    return elemento;
  }

  @Override
  public Object visitSimpleVarName(SimpleVarName ast, Object o) {

    Element elemento = doc.createElement("Simple Var Name");

    return elemento;
  }

  @Override
  public Object visitSubscriptVarName(SubscriptVarName ast, Object o) {

    Element elemento = doc.createElement("Subscript Var Name");

    return elemento;
  }

  @Override
  public Object visitSimpleVname(SimpleVname ast, Object o) {

    Element elemento = doc.createElement("Simple Vname");

    return elemento;
  }

  @Override
  public Object visitPackageIdentifier(PackageIdentifier ast, Object o) {

    Element elemento = doc.createElement("Package Identifier");

    return elemento;
  }

  @Override
  public Object visitPackageVname(PackageVname ast, Object o) {

    Element elemento = doc.createElement("Package Vname");

    return elemento;
  }

  @Override
  public Object visitSimpleLongIdentifier(SimpleLongIdentifier ast, Object o) {

    Element elemento = doc.createElement("Simple Long Identifier");
    
    return elemento;
  }

  @Override
  public Object visitPackageLongIdentifier(PackageLongIdentifier ast, Object o) {

    Element elemento = doc.createElement("Package Long Identifier");
  
    return elemento;
  }

  @Override
  public Object visitSinglePackageDeclaration(SinglePackageDeclaration ast, Object o) {

    Element elemento = doc.createElement("Single Package Declaration");
    return elemento;
  }

  @Override
  public Object visitSequentialPackageDeclaration(SequentialPackageDeclaration ast, Object o) {
   
    Element elemento = doc.createElement("Sequential Package Declaration");
    return elemento;
  }

  @Override
  public Object visitSimpleProgram(SimpleProgram ast, Object o) {
    Element elemento = this.doc.createElement("Simple Program");

    return elemento;
  }

  @Override
  public Object visitCompoundProgram(CompoundProgram ast, Object o) {
    
    Element elemento = this.doc.createElement("Compound Program");
    //elemento.appendChild(ast.C.visit(this, null));
    return elemento;
  }

  public Object generateXML(){
    
    try {

      //Primero crea el documento

      DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();

      DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

      this.doc = dBuilder.newDocument();

      //Crea la raiz
      
      Element rootElement = doc.createElement("Program");
      doc.appendChild(rootElement);



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
      DOMSource source = new DOMSource(doc);
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
