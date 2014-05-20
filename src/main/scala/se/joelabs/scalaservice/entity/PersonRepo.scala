/*
 * User: joel
 * Date: 2014-05-20
 * Time: 22:27
 */
package se.joelabs.scalaservice.entity

import org.springframework.data.repository.CrudRepository

/**
 * A repository of person entities.
 */
trait PersonRepo extends CrudRepository[Person, java.lang.Long] {
  def findByName(lastName: String): List[Person]
  def findById(id: java.lang.Long): Person
}
