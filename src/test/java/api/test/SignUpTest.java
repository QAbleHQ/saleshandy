package api.test;

import io.unity.framework.init.base;
import io.unity.performaction.autoapi.RequestBuilder;
import io.unity.performaction.autoapi.ResponseValidator;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;


public class SignUpTest extends base
{

    @Test
    public void verify_with_valid_credentials() {

        RequestBuilder builder = new RequestBuilder();
        JSONObject response = builder.performRequest("signup/signup_with_valid_credentials");

        ResponseValidator validator = new ResponseValidator(response);

        String message1 = validator.getDataFromBody("$.message");
        assertThat(message1).isEqualTo("OTP has been sent successfully");

        String payload = validator.getDataFromBody("$.payload.canResendUserVerificationCode");
        assertThat(payload).isNotBlank();

    }

   /* @Test
    public void verify_with_invalid_credentials() {

        RequestBuilder builder = new RequestBuilder();
        JSONObject response = builder.performRequestWithHeaderAndBody("signup/signup_with_valid_credentials",);
        ResponseValidator validator = new ResponseValidator(response);

        validator.statusCodeShouldBe(201);



    }

    @Test
    public void verify_with_invalid_credentials() {

        RequestBuilder builder = new RequestBuilder();
        JSONObject response = builder.performRequestWithHeaderAndBody("signup/signup_with_valid_credentials",);
        ResponseValidator validator = new ResponseValidator(response);

        validator.statusCodeShouldBe(201);



    }*/

}
