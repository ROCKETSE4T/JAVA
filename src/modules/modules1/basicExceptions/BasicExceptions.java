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

        // ======== Checked Exceptions ========
        // São exceções que o compilador verifica em tempo de compilação.
        // Ou seja, o javac exige que o código trate essas exceções com try-catch
        // ou que as propague com throws. Caso contrário, a compilação falha.
        // Todas as checked exceptions são subclasses de Exception, mas não de RuntimeException.
        // Necessário tratar pois extende a Exception
        try {
            checkMyCheckedException("Sergio pauzao");
            System.out.println("Entrou!");
        } catch (MinhaCheckedException e) {
            e.printStackTrace();
        }catch (Exception e) {
            e.printStackTrace();
        }


        // ======== Unchecked Exceptions  =========
        // São exceções que o compilador NÃO exige que sejam tratadas.
        // São subclasses de RuntimeException.
        // Geralmente indicam erros de lógica ou problemas inesperados em tempo de execução,
        // Náo é necessário tratar pois extende a Exception

        checkMyRunTimeException("enzo");

    }



    protected static void checkMyRunTimeException(String name) throws MinhaUncheckedException {
        if(!name.equalsIgnoreCase("Enzo")){
            throw new MinhaUncheckedException();
        }
        System.out.println("Bem vindo!");
    }

    protected static void checkMyCheckedException(String name) throws MinhaCheckedException, Exception {
        if (name.equalsIgnoreCase("Sergio pauzao")) {
            throw  new Exception("Respeito!");
        }

        if(!name.equalsIgnoreCase("Enzo")){
            throw new MinhaCheckedException();
        }


    }
}
