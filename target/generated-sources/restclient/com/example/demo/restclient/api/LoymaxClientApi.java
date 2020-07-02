package com.example.demo.restclient.api;

import com.example.demo.restclient.ApiClient;

import com.example.demo.restclient.model.OAuthSettingsViewModelEx;
import com.example.demo.restclient.model.ResultModel;
import com.example.demo.restclient.model.ResultModelOfInt32;
import com.example.demo.restclient.model.ResultModelOfListOfClientObjectModel;
import com.example.demo.restclient.model.ResultModelOfListOfOAuthActivityType;
import com.example.demo.restclient.model.ResultModelOfOAuthSettings;
import com.example.demo.restclient.model.ResultModelOfPagedViewModelOfOAuthSettings;

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
@Component("com.example.demo.restclient.api.LoymaxClientApi")
public class LoymaxClientApi {
    private ApiClient apiClient;

    public LoymaxClientApi() {
        this(new ApiClient());
    }

    @Autowired
    public LoymaxClientApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Получает список доступных для отслеживания типов активности.
     * 
     * <p><b>200</b> - OK
     * @param provider Провайдер. (required)
     * @return ResultModelOfListOfOAuthActivityType
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfOAuthActivityType loymaxClientActivities(String provider) throws RestClientException {
        return loymaxClientActivitiesWithHttpInfo(provider).getBody();
    }

