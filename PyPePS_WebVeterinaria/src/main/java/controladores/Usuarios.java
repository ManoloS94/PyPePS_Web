package controladores;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import modelos.UserRepository;
import modelos.datos.User;

@Controller // Indicamos a Spring que la clase es un controlador.
@RequestMapping(path="/users") //  URL a la que se mandarán las peticiones.
public class Usuarios {
  @Autowired //Spring crea y gestiona automaticamente un modelo de usuarios como si fuese un bean.
  private UserRepository userRepository;
  private Session session;

  @PostMapping(path="/add") // La etiqueta PostMapping le indica a la app que solo procese peticiones POST
  public @ResponseBody String addNewUser (@RequestParam String name, @RequestParam String sname1, @RequestParam String sname2, @RequestParam String email, @RequestParam Date bdate, @RequestParam String tlf, @RequestParam String pass) {
    // @ResponseBody indica que la respuesta es un objeto (body)
    // @RequestParam es un parametro de la petición.
	//TODO comprobar datos de entrada.
    //TODO Comprobar si existe
    User n = new User(name, sname1, sname2, email, bdate, tlf, true);
    userRepository.save(n);//Guardamos al nuevo usuario
    return "Saved";
  }
  
  @GetMapping(path="/login") //Para iniciar la sesion del usuario
  public @ResponseBody boolean userLogin (@RequestParam String name, @RequestParam String email) {
	  //TODO comprobar datos de entrada.
	    User n = new User();
	    n.setName(name);
	    n.setEmail(email);
	    session.startSession();
	    return userRepository.exists(n);
  }
  
  @GetMapping(path="/logout") //Para cerrar la sesion del usuario
  public @ResponseBody boolean userLogin () {
	    try {
	    	session.closeSession();
		    return true;
	    }catch(Error e) {
		    return false;
	    }
  }
  
  @GetMapping(path="/forgot") //Para recuperar la contraseña
  public @ResponseBody Iterable<User> forgotPass() {
    return userRepository.findAll();
  }

  //Dentro de la URL /users tenemos distintas sub-direcciones, cada una de ellas una acción distinta
  @GetMapping(path="/all") //PARA TESTEO, ELEMININAR AL DESPLIEGUE
  public @ResponseBody Iterable<User> getAllUsers() {
    // Devuelve un JSON con un listado de usuarios
    return userRepository.findAll();
  }
}