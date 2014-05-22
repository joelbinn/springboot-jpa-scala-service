package se.joelabs.scalaservice.entity

import javax.persistence._
import scala.beans.BeanProperty

/**
 * A person
 * @param n name
 * @param a address
 * @param i items
 */
@Entity
class Person(n: String, a: String, i: java.util.List[Item]) {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @BeanProperty
  var id: java.lang.Long = _

  @BeanProperty
  var name: String = n

  @BeanProperty
  var address: String = a

  @OneToMany(cascade = Array(CascadeType.ALL))
  @BeanProperty
  var items: java.util.List[Item] = _

  def this() = this(null, null, null)
}
