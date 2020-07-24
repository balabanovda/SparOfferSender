package restclient.api;

import restclient.ApiClient;

import restclient.model.FixedAnswerViewModel;
import restclient.model.ResultModel;
import restclient.model.ResultModelOfFixedAnswerViewModel;
import restclient.model.ResultModelOfInt32;
import restclient.model.ResultModelOfListOfFixedAnswerViewModel;

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
@Component("restclient.api.FixedAnswerApi")
public class FixedAnswerApi {
    private ApiClient apiClient;

    public FixedAnswerApi() {
        this(new ApiClient());
    }

    @Autowired
    public FixedAnswerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Изменить порядок фиксированного ответа.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор изменяемого фиксированного ответа. (required)
     * @param order Порядок. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel fixedAnswerChangePosition(Integer id, Integer order) throws RestClientException {
        return fixedAnswerChangePositionWithHttpInfo(id, order).getBody();
    }

    /**
     * Изменить порядок фиксированного ответа.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор изменяемого фиксированного ответа. (required)
     * @param order Порядок. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> fixedAnswerChangePositionWithHttpInfo(Integer id, Integer order) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling fixedAnswerChangePosition");
        }
        
        // verify the required parameter 'order' is set
        if (order == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'order' when calling fixedAnswerChangePosition");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/Questions/FixedAnswers/{id}/ChangePosition").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "order", order));

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
     * Создать фиксированный ответ.
     * 
     * <p><b>201</b> - Created
     * @param model Модель фиксированного ответа. (required)
     * @return ResultModelOfInt32
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfInt32 fixedAnswerCreate(FixedAnswerViewModel model) throws RestClientException {
        return fixedAnswerCreateWithHttpInfo(model).getBody();
    }

    /**
     * Создать фиксированный ответ.
     * 
     * <p><b>201</b> - Created
     * @param model Модель фиксированного ответа. (required)
     * @return ResponseEntity&lt;ResultModelOfInt32&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfInt32> fixedAnswerCreateWithHttpInfo(FixedAnswerViewModel model) throws RestClientException {
        Object postBody = model;
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling fixedAnswerCreate");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/Questions/FixedAnswers").build().toUriString();

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
     * Удалить фиксированный ответ.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор удаляемого фиксированного ответа. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel fixedAnswerDelete(Integer id) throws RestClientException {
        return fixedAnswerDeleteWithHttpInfo(id).getBody();
    }

    /**
     * Удалить фиксированный ответ.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор удаляемого фиксированного ответа. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> fixedAnswerDeleteWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling fixedAnswerDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/Questions/FixedAnswers/{id}").buildAndExpand(uriVariables).toUriString();

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
     * Получить фиксированный ответ.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор фиксированного ответа. (required)
     * @return ResultModelOfFixedAnswerViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfFixedAnswerViewModel fixedAnswerGet(Integer id) throws RestClientException {
        return fixedAnswerGetWithHttpInfo(id).getBody();
    }

    /**
     * Получить фиксированный ответ.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор фиксированного ответа. (required)
     * @return ResponseEntity&lt;ResultModelOfFixedAnswerViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfFixedAnswerViewModel> fixedAnswerGetWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling fixedAnswerGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/Questions/FixedAnswers/{id}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfFixedAnswerViewModel> returnType = new ParameterizedTypeReference<ResultModelOfFixedAnswerViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить все фиксированные ответы по вопросу.
     * 
     * <p><b>200</b> - OK
     * @param questionId Id вопроса. (required)
     * @return ResultModelOfListOfFixedAnswerViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfFixedAnswerViewModel fixedAnswerGetAllByQuestion(Integer questionId) throws RestClientException {
        return fixedAnswerGetAllByQuestionWithHttpInfo(questionId).getBody();
    }

    /**
     * Получить все фиксированные ответы по вопросу.
     * 
     * <p><b>200</b> - OK
     * @param questionId Id вопроса. (required)
     * @return ResponseEntity&lt;ResultModelOfListOfFixedAnswerViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfFixedAnswerViewModel> fixedAnswerGetAllByQuestionWithHttpInfo(Integer questionId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'questionId' is set
        if (questionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'questionId' when calling fixedAnswerGetAllByQuestion");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/Questions/FixedAnswers").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "questionId", questionId));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfListOfFixedAnswerViewModel> returnType = new ParameterizedTypeReference<ResultModelOfListOfFixedAnswerViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Обновить фиксированный ответ.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор. (required)
     * @param model Модель фиксированного ответа. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel fixedAnswerUpdate(Integer id, FixedAnswerViewModel model) throws RestClientException {
        return fixedAnswerUpdateWithHttpInfo(id, model).getBody();
    }

    /**
     * Обновить фиксированный ответ.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор. (required)
     * @param model Модель фиксированного ответа. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> fixedAnswerUpdateWithHttpInfo(Integer id, FixedAnswerViewModel model) throws RestClientException {
        Object postBody = model;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling fixedAnswerUpdate");
        }
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling fixedAnswerUpdate");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/Questions/FixedAnswers/{id}").buildAndExpand(uriVariables).toUriString();

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
