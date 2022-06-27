package web.object_repository.otp;
import io.unity.autoweb.Wait;
import io.unity.performaction.autoweb.Element;
import io.unity.performaction.autoweb.Verify;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.unity.framework.generators.methodsgenerator.methods.MethodsData;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
	}

	@MethodsData(method_id = "link_3")
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
		wait.wait_for_second(5);
	}
	@MethodsData(method_id = "button_4")
	public void Verify_verify_button_text_is_equal_to(String button_text) {
		verify.element_text_is_equal_to("verify_button", button_text);
	}
	@MethodsData(method_id = "text_1")
	public void verify_qabletest_gmail_com_text_text_is_equal_to(String button_text) {
		verify.element_text_is_equal_to("qabletest_gmail_com_text", button_text);
	}

	@MethodsData(method_id = "text_1")
	public void clear_text_and_enter_text_in_gmailt(String text_to_enter){
		wait.wait_for_second(5);
		element.click("gmailt");
		element.clear_and_enter_in_text_field("gmailt","qabletest@gmail.com");
		wait.wait_for_second(5);
	}

	@MethodsData(method_id = "button_3")
	public void click_on_gmail_next(){
		element.click("gmail_next");
		wait.wait_for_second(5);
	}

	@MethodsData(method_id = "text_1")
	public void clear_text_and_enter_text_in_gmail_password(String text_to_enter){
		wait.wait_for_second(5);
		element.click("gmail_password");
		element.clear_and_enter_in_text_field("gmail_password","QAble@1010");
		wait.wait_for_second(5);
	}

	@MethodsData(method_id = "button_3")
	public void click_on_gmail_password_next(){
		element.click("gmail_password_next");
		wait.wait_for_second(10);
	}

	public void gmaillogin()
	{
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://gmail.com");
		}

	/*@MethodsData(method_id = "button_3")
	public void verify_gmail_subject_text_text_is_equal_to(String button_text){
		wait.wait_for_second(5);
		verify.element_text_is_equal_to("gmail_subject_text",button_text);
		wait.wait_for_second(5);
	}*/


	@MethodsData(method_id = "button_3")
	public void click_on_gmail_subject_text(){
		List<WebElement> gmail_subject_text1 = driver.findElements(By.xpath("//span[contains(.,'Saleshandy')]"));
		for(WebElement emailsub1 : gmail_subject_text1){
			if(emailsub1.getText().equals("Saleshandy") == true){
				System.out.println(emailsub1);
				wait.wait_for_second(5);
				emailsub1.click();
				wait.wait_for_second(5);
				break;
			}
		}
	}

	public String get_otp() {
		wait.wait_for_second(5);
		//verify.element_text_is_equal_to("otp_link", link_text);
		//Pattern pattern = Pattern.compile("numFound=\"([0-9]+)\"");
		//Matcher matcher = pattern.matcher("");

		//if (matcher.find()) {
			//System.out.println(matcher.group(1));

		//}
		String otp_string = driver.findElement(By.xpath("//div[@class= \"a3s aiL \"]//div")).getText();
		String final_otp = otp_string.replaceAll("[^0-9]","");
		System.out.println(final_otp);
		wait.wait_for_second(5);
		ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
		String oldTab = driver.getWindowHandle();
		driver.switchTo().window(newTab.get(0));
		wait.wait_for_second(5);
		WebElement enter_otp = driver.findElement(By.xpath("//input[@placeholder = \"Enter OTP sent to your email\"]"));
		enter_otp.sendKeys(final_otp);
		wait.wait_for_second(5);
		return final_otp;
	}

	/*public void backtosaleshandy()
	{

	}

	/*@MethodsData(method_id = "link_3")
	public void click_on_enter_otp_sent_to_your_email_text_box() {

	}*/

}