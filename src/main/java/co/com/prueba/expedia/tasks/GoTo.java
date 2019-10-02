package co.com.prueba.expedia.tasks;

import co.com.prueba.expedia.user_interface.ExpediaHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class GoTo implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ExpediaHomePage.BUTTON_FLIGTHS),
                Click.on(ExpediaHomePage.BUTTON_ONEFLIGTHS)
        );
    }

    public static GoTo findOneWayFlights(){
        return Tasks.instrumented(GoTo.class);
    }
}
