package restclient.api;

import restclient.ApiClient;

import java.time.OffsetDateTime;
import restclient.model.ResultModelOfConfigurationDeployViewModel;
import restclient.model.ResultModelOfPagedViewModelOfConfigurationDeployViewModel;
import java.util.UUID;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
@Component("restclient.api.ConfigurationDeploysApi")
public class ConfigurationDeploysApi {
    private ApiClient apiClient;

    public ConfigurationDeploysApi() {
        this(new ApiClient());
    }

    @Autowired
    public ConfigurationDeploysApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Получение описания деплоя.
     * 
     * <p><b>200</b> - OK
     * @param externalId Внешний дентификатор деплоя. (required)
     * @return ResultModelOfConfigurationDeployViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfConfigurationDeployViewModel configurationDeploysGetDeployInfo(UUID externalId) throws RestClientException {
        return configurationDeploysGetDeployInfoWithHttpInfo(externalId).getBody();
    }

    /**
     * Получение описания деплоя.
     * 
     * <p><b>200</b> - OK
     * @param externalId Внешний дентификатор деплоя. (required)
     * @return ResponseEntity&lt;ResultModelOfConfigurationDeployViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfConfigurationDeployViewModel> configurationDeploysGetDeployInfoWithHttpInfo(UUID externalId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'externalId' is set
        if (externalId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'externalId' when calling configurationDeploysGetDeployInfo");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("externalId", externalId);
        String path = UriComponentsBuilder.fromPath("/api/configurationDeploys/{externalId}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfConfigurationDeployViewModel> returnType = new ParameterizedTypeReference<ResultModelOfConfigurationDeployViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Возвращает список всех деплоев.
     * 
     * <p><b>200</b> - OK
     * @param from С какого. (optional, default to 0)
     * @param count Сколько. (optional, default to 10)
     * @param filterFromDate Дата С. (optional)
     * @param filterToDate Дата По. (optional)
     * @param filterPackageVersionSubstring Подстрока для поиска по версионности. (optional)
     * @param filterIsSuccess Успешность выполнения. (optional)
     * @param filterAuthorSubstring Подстрока для поиска по автору. (optional)
     * @param filterExternalId Внешний идентификатор. (optional)
     * @return ResultModelOfPagedViewModelOfConfigurationDeployViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfConfigurationDeployViewModel configurationDeploysGetDeploys(Integer from, Integer count, OffsetDateTime filterFromDate, OffsetDateTime filterToDate, String filterPackageVersionSubstring, Boolean filterIsSuccess, String filterAuthorSubstring, UUID filterExternalId) throws RestClientException {
        return configurationDeploysGetDeploysWithHttpInfo(from, count, filterFromDate, filterToDate, filterPackageVersionSubstring, filterIsSuccess, filterAuthorSubstring, filterExternalId).getBody();
    }

    /**
     * Возвращает список всех деплоев.
     * 
     * <p><b>200</b> - OK
     * @param from С какого. (optional, default to 0)
     * @param count Сколько. (optional, default to 10)
     * @param filterFromDate Дата С. (optional)
     * @param filterToDate Дата По. (optional)
     * @param filterPackageVersionSubstring Подстрока для поиска по версионности. (optional)
     * @param filterIsSuccess Успешность выполнения. (optional)
     * @param filterAuthorSubstring Подстрока для поиска по автору. (optional)
     * @param filterExternalId Внешний идентификатор. (optional)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfConfigurationDeployViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfConfigurationDeployViewModel> configurationDeploysGetDeploysWithHttpInfo(Integer from, Integer count, OffsetDateTime filterFromDate, OffsetDateTime filterToDate, String filterPackageVersionSubstring, Boolean filterIsSuccess, String filterAuthorSubstring, UUID filterExternalId) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/configurationDeploys").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.fromDate", filterFromDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.toDate", filterToDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.packageVersionSubstring", filterPackageVersionSubstring));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.isSuccess", filterIsSuccess));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.authorSubstring", filterAuthorSubstring));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.externalId", filterExternalId));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfConfigurationDeployViewModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfConfigurationDeployViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
