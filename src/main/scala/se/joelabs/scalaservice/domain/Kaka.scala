package se.joelabs.scalaservice.domain

import javax.persistence._

@Entity
case class Kaka(_id: Long, _color: String) {
  def this() = this(null.asInstanceOf[Long],null)

  @Id
  @GeneratedValue
  @Column(name="ID")
  val id: Long = _id

  @Column(name = "COLOR")
  val color: String = _color
}
