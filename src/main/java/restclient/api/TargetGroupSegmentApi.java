package restclient.api;

import restclient.ApiClient;

import restclient.model.ResultModel;
import restclient.model.ResultModelOfCalculationModel;
import restclient.model.ResultModelOfInt32;
import restclient.model.ResultModelOfPagedViewModelOfTargetGroupSegmentViewModel;
import restclient.model.ResultModelOfTargetGroupSegmentViewModel;
import restclient.model.TargetGroupSegmentModel;

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
@Component("restclient.api.TargetGroupSegmentApi")
public class TargetGroupSegmentApi {
    private ApiClient apiClient;

    public TargetGroupSegmentApi() {
        this(new ApiClient());
    }

    @Autowired
    public TargetGroupSegmentApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Запуск расчета сегмента целевой аудитории.
     * 
     * <p><b>200</b> - OK
     * @param targetGroupId Id целевой аудитории. (required)
     * @param segmentId Id сегмента. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel targetGroupSegmentCalculateTargetGroupSegment(Integer targetGroupId, Integer segmentId) throws RestClientException {
        return targetGroupSegmentCalculateTargetGroupSegmentWithHttpInfo(targetGroupId, segmentId).getBody();
    }

    /**
     * Запуск расчета сегмента целевой аудитории.
     * 
     * <p><b>200</b> - OK
     * @param targetGroupId Id целевой аудитории. (required)
     * @param segmentId Id сегмента. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> targetGroupSegmentCalculateTargetGroupSegmentWithHttpInfo(Integer targetGroupId, Integer segmentId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'targetGroupId' is set
        if (targetGroupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'targetGroupId' when calling targetGroupSegmentCalculateTargetGroupSegment");
        }
        
        // verify the required parameter 'segmentId' is set
        if (segmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'segmentId' when calling targetGroupSegmentCalculateTargetGroupSegment");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("targetGroupId", targetGroupId);
        uriVariables.put("segmentId", segmentId);
        String path = UriComponentsBuilder.fromPath("/api/targetGroups/{targetGroupId}/segments/{segmentId}/calculate").buildAndExpand(uriVariables).toUriString();

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
     * Создание сегмента целевой аудитории.
     * 
     * <p><b>201</b> - Created
     * @param targetGroupId Id целевой аудитории. (required)
     * @param model Модель сегмента целевой аудитории. (required)
     * @return ResultModelOfInt32
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfInt32 targetGroupSegmentCreateTargetGroupSegment(Integer targetGroupId, TargetGroupSegmentModel model) throws RestClientException {
        return targetGroupSegmentCreateTargetGroupSegmentWithHttpInfo(targetGroupId, model).getBody();
    }

    /**
     * Создание сегмента целевой аудитории.
     * 
     * <p><b>201</b> - Created
     * @param targetGroupId Id целевой аудитории. (required)
     * @param model Модель сегмента целевой аудитории. (required)
     * @return ResponseEntity&lt;ResultModelOfInt32&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfInt32> targetGroupSegmentCreateTargetGroupSegmentWithHttpInfo(Integer targetGroupId, TargetGroupSegmentModel model) throws RestClientException {
        Object postBody = model;
        
        // verify the required parameter 'targetGroupId' is set
        if (targetGroupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'targetGroupId' when calling targetGroupSegmentCreateTargetGroupSegment");
        }
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling targetGroupSegmentCreateTargetGroupSegment");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("targetGroupId", targetGroupId);
        String path = UriComponentsBuilder.fromPath("/api/targetGroups/{targetGroupId}/segments").buildAndExpand(uriVariables).toUriString();

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
     * Удалить сегмент целевой аудитории.
     * 
     * <p><b>200</b> - OK
     * @param targetGroupId Id целевой аудитории. (required)
     * @param segmentId Id сегмента. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel targetGroupSegmentDeleteTargetGroupSegment(Integer targetGroupId, Integer segmentId) throws RestClientException {
        return targetGroupSegmentDeleteTargetGroupSegmentWithHttpInfo(targetGroupId, segmentId).getBody();
    }

    /**
     * Удалить сегмент целевой аудитории.
     * 
     * <p><b>200</b> - OK
     * @param targetGroupId Id целевой аудитории. (required)
     * @param segmentId Id сегмента. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> targetGroupSegmentDeleteTargetGroupSegmentWithHttpInfo(Integer targetGroupId, Integer segmentId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'targetGroupId' is set
        if (targetGroupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'targetGroupId' when calling targetGroupSegmentDeleteTargetGroupSegment");
        }
        
        // verify the required parameter 'segmentId' is set
        if (segmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'segmentId' when calling targetGroupSegmentDeleteTargetGroupSegment");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("targetGroupId", targetGroupId);
        uriVariables.put("segmentId", segmentId);
        String path = UriComponentsBuilder.fromPath("/api/targetGroups/{targetGroupId}/segments/{segmentId}").buildAndExpand(uriVariables).toUriString();

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
     * Получить сегмент целевой аудитории.
     * 
     * <p><b>200</b> - OK
     * @param targetGroupId Id целевой аудитории. (required)
     * @param id Id сегмента. (required)
     * @return ResultModelOfTargetGroupSegmentViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfTargetGroupSegmentViewModel targetGroupSegmentGetTargetGroupSegment(Integer targetGroupId, Integer id) throws RestClientException {
        return targetGroupSegmentGetTargetGroupSegmentWithHttpInfo(targetGroupId, id).getBody();
    }

    /**
     * Получить сегмент целевой аудитории.
     * 
     * <p><b>200</b> - OK
     * @param targetGroupId Id целевой аудитории. (required)
     * @param id Id сегмента. (required)
     * @return ResponseEntity&lt;ResultModelOfTargetGroupSegmentViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfTargetGroupSegmentViewModel> targetGroupSegmentGetTargetGroupSegmentWithHttpInfo(Integer targetGroupId, Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'targetGroupId' is set
        if (targetGroupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'targetGroupId' when calling targetGroupSegmentGetTargetGroupSegment");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling targetGroupSegmentGetTargetGroupSegment");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("targetGroupId", targetGroupId);
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/targetGroups/{targetGroupId}/segments/{id}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfTargetGroupSegmentViewModel> returnType = new ParameterizedTypeReference<ResultModelOfTargetGroupSegmentViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получение информации о последнем расчете сегмента целевой аудитории.
     * 
     * <p><b>200</b> - OK
     * @param targetGroupId Id целевой аудитории. (required)
     * @param segmentId Id сегмента. (required)
     * @return ResultModelOfCalculationModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfCalculationModel targetGroupSegmentGetTargetGroupSegmentCalculationInfo(Integer targetGroupId, Integer segmentId) throws RestClientException {
        return targetGroupSegmentGetTargetGroupSegmentCalculationInfoWithHttpInfo(targetGroupId, segmentId).getBody();
    }

    /**
     * Получение информации о последнем расчете сегмента целевой аудитории.
     * 
     * <p><b>200</b> - OK
     * @param targetGroupId Id целевой аудитории. (required)
     * @param segmentId Id сегмента. (required)
     * @return ResponseEntity&lt;ResultModelOfCalculationModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfCalculationModel> targetGroupSegmentGetTargetGroupSegmentCalculationInfoWithHttpInfo(Integer targetGroupId, Integer segmentId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'targetGroupId' is set
        if (targetGroupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'targetGroupId' when calling targetGroupSegmentGetTargetGroupSegmentCalculationInfo");
        }
        
        // verify the required parameter 'segmentId' is set
        if (segmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'segmentId' when calling targetGroupSegmentGetTargetGroupSegmentCalculationInfo");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("targetGroupId", targetGroupId);
        uriVariables.put("segmentId", segmentId);
        String path = UriComponentsBuilder.fromPath("/api/targetGroups/{targetGroupId}/segments/{segmentId}/calculationInfo").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfCalculationModel> returnType = new ParameterizedTypeReference<ResultModelOfCalculationModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить сегменты целевой аудитории.
     * 
     * <p><b>200</b> - OK
     * @param targetGroupId Id целевой аудитории. (required)
     * @param from Начало выборки. (optional, default to 0)
     * @param count Объем выборки. (optional, default to 2147483647)
     * @return ResultModelOfPagedViewModelOfTargetGroupSegmentViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfTargetGroupSegmentViewModel targetGroupSegmentGetTargetGroupSegments(Integer targetGroupId, Integer from, Integer count) throws RestClientException {
        return targetGroupSegmentGetTargetGroupSegmentsWithHttpInfo(targetGroupId, from, count).getBody();
    }

    /**
     * Получить сегменты целевой аудитории.
     * 
     * <p><b>200</b> - OK
     * @param targetGroupId Id целевой аудитории. (required)
     * @param from Начало выборки. (optional, default to 0)
     * @param count Объем выборки. (optional, default to 2147483647)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfTargetGroupSegmentViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfTargetGroupSegmentViewModel> targetGroupSegmentGetTargetGroupSegmentsWithHttpInfo(Integer targetGroupId, Integer from, Integer count) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'targetGroupId' is set
        if (targetGroupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'targetGroupId' when calling targetGroupSegmentGetTargetGroupSegments");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("targetGroupId", targetGroupId);
        String path = UriComponentsBuilder.fromPath("/api/targetGroups/{targetGroupId}/segments").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfTargetGroupSegmentViewModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfTargetGroupSegmentViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Редактировать сегмент целевой аудитории.
     * 
     * <p><b>200</b> - OK
     * @param targetGroupId Id целевой аудитории. (required)
     * @param segmentId Id сегмента. (required)
     * @param model Модель сегмента. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel targetGroupSegmentUpdateTargetGroupSegment(Integer targetGroupId, Integer segmentId, TargetGroupSegmentModel model) throws RestClientException {
        return targetGroupSegmentUpdateTargetGroupSegmentWithHttpInfo(targetGroupId, segmentId, model).getBody();
    }

    /**
     * Редактировать сегмент целевой аудитории.
     * 
     * <p><b>200</b> - OK
     * @param targetGroupId Id целевой аудитории. (required)
     * @param segmentId Id сегмента. (required)
     * @param model Модель сегмента. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> targetGroupSegmentUpdateTargetGroupSegmentWithHttpInfo(Integer targetGroupId, Integer segmentId, TargetGroupSegmentModel model) throws RestClientException {
        Object postBody = model;
        
        // verify the required parameter 'targetGroupId' is set
        if (targetGroupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'targetGroupId' when calling targetGroupSegmentUpdateTargetGroupSegment");
        }
        
        // verify the required parameter 'segmentId' is set
        if (segmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'segmentId' when calling targetGroupSegmentUpdateTargetGroupSegment");
        }
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling targetGroupSegmentUpdateTargetGroupSegment");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("targetGroupId", targetGroupId);
        uriVariables.put("segmentId", segmentId);
        String path = UriComponentsBuilder.fromPath("/api/targetGroups/{targetGroupId}/segments/{segmentId}").buildAndExpand(uriVariables).toUriString();

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
