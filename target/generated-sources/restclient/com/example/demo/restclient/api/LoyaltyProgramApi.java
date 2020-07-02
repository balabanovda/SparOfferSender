package com.example.demo.restclient.api;

import com.example.demo.restclient.ApiClient;

import com.example.demo.restclient.model.LoyaltyProgramModel;
import com.example.demo.restclient.model.ResultModel;
import com.example.demo.restclient.model.ResultModelOfInt32;
import com.example.demo.restclient.model.ResultModelOfLoyaltyProgramModel;
import com.example.demo.restclient.model.ResultModelOfPagedViewModelOfLoyaltyProgramModel;
import com.example.demo.restclient.model.ResultModelOfPagedViewModelOfPartnerModel;

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
@Component("com.example.demo.restclient.api.LoyaltyProgramApi")
public class LoyaltyProgramApi {
    private ApiClient apiClient;

    public LoyaltyProgramApi() {
        this(new ApiClient());
    }

    @Autowired
    public LoyaltyProgramApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Добавить партнёра в программу лояльности.
     * 
     * <p><b>201</b> - Created
     * @param id Идентификатор программы лояльности. (required)
     * @param partnerId Идентификатор партнёра. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel loyaltyProgramAddPartner(Integer id, Integer partnerId) throws RestClientException {
        return loyaltyProgramAddPartnerWithHttpInfo(id, partnerId).getBody();
    }

