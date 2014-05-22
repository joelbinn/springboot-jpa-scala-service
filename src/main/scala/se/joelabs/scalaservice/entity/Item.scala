package se.joelabs.scalaservice.entity

import javax.persistence.{GenerationType, GeneratedValue, Id, Entity}
import scala.beans.BeanProperty

/*
 * User: joel
 * Date: 2014-05-23
 * Time: 00:21
 */
@Entity
class Item(d: String) {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @BeanProperty
  var id: java.lang.Long = _

  @BeanProperty
  var descr: String = _

  def this() = this(null)
}
