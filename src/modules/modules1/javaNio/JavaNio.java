package modules.modules1.javaNio;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class JavaNio {
    //Api nova do Java para lidar com inputs e outputs, de forma mais performatica e simples.

    public static void main(String[] args) {
        try {

            // ========== Classe Path ==========
            // Representa um arquivo ou diretorio em nosso sistema operacional.
            // É como um “endereço” que pode ser manipulado de forma segura e multiplataforma.
            //  Classe utilitária com métodos estáticos para criar instâncias de Path.
            Path path = Paths.get("/Users/enzorodrigues/Developer/www/courses/rocketseat/JAVA/src/modules/modules1/javaNio/teste.txt");


            // ========== Classe Files ==========
            //Classe com métodos estáticos para manipulação real de arquivos e diretórios usando Path.
            //Permite operações como leitura, escrita, cópia, deleção, verificação de existência etc.

            if (Files.notExists(path)) {
                Files.createFile(path);
            }
            //Lendo o caminho e convertendo todos os caracteres presentes (bytes) de uma só vez.
            byte[] bytes = Files.readAllBytes(path);
            //Por serem bytes podemos transforma-los em uma string
            String content = new String(bytes);
            System.out.println(content);

            //Na mesma classe utilitaria, possuimos um metodo que nos retorna todas as linhas contidas no nosso arquivo, sem precisarmos interpretar todos os bytes e colocarmos em um array.
            // Ela retorna uma lista de linhas
            List<String> lines = Files.readAllLines(path);

            for (String line : lines) {
                System.out.println(line);
            }

            // Manipulando conteudo do arquivo utilizando Files (Adicionando novo conteudo)
            List<String> lines2 = new ArrayList<>();
            lines2.add("Mariana Vieira");
            lines2.add("Enzo Rodrigues");
            lines2.add("Breno Rodrigues");


            // ========== Classe Stringbuilder ==========
            // serve para manipular textos de forma eficiente, permitindo modificar o conteúdo sem criar novos objetos toda hora.
            //Em Java, a classe String é imutável → sempre que você faz uma operação como concatenação, um novo objeto String é criado.
            //O StringBuilder foi criado para resolver isso: ele mantém um buffer interno de caracteres que pode ser alterado sem criar novos objetos.
            StringBuilder stringBuilder = new StringBuilder();
            lines2.forEach(s -> stringBuilder.append(s).append("\n"));

            // Para inserir de fato o conteudo no arquivo, precisamos pegar os bytes e passar o encode que ele deve seguir, nesse caso UTF-8
            // Caso queira que o arquivo mantenha o conteudo original, adicione um terceiro parametro Enum StandariOpenOption APPEND, para appendar o novo conteudo com o já existente.
            Files.write(path, stringBuilder.toString().getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);





            Path livrosTel = Paths.get("/Users/enzorodrigues/Developer/www/courses/rocketseat/JAVA/src/modules/modules1/javaNio/telefones.txt");
            List<String> tels = new ArrayList<>();
            StringBuilder stringBuilder2 = new StringBuilder();
            tels.add("(21) 2705-6726 Reginaldo Folly Barboza Brito");
            tels.add("(91) 2416-8455 Mariza Gadelha Bastida Carneiro");
            tels.add("(68) 3259-8389 Mirian Venancio Portela Ignacia");

            tels.forEach(s -> stringBuilder2.append(s).append("\n"));

             if (Files.notExists(livrosTel)) {
                 Files.createFile(livrosTel);
             }

            Files.write(livrosTel, stringBuilder2.toString().getBytes(StandardCharsets.UTF_8));


        }catch (IOException e){
            e.printStackTrace();
        }
    }




}
