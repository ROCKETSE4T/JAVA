package modules.modules1.timeClasses.apiJavaTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ManipulandoDatas
{
    public static void main(String[] args)
    {
        // ========== Transformação ==========
        //Manipualando as classes LocalDate, LocalDateTime e LocalTime.

        //Transfoma uma LocalDateTime em uma LocalDate (extrai apenas a data)
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        LocalDate localDate = localDateTime.toLocalDate();
        System.out.println(localDate);

        //Transfoma uma LocalDateTime em uma LocalDate (extrai apenas a hora)
        LocalTime localTime = localDateTime.toLocalTime();
        System.out.println(localTime);

        //Transfoma uma LocalDate em uma LocalDateTime. (Precisamos passar o valor da hora)
        LocalDateTime localDateTime1 = localDate.atTime(localTime);
        System.out.println(localDateTime1);

        //Transfoma uma LocalTime em uma LocalDateTime. (Precisamos passar o valor da data)
        LocalDateTime localDateTime2 = localTime.atDate(localDate);
        System.out.println(localDateTime2);





    }
}
