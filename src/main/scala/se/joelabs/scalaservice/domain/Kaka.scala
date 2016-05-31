package se.joelabs.scalaservice.domain

import javax.persistence._

import scala.annotation.meta.field

@Entity
@Table(name = "KAKA")
case class Kaka
(

  @(Id@field)
  @(GeneratedValue@field)
  @(Column@field)(name = "PK")
  id: Long = null.asInstanceOf[Long],

  @(Column@field)(name = "COLOR")
  color: String = null

) {
  def this() = this(null.asInstanceOf[Long], null)
}