    /**
     * Получает список доступных для отслеживания типов активности.
     * 
     * <p><b>200</b> - OK
     * @param provider Провайдер. (required)
     * @return ResponseEntity&lt;ResultModelOfListOfOAuthActivityType&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfOAuthActivityType> loymaxClientActivitiesWithHttpInfo(String provider) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'provider' is set
        if (provider == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'provider' when calling loymaxClientActivities");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("provider", provider);
        String path = UriComponentsBuilder.fromPath("/api/OAuth/Clients/{provider}/Activities").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfListOfOAuthActivityType> returnType = new ParameterizedTypeReference<ResultModelOfListOfOAuthActivityType>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Создание OAuth клиента.
     * 
     * <p><b>201</b> - Created
     * @param clients Настройки доступа к OAuth сервису. (required)
     * @return ResultModelOfInt32
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfInt32 loymaxClientCreate(OAuthSettingsViewModelEx clients) throws RestClientException {
        return loymaxClientCreateWithHttpInfo(clients).getBody();
    }

    /**
     * Создание OAuth клиента.
     * 
     * <p><b>201</b> - Created
     * @param clients Настройки доступа к OAuth сервису. (required)
     * @return ResponseEntity&lt;ResultModelOfInt32&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfInt32> loymaxClientCreateWithHttpInfo(OAuthSettingsViewModelEx clients) throws RestClientException {
        Object postBody = clients;
        
        // verify the required parameter 'clients' is set
        if (clients == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'clients' when calling loymaxClientCreate");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/OAuth/Clients").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/x-www-form-urlencoded", "application/json", "text/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfInt32> returnType = new ParameterizedTypeReference<ResultModelOfInt32>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Удаляет OAuth клиента по id записи.
     * 
     * <p><b>200</b> - OK
     * @param id Id записи. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel loymaxClientDelete(Integer id) throws RestClientException {
        return loymaxClientDeleteWithHttpInfo(id).getBody();
    }

    /**
     * Удаляет OAuth клиента по id записи.
     * 
     * <p><b>200</b> - OK
     * @param id Id записи. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> loymaxClientDeleteWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling loymaxClientDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/OAuth/Clients/{id}").buildAndExpand(uriVariables).toUriString();

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
     * Получает список доступных OAuth клиентов.
     * 
     * <p><b>200</b> - OK
     * @param from С какой позиции. (optional, default to 0)
     * @param count Количество. (optional, default to 2147483647)
     * @param mode Признак архивации. (optional)
     * @return ResultModelOfPagedViewModelOfOAuthSettings
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfOAuthSettings loymaxClientGet(Integer from, Integer count, String mode) throws RestClientException {
        return loymaxClientGetWithHttpInfo(from, count, mode).getBody();
    }

    /**
     * Получает список доступных OAuth клиентов.
     * 
     * <p><b>200</b> - OK
     * @param from С какой позиции. (optional, default to 0)
     * @param count Количество. (optional, default to 2147483647)
     * @param mode Признак архивации. (optional)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfOAuthSettings&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfOAuthSettings> loymaxClientGetWithHttpInfo(Integer from, Integer count, String mode) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/OAuth/Clients").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "mode", mode));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfOAuthSettings> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfOAuthSettings>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Возвращает OAuth клиента по id.
     * 
     * <p><b>200</b> - OK
     * @param id Id OAuth клиента. (required)
     * @return ResultModelOfOAuthSettings
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfOAuthSettings loymaxClientGetApiOAuthClientsById(Integer id) throws RestClientException {
        return loymaxClientGetApiOAuthClientsByIdWithHttpInfo(id).getBody();
    }

    /**
     * Возвращает OAuth клиента по id.
     * 
     * <p><b>200</b> - OK
     * @param id Id OAuth клиента. (required)
     * @return ResponseEntity&lt;ResultModelOfOAuthSettings&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfOAuthSettings> loymaxClientGetApiOAuthClientsByIdWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling loymaxClientGetApiOAuthClientsById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/OAuth/Clients/{id}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfOAuthSettings> returnType = new ParameterizedTypeReference<ResultModelOfOAuthSettings>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получает список доступных для отслеживания объектов.
     * 
     * <p><b>200</b> - OK
     * @param provider Провайдер. (required)
     * @param target Идентификатор объекта (владельца публикаций: пользователь, группа и т.п.). (required)
     * @return ResultModelOfListOfClientObjectModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfClientObjectModel loymaxClientObjects(String provider, String target) throws RestClientException {
        return loymaxClientObjectsWithHttpInfo(provider, target).getBody();
    }

    /**
     * Получает список доступных для отслеживания объектов.
     * 
     * <p><b>200</b> - OK
     * @param provider Провайдер. (required)
     * @param target Идентификатор объекта (владельца публикаций: пользователь, группа и т.п.). (required)
     * @return ResponseEntity&lt;ResultModelOfListOfClientObjectModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfClientObjectModel> loymaxClientObjectsWithHttpInfo(String provider, String target) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'provider' is set
        if (provider == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'provider' when calling loymaxClientObjects");
        }
        
        // verify the required parameter 'target' is set
        if (target == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'target' when calling loymaxClientObjects");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("provider", provider);
        uriVariables.put("target", target);
        String path = UriComponentsBuilder.fromPath("/api/OAuth/Clients/{provider}/Objects/{target}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfListOfClientObjectModel> returnType = new ParameterizedTypeReference<ResultModelOfListOfClientObjectModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Восстановление OAuth клиента по id записи.
     * 
     * <p><b>200</b> - OK
     * @param id Id запроса. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel loymaxClientRestore(Integer id) throws RestClientException {
        return loymaxClientRestoreWithHttpInfo(id).getBody();
    }

    /**
     * Восстановление OAuth клиента по id записи.
     * 
     * <p><b>200</b> - OK
     * @param id Id запроса. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> loymaxClientRestoreWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling loymaxClientRestore");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/OAuth/Clients/{id}/restore").buildAndExpand(uriVariables).toUriString();

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
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Редактирование OAuth клиента.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор настроек доступа к OAuth сервису. (required)
     * @param clients Настройки доступа к OAuth сервису. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel loymaxClientUpdate(Integer id, OAuthSettingsViewModelEx clients) throws RestClientException {
        return loymaxClientUpdateWithHttpInfo(id, clients).getBody();
    }

    /**
     * Редактирование OAuth клиента.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор настроек доступа к OAuth сервису. (required)
     * @param clients Настройки доступа к OAuth сервису. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> loymaxClientUpdateWithHttpInfo(Integer id, OAuthSettingsViewModelEx clients) throws RestClientException {
        Object postBody = clients;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling loymaxClientUpdate");
        }
        
        // verify the required parameter 'clients' is set
        if (clients == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'clients' when calling loymaxClientUpdate");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/OAuth/Clients/{id}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/x-www-form-urlencoded", "application/json", "text/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModel> returnType = new ParameterizedTypeReference<ResultModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
