/**
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.generator;

import com.google.common.collect.Iterators;
import dk.sdu.mmmi.mdsd.math.Divide;
import dk.sdu.mmmi.mdsd.math.Exp;
import dk.sdu.mmmi.mdsd.math.LetMath;
import dk.sdu.mmmi.mdsd.math.Letend;
import dk.sdu.mmmi.mdsd.math.MathExp;
import dk.sdu.mmmi.mdsd.math.Minus;
import dk.sdu.mmmi.mdsd.math.Multiply;
import dk.sdu.mmmi.mdsd.math.OriginExp;
import dk.sdu.mmmi.mdsd.math.Parenthesis;
import dk.sdu.mmmi.mdsd.math.Plus;
import dk.sdu.mmmi.mdsd.math.Primary;
import dk.sdu.mmmi.mdsd.math.VariableUse;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
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
  private static Map<String, Integer> variables = new HashMap<String, Integer>();
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final OriginExp root = Iterators.<OriginExp>filter(resource.getAllContents(), OriginExp.class).next();
    final Map<String, Integer> result = MathGenerator.compute(root);
    this.displayPanel(result);
  }
  
  public static Map<String, Integer> compute(final OriginExp root) {
    EList<MathExp> _expressions = root.getExpressions();
    for (final MathExp exp : _expressions) {
      {
        HashMap<String, Integer> localVariables = new HashMap<String, Integer>();
        localVariables.putAll(MathGenerator.variables);
        MathGenerator.variables.put(exp.getName(), Integer.valueOf(MathGenerator.computeExp(exp.getExp(), localVariables)));
      }
    }
    return MathGenerator.variables;
  }
  
  public static int computeExp(final Exp exp, final Map<String, Integer> localVariables) {
    int _switchResult = (int) 0;
    boolean _matched = false;
    if (exp instanceof Plus) {
      _matched=true;
      int _computeExp = MathGenerator.computeExp(((Plus)exp).getLeft(), localVariables);
      int _computeExp_1 = MathGenerator.computeExp(((Plus)exp).getRight(), localVariables);
      _switchResult = (_computeExp + _computeExp_1);
    }
    if (!_matched) {
      if (exp instanceof Minus) {
        _matched=true;
        int _computeExp = MathGenerator.computeExp(((Minus)exp).getLeft(), localVariables);
        int _computeExp_1 = MathGenerator.computeExp(((Minus)exp).getRight(), localVariables);
        _switchResult = (_computeExp - _computeExp_1);
      }
    }
    if (!_matched) {
      if (exp instanceof Multiply) {
        _matched=true;
        int _computeExp = MathGenerator.computeExp(((Multiply)exp).getLeft(), localVariables);
        int _computeExp_1 = MathGenerator.computeExp(((Multiply)exp).getRight(), localVariables);
        _switchResult = (_computeExp * _computeExp_1);
      }
    }
    if (!_matched) {
      if (exp instanceof Divide) {
        _matched=true;
        int _computeExp = MathGenerator.computeExp(((Divide)exp).getLeft(), localVariables);
        int _computeExp_1 = MathGenerator.computeExp(((Divide)exp).getRight(), localVariables);
        _switchResult = (_computeExp / _computeExp_1);
      }
    }
    if (!_matched) {
      if (exp instanceof Primary) {
        _matched=true;
        _switchResult = MathGenerator.primaryCase(((Primary)exp), localVariables);
      }
    }
    return _switchResult;
  }
  
  public static int primaryCase(final Primary exp, final Map<String, Integer> localVariables) {
    int _switchResult = (int) 0;
    boolean _matched = false;
    if (exp instanceof dk.sdu.mmmi.mdsd.math.Number) {
      _matched=true;
      _switchResult = ((dk.sdu.mmmi.mdsd.math.Number)exp).getValue();
    }
    if (!_matched) {
      if (exp instanceof Parenthesis) {
        _matched=true;
        _switchResult = MathGenerator.computeExp(((Parenthesis)exp).getExp(), localVariables);
      }
    }
    if (!_matched) {
      if (exp instanceof VariableUse) {
        _matched=true;
        _switchResult = MathGenerator.variableCase(((VariableUse)exp), localVariables);
      }
    }
    if (!_matched) {
      if (exp instanceof Letend) {
        _matched=true;
        _switchResult = MathGenerator.letendCase(((Letend)exp), localVariables);
      }
    }
    return _switchResult;
  }
  
  public static int variableCase(final VariableUse exp, final Map<String, Integer> localVariables) {
    Integer _switchResult = null;
    LetMath _ref = exp.getRef();
    boolean _matched = false;
    if (_ref instanceof MathExp) {
      _matched=true;
      HashMap<String, Integer> globalVariables = new HashMap<String, Integer>();
      globalVariables.putAll(MathGenerator.variables);
      LetMath _ref_1 = exp.getRef();
      int temp = MathGenerator.computeExp(((MathExp) _ref_1).getExp(), globalVariables);
      LetMath _ref_2 = exp.getRef();
      localVariables.put(((MathExp) _ref_2).getName(), Integer.valueOf(temp));
      return temp;
    }
    if (!_matched) {
      if (_ref instanceof Letend) {
        _matched=true;
        LetMath _ref_1 = exp.getRef();
        _switchResult = localVariables.get(((Letend) _ref_1).getName());
      }
    }
    return (_switchResult).intValue();
  }
  
  public static int letendCase(final Letend exp, final Map<String, Integer> localVariables) {
    final Integer oldStored = localVariables.get(exp.getName());
    localVariables.put(exp.getName(), Integer.valueOf(MathGenerator.computeExp(exp.getVal(), localVariables)));
    final int stored = MathGenerator.computeExp(exp.getExp(), localVariables);
    localVariables.put(exp.getName(), oldStored);
    return stored;
  }
  
  public static int computePrim(final Primary factor) {
    return 87;
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
}
