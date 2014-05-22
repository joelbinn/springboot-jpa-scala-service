/*
 * User: joel
 * Date: 2014-05-20
 * Time: 22:27
 */
package se.joelabs.scalaservice.entity

import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import org.springframework.data.repository.query.Param

/**
 * A repository of person entities.
 */
@RepositoryRestResource(collectionResourceRel = "persons", path = "persons")
trait PersonRepo extends PagingAndSortingRepository[Person, java.lang.Long] {

  def findByName(@Param("name") name: String): java.util.List[Person]

  def findByNameStartingWith(@Param("name") name: String): java.util.List[Person]

  def findById(id: java.lang.Long): Person
}
