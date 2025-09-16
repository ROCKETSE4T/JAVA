package modules.module1.timeClasses.apiJavaTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

class MyLocalDate {

     public static void main(String[] args) {

         //Classe da API java.time utilizada exclusivamente para representar datas no formato ISO aaaa-mm-dd.
         LocalDate dataAtual = LocalDate.now();

         //Recupera a data atual de acordo com sua região.
         System.out.println(dataAtual);

         //Retorna uma data de acordo com o Ano, mês e dia especificado.
         LocalDate meuAniversario = LocalDate.of(2025, 11, 5);
         System.out.println(meuAniversario);


         // Transformando uma String com o formato de data para uma LocalDate
         LocalDate dataConcreta = LocalDate.parse("2025-11-05");
         System.out.println(dataConcreta);

         // E se eu receber uma data em formato BR, como faria para transformar em um LocalDate que espera a ISO aaaa-mm-dd?
         // DateTimeFormatter é uma classe auxiliar,
         // que retorna um formatador que indica ao Java o formato de data que estamos utilizando para realizar determinada ação.
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
         LocalDate dataConcretaISO = LocalDate.parse("05/11/2003", formatter);
         System.out.println(dataConcretaISO);

         //E se eu receber uma data no formato ISO padrao de LocalDate e quiser colocar no formato BR?
         // Lembrando que o LocalDate aceita ISO aaaa-mm-dd, dessa forma estaremos retornando uma String com o formato desejado.
         String dataConcretaBR = dataConcretaISO.format(formatter);
         System.out.println(dataConcretaBR);

         // ========== Manipulando Datas ==========

         //Adicianando uma quantia de anos de uma data para retornar um novo valor.
         LocalDate nascimentoPessoa = LocalDate.now();
         LocalDate aniversarioQuinze = nascimentoPessoa.plusYears(15);
         System.out.println(aniversarioQuinze);

         //Retirando uma quantia de anos de uma data para retornar um novo valor.
         LocalDate aniversario14 = aniversarioQuinze.minusYears(1);
         System.out.println(aniversario14);


         // Comparando datas
         LocalDate data1 = LocalDate.now();
         LocalDate data2 = LocalDate.now().plusDays(10);

         // Verificando se a data1 vem antes ou depois da data2
         System.out.println(data1.isBefore(data2)); // true
         System.out.println(data1.isAfter(data2)); // false

         //Verificando se as datas são iguais
         System.out.println(data2.isEqual(data1));


         // ========== Estilos de Formatação ==========
         LocalDate data = LocalDate.of(2023,1,13);

         String dataFormatada = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));  // 13 de janeiro de 2023
         dataFormatada = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));  // 13 de jan. de 2023
         dataFormatada = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));  // 13/01/2023
         dataFormatada = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));  // sexta-feira, 13 de janeiro de 2023


         //========== Controle de data de acordo com Localização  ==========

         Locale[] locais = {Locale.US, Locale.CANADA, Locale.of("pt", "brazil")};
         for (Locale local : locais) {
             LocalDate date = LocalDate.now();
             DateTimeFormatter formatterFor = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(local);
             String formatted = date.format(formatterFor);
             System.out.println(formatted);
         }





     }
}
