package structuralPatterns.facadePattern;

import structuralPatterns.facadePattern.compilerPhases.*;

public class Compiler {

    private SyntaxAnalyser syntaxAnalyser;
    private SemanticAnalyser semanticAnalyser;
    private IntermediateCodeGenerator intermediateCodeGenerator;
    private CodeOptimiser codeOptimiser;
    private CodeGenerator codeGenerator;

    public Compiler() {
        this.syntaxAnalyser = new SyntaxAnalyser();
        this.semanticAnalyser = new SemanticAnalyser();
        this.intermediateCodeGenerator = new IntermediateCodeGenerator();
        this.codeOptimiser = new CodeOptimiser();
        this.codeGenerator = new CodeGenerator();
    }

    public void compile() {
        syntaxAnalyser.analyse();
        semanticAnalyser.analyse();
        intermediateCodeGenerator.generate();
        codeOptimiser.optimise();
        codeGenerator.generate();
        System.out.println("Code compiled successfully!!");
    }
}