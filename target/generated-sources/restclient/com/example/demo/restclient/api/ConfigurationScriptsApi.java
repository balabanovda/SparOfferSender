package com.example.demo.restclient.api;

import com.example.demo.restclient.ApiClient;

import java.time.OffsetDateTime;
import com.example.demo.restclient.model.ResultModelOfPagedViewModelOfConfigurationScriptViewModel;
import java.util.UUID;

import java.util.ArrayList;
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
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
@Component("com.example.demo.restclient.api.ConfigurationScriptsApi")
public class ConfigurationScriptsApi {
    private ApiClient apiClient;

    public ConfigurationScriptsApi() {
        this(new ApiClient());
    }

    @Autowired
    public ConfigurationScriptsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Возвращает доступные БД.
     * 
     * <p><b>200</b> - OK
     * @return List&lt;String&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<String> configurationScriptsGetDbNames() throws RestClientException {
        return configurationScriptsGetDbNamesWithHttpInfo().getBody();
    }

    /**
     * Возвращает доступные БД.
     * 
     * <p><b>200</b> - OK
     * @return ResponseEntity&lt;List&lt;String&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<String>> configurationScriptsGetDbNamesWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/configurationScripts/availableDatabases").build().toUriString();

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

        ParameterizedTypeReference<List<String>> returnType = new ParameterizedTypeReference<List<String>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Возвращает список всех скриптов.
     * 
     * <p><b>200</b> - OK
     * @param from С какого. (optional, default to 0)
     * @param count Сколько. (optional, default to 10)
     * @param filterFromDate Дата С. (optional)
     * @param filterToDate Дата По. (optional)
     * @param filterIdSubstring Подстрока для поиска по идентификатору. (optional)
     * @param filterDescriptionSubstring Подстрока для поиска по описание. (optional)
     * @param filterConfigDeployId Идентификатор деплоя. (optional)
     * @param filterName Наименование БД. (optional)
     * @return ResultModelOfPagedViewModelOfConfigurationScriptViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfConfigurationScriptViewModel configurationScriptsGetScripts(Integer from, Integer count, OffsetDateTime filterFromDate, OffsetDateTime filterToDate, String filterIdSubstring, String filterDescriptionSubstring, UUID filterConfigDeployId, String filterName) throws RestClientException {
        return configurationScriptsGetScriptsWithHttpInfo(from, count, filterFromDate, filterToDate, filterIdSubstring, filterDescriptionSubstring, filterConfigDeployId, filterName).getBody();
    }

    /**
     * Возвращает список всех скриптов.
     * 
     * <p><b>200</b> - OK
     * @param from С какого. (optional, default to 0)
     * @param count Сколько. (optional, default to 10)
     * @param filterFromDate Дата С. (optional)
     * @param filterToDate Дата По. (optional)
     * @param filterIdSubstring Подстрока для поиска по идентификатору. (optional)
     * @param filterDescriptionSubstring Подстрока для поиска по описание. (optional)
     * @param filterConfigDeployId Идентификатор деплоя. (optional)
     * @param filterName Наименование БД. (optional)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfConfigurationScriptViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfConfigurationScriptViewModel> configurationScriptsGetScriptsWithHttpInfo(Integer from, Integer count, OffsetDateTime filterFromDate, OffsetDateTime filterToDate, String filterIdSubstring, String filterDescriptionSubstring, UUID filterConfigDeployId, String filterName) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/configurationScripts").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.fromDate", filterFromDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.toDate", filterToDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.idSubstring", filterIdSubstring));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.descriptionSubstring", filterDescriptionSubstring));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.configDeployId", filterConfigDeployId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.name", filterName));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfConfigurationScriptViewModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfConfigurationScriptViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
