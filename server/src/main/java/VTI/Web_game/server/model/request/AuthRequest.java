package VTI.Web_game.server.model.request;

import lombok.Data;

@Data
public class AuthRequest {
    private String login;
    private String password;
}
