package restclient.api;

import restclient.ApiClient;

import restclient.model.AttributeModel;
import restclient.model.ResultModel;
import restclient.model.ResultModelOfAttributeModel;
import restclient.model.ResultModelOfInt32;
import restclient.model.ResultModelOfListOfAttributeModel;
import restclient.model.ResultModelOfRelatedEntityPropertyModel;

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
@Component("restclient.api.AnnouncementAttributeApi")
public class AnnouncementAttributeApi {
    private ApiClient apiClient;

    public AnnouncementAttributeApi() {
        this(new ApiClient());
    }

    @Autowired
    public AnnouncementAttributeApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Создать атрибут.
     * 
     * <p><b>201</b> - Created
     * @param attribute Модель атрибута. (required)
     * @return ResultModelOfInt32
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfInt32 announcementAttributeCreateAttribute(AttributeModel attribute) throws RestClientException {
        return announcementAttributeCreateAttributeWithHttpInfo(attribute).getBody();
    }

    /**
     * Создать атрибут.
     * 
     * <p><b>201</b> - Created
     * @param attribute Модель атрибута. (required)
     * @return ResponseEntity&lt;ResultModelOfInt32&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfInt32> announcementAttributeCreateAttributeWithHttpInfo(AttributeModel attribute) throws RestClientException {
        Object postBody = attribute;
        
        // verify the required parameter 'attribute' is set
        if (attribute == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'attribute' when calling announcementAttributeCreateAttribute");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/AnnouncementAttribute").build().toUriString();

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
     * Удалить атрибут.
     * 
     * <p><b>200</b> - OK
     * @param id Id атрибута. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel announcementAttributeDeleteAttribute(Integer id) throws RestClientException {
        return announcementAttributeDeleteAttributeWithHttpInfo(id).getBody();
    }

    /**
     * Удалить атрибут.
     * 
     * <p><b>200</b> - OK
     * @param id Id атрибута. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> announcementAttributeDeleteAttributeWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling announcementAttributeDeleteAttribute");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/AnnouncementAttribute/{id}").buildAndExpand(uriVariables).toUriString();

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
     * Получить все атрибуты.
     * 
     * <p><b>200</b> - OK
     * @return ResultModelOfListOfAttributeModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfAttributeModel announcementAttributeGetAll() throws RestClientException {
        return announcementAttributeGetAllWithHttpInfo().getBody();
    }

    /**
     * Получить все атрибуты.
     * 
     * <p><b>200</b> - OK
     * @return ResponseEntity&lt;ResultModelOfListOfAttributeModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfAttributeModel> announcementAttributeGetAllWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/AnnouncementAttribute").build().toUriString();

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

        ParameterizedTypeReference<ResultModelOfListOfAttributeModel> returnType = new ParameterizedTypeReference<ResultModelOfListOfAttributeModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить атрибут по Id.
     * 
     * <p><b>200</b> - OK
     * @param id Id атрибута. (required)
     * @return ResultModelOfAttributeModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfAttributeModel announcementAttributeGetAttribute(Integer id) throws RestClientException {
        return announcementAttributeGetAttributeWithHttpInfo(id).getBody();
    }

    /**
     * Получить атрибут по Id.
     * 
     * <p><b>200</b> - OK
     * @param id Id атрибута. (required)
     * @return ResponseEntity&lt;ResultModelOfAttributeModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfAttributeModel> announcementAttributeGetAttributeWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling announcementAttributeGetAttribute");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/AnnouncementAttribute/{id}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfAttributeModel> returnType = new ParameterizedTypeReference<ResultModelOfAttributeModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * The get available mappings.
     * 
     * <p><b>200</b> - OK
     * @param attributeType The attribute type. (required)
     * @param relatedAnnouncementType The related announcement type. (required)
     * @return ResultModelOfRelatedEntityPropertyModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfRelatedEntityPropertyModel announcementAttributeGetAvailableMappings(String attributeType, String relatedAnnouncementType) throws RestClientException {
        return announcementAttributeGetAvailableMappingsWithHttpInfo(attributeType, relatedAnnouncementType).getBody();
    }

    /**
     * The get available mappings.
     * 
     * <p><b>200</b> - OK
     * @param attributeType The attribute type. (required)
     * @param relatedAnnouncementType The related announcement type. (required)
     * @return ResponseEntity&lt;ResultModelOfRelatedEntityPropertyModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfRelatedEntityPropertyModel> announcementAttributeGetAvailableMappingsWithHttpInfo(String attributeType, String relatedAnnouncementType) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'attributeType' is set
        if (attributeType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'attributeType' when calling announcementAttributeGetAvailableMappings");
        }
        
        // verify the required parameter 'relatedAnnouncementType' is set
        if (relatedAnnouncementType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'relatedAnnouncementType' when calling announcementAttributeGetAvailableMappings");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/AnnouncementAttribute/availableMapping").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "attributeType", attributeType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "relatedAnnouncementType", relatedAnnouncementType));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfRelatedEntityPropertyModel> returnType = new ParameterizedTypeReference<ResultModelOfRelatedEntityPropertyModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Обновить атрибут.
     * 
     * <p><b>200</b> - OK
     * @param id Id атрибута. (required)
     * @param attribute Модель атрибута. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel announcementAttributeUpdateAttribute(Integer id, AttributeModel attribute) throws RestClientException {
        return announcementAttributeUpdateAttributeWithHttpInfo(id, attribute).getBody();
    }

    /**
     * Обновить атрибут.
     * 
     * <p><b>200</b> - OK
     * @param id Id атрибута. (required)
     * @param attribute Модель атрибута. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> announcementAttributeUpdateAttributeWithHttpInfo(Integer id, AttributeModel attribute) throws RestClientException {
        Object postBody = attribute;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling announcementAttributeUpdateAttribute");
        }
        
        // verify the required parameter 'attribute' is set
        if (attribute == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'attribute' when calling announcementAttributeUpdateAttribute");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/AnnouncementAttribute/{id}").buildAndExpand(uriVariables).toUriString();

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
