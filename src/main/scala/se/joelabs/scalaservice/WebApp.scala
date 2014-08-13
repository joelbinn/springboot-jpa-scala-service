package se.joelabs.scalaservice

import org.springframework.context.annotation.{Import, Configuration, ComponentScan}
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.SpringApplication
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

/*
@ComponentScan
@Configuration
@EnableJpaRepositories
@Import(value = Array(classOf[RepositoryRestMvcConfiguration]))
@EnableAutoConfiguration
class Config

object WebApp extends App {
  SpringApplication.run(classOf[Config])
}
*/

