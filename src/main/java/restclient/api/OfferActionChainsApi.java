package restclient.api;

import restclient.ApiClient;

import restclient.model.CreateOfferActionChainModel;
import restclient.model.OfferActionChainViewModel;
import restclient.model.ResultModel;
import restclient.model.ResultModelOfActionPlacementInfo;
import restclient.model.ResultModelOfListOfActionTypeModel;
import restclient.model.ResultModelOfListOfOfferEventInfoModel;
import restclient.model.ResultModelOfListOfOfferEventModel;
import restclient.model.ResultModelOfOfferActionChainViewModel;
import restclient.model.ResultModelOfPagedViewModelOfOfferActionChainViewModel;

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
@Component("restclient.api.OfferActionChainsApi")
public class OfferActionChainsApi {
    private ApiClient apiClient;

    public OfferActionChainsApi() {
        this(new ApiClient());
    }

    @Autowired
    public OfferActionChainsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Создает цепочку событий.
     * 
     * <p><b>201</b> - Created
     * @param offerId Идентификатор акции. (required)
     * @param viewModel Данные цепочки. (required)
     * @return ResultModelOfOfferActionChainViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfOfferActionChainViewModel offerActionChainsCreateOfferActionChain(Integer offerId, CreateOfferActionChainModel viewModel) throws RestClientException {
        return offerActionChainsCreateOfferActionChainWithHttpInfo(offerId, viewModel).getBody();
    }

