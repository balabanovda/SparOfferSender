package com.example.demo.restclient.api;

import com.example.demo.restclient.ApiClient;

import com.example.demo.restclient.model.PersonIdentifierModel;
import com.example.demo.restclient.model.PersonIdentifierPermissionModel;
import com.example.demo.restclient.model.PersonIdentifierRoleModel;
import com.example.demo.restclient.model.ResultModel;
import com.example.demo.restclient.model.ResultModelOfInt32;
import com.example.demo.restclient.model.ResultModelOfPagedViewModelOfPersonIdentifierModel;
import com.example.demo.restclient.model.ResultModelOfPersonIdentifierModel;

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
@Component("com.example.demo.restclient.api.UserIdentifiersApi")
public class UserIdentifiersApi {
    private ApiClient apiClient;

    public UserIdentifiersApi() {
        this(new ApiClient());
    }

    @Autowired
    public UserIdentifiersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Добавляет право доступа идентификатору.
     * 
     * <p><b>201</b> - Created
     * @param personId Id пользователя. (required)
     * @param id Id идентификатора. (required)
     * @param permission Логическое имя права доступа. (required)
     * @param identifierPermission Модель права доступа. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel userIdentifiersAddPermissionToIdentifier(Integer personId, Integer id, String permission, PersonIdentifierPermissionModel identifierPermission) throws RestClientException {
        return userIdentifiersAddPermissionToIdentifierWithHttpInfo(personId, id, permission, identifierPermission).getBody();
    }

