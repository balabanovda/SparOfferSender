package restclient.api;

import restclient.ApiClient;

import restclient.model.PartnerCatalogViewModel;
import restclient.model.ResultModel;
import restclient.model.ResultModelOfInt32;
import restclient.model.ResultModelOfListOfPartnerCatalogViewModel;
import restclient.model.ResultModelOfPartnerCatalogViewModel;

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
@Component("restclient.api.PartnerCatalogApi")
public class PartnerCatalogApi {
    private ApiClient apiClient;

    public PartnerCatalogApi() {
        this(new ApiClient());
    }

    @Autowired
    public PartnerCatalogApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Создает новый каталог партнера.
     * 
     * <p><b>201</b> - Created
     * @param partnerId Id партнера. (required)
     * @param model Модель представления каталога. (required)
     * @return ResultModelOfInt32
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfInt32 partnerCatalogCreate(Integer partnerId, PartnerCatalogViewModel model) throws RestClientException {
        return partnerCatalogCreateWithHttpInfo(partnerId, model).getBody();
    }

    /**
     * Создает новый каталог партнера.
     * 
     * <p><b>201</b> - Created
     * @param partnerId Id партнера. (required)
     * @param model Модель представления каталога. (required)
     * @return ResponseEntity&lt;ResultModelOfInt32&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfInt32> partnerCatalogCreateWithHttpInfo(Integer partnerId, PartnerCatalogViewModel model) throws RestClientException {
        Object postBody = model;
        
        // verify the required parameter 'partnerId' is set
        if (partnerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partnerId' when calling partnerCatalogCreate");
        }
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling partnerCatalogCreate");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("partnerId", partnerId);
        String path = UriComponentsBuilder.fromPath("/api/partners/{partnerId}/catalogs").buildAndExpand(uriVariables).toUriString();

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
     * Возвращает каталог партнера.
     * 
     * <p><b>200</b> - OK
     * @param partnerId Id партнера. (required)
     * @param catalogId Id каталога. (required)
     * @return ResultModelOfPartnerCatalogViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPartnerCatalogViewModel partnerCatalogGet(Integer partnerId, Integer catalogId) throws RestClientException {
        return partnerCatalogGetWithHttpInfo(partnerId, catalogId).getBody();
    }

    /**
     * Возвращает каталог партнера.
     * 
     * <p><b>200</b> - OK
     * @param partnerId Id партнера. (required)
     * @param catalogId Id каталога. (required)
     * @return ResponseEntity&lt;ResultModelOfPartnerCatalogViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPartnerCatalogViewModel> partnerCatalogGetWithHttpInfo(Integer partnerId, Integer catalogId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'partnerId' is set
        if (partnerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partnerId' when calling partnerCatalogGet");
        }
        
        // verify the required parameter 'catalogId' is set
        if (catalogId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'catalogId' when calling partnerCatalogGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("partnerId", partnerId);
        uriVariables.put("catalogId", catalogId);
        String path = UriComponentsBuilder.fromPath("/api/partners/{partnerId}/catalogs/{catalogId}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfPartnerCatalogViewModel> returnType = new ParameterizedTypeReference<ResultModelOfPartnerCatalogViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Возвращает список каталогов партнера.
     * 
     * <p><b>200</b> - OK
     * @param partnerId Id партнера. (required)
     * @param name Строка для поиска по названию. (optional)
     * @return ResultModelOfListOfPartnerCatalogViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfPartnerCatalogViewModel partnerCatalogGetPartnerCatalogs(Integer partnerId, String name) throws RestClientException {
        return partnerCatalogGetPartnerCatalogsWithHttpInfo(partnerId, name).getBody();
    }

    /**
     * Возвращает список каталогов партнера.
     * 
     * <p><b>200</b> - OK
     * @param partnerId Id партнера. (required)
     * @param name Строка для поиска по названию. (optional)
     * @return ResponseEntity&lt;ResultModelOfListOfPartnerCatalogViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfPartnerCatalogViewModel> partnerCatalogGetPartnerCatalogsWithHttpInfo(Integer partnerId, String name) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'partnerId' is set
        if (partnerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partnerId' when calling partnerCatalogGetPartnerCatalogs");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("partnerId", partnerId);
        String path = UriComponentsBuilder.fromPath("/api/partners/{partnerId}/catalogs").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfListOfPartnerCatalogViewModel> returnType = new ParameterizedTypeReference<ResultModelOfListOfPartnerCatalogViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Сохраняет каталог партнера.
     * 
     * <p><b>200</b> - OK
     * @param partnerId Id партнера. (required)
     * @param catalogId Id каталога. (required)
     * @param model Модель представления каталога. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel partnerCatalogSave(Integer partnerId, Integer catalogId, PartnerCatalogViewModel model) throws RestClientException {
        return partnerCatalogSaveWithHttpInfo(partnerId, catalogId, model).getBody();
    }

    /**
     * Сохраняет каталог партнера.
     * 
     * <p><b>200</b> - OK
     * @param partnerId Id партнера. (required)
     * @param catalogId Id каталога. (required)
     * @param model Модель представления каталога. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> partnerCatalogSaveWithHttpInfo(Integer partnerId, Integer catalogId, PartnerCatalogViewModel model) throws RestClientException {
        Object postBody = model;
        
        // verify the required parameter 'partnerId' is set
        if (partnerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partnerId' when calling partnerCatalogSave");
        }
        
        // verify the required parameter 'catalogId' is set
        if (catalogId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'catalogId' when calling partnerCatalogSave");
        }
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling partnerCatalogSave");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("partnerId", partnerId);
        uriVariables.put("catalogId", catalogId);
        String path = UriComponentsBuilder.fromPath("/api/partners/{partnerId}/catalogs/{catalogId}").buildAndExpand(uriVariables).toUriString();

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
