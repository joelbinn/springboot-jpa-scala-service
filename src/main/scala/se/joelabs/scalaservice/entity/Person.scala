package se.joelabs.scalaservice.entity

import javax.persistence.{GenerationType, GeneratedValue, Id, Entity}
import scala.beans.BeanProperty

/**
 * A person
 * @param n name
 * @param a address
 */
@Entity
class Person(n: String, a: String) {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @BeanProperty
  var id: java.lang.Long = _

  @BeanProperty
  var name: String = n

  @BeanProperty
  var address: String = a

  def this() = this(null, null)
}
