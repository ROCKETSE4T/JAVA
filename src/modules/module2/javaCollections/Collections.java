package modules.module2.javaCollections;

import java.util.*;

public class Collections {

    public static void main(String[] args) {


        // ============== LIST ============== //
        List<String> lista = new ArrayList<>();

        // Adicionar elementos
        lista.add("Java");
        lista.add("Python");
        lista.add("C++");

        // Acessar por índice
        System.out.println(lista.get(1)); // Python

        // Alterar valor
        lista.set(2, "C#"); // Substitui "C++" por "C#"

        // Remover
        lista.remove("Java");   // remove o valor "Java"
        lista.remove(0);        // remove o índice 0

        // Verificar tamanho
        System.out.println(lista.size()); // 2

        // Verificar se contém
        System.out.println(lista.contains("Python")); // true

        // Iterar (formas diferentes)
        for (String lang : lista) {
            System.out.println(lang);
        }

        lista.forEach(System.out::println); // Java 8+

        // ============== Conjuntos ============== //
        // Náo permite duplicatas
        //Ao inserir o valor, um hash é gerado a partir do msm e um indice é obtido.
        // Indice esse utilizado para inserir o valor que representa chave.
        // Um hashset não e comumente usado para busca de valores, somente para saber se um valor existe ou nao nele.

        Set hashSet = new HashSet();

        //Adicionando valores no hashSet
        hashSet.add("Enzo");
        hashSet.add("Arthur");
        hashSet.add("enzo");
        System.out.println(hashSet);

        // Removendo valores
        hashSet.remove("enzo");


        // ============== HashMap ============== //
        // Chaves repetidas nao são permitidas, mas valores sim.
        // Não ordenado, a ordem como os itens são inseridos não importa.
        // Baseado em tabelaHash.

        Map<String, String> hashMap = new HashMap<>();

        //Adicionando valores ( O(1) )
        hashMap.put("Enzo", "enzorodriguesdev@email.com");
        hashMap.put("Mariana", "mariana.doutora20@email.com");

        // Removendo valores ( O(1) )
        hashMap.remove("Enzo");

        // Recuperar valores ( O(1) )
        System.out.println(hashMap.get("Enzo"));

        // Percorrendo valores ( O(n)
        Iterator<String> keys = hashMap.keySet().iterator();


        while (keys.hasNext()){
            // Pega a proxima chave
            String key = keys.next();

            //Recupera o valor
            String value = hashMap.get(key);

            System.out.println(String.format("O email de %s é %s", key, value));
        }



    }


}
