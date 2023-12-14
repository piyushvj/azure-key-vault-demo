package piyush.azure.azurekeyvaultdemo.config;

import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.security.keyvault.secrets.SecretClient;
import com.azure.security.keyvault.secrets.SecretClientBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SecretClientConfig {

//    https://piyushvj-spring-function.azurewebsites.net

    @Value("${vault.url}")
    private String vaultUrl;

    @Bean
    public SecretClient getSecretClient() {
        System.out.println("vault url : " + vaultUrl);
        return new SecretClientBuilder().vaultUrl(vaultUrl).credential(new DefaultAzureCredentialBuilder().build()).buildClient();
    }
}
