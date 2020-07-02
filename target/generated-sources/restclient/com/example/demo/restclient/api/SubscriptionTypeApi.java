package com.example.demo.restclient.api;

import com.example.demo.restclient.ApiClient;

import com.example.demo.restclient.model.ResultModel;
import com.example.demo.restclient.model.ResultModelOfInt32;
import com.example.demo.restclient.model.ResultModelOfListOfMailingSubscriptionType;
import com.example.demo.restclient.model.ResultModelOfPagedViewModelOfSystemApiSubscriptionTypeViewModel;
import com.example.demo.restclient.model.ResultModelOfSystemApiSubscriptionTypeViewModel;
import com.example.demo.restclient.model.SystemApiSubscriptionTypeViewModel;

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
@Component("com.example.demo.restclient.api.SubscriptionTypeApi")
public class SubscriptionTypeApi {
    private ApiClient apiClient;

    public SubscriptionTypeApi() {
        this(new ApiClient());
    }

    @Autowired
    public SubscriptionTypeApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Создает тип подписки.
     * 
     * <p><b>201</b> - Created
     * @param model Модель типа подписки. (required)
     * @return ResultModelOfInt32
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfInt32 subscriptionTypeCreateSubscriptionType(SystemApiSubscriptionTypeViewModel model) throws RestClientException {
        return subscriptionTypeCreateSubscriptionTypeWithHttpInfo(model).getBody();
    }

    /**
     * Создает тип подписки.
     * 
     * <p><b>201</b> - Created
     * @param model Модель типа подписки. (required)
     * @return ResponseEntity&lt;ResultModelOfInt32&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfInt32> subscriptionTypeCreateSubscriptionTypeWithHttpInfo(SystemApiSubscriptionTypeViewModel model) throws RestClientException {
        Object postBody = model;
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling subscriptionTypeCreateSubscriptionType");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/SubscriptionTypes").build().toUriString();

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
     * Возвращает тип подписки.
     * 
     * <p><b>200</b> - OK
     * @param id Индификатор типа подписки. (required)
     * @return ResultModelOfSystemApiSubscriptionTypeViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfSystemApiSubscriptionTypeViewModel subscriptionTypeGet(Integer id) throws RestClientException {
        return subscriptionTypeGetWithHttpInfo(id).getBody();
    }

    /**
     * Возвращает тип подписки.
     * 
     * <p><b>200</b> - OK
     * @param id Индификатор типа подписки. (required)
     * @return ResponseEntity&lt;ResultModelOfSystemApiSubscriptionTypeViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfSystemApiSubscriptionTypeViewModel> subscriptionTypeGetWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling subscriptionTypeGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/SubscriptionTypes/{id}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfSystemApiSubscriptionTypeViewModel> returnType = new ParameterizedTypeReference<ResultModelOfSystemApiSubscriptionTypeViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Возвращает список всех типов подписок.
     * 
     * <p><b>200</b> - OK
     * @param from Начало выборки. (optional, default to 0)
     * @param count Количество. (optional, default to 10)
     * @param filterSearchedText Текст поиска. (optional)
     * @param filterSubscriptionType Тип подписки. (optional)
     * @param filterNotificationGatewayType Тип канала. (optional)
     * @return ResultModelOfPagedViewModelOfSystemApiSubscriptionTypeViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfSystemApiSubscriptionTypeViewModel subscriptionTypeGetAll(Integer from, Integer count, String filterSearchedText, String filterSubscriptionType, String filterNotificationGatewayType) throws RestClientException {
        return subscriptionTypeGetAllWithHttpInfo(from, count, filterSearchedText, filterSubscriptionType, filterNotificationGatewayType).getBody();
    }

    /**
     * Возвращает список всех типов подписок.
     * 
     * <p><b>200</b> - OK
     * @param from Начало выборки. (optional, default to 0)
     * @param count Количество. (optional, default to 10)
     * @param filterSearchedText Текст поиска. (optional)
     * @param filterSubscriptionType Тип подписки. (optional)
     * @param filterNotificationGatewayType Тип канала. (optional)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfSystemApiSubscriptionTypeViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfSystemApiSubscriptionTypeViewModel> subscriptionTypeGetAllWithHttpInfo(Integer from, Integer count, String filterSearchedText, String filterSubscriptionType, String filterNotificationGatewayType) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/SubscriptionTypes").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.searchedText", filterSearchedText));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.subscriptionType", filterSubscriptionType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.notificationGatewayType", filterNotificationGatewayType));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfSystemApiSubscriptionTypeViewModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfSystemApiSubscriptionTypeViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Возвращает список доступных типов подписки.
     * 
     * <p><b>200</b> - OK
     * @return ResultModelOfListOfMailingSubscriptionType
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfMailingSubscriptionType subscriptionTypeGetAvailableSubscriptionTypes() throws RestClientException {
        return subscriptionTypeGetAvailableSubscriptionTypesWithHttpInfo().getBody();
    }

    /**
     * Возвращает список доступных типов подписки.
     * 
     * <p><b>200</b> - OK
     * @return ResponseEntity&lt;ResultModelOfListOfMailingSubscriptionType&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfMailingSubscriptionType> subscriptionTypeGetAvailableSubscriptionTypesWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/SubscriptionTypes/availableSubscriptionTypes").build().toUriString();

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

        ParameterizedTypeReference<ResultModelOfListOfMailingSubscriptionType> returnType = new ParameterizedTypeReference<ResultModelOfListOfMailingSubscriptionType>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Обновить тип подписки.
     * 
     * <p><b>200</b> - OK
     * @param id Индификатор типа подписки. (required)
     * @param model Обновляемая модель типа подписки. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel subscriptionTypeUpdateSubscriptionType(Integer id, SystemApiSubscriptionTypeViewModel model) throws RestClientException {
        return subscriptionTypeUpdateSubscriptionTypeWithHttpInfo(id, model).getBody();
    }

    /**
     * Обновить тип подписки.
     * 
     * <p><b>200</b> - OK
     * @param id Индификатор типа подписки. (required)
     * @param model Обновляемая модель типа подписки. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> subscriptionTypeUpdateSubscriptionTypeWithHttpInfo(Integer id, SystemApiSubscriptionTypeViewModel model) throws RestClientException {
        Object postBody = model;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling subscriptionTypeUpdateSubscriptionType");
        }
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling subscriptionTypeUpdateSubscriptionType");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/SubscriptionTypes/{id}").buildAndExpand(uriVariables).toUriString();

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
