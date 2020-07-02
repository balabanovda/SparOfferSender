package com.example.demo.restclient.api;

import com.example.demo.restclient.ApiClient;

import com.example.demo.restclient.model.GoodsGroupsExportResponse;
import com.example.demo.restclient.model.GoodsGroupsImportModel;
import java.time.OffsetDateTime;
import com.example.demo.restclient.model.ResultModelOfGoodsGroupsImportResponse;

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
@Component("com.example.demo.restclient.api.GoodsGroupImportExportApi")
public class GoodsGroupImportExportApi {
    private ApiClient apiClient;

    public GoodsGroupImportExportApi() {
        this(new ApiClient());
    }

    @Autowired
    public GoodsGroupImportExportApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Экспортировать группу товаров по Id.
     * 
     * <p><b>200</b> - OK
     * @param goodsGroupId Id группы товаров. (required)
     * @return GoodsGroupsExportResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GoodsGroupsExportResponse goodsGroupImportExportExportGoodsGroup(Integer goodsGroupId) throws RestClientException {
        return goodsGroupImportExportExportGoodsGroupWithHttpInfo(goodsGroupId).getBody();
    }

    /**
     * Экспортировать группу товаров по Id.
     * 
     * <p><b>200</b> - OK
     * @param goodsGroupId Id группы товаров. (required)
     * @return ResponseEntity&lt;GoodsGroupsExportResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GoodsGroupsExportResponse> goodsGroupImportExportExportGoodsGroupWithHttpInfo(Integer goodsGroupId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'goodsGroupId' is set
        if (goodsGroupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'goodsGroupId' when calling goodsGroupImportExportExportGoodsGroup");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("goodsGroupId", goodsGroupId);
        String path = UriComponentsBuilder.fromPath("/api/goodsGroups/{goodsGroupId}/Export").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<GoodsGroupsExportResponse> returnType = new ParameterizedTypeReference<GoodsGroupsExportResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Экспортировать группы товаров.
     * 
     * <p><b>200</b> - OK
     * @param from С какой группы товаров начинать экспорт. (optional, default to 0)
     * @param count Количество групп товаров. (optional, default to 2147483647)
     * @param dateFrom  (optional)
     * @param dateTo  (optional)
     * @param creatorIds  (optional)
     * @param partnerIds  (optional)
     * @param archivedShowMode  (optional)
     * @param name  (optional)
     * @return GoodsGroupsExportResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GoodsGroupsExportResponse goodsGroupImportExportExportGoodsGroups(Integer from, Integer count, OffsetDateTime dateFrom, OffsetDateTime dateTo, String creatorIds, String partnerIds, String archivedShowMode, String name) throws RestClientException {
        return goodsGroupImportExportExportGoodsGroupsWithHttpInfo(from, count, dateFrom, dateTo, creatorIds, partnerIds, archivedShowMode, name).getBody();
    }

    /**
     * Экспортировать группы товаров.
     * 
     * <p><b>200</b> - OK
     * @param from С какой группы товаров начинать экспорт. (optional, default to 0)
     * @param count Количество групп товаров. (optional, default to 2147483647)
     * @param dateFrom  (optional)
     * @param dateTo  (optional)
     * @param creatorIds  (optional)
     * @param partnerIds  (optional)
     * @param archivedShowMode  (optional)
     * @param name  (optional)
     * @return ResponseEntity&lt;GoodsGroupsExportResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GoodsGroupsExportResponse> goodsGroupImportExportExportGoodsGroupsWithHttpInfo(Integer from, Integer count, OffsetDateTime dateFrom, OffsetDateTime dateTo, String creatorIds, String partnerIds, String archivedShowMode, String name) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/goodsGroups/Export").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "dateFrom", dateFrom));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "dateTo", dateTo));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "creatorIds", creatorIds));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "partnerIds", partnerIds));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "archivedShowMode", archivedShowMode));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<GoodsGroupsExportResponse> returnType = new ParameterizedTypeReference<GoodsGroupsExportResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Импортировать группы товаров.
     * 
     * <p><b>200</b> - OK
     * @param importModel Модель импортируемых групп товаров. (required)
     * @param rewriteExisting Перезаписать ли существующую ГТ. (optional, default to false)
     * @return ResultModelOfGoodsGroupsImportResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfGoodsGroupsImportResponse goodsGroupImportExportImportGoodsGroups(GoodsGroupsImportModel importModel, Boolean rewriteExisting) throws RestClientException {
        return goodsGroupImportExportImportGoodsGroupsWithHttpInfo(importModel, rewriteExisting).getBody();
    }

    /**
     * Импортировать группы товаров.
     * 
     * <p><b>200</b> - OK
     * @param importModel Модель импортируемых групп товаров. (required)
     * @param rewriteExisting Перезаписать ли существующую ГТ. (optional, default to false)
     * @return ResponseEntity&lt;ResultModelOfGoodsGroupsImportResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfGoodsGroupsImportResponse> goodsGroupImportExportImportGoodsGroupsWithHttpInfo(GoodsGroupsImportModel importModel, Boolean rewriteExisting) throws RestClientException {
        Object postBody = importModel;
        
        // verify the required parameter 'importModel' is set
        if (importModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'importModel' when calling goodsGroupImportExportImportGoodsGroups");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/goodsGroups/Import").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "rewriteExisting", rewriteExisting));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/x-www-form-urlencoded", "application/json", "text/json", "application/xml", "text/xml"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfGoodsGroupsImportResponse> returnType = new ParameterizedTypeReference<ResultModelOfGoodsGroupsImportResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
