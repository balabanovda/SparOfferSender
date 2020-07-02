package com.example.demo.restclient.api;

import com.example.demo.restclient.ApiClient;

import java.time.OffsetDateTime;
import com.example.demo.restclient.model.ResultModelOfListOfString;
import com.example.demo.restclient.model.ResultModelOfPagedViewModelOfBusinessActivityViewModel;

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
@Component("com.example.demo.restclient.api.BusinessEventsApi")
public class BusinessEventsApi {
    private ApiClient apiClient;

    public BusinessEventsApi() {
        this(new ApiClient());
    }

    @Autowired
    public BusinessEventsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Возвращает список доступных переменных контекста.
     * 
     * <p><b>200</b> - OK
     * @param eventType Тип события. (required)
     * @return ResultModelOfListOfString
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfString businessEventsGetAvailableVariables(String eventType) throws RestClientException {
        return businessEventsGetAvailableVariablesWithHttpInfo(eventType).getBody();
    }

    /**
     * Возвращает список доступных переменных контекста.
     * 
     * <p><b>200</b> - OK
     * @param eventType Тип события. (required)
     * @return ResponseEntity&lt;ResultModelOfListOfString&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfString> businessEventsGetAvailableVariablesWithHttpInfo(String eventType) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'eventType' is set
        if (eventType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'eventType' when calling businessEventsGetAvailableVariables");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("eventType", eventType);
        String path = UriComponentsBuilder.fromPath("/api/Events/{eventType}/Variables").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfListOfString> returnType = new ParameterizedTypeReference<ResultModelOfListOfString>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Возвращает список активностей.
     * 
     * <p><b>200</b> - OK
     * @param filterFrom С какого элемента брать. (optional)
     * @param filterCount Сколько элементов брать. (optional)
     * @param filterActivityDateFrom Дата создания с. (optional)
     * @param filterActivityDateTo Дата создания по. (optional)
     * @param filterPersonId Идентификатор пользователя. (optional)
     * @param filterPurchaseId Идентификатор покупки. (optional)
     * @param filterContextType Тип контекста. (optional)
     * @return ResultModelOfPagedViewModelOfBusinessActivityViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfBusinessActivityViewModel businessEventsGetBusinessEvents(Integer filterFrom, Integer filterCount, OffsetDateTime filterActivityDateFrom, OffsetDateTime filterActivityDateTo, Integer filterPersonId, Integer filterPurchaseId, String filterContextType) throws RestClientException {
        return businessEventsGetBusinessEventsWithHttpInfo(filterFrom, filterCount, filterActivityDateFrom, filterActivityDateTo, filterPersonId, filterPurchaseId, filterContextType).getBody();
    }

    /**
     * Возвращает список активностей.
     * 
     * <p><b>200</b> - OK
     * @param filterFrom С какого элемента брать. (optional)
     * @param filterCount Сколько элементов брать. (optional)
     * @param filterActivityDateFrom Дата создания с. (optional)
     * @param filterActivityDateTo Дата создания по. (optional)
     * @param filterPersonId Идентификатор пользователя. (optional)
     * @param filterPurchaseId Идентификатор покупки. (optional)
     * @param filterContextType Тип контекста. (optional)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfBusinessActivityViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfBusinessActivityViewModel> businessEventsGetBusinessEventsWithHttpInfo(Integer filterFrom, Integer filterCount, OffsetDateTime filterActivityDateFrom, OffsetDateTime filterActivityDateTo, Integer filterPersonId, Integer filterPurchaseId, String filterContextType) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/Events").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.from", filterFrom));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.count", filterCount));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.activityDateFrom", filterActivityDateFrom));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.activityDateTo", filterActivityDateTo));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.personId", filterPersonId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.purchaseId", filterPurchaseId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.contextType", filterContextType));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfBusinessActivityViewModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfBusinessActivityViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
