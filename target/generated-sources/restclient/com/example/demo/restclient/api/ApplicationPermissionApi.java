package com.example.demo.restclient.api;

import com.example.demo.restclient.ApiClient;

import com.example.demo.restclient.model.ResultModel;
import com.example.demo.restclient.model.ResultModelOfListOfString;

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
@Component("com.example.demo.restclient.api.ApplicationPermissionApi")
public class ApplicationPermissionApi {
    private ApiClient apiClient;

    public ApplicationPermissionApi() {
        this(new ApiClient());
    }

    @Autowired
    public ApplicationPermissionApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 
     * 
     * <p><b>201</b> - Created
     * @param applicationId  (required)
     * @param permissionChanges  (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel applicationPermissionChangePermissions(Integer applicationId, List<String> permissionChanges) throws RestClientException {
        return applicationPermissionChangePermissionsWithHttpInfo(applicationId, permissionChanges).getBody();
    }

    /**
     * 
     * 
     * <p><b>201</b> - Created
     * @param applicationId  (required)
     * @param permissionChanges  (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> applicationPermissionChangePermissionsWithHttpInfo(Integer applicationId, List<String> permissionChanges) throws RestClientException {
        Object postBody = permissionChanges;
        
        // verify the required parameter 'applicationId' is set
        if (applicationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'applicationId' when calling applicationPermissionChangePermissions");
        }
        
        // verify the required parameter 'permissionChanges' is set
        if (permissionChanges == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'permissionChanges' when calling applicationPermissionChangePermissions");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("applicationId", applicationId);
        String path = UriComponentsBuilder.fromPath("/api/OAuth/Applications/{applicationId}/Permissions").buildAndExpand(uriVariables).toUriString();

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
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить список разрешений приложения.
     * 
     * <p><b>200</b> - OK
     * @param applicationId Идентификатор приложения. (required)
     * @return ResultModelOfListOfString
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfString applicationPermissionGet(Integer applicationId) throws RestClientException {
        return applicationPermissionGetWithHttpInfo(applicationId).getBody();
    }

    /**
     * Получить список разрешений приложения.
     * 
     * <p><b>200</b> - OK
     * @param applicationId Идентификатор приложения. (required)
     * @return ResponseEntity&lt;ResultModelOfListOfString&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfString> applicationPermissionGetWithHttpInfo(Integer applicationId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'applicationId' is set
        if (applicationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'applicationId' when calling applicationPermissionGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("applicationId", applicationId);
        String path = UriComponentsBuilder.fromPath("/api/OAuth/Applications/{applicationId}/Permissions").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfListOfString> returnType = new ParameterizedTypeReference<ResultModelOfListOfString>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
