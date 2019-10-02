package co.com.prueba.expedia.tasks;

import co.com.prueba.expedia.user_interface.ExpediaHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CompleteTheForm implements Task {

    private String flyingFrom;
    private String flyingTo;

    public CompleteTheForm (String flyingFrom, String flyingTo){
        this.flyingFrom = flyingFrom;
        this.flyingTo = flyingTo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Date date = new Date();
        Calendar c = Calendar.getInstance(); 
        c.setTime(date); 
        c.add(Calendar.DATE, 1);
        date = c.getTime();
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
        
        String currentDate = dateFormat.format(date);

        actor.attemptsTo(
                Enter.theValue(flyingFrom).into(ExpediaHomePage.FLYINGFROM_FIELD),
                Enter.theValue(flyingTo).into(ExpediaHomePage.FLYINGTO_FIELD),
                Enter.theValue(currentDate).into(ExpediaHomePage.DATE_FIELD)
        );
    }

    public static CompleteTheForm with(String flyingFrom, String flyingTo){
        return Tasks.instrumented(CompleteTheForm.class, flyingFrom, flyingTo);
    }
}
