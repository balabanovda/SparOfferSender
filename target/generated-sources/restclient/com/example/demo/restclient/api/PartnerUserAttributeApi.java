package com.example.demo.restclient.api;

import com.example.demo.restclient.ApiClient;

import com.example.demo.restclient.model.ResultModelOfListOfPartnerUserAttributeViewModel;

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
@Component("com.example.demo.restclient.api.PartnerUserAttributeApi")
public class PartnerUserAttributeApi {
    private ApiClient apiClient;

    public PartnerUserAttributeApi() {
        this(new ApiClient());
    }

    @Autowired
    public PartnerUserAttributeApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Получение набора атрибутов пользователей.
     * 
     * <p><b>200</b> - OK
     * @param partnerId Идентификатор партнера. (required)
     * @return ResultModelOfListOfPartnerUserAttributeViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfPartnerUserAttributeViewModel partnerUserAttributeGetUserAttributes(Integer partnerId) throws RestClientException {
        return partnerUserAttributeGetUserAttributesWithHttpInfo(partnerId).getBody();
    }

    /**
     * Получение набора атрибутов пользователей.
     * 
     * <p><b>200</b> - OK
     * @param partnerId Идентификатор партнера. (required)
     * @return ResponseEntity&lt;ResultModelOfListOfPartnerUserAttributeViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfPartnerUserAttributeViewModel> partnerUserAttributeGetUserAttributesWithHttpInfo(Integer partnerId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'partnerId' is set
        if (partnerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partnerId' when calling partnerUserAttributeGetUserAttributes");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("partnerId", partnerId);
        String path = UriComponentsBuilder.fromPath("/api/partners/{partnerId}/userAttributes").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfListOfPartnerUserAttributeViewModel> returnType = new ParameterizedTypeReference<ResultModelOfListOfPartnerUserAttributeViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
