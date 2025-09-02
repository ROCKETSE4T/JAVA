package modules.modules1.timeClasses.calendar;

import java.util.Calendar;

public class Calendario {

    private Calendar calendario;

    public Calendario() {

        //Retorna uma instancia do objeto
        this.calendario = Calendar.getInstance();
    }

    public Calendar getCalendar(){
        return this.calendario;
    }


}
