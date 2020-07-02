package com.example.demo.restclient.api;

import com.example.demo.restclient.ApiClient;

import com.example.demo.restclient.model.NotificationGatewayViewModel;
import com.example.demo.restclient.model.PartnerNotifyGatewayViewModel;
import com.example.demo.restclient.model.ResultModel;
import com.example.demo.restclient.model.ResultModelOfInt32;
import com.example.demo.restclient.model.ResultModelOfPagedViewModelOfPartnerNotifyGatewayViewModel;
import com.example.demo.restclient.model.ResultModelOfPartnerNotifyGatewayViewModel;

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
@Component("com.example.demo.restclient.api.PartnerNotifyGatewayApi")
public class PartnerNotifyGatewayApi {
    private ApiClient apiClient;

    public PartnerNotifyGatewayApi() {
        this(new ApiClient());
    }

    @Autowired
    public PartnerNotifyGatewayApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Добавляет шлюз партнеру.
     * 
     * <p><b>201</b> - Created
     * @param partnerNotifyGatewayViewModel Модель шлюза партнера. (required)
     * @return ResultModelOfInt32
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfInt32 partnerNotifyGatewayAddPartnerGateway(PartnerNotifyGatewayViewModel partnerNotifyGatewayViewModel) throws RestClientException {
        return partnerNotifyGatewayAddPartnerGatewayWithHttpInfo(partnerNotifyGatewayViewModel).getBody();
    }

