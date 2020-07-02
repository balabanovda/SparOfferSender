package com.example.demo.restclient.api;

import com.example.demo.restclient.ApiClient;

import com.example.demo.restclient.model.ResultModel;
import com.example.demo.restclient.model.ResultModelOfInt32;
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
@Component("com.example.demo.restclient.api.GoodsGroupCatalogApi")
public class GoodsGroupCatalogApi {
    private ApiClient apiClient;

    public GoodsGroupCatalogApi() {
        this(new ApiClient());
    }

    @Autowired
    public GoodsGroupCatalogApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Получить иерархию дерева каталога товаров от корневого элемента до отфильтрованных по атрибуту и строке поиска.
     * 
     * <p><b>200</b> - OK
     * @param goodsGroupId Id группы товаров. (required)
     * @param goodsSetId Id набора. (required)
     * @param attributeFilterId Id фильтра по атрибуту. (required)
     * @param from Индекс первого элемента выборки. (optional, default to 0)
     * @param count Количество элементов удовлетворяющих фильтру. (optional, default to 10)
     * @param filterSearchedText Текст, используемый при фильтрации. (optional)
     * @param filterSearchParameter Параметр, по которому выполняется поиск. (optional)
     * @return ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel goodsGroupCatalogGetCatalogHierarchyToFilteredAttributeCatalogItems(Integer goodsGroupId, Integer goodsSetId, Integer attributeFilterId, Integer from, Integer count, String filterSearchedText, String filterSearchParameter) throws RestClientException {
        return goodsGroupCatalogGetCatalogHierarchyToFilteredAttributeCatalogItemsWithHttpInfo(goodsGroupId, goodsSetId, attributeFilterId, from, count, filterSearchedText, filterSearchParameter).getBody();
    }

