package com.example.demo.restclient.api;

import com.example.demo.restclient.ApiClient;

import com.example.demo.restclient.model.ResultModelOfListOfFilterTreeModel;

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
@Component("com.example.demo.restclient.api.FilterTreeApi")
public class FilterTreeApi {
    private ApiClient apiClient;

    public FilterTreeApi() {
        this(new ApiClient());
    }

    @Autowired
    public FilterTreeApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Возвращает дерево доступных фильтров для заданного FilterTreeDestinationType.
     * 
     * <p><b>200</b> - OK
     * @param getFiltersTreeModelOfferId Id акции. (optional)
     * @param getFiltersTreeModelChainId Id цепочки. (optional)
     * @param getFiltersTreeModelFilterDestinationType Для чего нужно получить дерево фильтров. (optional)
     * @param getFiltersTreeModelEventType Тип события. (optional)
     * @param getFiltersTreeModelExclusionType Тип события, исходя из которого нужно отфильтровать результат. (optional)
     * @return ResultModelOfListOfFilterTreeModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfFilterTreeModel filterTreeGetFiltersTree(Integer getFiltersTreeModelOfferId, Integer getFiltersTreeModelChainId, String getFiltersTreeModelFilterDestinationType, String getFiltersTreeModelEventType, String getFiltersTreeModelExclusionType) throws RestClientException {
        return filterTreeGetFiltersTreeWithHttpInfo(getFiltersTreeModelOfferId, getFiltersTreeModelChainId, getFiltersTreeModelFilterDestinationType, getFiltersTreeModelEventType, getFiltersTreeModelExclusionType).getBody();
    }

    /**
     * Возвращает дерево доступных фильтров для заданного FilterTreeDestinationType.
     * 
     * <p><b>200</b> - OK
     * @param getFiltersTreeModelOfferId Id акции. (optional)
     * @param getFiltersTreeModelChainId Id цепочки. (optional)
     * @param getFiltersTreeModelFilterDestinationType Для чего нужно получить дерево фильтров. (optional)
     * @param getFiltersTreeModelEventType Тип события. (optional)
     * @param getFiltersTreeModelExclusionType Тип события, исходя из которого нужно отфильтровать результат. (optional)
     * @return ResponseEntity&lt;ResultModelOfListOfFilterTreeModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfFilterTreeModel> filterTreeGetFiltersTreeWithHttpInfo(Integer getFiltersTreeModelOfferId, Integer getFiltersTreeModelChainId, String getFiltersTreeModelFilterDestinationType, String getFiltersTreeModelEventType, String getFiltersTreeModelExclusionType) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/Filters/FiltersTree").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "getFiltersTreeModel.offerId", getFiltersTreeModelOfferId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "getFiltersTreeModel.chainId", getFiltersTreeModelChainId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "getFiltersTreeModel.filterDestinationType", getFiltersTreeModelFilterDestinationType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "getFiltersTreeModel.eventType", getFiltersTreeModelEventType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "getFiltersTreeModel.exclusionType", getFiltersTreeModelExclusionType));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfListOfFilterTreeModel> returnType = new ParameterizedTypeReference<ResultModelOfListOfFilterTreeModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
