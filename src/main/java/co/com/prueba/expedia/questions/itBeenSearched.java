package co.com.prueba.expedia.questions;

import co.com.prueba.expedia.user_interface.SearchPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class itBeenSearched implements Question<String> {

    public static itBeenSearched theWord(){
        return new itBeenSearched();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(SearchPage.MESSAGE_SEARCHED).viewedBy(actor).asString();
    }
}
