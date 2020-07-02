package com.example.demo.restclient.api;

import com.example.demo.restclient.ApiClient;

import com.example.demo.restclient.model.LimitBorderModel;
import com.example.demo.restclient.model.ResultModel;
import com.example.demo.restclient.model.ResultModelOfInt32;
import com.example.demo.restclient.model.ResultModelOfLimitBorderModel;
import com.example.demo.restclient.model.ResultModelOfListOfLimitBorderModel;

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
@Component("com.example.demo.restclient.api.LimitBorderApi")
public class LimitBorderApi {
    private ApiClient apiClient;

    public LimitBorderApi() {
        this(new ApiClient());
    }

    @Autowired
    public LimitBorderApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Добавить новую границу.
     * 
     * <p><b>201</b> - Created
     * @param ruleId Правило, для которого добавляем границу. (required)
     * @param limitBorderModel Граница. (required)
     * @return ResultModelOfInt32
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfInt32 limitBorderAddBorder(Integer ruleId, LimitBorderModel limitBorderModel) throws RestClientException {
        return limitBorderAddBorderWithHttpInfo(ruleId, limitBorderModel).getBody();
    }

    /**
     * Добавить новую границу.
     * 
     * <p><b>201</b> - Created
     * @param ruleId Правило, для которого добавляем границу. (required)
     * @param limitBorderModel Граница. (required)
     * @return ResponseEntity&lt;ResultModelOfInt32&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfInt32> limitBorderAddBorderWithHttpInfo(Integer ruleId, LimitBorderModel limitBorderModel) throws RestClientException {
        Object postBody = limitBorderModel;
        
        // verify the required parameter 'ruleId' is set
        if (ruleId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ruleId' when calling limitBorderAddBorder");
        }
        
        // verify the required parameter 'limitBorderModel' is set
        if (limitBorderModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'limitBorderModel' when calling limitBorderAddBorder");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("ruleId", ruleId);
        String path = UriComponentsBuilder.fromPath("/api/LimitRules/{ruleId}/Borders").buildAndExpand(uriVariables).toUriString();

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
     * Удаление границы.
     * 
     * <p><b>200</b> - OK
     * @param ruleId Идентификатор правила. (required)
     * @param borderId Идентификатор границы. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel limitBorderDeleteBorder(Integer ruleId, Integer borderId) throws RestClientException {
        return limitBorderDeleteBorderWithHttpInfo(ruleId, borderId).getBody();
    }

    /**
     * Удаление границы.
     * 
     * <p><b>200</b> - OK
     * @param ruleId Идентификатор правила. (required)
     * @param borderId Идентификатор границы. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> limitBorderDeleteBorderWithHttpInfo(Integer ruleId, Integer borderId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'ruleId' is set
        if (ruleId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ruleId' when calling limitBorderDeleteBorder");
        }
        
        // verify the required parameter 'borderId' is set
        if (borderId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'borderId' when calling limitBorderDeleteBorder");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("ruleId", ruleId);
        uriVariables.put("borderId", borderId);
        String path = UriComponentsBuilder.fromPath("/api/LimitRules/{ruleId}/Borders/{borderId}").buildAndExpand(uriVariables).toUriString();

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
     * Получить границу для указанного правила.
     * 
     * <p><b>200</b> - OK
     * @param ruleId Идентификатор правила. (required)
     * @param borderId Идентификатор границы. (required)
     * @return ResultModelOfLimitBorderModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfLimitBorderModel limitBorderGetBorder(Integer ruleId, Integer borderId) throws RestClientException {
        return limitBorderGetBorderWithHttpInfo(ruleId, borderId).getBody();
    }

    /**
     * Получить границу для указанного правила.
     * 
     * <p><b>200</b> - OK
     * @param ruleId Идентификатор правила. (required)
     * @param borderId Идентификатор границы. (required)
     * @return ResponseEntity&lt;ResultModelOfLimitBorderModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfLimitBorderModel> limitBorderGetBorderWithHttpInfo(Integer ruleId, Integer borderId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'ruleId' is set
        if (ruleId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ruleId' when calling limitBorderGetBorder");
        }
        
        // verify the required parameter 'borderId' is set
        if (borderId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'borderId' when calling limitBorderGetBorder");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("ruleId", ruleId);
        uriVariables.put("borderId", borderId);
        String path = UriComponentsBuilder.fromPath("/api/LimitRules/{ruleId}/Borders/{borderId}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfLimitBorderModel> returnType = new ParameterizedTypeReference<ResultModelOfLimitBorderModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить список границ для указанного правила.
     * 
     * <p><b>200</b> - OK
     * @param ruleId Идентификатор правила. (required)
     * @return ResultModelOfListOfLimitBorderModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfLimitBorderModel limitBorderGetBorders(Integer ruleId) throws RestClientException {
        return limitBorderGetBordersWithHttpInfo(ruleId).getBody();
    }

    /**
     * Получить список границ для указанного правила.
     * 
     * <p><b>200</b> - OK
     * @param ruleId Идентификатор правила. (required)
     * @return ResponseEntity&lt;ResultModelOfListOfLimitBorderModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfLimitBorderModel> limitBorderGetBordersWithHttpInfo(Integer ruleId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'ruleId' is set
        if (ruleId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ruleId' when calling limitBorderGetBorders");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("ruleId", ruleId);
        String path = UriComponentsBuilder.fromPath("/api/LimitRules/{ruleId}/Borders").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfListOfLimitBorderModel> returnType = new ParameterizedTypeReference<ResultModelOfListOfLimitBorderModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Восстановление границы.
     * 
     * <p><b>200</b> - OK
     * @param ruleId Идентификатор правила. (required)
     * @param borderId Идентификатор границы. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel limitBorderRestoreBorder(Integer ruleId, Integer borderId) throws RestClientException {
        return limitBorderRestoreBorderWithHttpInfo(ruleId, borderId).getBody();
    }

    /**
     * Восстановление границы.
     * 
     * <p><b>200</b> - OK
     * @param ruleId Идентификатор правила. (required)
     * @param borderId Идентификатор границы. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> limitBorderRestoreBorderWithHttpInfo(Integer ruleId, Integer borderId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'ruleId' is set
        if (ruleId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ruleId' when calling limitBorderRestoreBorder");
        }
        
        // verify the required parameter 'borderId' is set
        if (borderId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'borderId' when calling limitBorderRestoreBorder");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("ruleId", ruleId);
        uriVariables.put("borderId", borderId);
        String path = UriComponentsBuilder.fromPath("/api/LimitRules/{ruleId}/Borders/{borderId}/Restore").buildAndExpand(uriVariables).toUriString();

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
     * Редактирование границы конкретного правила.
     * 
     * <p><b>200</b> - OK
     * @param ruleId Идентификатор правила. (required)
     * @param borderId Идентификатор границы. (required)
     * @param borderModel Вносимые изменения для границы. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel limitBorderUpdateBorder(Integer ruleId, Integer borderId, LimitBorderModel borderModel) throws RestClientException {
        return limitBorderUpdateBorderWithHttpInfo(ruleId, borderId, borderModel).getBody();
    }

    /**
     * Редактирование границы конкретного правила.
     * 
     * <p><b>200</b> - OK
     * @param ruleId Идентификатор правила. (required)
     * @param borderId Идентификатор границы. (required)
     * @param borderModel Вносимые изменения для границы. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> limitBorderUpdateBorderWithHttpInfo(Integer ruleId, Integer borderId, LimitBorderModel borderModel) throws RestClientException {
        Object postBody = borderModel;
        
        // verify the required parameter 'ruleId' is set
        if (ruleId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ruleId' when calling limitBorderUpdateBorder");
        }
        
        // verify the required parameter 'borderId' is set
        if (borderId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'borderId' when calling limitBorderUpdateBorder");
        }
        
        // verify the required parameter 'borderModel' is set
        if (borderModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'borderModel' when calling limitBorderUpdateBorder");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("ruleId", ruleId);
        uriVariables.put("borderId", borderId);
        String path = UriComponentsBuilder.fromPath("/api/LimitRules/{ruleId}/Borders/{borderId}").buildAndExpand(uriVariables).toUriString();

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
