package org.agoncal.quarkus.microservices.number;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;
import org.eclipse.microprofile.openapi.annotations.ExternalDocumentation;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@ApplicationPath("/")
@OpenAPIDefinition(
        info = @Info(title = "Number Microservice",
        description = "This microservice generates ISBN numbers",
        version = "1.0.0",
        contact = @Contact(name = "Emanuel G.", url = "https://www.linkedin.com/in/emanuel-georgi-0a012a381/")),
        externalDocs = @ExternalDocumentation(url = "https://github.com/GeorgiEmanuel/Quarkus-Microservices", description = "All the microservices code"),
        tags = {
                @Tag(name = "api", description = "Public API that can be used by anybody"),
                @Tag(name = "numbers", description = "Endpoints related to numbers")
        }

)
public class NumberMicroservice extends Application {
}
