package VTI.Web_game.server.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import VTI.Web_game.server.model.entity.User;



public interface UserEntityRepository extends JpaRepository<User, Integer> {

    User findByLogin(String login);
}
