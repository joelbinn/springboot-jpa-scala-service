package se.joelabs.scalaservice.domain

import org.scalamock.scalatest.MockFactory
import org.scalatest._


class KakaFeature extends FeatureSpec with GivenWhenThen with MockFactory with Matchers {

  info("As a developer")
  info("I want to be able to create JPA entities using scala case classes")
  info("So that I can leverage of the scala language features related to case classes")

  feature("Case classes as JPA entities") {
    scenario("Use case class in match statement") {

      Given("an entity exists")
      val kaka: Kaka = Kaka(color = "green")

      When("matching entity")
      val color = kaka match {
        case Kaka(_, c) =>
          c
        case _ =>
          "red"
      }

      Then("matching works")
      color shouldBe "green"
      kaka.color shouldEqual color
    }
  }
}
