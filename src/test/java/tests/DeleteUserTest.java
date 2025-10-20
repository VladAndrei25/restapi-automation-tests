package tests;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class DeleteUserTest {

    @Test
    void testDeleteUser() {
        given()
                .baseUri("https://reqres.in")
                .header("Content-Type", "application/json")
                .header("x-api-key", "reqres-free-v1")
                .when()
                .delete("/api/users/2")
                .then()
                .log().body()
                .statusCode(204);
    }
}
