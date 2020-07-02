package com.example.demo.restclient.api;

import com.example.demo.restclient.ApiClient;

import com.example.demo.restclient.model.ResultModelOfListOfOAuthIdentifierInfo;

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
@Component("com.example.demo.restclient.api.UserSocialApi")
public class UserSocialApi {
    private ApiClient apiClient;

    public UserSocialApi() {
        this(new ApiClient());
    }

    @Autowired
    public UserSocialApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Список всех аккаунтов в соцсетях клиента.
     * 
     * <p><b>200</b> - OK
     * @param personId Id пользователя. (required)
     * @return ResultModelOfListOfOAuthIdentifierInfo
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfOAuthIdentifierInfo userSocialGetAccounts(Integer personId) throws RestClientException {
        return userSocialGetAccountsWithHttpInfo(personId).getBody();
    }

    /**
     * Список всех аккаунтов в соцсетях клиента.
     * 
     * <p><b>200</b> - OK
     * @param personId Id пользователя. (required)
     * @return ResponseEntity&lt;ResultModelOfListOfOAuthIdentifierInfo&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfOAuthIdentifierInfo> userSocialGetAccountsWithHttpInfo(Integer personId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling userSocialGetAccounts");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("personId", personId);
        String path = UriComponentsBuilder.fromPath("/api/users/{personId}/SocialAccounts").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfListOfOAuthIdentifierInfo> returnType = new ParameterizedTypeReference<ResultModelOfListOfOAuthIdentifierInfo>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
