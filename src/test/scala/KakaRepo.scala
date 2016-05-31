import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RepositoryRestResource

/**
 * A repository of kaka entities.
 */
@RepositoryRestResource(collectionResourceRel = "kakor", path = "kakor")
trait KakaRepo extends PagingAndSortingRepository[Kaka, java.lang.Long] {

  def findByColor(@Param("color") color: String): java.util.List[Kaka]

  def findById(id: java.lang.Long): Kaka
}
