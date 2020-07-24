package restclient.api;

import restclient.ApiClient;

import restclient.model.PersonalOfferAttributeViewModel;
import restclient.model.ResultModel;
import restclient.model.ResultModelOfBaseUserAttributeViewModel;
import restclient.model.ResultModelOfInt32;
import restclient.model.ResultModelOfPagedViewModelOfBaseUserAttributeViewModel;

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
@Component("restclient.api.AttributeApi")
public class AttributeApi {
    private ApiClient apiClient;

    public AttributeApi() {
        this(new ApiClient());
    }

    @Autowired
    public AttributeApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Создание атрибута.
     * 
     * <p><b>201</b> - Created
     * @param data Данные для создания. (required)
     * @return ResultModelOfInt32
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfInt32 attributeCreate(PersonalOfferAttributeViewModel data) throws RestClientException {
        return attributeCreateWithHttpInfo(data).getBody();
    }

    /**
     * Создание атрибута.
     * 
     * <p><b>201</b> - Created
     * @param data Данные для создания. (required)
     * @return ResponseEntity&lt;ResultModelOfInt32&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfInt32> attributeCreateWithHttpInfo(PersonalOfferAttributeViewModel data) throws RestClientException {
        Object postBody = data;
        
        // verify the required parameter 'data' is set
        if (data == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'data' when calling attributeCreate");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/Attributes").build().toUriString();

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
     * Получить атрибут по идентификатору.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор. (required)
     * @return ResultModelOfBaseUserAttributeViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfBaseUserAttributeViewModel attributeGet(Integer id) throws RestClientException {
        return attributeGetWithHttpInfo(id).getBody();
    }

    /**
     * Получить атрибут по идентификатору.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор. (required)
     * @return ResponseEntity&lt;ResultModelOfBaseUserAttributeViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfBaseUserAttributeViewModel> attributeGetWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling attributeGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/Attributes/{id}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfBaseUserAttributeViewModel> returnType = new ParameterizedTypeReference<ResultModelOfBaseUserAttributeViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить список всех атрибутов.
     * 
     * <p><b>200</b> - OK
     * @param from С. (optional, default to 0)
     * @param count Сколько. (optional, default to 10)
     * @param partnerId Id партнера (для получения списка для акции). (optional)
     * @param nameSearch Название атрибута. (optional)
     * @param logicalName Логическое имя. (optional)
     * @param attributeType Тип атрибута. (optional, default to PersonalOffer)
     * @return ResultModelOfPagedViewModelOfBaseUserAttributeViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfBaseUserAttributeViewModel attributeGetList(Integer from, Integer count, Integer partnerId, String nameSearch, String logicalName, String attributeType) throws RestClientException {
        return attributeGetListWithHttpInfo(from, count, partnerId, nameSearch, logicalName, attributeType).getBody();
    }

    /**
     * Получить список всех атрибутов.
     * 
     * <p><b>200</b> - OK
     * @param from С. (optional, default to 0)
     * @param count Сколько. (optional, default to 10)
     * @param partnerId Id партнера (для получения списка для акции). (optional)
     * @param nameSearch Название атрибута. (optional)
     * @param logicalName Логическое имя. (optional)
     * @param attributeType Тип атрибута. (optional, default to PersonalOffer)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfBaseUserAttributeViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfBaseUserAttributeViewModel> attributeGetListWithHttpInfo(Integer from, Integer count, Integer partnerId, String nameSearch, String logicalName, String attributeType) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/Attributes").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "partnerId", partnerId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "nameSearch", nameSearch));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "logicalName", logicalName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "attributeType", attributeType));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfBaseUserAttributeViewModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfBaseUserAttributeViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Обновление данных атрибута.
     * 
     * <p><b>200</b> - OK
     * @param data Данные для обновления. (required)
     * @param id  (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel attributeUpdate(PersonalOfferAttributeViewModel data, String id) throws RestClientException {
        return attributeUpdateWithHttpInfo(data, id).getBody();
    }

    /**
     * Обновление данных атрибута.
     * 
     * <p><b>200</b> - OK
     * @param data Данные для обновления. (required)
     * @param id  (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> attributeUpdateWithHttpInfo(PersonalOfferAttributeViewModel data, String id) throws RestClientException {
        Object postBody = data;
        
        // verify the required parameter 'data' is set
        if (data == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'data' when calling attributeUpdate");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling attributeUpdate");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/Attributes/{id}").buildAndExpand(uriVariables).toUriString();

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
