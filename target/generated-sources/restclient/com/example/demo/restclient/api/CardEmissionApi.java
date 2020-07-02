package com.example.demo.restclient.api;

import com.example.demo.restclient.ApiClient;

import com.example.demo.restclient.model.CardEmissionViewModel;
import com.example.demo.restclient.model.ResultModel;
import com.example.demo.restclient.model.ResultModelOfCardEmissionViewModel;
import com.example.demo.restclient.model.ResultModelOfCardsPackingQueueInfo;
import com.example.demo.restclient.model.ResultModelOfInt32;
import com.example.demo.restclient.model.ResultModelOfPagedViewModelOfCardEmissionViewModel;

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
@Component("com.example.demo.restclient.api.CardEmissionApi")
public class CardEmissionApi {
    private ApiClient apiClient;

    public CardEmissionApi() {
        this(new ApiClient());
    }

    @Autowired
    public CardEmissionApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Создать выпуск карт.
     * 
     * <p><b>201</b> - Created
     * @param emission Модель выпуска. (required)
     * @return ResultModelOfInt32
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfInt32 cardEmissionCreateCardEmission(CardEmissionViewModel emission) throws RestClientException {
        return cardEmissionCreateCardEmissionWithHttpInfo(emission).getBody();
    }

    /**
     * Создать выпуск карт.
     * 
     * <p><b>201</b> - Created
     * @param emission Модель выпуска. (required)
     * @return ResponseEntity&lt;ResultModelOfInt32&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfInt32> cardEmissionCreateCardEmissionWithHttpInfo(CardEmissionViewModel emission) throws RestClientException {
        Object postBody = emission;
        
        // verify the required parameter 'emission' is set
        if (emission == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'emission' when calling cardEmissionCreateCardEmission");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/emissions/cards").build().toUriString();

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
     * Получить выпуск карт по id.
     * 
     * <p><b>200</b> - OK
     * @param id Id выпуска. (required)
     * @return ResultModelOfCardEmissionViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfCardEmissionViewModel cardEmissionGetCardEmission(Integer id) throws RestClientException {
        return cardEmissionGetCardEmissionWithHttpInfo(id).getBody();
    }

    /**
     * Получить выпуск карт по id.
     * 
     * <p><b>200</b> - OK
     * @param id Id выпуска. (required)
     * @return ResponseEntity&lt;ResultModelOfCardEmissionViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfCardEmissionViewModel> cardEmissionGetCardEmissionWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling cardEmissionGetCardEmission");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/emissions/cards/{id}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfCardEmissionViewModel> returnType = new ParameterizedTypeReference<ResultModelOfCardEmissionViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить выпуск в виде CSV файла.
     * 
     * <p><b>200</b> - OK
     * @param id Id выпуска карт. (required)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object cardEmissionGetCardEmissionCsv(Integer id) throws RestClientException {
        return cardEmissionGetCardEmissionCsvWithHttpInfo(id).getBody();
    }

    /**
     * Получить выпуск в виде CSV файла.
     * 
     * <p><b>200</b> - OK
     * @param id Id выпуска карт. (required)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> cardEmissionGetCardEmissionCsvWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling cardEmissionGetCardEmissionCsv");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/emissions/cards/{id}/export").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json", "text/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<Object> returnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить информацию по фоновой фасовке карт для указанной очереди.
     * 
     * <p><b>200</b> - OK
     * @param id Id выпуска карт. (required)
     * @return ResultModelOfCardsPackingQueueInfo
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfCardsPackingQueueInfo cardEmissionGetCardEmissionPackingQueueProgress(Integer id) throws RestClientException {
        return cardEmissionGetCardEmissionPackingQueueProgressWithHttpInfo(id).getBody();
    }

    /**
     * Получить информацию по фоновой фасовке карт для указанной очереди.
     * 
     * <p><b>200</b> - OK
     * @param id Id выпуска карт. (required)
     * @return ResponseEntity&lt;ResultModelOfCardsPackingQueueInfo&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfCardsPackingQueueInfo> cardEmissionGetCardEmissionPackingQueueProgressWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling cardEmissionGetCardEmissionPackingQueueProgress");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/emissions/cards/{id}/progress").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfCardsPackingQueueInfo> returnType = new ParameterizedTypeReference<ResultModelOfCardsPackingQueueInfo>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить список выпусков карт.
     * 
     * <p><b>200</b> - OK
     * @param filterFrom Начало выборки. (optional)
     * @param filterCount Количество. (optional)
     * @param filterLoyaltyPrograms Список ПЛ для фильтра по ПЛ. (optional)
     * @return ResultModelOfPagedViewModelOfCardEmissionViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfCardEmissionViewModel cardEmissionGetCardEmissions(Integer filterFrom, Integer filterCount, List<Integer> filterLoyaltyPrograms) throws RestClientException {
        return cardEmissionGetCardEmissionsWithHttpInfo(filterFrom, filterCount, filterLoyaltyPrograms).getBody();
    }

    /**
     * Получить список выпусков карт.
     * 
     * <p><b>200</b> - OK
     * @param filterFrom Начало выборки. (optional)
     * @param filterCount Количество. (optional)
     * @param filterLoyaltyPrograms Список ПЛ для фильтра по ПЛ. (optional)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfCardEmissionViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfCardEmissionViewModel> cardEmissionGetCardEmissionsWithHttpInfo(Integer filterFrom, Integer filterCount, List<Integer> filterLoyaltyPrograms) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/emissions/cards").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.from", filterFrom));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.count", filterCount));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "filter.loyaltyPrograms", filterLoyaltyPrograms));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfCardEmissionViewModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfCardEmissionViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Расфасовать выпуск карт.
     * 
     * <p><b>200</b> - OK
     * @param id Id выпуска карт. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel cardEmissionPackCardEmission(Integer id) throws RestClientException {
        return cardEmissionPackCardEmissionWithHttpInfo(id).getBody();
    }

    /**
     * Расфасовать выпуск карт.
     * 
     * <p><b>200</b> - OK
     * @param id Id выпуска карт. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> cardEmissionPackCardEmissionWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling cardEmissionPackCardEmission");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/emissions/cards/{id}/pack").buildAndExpand(uriVariables).toUriString();

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
}
