package modules.module1.javaNio.layouts;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SistemaCadastro {

    public static void main(final String[] args) {
        List<Cadastro> cadastros = new ArrayList<>();

        cadastros.add(new Cadastro("Joemia Giron Lyrio Monnerat","F", 8321485886L, LocalDate.of(1984,6,30),35.0, false));
        cadastros.add(new Cadastro("Reginaldo Folly Barboza Brito","M", 2127056726L, LocalDate.of(1990,3,17),40.0, true));
        cadastros.add(new Cadastro("Mariza Gadelha Bastida Carneiro","F", 9124168455L, LocalDate.of(1889,8,18),40.0, false));
        cadastros.add(new Cadastro("Mirian Venancio Portela Ignacia","M", 6832598389L, LocalDate.of(1975,11,21),29.0, true));
        Path cvsFile = Paths.get("/Users/enzorodrigues/Developer/www/courses/rocketseat/JAVA/src/modules/modules1/javaNio/layout.csv");
        Path postionalFile = Paths.get("/Users/enzorodrigues/Developer/www/courses/rocketseat/JAVA/src/modules/modules1/javaNio/postionalFile.txt");




        escreverLayoutDelimitado(cadastros);
        lerLayoutDelimitado(cvsFile);

        escreverLayoutPosicional(cadastros, postionalFile);
        lerLayoutPosicional(postionalFile);

    }


    public static void escreverLayoutDelimitado(List<Cadastro> cadastros){
        System.out.println("***** - LAYOUT DELIMITADO - *****");
        StringBuilder builder = new StringBuilder();

        cadastros.forEach(cadastro -> {
            builder.append(cadastro.getNome()).append(";")
                    .append(cadastro.getSexo()).append(";")
                    .append(cadastro.getTelefone()).append(";")
                    .append(cadastro.getDataNascimento()).append(";")
                    .append(cadastro.getValorSugerido()).append(";")
                    .append(cadastro.getCliente()).append(";")
                    .append(System.lineSeparator());
        });

        Path cvsFile = Paths.get("/Users/enzorodrigues/Developer/www/courses/rocketseat/JAVA/src/modules/modules1/javaNio/layout.csv");

        try {
            if(!Files.exists(cvsFile)){
                Files.createFile(cvsFile);
            }
            Files.write(cvsFile, builder.toString().getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void escreverLayoutPosicional(List<Cadastro> cadastros, Path file) {
        try {
            System.out.println("***** - LAYOUT POSICIONAL - *****");

            StringBuilder conteudo = new StringBuilder();
            for (Cadastro cadastro : cadastros) {
                String nome = cadastro.getNome();
                // calma, não será assim para sempre
                if (nome.length() > 30)
                    nome = nome.substring(0, 30);

                // pesquise sobre String.format
                if (nome.length() < 30)
                    nome = String.format("%-30s", nome);

                conteudo.append(nome);
                conteudo.append(cadastro.getSexo().toUpperCase());
                conteudo.append(cadastro.getTelefone());
                conteudo.append(cadastro.getDataNascimento());

                DecimalFormat decimalFormat = new DecimalFormat("#0000.00");

                String valorFormatado = decimalFormat.format(cadastro.getValorSugerido());
                conteudo.append(valorFormatado.replaceAll("\\,", "\\.")); // -> troca , por .
                conteudo.append(cadastro.isCliente() ? "1" : "0");

                // nova linha
                conteudo.append(System.lineSeparator());
            }

            Path arquivoDestino = Paths.get(file.toAbsolutePath().toString());

            //Cria o arquivo caso não exista.
            Files.write(arquivoDestino, conteudo.toString().getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public static List<Cadastro>  lerLayoutDelimitado(Path cvsFile){
        List<Cadastro> cadastros = new ArrayList<>();

        try {
            Path arquivoOrigem = Paths.get(cvsFile.toAbsolutePath().toString());

            List<String> linhas = Files.readAllLines(arquivoOrigem);
            // imprimindo cada linha obtida no arquivo
            for(String linha:linhas){
                String[] colunas = linha.split("\\;"); // -> quebra uma linha em colunas com base no delimitador;
                String nome = colunas[0];
                String sexo = colunas[1];
                Long telefone = Long.valueOf(colunas[2]);
                LocalDate dataAniversario = LocalDate.parse(colunas[3]);
                Double valorSugerido = Double.valueOf(colunas[4]);
                boolean cliente = Boolean.valueOf(colunas[5]);

                // criando um novo cadastro e adicionando na lista de acordo com os valores de cada coluna
                Cadastro client = new Cadastro(nome,sexo,telefone,dataAniversario,valorSugerido,cliente);
                cadastros.add(client);
                System.out.println(client);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }

        // ao retornar a lista de objetos
        // você poderá realizar qualquer ação com a lista retornada

        return cadastros;
    }

    public static List<Cadastro>  lerLayoutPosicional(Path file){
        List<Cadastro> cadastros = new ArrayList<>();

        try {
            Path arquivoOrigem = Paths.get(file.toAbsolutePath().toString());

            List<String> linhas = Files.readAllLines(arquivoOrigem);
            // imprimindo cada linha obtida no arquivo
            for(String linha:linhas){
                String nome = linha.substring(0,30).trim(); // -> pego os caracteres da posição 0 a 30, trim() remove espaços laterias
                String sexo = linha.substring(30,31); // observe que sempre o primeiro parâmetro tem o valor que o segundo parâmetro anterior
                Long telefone = Long.valueOf(linha.substring(31,41)); // 41-31=10
                LocalDate dataAniversario = LocalDate.parse(linha.substring(41,51));
                Double valorSugerido = Double.valueOf(linha.substring(51,58));
                boolean cliente = linha.substring(58,59).equals("1");

                // criando um novo cadastro e adicionando na lista de acordo com os valores de cada coluna
                Cadastro client = new Cadastro(nome,sexo,telefone,dataAniversario,valorSugerido,cliente);
                cadastros.add(client);
                System.out.println(client);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }

        // ao retornar a lista de objetos
        // você poderá realizar qualquer ação com a lista retornada

        return cadastros;
    }

}
