package VTI.Web_game.server.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import VTI.Web_game.server.model.entity.Color;

@Repository
public interface ColorRepository extends JpaRepository<Color, Long> {
}
