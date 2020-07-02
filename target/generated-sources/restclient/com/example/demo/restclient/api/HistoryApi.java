package com.example.demo.restclient.api;

import com.example.demo.restclient.ApiClient;

import java.time.OffsetDateTime;
import com.example.demo.restclient.model.ResultModelOfHistoryListModel;

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
@Component("com.example.demo.restclient.api.HistoryApi")
public class HistoryApi {
    private ApiClient apiClient;

    public HistoryApi() {
        this(new ApiClient());
    }

    @Autowired
    public HistoryApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Получить историю.
     * 
     * <p><b>200</b> - OK
     * @param personId Идентификатор клиента. (required)
     * @param filterFromDate Дата с которой необходимо вывести историю. (optional)
     * @param filterToDate Дата до которой необходимо вывести историю. (optional)
     * @param filterCardId ID карты. Если указан, то будет получена история только по этой карте. (optional)
     * @param filterFrom Начиная с какого элемента необходимо выводить. (optional)
     * @param filterCount Кол-во элементов для вывода. (optional)
     * @param filterHistoryItemType Тип события в истории {Loymax.Mobile.Contract.Models.History.HistoryFilter.HistoryItemType}. (optional)
     * @param filterChequeNumber Номер чека. (optional)
     * @return ResultModelOfHistoryListModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfHistoryListModel historyGetHistory(Integer personId, OffsetDateTime filterFromDate, OffsetDateTime filterToDate, Integer filterCardId, Integer filterFrom, Integer filterCount, String filterHistoryItemType, String filterChequeNumber) throws RestClientException {
        return historyGetHistoryWithHttpInfo(personId, filterFromDate, filterToDate, filterCardId, filterFrom, filterCount, filterHistoryItemType, filterChequeNumber).getBody();
    }

    /**
     * Получить историю.
     * 
     * <p><b>200</b> - OK
     * @param personId Идентификатор клиента. (required)
     * @param filterFromDate Дата с которой необходимо вывести историю. (optional)
     * @param filterToDate Дата до которой необходимо вывести историю. (optional)
     * @param filterCardId ID карты. Если указан, то будет получена история только по этой карте. (optional)
     * @param filterFrom Начиная с какого элемента необходимо выводить. (optional)
     * @param filterCount Кол-во элементов для вывода. (optional)
     * @param filterHistoryItemType Тип события в истории {Loymax.Mobile.Contract.Models.History.HistoryFilter.HistoryItemType}. (optional)
     * @param filterChequeNumber Номер чека. (optional)
     * @return ResponseEntity&lt;ResultModelOfHistoryListModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfHistoryListModel> historyGetHistoryWithHttpInfo(Integer personId, OffsetDateTime filterFromDate, OffsetDateTime filterToDate, Integer filterCardId, Integer filterFrom, Integer filterCount, String filterHistoryItemType, String filterChequeNumber) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling historyGetHistory");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("personId", personId);
        String path = UriComponentsBuilder.fromPath("/api/Users/{personId}/History").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.fromDate", filterFromDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.toDate", filterToDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.cardId", filterCardId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.from", filterFrom));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.count", filterCount));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.historyItemType", filterHistoryItemType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.chequeNumber", filterChequeNumber));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfHistoryListModel> returnType = new ParameterizedTypeReference<ResultModelOfHistoryListModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
