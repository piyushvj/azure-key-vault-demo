package piyush.azure.azurekeyvaultdemo;

import lombok.AllArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@AllArgsConstructor
public class AzureKeyVaultDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AzureKeyVaultDemoApplication.class, args);
	}

}
