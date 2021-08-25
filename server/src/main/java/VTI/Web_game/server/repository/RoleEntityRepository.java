package VTI.Web_game.server.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import VTI.Web_game.server.model.entity.Role;



public interface RoleEntityRepository extends JpaRepository<Role, Integer> {

    Role findByName(String name);
}
