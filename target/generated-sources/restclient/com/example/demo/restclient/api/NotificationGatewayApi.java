package com.example.demo.restclient.api;

import com.example.demo.restclient.ApiClient;

import com.example.demo.restclient.model.NotificationGatewayViewModel;
import com.example.demo.restclient.model.ResultModel;
import com.example.demo.restclient.model.ResultModelOfInt32;
import com.example.demo.restclient.model.ResultModelOfListOfNotificationGatewayProtocolTypeViewModel;
import com.example.demo.restclient.model.ResultModelOfNotificationGatewayViewModel;
import com.example.demo.restclient.model.ResultModelOfPagedViewModelOfNotificationGatewayViewModel;

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
@Component("com.example.demo.restclient.api.NotificationGatewayApi")
public class NotificationGatewayApi {
    private ApiClient apiClient;

    public NotificationGatewayApi() {
        this(new ApiClient());
    }

    @Autowired
    public NotificationGatewayApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Создание шлюза.
     * 
     * <p><b>201</b> - Created
     * @param gatewayModel Модель шлюза. (required)
     * @return ResultModelOfInt32
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfInt32 notificationGatewayCreateGateway(NotificationGatewayViewModel gatewayModel) throws RestClientException {
        return notificationGatewayCreateGatewayWithHttpInfo(gatewayModel).getBody();
    }

    /**
     * Создание шлюза.
     * 
     * <p><b>201</b> - Created
     * @param gatewayModel Модель шлюза. (required)
     * @return ResponseEntity&lt;ResultModelOfInt32&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfInt32> notificationGatewayCreateGatewayWithHttpInfo(NotificationGatewayViewModel gatewayModel) throws RestClientException {
        Object postBody = gatewayModel;
        
        // verify the required parameter 'gatewayModel' is set
        if (gatewayModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'gatewayModel' when calling notificationGatewayCreateGateway");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/notificationGateways").build().toUriString();

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
     * Удаление (архивирование) шлюза.
     * 
     * <p><b>200</b> - OK
     * @param id Id шлюза. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel notificationGatewayDeleteGateway(Integer id) throws RestClientException {
        return notificationGatewayDeleteGatewayWithHttpInfo(id).getBody();
    }

    /**
     * Удаление (архивирование) шлюза.
     * 
     * <p><b>200</b> - OK
     * @param id Id шлюза. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> notificationGatewayDeleteGatewayWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling notificationGatewayDeleteGateway");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/notificationGateways/{id}").buildAndExpand(uriVariables).toUriString();

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
     * Возвращает шлюз.
     * 
     * <p><b>200</b> - OK
     * @param id ID шлюза. (required)
     * @param mode Режим отображения архивных шлюзов. (optional)
     * @return ResultModelOfNotificationGatewayViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfNotificationGatewayViewModel notificationGatewayGetGateway(Integer id, String mode) throws RestClientException {
        return notificationGatewayGetGatewayWithHttpInfo(id, mode).getBody();
    }

    /**
     * Возвращает шлюз.
     * 
     * <p><b>200</b> - OK
     * @param id ID шлюза. (required)
     * @param mode Режим отображения архивных шлюзов. (optional)
     * @return ResponseEntity&lt;ResultModelOfNotificationGatewayViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfNotificationGatewayViewModel> notificationGatewayGetGatewayWithHttpInfo(Integer id, String mode) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling notificationGatewayGetGateway");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/notificationGateways/{id}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "mode", mode));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfNotificationGatewayViewModel> returnType = new ParameterizedTypeReference<ResultModelOfNotificationGatewayViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получение списка зарегистрированных типов протоколов.
     * 
     * <p><b>200</b> - OK
     * @return ResultModelOfListOfNotificationGatewayProtocolTypeViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfNotificationGatewayProtocolTypeViewModel notificationGatewayGetGatewayPossibleProtocolTypes() throws RestClientException {
        return notificationGatewayGetGatewayPossibleProtocolTypesWithHttpInfo().getBody();
    }

    /**
     * Получение списка зарегистрированных типов протоколов.
     * 
     * <p><b>200</b> - OK
     * @return ResponseEntity&lt;ResultModelOfListOfNotificationGatewayProtocolTypeViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfNotificationGatewayProtocolTypeViewModel> notificationGatewayGetGatewayPossibleProtocolTypesWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/notificationGateways/possibleProtocolTypes").build().toUriString();

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

        ParameterizedTypeReference<ResultModelOfListOfNotificationGatewayProtocolTypeViewModel> returnType = new ParameterizedTypeReference<ResultModelOfListOfNotificationGatewayProtocolTypeViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Возвращает список всех шлюзов.
     * 
     * <p><b>200</b> - OK
     * @param from С какого. (optional, default to 0)
     * @param count Сколько. (optional, default to 10)
     * @param filterMode  (optional)
     * @param filterType  (optional)
     * @param filterName  (optional)
     * @param filterProxyName  (optional)
     * @return ResultModelOfPagedViewModelOfNotificationGatewayViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfNotificationGatewayViewModel notificationGatewayGetGateways(Integer from, Integer count, String filterMode, String filterType, String filterName, String filterProxyName) throws RestClientException {
        return notificationGatewayGetGatewaysWithHttpInfo(from, count, filterMode, filterType, filterName, filterProxyName).getBody();
    }

    /**
     * Возвращает список всех шлюзов.
     * 
     * <p><b>200</b> - OK
     * @param from С какого. (optional, default to 0)
     * @param count Сколько. (optional, default to 10)
     * @param filterMode  (optional)
     * @param filterType  (optional)
     * @param filterName  (optional)
     * @param filterProxyName  (optional)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfNotificationGatewayViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfNotificationGatewayViewModel> notificationGatewayGetGatewaysWithHttpInfo(Integer from, Integer count, String filterMode, String filterType, String filterName, String filterProxyName) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/notificationGateways").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.mode", filterMode));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.type", filterType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.name", filterName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.proxyName", filterProxyName));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfNotificationGatewayViewModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfNotificationGatewayViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Восстановление архивного шлюза.
     * 
     * <p><b>200</b> - OK
     * @param id Id шлюза. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel notificationGatewayRestoreGateway(Integer id) throws RestClientException {
        return notificationGatewayRestoreGatewayWithHttpInfo(id).getBody();
    }

    /**
     * Восстановление архивного шлюза.
     * 
     * <p><b>200</b> - OK
     * @param id Id шлюза. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> notificationGatewayRestoreGatewayWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling notificationGatewayRestoreGateway");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/notificationGateways/{id}/restore").buildAndExpand(uriVariables).toUriString();

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
     * Редактирование шлюза.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор шлюза. (required)
     * @param gatewayModel Модель шлюза. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel notificationGatewayUpdateGateway(Integer id, NotificationGatewayViewModel gatewayModel) throws RestClientException {
        return notificationGatewayUpdateGatewayWithHttpInfo(id, gatewayModel).getBody();
    }

    /**
     * Редактирование шлюза.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор шлюза. (required)
     * @param gatewayModel Модель шлюза. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> notificationGatewayUpdateGatewayWithHttpInfo(Integer id, NotificationGatewayViewModel gatewayModel) throws RestClientException {
        Object postBody = gatewayModel;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling notificationGatewayUpdateGateway");
        }
        
        // verify the required parameter 'gatewayModel' is set
        if (gatewayModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'gatewayModel' when calling notificationGatewayUpdateGateway");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/notificationGateways/{id}").buildAndExpand(uriVariables).toUriString();

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
