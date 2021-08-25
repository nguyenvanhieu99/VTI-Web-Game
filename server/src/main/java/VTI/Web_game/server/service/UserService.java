package VTI.Web_game.server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import VTI.Web_game.server.model.entity.Role;
import VTI.Web_game.server.model.entity.User;
import VTI.Web_game.server.model.request.RegistrationRequest;
import VTI.Web_game.server.repository.RoleEntityRepository;
import VTI.Web_game.server.repository.UserEntityRepository;







@Service
public class UserService {

	@Autowired
	private UserEntityRepository userEntityRepository;
	@Autowired
	private RoleEntityRepository roleEntityRepository;
	@Autowired
	private PasswordEncoder passwordEncoder;

	public User saveUser(RegistrationRequest registrationRequest) {
		
		User userEntity = new User();
		userEntity.setPassword(registrationRequest.getPassword());
		userEntity.setLogin(registrationRequest.getLogin());

		Role userRole = roleEntityRepository.findByName(registrationRequest.getRole());
		if (userRole == null) {
			Role role = new Role();
			role.setName(registrationRequest.getRole());
			roleEntityRepository.save(role);
			userRole = roleEntityRepository.findByName(registrationRequest.getRole());
		}

		userEntity.setRoleEntity(userRole);
		
		userEntity.setPassword(passwordEncoder.encode(userEntity.getPassword()));
		return userEntityRepository.save(userEntity);
	}

	public User findByLogin(String login) {
		return userEntityRepository.findByLogin(login);
	}

	public User findByLoginAndPassword(String login, String password) {
		User userEntity = findByLogin(login);
		if (userEntity != null) {
			
			if (passwordEncoder.matches(password, userEntity.getPassword())) {
				return userEntity;
			}
		}
		return null;
	}
}
