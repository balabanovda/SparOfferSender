package restclient.api;

import restclient.ApiClient;

import restclient.model.ResultModel;
import restclient.model.ResultModelOfCalculationModel;
import restclient.model.ResultModelOfFilterViewModel;
import restclient.model.ResultModelOfInt32;
import restclient.model.ResultModelOfListOfTargetGroupSegmentFilterViewModel;
import restclient.model.ResultModelOfTargetGroupSegmentFilterViewModel;
import restclient.model.TargetGroupSegmentFilterModel;
import restclient.model.TargetGroupSegmentFilterNameModel;
import restclient.model.TargetGroupSegmentFilterTypeModel;

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
@Component("restclient.api.TargetGroupSegmentFilterApi")
public class TargetGroupSegmentFilterApi {
    private ApiClient apiClient;

    public TargetGroupSegmentFilterApi() {
        this(new ApiClient());
    }

    @Autowired
    public TargetGroupSegmentFilterApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Запуск расчета фильтра целевой аудитории.
     * 
     * <p><b>200</b> - OK
     * @param targetGroupId Id целевой аудитории. (required)
     * @param segmentId Id сегмента. (required)
     * @param filterSetId Id набора фильтров. (required)
     * @param filterId Id фильтра. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel targetGroupSegmentFilterCalculateTargetGroupSegmentFilter(Integer targetGroupId, Integer segmentId, Integer filterSetId, Integer filterId) throws RestClientException {
        return targetGroupSegmentFilterCalculateTargetGroupSegmentFilterWithHttpInfo(targetGroupId, segmentId, filterSetId, filterId).getBody();
    }

