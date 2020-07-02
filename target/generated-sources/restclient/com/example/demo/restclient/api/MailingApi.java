package com.example.demo.restclient.api;

import com.example.demo.restclient.ApiClient;

import com.example.demo.restclient.model.MailingCreateModel;
import com.example.demo.restclient.model.MailingPhonesModel;
import com.example.demo.restclient.model.MailingRunViewModel;
import com.example.demo.restclient.model.MailingTestsModel;
import com.example.demo.restclient.model.MailingViewModel;
import java.time.OffsetDateTime;
import com.example.demo.restclient.model.ResultModel;
import com.example.demo.restclient.model.ResultModelOfListOfMailingGatewayViewModel;
import com.example.demo.restclient.model.ResultModelOfMailingPhonesViewModel;
import com.example.demo.restclient.model.ResultModelOfMailingViewModel;
import com.example.demo.restclient.model.ResultModelOfPagedViewModelOfMailingBriefViewModel;

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
@Component("com.example.demo.restclient.api.MailingApi")
public class MailingApi {
    private ApiClient apiClient;

    public MailingApi() {
        this(new ApiClient());
    }

    @Autowired
    public MailingApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Создаёт рассылку.
     * 
     * <p><b>201</b> - Created
     * @param model Модель создания рассылки. (required)
     * @return ResultModelOfMailingViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfMailingViewModel mailingCreate(MailingCreateModel model) throws RestClientException {
        return mailingCreateWithHttpInfo(model).getBody();
    }

