package modules.module1.typeCasting;

public class TypeCasting {

    // ===============================
    // Type Casting
    //
    // Type Casting é o processo de conversão do tipo de uma variável para outro tipo.
    // Pode acontecer de duas formas:
    // - Implícita (automática)
    // - Explícita (manual, feita pelo programador)
    //
    // É muito utilizado no tratamento e validação de dados,
    // para prevenir perda de dados, melhorar a performance,
    // e facilitar operações entre tipos diferentes.
    // ===============================

    public static void main(String[] args) {

        // ===============================
        // 1. Widening Casting (Implícita)
        // Conversão de um tipo menor para um tipo maior.
        // Ex: byte → short → int → long → float → double
        // ===============================

        int meuInt = 100;
        double meuDouble = meuInt;  // casting implícito (int → double)

        System.out.println("Widening Casting:");
        System.out.println("int: " + meuInt);
        System.out.println("double: " + meuDouble);

        // ===============================
        // 2. Narrowing Casting (Explícita)
        // Conversão de um tipo maior para um tipo menor.
        // Necessita de casting manual, pois pode haver perda de dados.
        // Ex: double → float → long → int → short → byte
        // ===============================

        double outroDouble = 9.78;
        int outroInt = (int) outroDouble;  // casting explícito (double → int)

        System.out.println("\nNarrowing Casting:");
        System.out.println("double original: " + outroDouble);
        System.out.println("int convertido: " + outroInt); // perde a parte decimal (9)

        // ===============================
        // ⚠️ Observação:
        // Em narrowing casting, pode ocorrer truncamento (perda de parte dos dados)
        // ou até "wrap around" em tipos como byte/short.
        // ===============================
    }
}
