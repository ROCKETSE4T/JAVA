package modules.modules1.basicExceptions;

public class BasicExceptions {

    // ===============================
    // Resumo sobre Exceções em JAVA
    // ===============================
    // Em Java, uma exceção é um evento que ocorre durante a execução do programa
    // e que interrompe o fluxo normal das instruções.
    // As exceções são usadas para sinalizar erros ou condições inesperadas,
    // podendo (ou não) ser tratadas pelo código.
    //
    // Toda exceção herda da classe Throwable, que se divide em:
    // - Exception: para erros tratáveis
    // - Error: para erros graves, geralmente não tratáveis (ex: OutOfMemoryError)
    // ===============================

    public static void main(String[] args) {

        // Checked Exceptions
        // São exceções que o compilador verifica em tempo de compilação.
        // Ou seja, o javac exige que o código trate essas exceções com try-catch
        // ou que as propague com throws. Caso contrário, a compilação falha.
        //
        // Embora o erro só possa ocorrer em tempo de execução (ex: abrir um arquivo que não existe),
        // o compilador exige que o código esteja preparado para lidar com ele.
        //
        // Todas as checked exceptions são subclasses de Exception, mas não de RuntimeException.
        //
        // Exemplos comuns: FileNotFoundException, IOException, SQLException
        try {
            java.io.FileReader fr = new java.io.FileReader("arquivo.txt");
        } catch (java.io.FileNotFoundException e) {
            System.out.println("Arquivo não encontrado.");
        }

        // Unchecked Exceptions (Runtime Exceptions)
        // São exceções que o compilador NÃO exige que sejam tratadas.
        // São subclasses de RuntimeException.
        // Geralmente indicam erros de lógica ou problemas inesperados em tempo de execução,
        // como acessar uma variável nula ou fazer uma divisão por zero.
        //
        // Exemplos: NullPointerException, ArithmeticException, ArrayIndexOutOfBoundsException

        String nome = null;
        System.out.println(nome.length()); // lança NullPointerException em tempo de execução

        // Error
        // Representa erros graves que normalmente não devem (ou não podem) ser tratados.
        // Ex: StackOverflowError, OutOfMemoryError, etc.

        // throw e throws
        // - throw: usado para lançar uma exceção manualmente
        // - throws: usado para declarar que um método pode lançar uma exceção
    }
}
