package com.example.demo.restclient.api;

import com.example.demo.restclient.ApiClient;

import com.example.demo.restclient.model.GoodsSetAttributeFilterItemViewModel;
import com.example.demo.restclient.model.ResultModel;
import com.example.demo.restclient.model.ResultModelOfGoodsSetAttributeFilterItemViewModel;
import com.example.demo.restclient.model.ResultModelOfInt32;
import com.example.demo.restclient.model.ResultModelOfListOfCatalogAttributeViewModel;
import com.example.demo.restclient.model.ResultModelOfListOfGoodsSetAttributeFilterItemViewModel;

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
@Component("com.example.demo.restclient.api.GoodsGroupSetAttributeFilterApi")
public class GoodsGroupSetAttributeFilterApi {
    private ApiClient apiClient;

    public GoodsGroupSetAttributeFilterApi() {
        this(new ApiClient());
    }

    @Autowired
    public GoodsGroupSetAttributeFilterApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Создает фильтр по атрибутам.
     * 
     * <p><b>201</b> - Created
     * @param goodsGroupId Id группы товаров. (required)
     * @param goodsSetId Id набора группы товаров. (required)
     * @param model View-модель фильтра. (required)
     * @return ResultModelOfInt32
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfInt32 goodsGroupSetAttributeFilterCreate(Integer goodsGroupId, Integer goodsSetId, GoodsSetAttributeFilterItemViewModel model) throws RestClientException {
        return goodsGroupSetAttributeFilterCreateWithHttpInfo(goodsGroupId, goodsSetId, model).getBody();
    }

