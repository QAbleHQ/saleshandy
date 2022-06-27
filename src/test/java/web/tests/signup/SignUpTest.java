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

         signup.enter_text_at_preferably_your_work_email_text_box("qabletest@gmail.com");
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

    }

}
