package com.example.demo.restclient.api;

import com.example.demo.restclient.ApiClient;

import com.example.demo.restclient.model.CityDataModel;
import com.example.demo.restclient.model.LocationDataModel;
import com.example.demo.restclient.model.ResultModel;
import com.example.demo.restclient.model.ResultModelOfInt32;
import com.example.demo.restclient.model.ResultModelOfLocationDataModel;
import com.example.demo.restclient.model.ResultModelOfPagedViewModelOfCityDataModel;

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
@Component("com.example.demo.restclient.api.LocationEditApi")
public class LocationEditApi {
    private ApiClient apiClient;

    public LocationEditApi() {
        this(new ApiClient());
    }

    @Autowired
    public LocationEditApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Добавить новый город.
     * 
     * <p><b>201</b> - Created
     * @param model ViewModel города. (required)
     * @return ResultModelOfInt32
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfInt32 locationEditAdd(CityDataModel model) throws RestClientException {
        return locationEditAddWithHttpInfo(model).getBody();
    }

    /**
     * Добавить новый город.
     * 
     * <p><b>201</b> - Created
     * @param model ViewModel города. (required)
     * @return ResponseEntity&lt;ResultModelOfInt32&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfInt32> locationEditAddWithHttpInfo(CityDataModel model) throws RestClientException {
        Object postBody = model;
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling locationEditAdd");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/locations/Cities").build().toUriString();

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
     * Добавить новую Location.
     * 
     * <p><b>201</b> - Created
     * @param model ViewModel. (required)
     * @return ResultModelOfInt32
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfInt32 locationEditCreate(LocationDataModel model) throws RestClientException {
        return locationEditCreateWithHttpInfo(model).getBody();
    }

    /**
     * Добавить новую Location.
     * 
     * <p><b>201</b> - Created
     * @param model ViewModel. (required)
     * @return ResponseEntity&lt;ResultModelOfInt32&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfInt32> locationEditCreateWithHttpInfo(LocationDataModel model) throws RestClientException {
        Object postBody = model;
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling locationEditCreate");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/locations").build().toUriString();

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
     * Редактирование Location.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор. (required)
     * @param model ViewModel. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel locationEditEdit(Integer id, LocationDataModel model) throws RestClientException {
        return locationEditEditWithHttpInfo(id, model).getBody();
    }

    /**
     * Редактирование Location.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор. (required)
     * @param model ViewModel. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> locationEditEditWithHttpInfo(Integer id, LocationDataModel model) throws RestClientException {
        Object postBody = model;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling locationEditEdit");
        }
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling locationEditEdit");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/locations/{id}").buildAndExpand(uriVariables).toUriString();

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
     * Получить Location по идентификатору.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор. (required)
     * @return ResultModelOfLocationDataModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfLocationDataModel locationEditGet(Integer id) throws RestClientException {
        return locationEditGetWithHttpInfo(id).getBody();
    }

    /**
     * Получить Location по идентификатору.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор. (required)
     * @return ResponseEntity&lt;ResultModelOfLocationDataModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfLocationDataModel> locationEditGetWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling locationEditGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/locations/{id}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfLocationDataModel> returnType = new ParameterizedTypeReference<ResultModelOfLocationDataModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить список городов.
     * 
     * <p><b>200</b> - OK
     * @param startSubstr Стартовая подстрока. (optional, default to )
     * @param from С какого эл-та. (optional, default to 0)
     * @param count Количество. (optional, default to 10)
     * @return ResultModelOfPagedViewModelOfCityDataModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfCityDataModel locationEditGetCities(String startSubstr, Integer from, Integer count) throws RestClientException {
        return locationEditGetCitiesWithHttpInfo(startSubstr, from, count).getBody();
    }

    /**
     * Получить список городов.
     * 
     * <p><b>200</b> - OK
     * @param startSubstr Стартовая подстрока. (optional, default to )
     * @param from С какого эл-та. (optional, default to 0)
     * @param count Количество. (optional, default to 10)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfCityDataModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfCityDataModel> locationEditGetCitiesWithHttpInfo(String startSubstr, Integer from, Integer count) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/locations/Cities").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "startSubstr", startSubstr));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfCityDataModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfCityDataModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
