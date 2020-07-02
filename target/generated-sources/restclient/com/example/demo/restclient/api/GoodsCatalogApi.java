package com.example.demo.restclient.api;

import com.example.demo.restclient.ApiClient;

import com.example.demo.restclient.model.ResultModelOfGoodsCatalogLeafViewModel;
import com.example.demo.restclient.model.ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel;

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
@Component("com.example.demo.restclient.api.GoodsCatalogApi")
public class GoodsCatalogApi {
    private ApiClient apiClient;

    public GoodsCatalogApi() {
        this(new ApiClient());
    }

    @Autowired
    public GoodsCatalogApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Получить информацию об элементе в каталоге.
     * 
     * <p><b>200</b> - OK
     * @param partnerId Id партнера. (required)
     * @param catalogItemId Id элемента. (required)
     * @return ResultModelOfGoodsCatalogLeafViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfGoodsCatalogLeafViewModel goodsCatalogGetCatalogItemInfo(Integer partnerId, Integer catalogItemId) throws RestClientException {
        return goodsCatalogGetCatalogItemInfoWithHttpInfo(partnerId, catalogItemId).getBody();
    }

    /**
     * Получить информацию об элементе в каталоге.
     * 
     * <p><b>200</b> - OK
     * @param partnerId Id партнера. (required)
     * @param catalogItemId Id элемента. (required)
     * @return ResponseEntity&lt;ResultModelOfGoodsCatalogLeafViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfGoodsCatalogLeafViewModel> goodsCatalogGetCatalogItemInfoWithHttpInfo(Integer partnerId, Integer catalogItemId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'partnerId' is set
        if (partnerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partnerId' when calling goodsCatalogGetCatalogItemInfo");
        }
        
        // verify the required parameter 'catalogItemId' is set
        if (catalogItemId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'catalogItemId' when calling goodsCatalogGetCatalogItemInfo");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("catalogItemId", catalogItemId);
        String path = UriComponentsBuilder.fromPath("/api/goodsCatalog/info/{catalogItemId}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "partnerId", partnerId));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfGoodsCatalogLeafViewModel> returnType = new ParameterizedTypeReference<ResultModelOfGoodsCatalogLeafViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить каталог товаров.
     * 
     * <p><b>200</b> - OK
     * @param partnerId Id партнера. (required)
     * @param parentNodeId Id родительского узла. (optional)
     * @param from Начало выборки. (optional, default to 0)
     * @param count Количество. (optional, default to 10)
     * @param filterSearchedText Текст, используемый при фильтрации. (optional)
     * @param filterSearchParameter Параметр, по которому выполняется поиск. (optional)
     * @return ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel goodsCatalogGetGoodsCatalog(Integer partnerId, Integer parentNodeId, Integer from, Integer count, String filterSearchedText, String filterSearchParameter) throws RestClientException {
        return goodsCatalogGetGoodsCatalogWithHttpInfo(partnerId, parentNodeId, from, count, filterSearchedText, filterSearchParameter).getBody();
    }

    /**
     * Получить каталог товаров.
     * 
     * <p><b>200</b> - OK
     * @param partnerId Id партнера. (required)
     * @param parentNodeId Id родительского узла. (optional)
     * @param from Начало выборки. (optional, default to 0)
     * @param count Количество. (optional, default to 10)
     * @param filterSearchedText Текст, используемый при фильтрации. (optional)
     * @param filterSearchParameter Параметр, по которому выполняется поиск. (optional)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel> goodsCatalogGetGoodsCatalogWithHttpInfo(Integer partnerId, Integer parentNodeId, Integer from, Integer count, String filterSearchedText, String filterSearchParameter) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'partnerId' is set
        if (partnerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partnerId' when calling goodsCatalogGetGoodsCatalog");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/goodsCatalog").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "partnerId", partnerId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "parentNodeId", parentNodeId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.searchedText", filterSearchedText));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.searchParameter", filterSearchParameter));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
