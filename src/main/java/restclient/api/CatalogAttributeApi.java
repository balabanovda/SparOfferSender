package restclient.api;

import restclient.ApiClient;

import restclient.model.ResultModelOfListOfCatalogAttributeViewModel;
import restclient.model.ResultModelOfPagedViewModelOfGoodsAttributeValueViewModel;

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
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
@Component("restclient.api.CatalogAttributeApi")
public class CatalogAttributeApi {
    private ApiClient apiClient;

    public CatalogAttributeApi() {
        this(new ApiClient());
    }

    @Autowired
    public CatalogAttributeApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Атрибуты в каталоге партнера.
     * 
     * <p><b>200</b> - OK
     * @param partnerId Id партнера. (required)
     * @return ResultModelOfListOfCatalogAttributeViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfCatalogAttributeViewModel catalogAttributeGetByPartner(Integer partnerId) throws RestClientException {
        return catalogAttributeGetByPartnerWithHttpInfo(partnerId).getBody();
    }

    /**
     * Атрибуты в каталоге партнера.
     * 
     * <p><b>200</b> - OK
     * @param partnerId Id партнера. (required)
     * @return ResponseEntity&lt;ResultModelOfListOfCatalogAttributeViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfCatalogAttributeViewModel> catalogAttributeGetByPartnerWithHttpInfo(Integer partnerId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'partnerId' is set
        if (partnerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partnerId' when calling catalogAttributeGetByPartner");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("partnerId", partnerId);
        String path = UriComponentsBuilder.fromPath("/api/catalogs/{partnerId}/attributes").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfListOfCatalogAttributeViewModel> returnType = new ParameterizedTypeReference<ResultModelOfListOfCatalogAttributeViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получает список значений атрибута в выбранном диапазоне.
     * 
     * <p><b>200</b> - OK
     * @param partnerId Id партнера. (required)
     * @param attributeId ID атрибута. (required)
     * @param from С какого элемента. (optional, default to 0)
     * @param count Количество. (optional, default to 10)
     * @param nameSubstr Подстрока поиска по названию. (optional, default to )
     * @return ResultModelOfPagedViewModelOfGoodsAttributeValueViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfGoodsAttributeValueViewModel catalogAttributeGetValues(Integer partnerId, Integer attributeId, Integer from, Integer count, String nameSubstr) throws RestClientException {
        return catalogAttributeGetValuesWithHttpInfo(partnerId, attributeId, from, count, nameSubstr).getBody();
    }

    /**
     * Получает список значений атрибута в выбранном диапазоне.
     * 
     * <p><b>200</b> - OK
     * @param partnerId Id партнера. (required)
     * @param attributeId ID атрибута. (required)
     * @param from С какого элемента. (optional, default to 0)
     * @param count Количество. (optional, default to 10)
     * @param nameSubstr Подстрока поиска по названию. (optional, default to )
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfGoodsAttributeValueViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfGoodsAttributeValueViewModel> catalogAttributeGetValuesWithHttpInfo(Integer partnerId, Integer attributeId, Integer from, Integer count, String nameSubstr) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'partnerId' is set
        if (partnerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partnerId' when calling catalogAttributeGetValues");
        }
        
        // verify the required parameter 'attributeId' is set
        if (attributeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'attributeId' when calling catalogAttributeGetValues");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("partnerId", partnerId);
        uriVariables.put("attributeId", attributeId);
        String path = UriComponentsBuilder.fromPath("/api/catalogs/{partnerId}/attributes/{attributeId}/values").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "nameSubstr", nameSubstr));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfGoodsAttributeValueViewModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfGoodsAttributeValueViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
