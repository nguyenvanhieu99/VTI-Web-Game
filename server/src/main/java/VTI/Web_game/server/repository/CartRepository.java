package VTI.Web_game.server.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import VTI.Web_game.server.model.entity.Cart;

@Repository
public interface CartRepository extends CrudRepository<Cart, Long> {
}
