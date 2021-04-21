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

  @Override
  public Object visitAssignCommand(AssignCommand ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitCallCommand(CallCommand ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitEmptyCommand(EmptyCommand ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitCompoundIfCommand(CompoundIfCommand ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitIfCommand(IfCommand ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitLetCommand(LetCommand ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitSequentialCommand(SequentialCommand ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitWhileLoopCommand(WhileLoopCommand ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitUntilLoopCommand(UntilLoopCommand ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitDoLoopUntilCommand(DoLoopUntilCommand ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitDoLoopWhileCommand(DoLoopWhileCommand ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitSequentialElsifCommand(SequentialElsifCommand ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitSingleElsifCommand(SingleElsifCommand ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitForLoopDoCommand(ForLoopDoCommand ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitForLoopWhileCommand(ForLoopWhileCommand ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitForLoopUntilCommand(ForLoopUntilCommand ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitProcedure(Procedure ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitFunction(Function ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitSequentialProcFuncs(SequentialProcFuncs ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitChooseCommand(ChooseCommand ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitForFromCommand(ForFromCommand ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitCaseLiteral(CaseLiteral ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitSimpleCaseRange(SimpleCaseRange ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitCompoundCaseRange(CompoundCaseRange ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitSequentialCaseRange(SequentialCaseRange ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitCaseLiterals(CaseLiterals ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitCompoundCases(CompoundCases ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitElseCase(ElseCase ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitSequentialCase(SequentialCase ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitSimpleCases(SimpleCases ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitSingleCase(SingleCase ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitArrayExpression(ArrayExpression ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitBinaryExpression(BinaryExpression ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitCallExpression(CallExpression ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitCharacterExpression(CharacterExpression ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitEmptyExpression(EmptyExpression ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitIfExpression(IfExpression ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitIntegerExpression(IntegerExpression ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitLetExpression(LetExpression ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitRecordExpression(RecordExpression ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitUnaryExpression(UnaryExpression ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitVnameExpression(VnameExpression ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitBinaryOperatorDeclaration(BinaryOperatorDeclaration ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitConstDeclaration(ConstDeclaration ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitFuncDeclaration(FuncDeclaration ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitProcDeclaration(ProcDeclaration ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitSequentialDeclaration(SequentialDeclaration ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitTypeDeclaration(TypeDeclaration ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitUnaryOperatorDeclaration(UnaryOperatorDeclaration ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitVarTDDeclaration(VarTDDeclaration ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitVarExpDeclaration(VarExpDeclaration ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitRecDeclaration(RecDeclaration ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitPrivDeclaration(PrivDeclaration ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitMultipleArrayAggregate(MultipleArrayAggregate ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitSingleArrayAggregate(SingleArrayAggregate ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitMultipleRecordAggregate(MultipleRecordAggregate ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitSingleRecordAggregate(SingleRecordAggregate ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitConstFormalParameter(ConstFormalParameter ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitFuncFormalParameter(FuncFormalParameter ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitProcFormalParameter(ProcFormalParameter ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitVarFormalParameter(VarFormalParameter ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitEmptyFormalParameterSequence(EmptyFormalParameterSequence ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitMultipleFormalParameterSequence(MultipleFormalParameterSequence ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitSingleFormalParameterSequence(SingleFormalParameterSequence ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitConstActualParameter(ConstActualParameter ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitFuncActualParameter(FuncActualParameter ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitProcActualParameter(ProcActualParameter ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitVarActualParameter(VarActualParameter ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitEmptyActualParameterSequence(EmptyActualParameterSequence ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitMultipleActualParameterSequence(MultipleActualParameterSequence ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitSingleActualParameterSequence(SingleActualParameterSequence ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitAnyTypeDenoter(AnyTypeDenoter ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitArrayTypeDenoter(ArrayTypeDenoter ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitBoolTypeDenoter(BoolTypeDenoter ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitCharTypeDenoter(CharTypeDenoter ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitErrorTypeDenoter(ErrorTypeDenoter ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitSimpleTypeDenoter(SimpleTypeDenoter ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitIntTypeDenoter(IntTypeDenoter ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitRecordTypeDenoter(RecordTypeDenoter ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitMultipleFieldTypeDenoter(MultipleFieldTypeDenoter ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitSingleFieldTypeDenoter(SingleFieldTypeDenoter ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitCharacterLiteral(CharacterLiteral ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitIdentifier(Identifier ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitIntegerLiteral(IntegerLiteral ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitOperator(Operator ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitDotVarName(DotVarName ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitSimpleVarName(SimpleVarName ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitSubscriptVarName(SubscriptVarName ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitSimpleVname(SimpleVname ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitPackageIdentifier(PackageIdentifier ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitPackageVname(PackageVname ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitSimpleLongIdentifier(SimpleLongIdentifier ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitPackageLongIdentifier(PackageLongIdentifier ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitSinglePackageDeclaration(SinglePackageDeclaration ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitSequentialPackageDeclaration(SequentialPackageDeclaration ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitSimpleProgram(SimpleProgram ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object visitCompoundProgram(CompoundProgram ast, Object o) {
    // TODO Auto-generated method stub
    return null;
  }

  public Object generateXML(){
    
    try {

      //Primero crea el documento

      DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();

      DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

      Document doc = dBuilder.newDocument();

      //Crea la raiz
      
      Element rootElement = doc.createElement("ejemploRaiz");
      doc.appendChild(rootElement);

      //crea y agrega el primer elemento anidado a la raiz

      Element primerElemento = doc.createElement("primerElemento");
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
      primerElemento.appendChild(carname1);

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
