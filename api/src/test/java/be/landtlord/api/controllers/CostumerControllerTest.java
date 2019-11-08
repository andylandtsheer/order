package be.landtlord.api.controllers;

import be.landtlord.service.mappers.CustomerDTO;
import io.restassured.http.ContentType;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;

import static io.restassured.RestAssured.given;

@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.DEFINED_PORT)
class CostumerControllerTest {
    private static String ROOT_URI = "http://localhost:8080/order/";


    @Test
    void testCreateUserHappyPath() {
        CustomerDTO response = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body("{\"firstName\": \"Andy\", \"lastName\": \"Landtsheer\", \"email\": \"andy.landtsheer@email.be\",\"adress\": \"adress\", \"phoneNumber\": \"012/345678\"}")
                .when()
                .post(ROOT_URI + "customer")
                .then()
                .assertThat()
                .statusCode(HttpStatus.CREATED.value())
                .extract()
                .body()
                .as(CustomerDTO.class);

        Assertions.assertThat(response.getId()).isNotNull();
        Assertions.assertThat(response.getLastName()).isEqualTo("Landtsheer");
        Assertions.assertThat(response.getFirstName()).isEqualTo("Andy");
        Assertions.assertThat(response.getEmail()).isEqualTo("andy.landtsheer@email.be");
        Assertions.assertThat(response.getAdress()).isEqualTo("adress");
        Assertions.assertThat(response.getPhoneNumber()).isEqualTo("012/345678");

    }
}