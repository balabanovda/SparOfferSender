package restclient.api;

import restclient.ApiClient;

import restclient.model.LimitActionViewModel;
import restclient.model.ResultModel;
import restclient.model.ResultModelOfInt32;
import restclient.model.ResultModelOfLimitActionViewModel;
import restclient.model.ResultModelOfListOfLimitActionViewModel;

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
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
@Component("restclient.api.LimitActionApi")
public class LimitActionApi {
    private ApiClient apiClient;

    public LimitActionApi() {
        this(new ApiClient());
    }

    @Autowired
    public LimitActionApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Добавить новое действие.
     * 
     * <p><b>201</b> - Created
     * @param ruleId Правило, для которого добавляем действие. (required)
     * @param borderId Идентификатор границы. (required)
     * @param limitActionViewModel Действие. (required)
     * @return ResultModelOfInt32
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfInt32 limitActionAddAction(Integer ruleId, Integer borderId, LimitActionViewModel limitActionViewModel) throws RestClientException {
        return limitActionAddActionWithHttpInfo(ruleId, borderId, limitActionViewModel).getBody();
    }

    /**
     * Добавить новое действие.
     * 
     * <p><b>201</b> - Created
     * @param ruleId Правило, для которого добавляем действие. (required)
     * @param borderId Идентификатор границы. (required)
     * @param limitActionViewModel Действие. (required)
     * @return ResponseEntity&lt;ResultModelOfInt32&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfInt32> limitActionAddActionWithHttpInfo(Integer ruleId, Integer borderId, LimitActionViewModel limitActionViewModel) throws RestClientException {
        Object postBody = limitActionViewModel;
        
        // verify the required parameter 'ruleId' is set
        if (ruleId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ruleId' when calling limitActionAddAction");
        }
        
        // verify the required parameter 'borderId' is set
        if (borderId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'borderId' when calling limitActionAddAction");
        }
        
        // verify the required parameter 'limitActionViewModel' is set
        if (limitActionViewModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'limitActionViewModel' when calling limitActionAddAction");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("ruleId", ruleId);
        uriVariables.put("borderId", borderId);
        String path = UriComponentsBuilder.fromPath("/api/LimitRules/{ruleId}/Borders/{borderId}/Actions").buildAndExpand(uriVariables).toUriString();

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
     * Удаление действия.
     * 
     * <p><b>200</b> - OK
     * @param ruleId Идентификатор правила. (required)
     * @param borderId Идентификатор границы. (required)
     * @param actionId Идентификатор действия. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel limitActionDeleteAction(Integer ruleId, Integer borderId, Integer actionId) throws RestClientException {
        return limitActionDeleteActionWithHttpInfo(ruleId, borderId, actionId).getBody();
    }

    /**
     * Удаление действия.
     * 
     * <p><b>200</b> - OK
     * @param ruleId Идентификатор правила. (required)
     * @param borderId Идентификатор границы. (required)
     * @param actionId Идентификатор действия. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> limitActionDeleteActionWithHttpInfo(Integer ruleId, Integer borderId, Integer actionId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'ruleId' is set
        if (ruleId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ruleId' when calling limitActionDeleteAction");
        }
        
        // verify the required parameter 'borderId' is set
        if (borderId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'borderId' when calling limitActionDeleteAction");
        }
        
        // verify the required parameter 'actionId' is set
        if (actionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'actionId' when calling limitActionDeleteAction");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("ruleId", ruleId);
        uriVariables.put("borderId", borderId);
        uriVariables.put("actionId", actionId);
        String path = UriComponentsBuilder.fromPath("/api/LimitRules/{ruleId}/Borders/{borderId}/Actions/{actionId}").buildAndExpand(uriVariables).toUriString();

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
     * Получить действие для конкретной границы правила.
     * 
     * <p><b>200</b> - OK
     * @param ruleId Идентификатор правила. (required)
     * @param borderId Идентификатор границы. (required)
     * @param actionId Идентификатор действия. (required)
     * @return ResultModelOfLimitActionViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfLimitActionViewModel limitActionGetAction(Integer ruleId, Integer borderId, Integer actionId) throws RestClientException {
        return limitActionGetActionWithHttpInfo(ruleId, borderId, actionId).getBody();
    }

    /**
     * Получить действие для конкретной границы правила.
     * 
     * <p><b>200</b> - OK
     * @param ruleId Идентификатор правила. (required)
     * @param borderId Идентификатор границы. (required)
     * @param actionId Идентификатор действия. (required)
     * @return ResponseEntity&lt;ResultModelOfLimitActionViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfLimitActionViewModel> limitActionGetActionWithHttpInfo(Integer ruleId, Integer borderId, Integer actionId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'ruleId' is set
        if (ruleId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ruleId' when calling limitActionGetAction");
        }
        
        // verify the required parameter 'borderId' is set
        if (borderId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'borderId' when calling limitActionGetAction");
        }
        
        // verify the required parameter 'actionId' is set
        if (actionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'actionId' when calling limitActionGetAction");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("ruleId", ruleId);
        uriVariables.put("borderId", borderId);
        uriVariables.put("actionId", actionId);
        String path = UriComponentsBuilder.fromPath("/api/LimitRules/{ruleId}/Borders/{borderId}/Actions/{actionId}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfLimitActionViewModel> returnType = new ParameterizedTypeReference<ResultModelOfLimitActionViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить список действий.
     * 
     * <p><b>200</b> - OK
     * @param ruleId Идентификатор правила. (required)
     * @param borderId Идентификатор границы. (required)
     * @return ResultModelOfListOfLimitActionViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfLimitActionViewModel limitActionGetActions(Integer ruleId, Integer borderId) throws RestClientException {
        return limitActionGetActionsWithHttpInfo(ruleId, borderId).getBody();
    }

    /**
     * Получить список действий.
     * 
     * <p><b>200</b> - OK
     * @param ruleId Идентификатор правила. (required)
     * @param borderId Идентификатор границы. (required)
     * @return ResponseEntity&lt;ResultModelOfListOfLimitActionViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfLimitActionViewModel> limitActionGetActionsWithHttpInfo(Integer ruleId, Integer borderId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'ruleId' is set
        if (ruleId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ruleId' when calling limitActionGetActions");
        }
        
        // verify the required parameter 'borderId' is set
        if (borderId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'borderId' when calling limitActionGetActions");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("ruleId", ruleId);
        uriVariables.put("borderId", borderId);
        String path = UriComponentsBuilder.fromPath("/api/LimitRules/{ruleId}/Borders/{borderId}/Actions").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfListOfLimitActionViewModel> returnType = new ParameterizedTypeReference<ResultModelOfListOfLimitActionViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Восстановление действия.
     * 
     * <p><b>200</b> - OK
     * @param ruleId Идентификатор правила. (required)
     * @param borderId Идентификатор границы. (required)
     * @param actionId Идентификатор действия. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel limitActionRestoreAction(Integer ruleId, Integer borderId, Integer actionId) throws RestClientException {
        return limitActionRestoreActionWithHttpInfo(ruleId, borderId, actionId).getBody();
    }

    /**
     * Восстановление действия.
     * 
     * <p><b>200</b> - OK
     * @param ruleId Идентификатор правила. (required)
     * @param borderId Идентификатор границы. (required)
     * @param actionId Идентификатор действия. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> limitActionRestoreActionWithHttpInfo(Integer ruleId, Integer borderId, Integer actionId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'ruleId' is set
        if (ruleId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ruleId' when calling limitActionRestoreAction");
        }
        
        // verify the required parameter 'borderId' is set
        if (borderId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'borderId' when calling limitActionRestoreAction");
        }
        
        // verify the required parameter 'actionId' is set
        if (actionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'actionId' when calling limitActionRestoreAction");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("ruleId", ruleId);
        uriVariables.put("borderId", borderId);
        uriVariables.put("actionId", actionId);
        String path = UriComponentsBuilder.fromPath("/api/LimitRules/{ruleId}/Borders/{borderId}/Actions/{actionId}/Restore").buildAndExpand(uriVariables).toUriString();

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
     * Редактирование действие.
     * 
     * <p><b>200</b> - OK
     * @param ruleId Правило, для которого редактируем действие. (required)
     * @param borderId Идентификатор границы. (required)
     * @param actionId Идентификатор действия. (required)
     * @param limitActionViewModel Вносимые изменения. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel limitActionUpdateAction(Integer ruleId, Integer borderId, Integer actionId, LimitActionViewModel limitActionViewModel) throws RestClientException {
        return limitActionUpdateActionWithHttpInfo(ruleId, borderId, actionId, limitActionViewModel).getBody();
    }

    /**
     * Редактирование действие.
     * 
     * <p><b>200</b> - OK
     * @param ruleId Правило, для которого редактируем действие. (required)
     * @param borderId Идентификатор границы. (required)
     * @param actionId Идентификатор действия. (required)
     * @param limitActionViewModel Вносимые изменения. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> limitActionUpdateActionWithHttpInfo(Integer ruleId, Integer borderId, Integer actionId, LimitActionViewModel limitActionViewModel) throws RestClientException {
        Object postBody = limitActionViewModel;
        
        // verify the required parameter 'ruleId' is set
        if (ruleId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ruleId' when calling limitActionUpdateAction");
        }
        
        // verify the required parameter 'borderId' is set
        if (borderId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'borderId' when calling limitActionUpdateAction");
        }
        
        // verify the required parameter 'actionId' is set
        if (actionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'actionId' when calling limitActionUpdateAction");
        }
        
        // verify the required parameter 'limitActionViewModel' is set
        if (limitActionViewModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'limitActionViewModel' when calling limitActionUpdateAction");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("ruleId", ruleId);
        uriVariables.put("borderId", borderId);
        uriVariables.put("actionId", actionId);
        String path = UriComponentsBuilder.fromPath("/api/LimitRules/{ruleId}/Borders/{borderId}/Actions/{actionId}").buildAndExpand(uriVariables).toUriString();

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
