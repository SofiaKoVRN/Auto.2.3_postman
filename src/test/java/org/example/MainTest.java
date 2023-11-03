package org.example;

import io.restassured.RestAssured;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    public void MobileBankApiTestV7() {
        // Given - When - Then
        // Предусловия
        RestAssured.given()
                .log().all()
                .baseUri("https://postman-echo.com")
                .body("some data") // отправляемые данные (заголовки и query можно выставлять аналогично)
                // Выполняемые действия
                .when()
                .post("/post")
                .prettyPeek()
                // Проверки
                .then()
                .statusCode(200)
                .body("data", Matchers.equalTo("some data"))
        ;
    }
}
