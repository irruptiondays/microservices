package demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 * Created by TValentine on 10/6/15.
 */
@RestResource(path = "teams", rel="teams")
public interface TeamRepository extends CrudRepository<Team, Long> {
}
