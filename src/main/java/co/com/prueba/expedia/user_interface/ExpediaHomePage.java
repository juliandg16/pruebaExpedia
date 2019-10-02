package co.com.prueba.expedia.user_interface;


import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.expedia.com/")
public class ExpediaHomePage extends PageObject {

    public static final Target BUTTON_FLIGTHS = Target.the("Option button flights").located(By.id("tab-flight-tab-hp"));
    public static final Target BUTTON_ONEFLIGTHS = Target.the("Option button one flights").located(By.id("flight-type-one-way-label-hp-flight"));
    public static final Target FLYINGFROM_FIELD = Target.the("Text field flight origin").located(By.id("flight-origin-hp-flight"));
    public static final Target FLYINGTO_FIELD = Target.the("Text field flight destination").located(By.id("flight-destination-hp-flight"));
    public static final Target DATE_FIELD = Target.the("Text field date").located(By.id("flight-departing-single-hp-flight"));
    public static final Target BUTTON_SEARCH = Target.the("Button search").locatedBy("//form[@id='gcw-flights-form-hp-flight']//button[@class='btn-primary btn-action gcw-submit']");
    public static final Target ERROR_MESSAGE = Target.the("Error Message").locatedBy("//h5[@class='alert-title no-outline']");

}																					 