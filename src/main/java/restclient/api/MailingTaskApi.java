package restclient.api;

import restclient.ApiClient;

import restclient.model.ResultModelOfMailingTaskViewModel;
import restclient.model.ResultModelOfPagedViewModelOfMailingTaskViewModel;

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
@Component("restclient.api.MailingTaskApi")
public class MailingTaskApi {
    private ApiClient apiClient;

    public MailingTaskApi() {
        this(new ApiClient());
    }

    @Autowired
    public MailingTaskApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Отменяет задачу рассылки.
     * 
     * <p><b>200</b> - OK
     * @param mailingId Идентификатор рассылки. (required)
     * @param mailingTaskId Идентификатор задачи. (required)
     * @return ResultModelOfMailingTaskViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfMailingTaskViewModel mailingTaskCancel(Integer mailingId, Integer mailingTaskId) throws RestClientException {
        return mailingTaskCancelWithHttpInfo(mailingId, mailingTaskId).getBody();
    }

    /**
     * Отменяет задачу рассылки.
     * 
     * <p><b>200</b> - OK
     * @param mailingId Идентификатор рассылки. (required)
     * @param mailingTaskId Идентификатор задачи. (required)
     * @return ResponseEntity&lt;ResultModelOfMailingTaskViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfMailingTaskViewModel> mailingTaskCancelWithHttpInfo(Integer mailingId, Integer mailingTaskId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'mailingId' is set
        if (mailingId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailingId' when calling mailingTaskCancel");
        }
        
        // verify the required parameter 'mailingTaskId' is set
        if (mailingTaskId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailingTaskId' when calling mailingTaskCancel");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("mailingId", mailingId);
        uriVariables.put("mailingTaskId", mailingTaskId);
        String path = UriComponentsBuilder.fromPath("/api/mailings/{mailingId}/tasks/{mailingTaskId}/cancel").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfMailingTaskViewModel> returnType = new ParameterizedTypeReference<ResultModelOfMailingTaskViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Возвращает список задач для рассылки.
     * 
     * <p><b>200</b> - OK
     * @param mailingId Идентификатор рассылки. (required)
     * @param from С какой задачи по порядку. (required)
     * @param count Количество задач. (required)
     * @return ResultModelOfPagedViewModelOfMailingTaskViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfMailingTaskViewModel mailingTaskGetMailingsTasks(Integer mailingId, Integer from, Integer count) throws RestClientException {
        return mailingTaskGetMailingsTasksWithHttpInfo(mailingId, from, count).getBody();
    }

    /**
     * Возвращает список задач для рассылки.
     * 
     * <p><b>200</b> - OK
     * @param mailingId Идентификатор рассылки. (required)
     * @param from С какой задачи по порядку. (required)
     * @param count Количество задач. (required)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfMailingTaskViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfMailingTaskViewModel> mailingTaskGetMailingsTasksWithHttpInfo(Integer mailingId, Integer from, Integer count) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'mailingId' is set
        if (mailingId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailingId' when calling mailingTaskGetMailingsTasks");
        }
        
        // verify the required parameter 'from' is set
        if (from == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'from' when calling mailingTaskGetMailingsTasks");
        }
        
        // verify the required parameter 'count' is set
        if (count == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'count' when calling mailingTaskGetMailingsTasks");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("mailingId", mailingId);
        String path = UriComponentsBuilder.fromPath("/api/mailings/{mailingId}/tasks").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfMailingTaskViewModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfMailingTaskViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
