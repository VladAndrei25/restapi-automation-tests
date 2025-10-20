package tests;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

public class GetUsersTest {
    @Test
    public void testGetUsers(){
        RestAssured.baseURI = "https://reqres.in";

        given()
                .header("Content-Type", "applcation/json")
                .header("x-api-key", "reqres-free-v1")
                .when()
                .get("/api/users?page=2")
                .then()
                .statusCode(200)
                .body("data.size()", equalTo(6))
                .body("data.email[0]", containsString("@reqres.in"));
    }
}
