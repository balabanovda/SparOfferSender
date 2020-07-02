package com.example.demo.restclient.api;

import com.example.demo.restclient.ApiClient;

import com.example.demo.restclient.model.GoodsSetModel;
import com.example.demo.restclient.model.ResultModel;
import com.example.demo.restclient.model.ResultModelOfInt32;
import com.example.demo.restclient.model.ResultModelOfPagedViewModelOfGoodsSetViewModel;

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
@Component("com.example.demo.restclient.api.GoodsGroupSetApi")
public class GoodsGroupSetApi {
    private ApiClient apiClient;

    public GoodsGroupSetApi() {
        this(new ApiClient());
    }

    @Autowired
    public GoodsGroupSetApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Создать набор группы товаров.
     * 
     * <p><b>201</b> - Created
     * @param goodsGroupId Id группы товаров. (required)
     * @param model Модель набора товаров. (required)
     * @return ResultModelOfInt32
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfInt32 goodsGroupSetCreateGoodsGroupGoodsSet(Integer goodsGroupId, GoodsSetModel model) throws RestClientException {
        return goodsGroupSetCreateGoodsGroupGoodsSetWithHttpInfo(goodsGroupId, model).getBody();
    }

    /**
     * Создать набор группы товаров.
     * 
     * <p><b>201</b> - Created
     * @param goodsGroupId Id группы товаров. (required)
     * @param model Модель набора товаров. (required)
     * @return ResponseEntity&lt;ResultModelOfInt32&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfInt32> goodsGroupSetCreateGoodsGroupGoodsSetWithHttpInfo(Integer goodsGroupId, GoodsSetModel model) throws RestClientException {
        Object postBody = model;
        
        // verify the required parameter 'goodsGroupId' is set
        if (goodsGroupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'goodsGroupId' when calling goodsGroupSetCreateGoodsGroupGoodsSet");
        }
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling goodsGroupSetCreateGoodsGroupGoodsSet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("goodsGroupId", goodsGroupId);
        String path = UriComponentsBuilder.fromPath("/api/goodsGroups/{goodsGroupId}/goodsSets").buildAndExpand(uriVariables).toUriString();

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
     * Архивировать набор группы товаров.
     * 
     * <p><b>200</b> - OK
     * @param goodsGroupId Id группы товаров. (required)
     * @param goodsSetId Id набора. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel goodsGroupSetDeleteGoodsGroupGoodsSet(Integer goodsGroupId, Integer goodsSetId) throws RestClientException {
        return goodsGroupSetDeleteGoodsGroupGoodsSetWithHttpInfo(goodsGroupId, goodsSetId).getBody();
    }

    /**
     * Архивировать набор группы товаров.
     * 
     * <p><b>200</b> - OK
     * @param goodsGroupId Id группы товаров. (required)
     * @param goodsSetId Id набора. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> goodsGroupSetDeleteGoodsGroupGoodsSetWithHttpInfo(Integer goodsGroupId, Integer goodsSetId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'goodsGroupId' is set
        if (goodsGroupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'goodsGroupId' when calling goodsGroupSetDeleteGoodsGroupGoodsSet");
        }
        
        // verify the required parameter 'goodsSetId' is set
        if (goodsSetId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'goodsSetId' when calling goodsGroupSetDeleteGoodsGroupGoodsSet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("goodsGroupId", goodsGroupId);
        uriVariables.put("goodsSetId", goodsSetId);
        String path = UriComponentsBuilder.fromPath("/api/goodsGroups/{goodsGroupId}/goodsSets/{goodsSetId}").buildAndExpand(uriVariables).toUriString();

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
     * Получить наборы группы товаров.
     * 
     * <p><b>200</b> - OK
     * @param goodsGroupId Id группы товаров. (required)
     * @param from С какого элемента. (optional, default to 0)
     * @param count Сколько. (optional, default to 2147483647)
     * @param type Тип набора. (optional)
     * @return ResultModelOfPagedViewModelOfGoodsSetViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfGoodsSetViewModel goodsGroupSetGetGoodsGroupGoodsSets(Integer goodsGroupId, Integer from, Integer count, String type) throws RestClientException {
        return goodsGroupSetGetGoodsGroupGoodsSetsWithHttpInfo(goodsGroupId, from, count, type).getBody();
    }

    /**
     * Получить наборы группы товаров.
     * 
     * <p><b>200</b> - OK
     * @param goodsGroupId Id группы товаров. (required)
     * @param from С какого элемента. (optional, default to 0)
     * @param count Сколько. (optional, default to 2147483647)
     * @param type Тип набора. (optional)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfGoodsSetViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfGoodsSetViewModel> goodsGroupSetGetGoodsGroupGoodsSetsWithHttpInfo(Integer goodsGroupId, Integer from, Integer count, String type) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'goodsGroupId' is set
        if (goodsGroupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'goodsGroupId' when calling goodsGroupSetGetGoodsGroupGoodsSets");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("goodsGroupId", goodsGroupId);
        String path = UriComponentsBuilder.fromPath("/api/goodsGroups/{goodsGroupId}/goodsSets").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "type", type));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfGoodsSetViewModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfGoodsSetViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Редактировать набор группы товаров.
     * 
     * <p><b>200</b> - OK
     * @param goodsGroupId Id группы товаров. (required)
     * @param goodsSetId Id набора. (required)
     * @param model Модель набора товаров. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel goodsGroupSetUpdateGoodsGroupGoodsSet(Integer goodsGroupId, Integer goodsSetId, GoodsSetModel model) throws RestClientException {
        return goodsGroupSetUpdateGoodsGroupGoodsSetWithHttpInfo(goodsGroupId, goodsSetId, model).getBody();
    }

    /**
     * Редактировать набор группы товаров.
     * 
     * <p><b>200</b> - OK
     * @param goodsGroupId Id группы товаров. (required)
     * @param goodsSetId Id набора. (required)
     * @param model Модель набора товаров. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> goodsGroupSetUpdateGoodsGroupGoodsSetWithHttpInfo(Integer goodsGroupId, Integer goodsSetId, GoodsSetModel model) throws RestClientException {
        Object postBody = model;
        
        // verify the required parameter 'goodsGroupId' is set
        if (goodsGroupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'goodsGroupId' when calling goodsGroupSetUpdateGoodsGroupGoodsSet");
        }
        
        // verify the required parameter 'goodsSetId' is set
        if (goodsSetId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'goodsSetId' when calling goodsGroupSetUpdateGoodsGroupGoodsSet");
        }
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling goodsGroupSetUpdateGoodsGroupGoodsSet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("goodsGroupId", goodsGroupId);
        uriVariables.put("goodsSetId", goodsSetId);
        String path = UriComponentsBuilder.fromPath("/api/goodsGroups/{goodsGroupId}/goodsSets/{goodsSetId}").buildAndExpand(uriVariables).toUriString();

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
