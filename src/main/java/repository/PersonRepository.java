package repository;

import java.util.List;

import model.Person;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

//@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface PersonRepository extends
		PagingAndSortingRepository<Person, Long> {

	List<Person> findByLastName(@Param("name") String name);

}
