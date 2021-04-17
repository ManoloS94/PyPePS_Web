package modelos;

import org.springframework.data.repository.CrudRepository;

import modelos.datos.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Integer> {

	boolean exists(User n);
		
}