    /**
     * Создает цепочку событий.
     * 
     * <p><b>201</b> - Created
     * @param offerId Идентификатор акции. (required)
     * @param viewModel Данные цепочки. (required)
     * @return ResponseEntity&lt;ResultModelOfOfferActionChainViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfOfferActionChainViewModel> offerActionChainsCreateOfferActionChainWithHttpInfo(Integer offerId, CreateOfferActionChainModel viewModel) throws RestClientException {
        Object postBody = viewModel;
        
        // verify the required parameter 'offerId' is set
        if (offerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'offerId' when calling offerActionChainsCreateOfferActionChain");
        }
        
        // verify the required parameter 'viewModel' is set
        if (viewModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'viewModel' when calling offerActionChainsCreateOfferActionChain");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("offerId", offerId);
        String path = UriComponentsBuilder.fromPath("/api/Offers/{offerId}/offerChains").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfOfferActionChainViewModel> returnType = new ParameterizedTypeReference<ResultModelOfOfferActionChainViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Удаление цепочки акций.
     * 
     * <p><b>200</b> - OK
     * @param offerId Идентификатор акции. (required)
     * @param offerChainId Идентификатор цепочки. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel offerActionChainsDeleteActionChain(Integer offerId, Integer offerChainId) throws RestClientException {
        return offerActionChainsDeleteActionChainWithHttpInfo(offerId, offerChainId).getBody();
    }

    /**
     * Удаление цепочки акций.
     * 
     * <p><b>200</b> - OK
     * @param offerId Идентификатор акции. (required)
     * @param offerChainId Идентификатор цепочки. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> offerActionChainsDeleteActionChainWithHttpInfo(Integer offerId, Integer offerChainId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'offerId' is set
        if (offerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'offerId' when calling offerActionChainsDeleteActionChain");
        }
        
        // verify the required parameter 'offerChainId' is set
        if (offerChainId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'offerChainId' when calling offerActionChainsDeleteActionChain");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("offerId", offerId);
        uriVariables.put("offerChainId", offerChainId);
        String path = UriComponentsBuilder.fromPath("/api/Offers/{offerId}/offerChains/{offerChainId}").buildAndExpand(uriVariables).toUriString();

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
     * Редактирует цепочку событий.
     * 
     * <p><b>200</b> - OK
     * @param offerId Идентификатор акции. (required)
     * @param offerChainId Идентификатор цепочки действий. (required)
     * @param viewModel Модель редактирования цепочки действий для акции. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel offerActionChainsEditOfferActionChain(Integer offerId, Integer offerChainId, OfferActionChainViewModel viewModel) throws RestClientException {
        return offerActionChainsEditOfferActionChainWithHttpInfo(offerId, offerChainId, viewModel).getBody();
    }

    /**
     * Редактирует цепочку событий.
     * 
     * <p><b>200</b> - OK
     * @param offerId Идентификатор акции. (required)
     * @param offerChainId Идентификатор цепочки действий. (required)
     * @param viewModel Модель редактирования цепочки действий для акции. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> offerActionChainsEditOfferActionChainWithHttpInfo(Integer offerId, Integer offerChainId, OfferActionChainViewModel viewModel) throws RestClientException {
        Object postBody = viewModel;
        
        // verify the required parameter 'offerId' is set
        if (offerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'offerId' when calling offerActionChainsEditOfferActionChain");
        }
        
        // verify the required parameter 'offerChainId' is set
        if (offerChainId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'offerChainId' when calling offerActionChainsEditOfferActionChain");
        }
        
        // verify the required parameter 'viewModel' is set
        if (viewModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'viewModel' when calling offerActionChainsEditOfferActionChain");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("offerId", offerId);
        uriVariables.put("offerChainId", offerChainId);
        String path = UriComponentsBuilder.fromPath("/api/Offers/{offerId}/offerChains/{offerChainId}").buildAndExpand(uriVariables).toUriString();

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
     * Получает список доступных действий.
     * 
     * <p><b>200</b> - OK
     * @param offerId Идентификатор акции. (required)
     * @param eventType Тип события. (required)
     * @param exclusionType Тип события, по которому требуется отфильтровать типы действий. (optional)
     * @param chainId Идентификатор цепочки действий. (optional)
     * @return ResultModelOfListOfActionTypeModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfActionTypeModel offerActionChainsGetAvailableActionTypes(Integer offerId, String eventType, String exclusionType, Integer chainId) throws RestClientException {
        return offerActionChainsGetAvailableActionTypesWithHttpInfo(offerId, eventType, exclusionType, chainId).getBody();
    }

    /**
     * Получает список доступных действий.
     * 
     * <p><b>200</b> - OK
     * @param offerId Идентификатор акции. (required)
     * @param eventType Тип события. (required)
     * @param exclusionType Тип события, по которому требуется отфильтровать типы действий. (optional)
     * @param chainId Идентификатор цепочки действий. (optional)
     * @return ResponseEntity&lt;ResultModelOfListOfActionTypeModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfActionTypeModel> offerActionChainsGetAvailableActionTypesWithHttpInfo(Integer offerId, String eventType, String exclusionType, Integer chainId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'offerId' is set
        if (offerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'offerId' when calling offerActionChainsGetAvailableActionTypes");
        }
        
        // verify the required parameter 'eventType' is set
        if (eventType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'eventType' when calling offerActionChainsGetAvailableActionTypes");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("offerId", offerId);
        String path = UriComponentsBuilder.fromPath("/api/Offers/{offerId}/AvailableActionTypes").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "eventType", eventType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "exclusionType", exclusionType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "chainId", chainId));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfListOfActionTypeModel> returnType = new ParameterizedTypeReference<ResultModelOfListOfActionTypeModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получает список доступных событий.
     * 
     * <p><b>200</b> - OK
     * @return ResultModelOfListOfOfferEventModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfOfferEventModel offerActionChainsGetAvailableEventTypes() throws RestClientException {
        return offerActionChainsGetAvailableEventTypesWithHttpInfo().getBody();
    }

    /**
     * Получает список доступных событий.
     * 
     * <p><b>200</b> - OK
     * @return ResponseEntity&lt;ResultModelOfListOfOfferEventModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfOfferEventModel> offerActionChainsGetAvailableEventTypesWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/Offers/AvailableEventTypes").build().toUriString();

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

        ParameterizedTypeReference<ResultModelOfListOfOfferEventModel> returnType = new ParameterizedTypeReference<ResultModelOfListOfOfferEventModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получает список имеющихся действий.
     * 
     * <p><b>200</b> - OK
     * @param offerId Идентификатор акции. (required)
     * @param version Тип версии. (optional, default to Draft)
     * @return ResultModelOfListOfOfferEventInfoModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfOfferEventInfoModel offerActionChainsGetEventTypes(Integer offerId, String version) throws RestClientException {
        return offerActionChainsGetEventTypesWithHttpInfo(offerId, version).getBody();
    }

    /**
     * Получает список имеющихся действий.
     * 
     * <p><b>200</b> - OK
     * @param offerId Идентификатор акции. (required)
     * @param version Тип версии. (optional, default to Draft)
     * @return ResponseEntity&lt;ResultModelOfListOfOfferEventInfoModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfOfferEventInfoModel> offerActionChainsGetEventTypesWithHttpInfo(Integer offerId, String version) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'offerId' is set
        if (offerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'offerId' when calling offerActionChainsGetEventTypes");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("offerId", offerId);
        String path = UriComponentsBuilder.fromPath("/api/Offers/{offerId}/offerChains/eventTypes").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "version", version));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfListOfOfferEventInfoModel> returnType = new ParameterizedTypeReference<ResultModelOfListOfOfferEventInfoModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получает цепочку событий.
     * 
     * <p><b>200</b> - OK
     * @param offerId Идентификатор акции. (required)
     * @param offerChainId Идентификатор цепочки действий. (required)
     * @param version Тип версии. (optional, default to Draft)
     * @return ResultModelOfOfferActionChainViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfOfferActionChainViewModel offerActionChainsGetOfferActionChain(Integer offerId, Integer offerChainId, String version) throws RestClientException {
        return offerActionChainsGetOfferActionChainWithHttpInfo(offerId, offerChainId, version).getBody();
    }

    /**
     * Получает цепочку событий.
     * 
     * <p><b>200</b> - OK
     * @param offerId Идентификатор акции. (required)
     * @param offerChainId Идентификатор цепочки действий. (required)
     * @param version Тип версии. (optional, default to Draft)
     * @return ResponseEntity&lt;ResultModelOfOfferActionChainViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfOfferActionChainViewModel> offerActionChainsGetOfferActionChainWithHttpInfo(Integer offerId, Integer offerChainId, String version) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'offerId' is set
        if (offerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'offerId' when calling offerActionChainsGetOfferActionChain");
        }
        
        // verify the required parameter 'offerChainId' is set
        if (offerChainId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'offerChainId' when calling offerActionChainsGetOfferActionChain");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("offerId", offerId);
        uriVariables.put("offerChainId", offerChainId);
        String path = UriComponentsBuilder.fromPath("/api/Offers/{offerId}/offerChains/{offerChainId}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "version", version));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfOfferActionChainViewModel> returnType = new ParameterizedTypeReference<ResultModelOfOfferActionChainViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получает все цепочки событий акции.
     * 
     * <p><b>200</b> - OK
     * @param offerId Идентификатор акции. (required)
     * @param version Тип версии. (optional, default to Draft)
     * @param eventType Тип события. (optional)
     * @param parentId Идентификатор родительского действия. (optional)
     * @param from Начало выборки. (optional, default to 0)
     * @param count Объем выборки. (optional, default to 2147483647)
     * @return ResultModelOfPagedViewModelOfOfferActionChainViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfOfferActionChainViewModel offerActionChainsGetOfferActionChains(Integer offerId, String version, String eventType, Integer parentId, Integer from, Integer count) throws RestClientException {
        return offerActionChainsGetOfferActionChainsWithHttpInfo(offerId, version, eventType, parentId, from, count).getBody();
    }

    /**
     * Получает все цепочки событий акции.
     * 
     * <p><b>200</b> - OK
     * @param offerId Идентификатор акции. (required)
     * @param version Тип версии. (optional, default to Draft)
     * @param eventType Тип события. (optional)
     * @param parentId Идентификатор родительского действия. (optional)
     * @param from Начало выборки. (optional, default to 0)
     * @param count Объем выборки. (optional, default to 2147483647)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfOfferActionChainViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfOfferActionChainViewModel> offerActionChainsGetOfferActionChainsWithHttpInfo(Integer offerId, String version, String eventType, Integer parentId, Integer from, Integer count) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'offerId' is set
        if (offerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'offerId' when calling offerActionChainsGetOfferActionChains");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("offerId", offerId);
        String path = UriComponentsBuilder.fromPath("/api/Offers/{offerId}/offerChains").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "version", version));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "eventType", eventType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "parentId", parentId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfOfferActionChainViewModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfOfferActionChainViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить информацию о родительском действии по идентификатору.
     * 
     * <p><b>200</b> - OK
     * @param offerId Идентификатор акции. (required)
     * @param actionId Идентификатор действия. (required)
     * @return ResultModelOfActionPlacementInfo
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfActionPlacementInfo offerActionChainsGetParentActionIndex(Integer offerId, Integer actionId) throws RestClientException {
        return offerActionChainsGetParentActionIndexWithHttpInfo(offerId, actionId).getBody();
    }

    /**
     * Получить информацию о родительском действии по идентификатору.
     * 
     * <p><b>200</b> - OK
     * @param offerId Идентификатор акции. (required)
     * @param actionId Идентификатор действия. (required)
     * @return ResponseEntity&lt;ResultModelOfActionPlacementInfo&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfActionPlacementInfo> offerActionChainsGetParentActionIndexWithHttpInfo(Integer offerId, Integer actionId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'offerId' is set
        if (offerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'offerId' when calling offerActionChainsGetParentActionIndex");
        }
        
        // verify the required parameter 'actionId' is set
        if (actionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'actionId' when calling offerActionChainsGetParentActionIndex");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("offerId", offerId);
        uriVariables.put("actionId", actionId);
        String path = UriComponentsBuilder.fromPath("/api/Offers/{offerId}/offerChains/parentActions/{actionId}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfActionPlacementInfo> returnType = new ParameterizedTypeReference<ResultModelOfActionPlacementInfo>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
