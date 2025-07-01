package com.hammad.Command_snippet_API.Config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.info.Info;

import java.util.List;


// Swagger config file where you can configure different properties

@Configuration
public class SwaggerConfig {





    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .servers(List.of(new Server().url("https://commander-api.duckdns.org")))
                .info(new Info().title("Commander API")
                        .version("1.0")
                        .description("API documentation for managing command-line snippets."));

    }
}