    /**
     * Добавить партнёра в программу лояльности.
     * 
     * <p><b>201</b> - Created
     * @param id Идентификатор программы лояльности. (required)
     * @param partnerId Идентификатор партнёра. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> loyaltyProgramAddPartnerWithHttpInfo(Integer id, Integer partnerId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling loyaltyProgramAddPartner");
        }
        
        // verify the required parameter 'partnerId' is set
        if (partnerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partnerId' when calling loyaltyProgramAddPartner");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("partnerId", partnerId);
        String path = UriComponentsBuilder.fromPath("/api/LoyaltyPrograms/{id}/Partners/{partnerId}").buildAndExpand(uriVariables).toUriString();

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
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Создать программу лояльности.
     * 
     * <p><b>201</b> - Created
     * @param model Модель данных программы лояльности. (required)
     * @return ResultModelOfInt32
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfInt32 loyaltyProgramCreate(LoyaltyProgramModel model) throws RestClientException {
        return loyaltyProgramCreateWithHttpInfo(model).getBody();
    }

    /**
     * Создать программу лояльности.
     * 
     * <p><b>201</b> - Created
     * @param model Модель данных программы лояльности. (required)
     * @return ResponseEntity&lt;ResultModelOfInt32&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfInt32> loyaltyProgramCreateWithHttpInfo(LoyaltyProgramModel model) throws RestClientException {
        Object postBody = model;
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling loyaltyProgramCreate");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/LoyaltyPrograms").build().toUriString();

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
     * Редактировать программу лояльности.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор программы лояльности. (required)
     * @param model Модель редактирования данных программы лояльности. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel loyaltyProgramEdit(Integer id, LoyaltyProgramModel model) throws RestClientException {
        return loyaltyProgramEditWithHttpInfo(id, model).getBody();
    }

    /**
     * Редактировать программу лояльности.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор программы лояльности. (required)
     * @param model Модель редактирования данных программы лояльности. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> loyaltyProgramEditWithHttpInfo(Integer id, LoyaltyProgramModel model) throws RestClientException {
        Object postBody = model;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling loyaltyProgramEdit");
        }
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling loyaltyProgramEdit");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/LoyaltyPrograms/{id}").buildAndExpand(uriVariables).toUriString();

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
    /**
     * Получить список программ лояльности.
     * 
     * <p><b>200</b> - OK
     * @param filterFrom С какого элемента брать. (optional)
     * @param filterCount Сколько элементов брать. (optional)
     * @param filterPartnerIds Список Id партнёров. (optional)
     * @param filterName Подстрока для фильтрации по имени. (optional)
     * @param filterSortingIds Список идентификаторов для первоочередного выбора. (optional)
     * @return ResultModelOfPagedViewModelOfLoyaltyProgramModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfLoyaltyProgramModel loyaltyProgramGet(Integer filterFrom, Integer filterCount, List<Integer> filterPartnerIds, String filterName, List<Integer> filterSortingIds) throws RestClientException {
        return loyaltyProgramGetWithHttpInfo(filterFrom, filterCount, filterPartnerIds, filterName, filterSortingIds).getBody();
    }

    /**
     * Получить список программ лояльности.
     * 
     * <p><b>200</b> - OK
     * @param filterFrom С какого элемента брать. (optional)
     * @param filterCount Сколько элементов брать. (optional)
     * @param filterPartnerIds Список Id партнёров. (optional)
     * @param filterName Подстрока для фильтрации по имени. (optional)
     * @param filterSortingIds Список идентификаторов для первоочередного выбора. (optional)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfLoyaltyProgramModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfLoyaltyProgramModel> loyaltyProgramGetWithHttpInfo(Integer filterFrom, Integer filterCount, List<Integer> filterPartnerIds, String filterName, List<Integer> filterSortingIds) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/LoyaltyPrograms").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.from", filterFrom));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.count", filterCount));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "filter.partnerIds", filterPartnerIds));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.name", filterName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "filter.sortingIds", filterSortingIds));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfLoyaltyProgramModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfLoyaltyProgramModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить программу лояльности по системному идентификатору.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор программы лояльности. (required)
     * @return ResultModelOfLoyaltyProgramModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfLoyaltyProgramModel loyaltyProgramGetApiLoyaltyProgramsById(Integer id) throws RestClientException {
        return loyaltyProgramGetApiLoyaltyProgramsByIdWithHttpInfo(id).getBody();
    }

    /**
     * Получить программу лояльности по системному идентификатору.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор программы лояльности. (required)
     * @return ResponseEntity&lt;ResultModelOfLoyaltyProgramModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfLoyaltyProgramModel> loyaltyProgramGetApiLoyaltyProgramsByIdWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling loyaltyProgramGetApiLoyaltyProgramsById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/LoyaltyPrograms/{id}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfLoyaltyProgramModel> returnType = new ParameterizedTypeReference<ResultModelOfLoyaltyProgramModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить список партнёров программы лояльности.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор программы лояльности. (required)
     * @param from Начальная позиция. (optional, default to 0)
     * @param count Количество элементов. (optional, default to 10)
     * @return ResultModelOfPagedViewModelOfPartnerModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfPartnerModel loyaltyProgramGetPartners(Integer id, Integer from, Integer count) throws RestClientException {
        return loyaltyProgramGetPartnersWithHttpInfo(id, from, count).getBody();
    }

    /**
     * Получить список партнёров программы лояльности.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор программы лояльности. (required)
     * @param from Начальная позиция. (optional, default to 0)
     * @param count Количество элементов. (optional, default to 10)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfPartnerModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfPartnerModel> loyaltyProgramGetPartnersWithHttpInfo(Integer id, Integer from, Integer count) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling loyaltyProgramGetPartners");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/LoyaltyPrograms/{id}/Partners").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfPartnerModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfPartnerModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Удалить партнёра из программы лояльности.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор программы лояльности. (required)
     * @param partnerId Идентификатор партнёра. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel loyaltyProgramRemovePartner(Integer id, Integer partnerId) throws RestClientException {
        return loyaltyProgramRemovePartnerWithHttpInfo(id, partnerId).getBody();
    }

    /**
     * Удалить партнёра из программы лояльности.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор программы лояльности. (required)
     * @param partnerId Идентификатор партнёра. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> loyaltyProgramRemovePartnerWithHttpInfo(Integer id, Integer partnerId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling loyaltyProgramRemovePartner");
        }
        
        // verify the required parameter 'partnerId' is set
        if (partnerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partnerId' when calling loyaltyProgramRemovePartner");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("partnerId", partnerId);
        String path = UriComponentsBuilder.fromPath("/api/LoyaltyPrograms/{id}/Partners/{partnerId}").buildAndExpand(uriVariables).toUriString();

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
}
