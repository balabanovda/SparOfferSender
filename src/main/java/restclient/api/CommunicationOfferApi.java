package restclient.api;

import restclient.ApiClient;

import restclient.model.CommunicationOfferModel;
import java.time.OffsetDateTime;
import restclient.model.ResultModel;
import restclient.model.ResultModelOfCommunicationOfferModel;
import restclient.model.ResultModelOfListOfMerchantInfoModel;
import restclient.model.ResultModelOfPagedViewModelOfCommunicationOfferModel;
import restclient.model.ResultModelOfPagedViewModelOfOfferInfoShortViewModel;
import restclient.model.ResultModelOfPagedViewModelOfTargetGroupViewModel;
import restclient.model.UpdateCommunicationOfferModel;

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
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
@Component("restclient.api.CommunicationOfferApi")
public class CommunicationOfferApi {
    private ApiClient apiClient;

    public CommunicationOfferApi() {
        this(new ApiClient());
    }

    @Autowired
    public CommunicationOfferApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Отправка акции в архив.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel communicationOfferAddInArchivedOffer(Integer id) throws RestClientException {
        return communicationOfferAddInArchivedOfferWithHttpInfo(id).getBody();
    }

    /**
     * Отправка акции в архив.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> communicationOfferAddInArchivedOfferWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling communicationOfferAddInArchivedOffer");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/communicationOffers/{id}/Archive").buildAndExpand(uriVariables).toUriString();

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
     * Создает детали для акции.
     * 
     * <p><b>201</b> - Created
     * @param model Модель деталей. (required)
     * @return ResultModelOfCommunicationOfferModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfCommunicationOfferModel communicationOfferCreateOffer(CommunicationOfferModel model) throws RestClientException {
        return communicationOfferCreateOfferWithHttpInfo(model).getBody();
    }

    /**
     * Создает детали для акции.
     * 
     * <p><b>201</b> - Created
     * @param model Модель деталей. (required)
     * @return ResponseEntity&lt;ResultModelOfCommunicationOfferModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfCommunicationOfferModel> communicationOfferCreateOfferWithHttpInfo(CommunicationOfferModel model) throws RestClientException {
        Object postBody = model;
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling communicationOfferCreateOffer");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/communicationOffers").build().toUriString();

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

        ParameterizedTypeReference<ResultModelOfCommunicationOfferModel> returnType = new ParameterizedTypeReference<ResultModelOfCommunicationOfferModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Удаляет детали для акции.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel communicationOfferDeleteOffer(Integer id) throws RestClientException {
        return communicationOfferDeleteOfferWithHttpInfo(id).getBody();
    }

    /**
     * Удаляет детали для акции.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> communicationOfferDeleteOfferWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling communicationOfferDeleteOffer");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/communicationOffers/{id}").buildAndExpand(uriVariables).toUriString();

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
     * Редактирование деталей для акции.
     * 
     * <p><b>200</b> - OK
     * @param model Модель деталей. (required)
     * @param id Идентификатор. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel communicationOfferEditOffer(UpdateCommunicationOfferModel model, Integer id) throws RestClientException {
        return communicationOfferEditOfferWithHttpInfo(model, id).getBody();
    }

    /**
     * Редактирование деталей для акции.
     * 
     * <p><b>200</b> - OK
     * @param model Модель деталей. (required)
     * @param id Идентификатор. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> communicationOfferEditOfferWithHttpInfo(UpdateCommunicationOfferModel model, Integer id) throws RestClientException {
        Object postBody = model;
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling communicationOfferEditOffer");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling communicationOfferEditOffer");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/communicationOffers/{id}").buildAndExpand(uriVariables).toUriString();

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
     * Возвращает список доступных акций.
     * 
     * <p><b>200</b> - OK
     * @param from С. (optional, default to 0)
     * @param count По. (optional, default to 10)
     * @param substring Подстрока для поиска. (optional, default to )
     * @return ResultModelOfPagedViewModelOfOfferInfoShortViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfOfferInfoShortViewModel communicationOfferGetAvaliableOffers(Integer from, Integer count, String substring) throws RestClientException {
        return communicationOfferGetAvaliableOffersWithHttpInfo(from, count, substring).getBody();
    }

    /**
     * Возвращает список доступных акций.
     * 
     * <p><b>200</b> - OK
     * @param from С. (optional, default to 0)
     * @param count По. (optional, default to 10)
     * @param substring Подстрока для поиска. (optional, default to )
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfOfferInfoShortViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfOfferInfoShortViewModel> communicationOfferGetAvaliableOffersWithHttpInfo(Integer from, Integer count, String substring) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/communicationOffers/availableOffers").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "substring", substring));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfOfferInfoShortViewModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfOfferInfoShortViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Возвращает список магазинов достпных для рекламного материала.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор рекламного материала. (required)
     * @param from С. (optional, default to 0)
     * @param count По. (optional, default to 10)
     * @param filterCityId  (optional)
     * @param filterAtegoryID  (optional)
     * @param filterName  (optional)
     * @param filterArchivedShowMode  (optional)
     * @return ResultModelOfListOfMerchantInfoModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfMerchantInfoModel communicationOfferGetMerchantInfosByBrand(Integer id, Integer from, Integer count, Integer filterCityId, Integer filterAtegoryID, String filterName, String filterArchivedShowMode) throws RestClientException {
        return communicationOfferGetMerchantInfosByBrandWithHttpInfo(id, from, count, filterCityId, filterAtegoryID, filterName, filterArchivedShowMode).getBody();
    }

    /**
     * Возвращает список магазинов достпных для рекламного материала.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор рекламного материала. (required)
     * @param from С. (optional, default to 0)
     * @param count По. (optional, default to 10)
     * @param filterCityId  (optional)
     * @param filterAtegoryID  (optional)
     * @param filterName  (optional)
     * @param filterArchivedShowMode  (optional)
     * @return ResponseEntity&lt;ResultModelOfListOfMerchantInfoModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfMerchantInfoModel> communicationOfferGetMerchantInfosByBrandWithHttpInfo(Integer id, Integer from, Integer count, Integer filterCityId, Integer filterAtegoryID, String filterName, String filterArchivedShowMode) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling communicationOfferGetMerchantInfosByBrand");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/communicationOffers/{id}/availableMerchantInfos").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.cityId", filterCityId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.сategoryID", filterAtegoryID));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.name", filterName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.archivedShowMode", filterArchivedShowMode));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfListOfMerchantInfoModel> returnType = new ParameterizedTypeReference<ResultModelOfListOfMerchantInfoModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получение описания детали для акции.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор деталей. (required)
     * @return ResultModelOfCommunicationOfferModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfCommunicationOfferModel communicationOfferGetOffer(Integer id) throws RestClientException {
        return communicationOfferGetOfferWithHttpInfo(id).getBody();
    }

    /**
     * Получение описания детали для акции.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор деталей. (required)
     * @return ResponseEntity&lt;ResultModelOfCommunicationOfferModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfCommunicationOfferModel> communicationOfferGetOfferWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling communicationOfferGetOffer");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/communicationOffers/{id}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfCommunicationOfferModel> returnType = new ParameterizedTypeReference<ResultModelOfCommunicationOfferModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Возвращает список всех инструкций для акций.
     * 
     * <p><b>200</b> - OK
     * @param from С какой акции. (optional, default to 0)
     * @param count Сколько. (optional, default to 10)
     * @param filterCommunicationOfferState Статус акции. (optional)
     * @param filterFromDate Дата С. (optional)
     * @param filterToDate Дата По. (optional)
     * @param filterBrandIds Набор идентификаторов брендов. (optional)
     * @param filterCategoriesIds Набор идентификаторов категорий рекламных материалов. (optional)
     * @param filterName Подстрока для поиска по имени. (optional)
     * @param filterIsArchived Признак удаления. (optional)
     * @param filterPriorityMin Минимальный приоритет. (optional)
     * @param filterPriorityMax Максимальный приоритет. (optional)
     * @return ResultModelOfPagedViewModelOfCommunicationOfferModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfCommunicationOfferModel communicationOfferGetOffers(Integer from, Integer count, String filterCommunicationOfferState, OffsetDateTime filterFromDate, OffsetDateTime filterToDate, List<Integer> filterBrandIds, List<Integer> filterCategoriesIds, String filterName, String filterIsArchived, Integer filterPriorityMin, Integer filterPriorityMax) throws RestClientException {
        return communicationOfferGetOffersWithHttpInfo(from, count, filterCommunicationOfferState, filterFromDate, filterToDate, filterBrandIds, filterCategoriesIds, filterName, filterIsArchived, filterPriorityMin, filterPriorityMax).getBody();
    }

    /**
     * Возвращает список всех инструкций для акций.
     * 
     * <p><b>200</b> - OK
     * @param from С какой акции. (optional, default to 0)
     * @param count Сколько. (optional, default to 10)
     * @param filterCommunicationOfferState Статус акции. (optional)
     * @param filterFromDate Дата С. (optional)
     * @param filterToDate Дата По. (optional)
     * @param filterBrandIds Набор идентификаторов брендов. (optional)
     * @param filterCategoriesIds Набор идентификаторов категорий рекламных материалов. (optional)
     * @param filterName Подстрока для поиска по имени. (optional)
     * @param filterIsArchived Признак удаления. (optional)
     * @param filterPriorityMin Минимальный приоритет. (optional)
     * @param filterPriorityMax Максимальный приоритет. (optional)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfCommunicationOfferModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfCommunicationOfferModel> communicationOfferGetOffersWithHttpInfo(Integer from, Integer count, String filterCommunicationOfferState, OffsetDateTime filterFromDate, OffsetDateTime filterToDate, List<Integer> filterBrandIds, List<Integer> filterCategoriesIds, String filterName, String filterIsArchived, Integer filterPriorityMin, Integer filterPriorityMax) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/communicationOffers").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.communicationOfferState", filterCommunicationOfferState));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.fromDate", filterFromDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.toDate", filterToDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "filter.brandIds", filterBrandIds));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "filter.categoriesIds", filterCategoriesIds));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.name", filterName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.isArchived", filterIsArchived));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.priorityMin", filterPriorityMin));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.priorityMax", filterPriorityMax));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfCommunicationOfferModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfCommunicationOfferModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Возвращает список целевых аудиторий.
     * 
     * <p><b>200</b> - OK
     * @param id Id рекламных материалов. (required)
     * @param from С. (optional, default to 0)
     * @param count По. (optional, default to 10)
     * @param filterDateFrom  (optional)
     * @param filterDateTo  (optional)
     * @param filterPartnerIds  (optional)
     * @param filterLoyaltyPrograms  (optional)
     * @param filterCreatorIds  (optional)
     * @param filterName  (optional)
     * @param filterArchivedShowMode  (optional)
     * @param filterCalculatedShowMode  (optional)
     * @return ResultModelOfPagedViewModelOfTargetGroupViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfTargetGroupViewModel communicationOfferGetTargetGroups(Integer id, Integer from, Integer count, OffsetDateTime filterDateFrom, OffsetDateTime filterDateTo, List<Integer> filterPartnerIds, List<Integer> filterLoyaltyPrograms, List<Integer> filterCreatorIds, String filterName, String filterArchivedShowMode, String filterCalculatedShowMode) throws RestClientException {
        return communicationOfferGetTargetGroupsWithHttpInfo(id, from, count, filterDateFrom, filterDateTo, filterPartnerIds, filterLoyaltyPrograms, filterCreatorIds, filterName, filterArchivedShowMode, filterCalculatedShowMode).getBody();
    }

    /**
     * Возвращает список целевых аудиторий.
     * 
     * <p><b>200</b> - OK
     * @param id Id рекламных материалов. (required)
     * @param from С. (optional, default to 0)
     * @param count По. (optional, default to 10)
     * @param filterDateFrom  (optional)
     * @param filterDateTo  (optional)
     * @param filterPartnerIds  (optional)
     * @param filterLoyaltyPrograms  (optional)
     * @param filterCreatorIds  (optional)
     * @param filterName  (optional)
     * @param filterArchivedShowMode  (optional)
     * @param filterCalculatedShowMode  (optional)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfTargetGroupViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfTargetGroupViewModel> communicationOfferGetTargetGroupsWithHttpInfo(Integer id, Integer from, Integer count, OffsetDateTime filterDateFrom, OffsetDateTime filterDateTo, List<Integer> filterPartnerIds, List<Integer> filterLoyaltyPrograms, List<Integer> filterCreatorIds, String filterName, String filterArchivedShowMode, String filterCalculatedShowMode) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling communicationOfferGetTargetGroups");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/communicationOffers/availableTargetGroups").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "id", id));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.dateFrom", filterDateFrom));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.dateTo", filterDateTo));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "filter.partnerIds", filterPartnerIds));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "filter.loyaltyPrograms", filterLoyaltyPrograms));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "filter.creatorIds", filterCreatorIds));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.name", filterName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.archivedShowMode", filterArchivedShowMode));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.calculatedShowMode", filterCalculatedShowMode));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfTargetGroupViewModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfTargetGroupViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Востановить акцию.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel communicationOfferRestoreOffer(Integer id) throws RestClientException {
        return communicationOfferRestoreOfferWithHttpInfo(id).getBody();
    }

    /**
     * Востановить акцию.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> communicationOfferRestoreOfferWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling communicationOfferRestoreOffer");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/communicationOffers/{id}/Restore").buildAndExpand(uriVariables).toUriString();

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
