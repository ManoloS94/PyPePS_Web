package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import controladores.Usuarios;

@SpringBootApplication
public class PyPePsWebVeterinariaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Usuarios.class, args);//Iniciamos la aplicacion en la clase Usuarios
	}

}
