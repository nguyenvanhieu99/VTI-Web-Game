package VTI.Web_game.server.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import VTI.Web_game.server.model.entity.User;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findByEmail(String email);

    Boolean existsByEmail(String email);
}
