package restclient.api;

import restclient.ApiClient;

import restclient.model.PurchasesFilterViewModel;
import restclient.model.ResultModel;
import restclient.model.ResultModelOfListOfChequePositionViewModel;
import restclient.model.ResultModelOfListOfOperationsViewModel;
import restclient.model.ResultModelOfPagedViewModelOfPurchaseViewModel;
import restclient.model.ResultModelOfPurchaseViewModel;

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
@Component("restclient.api.PurchaseApi")
public class PurchaseApi {
    private ApiClient apiClient;

    public PurchaseApi() {
        this(new ApiClient());
    }

    @Autowired
    public PurchaseApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Редактирование состояния покупки.
     * 
     * <p><b>200</b> - OK
     * @param purchaseId Идентификатор покупки. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel purchaseCancelPurchase(Integer purchaseId) throws RestClientException {
        return purchaseCancelPurchaseWithHttpInfo(purchaseId).getBody();
    }

    /**
     * Редактирование состояния покупки.
     * 
     * <p><b>200</b> - OK
     * @param purchaseId Идентификатор покупки. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> purchaseCancelPurchaseWithHttpInfo(Integer purchaseId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'purchaseId' is set
        if (purchaseId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'purchaseId' when calling purchaseCancelPurchase");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("purchaseId", purchaseId);
        String path = UriComponentsBuilder.fromPath("/api/purchases/{purchaseId}/cancel").buildAndExpand(uriVariables).toUriString();

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
    /**
     * Редактирование состояния покупки.
     * 
     * <p><b>200</b> - OK
     * @param purchaseId Идентификатор покупки. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel purchaseConfirmPurchase(Integer purchaseId) throws RestClientException {
        return purchaseConfirmPurchaseWithHttpInfo(purchaseId).getBody();
    }

    /**
     * Редактирование состояния покупки.
     * 
     * <p><b>200</b> - OK
     * @param purchaseId Идентификатор покупки. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> purchaseConfirmPurchaseWithHttpInfo(Integer purchaseId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'purchaseId' is set
        if (purchaseId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'purchaseId' when calling purchaseConfirmPurchase");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("purchaseId", purchaseId);
        String path = UriComponentsBuilder.fromPath("/api/purchases/{purchaseId}/confirm").buildAndExpand(uriVariables).toUriString();

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
    /**
     * Получить указанное количество покупок с указанной позиции.
     * 
     * <p><b>200</b> - OK
     * @param filter Фильтр. (required)
     * @return ResultModelOfPagedViewModelOfPurchaseViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfPurchaseViewModel purchaseGet(PurchasesFilterViewModel filter) throws RestClientException {
        return purchaseGetWithHttpInfo(filter).getBody();
    }

    /**
     * Получить указанное количество покупок с указанной позиции.
     * 
     * <p><b>200</b> - OK
     * @param filter Фильтр. (required)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfPurchaseViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfPurchaseViewModel> purchaseGetWithHttpInfo(PurchasesFilterViewModel filter) throws RestClientException {
        Object postBody = filter;
        
        // verify the required parameter 'filter' is set
        if (filter == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'filter' when calling purchaseGet");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/purchases").build().toUriString();

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

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfPurchaseViewModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfPurchaseViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить чековые позиции по покупке.
     * 
     * <p><b>200</b> - OK
     * @param purchaseId Идентификатор. (required)
     * @param showCanceledOperations Отображать отменененные операции. (optional, default to false)
     * @return ResultModelOfListOfChequePositionViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfChequePositionViewModel purchaseGetChequePositions(Integer purchaseId, Boolean showCanceledOperations) throws RestClientException {
        return purchaseGetChequePositionsWithHttpInfo(purchaseId, showCanceledOperations).getBody();
    }

    /**
     * Получить чековые позиции по покупке.
     * 
     * <p><b>200</b> - OK
     * @param purchaseId Идентификатор. (required)
     * @param showCanceledOperations Отображать отменененные операции. (optional, default to false)
     * @return ResponseEntity&lt;ResultModelOfListOfChequePositionViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfChequePositionViewModel> purchaseGetChequePositionsWithHttpInfo(Integer purchaseId, Boolean showCanceledOperations) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'purchaseId' is set
        if (purchaseId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'purchaseId' when calling purchaseGetChequePositions");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("purchaseId", purchaseId);
        String path = UriComponentsBuilder.fromPath("/api/purchases/{purchaseId}/chequePositions").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "showCanceledOperations", showCanceledOperations));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfListOfChequePositionViewModel> returnType = new ParameterizedTypeReference<ResultModelOfListOfChequePositionViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить список операций по покупке.
     * 
     * <p><b>200</b> - OK
     * @param purchaseId Идентификатор покупки. (required)
     * @return ResultModelOfListOfOperationsViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfOperationsViewModel purchaseGetOperations(Integer purchaseId) throws RestClientException {
        return purchaseGetOperationsWithHttpInfo(purchaseId).getBody();
    }

    /**
     * Получить список операций по покупке.
     * 
     * <p><b>200</b> - OK
     * @param purchaseId Идентификатор покупки. (required)
     * @return ResponseEntity&lt;ResultModelOfListOfOperationsViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfOperationsViewModel> purchaseGetOperationsWithHttpInfo(Integer purchaseId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'purchaseId' is set
        if (purchaseId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'purchaseId' when calling purchaseGetOperations");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("purchaseId", purchaseId);
        String path = UriComponentsBuilder.fromPath("/api/purchases/{purchaseId}/operations").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfListOfOperationsViewModel> returnType = new ParameterizedTypeReference<ResultModelOfListOfOperationsViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить покупку по идентификатору.
     * 
     * <p><b>200</b> - OK
     * @param purchaseId Идентификатор покупки. (required)
     * @return ResultModelOfPurchaseViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPurchaseViewModel purchaseGetPurchase(Integer purchaseId) throws RestClientException {
        return purchaseGetPurchaseWithHttpInfo(purchaseId).getBody();
    }

    /**
     * Получить покупку по идентификатору.
     * 
     * <p><b>200</b> - OK
     * @param purchaseId Идентификатор покупки. (required)
     * @return ResponseEntity&lt;ResultModelOfPurchaseViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPurchaseViewModel> purchaseGetPurchaseWithHttpInfo(Integer purchaseId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'purchaseId' is set
        if (purchaseId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'purchaseId' when calling purchaseGetPurchase");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("purchaseId", purchaseId);
        String path = UriComponentsBuilder.fromPath("/api/purchases/{purchaseId}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfPurchaseViewModel> returnType = new ParameterizedTypeReference<ResultModelOfPurchaseViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
