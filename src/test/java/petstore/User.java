package petstore;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.Data;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

public class User {
    String uri = "https://petstore.swagger.io/v2/user";
    Data data;

    // 3.2 - Métodos e Funções
    //public String lerJson(String caminhoJson) throws IOException {
    //    return new String(Files.readAllBytes(Paths.get(caminhoJson)));
    //}

    @BeforeMethod
    public void setup(){
        data = new Data();
    }

    @Test
    public void incluirUsuario() throws IOException {
        String jsonBody = data.lerJson("db/user1.json");

        String userId =

        given() // Dado que
              .contentType("application/json")
              .log().all()
              .body(jsonBody)
        .when() // Quando
                .post(uri)
        .then() // Então
                .log().all()
                .statusCode(200)
                .body("code", is(200))
                .body("type", is("unknown"))
        .extract()
                .path("message")
        ;

        System.out.println("O userId é " + userId);
    }
}
