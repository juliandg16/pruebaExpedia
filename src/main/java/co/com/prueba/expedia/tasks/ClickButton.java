package co.com.prueba.expedia.tasks;

import co.com.prueba.expedia.user_interface.ExpediaHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ClickButton implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ExpediaHomePage.BUTTON_ONEFLIGTHS),
                Click.on(ExpediaHomePage.BUTTON_SEARCH)
        );
    }

    public static ClickButton search () {
        return Tasks.instrumented(ClickButton.class);
    }
}
