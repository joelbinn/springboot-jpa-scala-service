/*
 * User: joel
 * Date: 2014-05-23
 * Time: 00:04
 */
package se.joelabs.scalaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

/**
 * Spring boot application
 */

@ComponentScan
@Configuration
@EnableJpaRepositories
@Import(RepositoryRestMvcConfiguration.class)
@EnableAutoConfiguration
public class SpringApp {
    public static void main(String[] args) {
        SpringApplication.run(SpringApp.class, args);
    }
}


