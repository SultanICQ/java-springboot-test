package es.davidgarcia.javaspringtest.saying.controller;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class SayingGetControllerTest {

    @Test
    public void saying_healthcheck_returns_ok() {
        when().
                get("/api/saying/").
                then().
                statusCode(200).
                body("status", equalTo("ok"));
    }

}
