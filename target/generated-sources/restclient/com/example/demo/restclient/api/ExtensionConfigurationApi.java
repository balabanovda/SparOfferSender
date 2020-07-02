package com.example.demo.restclient.api;

import com.example.demo.restclient.ApiClient;

import com.example.demo.restclient.model.ExtensionConfigurationViewModel;
import com.example.demo.restclient.model.ResultModel;
import com.example.demo.restclient.model.ResultModelOfExtensionConfigurationViewModel;
import com.example.demo.restclient.model.ResultModelOfInt32;
import com.example.demo.restclient.model.ResultModelOfPagedViewModelOfExtensionConfigurationViewModel;

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
@Component("com.example.demo.restclient.api.ExtensionConfigurationApi")
public class ExtensionConfigurationApi {
    private ApiClient apiClient;

    public ExtensionConfigurationApi() {
        this(new ApiClient());
    }

    @Autowired
    public ExtensionConfigurationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Создать новый параметр конфигурации плагина.
     * 
     * <p><b>201</b> - Created
     * @param extensionId Id плагина. (required)
     * @param model Модель конфигурации. (required)
     * @return ResultModelOfInt32
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfInt32 extensionConfigurationCreateExtensionConfiguration(Integer extensionId, ExtensionConfigurationViewModel model) throws RestClientException {
        return extensionConfigurationCreateExtensionConfigurationWithHttpInfo(extensionId, model).getBody();
    }

