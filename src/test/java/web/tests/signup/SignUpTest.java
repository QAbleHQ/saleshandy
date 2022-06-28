package web.tests.signup;


import io.unity.framework.init.base;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import web.object_repository.otp.otp;
import web.object_repository.signup.signup;

import java.io.IOException;


public class SignUpTest extends base {

    @Test
    public void verify_signup_with_valid_email_password() throws IOException, InterruptedException {
         signup signup = new signup(driver);
         otp otp = new otp(driver);
         driver.manage().window().maximize();

         signup.enter_text_at_preferably_your_work_email_text_box("qabletest+4.27@gmail.com");
         signup.enter_text_at_a_secure_one_please_password("QAble@1010");

         signup.click_on_sign_up_button();

        otp.verify_a_quick_verification_text_text_is_equal_to("A quick verification");
        otp.gmaillogin();
        otp.clear_text_and_enter_text_in_gmailt("qabletest@gmail.com");
        otp.click_on_gmail_next();
        otp.clear_text_and_enter_text_in_gmail_password("QAble@1010");
        otp.click_on_gmail_password_next();
        otp.click_on_gmail_subject_text();
        otp.get_otp();
        otp.click_on_verify_button();

        signup.enter_text_first_name_text("test 1");
        signup.enter_text_last_name_text("test 3");
        signup.click_on_select_people();
        signup.click_on_select_people_dropdown();
        signup.click_on_select_industry();
        signup.click_on_select_industry_dropdown();
        signup.click_on_saleshandy_name();
        signup.click_on_continue_signup();
        signup.verify_onboard_page_is_present_on_page();

        signup.click_on_onboard_gmail();
        signup.verify_gmail_verify_is_present_on_page();
        signup.click_on_gmail_verify();
        signup.click_on_gmail_verify_allow();
        signup.verify_setting_menu_is_present_on_page();


        signup.click_on_close_video();
      //  signup.click_on_close_getting_started();
        //signup.click_on_click_comment();
        //signup.click_on_close_close_comment();
        //signup.click_on_close_getting_started();
        signup.click_on_click_on_schedule();
        signup.click_on_add_new_schedule();
        signup.click_on_add_schedule_save();
        signup.click_on_enter_schedule_name();
        signup.clear_text_and_enter_text_in_enter_schedule_name("enter_schedule_name","enter_schedule_name");
        signup.click_on_select_time_zone();
        signup.click_on_change_time_zone();


    }


}
