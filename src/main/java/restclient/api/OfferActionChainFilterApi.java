package restclient.api;

import restclient.ApiClient;

import restclient.model.FilterViewModel;
import restclient.model.ResultModel;
import restclient.model.ResultModelOfFilterViewModel;
import restclient.model.ResultModelOfInt32;
import restclient.model.ResultModelOfListOfAnketaQuestionViewModel;
import restclient.model.ResultModelOfListOfCardEmissionModel;
import restclient.model.ResultModelOfListOfCardState;
import restclient.model.ResultModelOfListOfDayOfWeek;
import restclient.model.ResultModelOfListOfFilterViewModel;
import restclient.model.ResultModelOfListOfPersonState;
import restclient.model.ResultModelOfPagedViewModelOfOfferInfoShortViewModel;

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
@Component("restclient.api.OfferActionChainFilterApi")
public class OfferActionChainFilterApi {
    private ApiClient apiClient;

    public OfferActionChainFilterApi() {
        this(new ApiClient());
    }

    @Autowired
    public OfferActionChainFilterApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Создание фильтра.
     * 
     * <p><b>201</b> - Created
     * @param offerId Идентификатор акции. (required)
     * @param offerChainId Идентификатор цепочки. (required)
     * @param filterViewModel Фильтр на создание. (required)
     * @return ResultModelOfInt32
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfInt32 offerActionChainFilterCreateFilter(Integer offerId, Integer offerChainId, FilterViewModel filterViewModel) throws RestClientException {
        return offerActionChainFilterCreateFilterWithHttpInfo(offerId, offerChainId, filterViewModel).getBody();
    }

