package org.agoncal.quarkus.microservices.book;

import jakarta.json.bind.annotation.JsonbProperty;

public class IsbnThirteen {

    @JsonbProperty("ISBN_13")
    public String isbn13;
}
