package web.object_repository.otp;
import io.unity.autoweb.Wait;
import io.unity.performaction.autoweb.Element;
import io.unity.performaction.autoweb.Verify;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.unity.framework.generators.methodsgenerator.methods.MethodsData;
import java.io.IOException;

import java.io.IOException;
import java.net.URL;

public class otp {
	WebDriver driver = null;
	Element element = null;
	Verify verify = null;

	Wait wait = null;

	//Wait delay = null;

	public otp(WebDriver driver) {
		this.driver = driver;
		element = new Element(driver);
		verify = new Verify(driver);
		wait = new Wait(driver);
		//WebDriverWait delay = new WebDriverWait(driver, 5);

	}

	@FindBy(xpath = "//input[@id='identifierId']")
	private WebElement gmail;

	@FindBy(xpath = "//*[@id=\\\'identifierNext\\\']/div/button")
	private WebElement gmailNext;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement gpassword;

	@FindBy(xpath = "//*[@id=\\\'passwordNext\\\']/div/button")
	private WebElement gpasswordNext;

	@FindBy(xpath = "//a[contains(text(),'Verify')]")
	private WebElement verifybtn;





	@MethodsData(method_id = "link_1")
	public void verify_login_link_is_present_on_page() {
		verify.element_is_present("login_link");
	}
	@MethodsData(method_id = "link_3")
	public void verify_login_link_is_clickable() {
		verify.element_is_enable("login_link");
	}
	@MethodsData(method_id = "link_2")
	public void Verify_login_link_text_is_equal_to(String button_text) {
		verify.element_text_is_equal_to("login_link", button_text);
	}
	@MethodsData(method_id = "link_4")
	public void click_on_login_link() {
		element.click("login_link");
	}
	@MethodsData(method_id = "text_box_3")
	public void clear_text_and_enter_text_in_enter_otp_sent_to_your_email_text_box(String text_to_enter) {
		element.clear_and_enter_in_text_field("enter_otp_sent_to_your_email_text_box", text_to_enter);
	}
	@MethodsData(method_id = "text_box_4")
	public void verify_enter_otp_sent_to_your_email_text_box_is_present_on_page() {
		verify.element_is_present("enter_otp_sent_to_your_email_text_box");
	}
	@MethodsData(method_id = "text_box_1")
	public void enter_text_at_enter_otp_sent_to_your_email_text_box(String text_to_enter) {
		element.enter_text("enter_otp_sent_to_your_email_text_box", text_to_enter);
	}
	@MethodsData(method_id = "text_box_2")
	public void clear_text_from_enter_otp_sent_to_your_email_text_box() {
		element.clear_text_field("enter_otp_sent_to_your_email_text_box");
	}
	@MethodsData(method_id = "text_1")
	public void verify_a_quick_verification_text_text_is_equal_to(String button_text) {
		verify.element_text_is_equal_to("a_quick_verification_text", button_text);
		wait.wait_for_second(5);

	}
	@MethodsData(method_id = "button_1")
	public void verify_verify_button_is_present_on_page() {
		verify.element_is_present("verify_button");
	}
	@MethodsData(method_id = "button_2")
	public void verify_verify_button_is_clickable() {
		verify.element_is_enable("verify_button");
	}
	@MethodsData(method_id = "button_3")
	public void click_on_verify_button() {
		element.click("verify_button");
	}
	@MethodsData(method_id = "button_4")
	public void Verify_verify_button_text_is_equal_to(String button_text) {
		verify.element_text_is_equal_to("verify_button", button_text);
	}
	@MethodsData(method_id = "text_1")
	public void verify_qabletest_gmail_com_text_text_is_equal_to(String button_text) {
		verify.element_text_is_equal_to("qabletest_gmail_com_text", button_text);
	}

	public void gmaillogin() throws IOException,InterruptedException
	{
		driver.navigate().to("https://gmail.com");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		try {
			gmail.sendKeys("qabletest@gmail.com");
		} catch (Exception e1) {

		}
		gmailNext.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		try {
			gpassword.sendKeys("QAble@1010");
		} catch (Exception e1) {
		}
		gpasswordNext.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		//wait.until(ExpectedConditions.jsReturnsValue("return document.readyState == 'complete'"));
		//wait.until(ExpectedConditions.stalenessOf(driver.findElements(By.xpath("//span[contains(@class,'bqe')][contains(text(),'Please verify your email address')]")).get(1)));
		driver.findElements(By.xpath("//span[contains(@class,'bqe')][contains(text(),'Please verify your email address')]")).get(1).click();
		//wait.until(ExpectedConditions.jsReturnsValue("return document.readyState == 'complete'"));
		verifybtn.click();

	}

}