package com.example.aula;

import java.util.Optional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AulaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AulaApplication.class, args);
	}

	@Bean
	CommandLineRunner executar (ClienteRepository repositorio){
		return args -> {
			repositorio.deleteAll();

			Cliente ana = repositorio.save(new Cliente("Ana"));
			repositorio.save(new Cliente("Carlos"));

			Optional<Cliente> encontrado = repositorio.findById(ana.getId());
			encontrado.ifPresent(cliente -> 
				System.out.println(cliente.getId() + " - " + cliente.getNome())
			);

			ana.setNome("Ana Paula");
			repositorio.save(ana);

			repositorio.deleteById(ana.getId());

			repositorio.findAll().forEach(cliente ->
				System.out.println(cliente.getId() + " - " + cliente.getNome())
			);
		};
	}
}
