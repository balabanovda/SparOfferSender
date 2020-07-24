package restclient.api;

import restclient.ApiClient;

import restclient.model.OfferActionViewModelBase;
import restclient.model.ResultModel;
import restclient.model.ResultModelOfInt32;
import restclient.model.ResultModelOfListOfOfferActionViewModelBase;
import restclient.model.ResultModelOfOfferActionViewModelBase;

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
@Component("restclient.api.OfferActionsApi")
public class OfferActionsApi {
    private ApiClient apiClient;

    public OfferActionsApi() {
        this(new ApiClient());
    }

    @Autowired
    public OfferActionsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Создание действия акции.
     * 
     * <p><b>201</b> - Created
     * @param offerId Идентификатор акции. (required)
     * @param offerChainId Идентификатор цепочки действий. (required)
     * @param offerActionViewModelBase Модель. (required)
     * @return ResultModelOfInt32
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfInt32 offerActionsCreateOfferAction(Integer offerId, Integer offerChainId, OfferActionViewModelBase offerActionViewModelBase) throws RestClientException {
        return offerActionsCreateOfferActionWithHttpInfo(offerId, offerChainId, offerActionViewModelBase).getBody();
    }

    /**
     * Создание действия акции.
     * 
     * <p><b>201</b> - Created
     * @param offerId Идентификатор акции. (required)
     * @param offerChainId Идентификатор цепочки действий. (required)
     * @param offerActionViewModelBase Модель. (required)
     * @return ResponseEntity&lt;ResultModelOfInt32&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfInt32> offerActionsCreateOfferActionWithHttpInfo(Integer offerId, Integer offerChainId, OfferActionViewModelBase offerActionViewModelBase) throws RestClientException {
        Object postBody = offerActionViewModelBase;
        
        // verify the required parameter 'offerId' is set
        if (offerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'offerId' when calling offerActionsCreateOfferAction");
        }
        
        // verify the required parameter 'offerChainId' is set
        if (offerChainId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'offerChainId' when calling offerActionsCreateOfferAction");
        }
        
        // verify the required parameter 'offerActionViewModelBase' is set
        if (offerActionViewModelBase == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'offerActionViewModelBase' when calling offerActionsCreateOfferAction");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("offerId", offerId);
        uriVariables.put("offerChainId", offerChainId);
        String path = UriComponentsBuilder.fromPath("/api/Offers/{offerId}/offerChains/{offerChainId}/actions").buildAndExpand(uriVariables).toUriString();

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
     * Удаление действия акции.
     * 
     * <p><b>200</b> - OK
     * @param offerId Идентификатор акции. (required)
     * @param actionId Идентификатор действия. (required)
     * @param offerChainId Идентификатор цепочки. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel offerActionsDeleteAction(Integer offerId, Integer actionId, Integer offerChainId) throws RestClientException {
        return offerActionsDeleteActionWithHttpInfo(offerId, actionId, offerChainId).getBody();
    }

    /**
     * Удаление действия акции.
     * 
     * <p><b>200</b> - OK
     * @param offerId Идентификатор акции. (required)
     * @param actionId Идентификатор действия. (required)
     * @param offerChainId Идентификатор цепочки. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> offerActionsDeleteActionWithHttpInfo(Integer offerId, Integer actionId, Integer offerChainId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'offerId' is set
        if (offerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'offerId' when calling offerActionsDeleteAction");
        }
        
        // verify the required parameter 'actionId' is set
        if (actionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'actionId' when calling offerActionsDeleteAction");
        }
        
        // verify the required parameter 'offerChainId' is set
        if (offerChainId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'offerChainId' when calling offerActionsDeleteAction");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("offerId", offerId);
        uriVariables.put("actionId", actionId);
        uriVariables.put("offerChainId", offerChainId);
        String path = UriComponentsBuilder.fromPath("/api/Offers/{offerId}/offerChains/{offerChainId}/actions/{actionId}").buildAndExpand(uriVariables).toUriString();

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
     * Редактирование действия акции.
     * 
     * <p><b>200</b> - OK
     * @param offerId Идентификатор акции. (required)
     * @param offerChainId Идентификатор цепочки действий. (required)
     * @param actionId Идентификатор действия. (required)
     * @param offerActionViewModelBase Модель для редактирования. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel offerActionsEditOfferAction(Integer offerId, Integer offerChainId, Integer actionId, OfferActionViewModelBase offerActionViewModelBase) throws RestClientException {
        return offerActionsEditOfferActionWithHttpInfo(offerId, offerChainId, actionId, offerActionViewModelBase).getBody();
    }

    /**
     * Редактирование действия акции.
     * 
     * <p><b>200</b> - OK
     * @param offerId Идентификатор акции. (required)
     * @param offerChainId Идентификатор цепочки действий. (required)
     * @param actionId Идентификатор действия. (required)
     * @param offerActionViewModelBase Модель для редактирования. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> offerActionsEditOfferActionWithHttpInfo(Integer offerId, Integer offerChainId, Integer actionId, OfferActionViewModelBase offerActionViewModelBase) throws RestClientException {
        Object postBody = offerActionViewModelBase;
        
        // verify the required parameter 'offerId' is set
        if (offerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'offerId' when calling offerActionsEditOfferAction");
        }
        
        // verify the required parameter 'offerChainId' is set
        if (offerChainId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'offerChainId' when calling offerActionsEditOfferAction");
        }
        
        // verify the required parameter 'actionId' is set
        if (actionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'actionId' when calling offerActionsEditOfferAction");
        }
        
        // verify the required parameter 'offerActionViewModelBase' is set
        if (offerActionViewModelBase == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'offerActionViewModelBase' when calling offerActionsEditOfferAction");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("offerId", offerId);
        uriVariables.put("offerChainId", offerChainId);
        uriVariables.put("actionId", actionId);
        String path = UriComponentsBuilder.fromPath("/api/Offers/{offerId}/offerChains/{offerChainId}/actions/{actionId}").buildAndExpand(uriVariables).toUriString();

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
     * Получает список не удаленных действий в цепочке.
     * 
     * <p><b>200</b> - OK
     * @param offerId Идентификатор акции. (required)
     * @param offerChainId Идентификатор цепочки. (required)
     * @param version Тип версии. (optional, default to Draft)
     * @return ResultModelOfListOfOfferActionViewModelBase
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfOfferActionViewModelBase offerActionsGetList(Integer offerId, Integer offerChainId, String version) throws RestClientException {
        return offerActionsGetListWithHttpInfo(offerId, offerChainId, version).getBody();
    }

    /**
     * Получает список не удаленных действий в цепочке.
     * 
     * <p><b>200</b> - OK
     * @param offerId Идентификатор акции. (required)
     * @param offerChainId Идентификатор цепочки. (required)
     * @param version Тип версии. (optional, default to Draft)
     * @return ResponseEntity&lt;ResultModelOfListOfOfferActionViewModelBase&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfOfferActionViewModelBase> offerActionsGetListWithHttpInfo(Integer offerId, Integer offerChainId, String version) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'offerId' is set
        if (offerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'offerId' when calling offerActionsGetList");
        }
        
        // verify the required parameter 'offerChainId' is set
        if (offerChainId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'offerChainId' when calling offerActionsGetList");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("offerId", offerId);
        uriVariables.put("offerChainId", offerChainId);
        String path = UriComponentsBuilder.fromPath("/api/Offers/{offerId}/offerChains/{offerChainId}/actions").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfListOfOfferActionViewModelBase> returnType = new ParameterizedTypeReference<ResultModelOfListOfOfferActionViewModelBase>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получает модель действия.
     * 
     * <p><b>200</b> - OK
     * @param offerId Идентификатор акции. (required)
     * @param offerChainId Идентификатор цепочки. (required)
     * @param actionId Идентификатор действия. (required)
     * @param version Тип версии. (optional, default to Draft)
     * @param offerVersionId Версия акции. (optional)
     * @return ResultModelOfOfferActionViewModelBase
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfOfferActionViewModelBase offerActionsGetOfferAction(Integer offerId, Integer offerChainId, Integer actionId, String version, Integer offerVersionId) throws RestClientException {
        return offerActionsGetOfferActionWithHttpInfo(offerId, offerChainId, actionId, version, offerVersionId).getBody();
    }

    /**
     * Получает модель действия.
     * 
     * <p><b>200</b> - OK
     * @param offerId Идентификатор акции. (required)
     * @param offerChainId Идентификатор цепочки. (required)
     * @param actionId Идентификатор действия. (required)
     * @param version Тип версии. (optional, default to Draft)
     * @param offerVersionId Версия акции. (optional)
     * @return ResponseEntity&lt;ResultModelOfOfferActionViewModelBase&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfOfferActionViewModelBase> offerActionsGetOfferActionWithHttpInfo(Integer offerId, Integer offerChainId, Integer actionId, String version, Integer offerVersionId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'offerId' is set
        if (offerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'offerId' when calling offerActionsGetOfferAction");
        }
        
        // verify the required parameter 'offerChainId' is set
        if (offerChainId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'offerChainId' when calling offerActionsGetOfferAction");
        }
        
        // verify the required parameter 'actionId' is set
        if (actionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'actionId' when calling offerActionsGetOfferAction");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("offerId", offerId);
        uriVariables.put("offerChainId", offerChainId);
        uriVariables.put("actionId", actionId);
        String path = UriComponentsBuilder.fromPath("/api/Offers/{offerId}/offerChains/{offerChainId}/actions/{actionId}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfOfferActionViewModelBase> returnType = new ParameterizedTypeReference<ResultModelOfOfferActionViewModelBase>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
