package se.joelabs.scalaservice.entity

import javax.persistence.{GenerationType, GeneratedValue, Id, Entity}
import scala.beans.BeanProperty

/*
 * User: joel
 * Date: 2014-05-20
 * Time: 22:25
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
