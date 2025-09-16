package modules.module1.timeClasses;

import java.util.Calendar;

public class JavaTime {
    public static void main(String[] args) {

        // Utilizando o Calendar
        Calendar cal = Calendar.getInstance();

        Integer day = cal.get(Calendar.DAY_OF_MONTH);
        Integer month = cal.get(Calendar.MONTH) + 1;
        Integer year = cal.get(Calendar.YEAR);

        System.out.println("0" + day + "/0" + month + "/" + year);


    }
}