    /**
     * Добавляет шлюз партнеру.
     * 
     * <p><b>201</b> - Created
     * @param partnerNotifyGatewayViewModel Модель шлюза партнера. (required)
     * @return ResponseEntity&lt;ResultModelOfInt32&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfInt32> partnerNotifyGatewayAddPartnerGatewayWithHttpInfo(PartnerNotifyGatewayViewModel partnerNotifyGatewayViewModel) throws RestClientException {
        Object postBody = partnerNotifyGatewayViewModel;
        
        // verify the required parameter 'partnerNotifyGatewayViewModel' is set
        if (partnerNotifyGatewayViewModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partnerNotifyGatewayViewModel' when calling partnerNotifyGatewayAddPartnerGateway");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/partnerNotifyGateways").build().toUriString();

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
     * Удалить шлюз партнера.
     * 
     * <p><b>200</b> - OK
     * @param id Id шлюза партнера. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel partnerNotifyGatewayDeletePartnerGateway(Integer id) throws RestClientException {
        return partnerNotifyGatewayDeletePartnerGatewayWithHttpInfo(id).getBody();
    }

    /**
     * Удалить шлюз партнера.
     * 
     * <p><b>200</b> - OK
     * @param id Id шлюза партнера. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> partnerNotifyGatewayDeletePartnerGatewayWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling partnerNotifyGatewayDeletePartnerGateway");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/partnerNotifyGateways/{id}").buildAndExpand(uriVariables).toUriString();

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
     * Получить список доступных для добавления партнеру шлюзов.
     * 
     * <p><b>200</b> - OK
     * @param partnerId Id партнера. (required)
     * @param from The from. (optional, default to 0)
     * @param count The count. (optional, default to 10)
     * @return List&lt;NotificationGatewayViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<NotificationGatewayViewModel> partnerNotifyGatewayGetPartnerAvailableGateway(Integer partnerId, Integer from, Integer count) throws RestClientException {
        return partnerNotifyGatewayGetPartnerAvailableGatewayWithHttpInfo(partnerId, from, count).getBody();
    }

    /**
     * Получить список доступных для добавления партнеру шлюзов.
     * 
     * <p><b>200</b> - OK
     * @param partnerId Id партнера. (required)
     * @param from The from. (optional, default to 0)
     * @param count The count. (optional, default to 10)
     * @return ResponseEntity&lt;List&lt;NotificationGatewayViewModel&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<NotificationGatewayViewModel>> partnerNotifyGatewayGetPartnerAvailableGatewayWithHttpInfo(Integer partnerId, Integer from, Integer count) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'partnerId' is set
        if (partnerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partnerId' when calling partnerNotifyGatewayGetPartnerAvailableGateway");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("partnerId", partnerId);
        String path = UriComponentsBuilder.fromPath("/api/partnerNotifyGateways/partner/{partnerId}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<List<NotificationGatewayViewModel>> returnType = new ParameterizedTypeReference<List<NotificationGatewayViewModel>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получение шлюз по ИД.
     * 
     * <p><b>200</b> - OK
     * @param gatewayId Идентификатор шлюза партнера. (required)
     * @return ResultModelOfPartnerNotifyGatewayViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPartnerNotifyGatewayViewModel partnerNotifyGatewayGetPartnerGateway(Integer gatewayId) throws RestClientException {
        return partnerNotifyGatewayGetPartnerGatewayWithHttpInfo(gatewayId).getBody();
    }

    /**
     * Получение шлюз по ИД.
     * 
     * <p><b>200</b> - OK
     * @param gatewayId Идентификатор шлюза партнера. (required)
     * @return ResponseEntity&lt;ResultModelOfPartnerNotifyGatewayViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPartnerNotifyGatewayViewModel> partnerNotifyGatewayGetPartnerGatewayWithHttpInfo(Integer gatewayId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'gatewayId' is set
        if (gatewayId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'gatewayId' when calling partnerNotifyGatewayGetPartnerGateway");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("gatewayId", gatewayId);
        String path = UriComponentsBuilder.fromPath("/api/partnerNotifyGateways/{gatewayId}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfPartnerNotifyGatewayViewModel> returnType = new ParameterizedTypeReference<ResultModelOfPartnerNotifyGatewayViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получение списка шлюзов партнера.
     * 
     * <p><b>200</b> - OK
     * @param partnerId Идентификатор партнера. (required)
     * @param from С какого элемента. (optional, default to 0)
     * @param count Количество возвращаемых элементов. (optional, default to 10)
     * @return ResultModelOfPagedViewModelOfPartnerNotifyGatewayViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfPartnerNotifyGatewayViewModel partnerNotifyGatewayGetPartnerGateways(Integer partnerId, Integer from, Integer count) throws RestClientException {
        return partnerNotifyGatewayGetPartnerGatewaysWithHttpInfo(partnerId, from, count).getBody();
    }

    /**
     * Получение списка шлюзов партнера.
     * 
     * <p><b>200</b> - OK
     * @param partnerId Идентификатор партнера. (required)
     * @param from С какого элемента. (optional, default to 0)
     * @param count Количество возвращаемых элементов. (optional, default to 10)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfPartnerNotifyGatewayViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfPartnerNotifyGatewayViewModel> partnerNotifyGatewayGetPartnerGatewaysWithHttpInfo(Integer partnerId, Integer from, Integer count) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'partnerId' is set
        if (partnerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partnerId' when calling partnerNotifyGatewayGetPartnerGateways");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/partnerNotifyGateways").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "partnerId", partnerId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfPartnerNotifyGatewayViewModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfPartnerNotifyGatewayViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Обновляет шлюз партнера.
     * 
     * <p><b>200</b> - OK
     * @param partnerNotifyGatewayViewModel View model шлюза партнера. (required)
     * @return ResultModelOfInt32
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfInt32 partnerNotifyGatewayUpdatePartnerGateway(PartnerNotifyGatewayViewModel partnerNotifyGatewayViewModel) throws RestClientException {
        return partnerNotifyGatewayUpdatePartnerGatewayWithHttpInfo(partnerNotifyGatewayViewModel).getBody();
    }

    /**
     * Обновляет шлюз партнера.
     * 
     * <p><b>200</b> - OK
     * @param partnerNotifyGatewayViewModel View model шлюза партнера. (required)
     * @return ResponseEntity&lt;ResultModelOfInt32&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfInt32> partnerNotifyGatewayUpdatePartnerGatewayWithHttpInfo(PartnerNotifyGatewayViewModel partnerNotifyGatewayViewModel) throws RestClientException {
        Object postBody = partnerNotifyGatewayViewModel;
        
        // verify the required parameter 'partnerNotifyGatewayViewModel' is set
        if (partnerNotifyGatewayViewModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partnerNotifyGatewayViewModel' when calling partnerNotifyGatewayUpdatePartnerGateway");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/partnerNotifyGateways").build().toUriString();

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
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
