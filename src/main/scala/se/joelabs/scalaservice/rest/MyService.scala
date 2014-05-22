package se.joelabs.scalaservice.rest

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation._
import org.springframework.beans.factory.annotation.Autowired
import se.joelabs.scalaservice.entity.{Person, PersonRepo}

/**
 * The REST resource.
 * @param repo entity repo
 */
@Controller
class MyService @Autowired() (private val repo: PersonRepo) {

  @RequestMapping(value = Array("/hej/{name}"), method = Array(RequestMethod.GET), produces = Array("text/plain"))
  @ResponseBody
  def hello(@PathVariable name: String) = s"Hej $name! My repo is $repo"

  @RequestMapping(value = Array("/person/{name}"), method = Array(RequestMethod.POST), produces = Array("text/plain"))
  @ResponseBody
  def savePerson(@PathVariable name: String) = {
    val person = new Person
    person.name = name
    repo.save(person)
    s"Saved Person: ${person.name} with ID: ${person.id}!"
  }

  @RequestMapping(value = Array("/person/{id}"), method = Array(RequestMethod.GET), produces = Array("text/plain"))
  @ResponseBody
  def getPersonById(@PathVariable id: Long) = {
    val person = repo.findById(id)
    s"Person ($id)\n  name: ${person.name}\n  address: ${person.address}"
  }

  @RequestMapping(value = Array("/person/{id}"), method = Array(RequestMethod.PUT), produces = Array("text/plain"))
  @ResponseBody
  def updatePersonAddress(@PathVariable id: Long, @RequestParam address: String) = {
    var person = repo.findById(id)
    person.address = address
    person = repo.save(person)
    s"Person ($id): ${person.name} new address: ${person.address}"
  }

}

