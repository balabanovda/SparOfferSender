package restclient.api;

import restclient.ApiClient;

import restclient.model.ResultModel;
import restclient.model.ResultModelOfUserAttributeValueViewModel;
import restclient.model.SetPartnerUserAttributeValueModel;

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
@Component("restclient.api.PartnerAttributeValueApi")
public class PartnerAttributeValueApi {
    private ApiClient apiClient;

    public PartnerAttributeValueApi() {
        this(new ApiClient());
    }

    @Autowired
    public PartnerAttributeValueApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Получить значение партнерского атрибута для пользователя.
     * 
     * <p><b>200</b> - OK
     * @param partnerId Идентификатор партнера. (required)
     * @param userId Идентификатор пользователя. (required)
     * @param logicalName LogicalName атрибута. (required)
     * @return ResultModelOfUserAttributeValueViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfUserAttributeValueViewModel partnerAttributeValueGetAttributeValue(Integer partnerId, Integer userId, String logicalName) throws RestClientException {
        return partnerAttributeValueGetAttributeValueWithHttpInfo(partnerId, userId, logicalName).getBody();
    }

    /**
     * Получить значение партнерского атрибута для пользователя.
     * 
     * <p><b>200</b> - OK
     * @param partnerId Идентификатор партнера. (required)
     * @param userId Идентификатор пользователя. (required)
     * @param logicalName LogicalName атрибута. (required)
     * @return ResponseEntity&lt;ResultModelOfUserAttributeValueViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfUserAttributeValueViewModel> partnerAttributeValueGetAttributeValueWithHttpInfo(Integer partnerId, Integer userId, String logicalName) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'partnerId' is set
        if (partnerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partnerId' when calling partnerAttributeValueGetAttributeValue");
        }
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling partnerAttributeValueGetAttributeValue");
        }
        
        // verify the required parameter 'logicalName' is set
        if (logicalName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'logicalName' when calling partnerAttributeValueGetAttributeValue");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("partnerId", partnerId);
        uriVariables.put("userId", userId);
        String path = UriComponentsBuilder.fromPath("/api/partners/{partnerId}/userAttributeValue/{userId}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "logicalName", logicalName));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfUserAttributeValueViewModel> returnType = new ParameterizedTypeReference<ResultModelOfUserAttributeValueViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Задать значение партнерского атрибута.
     * 
     * <p><b>200</b> - OK
     * @param model Модель для задания значения партнерского атрибута. (required)
     * @param partnerId Идентификатор партнера. (required)
     * @param userId Идентификатор пользователя. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel partnerAttributeValueSetAttributeValue(SetPartnerUserAttributeValueModel model, Integer partnerId, Integer userId) throws RestClientException {
        return partnerAttributeValueSetAttributeValueWithHttpInfo(model, partnerId, userId).getBody();
    }

    /**
     * Задать значение партнерского атрибута.
     * 
     * <p><b>200</b> - OK
     * @param model Модель для задания значения партнерского атрибута. (required)
     * @param partnerId Идентификатор партнера. (required)
     * @param userId Идентификатор пользователя. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> partnerAttributeValueSetAttributeValueWithHttpInfo(SetPartnerUserAttributeValueModel model, Integer partnerId, Integer userId) throws RestClientException {
        Object postBody = model;
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling partnerAttributeValueSetAttributeValue");
        }
        
        // verify the required parameter 'partnerId' is set
        if (partnerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partnerId' when calling partnerAttributeValueSetAttributeValue");
        }
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling partnerAttributeValueSetAttributeValue");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("partnerId", partnerId);
        uriVariables.put("userId", userId);
        String path = UriComponentsBuilder.fromPath("/api/partners/{partnerId}/userAttributeValue/{userId}").buildAndExpand(uriVariables).toUriString();

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
