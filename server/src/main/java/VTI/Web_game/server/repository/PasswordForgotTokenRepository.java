package VTI.Web_game.server.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import VTI.Web_game.server.model.entity.PasswordForgotToken;
import VTI.Web_game.server.model.entity.User;

import java.util.Optional;

@Repository
public interface PasswordForgotTokenRepository extends CrudRepository<PasswordForgotToken, Long> {
    Optional<PasswordForgotToken> findByToken(String token);

    Optional<PasswordForgotToken> findByUser(User user);
}
