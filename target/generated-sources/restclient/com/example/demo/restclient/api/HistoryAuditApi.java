package com.example.demo.restclient.api;

import com.example.demo.restclient.ApiClient;

import java.time.OffsetDateTime;
import com.example.demo.restclient.model.ResultModelOfHistoryAuditViewModel;
import com.example.demo.restclient.model.ResultModelOfPagedViewModelOfHistoryAuditViewModel;

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
@Component("com.example.demo.restclient.api.HistoryAuditApi")
public class HistoryAuditApi {
    private ApiClient apiClient;

    public HistoryAuditApi() {
        this(new ApiClient());
    }

    @Autowired
    public HistoryAuditApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Получить аудит по идентификатору.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор. (required)
     * @return ResultModelOfHistoryAuditViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfHistoryAuditViewModel historyAuditGetAuditById(Integer id) throws RestClientException {
        return historyAuditGetAuditByIdWithHttpInfo(id).getBody();
    }

    /**
     * Получить аудит по идентификатору.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор. (required)
     * @return ResponseEntity&lt;ResultModelOfHistoryAuditViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfHistoryAuditViewModel> historyAuditGetAuditByIdWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling historyAuditGetAuditById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/audits/{id}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfHistoryAuditViewModel> returnType = new ParameterizedTypeReference<ResultModelOfHistoryAuditViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить аудиты.
     * 
     * <p><b>200</b> - OK
     * @param from С какой записи. (optional, default to 0)
     * @param count Сколько. (optional, default to 100)
     * @param filterDateFrom  (optional)
     * @param filterDateTo  (optional)
     * @param filterCardNumber  (optional)
     * @param filterAuditTypes  (optional)
     * @param filterPersonId  (optional)
     * @return ResultModelOfPagedViewModelOfHistoryAuditViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfHistoryAuditViewModel historyAuditGetAudits(Integer from, Integer count, OffsetDateTime filterDateFrom, OffsetDateTime filterDateTo, String filterCardNumber, List<String> filterAuditTypes, Integer filterPersonId) throws RestClientException {
        return historyAuditGetAuditsWithHttpInfo(from, count, filterDateFrom, filterDateTo, filterCardNumber, filterAuditTypes, filterPersonId).getBody();
    }

    /**
     * Получить аудиты.
     * 
     * <p><b>200</b> - OK
     * @param from С какой записи. (optional, default to 0)
     * @param count Сколько. (optional, default to 100)
     * @param filterDateFrom  (optional)
     * @param filterDateTo  (optional)
     * @param filterCardNumber  (optional)
     * @param filterAuditTypes  (optional)
     * @param filterPersonId  (optional)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfHistoryAuditViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfHistoryAuditViewModel> historyAuditGetAuditsWithHttpInfo(Integer from, Integer count, OffsetDateTime filterDateFrom, OffsetDateTime filterDateTo, String filterCardNumber, List<String> filterAuditTypes, Integer filterPersonId) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/audits").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.dateFrom", filterDateFrom));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.dateTo", filterDateTo));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.cardNumber", filterCardNumber));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "filter.auditTypes", filterAuditTypes));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.personId", filterPersonId));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfHistoryAuditViewModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfHistoryAuditViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
