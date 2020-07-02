package com.example.demo.restclient.api;

import com.example.demo.restclient.ApiClient;

import com.example.demo.restclient.model.PlanViewModel;
import com.example.demo.restclient.model.ResultModel;
import com.example.demo.restclient.model.ResultModelOfListOfPlanViewModel;
import com.example.demo.restclient.model.ResultModelOfPlanViewModel;

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
@Component("com.example.demo.restclient.api.PlanApi")
public class PlanApi {
    private ApiClient apiClient;

    public PlanApi() {
        this(new ApiClient());
    }

    @Autowired
    public PlanApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Создать план.
     * 
     * <p><b>201</b> - Created
     * @param model Модель для создания плана. (required)
     * @param partnerId  (required)
     * @param year  (required)
     * @param month  (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel planCreatePlan(PlanViewModel model, String partnerId, String year, String month) throws RestClientException {
        return planCreatePlanWithHttpInfo(model, partnerId, year, month).getBody();
    }

    /**
     * Создать план.
     * 
     * <p><b>201</b> - Created
     * @param model Модель для создания плана. (required)
     * @param partnerId  (required)
     * @param year  (required)
     * @param month  (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> planCreatePlanWithHttpInfo(PlanViewModel model, String partnerId, String year, String month) throws RestClientException {
        Object postBody = model;
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling planCreatePlan");
        }
        
        // verify the required parameter 'partnerId' is set
        if (partnerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partnerId' when calling planCreatePlan");
        }
        
        // verify the required parameter 'year' is set
        if (year == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'year' when calling planCreatePlan");
        }
        
        // verify the required parameter 'month' is set
        if (month == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'month' when calling planCreatePlan");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("partnerId", partnerId);
        uriVariables.put("year", year);
        uriVariables.put("month", month);
        String path = UriComponentsBuilder.fromPath("/api/partners/{partnerId}/plans/{year}/{month}").buildAndExpand(uriVariables).toUriString();

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
     * Удалить план.
     * 
     * <p><b>200</b> - OK
     * @param partnerId Id партнера. (required)
     * @param month Номер месяца. (required)
     * @param year Год. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel planDeletePlan(Integer partnerId, Integer month, Integer year) throws RestClientException {
        return planDeletePlanWithHttpInfo(partnerId, month, year).getBody();
    }

    /**
     * Удалить план.
     * 
     * <p><b>200</b> - OK
     * @param partnerId Id партнера. (required)
     * @param month Номер месяца. (required)
     * @param year Год. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> planDeletePlanWithHttpInfo(Integer partnerId, Integer month, Integer year) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'partnerId' is set
        if (partnerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partnerId' when calling planDeletePlan");
        }
        
        // verify the required parameter 'month' is set
        if (month == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'month' when calling planDeletePlan");
        }
        
        // verify the required parameter 'year' is set
        if (year == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'year' when calling planDeletePlan");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("partnerId", partnerId);
        uriVariables.put("month", month);
        uriVariables.put("year", year);
        String path = UriComponentsBuilder.fromPath("/api/partners/{partnerId}/plans/{year}/{month}").buildAndExpand(uriVariables).toUriString();

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
     * Получить план.
     * 
     * <p><b>200</b> - OK
     * @param partnerId Id партнера. (required)
     * @param month Номер месяца. (required)
     * @param year Год. (required)
     * @return ResultModelOfPlanViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPlanViewModel planGetPlan(Integer partnerId, Integer month, Integer year) throws RestClientException {
        return planGetPlanWithHttpInfo(partnerId, month, year).getBody();
    }

    /**
     * Получить план.
     * 
     * <p><b>200</b> - OK
     * @param partnerId Id партнера. (required)
     * @param month Номер месяца. (required)
     * @param year Год. (required)
     * @return ResponseEntity&lt;ResultModelOfPlanViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPlanViewModel> planGetPlanWithHttpInfo(Integer partnerId, Integer month, Integer year) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'partnerId' is set
        if (partnerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partnerId' when calling planGetPlan");
        }
        
        // verify the required parameter 'month' is set
        if (month == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'month' when calling planGetPlan");
        }
        
        // verify the required parameter 'year' is set
        if (year == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'year' when calling planGetPlan");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("partnerId", partnerId);
        uriVariables.put("month", month);
        uriVariables.put("year", year);
        String path = UriComponentsBuilder.fromPath("/api/partners/{partnerId}/plans/{year}/{month}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfPlanViewModel> returnType = new ParameterizedTypeReference<ResultModelOfPlanViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить список планов партнера за конкретный год.
     * 
     * <p><b>200</b> - OK
     * @param partnerId Id партнера. (required)
     * @param year Год. (required)
     * @return ResultModelOfListOfPlanViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfPlanViewModel planGetPlans(Integer partnerId, Integer year) throws RestClientException {
        return planGetPlansWithHttpInfo(partnerId, year).getBody();
    }

    /**
     * Получить список планов партнера за конкретный год.
     * 
     * <p><b>200</b> - OK
     * @param partnerId Id партнера. (required)
     * @param year Год. (required)
     * @return ResponseEntity&lt;ResultModelOfListOfPlanViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfPlanViewModel> planGetPlansWithHttpInfo(Integer partnerId, Integer year) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'partnerId' is set
        if (partnerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partnerId' when calling planGetPlans");
        }
        
        // verify the required parameter 'year' is set
        if (year == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'year' when calling planGetPlans");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("partnerId", partnerId);
        uriVariables.put("year", year);
        String path = UriComponentsBuilder.fromPath("/api/partners/{partnerId}/plans/{year}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfListOfPlanViewModel> returnType = new ParameterizedTypeReference<ResultModelOfListOfPlanViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Обновить план.
     * 
     * <p><b>200</b> - OK
     * @param model Модель для изменения плана. (required)
     * @param partnerId  (required)
     * @param year  (required)
     * @param month  (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel planUpdatePlan(PlanViewModel model, String partnerId, String year, String month) throws RestClientException {
        return planUpdatePlanWithHttpInfo(model, partnerId, year, month).getBody();
    }

    /**
     * Обновить план.
     * 
     * <p><b>200</b> - OK
     * @param model Модель для изменения плана. (required)
     * @param partnerId  (required)
     * @param year  (required)
     * @param month  (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> planUpdatePlanWithHttpInfo(PlanViewModel model, String partnerId, String year, String month) throws RestClientException {
        Object postBody = model;
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling planUpdatePlan");
        }
        
        // verify the required parameter 'partnerId' is set
        if (partnerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partnerId' when calling planUpdatePlan");
        }
        
        // verify the required parameter 'year' is set
        if (year == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'year' when calling planUpdatePlan");
        }
        
        // verify the required parameter 'month' is set
        if (month == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'month' when calling planUpdatePlan");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("partnerId", partnerId);
        uriVariables.put("year", year);
        uriVariables.put("month", month);
        String path = UriComponentsBuilder.fromPath("/api/partners/{partnerId}/plans/{year}/{month}").buildAndExpand(uriVariables).toUriString();

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
