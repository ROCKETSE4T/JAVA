package modules.module1.strings;

public class Strings {

    public static void main(String[] args) {

        // ===============================
        // Criando Strings
        // ===============================

        String nome1 = "Enzo";                      // Literal (usando String Pool)
        String nome2 = new String("Enzo");   // Nova instância, fora do pool

        System.out.println("nome1 == nome2? " + (nome1 == nome2));         // false
        System.out.println("nome1.equals(nome2)? " + nome1.equals(nome2)); // true

        String nome3 = nome2.intern();              // Força uso do pool
        System.out.println("nome1 == nome3? " + (nome1 == nome3));         // true


        // ===============================
        // Imutabilidade
        // ===============================

        String original = "Enzo";
        String modificado = original + " Rodrigues";

        System.out.println("Original: " + original);       // "Enzo"
        System.out.println("Modificado: " + modificado);   // "Enzo Rodrigues"
        // 'original' continua intacto → String é imutável

        // String original = "Enzo";                     // Aponta para "Enzo" (no String Pool)
        // original = original + " Rodrigues";           // Cria nova String: "Enzo Rodrigues"
        //                                               // A instância anterior ("Enzo") não é mais referenciada
        //                                               // e pode ser coletada pelo Garbage Collector



        // ===============================
        // Métodos úteis da classe String
        // ===============================

        String frase = "  Java é incrível!  ";

        System.out.println("Tamanho: " + frase.length());                      // 20 (conta espaços)
        System.out.println("charAt(2): " + frase.charAt(2));                  // 'v'
        System.out.println("substring(0, 4): " + frase.substring(0, 4));      // "Java"
        System.out.println("toUpperCase(): " + frase.toUpperCase());         // "  JAVA É INCRÍVEL!  "
        System.out.println("toLowerCase(): " + frase.toLowerCase());         // "  java é incrível!  "
        System.out.println("contains(\"é\"): " + frase.contains("é"));        // true
        System.out.println("startsWith(\"  Ja\"): " + frase.startsWith("  Ja")); // true
        System.out.println("endsWith(\"!\"): " + frase.endsWith("!  "));      // false
        System.out.println("replace(\"Java\", \"Kotlin\"): " + frase.replace("Java", "Kotlin")); // "  Kotlin é incrível!  "
        System.out.println("trim(): " + frase.trim());                        // "Java é incrível!"
        System.out.println("isEmpty(): " + frase.isEmpty());                  // false

        String vazio = "";
        String branco = "   ";
        System.out.println("vazio.isEmpty(): " + vazio.isEmpty());           // true
        System.out.println("branco.isBlank(): " + branco.isBlank());         // true

        // split
        String nomes = "Ana,Bruno,Carla";
        String[] array = nomes.split(",");
        for (String n : array) {
            System.out.println("Nome: " + n);
        }
    }
}
