package com.example.demo.restclient.api;

import com.example.demo.restclient.ApiClient;

import com.example.demo.restclient.model.GoodsGroupModel;
import java.time.OffsetDateTime;
import com.example.demo.restclient.model.ResultModel;
import com.example.demo.restclient.model.ResultModelOfGoodsGroupViewModel;
import com.example.demo.restclient.model.ResultModelOfInt32;
import com.example.demo.restclient.model.ResultModelOfPagedViewModelOfCreatorModel;
import com.example.demo.restclient.model.ResultModelOfPagedViewModelOfGoodsGroupViewModel;

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
@Component("com.example.demo.restclient.api.GoodsGroupApi")
public class GoodsGroupApi {
    private ApiClient apiClient;

    public GoodsGroupApi() {
        this(new ApiClient());
    }

    @Autowired
    public GoodsGroupApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Архивировать группу товаров.
     * 
     * <p><b>200</b> - OK
     * @param id Id группы товаров. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel goodsGroupArchiveGoodsGroup(Integer id) throws RestClientException {
        return goodsGroupArchiveGoodsGroupWithHttpInfo(id).getBody();
    }

    /**
     * Архивировать группу товаров.
     * 
     * <p><b>200</b> - OK
     * @param id Id группы товаров. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> goodsGroupArchiveGoodsGroupWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling goodsGroupArchiveGoodsGroup");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/goodsGroups/{id}").buildAndExpand(uriVariables).toUriString();

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
     * Создание группы товаров.
     * 
     * <p><b>201</b> - Created
     * @param model Модель группы товаров. (required)
     * @return ResultModelOfInt32
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfInt32 goodsGroupCreateGoodsGroup(GoodsGroupModel model) throws RestClientException {
        return goodsGroupCreateGoodsGroupWithHttpInfo(model).getBody();
    }

    /**
     * Создание группы товаров.
     * 
     * <p><b>201</b> - Created
     * @param model Модель группы товаров. (required)
     * @return ResponseEntity&lt;ResultModelOfInt32&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfInt32> goodsGroupCreateGoodsGroupWithHttpInfo(GoodsGroupModel model) throws RestClientException {
        Object postBody = model;
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling goodsGroupCreateGoodsGroup");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/goodsGroups").build().toUriString();

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
     * Фиксация группы товаров.
     * 
     * <p><b>200</b> - OK
     * @param id Id группы товаров. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel goodsGroupFixGoodsGroup(Integer id) throws RestClientException {
        return goodsGroupFixGoodsGroupWithHttpInfo(id).getBody();
    }

    /**
     * Фиксация группы товаров.
     * 
     * <p><b>200</b> - OK
     * @param id Id группы товаров. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> goodsGroupFixGoodsGroupWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling goodsGroupFixGoodsGroup");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/goodsGroups/{id}/fix").buildAndExpand(uriVariables).toUriString();

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
     * Получить группу товаров по id.
     * 
     * <p><b>200</b> - OK
     * @param id Id группы товаров. (required)
     * @return ResultModelOfGoodsGroupViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfGoodsGroupViewModel goodsGroupGetGoodsGroup(Integer id) throws RestClientException {
        return goodsGroupGetGoodsGroupWithHttpInfo(id).getBody();
    }

    /**
     * Получить группу товаров по id.
     * 
     * <p><b>200</b> - OK
     * @param id Id группы товаров. (required)
     * @return ResponseEntity&lt;ResultModelOfGoodsGroupViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfGoodsGroupViewModel> goodsGroupGetGoodsGroupWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling goodsGroupGetGoodsGroup");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/goodsGroups/{id}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfGoodsGroupViewModel> returnType = new ParameterizedTypeReference<ResultModelOfGoodsGroupViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить количество товаров в группе товаров.
     * Для фиксированной группы товаров - количество зафиксированных товаров, для нефиксированной - текущее количество товаров в наборах.
     * <p><b>200</b> - OK
     * @param id Id группы товаров. (required)
     * @return ResultModelOfInt32
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfInt32 goodsGroupGetGoodsGroupGoodsCount(Integer id) throws RestClientException {
        return goodsGroupGetGoodsGroupGoodsCountWithHttpInfo(id).getBody();
    }

    /**
     * Получить количество товаров в группе товаров.
     * Для фиксированной группы товаров - количество зафиксированных товаров, для нефиксированной - текущее количество товаров в наборах.
     * <p><b>200</b> - OK
     * @param id Id группы товаров. (required)
     * @return ResponseEntity&lt;ResultModelOfInt32&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfInt32> goodsGroupGetGoodsGroupGoodsCountWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling goodsGroupGetGoodsGroupGoodsCount");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/goodsGroups/{id}/goodsCount").buildAndExpand(uriVariables).toUriString();

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
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить полную информацию о группах товаров.
     * 
     * <p><b>200</b> - OK
     * @param from Начало выборки. (optional, default to 0)
     * @param count Количество. (optional, default to 10)
     * @param sortingFilterId ID фильтра, группы товаров которого будут выбираться первыми. (optional)
     * @param sortingIds Список идентификаторов для первоочередного выбора. (optional)
     * @param properties Требуемые свойства view-модели. Если не указано ни одного, то будут заданы все. (optional)
     * @param filterDateFrom  (optional)
     * @param filterDateTo  (optional)
     * @param filterCreatorIds  (optional)
     * @param filterPartnerIds  (optional)
     * @param filterArchivedShowMode  (optional)
     * @param filterName  (optional)
     * @return ResultModelOfPagedViewModelOfGoodsGroupViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfGoodsGroupViewModel goodsGroupGetGoodsGroups(Integer from, Integer count, Integer sortingFilterId, List<Integer> sortingIds, List<String> properties, OffsetDateTime filterDateFrom, OffsetDateTime filterDateTo, List<Integer> filterCreatorIds, List<Integer> filterPartnerIds, String filterArchivedShowMode, String filterName) throws RestClientException {
        return goodsGroupGetGoodsGroupsWithHttpInfo(from, count, sortingFilterId, sortingIds, properties, filterDateFrom, filterDateTo, filterCreatorIds, filterPartnerIds, filterArchivedShowMode, filterName).getBody();
    }

    /**
     * Получить полную информацию о группах товаров.
     * 
     * <p><b>200</b> - OK
     * @param from Начало выборки. (optional, default to 0)
     * @param count Количество. (optional, default to 10)
     * @param sortingFilterId ID фильтра, группы товаров которого будут выбираться первыми. (optional)
     * @param sortingIds Список идентификаторов для первоочередного выбора. (optional)
     * @param properties Требуемые свойства view-модели. Если не указано ни одного, то будут заданы все. (optional)
     * @param filterDateFrom  (optional)
     * @param filterDateTo  (optional)
     * @param filterCreatorIds  (optional)
     * @param filterPartnerIds  (optional)
     * @param filterArchivedShowMode  (optional)
     * @param filterName  (optional)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfGoodsGroupViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfGoodsGroupViewModel> goodsGroupGetGoodsGroupsWithHttpInfo(Integer from, Integer count, Integer sortingFilterId, List<Integer> sortingIds, List<String> properties, OffsetDateTime filterDateFrom, OffsetDateTime filterDateTo, List<Integer> filterCreatorIds, List<Integer> filterPartnerIds, String filterArchivedShowMode, String filterName) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/goodsGroups").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sortingFilterId", sortingFilterId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "sortingIds", sortingIds));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "properties", properties));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.dateFrom", filterDateFrom));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.dateTo", filterDateTo));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "filter.creatorIds", filterCreatorIds));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "filter.partnerIds", filterPartnerIds));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.archivedShowMode", filterArchivedShowMode));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.name", filterName));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfGoodsGroupViewModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfGoodsGroupViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получение списка создателей групп товаров.
     * 
     * <p><b>200</b> - OK
     * @param from Начало выборки. (optional, default to 0)
     * @param count Количество элементов. (optional, default to 10)
     * @param mode Режим отображения создателей архивных групп товаров. (optional)
     * @return ResultModelOfPagedViewModelOfCreatorModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfCreatorModel goodsGroupGetGoodsGroupsCreators(Integer from, Integer count, String mode) throws RestClientException {
        return goodsGroupGetGoodsGroupsCreatorsWithHttpInfo(from, count, mode).getBody();
    }

    /**
     * Получение списка создателей групп товаров.
     * 
     * <p><b>200</b> - OK
     * @param from Начало выборки. (optional, default to 0)
     * @param count Количество элементов. (optional, default to 10)
     * @param mode Режим отображения создателей архивных групп товаров. (optional)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfCreatorModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfCreatorModel> goodsGroupGetGoodsGroupsCreatorsWithHttpInfo(Integer from, Integer count, String mode) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/goodsGroups/creators").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "mode", mode));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfCreatorModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfCreatorModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Восстановить из архива группу товаров.
     * 
     * <p><b>200</b> - OK
     * @param id Id группы товаров. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel goodsGroupRestoreGoodsGroup(Integer id) throws RestClientException {
        return goodsGroupRestoreGoodsGroupWithHttpInfo(id).getBody();
    }

    /**
     * Восстановить из архива группу товаров.
     * 
     * <p><b>200</b> - OK
     * @param id Id группы товаров. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> goodsGroupRestoreGoodsGroupWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling goodsGroupRestoreGoodsGroup");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/goodsGroups/{id}/restore").buildAndExpand(uriVariables).toUriString();

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
     * Снять фиксацию с группы товаров.
     * 
     * <p><b>200</b> - OK
     * @param id Id группы товаров. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel goodsGroupUnfixGoodsGroup(Integer id) throws RestClientException {
        return goodsGroupUnfixGoodsGroupWithHttpInfo(id).getBody();
    }

    /**
     * Снять фиксацию с группы товаров.
     * 
     * <p><b>200</b> - OK
     * @param id Id группы товаров. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> goodsGroupUnfixGoodsGroupWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling goodsGroupUnfixGoodsGroup");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/goodsGroups/{id}/unfix").buildAndExpand(uriVariables).toUriString();

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
     * Редактирование группы товаров.
     * 
     * <p><b>200</b> - OK
     * @param id Id группы товаров. (required)
     * @param model Модель группы товаров. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel goodsGroupUpdateGoodsGroup(Integer id, GoodsGroupModel model) throws RestClientException {
        return goodsGroupUpdateGoodsGroupWithHttpInfo(id, model).getBody();
    }

    /**
     * Редактирование группы товаров.
     * 
     * <p><b>200</b> - OK
     * @param id Id группы товаров. (required)
     * @param model Модель группы товаров. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> goodsGroupUpdateGoodsGroupWithHttpInfo(Integer id, GoodsGroupModel model) throws RestClientException {
        Object postBody = model;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling goodsGroupUpdateGoodsGroup");
        }
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling goodsGroupUpdateGoodsGroup");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/goodsGroups/{id}").buildAndExpand(uriVariables).toUriString();

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
