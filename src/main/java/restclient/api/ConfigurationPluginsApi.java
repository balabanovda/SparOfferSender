package restclient.api;

import restclient.ApiClient;

import restclient.model.ResultModelOfPagedViewModelOfConfigurationPluginViewModel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
@Component("restclient.api.ConfigurationPluginsApi")
public class ConfigurationPluginsApi {
    private ApiClient apiClient;

    public ConfigurationPluginsApi() {
        this(new ApiClient());
    }

    @Autowired
    public ConfigurationPluginsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Возвращает список всех плагинов.
     * 
     * <p><b>200</b> - OK
     * @param from С какого. (optional, default to 0)
     * @param count Сколько. (optional, default to 10)
     * @param filterPluginSubstring Подстрока для поиска по названию плагина. (optional)
     * @param filterDeployIdSubstring Подстрока для поиска по ID деплоя. (optional)
     * @return ResultModelOfPagedViewModelOfConfigurationPluginViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfConfigurationPluginViewModel configurationPluginsGetPlugins(Integer from, Integer count, String filterPluginSubstring, String filterDeployIdSubstring) throws RestClientException {
        return configurationPluginsGetPluginsWithHttpInfo(from, count, filterPluginSubstring, filterDeployIdSubstring).getBody();
    }

    /**
     * Возвращает список всех плагинов.
     * 
     * <p><b>200</b> - OK
     * @param from С какого. (optional, default to 0)
     * @param count Сколько. (optional, default to 10)
     * @param filterPluginSubstring Подстрока для поиска по названию плагина. (optional)
     * @param filterDeployIdSubstring Подстрока для поиска по ID деплоя. (optional)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfConfigurationPluginViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfConfigurationPluginViewModel> configurationPluginsGetPluginsWithHttpInfo(Integer from, Integer count, String filterPluginSubstring, String filterDeployIdSubstring) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/configurationPlugins").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.pluginSubstring", filterPluginSubstring));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.deployIdSubstring", filterDeployIdSubstring));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfConfigurationPluginViewModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfConfigurationPluginViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
