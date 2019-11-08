package be.landtlord.api.controllers;

import be.landtlord.service.mappers.CostumerDTO;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;

import static io.restassured.RestAssured.given;

class CostumerControllerTest {
    private static String ROOT_URI = "http://localhost/order";

    @BeforeEach
    void setUp() {
        RestAssured.baseURI = "http://localhost/order";
        RestAssured.port = 8080;
    }

    @Test
    void testCreateUserHappyPath() {
        CostumerDTO response = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body("{\"firstName\": \"Andy\", \"lastName\": \"Landtsheer\", \"eMail\": \"andy.landtsheer@email.be\", \"adress\": \"adress\", \"phoneNumber\": \"012/345678\"")
                .when()
                .post(ROOT_URI + "/Customer")
                .then()
                .assertThat()
                .statusCode(HttpStatus.CREATED.value())
                .extract()
                .body()
                .as(CostumerDTO.class);


    }
}