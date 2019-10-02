package co.com.prueba.expedia.questions;

import co.com.prueba.expedia.user_interface.ExpediaHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class IsShown implements Question<String>{

    public static IsShown theMessage(){
        return new IsShown();
    }
	
	@Override
	public String answeredBy(Actor actor) {
        return Text.of(ExpediaHomePage.ERROR_MESSAGE).viewedBy(actor).asString();
	}

}
