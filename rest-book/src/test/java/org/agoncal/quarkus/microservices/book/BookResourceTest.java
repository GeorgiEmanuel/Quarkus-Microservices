package org.agoncal.quarkus.microservices.book;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.startsWith;

@QuarkusTest
class BookResourceTest {
    @Test
    void shouldCreateABook() {
        given()
                .formParam("title", "Understanding Quarkus")
                .formParam("author", "Antonio")
                .formParam("year", 2021)
                .formParam("genre", "IT").
        when()
                .post("/api/books").
        then()
                .statusCode(201)
                .body("ISBN_13", startsWith("13-"))
                .body("title", is("Understanding Quarkus"))
                .body("author", is("Antonio"))
                .body("year_of_publication", is(2021))
                .body("genre", is("IT"))
                .body("creation_date", startsWith("20"));

    }

}