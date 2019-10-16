package aula01_spring_mvc_boot_exercise.pooa.aula01_spring_mvc_boot_exercise.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import aula01_spring_mvc_boot_exercise.pooa.aula01_spring_mvc_boot_exercise.model.utils.Calculadora;

@Configuration
public class AppConfig {
	
	@Bean
	public Calculadora getCalcudora() {
		return new Calculadora();
	}

}
