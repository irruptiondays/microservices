package demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 * Created by TValentine on 10/6/15.
 */
@RestResource(path = "player", rel = "player")
public interface PlayerRepository extends CrudRepository<Player, Long> {

}
