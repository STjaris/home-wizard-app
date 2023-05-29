package nl.stjaris.reportsender.service;

import lombok.RequiredArgsConstructor;
import nl.stjaris.generated.home_wizard.ApiClient;
import nl.stjaris.generated.home_wizard.api.DefaultApi;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DataRetrievalService {

  private final ApiClient apiClient;
  private final DefaultApi api;

  public void retrieveData() {
    api.setApiClient(apiClient);

    api.apiV1DataGet();

  }
}
