package restclient.api;

import restclient.ApiClient;

import restclient.model.ResultModel;
import restclient.model.ResultModelOfCalculationModel;
import restclient.model.ResultModelOfInt32;
import restclient.model.ResultModelOfListOfTargetGroupSegmentFilterSetViewModel;
import restclient.model.ResultModelOfTargetGroupSegmentFilterSetViewModel;

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
@Component("restclient.api.TargetGroupSegmentFilterSetApi")
public class TargetGroupSegmentFilterSetApi {
    private ApiClient apiClient;

    public TargetGroupSegmentFilterSetApi() {
        this(new ApiClient());
    }

    @Autowired
    public TargetGroupSegmentFilterSetApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Запуск расчета набора фильтров целевой аудитории.
     * 
     * <p><b>200</b> - OK
     * @param targetGroupId Id целевой аудитории. (required)
     * @param segmentId Id сегмента. (required)
     * @param filterSetId Id набора фильтров. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel targetGroupSegmentFilterSetCalculateTargetGroupSegmentFilterSet(Integer targetGroupId, Integer segmentId, Integer filterSetId) throws RestClientException {
        return targetGroupSegmentFilterSetCalculateTargetGroupSegmentFilterSetWithHttpInfo(targetGroupId, segmentId, filterSetId).getBody();
    }