    /**
     * Создать новый параметр конфигурации плагина.
     * 
     * <p><b>201</b> - Created
     * @param extensionId Id плагина. (required)
     * @param model Модель конфигурации. (required)
     * @return ResponseEntity&lt;ResultModelOfInt32&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfInt32> extensionConfigurationCreateExtensionConfigurationWithHttpInfo(Integer extensionId, ExtensionConfigurationViewModel model) throws RestClientException {
        Object postBody = model;
        
        // verify the required parameter 'extensionId' is set
        if (extensionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'extensionId' when calling extensionConfigurationCreateExtensionConfiguration");
        }
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling extensionConfigurationCreateExtensionConfiguration");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("extensionId", extensionId);
        String path = UriComponentsBuilder.fromPath("/api/extensions/{extensionId}/configurations").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/x-www-form-urlencoded", "application/json", "text/json", "application/xml", "text/xml"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfInt32> returnType = new ParameterizedTypeReference<ResultModelOfInt32>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Удалить конфигурацию плагина по ID.
     * 
     * <p><b>200</b> - OK
     * @param extensionId Id плагина. (required)
     * @param id Id. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel extensionConfigurationDelete(Integer extensionId, Integer id) throws RestClientException {
        return extensionConfigurationDeleteWithHttpInfo(extensionId, id).getBody();
    }

    /**
     * Удалить конфигурацию плагина по ID.
     * 
     * <p><b>200</b> - OK
     * @param extensionId Id плагина. (required)
     * @param id Id. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> extensionConfigurationDeleteWithHttpInfo(Integer extensionId, Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'extensionId' is set
        if (extensionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'extensionId' when calling extensionConfigurationDelete");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling extensionConfigurationDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("extensionId", extensionId);
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/extensions/{extensionId}/configurations/{id}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModel> returnType = new ParameterizedTypeReference<ResultModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить конфигурацию плагина по его ID.
     * 
     * <p><b>200</b> - OK
     * @param extensionId Id плагина. (required)
     * @param from Начало выборки. (optional, default to 0)
     * @param count Количество. (optional, default to 10)
     * @param filterSearchedKey Ключ. (optional)
     * @param filterSearchedValue Значение. (optional)
     * @return ResultModelOfPagedViewModelOfExtensionConfigurationViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfExtensionConfigurationViewModel extensionConfigurationGetByExtensionId(Integer extensionId, Integer from, Integer count, String filterSearchedKey, String filterSearchedValue) throws RestClientException {
        return extensionConfigurationGetByExtensionIdWithHttpInfo(extensionId, from, count, filterSearchedKey, filterSearchedValue).getBody();
    }

    /**
     * Получить конфигурацию плагина по его ID.
     * 
     * <p><b>200</b> - OK
     * @param extensionId Id плагина. (required)
     * @param from Начало выборки. (optional, default to 0)
     * @param count Количество. (optional, default to 10)
     * @param filterSearchedKey Ключ. (optional)
     * @param filterSearchedValue Значение. (optional)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfExtensionConfigurationViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfExtensionConfigurationViewModel> extensionConfigurationGetByExtensionIdWithHttpInfo(Integer extensionId, Integer from, Integer count, String filterSearchedKey, String filterSearchedValue) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'extensionId' is set
        if (extensionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'extensionId' when calling extensionConfigurationGetByExtensionId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("extensionId", extensionId);
        String path = UriComponentsBuilder.fromPath("/api/extensions/{extensionId}/configurations").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.searchedKey", filterSearchedKey));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.searchedValue", filterSearchedValue));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfExtensionConfigurationViewModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfExtensionConfigurationViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить конфигурацию плагина по ID.
     * 
     * <p><b>200</b> - OK
     * @param extensionId Id плагина. (required)
     * @param id Id. (required)
     * @return ResultModelOfExtensionConfigurationViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfExtensionConfigurationViewModel extensionConfigurationGetByExtensionIdAndKey(Integer extensionId, Integer id) throws RestClientException {
        return extensionConfigurationGetByExtensionIdAndKeyWithHttpInfo(extensionId, id).getBody();
    }

    /**
     * Получить конфигурацию плагина по ID.
     * 
     * <p><b>200</b> - OK
     * @param extensionId Id плагина. (required)
     * @param id Id. (required)
     * @return ResponseEntity&lt;ResultModelOfExtensionConfigurationViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfExtensionConfigurationViewModel> extensionConfigurationGetByExtensionIdAndKeyWithHttpInfo(Integer extensionId, Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'extensionId' is set
        if (extensionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'extensionId' when calling extensionConfigurationGetByExtensionIdAndKey");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling extensionConfigurationGetByExtensionIdAndKey");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("extensionId", extensionId);
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/extensions/{extensionId}/configurations/{id}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfExtensionConfigurationViewModel> returnType = new ParameterizedTypeReference<ResultModelOfExtensionConfigurationViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Редактирование конфигурации плагина по Id.
     * 
     * <p><b>200</b> - OK
     * @param extensionId Id плагина. (required)
     * @param id Id. (required)
     * @param model Модель конфигурации. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel extensionConfigurationUpdateExtensionConfiguration(Integer extensionId, Integer id, ExtensionConfigurationViewModel model) throws RestClientException {
        return extensionConfigurationUpdateExtensionConfigurationWithHttpInfo(extensionId, id, model).getBody();
    }

    /**
     * Редактирование конфигурации плагина по Id.
     * 
     * <p><b>200</b> - OK
     * @param extensionId Id плагина. (required)
     * @param id Id. (required)
     * @param model Модель конфигурации. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> extensionConfigurationUpdateExtensionConfigurationWithHttpInfo(Integer extensionId, Integer id, ExtensionConfigurationViewModel model) throws RestClientException {
        Object postBody = model;
        
        // verify the required parameter 'extensionId' is set
        if (extensionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'extensionId' when calling extensionConfigurationUpdateExtensionConfiguration");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling extensionConfigurationUpdateExtensionConfiguration");
        }
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling extensionConfigurationUpdateExtensionConfiguration");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("extensionId", extensionId);
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/extensions/{extensionId}/configurations/{id}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/x-www-form-urlencoded", "application/json", "text/json", "application/xml", "text/xml"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModel> returnType = new ParameterizedTypeReference<ResultModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
