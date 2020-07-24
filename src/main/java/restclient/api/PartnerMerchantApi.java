package restclient.api;

import restclient.ApiClient;

import restclient.model.MerchantViewModel;
import restclient.model.ResultModel;
import restclient.model.ResultModelOfInt32;
import restclient.model.ResultModelOfMerchantViewModel;
import restclient.model.ResultModelOfPagedViewModelOfMerchantViewModel;

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
@Component("restclient.api.PartnerMerchantApi")
public class PartnerMerchantApi {
    private ApiClient apiClient;

    public PartnerMerchantApi() {
        this(new ApiClient());
    }

    @Autowired
    public PartnerMerchantApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Добавление магазина партнеру.
     * 
     * <p><b>201</b> - Created
     * @param partnerId Id партнера. (required)
     * @param model ViewModel магазина. (required)
     * @return ResultModelOfInt32
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfInt32 partnerMerchantCreate(Integer partnerId, MerchantViewModel model) throws RestClientException {
        return partnerMerchantCreateWithHttpInfo(partnerId, model).getBody();
    }

    /**
     * Добавление магазина партнеру.
     * 
     * <p><b>201</b> - Created
     * @param partnerId Id партнера. (required)
     * @param model ViewModel магазина. (required)
     * @return ResponseEntity&lt;ResultModelOfInt32&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfInt32> partnerMerchantCreateWithHttpInfo(Integer partnerId, MerchantViewModel model) throws RestClientException {
        Object postBody = model;
        
        // verify the required parameter 'partnerId' is set
        if (partnerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partnerId' when calling partnerMerchantCreate");
        }
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling partnerMerchantCreate");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("partnerId", partnerId);
        String path = UriComponentsBuilder.fromPath("/api/partners/{partnerId}/merchants").buildAndExpand(uriVariables).toUriString();

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
     * Пометить магазин удаленным.
     * 
     * <p><b>200</b> - OK
     * @param partnerId Идентификатор партнера. (required)
     * @param merchantId Идентификатор магазина. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel partnerMerchantDelete(Integer partnerId, Integer merchantId) throws RestClientException {
        return partnerMerchantDeleteWithHttpInfo(partnerId, merchantId).getBody();
    }

    /**
     * Пометить магазин удаленным.
     * 
     * <p><b>200</b> - OK
     * @param partnerId Идентификатор партнера. (required)
     * @param merchantId Идентификатор магазина. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> partnerMerchantDeleteWithHttpInfo(Integer partnerId, Integer merchantId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'partnerId' is set
        if (partnerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partnerId' when calling partnerMerchantDelete");
        }
        
        // verify the required parameter 'merchantId' is set
        if (merchantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'merchantId' when calling partnerMerchantDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("partnerId", partnerId);
        uriVariables.put("merchantId", merchantId);
        String path = UriComponentsBuilder.fromPath("/api/partners/{partnerId}/merchants/{merchantId}").buildAndExpand(uriVariables).toUriString();

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
     * Редактирование магазина партнера.
     * 
     * <p><b>200</b> - OK
     * @param partnerId Идентификатор партнера. (required)
     * @param merchantId Идентификатор магазина. (required)
     * @param model ViewModel магазина. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel partnerMerchantEdit(Integer partnerId, Integer merchantId, MerchantViewModel model) throws RestClientException {
        return partnerMerchantEditWithHttpInfo(partnerId, merchantId, model).getBody();
    }

    /**
     * Редактирование магазина партнера.
     * 
     * <p><b>200</b> - OK
     * @param partnerId Идентификатор партнера. (required)
     * @param merchantId Идентификатор магазина. (required)
     * @param model ViewModel магазина. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> partnerMerchantEditWithHttpInfo(Integer partnerId, Integer merchantId, MerchantViewModel model) throws RestClientException {
        Object postBody = model;
        
        // verify the required parameter 'partnerId' is set
        if (partnerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partnerId' when calling partnerMerchantEdit");
        }
        
        // verify the required parameter 'merchantId' is set
        if (merchantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'merchantId' when calling partnerMerchantEdit");
        }
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling partnerMerchantEdit");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("partnerId", partnerId);
        uriVariables.put("merchantId", merchantId);
        String path = UriComponentsBuilder.fromPath("/api/partners/{partnerId}/merchants/{merchantId}").buildAndExpand(uriVariables).toUriString();

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
     * Возвращает список всех доступных магазинов.
     * 
     * <p><b>200</b> - OK
     * @param permission Тип разрешения. (required)
     * @param from Начало выборки. (optional, default to 0)
     * @param count Объем выборки. (optional, default to 10)
     * @return ResultModelOfPagedViewModelOfMerchantViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfMerchantViewModel partnerMerchantGetAvailableMerchants(String permission, Integer from, Integer count) throws RestClientException {
        return partnerMerchantGetAvailableMerchantsWithHttpInfo(permission, from, count).getBody();
    }

    /**
     * Возвращает список всех доступных магазинов.
     * 
     * <p><b>200</b> - OK
     * @param permission Тип разрешения. (required)
     * @param from Начало выборки. (optional, default to 0)
     * @param count Объем выборки. (optional, default to 10)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfMerchantViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfMerchantViewModel> partnerMerchantGetAvailableMerchantsWithHttpInfo(String permission, Integer from, Integer count) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'permission' is set
        if (permission == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'permission' when calling partnerMerchantGetAvailableMerchants");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/partners/merchants/availableMerchants").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "permission", permission));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfMerchantViewModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfMerchantViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получение магазина партнера по идентификатору.
     * 
     * <p><b>200</b> - OK
     * @param partnerId Идентификационный номер партнера. (required)
     * @param merchantId Идентификационный номер магазина. (required)
     * @return ResultModelOfMerchantViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfMerchantViewModel partnerMerchantGetMerchant(Integer partnerId, Integer merchantId) throws RestClientException {
        return partnerMerchantGetMerchantWithHttpInfo(partnerId, merchantId).getBody();
    }

    /**
     * Получение магазина партнера по идентификатору.
     * 
     * <p><b>200</b> - OK
     * @param partnerId Идентификационный номер партнера. (required)
     * @param merchantId Идентификационный номер магазина. (required)
     * @return ResponseEntity&lt;ResultModelOfMerchantViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfMerchantViewModel> partnerMerchantGetMerchantWithHttpInfo(Integer partnerId, Integer merchantId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'partnerId' is set
        if (partnerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partnerId' when calling partnerMerchantGetMerchant");
        }
        
        // verify the required parameter 'merchantId' is set
        if (merchantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'merchantId' when calling partnerMerchantGetMerchant");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("partnerId", partnerId);
        uriVariables.put("merchantId", merchantId);
        String path = UriComponentsBuilder.fromPath("/api/partners/{partnerId}/merchants/{merchantId}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfMerchantViewModel> returnType = new ParameterizedTypeReference<ResultModelOfMerchantViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param partnerId  (required)
     * @param from  (optional, default to 0)
     * @param count  (optional, default to 10)
     * @param nameSubstring  (optional, default to )
     * @param internalNameSubstring  (optional, default to )
     * @param brandId  (optional)
     * @param locationSubstring  (optional, default to )
     * @param isOrderedByAscending  (optional, default to false)
     * @param mode  (optional)
     * @param sortingIds  (optional)
     * @return ResultModelOfPagedViewModelOfMerchantViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfMerchantViewModel partnerMerchantGetMerchants(Integer partnerId, Integer from, Integer count, String nameSubstring, String internalNameSubstring, Integer brandId, String locationSubstring, Boolean isOrderedByAscending, String mode, List<Integer> sortingIds) throws RestClientException {
        return partnerMerchantGetMerchantsWithHttpInfo(partnerId, from, count, nameSubstring, internalNameSubstring, brandId, locationSubstring, isOrderedByAscending, mode, sortingIds).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param partnerId  (required)
     * @param from  (optional, default to 0)
     * @param count  (optional, default to 10)
     * @param nameSubstring  (optional, default to )
     * @param internalNameSubstring  (optional, default to )
     * @param brandId  (optional)
     * @param locationSubstring  (optional, default to )
     * @param isOrderedByAscending  (optional, default to false)
     * @param mode  (optional)
     * @param sortingIds  (optional)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfMerchantViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfMerchantViewModel> partnerMerchantGetMerchantsWithHttpInfo(Integer partnerId, Integer from, Integer count, String nameSubstring, String internalNameSubstring, Integer brandId, String locationSubstring, Boolean isOrderedByAscending, String mode, List<Integer> sortingIds) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'partnerId' is set
        if (partnerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partnerId' when calling partnerMerchantGetMerchants");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("partnerId", partnerId);
        String path = UriComponentsBuilder.fromPath("/api/partners/{partnerId}/merchants").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "nameSubstring", nameSubstring));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "internalNameSubstring", internalNameSubstring));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "brandId", brandId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "locationSubstring", locationSubstring));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "isOrderedByAscending", isOrderedByAscending));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "mode", mode));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "sortingIds", sortingIds));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfMerchantViewModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfMerchantViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Восстановить магазин.
     * 
     * <p><b>200</b> - OK
     * @param partnerId Идентификатор партнера. (required)
     * @param merchantId Идентификатор магазина. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel partnerMerchantRestore(Integer partnerId, Integer merchantId) throws RestClientException {
        return partnerMerchantRestoreWithHttpInfo(partnerId, merchantId).getBody();
    }

    /**
     * Восстановить магазин.
     * 
     * <p><b>200</b> - OK
     * @param partnerId Идентификатор партнера. (required)
     * @param merchantId Идентификатор магазина. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> partnerMerchantRestoreWithHttpInfo(Integer partnerId, Integer merchantId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'partnerId' is set
        if (partnerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partnerId' when calling partnerMerchantRestore");
        }
        
        // verify the required parameter 'merchantId' is set
        if (merchantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'merchantId' when calling partnerMerchantRestore");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("partnerId", partnerId);
        uriVariables.put("merchantId", merchantId);
        String path = UriComponentsBuilder.fromPath("/api/partners/{partnerId}/merchants/{merchantId}/restore").buildAndExpand(uriVariables).toUriString();

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
