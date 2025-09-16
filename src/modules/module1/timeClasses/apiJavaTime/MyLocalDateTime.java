package modules.module1.timeClasses.apiJavaTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class MyLocalDateTime {
    public static void main(String[] args) {
        //Classe da api java.time que representa data e hora (AAAA-MM-DDTHH:mm:ss.nnn).

        // Recuperando a data e hora atual
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        //Criando uma dateTime a partir de um ano, mes, dia, hora, minuto e segundo especifico.
        LocalDateTime dataHora = LocalDateTime.of(2025, 9, 3, 14, 30); // 2025-09-03T14:30
        System.out.println(dataHora);

        //Combinando as classes LocalDate e LocalTime para obter uma LocalDateTime.
        LocalDateTime combinada = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println(combinada);

        // Formatando nossa LocalDateTime
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dateHoraFormatada = localDateTime.format(formatter);
        System.out.println(dateHoraFormatada);



    }
}