    /**
     * Получить иерархию дерева каталога товаров от корневого элемента до отфильтрованных по атрибуту и строке поиска.
     * 
     * <p><b>200</b> - OK
     * @param goodsGroupId Id группы товаров. (required)
     * @param goodsSetId Id набора. (required)
     * @param attributeFilterId Id фильтра по атрибуту. (required)
     * @param from Индекс первого элемента выборки. (optional, default to 0)
     * @param count Количество элементов удовлетворяющих фильтру. (optional, default to 10)
     * @param filterSearchedText Текст, используемый при фильтрации. (optional)
     * @param filterSearchParameter Параметр, по которому выполняется поиск. (optional)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel> goodsGroupCatalogGetCatalogHierarchyToFilteredAttributeCatalogItemsWithHttpInfo(Integer goodsGroupId, Integer goodsSetId, Integer attributeFilterId, Integer from, Integer count, String filterSearchedText, String filterSearchParameter) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'goodsGroupId' is set
        if (goodsGroupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'goodsGroupId' when calling goodsGroupCatalogGetCatalogHierarchyToFilteredAttributeCatalogItems");
        }
        
        // verify the required parameter 'goodsSetId' is set
        if (goodsSetId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'goodsSetId' when calling goodsGroupCatalogGetCatalogHierarchyToFilteredAttributeCatalogItems");
        }
        
        // verify the required parameter 'attributeFilterId' is set
        if (attributeFilterId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'attributeFilterId' when calling goodsGroupCatalogGetCatalogHierarchyToFilteredAttributeCatalogItems");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("goodsGroupId", goodsGroupId);
        uriVariables.put("goodsSetId", goodsSetId);
        uriVariables.put("attributeFilterId", attributeFilterId);
        String path = UriComponentsBuilder.fromPath("/api/goodsGroups/{goodsGroupId}/sets/{goodsSetId}/attributeFilter/{attributeFilterId}/catalog/search").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

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
    /**
     * Получить иерархию дерева каталога товаров от корневого элемента до отфильтрованных по атрибутам и фильтру.
     * 
     * <p><b>200</b> - OK
     * @param goodsGroupId Id группы товаров. (required)
     * @param goodsSetId Id набора товаров. (required)
     * @param from Индекс первого элемента выборки. (optional, default to 0)
     * @param count Количество элементов удовлетворяющих фильтру. (optional, default to 10)
     * @param filterSearchedText Текст, используемый при фильтрации. (optional)
     * @param filterSearchParameter Параметр, по которому выполняется поиск. (optional)
     * @return ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel goodsGroupCatalogGetCatalogHierarchyToFilteredAttributesCatalogItems(Integer goodsGroupId, Integer goodsSetId, Integer from, Integer count, String filterSearchedText, String filterSearchParameter) throws RestClientException {
        return goodsGroupCatalogGetCatalogHierarchyToFilteredAttributesCatalogItemsWithHttpInfo(goodsGroupId, goodsSetId, from, count, filterSearchedText, filterSearchParameter).getBody();
    }

    /**
     * Получить иерархию дерева каталога товаров от корневого элемента до отфильтрованных по атрибутам и фильтру.
     * 
     * <p><b>200</b> - OK
     * @param goodsGroupId Id группы товаров. (required)
     * @param goodsSetId Id набора товаров. (required)
     * @param from Индекс первого элемента выборки. (optional, default to 0)
     * @param count Количество элементов удовлетворяющих фильтру. (optional, default to 10)
     * @param filterSearchedText Текст, используемый при фильтрации. (optional)
     * @param filterSearchParameter Параметр, по которому выполняется поиск. (optional)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel> goodsGroupCatalogGetCatalogHierarchyToFilteredAttributesCatalogItemsWithHttpInfo(Integer goodsGroupId, Integer goodsSetId, Integer from, Integer count, String filterSearchedText, String filterSearchParameter) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'goodsGroupId' is set
        if (goodsGroupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'goodsGroupId' when calling goodsGroupCatalogGetCatalogHierarchyToFilteredAttributesCatalogItems");
        }
        
        // verify the required parameter 'goodsSetId' is set
        if (goodsSetId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'goodsSetId' when calling goodsGroupCatalogGetCatalogHierarchyToFilteredAttributesCatalogItems");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("goodsGroupId", goodsGroupId);
        uriVariables.put("goodsSetId", goodsSetId);
        String path = UriComponentsBuilder.fromPath("/api/goodsGroups/{goodsGroupId}/sets/{goodsSetId}/filteredCatalog/search").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

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
    /**
     * Получить иерархию дерева каталога товаров от корневого элемента до отфильтрованных.
     * 
     * <p><b>200</b> - OK
     * @param goodsGroupId Id группы товаров. (required)
     * @param goodsSetId Id набора. (required)
     * @param from Индекс первого элемента выборки. (optional, default to 0)
     * @param count Количество элементов удовлетворяющих фильтру. (optional, default to 10)
     * @param filterSearchedText Текст, используемый при фильтрации. (optional)
     * @param filterSearchParameter Параметр, по которому выполняется поиск. (optional)
     * @return ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel goodsGroupCatalogGetCatalogHierarchyToFilteredCatalogItems(Integer goodsGroupId, Integer goodsSetId, Integer from, Integer count, String filterSearchedText, String filterSearchParameter) throws RestClientException {
        return goodsGroupCatalogGetCatalogHierarchyToFilteredCatalogItemsWithHttpInfo(goodsGroupId, goodsSetId, from, count, filterSearchedText, filterSearchParameter).getBody();
    }

    /**
     * Получить иерархию дерева каталога товаров от корневого элемента до отфильтрованных.
     * 
     * <p><b>200</b> - OK
     * @param goodsGroupId Id группы товаров. (required)
     * @param goodsSetId Id набора. (required)
     * @param from Индекс первого элемента выборки. (optional, default to 0)
     * @param count Количество элементов удовлетворяющих фильтру. (optional, default to 10)
     * @param filterSearchedText Текст, используемый при фильтрации. (optional)
     * @param filterSearchParameter Параметр, по которому выполняется поиск. (optional)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel> goodsGroupCatalogGetCatalogHierarchyToFilteredCatalogItemsWithHttpInfo(Integer goodsGroupId, Integer goodsSetId, Integer from, Integer count, String filterSearchedText, String filterSearchParameter) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'goodsGroupId' is set
        if (goodsGroupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'goodsGroupId' when calling goodsGroupCatalogGetCatalogHierarchyToFilteredCatalogItems");
        }
        
        // verify the required parameter 'goodsSetId' is set
        if (goodsSetId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'goodsSetId' when calling goodsGroupCatalogGetCatalogHierarchyToFilteredCatalogItems");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("goodsGroupId", goodsGroupId);
        uriVariables.put("goodsSetId", goodsSetId);
        String path = UriComponentsBuilder.fromPath("/api/goodsGroups/{goodsGroupId}/sets/{goodsSetId}/catalog/search").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

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
    /**
     * Получить иерархию каталога товаров от корневого элемента до отфильтрованных, зафиксированных.
     * 
     * <p><b>200</b> - OK
     * @param goodsGroupId Id группы товаров. (required)
     * @param from Индекс первого элемента выборки. (optional, default to 0)
     * @param count Количество элементов удовлетворяющих фильтру. (optional, default to 10)
     * @param filterSearchedText Текст, используемый при фильтрации. (optional)
     * @param filterSearchParameter Параметр, по которому выполняется поиск. (optional)
     * @return ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel goodsGroupCatalogGetCatalogHierarchyToFilteredFixedCatalogItems(Integer goodsGroupId, Integer from, Integer count, String filterSearchedText, String filterSearchParameter) throws RestClientException {
        return goodsGroupCatalogGetCatalogHierarchyToFilteredFixedCatalogItemsWithHttpInfo(goodsGroupId, from, count, filterSearchedText, filterSearchParameter).getBody();
    }

    /**
     * Получить иерархию каталога товаров от корневого элемента до отфильтрованных, зафиксированных.
     * 
     * <p><b>200</b> - OK
     * @param goodsGroupId Id группы товаров. (required)
     * @param from Индекс первого элемента выборки. (optional, default to 0)
     * @param count Количество элементов удовлетворяющих фильтру. (optional, default to 10)
     * @param filterSearchedText Текст, используемый при фильтрации. (optional)
     * @param filterSearchParameter Параметр, по которому выполняется поиск. (optional)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel> goodsGroupCatalogGetCatalogHierarchyToFilteredFixedCatalogItemsWithHttpInfo(Integer goodsGroupId, Integer from, Integer count, String filterSearchedText, String filterSearchParameter) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'goodsGroupId' is set
        if (goodsGroupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'goodsGroupId' when calling goodsGroupCatalogGetCatalogHierarchyToFilteredFixedCatalogItems");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("goodsGroupId", goodsGroupId);
        String path = UriComponentsBuilder.fromPath("/api/goodsGroups/{goodsGroupId}/fixedCatalog/search").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

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
    /**
     * Получить иерархию каталога товаров от корневого элемента до отфильтрованных, состоящих в группе товаров.
     * 
     * <p><b>200</b> - OK
     * @param goodsGroupId Id группы товаров. (required)
     * @param from Индекс первого элемента выборки. (optional, default to 0)
     * @param count Количество элементов удовлетворяющих фильтру. (optional, default to 10)
     * @param filterSearchedText Текст, используемый при фильтрации. (optional)
     * @param filterSearchParameter Параметр, по которому выполняется поиск. (optional)
     * @return ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel goodsGroupCatalogGetCatalogHierarchyToFilteredGoodsGroupCatalogItems(Integer goodsGroupId, Integer from, Integer count, String filterSearchedText, String filterSearchParameter) throws RestClientException {
        return goodsGroupCatalogGetCatalogHierarchyToFilteredGoodsGroupCatalogItemsWithHttpInfo(goodsGroupId, from, count, filterSearchedText, filterSearchParameter).getBody();
    }

    /**
     * Получить иерархию каталога товаров от корневого элемента до отфильтрованных, состоящих в группе товаров.
     * 
     * <p><b>200</b> - OK
     * @param goodsGroupId Id группы товаров. (required)
     * @param from Индекс первого элемента выборки. (optional, default to 0)
     * @param count Количество элементов удовлетворяющих фильтру. (optional, default to 10)
     * @param filterSearchedText Текст, используемый при фильтрации. (optional)
     * @param filterSearchParameter Параметр, по которому выполняется поиск. (optional)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel> goodsGroupCatalogGetCatalogHierarchyToFilteredGoodsGroupCatalogItemsWithHttpInfo(Integer goodsGroupId, Integer from, Integer count, String filterSearchedText, String filterSearchParameter) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'goodsGroupId' is set
        if (goodsGroupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'goodsGroupId' when calling goodsGroupCatalogGetCatalogHierarchyToFilteredGoodsGroupCatalogItems");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("goodsGroupId", goodsGroupId);
        String path = UriComponentsBuilder.fromPath("/api/goodsGroups/{goodsGroupId}/catalog/search").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

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
    /**
     * Получить порядковый номер элемента в каталоге.
     * 
     * <p><b>200</b> - OK
     * @param goodsGroupId Id группы товаров. (required)
     * @param catalogItemId Id элемента каталога. (required)
     * @param parentNodeId Id родительского элемента каталога. (optional)
     * @return ResultModelOfInt32
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfInt32 goodsGroupCatalogGetCatalogItemIndex(Integer goodsGroupId, Integer catalogItemId, Integer parentNodeId) throws RestClientException {
        return goodsGroupCatalogGetCatalogItemIndexWithHttpInfo(goodsGroupId, catalogItemId, parentNodeId).getBody();
    }

    /**
     * Получить порядковый номер элемента в каталоге.
     * 
     * <p><b>200</b> - OK
     * @param goodsGroupId Id группы товаров. (required)
     * @param catalogItemId Id элемента каталога. (required)
     * @param parentNodeId Id родительского элемента каталога. (optional)
     * @return ResponseEntity&lt;ResultModelOfInt32&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfInt32> goodsGroupCatalogGetCatalogItemIndexWithHttpInfo(Integer goodsGroupId, Integer catalogItemId, Integer parentNodeId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'goodsGroupId' is set
        if (goodsGroupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'goodsGroupId' when calling goodsGroupCatalogGetCatalogItemIndex");
        }
        
        // verify the required parameter 'catalogItemId' is set
        if (catalogItemId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'catalogItemId' when calling goodsGroupCatalogGetCatalogItemIndex");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("goodsGroupId", goodsGroupId);
        uriVariables.put("catalogItemId", catalogItemId);
        String path = UriComponentsBuilder.fromPath("/api/goodsGroups/{goodsGroupId}/catalog/items/{catalogItemId}/index").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "parentNodeId", parentNodeId));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfInt32> returnType = new ParameterizedTypeReference<ResultModelOfInt32>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить каталог товаров, состоящих в наборах группы товаров.
     * 
     * <p><b>200</b> - OK
     * @param goodsGroupId Id группы товаров. (required)
     * @param parentNodeId Id родительского узла. (optional)
     * @param from Индекс первого элемента выборки. (optional, default to 0)
     * @param count Количество элементов. (optional, default to 10)
     * @return ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel goodsGroupCatalogGetGoodsGroupCatalog(Integer goodsGroupId, Integer parentNodeId, Integer from, Integer count) throws RestClientException {
        return goodsGroupCatalogGetGoodsGroupCatalogWithHttpInfo(goodsGroupId, parentNodeId, from, count).getBody();
    }

    /**
     * Получить каталог товаров, состоящих в наборах группы товаров.
     * 
     * <p><b>200</b> - OK
     * @param goodsGroupId Id группы товаров. (required)
     * @param parentNodeId Id родительского узла. (optional)
     * @param from Индекс первого элемента выборки. (optional, default to 0)
     * @param count Количество элементов. (optional, default to 10)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel> goodsGroupCatalogGetGoodsGroupCatalogWithHttpInfo(Integer goodsGroupId, Integer parentNodeId, Integer from, Integer count) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'goodsGroupId' is set
        if (goodsGroupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'goodsGroupId' when calling goodsGroupCatalogGetGoodsGroupCatalog");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("goodsGroupId", goodsGroupId);
        String path = UriComponentsBuilder.fromPath("/api/goodsGroups/{goodsGroupId}/catalog").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "parentNodeId", parentNodeId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));

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
    /**
     * Получить каталог зафиксированных товаров группы товаров.
     * 
     * <p><b>200</b> - OK
     * @param goodsGroupId Id группы товаров. (required)
     * @param parentNodeId Id родительского узла. (optional)
     * @param from Индекс первого элемента выборки. (optional, default to 0)
     * @param count Количество элементов. (optional, default to 10)
     * @return ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel goodsGroupCatalogGetGoodsGroupFixedCatalog(Integer goodsGroupId, Integer parentNodeId, Integer from, Integer count) throws RestClientException {
        return goodsGroupCatalogGetGoodsGroupFixedCatalogWithHttpInfo(goodsGroupId, parentNodeId, from, count).getBody();
    }

    /**
     * Получить каталог зафиксированных товаров группы товаров.
     * 
     * <p><b>200</b> - OK
     * @param goodsGroupId Id группы товаров. (required)
     * @param parentNodeId Id родительского узла. (optional)
     * @param from Индекс первого элемента выборки. (optional, default to 0)
     * @param count Количество элементов. (optional, default to 10)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel> goodsGroupCatalogGetGoodsGroupFixedCatalogWithHttpInfo(Integer goodsGroupId, Integer parentNodeId, Integer from, Integer count) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'goodsGroupId' is set
        if (goodsGroupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'goodsGroupId' when calling goodsGroupCatalogGetGoodsGroupFixedCatalog");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("goodsGroupId", goodsGroupId);
        String path = UriComponentsBuilder.fromPath("/api/goodsGroups/{goodsGroupId}/fixedCatalog").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "parentNodeId", parentNodeId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));

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
    /**
     * Получить каталог товаров, подходящих под фильтр по атрибуту.
     * 
     * <p><b>200</b> - OK
     * @param goodsGroupId Id группы товаров. (required)
     * @param goodsSetId Id набора. (required)
     * @param attributeFilterId Id фильтра по атрибуту. (required)
     * @param parentNodeId Id родительского узла. (optional)
     * @param from Индекс первого элемента выборки. (optional, default to 0)
     * @param count Количество элементов. (optional, default to 10)
     * @return ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel goodsGroupCatalogGetGoodsSetAttributeFilterCatalog(Integer goodsGroupId, Integer goodsSetId, Integer attributeFilterId, Integer parentNodeId, Integer from, Integer count) throws RestClientException {
        return goodsGroupCatalogGetGoodsSetAttributeFilterCatalogWithHttpInfo(goodsGroupId, goodsSetId, attributeFilterId, parentNodeId, from, count).getBody();
    }

    /**
     * Получить каталог товаров, подходящих под фильтр по атрибуту.
     * 
     * <p><b>200</b> - OK
     * @param goodsGroupId Id группы товаров. (required)
     * @param goodsSetId Id набора. (required)
     * @param attributeFilterId Id фильтра по атрибуту. (required)
     * @param parentNodeId Id родительского узла. (optional)
     * @param from Индекс первого элемента выборки. (optional, default to 0)
     * @param count Количество элементов. (optional, default to 10)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel> goodsGroupCatalogGetGoodsSetAttributeFilterCatalogWithHttpInfo(Integer goodsGroupId, Integer goodsSetId, Integer attributeFilterId, Integer parentNodeId, Integer from, Integer count) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'goodsGroupId' is set
        if (goodsGroupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'goodsGroupId' when calling goodsGroupCatalogGetGoodsSetAttributeFilterCatalog");
        }
        
        // verify the required parameter 'goodsSetId' is set
        if (goodsSetId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'goodsSetId' when calling goodsGroupCatalogGetGoodsSetAttributeFilterCatalog");
        }
        
        // verify the required parameter 'attributeFilterId' is set
        if (attributeFilterId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'attributeFilterId' when calling goodsGroupCatalogGetGoodsSetAttributeFilterCatalog");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("goodsGroupId", goodsGroupId);
        uriVariables.put("goodsSetId", goodsSetId);
        uriVariables.put("attributeFilterId", attributeFilterId);
        String path = UriComponentsBuilder.fromPath("/api/goodsGroups/{goodsGroupId}/sets/{goodsSetId}/attributeFilter/{attributeFilterId}/catalog").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "parentNodeId", parentNodeId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));

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
    /**
     * Получить каталог товаров набора.
     * 
     * <p><b>200</b> - OK
     * @param goodsGroupId Id группы товаров. (required)
     * @param goodsSetId Id набора. (required)
     * @param parentNodeId Id родительского узла. (optional)
     * @param from Индекс первого элемента выборки. (optional, default to 0)
     * @param count Количество элементов. (optional, default to 10)
     * @param checkedOnly Отображать только выбранные элементы. (optional, default to false)
     * @param filterSearchedText Текст, используемый при фильтрации. (optional)
     * @param filterSearchParameter Параметр, по которому выполняется поиск. (optional)
     * @return ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel goodsGroupCatalogGetGoodsSetCatalog(Integer goodsGroupId, Integer goodsSetId, Integer parentNodeId, Integer from, Integer count, Boolean checkedOnly, String filterSearchedText, String filterSearchParameter) throws RestClientException {
        return goodsGroupCatalogGetGoodsSetCatalogWithHttpInfo(goodsGroupId, goodsSetId, parentNodeId, from, count, checkedOnly, filterSearchedText, filterSearchParameter).getBody();
    }

    /**
     * Получить каталог товаров набора.
     * 
     * <p><b>200</b> - OK
     * @param goodsGroupId Id группы товаров. (required)
     * @param goodsSetId Id набора. (required)
     * @param parentNodeId Id родительского узла. (optional)
     * @param from Индекс первого элемента выборки. (optional, default to 0)
     * @param count Количество элементов. (optional, default to 10)
     * @param checkedOnly Отображать только выбранные элементы. (optional, default to false)
     * @param filterSearchedText Текст, используемый при фильтрации. (optional)
     * @param filterSearchParameter Параметр, по которому выполняется поиск. (optional)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel> goodsGroupCatalogGetGoodsSetCatalogWithHttpInfo(Integer goodsGroupId, Integer goodsSetId, Integer parentNodeId, Integer from, Integer count, Boolean checkedOnly, String filterSearchedText, String filterSearchParameter) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'goodsGroupId' is set
        if (goodsGroupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'goodsGroupId' when calling goodsGroupCatalogGetGoodsSetCatalog");
        }
        
        // verify the required parameter 'goodsSetId' is set
        if (goodsSetId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'goodsSetId' when calling goodsGroupCatalogGetGoodsSetCatalog");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("goodsGroupId", goodsGroupId);
        uriVariables.put("goodsSetId", goodsSetId);
        String path = UriComponentsBuilder.fromPath("/api/goodsGroups/{goodsGroupId}/sets/{goodsSetId}/catalog").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "parentNodeId", parentNodeId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "checkedOnly", checkedOnly));
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
    /**
     * Получить каталог товаров, подходящих под фильтры по атрибутам.
     * 
     * <p><b>200</b> - OK
     * @param goodsGroupId Id группы товаров. (required)
     * @param goodsSetId Id набора. (required)
     * @param parentNodeId Id родительского узла. (optional)
     * @param from Индекс первого элемента выборки. (optional, default to 0)
     * @param count Количество элементов. (optional, default to 10)
     * @return ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel goodsGroupCatalogGetGoodsSetFilteredCatalog(Integer goodsGroupId, Integer goodsSetId, Integer parentNodeId, Integer from, Integer count) throws RestClientException {
        return goodsGroupCatalogGetGoodsSetFilteredCatalogWithHttpInfo(goodsGroupId, goodsSetId, parentNodeId, from, count).getBody();
    }

    /**
     * Получить каталог товаров, подходящих под фильтры по атрибутам.
     * 
     * <p><b>200</b> - OK
     * @param goodsGroupId Id группы товаров. (required)
     * @param goodsSetId Id набора. (required)
     * @param parentNodeId Id родительского узла. (optional)
     * @param from Индекс первого элемента выборки. (optional, default to 0)
     * @param count Количество элементов. (optional, default to 10)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfGoodsCatalogBaseViewModel> goodsGroupCatalogGetGoodsSetFilteredCatalogWithHttpInfo(Integer goodsGroupId, Integer goodsSetId, Integer parentNodeId, Integer from, Integer count) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'goodsGroupId' is set
        if (goodsGroupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'goodsGroupId' when calling goodsGroupCatalogGetGoodsSetFilteredCatalog");
        }
        
        // verify the required parameter 'goodsSetId' is set
        if (goodsSetId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'goodsSetId' when calling goodsGroupCatalogGetGoodsSetFilteredCatalog");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("goodsGroupId", goodsGroupId);
        uriVariables.put("goodsSetId", goodsSetId);
        String path = UriComponentsBuilder.fromPath("/api/goodsGroups/{goodsGroupId}/sets/{goodsSetId}/filteredCatalog").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "parentNodeId", parentNodeId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));

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
    /**
     * Обновить состояние элемента каталога в наборе товаров.
     * 
     * <p><b>200</b> - OK
     * @param goodsGroupId Id группы товаров. (required)
     * @param goodsSetId Id набора. (required)
     * @param goodsCatalogItemId Id элемента каталога. (required)
     * @param checkState Обновленное состояние элемента. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel goodsGroupCatalogUpdateGoodsSetCatalogItem(Integer goodsGroupId, Integer goodsSetId, Integer goodsCatalogItemId, String checkState) throws RestClientException {
        return goodsGroupCatalogUpdateGoodsSetCatalogItemWithHttpInfo(goodsGroupId, goodsSetId, goodsCatalogItemId, checkState).getBody();
    }

    /**
     * Обновить состояние элемента каталога в наборе товаров.
     * 
     * <p><b>200</b> - OK
     * @param goodsGroupId Id группы товаров. (required)
     * @param goodsSetId Id набора. (required)
     * @param goodsCatalogItemId Id элемента каталога. (required)
     * @param checkState Обновленное состояние элемента. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> goodsGroupCatalogUpdateGoodsSetCatalogItemWithHttpInfo(Integer goodsGroupId, Integer goodsSetId, Integer goodsCatalogItemId, String checkState) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'goodsGroupId' is set
        if (goodsGroupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'goodsGroupId' when calling goodsGroupCatalogUpdateGoodsSetCatalogItem");
        }
        
        // verify the required parameter 'goodsSetId' is set
        if (goodsSetId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'goodsSetId' when calling goodsGroupCatalogUpdateGoodsSetCatalogItem");
        }
        
        // verify the required parameter 'goodsCatalogItemId' is set
        if (goodsCatalogItemId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'goodsCatalogItemId' when calling goodsGroupCatalogUpdateGoodsSetCatalogItem");
        }
        
        // verify the required parameter 'checkState' is set
        if (checkState == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'checkState' when calling goodsGroupCatalogUpdateGoodsSetCatalogItem");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("goodsGroupId", goodsGroupId);
        uriVariables.put("goodsSetId", goodsSetId);
        uriVariables.put("goodsCatalogItemId", goodsCatalogItemId);
        String path = UriComponentsBuilder.fromPath("/api/goodsGroups/{goodsGroupId}/sets/{goodsSetId}/catalog/items/{goodsCatalogItemId}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "checkState", checkState));

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
}