    /**
     * Запуск расчета набора фильтров целевой аудитории.
     * 
     * <p><b>200</b> - OK
     * @param targetGroupId Id целевой аудитории. (required)
     * @param segmentId Id сегмента. (required)
     * @param filterSetId Id набора фильтров. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> targetGroupSegmentFilterSetCalculateTargetGroupSegmentFilterSetWithHttpInfo(Integer targetGroupId, Integer segmentId, Integer filterSetId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'targetGroupId' is set
        if (targetGroupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'targetGroupId' when calling targetGroupSegmentFilterSetCalculateTargetGroupSegmentFilterSet");
        }
        
        // verify the required parameter 'segmentId' is set
        if (segmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'segmentId' when calling targetGroupSegmentFilterSetCalculateTargetGroupSegmentFilterSet");
        }
        
        // verify the required parameter 'filterSetId' is set
        if (filterSetId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'filterSetId' when calling targetGroupSegmentFilterSetCalculateTargetGroupSegmentFilterSet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("targetGroupId", targetGroupId);
        uriVariables.put("segmentId", segmentId);
        uriVariables.put("filterSetId", filterSetId);
        String path = UriComponentsBuilder.fromPath("/api/targetGroups/{targetGroupId}/segments/{segmentId}/filterSets/{filterSetId}/calculate").buildAndExpand(uriVariables).toUriString();

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
     * Создание набора фильтров сегмента ЦА.
     * 
     * <p><b>201</b> - Created
     * @param targetGroupId Id целевой аудитории. (required)
     * @param segmentId Id сегмента целевой аудитории. (required)
     * @return ResultModelOfInt32
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfInt32 targetGroupSegmentFilterSetCreateTargetGroupSegmentFilterSet(Integer targetGroupId, Integer segmentId) throws RestClientException {
        return targetGroupSegmentFilterSetCreateTargetGroupSegmentFilterSetWithHttpInfo(targetGroupId, segmentId).getBody();
    }

    /**
     * Создание набора фильтров сегмента ЦА.
     * 
     * <p><b>201</b> - Created
     * @param targetGroupId Id целевой аудитории. (required)
     * @param segmentId Id сегмента целевой аудитории. (required)
     * @return ResponseEntity&lt;ResultModelOfInt32&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfInt32> targetGroupSegmentFilterSetCreateTargetGroupSegmentFilterSetWithHttpInfo(Integer targetGroupId, Integer segmentId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'targetGroupId' is set
        if (targetGroupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'targetGroupId' when calling targetGroupSegmentFilterSetCreateTargetGroupSegmentFilterSet");
        }
        
        // verify the required parameter 'segmentId' is set
        if (segmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'segmentId' when calling targetGroupSegmentFilterSetCreateTargetGroupSegmentFilterSet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("targetGroupId", targetGroupId);
        uriVariables.put("segmentId", segmentId);
        String path = UriComponentsBuilder.fromPath("/api/targetGroups/{targetGroupId}/segments/{segmentId}/filterSets").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfInt32> returnType = new ParameterizedTypeReference<ResultModelOfInt32>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Удаление набора фильтров сегмента ЦА.
     * 
     * <p><b>200</b> - OK
     * @param targetGroupId Id целевой аудитории. (required)
     * @param segmentId Id сегмента целевой аудитории. (required)
     * @param filterSetId Id набора фильтров. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel targetGroupSegmentFilterSetDeleteTargetGroupSegmentFilterSet(Integer targetGroupId, Integer segmentId, Integer filterSetId) throws RestClientException {
        return targetGroupSegmentFilterSetDeleteTargetGroupSegmentFilterSetWithHttpInfo(targetGroupId, segmentId, filterSetId).getBody();
    }

    /**
     * Удаление набора фильтров сегмента ЦА.
     * 
     * <p><b>200</b> - OK
     * @param targetGroupId Id целевой аудитории. (required)
     * @param segmentId Id сегмента целевой аудитории. (required)
     * @param filterSetId Id набора фильтров. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> targetGroupSegmentFilterSetDeleteTargetGroupSegmentFilterSetWithHttpInfo(Integer targetGroupId, Integer segmentId, Integer filterSetId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'targetGroupId' is set
        if (targetGroupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'targetGroupId' when calling targetGroupSegmentFilterSetDeleteTargetGroupSegmentFilterSet");
        }
        
        // verify the required parameter 'segmentId' is set
        if (segmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'segmentId' when calling targetGroupSegmentFilterSetDeleteTargetGroupSegmentFilterSet");
        }
        
        // verify the required parameter 'filterSetId' is set
        if (filterSetId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'filterSetId' when calling targetGroupSegmentFilterSetDeleteTargetGroupSegmentFilterSet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("targetGroupId", targetGroupId);
        uriVariables.put("segmentId", segmentId);
        uriVariables.put("filterSetId", filterSetId);
        String path = UriComponentsBuilder.fromPath("/api/targetGroups/{targetGroupId}/segments/{segmentId}/filterSets/{filterSetId}").buildAndExpand(uriVariables).toUriString();

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
     * Получить набор фильтров сегмента ЦА.
     * 
     * <p><b>200</b> - OK
     * @param targetGroupId Id целевой аудитории. (required)
     * @param segmentId Id сегмента. (required)
     * @param id Id набора фильтров. (required)
     * @return ResultModelOfTargetGroupSegmentFilterSetViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfTargetGroupSegmentFilterSetViewModel targetGroupSegmentFilterSetGetTargetGroupSegmentFilterSet(Integer targetGroupId, Integer segmentId, Integer id) throws RestClientException {
        return targetGroupSegmentFilterSetGetTargetGroupSegmentFilterSetWithHttpInfo(targetGroupId, segmentId, id).getBody();
    }

    /**
     * Получить набор фильтров сегмента ЦА.
     * 
     * <p><b>200</b> - OK
     * @param targetGroupId Id целевой аудитории. (required)
     * @param segmentId Id сегмента. (required)
     * @param id Id набора фильтров. (required)
     * @return ResponseEntity&lt;ResultModelOfTargetGroupSegmentFilterSetViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfTargetGroupSegmentFilterSetViewModel> targetGroupSegmentFilterSetGetTargetGroupSegmentFilterSetWithHttpInfo(Integer targetGroupId, Integer segmentId, Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'targetGroupId' is set
        if (targetGroupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'targetGroupId' when calling targetGroupSegmentFilterSetGetTargetGroupSegmentFilterSet");
        }
        
        // verify the required parameter 'segmentId' is set
        if (segmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'segmentId' when calling targetGroupSegmentFilterSetGetTargetGroupSegmentFilterSet");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling targetGroupSegmentFilterSetGetTargetGroupSegmentFilterSet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("targetGroupId", targetGroupId);
        uriVariables.put("segmentId", segmentId);
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/targetGroups/{targetGroupId}/segments/{segmentId}/filterSets/{id}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfTargetGroupSegmentFilterSetViewModel> returnType = new ParameterizedTypeReference<ResultModelOfTargetGroupSegmentFilterSetViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получение информации о последнем расчете набора фильтров целевой аудитории.
     * 
     * <p><b>200</b> - OK
     * @param targetGroupId Id целевой аудитории. (required)
     * @param segmentId Id сегмента. (required)
     * @param filterSetId Id набора фильтров. (required)
     * @return ResultModelOfCalculationModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfCalculationModel targetGroupSegmentFilterSetGetTargetGroupSegmentFilterSetCalculationInfo(Integer targetGroupId, Integer segmentId, Integer filterSetId) throws RestClientException {
        return targetGroupSegmentFilterSetGetTargetGroupSegmentFilterSetCalculationInfoWithHttpInfo(targetGroupId, segmentId, filterSetId).getBody();
    }

    /**
     * Получение информации о последнем расчете набора фильтров целевой аудитории.
     * 
     * <p><b>200</b> - OK
     * @param targetGroupId Id целевой аудитории. (required)
     * @param segmentId Id сегмента. (required)
     * @param filterSetId Id набора фильтров. (required)
     * @return ResponseEntity&lt;ResultModelOfCalculationModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfCalculationModel> targetGroupSegmentFilterSetGetTargetGroupSegmentFilterSetCalculationInfoWithHttpInfo(Integer targetGroupId, Integer segmentId, Integer filterSetId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'targetGroupId' is set
        if (targetGroupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'targetGroupId' when calling targetGroupSegmentFilterSetGetTargetGroupSegmentFilterSetCalculationInfo");
        }
        
        // verify the required parameter 'segmentId' is set
        if (segmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'segmentId' when calling targetGroupSegmentFilterSetGetTargetGroupSegmentFilterSetCalculationInfo");
        }
        
        // verify the required parameter 'filterSetId' is set
        if (filterSetId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'filterSetId' when calling targetGroupSegmentFilterSetGetTargetGroupSegmentFilterSetCalculationInfo");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("targetGroupId", targetGroupId);
        uriVariables.put("segmentId", segmentId);
        uriVariables.put("filterSetId", filterSetId);
        String path = UriComponentsBuilder.fromPath("/api/targetGroups/{targetGroupId}/segments/{segmentId}/filterSets/{filterSetId}/calculationInfo").buildAndExpand(uriVariables).toUriString();

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
     * Получить наборы фильтров сегмента ЦА.
     * 
     * <p><b>200</b> - OK
     * @param targetGroupId Id целевой аудитории. (required)
     * @param segmentId Id сегмента. (required)
     * @return ResultModelOfListOfTargetGroupSegmentFilterSetViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfTargetGroupSegmentFilterSetViewModel targetGroupSegmentFilterSetGetTargetGroupSegmentFilterSets(Integer targetGroupId, Integer segmentId) throws RestClientException {
        return targetGroupSegmentFilterSetGetTargetGroupSegmentFilterSetsWithHttpInfo(targetGroupId, segmentId).getBody();
    }

    /**
     * Получить наборы фильтров сегмента ЦА.
     * 
     * <p><b>200</b> - OK
     * @param targetGroupId Id целевой аудитории. (required)
     * @param segmentId Id сегмента. (required)
     * @return ResponseEntity&lt;ResultModelOfListOfTargetGroupSegmentFilterSetViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfTargetGroupSegmentFilterSetViewModel> targetGroupSegmentFilterSetGetTargetGroupSegmentFilterSetsWithHttpInfo(Integer targetGroupId, Integer segmentId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'targetGroupId' is set
        if (targetGroupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'targetGroupId' when calling targetGroupSegmentFilterSetGetTargetGroupSegmentFilterSets");
        }
        
        // verify the required parameter 'segmentId' is set
        if (segmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'segmentId' when calling targetGroupSegmentFilterSetGetTargetGroupSegmentFilterSets");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("targetGroupId", targetGroupId);
        uriVariables.put("segmentId", segmentId);
        String path = UriComponentsBuilder.fromPath("/api/targetGroups/{targetGroupId}/segments/{segmentId}/filterSets").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfListOfTargetGroupSegmentFilterSetViewModel> returnType = new ParameterizedTypeReference<ResultModelOfListOfTargetGroupSegmentFilterSetViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
