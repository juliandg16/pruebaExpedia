package co.com.prueba.expedia.user_interface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchPage extends PageObject {

    public static final Target MESSAGE_SEARCHED = Target.the("Message searched").located(By.id("titleBar"));
    public static final Target SORTED_SELECT = Target.the("Selector order").located(By.id("sortDropdown"));
}
