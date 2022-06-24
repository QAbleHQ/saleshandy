package web.object_repository.signup;

import io.unity.framework.generators.methodsgenerator.methods.MethodsData;
import io.unity.performaction.autoweb.*;
import org.openqa.selenium.*;




public class signup {

	WebDriver driver = null;
	Element element = null;
	Verify verify = null;

	Wait wait = null;

	public signup(WebDriver driver) {
		this.driver = driver;
		element = new Element(driver);
		verify = new Verify(driver);
		wait = new Wait(driver);
	}

	@MethodsData(method_id = "text_box_3")
	public void clear_text_and_enter_text_in_preferably_your_work_email_text_box(String text_to_enter) {
		wait.wait_for_second(5);
		element.clear_and_enter_in_text_field("preferably_your_work_email_text_box", text_to_enter);
	}

	@MethodsData(method_id = "text_box_4")
	public void verify_preferably_your_work_email_text_box_is_present_on_page() {
		verify.element_is_present("preferably_your_work_email_text_box");
	}

	@MethodsData(method_id = "text_box_2")
	public void clear_and_enter_in_text_preferably_your_work_email_text_box(String locator_value, String text_to_enter){
		wait.wait_for_second(5);
		element.clear_and_enter_in_text_field("preferably_your_work_email_text_box","qabletest@gmail.com");
		wait.wait_for_second(5);
	}

	@MethodsData(method_id = "text_box_1")
		public void enter_text_at_preferably_your_work_email_text_box(String text_to_enter){
		wait.wait_for_second(5);
		element.click("preferably_your_work_email_text_box");
		element.enter_text("preferably_your_work_email_text_box", text_to_enter);
		wait.wait_for_second(5);
	}

	@MethodsData(method_id = "text_box_1")
	public void enter_text_at_a_secure_one_please_password(String text_to_enter) {
		wait.wait_for_second(5);
		element.enter_text("a_secure_one_please_password", text_to_enter);
		wait.wait_for_second(5);
	}

	@MethodsData(method_id = "button_1")
	public void click_on_sign_up_button() {
		element.click("sign_up_button");
		wait.wait_for_second(4);
	}

	@MethodsData(method_id = "text_box_3")
	public void clear_text_and_enter_text_in_a_secure_one_please_password(String element_name, String element_text_for_click) {
		wait.wait_for_second(5);
		element.clear_and_enter_in_text_field("a_secure_one_please_password","QAble@1010");
	}
}