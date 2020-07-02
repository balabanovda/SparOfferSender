package com.example.demo.restclient.api;

import com.example.demo.restclient.ApiClient;

import com.example.demo.restclient.model.ResultModelOfListOfOperationPayViewModel;

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
@Component("com.example.demo.restclient.api.OperationPayApi")
public class OperationPayApi {
    private ApiClient apiClient;

    public OperationPayApi() {
        this(new ApiClient());
    }

    @Autowired
    public OperationPayApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Информация какими способами оплачена покупка.
     * 
     * <p><b>200</b> - OK
     * @param purchaseId Id покупки. (required)
     * @return ResultModelOfListOfOperationPayViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfOperationPayViewModel operationPayGetByPurchase(Integer purchaseId) throws RestClientException {
        return operationPayGetByPurchaseWithHttpInfo(purchaseId).getBody();
    }

    /**
     * Информация какими способами оплачена покупка.
     * 
     * <p><b>200</b> - OK
     * @param purchaseId Id покупки. (required)
     * @return ResponseEntity&lt;ResultModelOfListOfOperationPayViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfOperationPayViewModel> operationPayGetByPurchaseWithHttpInfo(Integer purchaseId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'purchaseId' is set
        if (purchaseId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'purchaseId' when calling operationPayGetByPurchase");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/OperationPay").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "purchaseId", purchaseId));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfListOfOperationPayViewModel> returnType = new ParameterizedTypeReference<ResultModelOfListOfOperationPayViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
