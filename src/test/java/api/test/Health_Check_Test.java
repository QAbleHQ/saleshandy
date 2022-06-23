package api.test;

import io.unity.framework.init.base;
import io.unity.performaction.autoapi.RequestBuilder;
import io.unity.performaction.autoapi.ResponseValidator;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;
public class Health_Check_Test extends base {

    @Test
    public void verify_messages_get() {

        RequestBuilder builder = new RequestBuilder();
        JSONObject response = builder.performRequest("health_check");
        ResponseValidator validator = new ResponseValidator(response);
        validator.statusCodeShouldBe(200);
        String msg = validator.getDataFromBody("$.payload");
        assertThat(msg).isNotBlank();
    }
}



