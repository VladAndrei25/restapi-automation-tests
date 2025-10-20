package tests;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class UpdateUserTest {

    @Test
    public void testUpdateUser() {
        String requestBody = """
        {
          "name": "Vlad",
          "job": "junior software engineer"
        }
        """;

        given()
                .baseUri("https://reqres.in")
                .header("Content-Type", "application/json")
                .header("x-api-key", "reqres-free-v1")
                .body(requestBody)
                .when()
                .put("/api/users/2")
                .then()
                .statusCode(200)
                .body("name", equalTo("Vlad"))
                .body("job", equalTo("junior software engineer"))
                .body("updatedAt", notNullValue());
    }
}
