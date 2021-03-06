package VTI.Web_game.server.model.request;

import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Data
public class RegistrationRequest {

	@NotEmpty
	private String login;

	@NotEmpty
	private String password;

	@NotEmpty
	private String role;
}
