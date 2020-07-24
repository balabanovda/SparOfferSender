package restclient.api;

import restclient.ApiClient;

import restclient.model.RequestPersonIdentifierViewModel;
import restclient.model.ResultModel;
import restclient.model.ResultModelOfPagedViewModelOfRequestPersonIdentifierViewModel;
import restclient.model.ResultModelOfRequestPersonIdentifierViewModel;

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
@Component("restclient.api.RequestPersonIdentifierApi")
public class RequestPersonIdentifierApi {
    private ApiClient apiClient;

    public RequestPersonIdentifierApi() {
        this(new ApiClient());
    }

    @Autowired
    public RequestPersonIdentifierApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Создание идентификации пользователя в запросах от кассы.
     * 
     * <p><b>201</b> - Created
     * @param requestPersonIdentifierViewModel Данные идентификатора пользователя в запросах от кассы. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel requestPersonIdentifierCreate(RequestPersonIdentifierViewModel requestPersonIdentifierViewModel) throws RestClientException {
        return requestPersonIdentifierCreateWithHttpInfo(requestPersonIdentifierViewModel).getBody();
    }

    /**
     * Создание идентификации пользователя в запросах от кассы.
     * 
     * <p><b>201</b> - Created
     * @param requestPersonIdentifierViewModel Данные идентификатора пользователя в запросах от кассы. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> requestPersonIdentifierCreateWithHttpInfo(RequestPersonIdentifierViewModel requestPersonIdentifierViewModel) throws RestClientException {
        Object postBody = requestPersonIdentifierViewModel;
        
        // verify the required parameter 'requestPersonIdentifierViewModel' is set
        if (requestPersonIdentifierViewModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'requestPersonIdentifierViewModel' when calling requestPersonIdentifierCreate");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/RequestPersonIdentifiers").build().toUriString();

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
     * Удаление идентификации пользователя в запросах от кассы.
     * 
     * <p><b>200</b> - OK
     * @param id Id запроса. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel requestPersonIdentifierDelete(Integer id) throws RestClientException {
        return requestPersonIdentifierDeleteWithHttpInfo(id).getBody();
    }

    /**
     * Удаление идентификации пользователя в запросах от кассы.
     * 
     * <p><b>200</b> - OK
     * @param id Id запроса. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> requestPersonIdentifierDeleteWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling requestPersonIdentifierDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/RequestPersonIdentifiers/{id}").buildAndExpand(uriVariables).toUriString();

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
     * Возвращает идентификацию пользователя в запросах от кассы по id.
     * 
     * <p><b>200</b> - OK
     * @param id Id запроса. (required)
     * @return ResultModelOfRequestPersonIdentifierViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfRequestPersonIdentifierViewModel requestPersonIdentifierGet(Integer id) throws RestClientException {
        return requestPersonIdentifierGetWithHttpInfo(id).getBody();
    }

    /**
     * Возвращает идентификацию пользователя в запросах от кассы по id.
     * 
     * <p><b>200</b> - OK
     * @param id Id запроса. (required)
     * @return ResponseEntity&lt;ResultModelOfRequestPersonIdentifierViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfRequestPersonIdentifierViewModel> requestPersonIdentifierGetWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling requestPersonIdentifierGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/RequestPersonIdentifiers/{id}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfRequestPersonIdentifierViewModel> returnType = new ParameterizedTypeReference<ResultModelOfRequestPersonIdentifierViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получает список всех идентификаций пользователей в запросах от кассы.
     * 
     * <p><b>200</b> - OK
     * @param from С какой позиции. (optional, default to 0)
     * @param count Количество. (optional, default to 2147483647)
     * @param loyaltyProgramId Идентификатор программы лояльности. (optional)
     * @param modeView Перечисление режимов отображения. (optional)
     * @return ResultModelOfPagedViewModelOfRequestPersonIdentifierViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfRequestPersonIdentifierViewModel requestPersonIdentifierGetList(Integer from, Integer count, Integer loyaltyProgramId, String modeView) throws RestClientException {
        return requestPersonIdentifierGetListWithHttpInfo(from, count, loyaltyProgramId, modeView).getBody();
    }

    /**
     * Получает список всех идентификаций пользователей в запросах от кассы.
     * 
     * <p><b>200</b> - OK
     * @param from С какой позиции. (optional, default to 0)
     * @param count Количество. (optional, default to 2147483647)
     * @param loyaltyProgramId Идентификатор программы лояльности. (optional)
     * @param modeView Перечисление режимов отображения. (optional)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfRequestPersonIdentifierViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfRequestPersonIdentifierViewModel> requestPersonIdentifierGetListWithHttpInfo(Integer from, Integer count, Integer loyaltyProgramId, String modeView) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/RequestPersonIdentifiers").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "loyaltyProgramId", loyaltyProgramId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "modeView", modeView));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfRequestPersonIdentifierViewModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfRequestPersonIdentifierViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Восстановление идентификации пользователя в запросах от кассы.
     * 
     * <p><b>200</b> - OK
     * @param id Id запроса. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel requestPersonIdentifierRestore(Integer id) throws RestClientException {
        return requestPersonIdentifierRestoreWithHttpInfo(id).getBody();
    }

    /**
     * Восстановление идентификации пользователя в запросах от кассы.
     * 
     * <p><b>200</b> - OK
     * @param id Id запроса. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> requestPersonIdentifierRestoreWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling requestPersonIdentifierRestore");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/RequestPersonIdentifiers/{id}/restore").buildAndExpand(uriVariables).toUriString();

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
     * Изменение идентификации пользователя в запросах от кассы.
     * 
     * <p><b>200</b> - OK
     * @param id Id идентификации пользователя. (required)
     * @param requestPersonIdentifierViewModel Модель идентификации пользователя в запросах от кассы. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel requestPersonIdentifierUpdate(Integer id, RequestPersonIdentifierViewModel requestPersonIdentifierViewModel) throws RestClientException {
        return requestPersonIdentifierUpdateWithHttpInfo(id, requestPersonIdentifierViewModel).getBody();
    }

    /**
     * Изменение идентификации пользователя в запросах от кассы.
     * 
     * <p><b>200</b> - OK
     * @param id Id идентификации пользователя. (required)
     * @param requestPersonIdentifierViewModel Модель идентификации пользователя в запросах от кассы. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> requestPersonIdentifierUpdateWithHttpInfo(Integer id, RequestPersonIdentifierViewModel requestPersonIdentifierViewModel) throws RestClientException {
        Object postBody = requestPersonIdentifierViewModel;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling requestPersonIdentifierUpdate");
        }
        
        // verify the required parameter 'requestPersonIdentifierViewModel' is set
        if (requestPersonIdentifierViewModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'requestPersonIdentifierViewModel' when calling requestPersonIdentifierUpdate");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/RequestPersonIdentifiers/{id}").buildAndExpand(uriVariables).toUriString();

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
