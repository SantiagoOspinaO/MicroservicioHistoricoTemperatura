package co.com.swiii.registrotemperatura.historicotemperatura;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
public class HistoricotemperaturaApplication {

	public static void main(String[] args) {
		SpringApplication.run(HistoricotemperaturaApplication.class, args);
	}

}
