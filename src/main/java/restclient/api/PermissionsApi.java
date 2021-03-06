package restclient.api;

import restclient.ApiClient;

import restclient.model.ResultModelOfBoolean;
import restclient.model.ResultModelOfListOfPermissionViewModel;
import restclient.model.ResultModelOfListOfString;

import java.util.List;

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
@Component("restclient.api.PermissionsApi")
public class PermissionsApi {
    private ApiClient apiClient;

    public PermissionsApi() {
        this(new ApiClient());
    }

    @Autowired
    public PermissionsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Получить все разрешения.
     * 
     * <p><b>200</b> - OK
     * @return ResultModelOfListOfPermissionViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfPermissionViewModel permissionsGetAll() throws RestClientException {
        return permissionsGetAllWithHttpInfo().getBody();
    }

    /**
     * Получить все разрешения.
     * 
     * <p><b>200</b> - OK
     * @return ResponseEntity&lt;ResultModelOfListOfPermissionViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfPermissionViewModel> permissionsGetAllWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/permissions").build().toUriString();

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

        ParameterizedTypeReference<ResultModelOfListOfPermissionViewModel> returnType = new ParameterizedTypeReference<ResultModelOfListOfPermissionViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить разрешения текущего пользователя.
     * 
     * <p><b>200</b> - OK
     * @return ResultModelOfListOfString
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfString permissionsGetPermissionsForCurrentPerson() throws RestClientException {
        return permissionsGetPermissionsForCurrentPersonWithHttpInfo().getBody();
    }

    /**
     * Получить разрешения текущего пользователя.
     * 
     * <p><b>200</b> - OK
     * @return ResponseEntity&lt;ResultModelOfListOfString&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfString> permissionsGetPermissionsForCurrentPersonWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/user/permissions").build().toUriString();

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
    /**
     * Определяет, имеет ли текущий пользователь указанное разрешение для заданного партнера.
     * 
     * <p><b>200</b> - OK
     * @param permission Разрешение. (required)
     * @param partnerId ID партнера. (required)
     * @return ResultModelOfBoolean
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfBoolean permissionsHasPermission(String permission, Integer partnerId) throws RestClientException {
        return permissionsHasPermissionWithHttpInfo(permission, partnerId).getBody();
    }

    /**
     * Определяет, имеет ли текущий пользователь указанное разрешение для заданного партнера.
     * 
     * <p><b>200</b> - OK
     * @param permission Разрешение. (required)
     * @param partnerId ID партнера. (required)
     * @return ResponseEntity&lt;ResultModelOfBoolean&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfBoolean> permissionsHasPermissionWithHttpInfo(String permission, Integer partnerId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'permission' is set
        if (permission == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'permission' when calling permissionsHasPermission");
        }
        
        // verify the required parameter 'partnerId' is set
        if (partnerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partnerId' when calling permissionsHasPermission");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/user/permission").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "permission", permission));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "partnerId", partnerId));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfBoolean> returnType = new ParameterizedTypeReference<ResultModelOfBoolean>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
