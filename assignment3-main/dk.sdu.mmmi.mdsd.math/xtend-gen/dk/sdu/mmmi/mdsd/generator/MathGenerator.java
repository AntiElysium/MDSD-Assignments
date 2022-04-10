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
import dk.sdu.mmmi.mdsd.math.MathExp;
import dk.sdu.mmmi.mdsd.math.MathNumber;
import dk.sdu.mmmi.mdsd.math.Method;
import dk.sdu.mmmi.mdsd.math.Minus;
import dk.sdu.mmmi.mdsd.math.Mult;
import dk.sdu.mmmi.mdsd.math.Parentheses;
import dk.sdu.mmmi.mdsd.math.Plus;
import dk.sdu.mmmi.mdsd.math.Program;
import dk.sdu.mmmi.mdsd.math.VarBinding;
import dk.sdu.mmmi.mdsd.math.VariableUse;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class MathGenerator extends AbstractGenerator {
  private static Map<String, Integer> variables;
  
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
    _builder.append("package math_expression;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    String _name = program.getName();
    _builder.append(_name);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    {
      EList<MathExp> _mathExps = program.getMathExps();
      for(final MathExp mathExp : _mathExps) {
        {
          EList<VarBinding> _variables = mathExp.getVariables();
          for(final VarBinding varBinding : _variables) {
            _builder.append("\t");
            _builder.append("public int ");
            String _name_1 = varBinding.getName();
            _builder.append(_name_1, "\t");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void compute() {");
    _builder.newLine();
    {
      EList<MathExp> _mathExps_1 = program.getMathExps();
      for(final MathExp mathExp_1 : _mathExps_1) {
        {
          EList<VarBinding> _variables_1 = mathExp_1.getVariables();
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
      }
    }
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
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
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
    return output;
  }
  
  public String resolveBinding(final Binding binding) {
    throw new Error("Unresolved compilation problems:"
      + "\nno viable alternative at input \'}\'");
  }
  
  public String listAllExpressions(final Method method) {
    String output = "";
    EList<Expression> _exps = method.getExps();
    for (final Expression exp : _exps) {
      String _output = output;
      String _plus = (exp + ", ");
      output = (_output + _plus);
    }
    int _length = output.length();
    int _minus = (_length - 3);
    output.substring(0, _minus);
    return output;
  }
  
  public String listAll(final External external) {
    String output = "";
    EList<String> _args = external.getArgs();
    for (final String arg : _args) {
      String _output = output;
      output = (_output + (arg + ", "));
    }
    int _length = output.length();
    int _minus = (_length - 3);
    output.substring(0, _minus);
    return output;
  }
  
  public void displayPanel(final Map<String, Integer> result) {
    String resultString = "";
    Set<Map.Entry<String, Integer>> _entrySet = result.entrySet();
    for (final Map.Entry<String, Integer> entry : _entrySet) {
      String _resultString = resultString;
      String _key = entry.getKey();
      String _plus = ("var " + _key);
      String _plus_1 = (_plus + " = ");
      Integer _value = entry.getValue();
      String _plus_2 = (_plus_1 + _value);
      String _plus_3 = (_plus_2 + "\n");
      resultString = (_resultString + _plus_3);
    }
    JOptionPane.showMessageDialog(null, resultString, "Math Language", JOptionPane.INFORMATION_MESSAGE);
  }
  
  public static Map<String, Integer> compute(final MathExp math) {
    Map<String, Integer> _xblockexpression = null;
    {
      HashMap<String, Integer> _hashMap = new HashMap<String, Integer>();
      MathGenerator.variables = _hashMap;
      EList<VarBinding> _variables = math.getVariables();
      for (final VarBinding varBinding : _variables) {
        MathGenerator.computeExpression(varBinding);
      }
      _xblockexpression = MathGenerator.variables;
    }
    return _xblockexpression;
  }
  
  protected static int _computeExpression(final VarBinding binding) {
    MathGenerator.variables.put(binding.getName(), Integer.valueOf(MathGenerator.computeExpression(binding.getExpression())));
    return (MathGenerator.variables.get(binding.getName())).intValue();
  }
  
  protected static int _computeExpression(final MathNumber exp) {
    return exp.getValue();
  }
  
  protected static int _computeExpression(final Plus exp) {
    int _computeExpression = MathGenerator.computeExpression(exp.getLeft());
    int _computeExpression_1 = MathGenerator.computeExpression(exp.getRight());
    return (_computeExpression + _computeExpression_1);
  }
  
  protected static int _computeExpression(final Minus exp) {
    int _computeExpression = MathGenerator.computeExpression(exp.getLeft());
    int _computeExpression_1 = MathGenerator.computeExpression(exp.getRight());
    return (_computeExpression - _computeExpression_1);
  }
  
  protected static int _computeExpression(final Mult exp) {
    int _computeExpression = MathGenerator.computeExpression(exp.getLeft());
    int _computeExpression_1 = MathGenerator.computeExpression(exp.getRight());
    return (_computeExpression * _computeExpression_1);
  }
  
  protected static int _computeExpression(final Div exp) {
    int _computeExpression = MathGenerator.computeExpression(exp.getLeft());
    int _computeExpression_1 = MathGenerator.computeExpression(exp.getRight());
    return (_computeExpression / _computeExpression_1);
  }
  
  protected static int _computeExpression(final LetBinding exp) {
    return MathGenerator.computeExpression(exp.getBody());
  }
  
  protected static int _computeExpression(final VariableUse exp) {
    return MathGenerator.computeBinding(exp.getRef());
  }
  
  protected static int _computeBinding(final VarBinding binding) {
    Integer _xblockexpression = null;
    {
      boolean _containsKey = MathGenerator.variables.containsKey(binding.getName());
      boolean _not = (!_containsKey);
      if (_not) {
        MathGenerator.computeExpression(binding);
      }
      _xblockexpression = MathGenerator.variables.get(binding.getName());
    }
    return (_xblockexpression).intValue();
  }
  
  protected static int _computeBinding(final LetBinding binding) {
    return MathGenerator.computeExpression(binding.getBinding());
  }
  
  public static int computeExpression(final EObject exp) {
    if (exp instanceof Div) {
      return _computeExpression((Div)exp);
    } else if (exp instanceof LetBinding) {
      return _computeExpression((LetBinding)exp);
    } else if (exp instanceof MathNumber) {
      return _computeExpression((MathNumber)exp);
    } else if (exp instanceof Minus) {
      return _computeExpression((Minus)exp);
    } else if (exp instanceof Mult) {
      return _computeExpression((Mult)exp);
    } else if (exp instanceof Plus) {
      return _computeExpression((Plus)exp);
    } else if (exp instanceof VarBinding) {
      return _computeExpression((VarBinding)exp);
    } else if (exp instanceof VariableUse) {
      return _computeExpression((VariableUse)exp);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(exp).toString());
    }
  }
  
  public static int computeBinding(final Binding binding) {
    if (binding instanceof LetBinding) {
      return _computeBinding((LetBinding)binding);
    } else if (binding instanceof VarBinding) {
      return _computeBinding((VarBinding)binding);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(binding).toString());
    }
  }
}