    /**
     * Добавляет право доступа идентификатору.
     * 
     * <p><b>201</b> - Created
     * @param personId Id пользователя. (required)
     * @param id Id идентификатора. (required)
     * @param permission Логическое имя права доступа. (required)
     * @param identifierPermission Модель права доступа. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> userIdentifiersAddPermissionToIdentifierWithHttpInfo(Integer personId, Integer id, String permission, PersonIdentifierPermissionModel identifierPermission) throws RestClientException {
        Object postBody = identifierPermission;
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling userIdentifiersAddPermissionToIdentifier");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling userIdentifiersAddPermissionToIdentifier");
        }
        
        // verify the required parameter 'permission' is set
        if (permission == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'permission' when calling userIdentifiersAddPermissionToIdentifier");
        }
        
        // verify the required parameter 'identifierPermission' is set
        if (identifierPermission == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'identifierPermission' when calling userIdentifiersAddPermissionToIdentifier");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("personId", personId);
        uriVariables.put("id", id);
        uriVariables.put("permission", permission);
        String path = UriComponentsBuilder.fromPath("/api/users/{personId}/identifiers/{id}/permissions/{permission}").buildAndExpand(uriVariables).toUriString();

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
     * Добавляет роль идентификатору.
     * 
     * <p><b>201</b> - Created
     * @param personId Id пользователя. (required)
     * @param id Id идентификатора. (required)
     * @param roleId Id роли. (required)
     * @param identifierRole Модель роли идентификатора. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel userIdentifiersAddRoleToIdentifier(Integer personId, Integer id, Integer roleId, PersonIdentifierRoleModel identifierRole) throws RestClientException {
        return userIdentifiersAddRoleToIdentifierWithHttpInfo(personId, id, roleId, identifierRole).getBody();
    }

    /**
     * Добавляет роль идентификатору.
     * 
     * <p><b>201</b> - Created
     * @param personId Id пользователя. (required)
     * @param id Id идентификатора. (required)
     * @param roleId Id роли. (required)
     * @param identifierRole Модель роли идентификатора. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> userIdentifiersAddRoleToIdentifierWithHttpInfo(Integer personId, Integer id, Integer roleId, PersonIdentifierRoleModel identifierRole) throws RestClientException {
        Object postBody = identifierRole;
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling userIdentifiersAddRoleToIdentifier");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling userIdentifiersAddRoleToIdentifier");
        }
        
        // verify the required parameter 'roleId' is set
        if (roleId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'roleId' when calling userIdentifiersAddRoleToIdentifier");
        }
        
        // verify the required parameter 'identifierRole' is set
        if (identifierRole == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'identifierRole' when calling userIdentifiersAddRoleToIdentifier");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("personId", personId);
        uriVariables.put("id", id);
        uriVariables.put("roleId", roleId);
        String path = UriComponentsBuilder.fromPath("/api/users/{personId}/identifiers/{id}/roles/{roleId}").buildAndExpand(uriVariables).toUriString();

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
     * Блокирование идентификатора.
     * 
     * <p><b>200</b> - OK
     * @param personId Id пользователя. (required)
     * @param id Id идентификатора. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel userIdentifiersBlockIdentifier(Integer personId, Integer id) throws RestClientException {
        return userIdentifiersBlockIdentifierWithHttpInfo(personId, id).getBody();
    }

    /**
     * Блокирование идентификатора.
     * 
     * <p><b>200</b> - OK
     * @param personId Id пользователя. (required)
     * @param id Id идентификатора. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> userIdentifiersBlockIdentifierWithHttpInfo(Integer personId, Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling userIdentifiersBlockIdentifier");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling userIdentifiersBlockIdentifier");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("personId", personId);
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/users/{personId}/identifiers/{id}/block").buildAndExpand(uriVariables).toUriString();

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
     * Создание идентификатора типа Login.
     * 
     * <p><b>201</b> - Created
     * @param personId Id пользователя. (required)
     * @param identifier Модель идентификатора. (required)
     * @return ResultModelOfInt32
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfInt32 userIdentifiersCreateLoginIdentifier(Integer personId, PersonIdentifierModel identifier) throws RestClientException {
        return userIdentifiersCreateLoginIdentifierWithHttpInfo(personId, identifier).getBody();
    }

    /**
     * Создание идентификатора типа Login.
     * 
     * <p><b>201</b> - Created
     * @param personId Id пользователя. (required)
     * @param identifier Модель идентификатора. (required)
     * @return ResponseEntity&lt;ResultModelOfInt32&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfInt32> userIdentifiersCreateLoginIdentifierWithHttpInfo(Integer personId, PersonIdentifierModel identifier) throws RestClientException {
        Object postBody = identifier;
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling userIdentifiersCreateLoginIdentifier");
        }
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'identifier' when calling userIdentifiersCreateLoginIdentifier");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("personId", personId);
        String path = UriComponentsBuilder.fromPath("/api/users/{personId}/identifiers").buildAndExpand(uriVariables).toUriString();

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
     * Удаление идентификатора.
     * 
     * <p><b>200</b> - OK
     * @param personId Id пользователя. (required)
     * @param id Id идентификатора. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel userIdentifiersDeleteIdentifier(Integer personId, Integer id) throws RestClientException {
        return userIdentifiersDeleteIdentifierWithHttpInfo(personId, id).getBody();
    }

    /**
     * Удаление идентификатора.
     * 
     * <p><b>200</b> - OK
     * @param personId Id пользователя. (required)
     * @param id Id идентификатора. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> userIdentifiersDeleteIdentifierWithHttpInfo(Integer personId, Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling userIdentifiersDeleteIdentifier");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling userIdentifiersDeleteIdentifier");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("personId", personId);
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/users/{personId}/identifiers/{id}").buildAndExpand(uriVariables).toUriString();

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
     * Удаляет право доступа у идентификатора.
     * 
     * <p><b>200</b> - OK
     * @param personId Id пользователя. (required)
     * @param id Id идентификатора. (required)
     * @param permission Право доступа. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel userIdentifiersDeletePermissionFromIdentifier(Integer personId, Integer id, String permission) throws RestClientException {
        return userIdentifiersDeletePermissionFromIdentifierWithHttpInfo(personId, id, permission).getBody();
    }

    /**
     * Удаляет право доступа у идентификатора.
     * 
     * <p><b>200</b> - OK
     * @param personId Id пользователя. (required)
     * @param id Id идентификатора. (required)
     * @param permission Право доступа. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> userIdentifiersDeletePermissionFromIdentifierWithHttpInfo(Integer personId, Integer id, String permission) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling userIdentifiersDeletePermissionFromIdentifier");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling userIdentifiersDeletePermissionFromIdentifier");
        }
        
        // verify the required parameter 'permission' is set
        if (permission == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'permission' when calling userIdentifiersDeletePermissionFromIdentifier");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("personId", personId);
        uriVariables.put("id", id);
        uriVariables.put("permission", permission);
        String path = UriComponentsBuilder.fromPath("/api/users/{personId}/identifiers/{id}/permissions/{permission}").buildAndExpand(uriVariables).toUriString();

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
     * Удаляет роль у идентификатора.
     * 
     * <p><b>200</b> - OK
     * @param personId Id пользователя. (required)
     * @param id Id идентификатора. (required)
     * @param roleId Id роли. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel userIdentifiersDeleteRoleFromIdentifier(Integer personId, Integer id, Integer roleId) throws RestClientException {
        return userIdentifiersDeleteRoleFromIdentifierWithHttpInfo(personId, id, roleId).getBody();
    }

    /**
     * Удаляет роль у идентификатора.
     * 
     * <p><b>200</b> - OK
     * @param personId Id пользователя. (required)
     * @param id Id идентификатора. (required)
     * @param roleId Id роли. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> userIdentifiersDeleteRoleFromIdentifierWithHttpInfo(Integer personId, Integer id, Integer roleId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling userIdentifiersDeleteRoleFromIdentifier");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling userIdentifiersDeleteRoleFromIdentifier");
        }
        
        // verify the required parameter 'roleId' is set
        if (roleId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'roleId' when calling userIdentifiersDeleteRoleFromIdentifier");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("personId", personId);
        uriVariables.put("id", id);
        uriVariables.put("roleId", roleId);
        String path = UriComponentsBuilder.fromPath("/api/users/{personId}/identifiers/{id}/roles/{roleId}").buildAndExpand(uriVariables).toUriString();

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
     * Получить идентификатор по ID.
     * 
     * <p><b>200</b> - OK
     * @param personId Id пользователя. (required)
     * @param id Id идентификатор. (required)
     * @return ResultModelOfPersonIdentifierModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPersonIdentifierModel userIdentifiersGetIdentifier(Integer personId, Integer id) throws RestClientException {
        return userIdentifiersGetIdentifierWithHttpInfo(personId, id).getBody();
    }

    /**
     * Получить идентификатор по ID.
     * 
     * <p><b>200</b> - OK
     * @param personId Id пользователя. (required)
     * @param id Id идентификатор. (required)
     * @return ResponseEntity&lt;ResultModelOfPersonIdentifierModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPersonIdentifierModel> userIdentifiersGetIdentifierWithHttpInfo(Integer personId, Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling userIdentifiersGetIdentifier");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling userIdentifiersGetIdentifier");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("personId", personId);
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/users/{personId}/identifiers/{id}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfPersonIdentifierModel> returnType = new ParameterizedTypeReference<ResultModelOfPersonIdentifierModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить список идентификаторов пользователя.
     * 
     * <p><b>200</b> - OK
     * @param personId Id пользователя. (required)
     * @param from Начало выборки. (optional, default to 0)
     * @param count Количество. (optional, default to 10)
     * @return ResultModelOfPagedViewModelOfPersonIdentifierModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfPersonIdentifierModel userIdentifiersGetIdentifiers(Integer personId, Integer from, Integer count) throws RestClientException {
        return userIdentifiersGetIdentifiersWithHttpInfo(personId, from, count).getBody();
    }

    /**
     * Получить список идентификаторов пользователя.
     * 
     * <p><b>200</b> - OK
     * @param personId Id пользователя. (required)
     * @param from Начало выборки. (optional, default to 0)
     * @param count Количество. (optional, default to 10)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfPersonIdentifierModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfPersonIdentifierModel> userIdentifiersGetIdentifiersWithHttpInfo(Integer personId, Integer from, Integer count) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling userIdentifiersGetIdentifiers");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("personId", personId);
        String path = UriComponentsBuilder.fromPath("/api/users/{personId}/identifiers").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfPersonIdentifierModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfPersonIdentifierModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Восстановление идентификатора.
     * 
     * <p><b>200</b> - OK
     * @param personId Id пользователя. (required)
     * @param id Id идентификатора. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel userIdentifiersRecoverIdentifier(Integer personId, Integer id) throws RestClientException {
        return userIdentifiersRecoverIdentifierWithHttpInfo(personId, id).getBody();
    }

    /**
     * Восстановление идентификатора.
     * 
     * <p><b>200</b> - OK
     * @param personId Id пользователя. (required)
     * @param id Id идентификатора. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> userIdentifiersRecoverIdentifierWithHttpInfo(Integer personId, Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling userIdentifiersRecoverIdentifier");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling userIdentifiersRecoverIdentifier");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("personId", personId);
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/users/{personId}/identifiers/{id}/recover").buildAndExpand(uriVariables).toUriString();

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
     * Разблокирование идентификатора.
     * 
     * <p><b>200</b> - OK
     * @param personId Id пользователя. (required)
     * @param id Id идентификатора. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel userIdentifiersUnblockIdentifier(Integer personId, Integer id) throws RestClientException {
        return userIdentifiersUnblockIdentifierWithHttpInfo(personId, id).getBody();
    }

    /**
     * Разблокирование идентификатора.
     * 
     * <p><b>200</b> - OK
     * @param personId Id пользователя. (required)
     * @param id Id идентификатора. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> userIdentifiersUnblockIdentifierWithHttpInfo(Integer personId, Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling userIdentifiersUnblockIdentifier");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling userIdentifiersUnblockIdentifier");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("personId", personId);
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/users/{personId}/identifiers/{id}/unblock").buildAndExpand(uriVariables).toUriString();

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
     * Редактирование идентификатора.
     * 
     * <p><b>200</b> - OK
     * @param personId Id пользователя. (required)
     * @param id Id идентификатора. (required)
     * @param identifier Модель идентификатора. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel userIdentifiersUpdateIdentifier(Integer personId, Integer id, PersonIdentifierModel identifier) throws RestClientException {
        return userIdentifiersUpdateIdentifierWithHttpInfo(personId, id, identifier).getBody();
    }

    /**
     * Редактирование идентификатора.
     * 
     * <p><b>200</b> - OK
     * @param personId Id пользователя. (required)
     * @param id Id идентификатора. (required)
     * @param identifier Модель идентификатора. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> userIdentifiersUpdateIdentifierWithHttpInfo(Integer personId, Integer id, PersonIdentifierModel identifier) throws RestClientException {
        Object postBody = identifier;
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling userIdentifiersUpdateIdentifier");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling userIdentifiersUpdateIdentifier");
        }
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'identifier' when calling userIdentifiersUpdateIdentifier");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("personId", personId);
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/users/{personId}/identifiers/{id}").buildAndExpand(uriVariables).toUriString();

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
     * Редактирует право доступа у идентификатора.
     * 
     * <p><b>200</b> - OK
     * @param personId Id пользователя. (required)
     * @param id Id идентификатора. (required)
     * @param permission Значение права доступа. (required)
     * @param identifierPermission Модель права доступа. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel userIdentifiersUpdatePermissionFromIdentifier(Integer personId, Integer id, String permission, PersonIdentifierPermissionModel identifierPermission) throws RestClientException {
        return userIdentifiersUpdatePermissionFromIdentifierWithHttpInfo(personId, id, permission, identifierPermission).getBody();
    }

    /**
     * Редактирует право доступа у идентификатора.
     * 
     * <p><b>200</b> - OK
     * @param personId Id пользователя. (required)
     * @param id Id идентификатора. (required)
     * @param permission Значение права доступа. (required)
     * @param identifierPermission Модель права доступа. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> userIdentifiersUpdatePermissionFromIdentifierWithHttpInfo(Integer personId, Integer id, String permission, PersonIdentifierPermissionModel identifierPermission) throws RestClientException {
        Object postBody = identifierPermission;
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling userIdentifiersUpdatePermissionFromIdentifier");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling userIdentifiersUpdatePermissionFromIdentifier");
        }
        
        // verify the required parameter 'permission' is set
        if (permission == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'permission' when calling userIdentifiersUpdatePermissionFromIdentifier");
        }
        
        // verify the required parameter 'identifierPermission' is set
        if (identifierPermission == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'identifierPermission' when calling userIdentifiersUpdatePermissionFromIdentifier");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("personId", personId);
        uriVariables.put("id", id);
        uriVariables.put("permission", permission);
        String path = UriComponentsBuilder.fromPath("/api/users/{personId}/identifiers/{id}/permissions/{permission}").buildAndExpand(uriVariables).toUriString();

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
     * Редактирует роль идентификатора.
     * 
     * <p><b>200</b> - OK
     * @param personId Id пользователя. (required)
     * @param id Id идентификатора. (required)
     * @param roleId Id роли. (required)
     * @param identifierRole Модель роли идентификатора. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel userIdentifiersUpdateRoleInIdentifier(Integer personId, Integer id, Integer roleId, PersonIdentifierRoleModel identifierRole) throws RestClientException {
        return userIdentifiersUpdateRoleInIdentifierWithHttpInfo(personId, id, roleId, identifierRole).getBody();
    }

    /**
     * Редактирует роль идентификатора.
     * 
     * <p><b>200</b> - OK
     * @param personId Id пользователя. (required)
     * @param id Id идентификатора. (required)
     * @param roleId Id роли. (required)
     * @param identifierRole Модель роли идентификатора. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> userIdentifiersUpdateRoleInIdentifierWithHttpInfo(Integer personId, Integer id, Integer roleId, PersonIdentifierRoleModel identifierRole) throws RestClientException {
        Object postBody = identifierRole;
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling userIdentifiersUpdateRoleInIdentifier");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling userIdentifiersUpdateRoleInIdentifier");
        }
        
        // verify the required parameter 'roleId' is set
        if (roleId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'roleId' when calling userIdentifiersUpdateRoleInIdentifier");
        }
        
        // verify the required parameter 'identifierRole' is set
        if (identifierRole == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'identifierRole' when calling userIdentifiersUpdateRoleInIdentifier");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("personId", personId);
        uriVariables.put("id", id);
        uriVariables.put("roleId", roleId);
        String path = UriComponentsBuilder.fromPath("/api/users/{personId}/identifiers/{id}/roles/{roleId}").buildAndExpand(uriVariables).toUriString();

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
}
