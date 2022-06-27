package api.test;

import io.unity.framework.init.base;
import io.unity.performaction.autoapi.RequestBuilder;
import io.unity.performaction.autoapi.ResponseValidator;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SignUpOtpTest extends base {

    @Test
    public void signup_with_valid_otp() {

        RequestBuilder builder = new RequestBuilder();
        JSONObject response = builder.performRequest("verifysignup/signup_with_valid_otp");
        response.put("code",final_otp);



        ResponseValidator signup = new ResponseValidator(response);
        signup.statusCodeShouldBe(201);

    }



}
