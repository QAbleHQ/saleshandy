package api.test;

import io.unity.framework.init.base;
import io.unity.performaction.autoapi.RequestBuilder;
import io.unity.performaction.autoapi.ResponseValidator;
import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class SignUpOtpTest extends base {

    public void gmaillogin()
    {
        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("https://gmail.com");
    }

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



    @Test
    public void signup_with_valid_otp() {

        RequestBuilder builder = new RequestBuilder();
        JSONObject response = builder.performRequest("verifysignup/signup_with_valid_otp");
        response.put("code",final_otp);



        ResponseValidator signup = new ResponseValidator(response);
        signup.statusCodeShouldBe(201);

    }



}
