package se.joelabs.scalaservice

import com.fasterxml.jackson.databind.Module
import com.fasterxml.jackson.module.scala.DefaultScalaModule
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.{Bean, ComponentScan, Configuration}
import org.springframework.data.jpa.repository.config.EnableJpaRepositories


@ComponentScan
@Configuration
@EnableJpaRepositories
@EnableAutoConfiguration
class SampleConfig {
  @Bean
  def jacksonScalaModule(): Module = {
    DefaultScalaModule
  }
}

object WebApp extends App {
  SpringApplication.run(classOf[SampleConfig])
}


