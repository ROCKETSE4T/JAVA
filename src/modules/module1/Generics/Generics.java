package modules.module1.Generics;

import javax.management.ObjectName;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Generics {
    // Generics permitem parametrizar classes, interfaces e métodos,
    // garantindo que eles manipulem apenas tipos específicos de dados.
    // Sem generics, a JVM trata todos os objetos como do tipo Object,
    // o que obriga o uso de casting ao acessar os valores e aumenta o risco de erros.

    public static void main(String[] args) {
        // ======== Parametrizando com Generics ========
        ArrayList<String> strings = new ArrayList<>();

        strings.add("Enzo");
        strings.add("Mariana");
        strings.add("Breno");
//      strings.add(123); // Erro de runtime

        // É possivel fazer isso pois consigo garantir que os dados dentro de strings são Strings.
        for (String nome : strings){
            System.out.println(nome);
        }

        // HashMap com generics
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Enzo", 20);
        hashMap.put("Mariana", 25);
        int idadeEnzo = hashMap.get("Enzo"); // Sem cast!
        System.out.println(idadeEnzo);


        // ======== Parametrizando sem Generics ========

        ArrayList noGenerics = new ArrayList<>();

        // É possivel adicionar mais de um tipo, pois quando não usamos generics, o tipo é object.
        noGenerics.add("Enzo");
        noGenerics.add("Mariana");
        noGenerics.add("Breno");
        noGenerics.add(123);

        // Não é possivel fazer isso pois a JVM não garante que todos os dados dentro do ArrayList são Strings.
        // Caso eu queira, preciso declarar nomes como Object.
//        for (String nome : noGenerics){
//            System.out.println(nome);
//        }

        for (Object nome : noGenerics){
            System.out.println(nome);
        }





    }



}