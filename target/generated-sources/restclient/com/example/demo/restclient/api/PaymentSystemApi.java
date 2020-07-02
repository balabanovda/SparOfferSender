package com.example.demo.restclient.api;

import com.example.demo.restclient.ApiClient;

import com.example.demo.restclient.model.ResultModelOfPagedViewModelOfPaymentSystemViewModel;

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
@Component("com.example.demo.restclient.api.PaymentSystemApi")
public class PaymentSystemApi {
    private ApiClient apiClient;

    public PaymentSystemApi() {
        this(new ApiClient());
    }

    @Autowired
    public PaymentSystemApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Получить список платежных систем.
     * 
     * <p><b>200</b> - OK
     * @param from С. (required)
     * @param count Количество. (optional, default to 10)
     * @return ResultModelOfPagedViewModelOfPaymentSystemViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfPaymentSystemViewModel paymentSystemGetPaymentSystems(Integer from, Integer count) throws RestClientException {
        return paymentSystemGetPaymentSystemsWithHttpInfo(from, count).getBody();
    }

    /**
     * Получить список платежных систем.
     * 
     * <p><b>200</b> - OK
     * @param from С. (required)
     * @param count Количество. (optional, default to 10)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfPaymentSystemViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfPaymentSystemViewModel> paymentSystemGetPaymentSystemsWithHttpInfo(Integer from, Integer count) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'from' is set
        if (from == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'from' when calling paymentSystemGetPaymentSystems");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/paymentSystem").build().toUriString();

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

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfPaymentSystemViewModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfPaymentSystemViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
