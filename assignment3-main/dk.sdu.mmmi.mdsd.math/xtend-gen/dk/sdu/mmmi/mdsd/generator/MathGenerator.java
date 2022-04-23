/**
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.generator;

import com.google.common.collect.Iterators;
import dk.sdu.mmmi.mdsd.math.Binding;
import dk.sdu.mmmi.mdsd.math.Div;
import dk.sdu.mmmi.mdsd.math.Expression;
import dk.sdu.mmmi.mdsd.math.External;
import dk.sdu.mmmi.mdsd.math.LetBinding;
import dk.sdu.mmmi.mdsd.math.MathNumber;
import dk.sdu.mmmi.mdsd.math.Method;
import dk.sdu.mmmi.mdsd.math.Minus;
import dk.sdu.mmmi.mdsd.math.Mult;
import dk.sdu.mmmi.mdsd.math.Parentheses;
import dk.sdu.mmmi.mdsd.math.Plus;
import dk.sdu.mmmi.mdsd.math.Program;
import dk.sdu.mmmi.mdsd.math.VarBinding;
import dk.sdu.mmmi.mdsd.math.VariableUse;
import java.util.Map;
import java.util.Random;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class MathGenerator extends AbstractGenerator {
  private static Map<String, String> variables = CollectionLiterals.<String, String>newHashMap();
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final Program p = Iterators.<Program>filter(resource.getAllContents(), Program.class).next();
    String _name = p.getName();
    String _plus = ("math_expression/" + _name);
    String _plus_1 = (_plus + ".java");
    fsa.generateFile(_plus_1, this.compile(p));
  }
  
  public CharSequence compile(final Program program) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package math_expression.test;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    String _name = program.getName();
    _builder.append(_name);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    {
      EList<VarBinding> _variables = program.getMathExps().getVariables();
      for(final VarBinding varBinding : _variables) {
        _builder.append("\t");
        _builder.append("public int ");
        String _name_1 = varBinding.getName();
        _builder.append(_name_1, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void compute() {");
    _builder.newLine();
    {
      EList<VarBinding> _variables_1 = program.getMathExps().getVariables();
      for(final VarBinding varBinding_1 : _variables_1) {
        _builder.append("\t\t");
        String _name_2 = varBinding_1.getName();
        _builder.append(_name_2, "\t\t");
        _builder.append(" = ");
        String _resolve = this.resolve(varBinding_1.getExpression());
        _builder.append(_resolve, "\t\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    {
      boolean _isEmpty = program.getExternals().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("\t");
        _builder.append("private External external;\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public ");
        String _name_3 = program.getName();
        _builder.append(_name_3, "\t");
        _builder.append("(External external){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("this.external = external;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("interface External {\t\t");
        _builder.newLine();
        {
          EList<External> _externals = program.getExternals();
          for(final External external : _externals) {
            _builder.append("\t");
            _builder.append("public int ");
            String _name_4 = external.getName();
            _builder.append(_name_4, "\t");
            _builder.append(" (");
            String _listAll = this.listAll(external);
            _builder.append(_listAll, "\t");
            _builder.append(");");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public String resolve(final Expression expression) {
    String output = "";
    boolean _matched = false;
    if (expression instanceof MathNumber) {
      _matched=true;
      String _output = output;
      int _value = ((MathNumber)expression).getValue();
      output = (_output + Integer.valueOf(_value));
    }
    if (!_matched) {
      if (expression instanceof Parentheses) {
        _matched=true;
        String _output = output;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("( ");
        String _resolve = this.resolve(((Parentheses)expression).getExp());
        _builder.append(_resolve);
        _builder.append(" )");
        output = (_output + _builder);
      }
    }
    if (!_matched) {
      if (expression instanceof VariableUse) {
        _matched=true;
        String _output = output;
        String _resolveBinding = this.resolveBinding(((VariableUse)expression).getRef());
        output = (_output + _resolveBinding);
      }
    }
    if (!_matched) {
      if (expression instanceof Method) {
        _matched=true;
        String _output = output;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("this.external.");
        String _name = ((Method)expression).getRef().getName();
        _builder.append(_name);
        _builder.append("(");
        String _listAllExpressions = this.listAllExpressions(((Method)expression));
        _builder.append(_listAllExpressions);
        _builder.append(")");
        output = (_output + _builder);
      }
    }
    if (!_matched) {
      if (expression instanceof Plus) {
        _matched=true;
        String _output = output;
        StringConcatenation _builder = new StringConcatenation();
        String _resolve = this.resolve(((Plus)expression).getLeft());
        _builder.append(_resolve);
        _builder.append(" + ");
        String _resolve_1 = this.resolve(((Plus)expression).getRight());
        _builder.append(_resolve_1);
        output = (_output + _builder);
      }
    }
    if (!_matched) {
      if (expression instanceof Minus) {
        _matched=true;
        String _output = output;
        StringConcatenation _builder = new StringConcatenation();
        String _resolve = this.resolve(((Minus)expression).getLeft());
        _builder.append(_resolve);
        _builder.append(" - ");
        String _resolve_1 = this.resolve(((Minus)expression).getRight());
        _builder.append(_resolve_1);
        output = (_output + _builder);
      }
    }
    if (!_matched) {
      if (expression instanceof Div) {
        _matched=true;
        String _output = output;
        StringConcatenation _builder = new StringConcatenation();
        String _resolve = this.resolve(((Div)expression).getLeft());
        _builder.append(_resolve);
        _builder.append(" / ");
        String _resolve_1 = this.resolve(((Div)expression).getRight());
        _builder.append(_resolve_1);
        output = (_output + _builder);
      }
    }
    if (!_matched) {
      if (expression instanceof Mult) {
        _matched=true;
        String _output = output;
        StringConcatenation _builder = new StringConcatenation();
        String _resolve = this.resolve(((Mult)expression).getLeft());
        _builder.append(_resolve);
        _builder.append(" * ");
        String _resolve_1 = this.resolve(((Mult)expression).getRight());
        _builder.append(_resolve_1);
        output = (_output + _builder);
      }
    }
    return output;
  }
  
  public String resolveBinding(final Binding binding) {
    String _switchResult = null;
    boolean _matched = false;
    if (binding instanceof VarBinding) {
      _matched=true;
      StringConcatenation _builder = new StringConcatenation();
      String _name = ((VarBinding)binding).getName();
      _builder.append(_name);
      _builder.append(" = ");
      String _resolve = this.resolve(((VarBinding)binding).getExpression());
      _builder.append(_resolve);
      _switchResult = _builder.toString();
    }
    if (!_matched) {
      if (binding instanceof LetBinding) {
        _matched=true;
        _switchResult = this.letBindings(((LetBinding)binding));
      }
    }
    return _switchResult;
  }
  
  public String letBindings(final LetBinding binding) {
    MathGenerator.variables.put(binding.getName(), this.resolve(binding.getBinding()));
    this.resolveBody(binding.getBody());
    return "";
  }
  
  public String resolveBody(final Expression expression) {
    return null;
  }
  
  public String listAllExpressions(final Method method) {
    String output = "";
    EList<Expression> _exps = method.getExps();
    for (final Expression exp : _exps) {
      String _output = output;
      String _resolve = this.resolve(exp);
      String _plus = (_resolve + ", ");
      output = (_output + _plus);
    }
    int _length = output.length();
    boolean _greaterThan = (_length > 2);
    if (_greaterThan) {
      int _length_1 = output.length();
      int _minus = (_length_1 - 2);
      output = output.substring(0, _minus);
    }
    return output;
  }
  
  private Random r = new Random();
  
  public String listAll(final External external) {
    String output = "";
    EList<String> _args = external.getArgs();
    for (final String arg : _args) {
      String _output = output;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(arg);
      _builder.append(" n");
      int _nextInt = this.r.nextInt(1000000);
      _builder.append(_nextInt);
      long _currentTimeMillis = System.currentTimeMillis();
      _builder.append(_currentTimeMillis);
      _builder.append(", ");
      output = (_output + _builder);
    }
    int _length = output.length();
    boolean _greaterThan = (_length > 2);
    if (_greaterThan) {
      int _length_1 = output.length();
      int _minus = (_length_1 - 2);
      output = output.substring(0, _minus);
    }
    return output;
  }
}