    /**
     * Создает фильтр по атрибутам.
     * 
     * <p><b>201</b> - Created
     * @param goodsGroupId Id группы товаров. (required)
     * @param goodsSetId Id набора группы товаров. (required)
     * @param model View-модель фильтра. (required)
     * @return ResponseEntity&lt;ResultModelOfInt32&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfInt32> goodsGroupSetAttributeFilterCreateWithHttpInfo(Integer goodsGroupId, Integer goodsSetId, GoodsSetAttributeFilterItemViewModel model) throws RestClientException {
        Object postBody = model;
        
        // verify the required parameter 'goodsGroupId' is set
        if (goodsGroupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'goodsGroupId' when calling goodsGroupSetAttributeFilterCreate");
        }
        
        // verify the required parameter 'goodsSetId' is set
        if (goodsSetId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'goodsSetId' when calling goodsGroupSetAttributeFilterCreate");
        }
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling goodsGroupSetAttributeFilterCreate");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("goodsGroupId", goodsGroupId);
        uriVariables.put("goodsSetId", goodsSetId);
        String path = UriComponentsBuilder.fromPath("/api/goodsGroups/{goodsGroupId}/goodsSets/{goodsSetId}/attributeItems").buildAndExpand(uriVariables).toUriString();

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
     * Удаляет фильтр по атрибутам.
     * 
     * <p><b>200</b> - OK
     * @param goodsGroupId Id группы товаров. (required)
     * @param goodsSetId Id набора группы товаров. (required)
     * @param attributeItemId Id фильтра по атрибутам. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel goodsGroupSetAttributeFilterDelete(Integer goodsGroupId, Integer goodsSetId, Integer attributeItemId) throws RestClientException {
        return goodsGroupSetAttributeFilterDeleteWithHttpInfo(goodsGroupId, goodsSetId, attributeItemId).getBody();
    }

    /**
     * Удаляет фильтр по атрибутам.
     * 
     * <p><b>200</b> - OK
     * @param goodsGroupId Id группы товаров. (required)
     * @param goodsSetId Id набора группы товаров. (required)
     * @param attributeItemId Id фильтра по атрибутам. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> goodsGroupSetAttributeFilterDeleteWithHttpInfo(Integer goodsGroupId, Integer goodsSetId, Integer attributeItemId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'goodsGroupId' is set
        if (goodsGroupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'goodsGroupId' when calling goodsGroupSetAttributeFilterDelete");
        }
        
        // verify the required parameter 'goodsSetId' is set
        if (goodsSetId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'goodsSetId' when calling goodsGroupSetAttributeFilterDelete");
        }
        
        // verify the required parameter 'attributeItemId' is set
        if (attributeItemId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'attributeItemId' when calling goodsGroupSetAttributeFilterDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("goodsGroupId", goodsGroupId);
        uriVariables.put("goodsSetId", goodsSetId);
        uriVariables.put("attributeItemId", attributeItemId);
        String path = UriComponentsBuilder.fromPath("/api/goodsGroups/{goodsGroupId}/goodsSets/{goodsSetId}/attributeItems/{attributeItemId}").buildAndExpand(uriVariables).toUriString();

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
     * Редактирует фильтр по атрибутам.
     * 
     * <p><b>200</b> - OK
     * @param goodsGroupId Id группы товаров. (required)
     * @param goodsSetId Id набора группы товаров. (required)
     * @param attributeItemId Id фильтра по атрибутам. (required)
     * @param model View-модель фильтра. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel goodsGroupSetAttributeFilterEdit(Integer goodsGroupId, Integer goodsSetId, Integer attributeItemId, GoodsSetAttributeFilterItemViewModel model) throws RestClientException {
        return goodsGroupSetAttributeFilterEditWithHttpInfo(goodsGroupId, goodsSetId, attributeItemId, model).getBody();
    }

    /**
     * Редактирует фильтр по атрибутам.
     * 
     * <p><b>200</b> - OK
     * @param goodsGroupId Id группы товаров. (required)
     * @param goodsSetId Id набора группы товаров. (required)
     * @param attributeItemId Id фильтра по атрибутам. (required)
     * @param model View-модель фильтра. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> goodsGroupSetAttributeFilterEditWithHttpInfo(Integer goodsGroupId, Integer goodsSetId, Integer attributeItemId, GoodsSetAttributeFilterItemViewModel model) throws RestClientException {
        Object postBody = model;
        
        // verify the required parameter 'goodsGroupId' is set
        if (goodsGroupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'goodsGroupId' when calling goodsGroupSetAttributeFilterEdit");
        }
        
        // verify the required parameter 'goodsSetId' is set
        if (goodsSetId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'goodsSetId' when calling goodsGroupSetAttributeFilterEdit");
        }
        
        // verify the required parameter 'attributeItemId' is set
        if (attributeItemId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'attributeItemId' when calling goodsGroupSetAttributeFilterEdit");
        }
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling goodsGroupSetAttributeFilterEdit");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("goodsGroupId", goodsGroupId);
        uriVariables.put("goodsSetId", goodsSetId);
        uriVariables.put("attributeItemId", attributeItemId);
        String path = UriComponentsBuilder.fromPath("/api/goodsGroups/{goodsGroupId}/goodsSets/{goodsSetId}/attributeItems/{attributeItemId}").buildAndExpand(uriVariables).toUriString();

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
     * Получает фильтр по атрибутам по его ID.
     * 
     * <p><b>200</b> - OK
     * @param goodsGroupId Id группы товаров. (required)
     * @param goodsSetId Id набора группы товаров. (required)
     * @param attributeItemId Id фильтра. (required)
     * @return ResultModelOfGoodsSetAttributeFilterItemViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfGoodsSetAttributeFilterItemViewModel goodsGroupSetAttributeFilterGetApiGoodsGroupsByGoodsGroupIdGoodsSetsByGoodsSetIdAttributeItemsByAttributeItemId(Integer goodsGroupId, Integer goodsSetId, Integer attributeItemId) throws RestClientException {
        return goodsGroupSetAttributeFilterGetApiGoodsGroupsByGoodsGroupIdGoodsSetsByGoodsSetIdAttributeItemsByAttributeItemIdWithHttpInfo(goodsGroupId, goodsSetId, attributeItemId).getBody();
    }

    /**
     * Получает фильтр по атрибутам по его ID.
     * 
     * <p><b>200</b> - OK
     * @param goodsGroupId Id группы товаров. (required)
     * @param goodsSetId Id набора группы товаров. (required)
     * @param attributeItemId Id фильтра. (required)
     * @return ResponseEntity&lt;ResultModelOfGoodsSetAttributeFilterItemViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfGoodsSetAttributeFilterItemViewModel> goodsGroupSetAttributeFilterGetApiGoodsGroupsByGoodsGroupIdGoodsSetsByGoodsSetIdAttributeItemsByAttributeItemIdWithHttpInfo(Integer goodsGroupId, Integer goodsSetId, Integer attributeItemId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'goodsGroupId' is set
        if (goodsGroupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'goodsGroupId' when calling goodsGroupSetAttributeFilterGetApiGoodsGroupsByGoodsGroupIdGoodsSetsByGoodsSetIdAttributeItemsByAttributeItemId");
        }
        
        // verify the required parameter 'goodsSetId' is set
        if (goodsSetId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'goodsSetId' when calling goodsGroupSetAttributeFilterGetApiGoodsGroupsByGoodsGroupIdGoodsSetsByGoodsSetIdAttributeItemsByAttributeItemId");
        }
        
        // verify the required parameter 'attributeItemId' is set
        if (attributeItemId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'attributeItemId' when calling goodsGroupSetAttributeFilterGetApiGoodsGroupsByGoodsGroupIdGoodsSetsByGoodsSetIdAttributeItemsByAttributeItemId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("goodsGroupId", goodsGroupId);
        uriVariables.put("goodsSetId", goodsSetId);
        uriVariables.put("attributeItemId", attributeItemId);
        String path = UriComponentsBuilder.fromPath("/api/goodsGroups/{goodsGroupId}/goodsSets/{goodsSetId}/attributeItems/{attributeItemId}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfGoodsSetAttributeFilterItemViewModel> returnType = new ParameterizedTypeReference<ResultModelOfGoodsSetAttributeFilterItemViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Доступные для выбора атрибуты.
     * 
     * <p><b>200</b> - OK
     * @param goodsGroupId Id группы товаров. (required)
     * @param goodsSetId Id набора группы товаров. (required)
     * @param partnerId Id партнера. (required)
     * @return ResultModelOfListOfCatalogAttributeViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfCatalogAttributeViewModel goodsGroupSetAttributeFilterGetAvailableAttributes(Integer goodsGroupId, Integer goodsSetId, Integer partnerId) throws RestClientException {
        return goodsGroupSetAttributeFilterGetAvailableAttributesWithHttpInfo(goodsGroupId, goodsSetId, partnerId).getBody();
    }

    /**
     * Доступные для выбора атрибуты.
     * 
     * <p><b>200</b> - OK
     * @param goodsGroupId Id группы товаров. (required)
     * @param goodsSetId Id набора группы товаров. (required)
     * @param partnerId Id партнера. (required)
     * @return ResponseEntity&lt;ResultModelOfListOfCatalogAttributeViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfCatalogAttributeViewModel> goodsGroupSetAttributeFilterGetAvailableAttributesWithHttpInfo(Integer goodsGroupId, Integer goodsSetId, Integer partnerId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'goodsGroupId' is set
        if (goodsGroupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'goodsGroupId' when calling goodsGroupSetAttributeFilterGetAvailableAttributes");
        }
        
        // verify the required parameter 'goodsSetId' is set
        if (goodsSetId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'goodsSetId' when calling goodsGroupSetAttributeFilterGetAvailableAttributes");
        }
        
        // verify the required parameter 'partnerId' is set
        if (partnerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partnerId' when calling goodsGroupSetAttributeFilterGetAvailableAttributes");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("goodsGroupId", goodsGroupId);
        uriVariables.put("goodsSetId", goodsSetId);
        String path = UriComponentsBuilder.fromPath("/api/goodsGroups/{goodsGroupId}/goodsSets/{goodsSetId}/attributeItems/availableAttributes").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfListOfCatalogAttributeViewModel> returnType = new ParameterizedTypeReference<ResultModelOfListOfCatalogAttributeViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить фильтры по атрибутам набора группы товаров.
     * 
     * <p><b>200</b> - OK
     * @param goodsGroupId Id группы товаров. (required)
     * @param goodsSetId Id набора группы товаров. (required)
     * @return ResultModelOfListOfGoodsSetAttributeFilterItemViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfGoodsSetAttributeFilterItemViewModel goodsGroupSetAttributeFilterGetGoodsSetAttributeFilterItems(Integer goodsGroupId, Integer goodsSetId) throws RestClientException {
        return goodsGroupSetAttributeFilterGetGoodsSetAttributeFilterItemsWithHttpInfo(goodsGroupId, goodsSetId).getBody();
    }

    /**
     * Получить фильтры по атрибутам набора группы товаров.
     * 
     * <p><b>200</b> - OK
     * @param goodsGroupId Id группы товаров. (required)
     * @param goodsSetId Id набора группы товаров. (required)
     * @return ResponseEntity&lt;ResultModelOfListOfGoodsSetAttributeFilterItemViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfGoodsSetAttributeFilterItemViewModel> goodsGroupSetAttributeFilterGetGoodsSetAttributeFilterItemsWithHttpInfo(Integer goodsGroupId, Integer goodsSetId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'goodsGroupId' is set
        if (goodsGroupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'goodsGroupId' when calling goodsGroupSetAttributeFilterGetGoodsSetAttributeFilterItems");
        }
        
        // verify the required parameter 'goodsSetId' is set
        if (goodsSetId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'goodsSetId' when calling goodsGroupSetAttributeFilterGetGoodsSetAttributeFilterItems");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("goodsGroupId", goodsGroupId);
        uriVariables.put("goodsSetId", goodsSetId);
        String path = UriComponentsBuilder.fromPath("/api/goodsGroups/{goodsGroupId}/goodsSets/{goodsSetId}/attributeItems").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfListOfGoodsSetAttributeFilterItemViewModel> returnType = new ParameterizedTypeReference<ResultModelOfListOfGoodsSetAttributeFilterItemViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получает атрибуты, доступные для выбора в атрибутном фильтре.
     * 
     * <p><b>200</b> - OK
     * @param goodsGroupId Id группы товаров. (required)
     * @param goodsSetId Id набора группы товаров. (required)
     * @param attributeItemId Id фильтра по атрибутам. (required)
     * @param partnerId Id партнера. (required)
     * @return ResultModelOfListOfCatalogAttributeViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfCatalogAttributeViewModel goodsGroupSetAttributeFilterGetItemAvailableAttributes(Integer goodsGroupId, Integer goodsSetId, Integer attributeItemId, Integer partnerId) throws RestClientException {
        return goodsGroupSetAttributeFilterGetItemAvailableAttributesWithHttpInfo(goodsGroupId, goodsSetId, attributeItemId, partnerId).getBody();
    }

    /**
     * Получает атрибуты, доступные для выбора в атрибутном фильтре.
     * 
     * <p><b>200</b> - OK
     * @param goodsGroupId Id группы товаров. (required)
     * @param goodsSetId Id набора группы товаров. (required)
     * @param attributeItemId Id фильтра по атрибутам. (required)
     * @param partnerId Id партнера. (required)
     * @return ResponseEntity&lt;ResultModelOfListOfCatalogAttributeViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfCatalogAttributeViewModel> goodsGroupSetAttributeFilterGetItemAvailableAttributesWithHttpInfo(Integer goodsGroupId, Integer goodsSetId, Integer attributeItemId, Integer partnerId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'goodsGroupId' is set
        if (goodsGroupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'goodsGroupId' when calling goodsGroupSetAttributeFilterGetItemAvailableAttributes");
        }
        
        // verify the required parameter 'goodsSetId' is set
        if (goodsSetId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'goodsSetId' when calling goodsGroupSetAttributeFilterGetItemAvailableAttributes");
        }
        
        // verify the required parameter 'attributeItemId' is set
        if (attributeItemId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'attributeItemId' when calling goodsGroupSetAttributeFilterGetItemAvailableAttributes");
        }
        
        // verify the required parameter 'partnerId' is set
        if (partnerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partnerId' when calling goodsGroupSetAttributeFilterGetItemAvailableAttributes");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("goodsGroupId", goodsGroupId);
        uriVariables.put("goodsSetId", goodsSetId);
        uriVariables.put("attributeItemId", attributeItemId);
        String path = UriComponentsBuilder.fromPath("/api/goodsGroups/{goodsGroupId}/goodsSets/{goodsSetId}/attributeItems/{attributeItemId}/availableAttributes").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfListOfCatalogAttributeViewModel> returnType = new ParameterizedTypeReference<ResultModelOfListOfCatalogAttributeViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
