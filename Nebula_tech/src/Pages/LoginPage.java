import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    @FindBy(id = "username")
    private WebElement usernameField;
    @FindBy(id = "password")
    private WebElement passwordField;
    @FindBy(id = "login_button")
    private WebElement loginButton;
    @FindBy(xpath = "//h1[text='Dashboard']")
    private WebElement headerText;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void enterUsername(String username) {
        usernameField.clear();
        usernameField.sendKeys(username);
    }
    public void enterPassword(String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
    }
    public void clickLogin() {
        loginButton.click();
    }
    public void isHeaderDisplayed() {
    	headerText.isDisplayed();
    }
}


