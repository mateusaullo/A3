package compiler;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.nio.file.*;

public class Main {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Uso: java compiler.Main <arquivo_de_entrada>");
            return;
        }

        String filePath = args[0];

        try {
            // Lê o arquivo da linguagem definida pelo grupo
            CharStream input = CharStreams.fromFileName(filePath);

            // Cria lexer e parser
            SimpleLangLexer lexer = new SimpleLangLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            SimpleLangParser parser = new SimpleLangParser(tokens);

            // Remove o console de erros padrão e substitui por um customizado
            parser.removeErrorListeners();
            lexer.removeErrorListeners();

            lexer.addErrorListener(new DiagnosticErrorListener());
            parser.addErrorListener(new DiagnosticErrorListener());

            // Faz o parse (gera a árvore)
            ParseTree tree = parser.program();

            // Verifica erros de sintaxe
            if (parser.getNumberOfSyntaxErrors() == 0) {
                System.out.println("✔ Sintaxe correta! Nenhum erro encontrado.");

                // Aqui entra análise semântica (Visitor)
                // SemanticAnalyzer sem = new SemanticAnalyzer();
                // sem.visit(tree);

                System.out.println("Análise semântica concluída (placeholder).");
                System.out.println("Compilação finalizada com sucesso!");

            } else {
                System.out.println("Foram encontrados erros de sintaxe.");
            }

        } catch (Exception e) {
            System.out.println("Erro ao processar o arquivo: " + e.getMessage());
        }
    }
}
