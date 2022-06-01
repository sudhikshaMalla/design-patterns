package structuralPatterns.facadePattern;

import structuralPatterns.facadePattern.compilerPhases.SyntaxAnalyser;

public class Main {
    public static void main(String[] args) {

        Compiler compiler = new Compiler();

        compiler.compile();


    }
}