    /**
     * Создание фильтра.
     * 
     * <p><b>201</b> - Created
     * @param offerId Идентификатор акции. (required)
     * @param offerChainId Идентификатор цепочки. (required)
     * @param filterViewModel Фильтр на создание. (required)
     * @return ResponseEntity&lt;ResultModelOfInt32&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfInt32> offerActionChainFilterCreateFilterWithHttpInfo(Integer offerId, Integer offerChainId, FilterViewModel filterViewModel) throws RestClientException {
        Object postBody = filterViewModel;
        
        // verify the required parameter 'offerId' is set
        if (offerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'offerId' when calling offerActionChainFilterCreateFilter");
        }
        
        // verify the required parameter 'offerChainId' is set
        if (offerChainId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'offerChainId' when calling offerActionChainFilterCreateFilter");
        }
        
        // verify the required parameter 'filterViewModel' is set
        if (filterViewModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'filterViewModel' when calling offerActionChainFilterCreateFilter");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("offerId", offerId);
        uriVariables.put("offerChainId", offerChainId);
        String path = UriComponentsBuilder.fromPath("/api/Offers/{offerId}/offerChains/{offerChainId}/filters").buildAndExpand(uriVariables).toUriString();

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
     * Производит удаление фильтра.
     * 
     * <p><b>200</b> - OK
     * @param offerId Идентификатор акции. (required)
     * @param offerChainId Идентификатор цепочки. (required)
     * @param filterId Идентификатор фильтра. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel offerActionChainFilterDeleteFilter(Integer offerId, Integer offerChainId, Integer filterId) throws RestClientException {
        return offerActionChainFilterDeleteFilterWithHttpInfo(offerId, offerChainId, filterId).getBody();
    }

    /**
     * Производит удаление фильтра.
     * 
     * <p><b>200</b> - OK
     * @param offerId Идентификатор акции. (required)
     * @param offerChainId Идентификатор цепочки. (required)
     * @param filterId Идентификатор фильтра. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> offerActionChainFilterDeleteFilterWithHttpInfo(Integer offerId, Integer offerChainId, Integer filterId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'offerId' is set
        if (offerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'offerId' when calling offerActionChainFilterDeleteFilter");
        }
        
        // verify the required parameter 'offerChainId' is set
        if (offerChainId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'offerChainId' when calling offerActionChainFilterDeleteFilter");
        }
        
        // verify the required parameter 'filterId' is set
        if (filterId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'filterId' when calling offerActionChainFilterDeleteFilter");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("offerId", offerId);
        uriVariables.put("offerChainId", offerChainId);
        uriVariables.put("filterId", filterId);
        String path = UriComponentsBuilder.fromPath("/api/Offers/{offerId}/offerChains/{offerChainId}/filters/{filterId}").buildAndExpand(uriVariables).toUriString();

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
     * Редактирование фильтра.
     * 
     * <p><b>200</b> - OK
     * @param offerId Идентификатор акции. (required)
     * @param offerChainId Идентификатор цепочки действий. (required)
     * @param filterId Идентификатор фильтра. (required)
     * @param filterViewModel Фильтр на обновление. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel offerActionChainFilterEditFilter(Integer offerId, Integer offerChainId, Integer filterId, FilterViewModel filterViewModel) throws RestClientException {
        return offerActionChainFilterEditFilterWithHttpInfo(offerId, offerChainId, filterId, filterViewModel).getBody();
    }

    /**
     * Редактирование фильтра.
     * 
     * <p><b>200</b> - OK
     * @param offerId Идентификатор акции. (required)
     * @param offerChainId Идентификатор цепочки действий. (required)
     * @param filterId Идентификатор фильтра. (required)
     * @param filterViewModel Фильтр на обновление. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> offerActionChainFilterEditFilterWithHttpInfo(Integer offerId, Integer offerChainId, Integer filterId, FilterViewModel filterViewModel) throws RestClientException {
        Object postBody = filterViewModel;
        
        // verify the required parameter 'offerId' is set
        if (offerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'offerId' when calling offerActionChainFilterEditFilter");
        }
        
        // verify the required parameter 'offerChainId' is set
        if (offerChainId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'offerChainId' when calling offerActionChainFilterEditFilter");
        }
        
        // verify the required parameter 'filterId' is set
        if (filterId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'filterId' when calling offerActionChainFilterEditFilter");
        }
        
        // verify the required parameter 'filterViewModel' is set
        if (filterViewModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'filterViewModel' when calling offerActionChainFilterEditFilter");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("offerId", offerId);
        uriVariables.put("offerChainId", offerChainId);
        uriVariables.put("filterId", filterId);
        String path = UriComponentsBuilder.fromPath("/api/Offers/{offerId}/offerChains/{offerChainId}/filters/{filterId}").buildAndExpand(uriVariables).toUriString();

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
     * Возвращает список всех состояний карты.
     * 
     * <p><b>200</b> - OK
     * @return ResultModelOfListOfCardState
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfCardState offerActionChainFilterGetCardStates() throws RestClientException {
        return offerActionChainFilterGetCardStatesWithHttpInfo().getBody();
    }

    /**
     * Возвращает список всех состояний карты.
     * 
     * <p><b>200</b> - OK
     * @return ResponseEntity&lt;ResultModelOfListOfCardState&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfCardState> offerActionChainFilterGetCardStatesWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/Filters/AvailableCardStates").build().toUriString();

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

        ParameterizedTypeReference<ResultModelOfListOfCardState> returnType = new ParameterizedTypeReference<ResultModelOfListOfCardState>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить список всех выпусков карт.
     * 
     * <p><b>200</b> - OK
     * @return ResultModelOfListOfCardEmissionModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfCardEmissionModel offerActionChainFilterGetEmissions() throws RestClientException {
        return offerActionChainFilterGetEmissionsWithHttpInfo().getBody();
    }

    /**
     * Получить список всех выпусков карт.
     * 
     * <p><b>200</b> - OK
     * @return ResponseEntity&lt;ResultModelOfListOfCardEmissionModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfCardEmissionModel> offerActionChainFilterGetEmissionsWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/Filters/AvailableCardEmissions").build().toUriString();

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

        ParameterizedTypeReference<ResultModelOfListOfCardEmissionModel> returnType = new ParameterizedTypeReference<ResultModelOfListOfCardEmissionModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получает информацию о фильтре.
     * 
     * <p><b>200</b> - OK
     * @param offerId Идентификатор акции. (required)
     * @param offerChainId Идентификатор цепочки действий. (required)
     * @param filterId Идентификатор фильтра. (required)
     * @param version Тип версии. (optional, default to Draft)
     * @param offerVersionId Версия акции. (optional)
     * @return ResultModelOfFilterViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfFilterViewModel offerActionChainFilterGetFilter(Integer offerId, Integer offerChainId, Integer filterId, String version, Integer offerVersionId) throws RestClientException {
        return offerActionChainFilterGetFilterWithHttpInfo(offerId, offerChainId, filterId, version, offerVersionId).getBody();
    }

    /**
     * Получает информацию о фильтре.
     * 
     * <p><b>200</b> - OK
     * @param offerId Идентификатор акции. (required)
     * @param offerChainId Идентификатор цепочки действий. (required)
     * @param filterId Идентификатор фильтра. (required)
     * @param version Тип версии. (optional, default to Draft)
     * @param offerVersionId Версия акции. (optional)
     * @return ResponseEntity&lt;ResultModelOfFilterViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfFilterViewModel> offerActionChainFilterGetFilterWithHttpInfo(Integer offerId, Integer offerChainId, Integer filterId, String version, Integer offerVersionId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'offerId' is set
        if (offerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'offerId' when calling offerActionChainFilterGetFilter");
        }
        
        // verify the required parameter 'offerChainId' is set
        if (offerChainId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'offerChainId' when calling offerActionChainFilterGetFilter");
        }
        
        // verify the required parameter 'filterId' is set
        if (filterId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'filterId' when calling offerActionChainFilterGetFilter");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("offerId", offerId);
        uriVariables.put("offerChainId", offerChainId);
        uriVariables.put("filterId", filterId);
        String path = UriComponentsBuilder.fromPath("/api/Offers/{offerId}/offerChains/{offerChainId}/filters/{filterId}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "version", version));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offerVersionId", offerVersionId));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfFilterViewModel> returnType = new ParameterizedTypeReference<ResultModelOfFilterViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получает информацию о фильтрах цепочки действий.
     * 
     * <p><b>200</b> - OK
     * @param offerId Идентификатор акции. (required)
     * @param offerChainId Идентификатор цепочки действий. (required)
     * @param version Тип версии. (optional, default to Draft)
     * @param filterModelType Тип информации о фильтре. (optional, default to Short)
     * @return ResultModelOfListOfFilterViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfFilterViewModel offerActionChainFilterGetFilters(Integer offerId, Integer offerChainId, String version, String filterModelType) throws RestClientException {
        return offerActionChainFilterGetFiltersWithHttpInfo(offerId, offerChainId, version, filterModelType).getBody();
    }

    /**
     * Получает информацию о фильтрах цепочки действий.
     * 
     * <p><b>200</b> - OK
     * @param offerId Идентификатор акции. (required)
     * @param offerChainId Идентификатор цепочки действий. (required)
     * @param version Тип версии. (optional, default to Draft)
     * @param filterModelType Тип информации о фильтре. (optional, default to Short)
     * @return ResponseEntity&lt;ResultModelOfListOfFilterViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfFilterViewModel> offerActionChainFilterGetFiltersWithHttpInfo(Integer offerId, Integer offerChainId, String version, String filterModelType) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'offerId' is set
        if (offerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'offerId' when calling offerActionChainFilterGetFilters");
        }
        
        // verify the required parameter 'offerChainId' is set
        if (offerChainId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'offerChainId' when calling offerActionChainFilterGetFilters");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("offerId", offerId);
        uriVariables.put("offerChainId", offerChainId);
        String path = UriComponentsBuilder.fromPath("/api/Offers/{offerId}/offerChains/{offerChainId}/filters").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "version", version));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filterModelType", filterModelType));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfListOfFilterViewModel> returnType = new ParameterizedTypeReference<ResultModelOfListOfFilterViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить список доступных в фильтрах акций.
     * 
     * <p><b>200</b> - OK
     * @param partnerId Идентификатор партнера. (required)
     * @param name Название акции. (optional, default to )
     * @param from С. (optional, default to 0)
     * @param count Размер страницы. (optional, default to 10)
     * @return ResultModelOfPagedViewModelOfOfferInfoShortViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfOfferInfoShortViewModel offerActionChainFilterGetFiltersOffers(Integer partnerId, String name, Integer from, Integer count) throws RestClientException {
        return offerActionChainFilterGetFiltersOffersWithHttpInfo(partnerId, name, from, count).getBody();
    }

    /**
     * Получить список доступных в фильтрах акций.
     * 
     * <p><b>200</b> - OK
     * @param partnerId Идентификатор партнера. (required)
     * @param name Название акции. (optional, default to )
     * @param from С. (optional, default to 0)
     * @param count Размер страницы. (optional, default to 10)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfOfferInfoShortViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfOfferInfoShortViewModel> offerActionChainFilterGetFiltersOffersWithHttpInfo(Integer partnerId, String name, Integer from, Integer count) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'partnerId' is set
        if (partnerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partnerId' when calling offerActionChainFilterGetFiltersOffers");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/Filters/AvailableOffers").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "partnerId", partnerId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));

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
     * Возвращает список всех состояний пользователя.
     * 
     * <p><b>200</b> - OK
     * @return ResultModelOfListOfPersonState
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfPersonState offerActionChainFilterGetPersonStates() throws RestClientException {
        return offerActionChainFilterGetPersonStatesWithHttpInfo().getBody();
    }

    /**
     * Возвращает список всех состояний пользователя.
     * 
     * <p><b>200</b> - OK
     * @return ResponseEntity&lt;ResultModelOfListOfPersonState&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfPersonState> offerActionChainFilterGetPersonStatesWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/Filters/AvailablePersonStates").build().toUriString();

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

        ParameterizedTypeReference<ResultModelOfListOfPersonState> returnType = new ParameterizedTypeReference<ResultModelOfListOfPersonState>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить вопросы для фильтра.
     * 
     * <p><b>200</b> - OK
     * @param id Id фильтра. (required)
     * @return ResultModelOfListOfAnketaQuestionViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfAnketaQuestionViewModel offerActionChainFilterGetQuestions(Integer id) throws RestClientException {
        return offerActionChainFilterGetQuestionsWithHttpInfo(id).getBody();
    }

    /**
     * Получить вопросы для фильтра.
     * 
     * <p><b>200</b> - OK
     * @param id Id фильтра. (required)
     * @return ResponseEntity&lt;ResultModelOfListOfAnketaQuestionViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfAnketaQuestionViewModel> offerActionChainFilterGetQuestionsWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling offerActionChainFilterGetQuestions");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/Filters/{id}/questions").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfListOfAnketaQuestionViewModel> returnType = new ParameterizedTypeReference<ResultModelOfListOfAnketaQuestionViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Возвращает список всех дней недели.
     * 
     * <p><b>200</b> - OK
     * @return ResultModelOfListOfDayOfWeek
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfDayOfWeek offerActionChainFilterGetWeekDays() throws RestClientException {
        return offerActionChainFilterGetWeekDaysWithHttpInfo().getBody();
    }

    /**
     * Возвращает список всех дней недели.
     * 
     * <p><b>200</b> - OK
     * @return ResponseEntity&lt;ResultModelOfListOfDayOfWeek&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfDayOfWeek> offerActionChainFilterGetWeekDaysWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/Filters/AvailableWeekDays").build().toUriString();

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

        ParameterizedTypeReference<ResultModelOfListOfDayOfWeek> returnType = new ParameterizedTypeReference<ResultModelOfListOfDayOfWeek>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
