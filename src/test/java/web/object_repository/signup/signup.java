package web.object_repository.signup;
import org.openqa.selenium.JavascriptExecutor;
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

	@MethodsData(method_id = "text_box_3")
	public void enter_text_first_name_text(String text_to_enter){
		wait.wait_for_second(5);
		element.enter_text("first_name_text_box", text_to_enter);
	}

	@MethodsData(method_id = "text_box_3")
	public void enter_text_last_name_text(String text_to_enter){
		element.enter_text("last_name_text_box", text_to_enter);
	}

	@MethodsData(method_id = "button_3")
	public void click_on_select_people(){
		element.click("select_people");
	}

	@MethodsData(method_id = "button_3")
	public void click_on_select_people_dropdown(){
		wait.wait_for_second(3);
		element.click("select_people_dropdown");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	@MethodsData(method_id = "button_3")
	public void click_on_select_industry(){
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		wait.wait_for_second(5);
		element.click("select_industry");
	}

	@MethodsData(method_id = "button_3")
	public void click_on_select_industry_dropdown(){
		wait.wait_for_second(3);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		element.click("select_industry_dropdown");
	}

	@MethodsData(method_id = "button_3")
	public void click_on_saleshandy_name(){
		wait.wait_for_second(5);
		element.click("saleshandy_name");
	}

	@MethodsData(method_id = "button_3")
	public void click_on_continue_signup(){
		wait.wait_for_second(3);
		element.click("continue_signup");
	}

	@MethodsData(method_id = "text_3")
	public void verify_onboard_page_is_present_on_page() {

		verify.element_is_present("onboard_page");
		wait.wait_for_second(5);
	}

	@MethodsData(method_id = "button_3")
	public void click_on_onboard_gmail(){
		wait.wait_for_second(3);
		element.click("onboard_gmail");

	}

	@MethodsData(method_id = "button_3")
	public void verify_gmail_verify_is_present_on_page(){
		verify.element_is_present("gmail_verify");
		wait.wait_for_second(5);
	}

	@MethodsData(method_id = "button_3")
	public void click_on_gmail_verify(){
		element.click("gmail_verify");
		wait.wait_for_second(3);
	}

	@MethodsData(method_id = "button_3")
	public void click_on_gmail_verify_allow(){
		element.click("gmail_verify_allow");
		wait.wait_for_second(3);
	}

	@MethodsData(method_id = "button_3")
	public void verify_setting_menu_is_present_on_page(){
		verify.element_is_present("setting_menu");
		System.out.println("user connected with saleshandy");
		wait.wait_for_second(5);

	}

	@MethodsData(method_id = "button_3")
	public void click_on_close_video(){
		element.click("close_video");
		wait.wait_for_second(5);
	}

	@MethodsData(method_id = "button_3")
	public void click_on_close_getting_started(){
		element.click("close_getting_started");
		wait.wait_for_second(5);
	}

	@MethodsData(method_id = "button_3")
	public void click_on_close_close_comment(){
		element.click("close_comment");
		wait.wait_for_second(5);
	}

	@MethodsData(method_id = "button_3")
	public void click_on_click_on_schedule(){
		element.click("click_on_schedule");
		wait.wait_for_second(3);
	}
	@MethodsData(method_id = "button_3")
	public void click_on_add_new_schedule(){
		element.click("add_new_schedule");
		wait.wait_for_second(3);
	}

	@MethodsData(method_id = "button_3")
	public void click_on_add_schedule_save(){
		element.click("schedule_save");
		wait.wait_for_second(3);
	}

	@MethodsData(method_id = "text_box_3")
	public void click_on_enter_schedule_name(){
		element.click("enter_schedule_name");
		wait.wait_for_second(3);
	}

	@MethodsData(method_id = "text_box_3")
	public void clear_text_and_enter_text_in_enter_schedule_name(String element_name, String element_text_for_click) {
		wait.wait_for_second(5);
		element.clear_text_field("enter_schedule_name");
		element.clear_and_enter_in_text_field("enter_schedule_name","Test 772");
	}

	@MethodsData(method_id = "button_3")
	public void click_on_select_time_zone(){
		element.click("select_time_zone");
		wait.wait_for_second(3);
	}

	@MethodsData(method_id = "button_3")
	public void click_on_change_time_zone(){
		element.click("change_time_zone");
		wait.wait_for_second(3);
	}

	@MethodsData(method_id = "button_3")
	public void click_on_click_comment(){
		wait.wait_for_second(1);
		element.click("click_comment");
		wait.wait_for_second(1);
	}





}