package com.example.demo.restclient.api;

import com.example.demo.restclient.ApiClient;

import com.example.demo.restclient.model.BrandViewModel;
import com.example.demo.restclient.model.ResultModel;
import com.example.demo.restclient.model.ResultModelOfBrandViewModel;
import com.example.demo.restclient.model.ResultModelOfInt32;
import com.example.demo.restclient.model.ResultModelOfPagedViewModelOfBrandViewModel;

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
@Component("com.example.demo.restclient.api.BrandsApi")
public class BrandsApi {
    private ApiClient apiClient;

    public BrandsApi() {
        this(new ApiClient());
    }

    @Autowired
    public BrandsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Создает бренд.
     * 
     * <p><b>201</b> - Created
     * @param brandModel Модель бренда. (required)
     * @return ResultModelOfInt32
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfInt32 brandsCreateBrand(BrandViewModel brandModel) throws RestClientException {
        return brandsCreateBrandWithHttpInfo(brandModel).getBody();
    }

    /**
     * Создает бренд.
     * 
     * <p><b>201</b> - Created
     * @param brandModel Модель бренда. (required)
     * @return ResponseEntity&lt;ResultModelOfInt32&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfInt32> brandsCreateBrandWithHttpInfo(BrandViewModel brandModel) throws RestClientException {
        Object postBody = brandModel;
        
        // verify the required parameter 'brandModel' is set
        if (brandModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'brandModel' when calling brandsCreateBrand");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/brands").build().toUriString();

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
     * Удаляет бренд.
     * 
     * <p><b>200</b> - OK
     * @param id Id бренда. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel brandsDeleteBrand(Integer id) throws RestClientException {
        return brandsDeleteBrandWithHttpInfo(id).getBody();
    }

    /**
     * Удаляет бренд.
     * 
     * <p><b>200</b> - OK
     * @param id Id бренда. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> brandsDeleteBrandWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling brandsDeleteBrand");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/brands/{id}").buildAndExpand(uriVariables).toUriString();

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
     * Получение описания бренда.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор бренда. (required)
     * @return ResultModelOfBrandViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfBrandViewModel brandsGetBrandInfo(Integer id) throws RestClientException {
        return brandsGetBrandInfoWithHttpInfo(id).getBody();
    }

    /**
     * Получение описания бренда.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор бренда. (required)
     * @return ResponseEntity&lt;ResultModelOfBrandViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfBrandViewModel> brandsGetBrandInfoWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling brandsGetBrandInfo");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/brands/{id}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfBrandViewModel> returnType = new ParameterizedTypeReference<ResultModelOfBrandViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Возвращает список всех брендов.
     * 
     * <p><b>200</b> - OK
     * @param filterState Определяет, возвращать ли объекты с состоянием hidden. (optional)
     * @param filterFrom Начало выборки. (optional)
     * @param filterCount Количество. (optional)
     * @param filterSubstring Подстрока для поиска. (optional)
     * @param filterSortingIds Идентификаторы брендов, которые будут выбираться первыми. (optional)
     * @return ResultModelOfPagedViewModelOfBrandViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfBrandViewModel brandsGetBrands(String filterState, Integer filterFrom, Integer filterCount, String filterSubstring, List<Integer> filterSortingIds) throws RestClientException {
        return brandsGetBrandsWithHttpInfo(filterState, filterFrom, filterCount, filterSubstring, filterSortingIds).getBody();
    }

    /**
     * Возвращает список всех брендов.
     * 
     * <p><b>200</b> - OK
     * @param filterState Определяет, возвращать ли объекты с состоянием hidden. (optional)
     * @param filterFrom Начало выборки. (optional)
     * @param filterCount Количество. (optional)
     * @param filterSubstring Подстрока для поиска. (optional)
     * @param filterSortingIds Идентификаторы брендов, которые будут выбираться первыми. (optional)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfBrandViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfBrandViewModel> brandsGetBrandsWithHttpInfo(String filterState, Integer filterFrom, Integer filterCount, String filterSubstring, List<Integer> filterSortingIds) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/brands").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.state", filterState));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.from", filterFrom));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.count", filterCount));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.substring", filterSubstring));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "filter.sortingIds", filterSortingIds));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfBrandViewModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfBrandViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Редактирование бренда.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор бренда. (required)
     * @param brandModel Модель для редактирования бренда. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel brandsUpdateBrand(Integer id, BrandViewModel brandModel) throws RestClientException {
        return brandsUpdateBrandWithHttpInfo(id, brandModel).getBody();
    }

    /**
     * Редактирование бренда.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор бренда. (required)
     * @param brandModel Модель для редактирования бренда. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> brandsUpdateBrandWithHttpInfo(Integer id, BrandViewModel brandModel) throws RestClientException {
        Object postBody = brandModel;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling brandsUpdateBrand");
        }
        
        // verify the required parameter 'brandModel' is set
        if (brandModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'brandModel' when calling brandsUpdateBrand");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/brands/{id}").buildAndExpand(uriVariables).toUriString();

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
