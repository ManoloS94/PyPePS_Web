package modelos;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import modelos.datos.User;

public interface ModeloUsuarios extends MongoRepository<User, String> {

	  public User findByFirstName(String name);
	  public List<User> findByLastName(String name);

}