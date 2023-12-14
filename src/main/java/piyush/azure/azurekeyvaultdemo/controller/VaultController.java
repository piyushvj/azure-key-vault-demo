package piyush.azure.azurekeyvaultdemo.controller;

import com.azure.security.keyvault.secrets.SecretClient;
import com.azure.security.keyvault.secrets.models.KeyVaultSecret;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class VaultController {

    @Autowired
    private SecretClient secretClient;

    @GetMapping("/getSecretValue/{key}")
    public String getSecretValue(@PathVariable("key") String key) {
        KeyVaultSecret secret = secretClient.getSecret(key);
        System.out.println("id " + secret.getId());
        System.out.println("Name " + secret.getName());
        System.out.println("Value " + secret.getValue());

        return secret.getValue();
    }
}
