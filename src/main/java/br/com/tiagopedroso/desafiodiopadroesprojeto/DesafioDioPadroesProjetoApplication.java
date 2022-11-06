package br.com.tiagopedroso.desafiodiopadroesprojeto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class DesafioDioPadroesProjetoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioDioPadroesProjetoApplication.class, args);
	}

}