    /**
     * Создаёт рассылку.
     * 
     * <p><b>201</b> - Created
     * @param model Модель создания рассылки. (required)
     * @return ResponseEntity&lt;ResultModelOfMailingViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfMailingViewModel> mailingCreateWithHttpInfo(MailingCreateModel model) throws RestClientException {
        Object postBody = model;
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling mailingCreate");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/mailings").build().toUriString();

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

        ParameterizedTypeReference<ResultModelOfMailingViewModel> returnType = new ParameterizedTypeReference<ResultModelOfMailingViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Удаляет рассылку.
     * 
     * <p><b>200</b> - OK
     * @param mailingId Идентификатор рассылки. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel mailingDelete(Integer mailingId) throws RestClientException {
        return mailingDeleteWithHttpInfo(mailingId).getBody();
    }

    /**
     * Удаляет рассылку.
     * 
     * <p><b>200</b> - OK
     * @param mailingId Идентификатор рассылки. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> mailingDeleteWithHttpInfo(Integer mailingId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'mailingId' is set
        if (mailingId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailingId' when calling mailingDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("mailingId", mailingId);
        String path = UriComponentsBuilder.fromPath("/api/mailings/{mailingId}").buildAndExpand(uriVariables).toUriString();

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
     * Возвращает доступные шлюза рассылки.
     * 
     * <p><b>200</b> - OK
     * @param mailingId Идентификатор рассылки. (required)
     * @return ResultModelOfListOfMailingGatewayViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfMailingGatewayViewModel mailingGateways(Integer mailingId) throws RestClientException {
        return mailingGatewaysWithHttpInfo(mailingId).getBody();
    }

    /**
     * Возвращает доступные шлюза рассылки.
     * 
     * <p><b>200</b> - OK
     * @param mailingId Идентификатор рассылки. (required)
     * @return ResponseEntity&lt;ResultModelOfListOfMailingGatewayViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfMailingGatewayViewModel> mailingGatewaysWithHttpInfo(Integer mailingId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'mailingId' is set
        if (mailingId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailingId' when calling mailingGateways");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("mailingId", mailingId);
        String path = UriComponentsBuilder.fromPath("/api/mailings/{mailingId}/gateways").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfListOfMailingGatewayViewModel> returnType = new ParameterizedTypeReference<ResultModelOfListOfMailingGatewayViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Возвращает модель рассылки.
     * 
     * <p><b>200</b> - OK
     * @param mailingId Идентификатор рассылки. (required)
     * @return ResultModelOfMailingViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfMailingViewModel mailingGet(Integer mailingId) throws RestClientException {
        return mailingGetWithHttpInfo(mailingId).getBody();
    }

    /**
     * Возвращает модель рассылки.
     * 
     * <p><b>200</b> - OK
     * @param mailingId Идентификатор рассылки. (required)
     * @return ResponseEntity&lt;ResultModelOfMailingViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfMailingViewModel> mailingGetWithHttpInfo(Integer mailingId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'mailingId' is set
        if (mailingId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailingId' when calling mailingGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("mailingId", mailingId);
        String path = UriComponentsBuilder.fromPath("/api/mailings/{mailingId}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfMailingViewModel> returnType = new ParameterizedTypeReference<ResultModelOfMailingViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить список рассылок.
     * 
     * <p><b>200</b> - OK
     * @param filterFromDate Дата С. (optional)
     * @param filterToDate Дата По. (optional)
     * @param filterFrom С какого элемента брать. (optional)
     * @param filterCount Сколько элементов брать. (optional)
     * @param filterCreatorIds Список id создателей акций для фильтрации. (optional)
     * @param filterName Название. (optional)
     * @param filterMailingType Тип рассылки. (optional)
     * @param filterMarketingCampaignId ID маркетинговой кампании. (optional)
     * @param filterSortByAttachDate Значение, указывающее, нужно ли сортировать рассылки по дате прикрепления. (optional)
     * @param filterLoyaltyProgramIds Идентификаторы программ лояльности. (optional)
     * @return ResultModelOfPagedViewModelOfMailingBriefViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfMailingBriefViewModel mailingGetMailings(OffsetDateTime filterFromDate, OffsetDateTime filterToDate, Integer filterFrom, Integer filterCount, List<Integer> filterCreatorIds, String filterName, String filterMailingType, Integer filterMarketingCampaignId, Boolean filterSortByAttachDate, List<Integer> filterLoyaltyProgramIds) throws RestClientException {
        return mailingGetMailingsWithHttpInfo(filterFromDate, filterToDate, filterFrom, filterCount, filterCreatorIds, filterName, filterMailingType, filterMarketingCampaignId, filterSortByAttachDate, filterLoyaltyProgramIds).getBody();
    }

    /**
     * Получить список рассылок.
     * 
     * <p><b>200</b> - OK
     * @param filterFromDate Дата С. (optional)
     * @param filterToDate Дата По. (optional)
     * @param filterFrom С какого элемента брать. (optional)
     * @param filterCount Сколько элементов брать. (optional)
     * @param filterCreatorIds Список id создателей акций для фильтрации. (optional)
     * @param filterName Название. (optional)
     * @param filterMailingType Тип рассылки. (optional)
     * @param filterMarketingCampaignId ID маркетинговой кампании. (optional)
     * @param filterSortByAttachDate Значение, указывающее, нужно ли сортировать рассылки по дате прикрепления. (optional)
     * @param filterLoyaltyProgramIds Идентификаторы программ лояльности. (optional)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfMailingBriefViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfMailingBriefViewModel> mailingGetMailingsWithHttpInfo(OffsetDateTime filterFromDate, OffsetDateTime filterToDate, Integer filterFrom, Integer filterCount, List<Integer> filterCreatorIds, String filterName, String filterMailingType, Integer filterMarketingCampaignId, Boolean filterSortByAttachDate, List<Integer> filterLoyaltyProgramIds) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/mailings").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.fromDate", filterFromDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.toDate", filterToDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.from", filterFrom));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.count", filterCount));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "filter.creatorIds", filterCreatorIds));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.name", filterName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.mailingType", filterMailingType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.marketingCampaignId", filterMarketingCampaignId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.sortByAttachDate", filterSortByAttachDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "filter.loyaltyProgramIds", filterLoyaltyProgramIds));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfMailingBriefViewModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfMailingBriefViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Возвращает модель загруженных номеров телефонов в рассылку.
     * 
     * <p><b>200</b> - OK
     * @param mailingId Идентификатор рассылки. (required)
     * @return ResultModelOfMailingPhonesViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfMailingPhonesViewModel mailingPhones(Integer mailingId) throws RestClientException {
        return mailingPhonesWithHttpInfo(mailingId).getBody();
    }

    /**
     * Возвращает модель загруженных номеров телефонов в рассылку.
     * 
     * <p><b>200</b> - OK
     * @param mailingId Идентификатор рассылки. (required)
     * @return ResponseEntity&lt;ResultModelOfMailingPhonesViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfMailingPhonesViewModel> mailingPhonesWithHttpInfo(Integer mailingId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'mailingId' is set
        if (mailingId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailingId' when calling mailingPhones");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("mailingId", mailingId);
        String path = UriComponentsBuilder.fromPath("/api/mailings/{mailingId}/phones").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfMailingPhonesViewModel> returnType = new ParameterizedTypeReference<ResultModelOfMailingPhonesViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Загружает номера телефонов в SMS рассылку.
     * 
     * <p><b>200</b> - OK
     * @param mailingId Идентификатор рассылки. (required)
     * @param model Модель загружаемых телефонов. (required)
     * @return ResultModelOfMailingPhonesViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfMailingPhonesViewModel mailingPostApiMailingsByMailingIdPhones(Integer mailingId, MailingPhonesModel model) throws RestClientException {
        return mailingPostApiMailingsByMailingIdPhonesWithHttpInfo(mailingId, model).getBody();
    }

    /**
     * Загружает номера телефонов в SMS рассылку.
     * 
     * <p><b>200</b> - OK
     * @param mailingId Идентификатор рассылки. (required)
     * @param model Модель загружаемых телефонов. (required)
     * @return ResponseEntity&lt;ResultModelOfMailingPhonesViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfMailingPhonesViewModel> mailingPostApiMailingsByMailingIdPhonesWithHttpInfo(Integer mailingId, MailingPhonesModel model) throws RestClientException {
        Object postBody = model;
        
        // verify the required parameter 'mailingId' is set
        if (mailingId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailingId' when calling mailingPostApiMailingsByMailingIdPhones");
        }
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling mailingPostApiMailingsByMailingIdPhones");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("mailingId", mailingId);
        String path = UriComponentsBuilder.fromPath("/api/mailings/{mailingId}/phones").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfMailingPhonesViewModel> returnType = new ParameterizedTypeReference<ResultModelOfMailingPhonesViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Запускает рассылку.
     * 
     * <p><b>200</b> - OK
     * @param mailingId Идентификатор рассылки. (required)
     * @param model Дата и время запуска рассылки. (required)
     * @return ResultModelOfMailingViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfMailingViewModel mailingRun(Integer mailingId, MailingRunViewModel model) throws RestClientException {
        return mailingRunWithHttpInfo(mailingId, model).getBody();
    }

    /**
     * Запускает рассылку.
     * 
     * <p><b>200</b> - OK
     * @param mailingId Идентификатор рассылки. (required)
     * @param model Дата и время запуска рассылки. (required)
     * @return ResponseEntity&lt;ResultModelOfMailingViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfMailingViewModel> mailingRunWithHttpInfo(Integer mailingId, MailingRunViewModel model) throws RestClientException {
        Object postBody = model;
        
        // verify the required parameter 'mailingId' is set
        if (mailingId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailingId' when calling mailingRun");
        }
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling mailingRun");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("mailingId", mailingId);
        String path = UriComponentsBuilder.fromPath("/api/mailings/{mailingId}/run").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfMailingViewModel> returnType = new ParameterizedTypeReference<ResultModelOfMailingViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Сохраняет рассылку.
     * 
     * <p><b>200</b> - OK
     * @param mailingId Идентификатор рассылки. (required)
     * @param model Модель рассылки. (required)
     * @return ResultModelOfMailingViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfMailingViewModel mailingSave(Integer mailingId, MailingViewModel model) throws RestClientException {
        return mailingSaveWithHttpInfo(mailingId, model).getBody();
    }

    /**
     * Сохраняет рассылку.
     * 
     * <p><b>200</b> - OK
     * @param mailingId Идентификатор рассылки. (required)
     * @param model Модель рассылки. (required)
     * @return ResponseEntity&lt;ResultModelOfMailingViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfMailingViewModel> mailingSaveWithHttpInfo(Integer mailingId, MailingViewModel model) throws RestClientException {
        Object postBody = model;
        
        // verify the required parameter 'mailingId' is set
        if (mailingId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailingId' when calling mailingSave");
        }
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling mailingSave");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("mailingId", mailingId);
        String path = UriComponentsBuilder.fromPath("/api/mailings/{mailingId}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfMailingViewModel> returnType = new ParameterizedTypeReference<ResultModelOfMailingViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Отправляет тестовое сообщение.
     * 
     * <p><b>200</b> - OK
     * @param mailingId Идентификатор рассылки. (required)
     * @param model Модель тестовой рассылки. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel mailingSendTest(Integer mailingId, MailingTestsModel model) throws RestClientException {
        return mailingSendTestWithHttpInfo(mailingId, model).getBody();
    }

    /**
     * Отправляет тестовое сообщение.
     * 
     * <p><b>200</b> - OK
     * @param mailingId Идентификатор рассылки. (required)
     * @param model Модель тестовой рассылки. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> mailingSendTestWithHttpInfo(Integer mailingId, MailingTestsModel model) throws RestClientException {
        Object postBody = model;
        
        // verify the required parameter 'mailingId' is set
        if (mailingId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailingId' when calling mailingSendTest");
        }
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling mailingSendTest");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("mailingId", mailingId);
        String path = UriComponentsBuilder.fromPath("/api/mailings/{mailingId}/sendTest").buildAndExpand(uriVariables).toUriString();

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
