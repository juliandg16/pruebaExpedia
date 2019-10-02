package co.com.prueba.expedia.tasks;

import co.com.prueba.expedia.user_interface.SearchPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class ClickSelect implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectFromOptions.byVisibleText("Departure (Earliest)").from(SearchPage.SORTED_SELECT)
        );
    }

    public static ClickSelect sort() {
        return Tasks.instrumented(ClickSelect.class);
    }
}