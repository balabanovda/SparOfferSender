package restclient.api;

import restclient.ApiClient;

import restclient.model.NotifyTemplateViewModel;
import restclient.model.ResultModel;
import restclient.model.ResultModelOfInt32;
import restclient.model.ResultModelOfListOfMailingSubscriptionType;
import restclient.model.ResultModelOfNotifyTemplateViewModel;
import restclient.model.ResultModelOfPagedViewModelOfNotifyTemplateViewModel;

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
@Component("restclient.api.NotifyTemplateApi")
public class NotifyTemplateApi {
    private ApiClient apiClient;

    public NotifyTemplateApi() {
        this(new ApiClient());
    }

    @Autowired
    public NotifyTemplateApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Создает новый шаблон уведомлений.
     * 
     * <p><b>201</b> - Created
     * @param model ViewModel шаблона уведомлений. (required)
     * @return ResultModelOfInt32
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfInt32 notifyTemplateCreateNotifyTemplate(NotifyTemplateViewModel model) throws RestClientException {
        return notifyTemplateCreateNotifyTemplateWithHttpInfo(model).getBody();
    }

    /**
     * Создает новый шаблон уведомлений.
     * 
     * <p><b>201</b> - Created
     * @param model ViewModel шаблона уведомлений. (required)
     * @return ResponseEntity&lt;ResultModelOfInt32&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfInt32> notifyTemplateCreateNotifyTemplateWithHttpInfo(NotifyTemplateViewModel model) throws RestClientException {
        Object postBody = model;
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling notifyTemplateCreateNotifyTemplate");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/notifyTemplates").build().toUriString();

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
     * Удаление шаблона уведомлений.
     * 
     * <p><b>200</b> - OK
     * @param id ID шаблона уведомлений. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel notifyTemplateDeleteNotifyTemplate(Integer id) throws RestClientException {
        return notifyTemplateDeleteNotifyTemplateWithHttpInfo(id).getBody();
    }

    /**
     * Удаление шаблона уведомлений.
     * 
     * <p><b>200</b> - OK
     * @param id ID шаблона уведомлений. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> notifyTemplateDeleteNotifyTemplateWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling notifyTemplateDeleteNotifyTemplate");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/notifyTemplates/{id}").buildAndExpand(uriVariables).toUriString();

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
     * Возвращает список доступных типов подписки.
     * 
     * <p><b>200</b> - OK
     * @return ResultModelOfListOfMailingSubscriptionType
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfMailingSubscriptionType notifyTemplateGetAvailableSubscriptionTypes() throws RestClientException {
        return notifyTemplateGetAvailableSubscriptionTypesWithHttpInfo().getBody();
    }

    /**
     * Возвращает список доступных типов подписки.
     * 
     * <p><b>200</b> - OK
     * @return ResponseEntity&lt;ResultModelOfListOfMailingSubscriptionType&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfMailingSubscriptionType> notifyTemplateGetAvailableSubscriptionTypesWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/notifyTemplates/availableSubscriptionTypes").build().toUriString();

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

        ParameterizedTypeReference<ResultModelOfListOfMailingSubscriptionType> returnType = new ParameterizedTypeReference<ResultModelOfListOfMailingSubscriptionType>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Возвращает шаблон уведомлений по его ID.
     * 
     * <p><b>200</b> - OK
     * @param id ID шаблона уведомлений. (required)
     * @return ResultModelOfNotifyTemplateViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfNotifyTemplateViewModel notifyTemplateGetNotifyTemplate(Integer id) throws RestClientException {
        return notifyTemplateGetNotifyTemplateWithHttpInfo(id).getBody();
    }

    /**
     * Возвращает шаблон уведомлений по его ID.
     * 
     * <p><b>200</b> - OK
     * @param id ID шаблона уведомлений. (required)
     * @return ResponseEntity&lt;ResultModelOfNotifyTemplateViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfNotifyTemplateViewModel> notifyTemplateGetNotifyTemplateWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling notifyTemplateGetNotifyTemplate");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/notifyTemplates/{id}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfNotifyTemplateViewModel> returnType = new ParameterizedTypeReference<ResultModelOfNotifyTemplateViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Возвращает список шаблонов уведомлений.
     * 
     * <p><b>200</b> - OK
     * @param requestModelFrom С какого. (optional)
     * @param requestModelCount Сколько. (optional)
     * @param requestModelTemplateType Тип шаблона уведомлений. (optional)
     * @param requestModelLogicalNameSubStr Подстрока логического имени шаблона. (optional)
     * @param requestModelTextSubStr Подстрока текстового описания шаблона. (optional)
     * @param requestModelSubscriptionType Тип подписки. (optional)
     * @param requestModelShowMode Режим отображения архивных шаблонов. (optional)
     * @return ResultModelOfPagedViewModelOfNotifyTemplateViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfNotifyTemplateViewModel notifyTemplateGetNotifyTemplates(Integer requestModelFrom, Integer requestModelCount, String requestModelTemplateType, String requestModelLogicalNameSubStr, String requestModelTextSubStr, String requestModelSubscriptionType, String requestModelShowMode) throws RestClientException {
        return notifyTemplateGetNotifyTemplatesWithHttpInfo(requestModelFrom, requestModelCount, requestModelTemplateType, requestModelLogicalNameSubStr, requestModelTextSubStr, requestModelSubscriptionType, requestModelShowMode).getBody();
    }

    /**
     * Возвращает список шаблонов уведомлений.
     * 
     * <p><b>200</b> - OK
     * @param requestModelFrom С какого. (optional)
     * @param requestModelCount Сколько. (optional)
     * @param requestModelTemplateType Тип шаблона уведомлений. (optional)
     * @param requestModelLogicalNameSubStr Подстрока логического имени шаблона. (optional)
     * @param requestModelTextSubStr Подстрока текстового описания шаблона. (optional)
     * @param requestModelSubscriptionType Тип подписки. (optional)
     * @param requestModelShowMode Режим отображения архивных шаблонов. (optional)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfNotifyTemplateViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfNotifyTemplateViewModel> notifyTemplateGetNotifyTemplatesWithHttpInfo(Integer requestModelFrom, Integer requestModelCount, String requestModelTemplateType, String requestModelLogicalNameSubStr, String requestModelTextSubStr, String requestModelSubscriptionType, String requestModelShowMode) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/notifyTemplates").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "requestModel.from", requestModelFrom));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "requestModel.count", requestModelCount));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "requestModel.templateType", requestModelTemplateType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "requestModel.logicalNameSubStr", requestModelLogicalNameSubStr));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "requestModel.textSubStr", requestModelTextSubStr));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "requestModel.subscriptionType", requestModelSubscriptionType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "requestModel.showMode", requestModelShowMode));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfNotifyTemplateViewModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfNotifyTemplateViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Восстановление удаленного шаблона уведомлений.
     * 
     * <p><b>200</b> - OK
     * @param id ID шаблона уведомлений. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel notifyTemplateRestoreNotifyTemplate(Integer id) throws RestClientException {
        return notifyTemplateRestoreNotifyTemplateWithHttpInfo(id).getBody();
    }

    /**
     * Восстановление удаленного шаблона уведомлений.
     * 
     * <p><b>200</b> - OK
     * @param id ID шаблона уведомлений. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> notifyTemplateRestoreNotifyTemplateWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling notifyTemplateRestoreNotifyTemplate");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/notifyTemplates/{id}/restore").buildAndExpand(uriVariables).toUriString();

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
     * Редактирование шаблона уведомлений.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор шаблона уведомлений. (required)
     * @param model ViewModel шаблона уведомлений. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel notifyTemplateUpdateNotifyTemplate(Integer id, NotifyTemplateViewModel model) throws RestClientException {
        return notifyTemplateUpdateNotifyTemplateWithHttpInfo(id, model).getBody();
    }

    /**
     * Редактирование шаблона уведомлений.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор шаблона уведомлений. (required)
     * @param model ViewModel шаблона уведомлений. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> notifyTemplateUpdateNotifyTemplateWithHttpInfo(Integer id, NotifyTemplateViewModel model) throws RestClientException {
        Object postBody = model;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling notifyTemplateUpdateNotifyTemplate");
        }
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling notifyTemplateUpdateNotifyTemplate");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/notifyTemplates/{id}").buildAndExpand(uriVariables).toUriString();

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
