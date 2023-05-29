package nl.stjaris.reportsender.config;

import nl.stjaris.generated.home_wizard.ApiClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ApiClientConfig {

  @Value("${app.address}")
  private String basePath;

  @Bean
  public ApiClient createNewApiClient() {
    ApiClient apiClient = new ApiClient();
    apiClient.setBasePath(basePath);

    return apiClient;
  }

}
