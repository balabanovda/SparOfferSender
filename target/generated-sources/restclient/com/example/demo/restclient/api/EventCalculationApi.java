package com.example.demo.restclient.api;

import com.example.demo.restclient.ApiClient;

import com.example.demo.restclient.model.ResultModelOfEventCalculationModel;
import com.example.demo.restclient.model.ResultModelOfPagedViewModelOfEventCalculationModel;

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
@Component("com.example.demo.restclient.api.EventCalculationApi")
public class EventCalculationApi {
    private ApiClient apiClient;

    public EventCalculationApi() {
        this(new ApiClient());
    }

    @Autowired
    public EventCalculationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Возвращает информацию о расчёте по идентификатору.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор расчёта. (required)
     * @return ResultModelOfEventCalculationModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfEventCalculationModel eventCalculationGetById(Long id) throws RestClientException {
        return eventCalculationGetByIdWithHttpInfo(id).getBody();
    }

    /**
     * Возвращает информацию о расчёте по идентификатору.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор расчёта. (required)
     * @return ResponseEntity&lt;ResultModelOfEventCalculationModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfEventCalculationModel> eventCalculationGetByIdWithHttpInfo(Long id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling eventCalculationGetById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/EventCalculations/{id}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfEventCalculationModel> returnType = new ParameterizedTypeReference<ResultModelOfEventCalculationModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Возвращает список расчётов.
     * 
     * <p><b>200</b> - OK
     * @param filterFrom С какого элемента брать. (optional)
     * @param filterCount Сколько элементов брать. (optional)
     * @param filterCalculationKey Ключ расчёта. (optional)
     * @return ResultModelOfPagedViewModelOfEventCalculationModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfEventCalculationModel eventCalculationGetPagedList(Integer filterFrom, Integer filterCount, Long filterCalculationKey) throws RestClientException {
        return eventCalculationGetPagedListWithHttpInfo(filterFrom, filterCount, filterCalculationKey).getBody();
    }

    /**
     * Возвращает список расчётов.
     * 
     * <p><b>200</b> - OK
     * @param filterFrom С какого элемента брать. (optional)
     * @param filterCount Сколько элементов брать. (optional)
     * @param filterCalculationKey Ключ расчёта. (optional)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfEventCalculationModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfEventCalculationModel> eventCalculationGetPagedListWithHttpInfo(Integer filterFrom, Integer filterCount, Long filterCalculationKey) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/EventCalculations").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.from", filterFrom));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.count", filterCount));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.calculationKey", filterCalculationKey));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfEventCalculationModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfEventCalculationModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
