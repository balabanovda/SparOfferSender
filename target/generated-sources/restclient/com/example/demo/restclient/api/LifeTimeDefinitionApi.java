package com.example.demo.restclient.api;

import com.example.demo.restclient.ApiClient;

import com.example.demo.restclient.model.LifeTimeDefinitionViewModel;
import com.example.demo.restclient.model.ResultModel;
import com.example.demo.restclient.model.ResultModelOfInt32;
import com.example.demo.restclient.model.ResultModelOfLifeTimeDefinitionViewModel;
import com.example.demo.restclient.model.ResultModelOfPagedViewModelOfLifeTimeDefinitionViewModel;

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
@Component("com.example.demo.restclient.api.LifeTimeDefinitionApi")
public class LifeTimeDefinitionApi {
    private ApiClient apiClient;

    public LifeTimeDefinitionApi() {
        this(new ApiClient());
    }

    @Autowired
    public LifeTimeDefinitionApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Создает время жизни бонуса.
     * 
     * <p><b>201</b> - Created
     * @param model The model. (required)
     * @return ResultModelOfInt32
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfInt32 lifeTimeDefinitionCreateLifeTimeDefinition(LifeTimeDefinitionViewModel model) throws RestClientException {
        return lifeTimeDefinitionCreateLifeTimeDefinitionWithHttpInfo(model).getBody();
    }

    /**
     * Создает время жизни бонуса.
     * 
     * <p><b>201</b> - Created
     * @param model The model. (required)
     * @return ResponseEntity&lt;ResultModelOfInt32&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfInt32> lifeTimeDefinitionCreateLifeTimeDefinitionWithHttpInfo(LifeTimeDefinitionViewModel model) throws RestClientException {
        Object postBody = model;
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling lifeTimeDefinitionCreateLifeTimeDefinition");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/lifeTimeDefinitions").build().toUriString();

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
     * Удаляет время жизни бонуса.
     * 
     * <p><b>200</b> - OK
     * @param id Id времени жизни бонуса. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel lifeTimeDefinitionDeleteLifeTimeDefinition(Integer id) throws RestClientException {
        return lifeTimeDefinitionDeleteLifeTimeDefinitionWithHttpInfo(id).getBody();
    }

    /**
     * Удаляет время жизни бонуса.
     * 
     * <p><b>200</b> - OK
     * @param id Id времени жизни бонуса. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> lifeTimeDefinitionDeleteLifeTimeDefinitionWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling lifeTimeDefinitionDeleteLifeTimeDefinition");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/lifeTimeDefinitions/{id}").buildAndExpand(uriVariables).toUriString();

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
     * Получение времени жизни бонуса.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор времени жизни бонуса. (required)
     * @return ResultModelOfLifeTimeDefinitionViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfLifeTimeDefinitionViewModel lifeTimeDefinitionGetLifeTimeDefinition(Integer id) throws RestClientException {
        return lifeTimeDefinitionGetLifeTimeDefinitionWithHttpInfo(id).getBody();
    }

    /**
     * Получение времени жизни бонуса.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор времени жизни бонуса. (required)
     * @return ResponseEntity&lt;ResultModelOfLifeTimeDefinitionViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfLifeTimeDefinitionViewModel> lifeTimeDefinitionGetLifeTimeDefinitionWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling lifeTimeDefinitionGetLifeTimeDefinition");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/lifeTimeDefinitions/{id}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfLifeTimeDefinitionViewModel> returnType = new ParameterizedTypeReference<ResultModelOfLifeTimeDefinitionViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param name  (optional, default to )
     * @param status  (optional)
     * @param from  (optional, default to 0)
     * @param count  (optional, default to 10)
     * @param logicalName  (optional, default to )
     * @param partnerId  (optional)
     * @param lifeTimeDefinitionIds  (optional)
     * @return ResultModelOfPagedViewModelOfLifeTimeDefinitionViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfLifeTimeDefinitionViewModel lifeTimeDefinitionGetLifeTimeDefinitions(String name, String status, Integer from, Integer count, String logicalName, Integer partnerId, List<Integer> lifeTimeDefinitionIds) throws RestClientException {
        return lifeTimeDefinitionGetLifeTimeDefinitionsWithHttpInfo(name, status, from, count, logicalName, partnerId, lifeTimeDefinitionIds).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param name  (optional, default to )
     * @param status  (optional)
     * @param from  (optional, default to 0)
     * @param count  (optional, default to 10)
     * @param logicalName  (optional, default to )
     * @param partnerId  (optional)
     * @param lifeTimeDefinitionIds  (optional)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfLifeTimeDefinitionViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfLifeTimeDefinitionViewModel> lifeTimeDefinitionGetLifeTimeDefinitionsWithHttpInfo(String name, String status, Integer from, Integer count, String logicalName, Integer partnerId, List<Integer> lifeTimeDefinitionIds) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/lifeTimeDefinitions").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "status", status));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "logicalName", logicalName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "partnerId", partnerId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "lifeTimeDefinitionIds", lifeTimeDefinitionIds));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfLifeTimeDefinitionViewModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfLifeTimeDefinitionViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Востанавливает время жизни бонуса.
     * 
     * <p><b>200</b> - OK
     * @param id Id времени жизни бонуса. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel lifeTimeDefinitionRestoreLifeTimeDefinition(Integer id) throws RestClientException {
        return lifeTimeDefinitionRestoreLifeTimeDefinitionWithHttpInfo(id).getBody();
    }

    /**
     * Востанавливает время жизни бонуса.
     * 
     * <p><b>200</b> - OK
     * @param id Id времени жизни бонуса. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> lifeTimeDefinitionRestoreLifeTimeDefinitionWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling lifeTimeDefinitionRestoreLifeTimeDefinition");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/lifeTimeDefinitions/{id}/restore").buildAndExpand(uriVariables).toUriString();

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
     * Редактирование времени жизни бонуса.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор времени жизни бонуса. (required)
     * @param model The model. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel lifeTimeDefinitionUpdateLifeTimeDefinition(Integer id, LifeTimeDefinitionViewModel model) throws RestClientException {
        return lifeTimeDefinitionUpdateLifeTimeDefinitionWithHttpInfo(id, model).getBody();
    }

    /**
     * Редактирование времени жизни бонуса.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор времени жизни бонуса. (required)
     * @param model The model. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> lifeTimeDefinitionUpdateLifeTimeDefinitionWithHttpInfo(Integer id, LifeTimeDefinitionViewModel model) throws RestClientException {
        Object postBody = model;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling lifeTimeDefinitionUpdateLifeTimeDefinition");
        }
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling lifeTimeDefinitionUpdateLifeTimeDefinition");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/lifeTimeDefinitions/{id}").buildAndExpand(uriVariables).toUriString();

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
