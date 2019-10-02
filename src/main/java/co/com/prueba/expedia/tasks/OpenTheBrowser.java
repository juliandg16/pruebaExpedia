package co.com.prueba.expedia.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class OpenTheBrowser implements Task {

    private PageObject page;

    public OpenTheBrowser (PageObject page){
        this.page = page;
    }

    @Override
    @Step("{0} opens the browser in the page selected")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(page));
    }

    public static OpenTheBrowser on(PageObject page) {
        // Pasa la responsabilidad de la instancia a OpenTheBrowser
        // esta funcion puede ser new OpenTheBrowser() y funciona igual
        return Tasks.instrumented(OpenTheBrowser.class, page); // Creación de instancia con serenity (funcion instrummented)
    }
}