    /**
     * Запуск расчета фильтра целевой аудитории.
     * 
     * <p><b>200</b> - OK
     * @param targetGroupId Id целевой аудитории. (required)
     * @param segmentId Id сегмента. (required)
     * @param filterSetId Id набора фильтров. (required)
     * @param filterId Id фильтра. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> targetGroupSegmentFilterCalculateTargetGroupSegmentFilterWithHttpInfo(Integer targetGroupId, Integer segmentId, Integer filterSetId, Integer filterId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'targetGroupId' is set
        if (targetGroupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'targetGroupId' when calling targetGroupSegmentFilterCalculateTargetGroupSegmentFilter");
        }
        
        // verify the required parameter 'segmentId' is set
        if (segmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'segmentId' when calling targetGroupSegmentFilterCalculateTargetGroupSegmentFilter");
        }
        
        // verify the required parameter 'filterSetId' is set
        if (filterSetId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'filterSetId' when calling targetGroupSegmentFilterCalculateTargetGroupSegmentFilter");
        }
        
        // verify the required parameter 'filterId' is set
        if (filterId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'filterId' when calling targetGroupSegmentFilterCalculateTargetGroupSegmentFilter");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("targetGroupId", targetGroupId);
        uriVariables.put("segmentId", segmentId);
        uriVariables.put("filterSetId", filterSetId);
        uriVariables.put("filterId", filterId);
        String path = UriComponentsBuilder.fromPath("/api/targetGroups/{targetGroupId}/segments/{segmentId}/filterSets/{filterSetId}/filters/{filterId}/calculate").buildAndExpand(uriVariables).toUriString();

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
     * Создание фильтра целевой аудитории.
     * 
     * <p><b>201</b> - Created
     * @param targetGroupId Id целевой аудитории. (required)
     * @param segmentId Id сегмента целевой аудитории. (required)
     * @param filterSetId Id набора фильтров. (required)
     * @param model Модель фильтра целевой аудитории. (required)
     * @return ResultModelOfInt32
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfInt32 targetGroupSegmentFilterCreateTargetGroupSegmentFilter(Integer targetGroupId, Integer segmentId, Integer filterSetId, TargetGroupSegmentFilterModel model) throws RestClientException {
        return targetGroupSegmentFilterCreateTargetGroupSegmentFilterWithHttpInfo(targetGroupId, segmentId, filterSetId, model).getBody();
    }

    /**
     * Создание фильтра целевой аудитории.
     * 
     * <p><b>201</b> - Created
     * @param targetGroupId Id целевой аудитории. (required)
     * @param segmentId Id сегмента целевой аудитории. (required)
     * @param filterSetId Id набора фильтров. (required)
     * @param model Модель фильтра целевой аудитории. (required)
     * @return ResponseEntity&lt;ResultModelOfInt32&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfInt32> targetGroupSegmentFilterCreateTargetGroupSegmentFilterWithHttpInfo(Integer targetGroupId, Integer segmentId, Integer filterSetId, TargetGroupSegmentFilterModel model) throws RestClientException {
        Object postBody = model;
        
        // verify the required parameter 'targetGroupId' is set
        if (targetGroupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'targetGroupId' when calling targetGroupSegmentFilterCreateTargetGroupSegmentFilter");
        }
        
        // verify the required parameter 'segmentId' is set
        if (segmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'segmentId' when calling targetGroupSegmentFilterCreateTargetGroupSegmentFilter");
        }
        
        // verify the required parameter 'filterSetId' is set
        if (filterSetId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'filterSetId' when calling targetGroupSegmentFilterCreateTargetGroupSegmentFilter");
        }
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling targetGroupSegmentFilterCreateTargetGroupSegmentFilter");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("targetGroupId", targetGroupId);
        uriVariables.put("segmentId", segmentId);
        uriVariables.put("filterSetId", filterSetId);
        String path = UriComponentsBuilder.fromPath("/api/targetGroups/{targetGroupId}/segments/{segmentId}/filterSets/{filterSetId}/filters").buildAndExpand(uriVariables).toUriString();

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
     * Удаление фильтра целевой аудитории.
     * 
     * <p><b>200</b> - OK
     * @param targetGroupId Id целевой аудитории. (required)
     * @param segmentId Id сегмента. (required)
     * @param filterSetId Id набора фильтров. (required)
     * @param filterId Id фильтра целевой аудитории. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel targetGroupSegmentFilterDeleteTargetGroupSegmentFilter(Integer targetGroupId, Integer segmentId, Integer filterSetId, Integer filterId) throws RestClientException {
        return targetGroupSegmentFilterDeleteTargetGroupSegmentFilterWithHttpInfo(targetGroupId, segmentId, filterSetId, filterId).getBody();
    }

    /**
     * Удаление фильтра целевой аудитории.
     * 
     * <p><b>200</b> - OK
     * @param targetGroupId Id целевой аудитории. (required)
     * @param segmentId Id сегмента. (required)
     * @param filterSetId Id набора фильтров. (required)
     * @param filterId Id фильтра целевой аудитории. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> targetGroupSegmentFilterDeleteTargetGroupSegmentFilterWithHttpInfo(Integer targetGroupId, Integer segmentId, Integer filterSetId, Integer filterId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'targetGroupId' is set
        if (targetGroupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'targetGroupId' when calling targetGroupSegmentFilterDeleteTargetGroupSegmentFilter");
        }
        
        // verify the required parameter 'segmentId' is set
        if (segmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'segmentId' when calling targetGroupSegmentFilterDeleteTargetGroupSegmentFilter");
        }
        
        // verify the required parameter 'filterSetId' is set
        if (filterSetId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'filterSetId' when calling targetGroupSegmentFilterDeleteTargetGroupSegmentFilter");
        }
        
        // verify the required parameter 'filterId' is set
        if (filterId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'filterId' when calling targetGroupSegmentFilterDeleteTargetGroupSegmentFilter");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("targetGroupId", targetGroupId);
        uriVariables.put("segmentId", segmentId);
        uriVariables.put("filterSetId", filterSetId);
        uriVariables.put("filterId", filterId);
        String path = UriComponentsBuilder.fromPath("/api/targetGroups/{targetGroupId}/segments/{segmentId}/filterSets/{filterSetId}/filters/{filterId}").buildAndExpand(uriVariables).toUriString();

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
     * Получить фильтр набора фильтров сегмента ЦА.
     * 
     * <p><b>200</b> - OK
     * @param targetGroupId Id целевой аудитории. (required)
     * @param segmentId Id сегмента. (required)
     * @param filterSetId Id набора фильтров. (required)
     * @param filterId Id фильтра. (required)
     * @return ResultModelOfTargetGroupSegmentFilterViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfTargetGroupSegmentFilterViewModel targetGroupSegmentFilterGetTargetGroupSegmentFilter(Integer targetGroupId, Integer segmentId, Integer filterSetId, Integer filterId) throws RestClientException {
        return targetGroupSegmentFilterGetTargetGroupSegmentFilterWithHttpInfo(targetGroupId, segmentId, filterSetId, filterId).getBody();
    }

    /**
     * Получить фильтр набора фильтров сегмента ЦА.
     * 
     * <p><b>200</b> - OK
     * @param targetGroupId Id целевой аудитории. (required)
     * @param segmentId Id сегмента. (required)
     * @param filterSetId Id набора фильтров. (required)
     * @param filterId Id фильтра. (required)
     * @return ResponseEntity&lt;ResultModelOfTargetGroupSegmentFilterViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfTargetGroupSegmentFilterViewModel> targetGroupSegmentFilterGetTargetGroupSegmentFilterWithHttpInfo(Integer targetGroupId, Integer segmentId, Integer filterSetId, Integer filterId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'targetGroupId' is set
        if (targetGroupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'targetGroupId' when calling targetGroupSegmentFilterGetTargetGroupSegmentFilter");
        }
        
        // verify the required parameter 'segmentId' is set
        if (segmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'segmentId' when calling targetGroupSegmentFilterGetTargetGroupSegmentFilter");
        }
        
        // verify the required parameter 'filterSetId' is set
        if (filterSetId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'filterSetId' when calling targetGroupSegmentFilterGetTargetGroupSegmentFilter");
        }
        
        // verify the required parameter 'filterId' is set
        if (filterId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'filterId' when calling targetGroupSegmentFilterGetTargetGroupSegmentFilter");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("targetGroupId", targetGroupId);
        uriVariables.put("segmentId", segmentId);
        uriVariables.put("filterSetId", filterSetId);
        uriVariables.put("filterId", filterId);
        String path = UriComponentsBuilder.fromPath("/api/targetGroups/{targetGroupId}/segments/{segmentId}/filterSets/{filterSetId}/filters/{filterId}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfTargetGroupSegmentFilterViewModel> returnType = new ParameterizedTypeReference<ResultModelOfTargetGroupSegmentFilterViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получение информации о последнем расчете фильтра целевой аудитории.
     * 
     * <p><b>200</b> - OK
     * @param targetGroupId Id целевой аудитории. (required)
     * @param segmentId Id сегмента. (required)
     * @param filterSetId Id набора фильтров. (required)
     * @param filterId Id фильтра. (required)
     * @return ResultModelOfCalculationModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfCalculationModel targetGroupSegmentFilterGetTargetGroupSegmentFilterCalculationInfo(Integer targetGroupId, Integer segmentId, Integer filterSetId, Integer filterId) throws RestClientException {
        return targetGroupSegmentFilterGetTargetGroupSegmentFilterCalculationInfoWithHttpInfo(targetGroupId, segmentId, filterSetId, filterId).getBody();
    }

    /**
     * Получение информации о последнем расчете фильтра целевой аудитории.
     * 
     * <p><b>200</b> - OK
     * @param targetGroupId Id целевой аудитории. (required)
     * @param segmentId Id сегмента. (required)
     * @param filterSetId Id набора фильтров. (required)
     * @param filterId Id фильтра. (required)
     * @return ResponseEntity&lt;ResultModelOfCalculationModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfCalculationModel> targetGroupSegmentFilterGetTargetGroupSegmentFilterCalculationInfoWithHttpInfo(Integer targetGroupId, Integer segmentId, Integer filterSetId, Integer filterId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'targetGroupId' is set
        if (targetGroupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'targetGroupId' when calling targetGroupSegmentFilterGetTargetGroupSegmentFilterCalculationInfo");
        }
        
        // verify the required parameter 'segmentId' is set
        if (segmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'segmentId' when calling targetGroupSegmentFilterGetTargetGroupSegmentFilterCalculationInfo");
        }
        
        // verify the required parameter 'filterSetId' is set
        if (filterSetId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'filterSetId' when calling targetGroupSegmentFilterGetTargetGroupSegmentFilterCalculationInfo");
        }
        
        // verify the required parameter 'filterId' is set
        if (filterId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'filterId' when calling targetGroupSegmentFilterGetTargetGroupSegmentFilterCalculationInfo");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("targetGroupId", targetGroupId);
        uriVariables.put("segmentId", segmentId);
        uriVariables.put("filterSetId", filterSetId);
        uriVariables.put("filterId", filterId);
        String path = UriComponentsBuilder.fromPath("/api/targetGroups/{targetGroupId}/segments/{segmentId}/filterSets/{filterSetId}/filters/{filterId}/calculationInfo").buildAndExpand(uriVariables).toUriString();

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
     * Получить информацию о фильтре набора фильтров сегмента ЦА.
     * 
     * <p><b>200</b> - OK
     * @param targetGroupId Id целевой аудитории. (required)
     * @param segmentId Id сегмента. (required)
     * @param filterSetId Id набора фильтров. (required)
     * @param filterId Id фильтра. (required)
     * @return ResultModelOfFilterViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfFilterViewModel targetGroupSegmentFilterGetTargetGroupSegmentFilterInfo(Integer targetGroupId, Integer segmentId, Integer filterSetId, Integer filterId) throws RestClientException {
        return targetGroupSegmentFilterGetTargetGroupSegmentFilterInfoWithHttpInfo(targetGroupId, segmentId, filterSetId, filterId).getBody();
    }

    /**
     * Получить информацию о фильтре набора фильтров сегмента ЦА.
     * 
     * <p><b>200</b> - OK
     * @param targetGroupId Id целевой аудитории. (required)
     * @param segmentId Id сегмента. (required)
     * @param filterSetId Id набора фильтров. (required)
     * @param filterId Id фильтра. (required)
     * @return ResponseEntity&lt;ResultModelOfFilterViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfFilterViewModel> targetGroupSegmentFilterGetTargetGroupSegmentFilterInfoWithHttpInfo(Integer targetGroupId, Integer segmentId, Integer filterSetId, Integer filterId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'targetGroupId' is set
        if (targetGroupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'targetGroupId' when calling targetGroupSegmentFilterGetTargetGroupSegmentFilterInfo");
        }
        
        // verify the required parameter 'segmentId' is set
        if (segmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'segmentId' when calling targetGroupSegmentFilterGetTargetGroupSegmentFilterInfo");
        }
        
        // verify the required parameter 'filterSetId' is set
        if (filterSetId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'filterSetId' when calling targetGroupSegmentFilterGetTargetGroupSegmentFilterInfo");
        }
        
        // verify the required parameter 'filterId' is set
        if (filterId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'filterId' when calling targetGroupSegmentFilterGetTargetGroupSegmentFilterInfo");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("targetGroupId", targetGroupId);
        uriVariables.put("segmentId", segmentId);
        uriVariables.put("filterSetId", filterSetId);
        uriVariables.put("filterId", filterId);
        String path = UriComponentsBuilder.fromPath("/api/targetGroups/{targetGroupId}/segments/{segmentId}/filterSets/{filterSetId}/filters/{filterId}/filterInfo").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfFilterViewModel> returnType = new ParameterizedTypeReference<ResultModelOfFilterViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить фильтры набора фильтров сегмента ЦА.
     * 
     * <p><b>200</b> - OK
     * @param targetGroupId Id целевой аудитории. (required)
     * @param segmentId Id сегмента. (required)
     * @param filterSetId The filter Set Id. (required)
     * @return ResultModelOfListOfTargetGroupSegmentFilterViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfTargetGroupSegmentFilterViewModel targetGroupSegmentFilterGetTargetGroupSegmentFilters(Integer targetGroupId, Integer segmentId, Integer filterSetId) throws RestClientException {
        return targetGroupSegmentFilterGetTargetGroupSegmentFiltersWithHttpInfo(targetGroupId, segmentId, filterSetId).getBody();
    }

    /**
     * Получить фильтры набора фильтров сегмента ЦА.
     * 
     * <p><b>200</b> - OK
     * @param targetGroupId Id целевой аудитории. (required)
     * @param segmentId Id сегмента. (required)
     * @param filterSetId The filter Set Id. (required)
     * @return ResponseEntity&lt;ResultModelOfListOfTargetGroupSegmentFilterViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfTargetGroupSegmentFilterViewModel> targetGroupSegmentFilterGetTargetGroupSegmentFiltersWithHttpInfo(Integer targetGroupId, Integer segmentId, Integer filterSetId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'targetGroupId' is set
        if (targetGroupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'targetGroupId' when calling targetGroupSegmentFilterGetTargetGroupSegmentFilters");
        }
        
        // verify the required parameter 'segmentId' is set
        if (segmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'segmentId' when calling targetGroupSegmentFilterGetTargetGroupSegmentFilters");
        }
        
        // verify the required parameter 'filterSetId' is set
        if (filterSetId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'filterSetId' when calling targetGroupSegmentFilterGetTargetGroupSegmentFilters");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("targetGroupId", targetGroupId);
        uriVariables.put("segmentId", segmentId);
        uriVariables.put("filterSetId", filterSetId);
        String path = UriComponentsBuilder.fromPath("/api/targetGroups/{targetGroupId}/segments/{segmentId}/filterSets/{filterSetId}/filters").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfListOfTargetGroupSegmentFilterViewModel> returnType = new ParameterizedTypeReference<ResultModelOfListOfTargetGroupSegmentFilterViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Редактирование информации о фильтре целевой аудитории.
     * 
     * <p><b>200</b> - OK
     * @param targetGroupId Id целевой аудитории. (required)
     * @param segmentId Id сегмента. (required)
     * @param filterSetId Id набора фильтров. (required)
     * @param filterId Id фильтра. (required)
     * @param model Модель фильтра целевой аудитории. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel targetGroupSegmentFilterUpdateTargetGroupSegmentFilter(Integer targetGroupId, Integer segmentId, Integer filterSetId, Integer filterId, TargetGroupSegmentFilterModel model) throws RestClientException {
        return targetGroupSegmentFilterUpdateTargetGroupSegmentFilterWithHttpInfo(targetGroupId, segmentId, filterSetId, filterId, model).getBody();
    }

    /**
     * Редактирование информации о фильтре целевой аудитории.
     * 
     * <p><b>200</b> - OK
     * @param targetGroupId Id целевой аудитории. (required)
     * @param segmentId Id сегмента. (required)
     * @param filterSetId Id набора фильтров. (required)
     * @param filterId Id фильтра. (required)
     * @param model Модель фильтра целевой аудитории. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> targetGroupSegmentFilterUpdateTargetGroupSegmentFilterWithHttpInfo(Integer targetGroupId, Integer segmentId, Integer filterSetId, Integer filterId, TargetGroupSegmentFilterModel model) throws RestClientException {
        Object postBody = model;
        
        // verify the required parameter 'targetGroupId' is set
        if (targetGroupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'targetGroupId' when calling targetGroupSegmentFilterUpdateTargetGroupSegmentFilter");
        }
        
        // verify the required parameter 'segmentId' is set
        if (segmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'segmentId' when calling targetGroupSegmentFilterUpdateTargetGroupSegmentFilter");
        }
        
        // verify the required parameter 'filterSetId' is set
        if (filterSetId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'filterSetId' when calling targetGroupSegmentFilterUpdateTargetGroupSegmentFilter");
        }
        
        // verify the required parameter 'filterId' is set
        if (filterId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'filterId' when calling targetGroupSegmentFilterUpdateTargetGroupSegmentFilter");
        }
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling targetGroupSegmentFilterUpdateTargetGroupSegmentFilter");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("targetGroupId", targetGroupId);
        uriVariables.put("segmentId", segmentId);
        uriVariables.put("filterSetId", filterSetId);
        uriVariables.put("filterId", filterId);
        String path = UriComponentsBuilder.fromPath("/api/targetGroups/{targetGroupId}/segments/{segmentId}/filterSets/{filterSetId}/filters/{filterId}").buildAndExpand(uriVariables).toUriString();

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
     * Редактирование названия фильтра целевой аудитории.
     * 
     * <p><b>200</b> - OK
     * @param targetGroupId Id целевой аудитории. (required)
     * @param segmentId Id сегмента. (required)
     * @param filterSetId Id набора фильтров. (required)
     * @param filterId Id фильтра. (required)
     * @param model Модель названия фильтра. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel targetGroupSegmentFilterUpdateTargetGroupSegmentFilterName(Integer targetGroupId, Integer segmentId, Integer filterSetId, Integer filterId, TargetGroupSegmentFilterNameModel model) throws RestClientException {
        return targetGroupSegmentFilterUpdateTargetGroupSegmentFilterNameWithHttpInfo(targetGroupId, segmentId, filterSetId, filterId, model).getBody();
    }

    /**
     * Редактирование названия фильтра целевой аудитории.
     * 
     * <p><b>200</b> - OK
     * @param targetGroupId Id целевой аудитории. (required)
     * @param segmentId Id сегмента. (required)
     * @param filterSetId Id набора фильтров. (required)
     * @param filterId Id фильтра. (required)
     * @param model Модель названия фильтра. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> targetGroupSegmentFilterUpdateTargetGroupSegmentFilterNameWithHttpInfo(Integer targetGroupId, Integer segmentId, Integer filterSetId, Integer filterId, TargetGroupSegmentFilterNameModel model) throws RestClientException {
        Object postBody = model;
        
        // verify the required parameter 'targetGroupId' is set
        if (targetGroupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'targetGroupId' when calling targetGroupSegmentFilterUpdateTargetGroupSegmentFilterName");
        }
        
        // verify the required parameter 'segmentId' is set
        if (segmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'segmentId' when calling targetGroupSegmentFilterUpdateTargetGroupSegmentFilterName");
        }
        
        // verify the required parameter 'filterSetId' is set
        if (filterSetId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'filterSetId' when calling targetGroupSegmentFilterUpdateTargetGroupSegmentFilterName");
        }
        
        // verify the required parameter 'filterId' is set
        if (filterId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'filterId' when calling targetGroupSegmentFilterUpdateTargetGroupSegmentFilterName");
        }
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling targetGroupSegmentFilterUpdateTargetGroupSegmentFilterName");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("targetGroupId", targetGroupId);
        uriVariables.put("segmentId", segmentId);
        uriVariables.put("filterSetId", filterSetId);
        uriVariables.put("filterId", filterId);
        String path = UriComponentsBuilder.fromPath("/api/targetGroups/{targetGroupId}/segments/{segmentId}/filterSets/{filterSetId}/filters/{filterId}/name").buildAndExpand(uriVariables).toUriString();

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
     * Редактирование типа фильтра целевой аудитории.
     * 
     * <p><b>200</b> - OK
     * @param targetGroupId Id целевой аудитории. (required)
     * @param segmentId Id сегмента. (required)
     * @param filterSetId Id набора фильтров. (required)
     * @param filterId Id фильтра. (required)
     * @param model Модель типа фильтра. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel targetGroupSegmentFilterUpdateTargetGroupSegmentFilterType(Integer targetGroupId, Integer segmentId, Integer filterSetId, Integer filterId, TargetGroupSegmentFilterTypeModel model) throws RestClientException {
        return targetGroupSegmentFilterUpdateTargetGroupSegmentFilterTypeWithHttpInfo(targetGroupId, segmentId, filterSetId, filterId, model).getBody();
    }

    /**
     * Редактирование типа фильтра целевой аудитории.
     * 
     * <p><b>200</b> - OK
     * @param targetGroupId Id целевой аудитории. (required)
     * @param segmentId Id сегмента. (required)
     * @param filterSetId Id набора фильтров. (required)
     * @param filterId Id фильтра. (required)
     * @param model Модель типа фильтра. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> targetGroupSegmentFilterUpdateTargetGroupSegmentFilterTypeWithHttpInfo(Integer targetGroupId, Integer segmentId, Integer filterSetId, Integer filterId, TargetGroupSegmentFilterTypeModel model) throws RestClientException {
        Object postBody = model;
        
        // verify the required parameter 'targetGroupId' is set
        if (targetGroupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'targetGroupId' when calling targetGroupSegmentFilterUpdateTargetGroupSegmentFilterType");
        }
        
        // verify the required parameter 'segmentId' is set
        if (segmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'segmentId' when calling targetGroupSegmentFilterUpdateTargetGroupSegmentFilterType");
        }
        
        // verify the required parameter 'filterSetId' is set
        if (filterSetId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'filterSetId' when calling targetGroupSegmentFilterUpdateTargetGroupSegmentFilterType");
        }
        
        // verify the required parameter 'filterId' is set
        if (filterId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'filterId' when calling targetGroupSegmentFilterUpdateTargetGroupSegmentFilterType");
        }
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling targetGroupSegmentFilterUpdateTargetGroupSegmentFilterType");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("targetGroupId", targetGroupId);
        uriVariables.put("segmentId", segmentId);
        uriVariables.put("filterSetId", filterSetId);
        uriVariables.put("filterId", filterId);
        String path = UriComponentsBuilder.fromPath("/api/targetGroups/{targetGroupId}/segments/{segmentId}/filterSets/{filterSetId}/filters/{filterId}/type").buildAndExpand(uriVariables).toUriString();

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
