package tests;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class CreateUserTest {

    @Test
    public void testCreateUser() {
        RestAssured.baseURI = "https://reqres.in";

        String requestBody = """
        {
            "name": "Vlad",
            "job": "software engineer"
        }
        """;

        given()
                .header("Content-Type", "application/json")
                .header("x-api-key", "reqres-free-v1")
                .body(requestBody)
                .when()
                .post("/api/users")
                .then()
                .statusCode(201)
                .body("name", equalTo("Vlad"))
                .body("job", equalTo("software engineer"))
                .body("id", notNullValue())
                .body("createdAt", notNullValue());
    }
}
