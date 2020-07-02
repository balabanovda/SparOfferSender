package com.example.demo.restclient.api;

import com.example.demo.restclient.ApiClient;

import com.example.demo.restclient.model.ResultModel;
import com.example.demo.restclient.model.ResultModelOfListOfMerchantViewModel;

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
@Component("com.example.demo.restclient.api.OfferMerchantApi")
public class OfferMerchantApi {
    private ApiClient apiClient;

    public OfferMerchantApi() {
        this(new ApiClient());
    }

    @Autowired
    public OfferMerchantApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Редактирует список магазинов, в которых будет работать акция.
     * 
     * <p><b>200</b> - OK
     * @param offerId Id акции. (required)
     * @param merchantIds Список идентификаторов магазинов. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel offerMerchantEditOfferMerchants(Integer offerId, List<Integer> merchantIds) throws RestClientException {
        return offerMerchantEditOfferMerchantsWithHttpInfo(offerId, merchantIds).getBody();
    }

    /**
     * Редактирует список магазинов, в которых будет работать акция.
     * 
     * <p><b>200</b> - OK
     * @param offerId Id акции. (required)
     * @param merchantIds Список идентификаторов магазинов. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> offerMerchantEditOfferMerchantsWithHttpInfo(Integer offerId, List<Integer> merchantIds) throws RestClientException {
        Object postBody = merchantIds;
        
        // verify the required parameter 'offerId' is set
        if (offerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'offerId' when calling offerMerchantEditOfferMerchants");
        }
        
        // verify the required parameter 'merchantIds' is set
        if (merchantIds == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'merchantIds' when calling offerMerchantEditOfferMerchants");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("offerId", offerId);
        String path = UriComponentsBuilder.fromPath("/api/Offers/{offerId}/merchants").buildAndExpand(uriVariables).toUriString();

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
     * Получает список магазинов, для которых работает акция.
     * 
     * <p><b>200</b> - OK
     * @param offerId Id акции. (required)
     * @param version Тип версии. (optional, default to Draft)
     * @param includeDeleted Включая удаленные. (optional, default to false)
     * @return ResultModelOfListOfMerchantViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfMerchantViewModel offerMerchantGetMerchants(Integer offerId, String version, Boolean includeDeleted) throws RestClientException {
        return offerMerchantGetMerchantsWithHttpInfo(offerId, version, includeDeleted).getBody();
    }

    /**
     * Получает список магазинов, для которых работает акция.
     * 
     * <p><b>200</b> - OK
     * @param offerId Id акции. (required)
     * @param version Тип версии. (optional, default to Draft)
     * @param includeDeleted Включая удаленные. (optional, default to false)
     * @return ResponseEntity&lt;ResultModelOfListOfMerchantViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfMerchantViewModel> offerMerchantGetMerchantsWithHttpInfo(Integer offerId, String version, Boolean includeDeleted) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'offerId' is set
        if (offerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'offerId' when calling offerMerchantGetMerchants");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("offerId", offerId);
        String path = UriComponentsBuilder.fromPath("/api/Offers/{offerId}/merchants").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "version", version));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "includeDeleted", includeDeleted));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfListOfMerchantViewModel> returnType = new ParameterizedTypeReference<ResultModelOfListOfMerchantViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
