package modules.modules1.timeClasses.apiJavaTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class MyLocalTime {
    public static void main(String[] args) {

        //Classe da api java.time para representar especificamente, horas, minutos e segundos (HH:mm:ss.nnn).

        //Recupera a hora atual.
        LocalTime time = LocalTime.now();
        System.out.println(time);

        // Criando um local time a partir de uma hora, minuto e segundo.
        LocalTime horaMinSeg = LocalTime.of(0, 0, 50);
        System.out.println(horaMinSeg);

        // Pegando o horario a partir de uma String
        LocalTime horaString = LocalTime.parse("12:10");
        System.out.println(horaString);

        // E se eu receber uma hora em formato X, como faria para transformar em um LocalTime que espera a ISO HH:mm:ss.nnn?
        // DateTimeFormatter é uma classe auxiliar,
        // que retorna um formatador que indica ao Java o formato de tempor que estamos utilizando para realizar determinada ação.
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HHmmss");
        LocalTime tempoFormat = LocalTime.parse("122023", formatter);
        System.out.println(tempoFormat);

        // ========== Manipulando Tempo ==========

        LocalTime timeNow30min = time.plusMinutes(30);
        System.out.println(timeNow30min);

        LocalTime LocalTimeNowMin30min = time.minusMinutes(30);
        System.out.println(LocalTimeNowMin30min);

        boolean isAfter = time.isAfter(timeNow30min);
        System.out.println(isAfter);
        boolean isBefore = time.isBefore(timeNow30min);
        System.out.println(isBefore);

        // ========== Estilos de Formatação ==========
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("ss:mm:HH");
        String horaInvertida = time.format(formatter1);
        System.out.println(horaInvertida);





    }
}

