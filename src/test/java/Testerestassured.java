import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class Testerestassured {
    String urlapi = "https://reqres.in/api/users?page=1";
    @Test
    public void testeConexaoApinoRestAssured(){
             Response response = get(urlapi);
             int statusCode = response.getStatusCode();
             Assertions.assertEquals(statusCode,200);

    }
    @Test
    public void testeVerificacaodeDadosApinoRestAssured(){
        given()
                .get(urlapi)
                .then()
                .statusCode(200)
                .body("data.first_name[0]",equalTo("George"));
    }

}
