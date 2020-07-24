package restclient.api;

import restclient.ApiClient;

import restclient.model.CreateAndEditDetailModel;
import restclient.model.ResultModel;
import restclient.model.ResultModelOfListOfOfferDetailModel;
import restclient.model.ResultModelOfOfferDetailModel;

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
@Component("restclient.api.CommunicationOfferDetailApi")
public class CommunicationOfferDetailApi {
    private ApiClient apiClient;

    public CommunicationOfferDetailApi() {
        this(new ApiClient());
    }

    @Autowired
    public CommunicationOfferDetailApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Создает детали для акции.
     * 
     * <p><b>201</b> - Created
     * @param offerId Идентификатор акции. (required)
     * @param model Модель деталей. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel communicationOfferDetailCreateOfferDetail(Integer offerId, CreateAndEditDetailModel model) throws RestClientException {
        return communicationOfferDetailCreateOfferDetailWithHttpInfo(offerId, model).getBody();
    }

    /**
     * Создает детали для акции.
     * 
     * <p><b>201</b> - Created
     * @param offerId Идентификатор акции. (required)
     * @param model Модель деталей. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> communicationOfferDetailCreateOfferDetailWithHttpInfo(Integer offerId, CreateAndEditDetailModel model) throws RestClientException {
        Object postBody = model;
        
        // verify the required parameter 'offerId' is set
        if (offerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'offerId' when calling communicationOfferDetailCreateOfferDetail");
        }
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling communicationOfferDetailCreateOfferDetail");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("offerId", offerId);
        String path = UriComponentsBuilder.fromPath("/api/communicationOffers/{offerId}/details").buildAndExpand(uriVariables).toUriString();

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
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Удаляет детали для акции.
     * 
     * <p><b>200</b> - OK
     * @param offerId Идентификатор акции. (required)
     * @param id Идентификатор. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel communicationOfferDetailDeleteOfferDetail(Integer offerId, String id) throws RestClientException {
        return communicationOfferDetailDeleteOfferDetailWithHttpInfo(offerId, id).getBody();
    }

    /**
     * Удаляет детали для акции.
     * 
     * <p><b>200</b> - OK
     * @param offerId Идентификатор акции. (required)
     * @param id Идентификатор. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> communicationOfferDetailDeleteOfferDetailWithHttpInfo(Integer offerId, String id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'offerId' is set
        if (offerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'offerId' when calling communicationOfferDetailDeleteOfferDetail");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling communicationOfferDetailDeleteOfferDetail");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("offerId", offerId);
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/communicationOffers/{offerId}/details/{id}").buildAndExpand(uriVariables).toUriString();

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
     * Редактирование деталей для акции.
     * 
     * <p><b>200</b> - OK
     * @param offerId Идентификатор акции. (required)
     * @param model Модель деталей. (required)
     * @param id Идентификатор. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel communicationOfferDetailEditOfferDetail(Integer offerId, CreateAndEditDetailModel model, String id) throws RestClientException {
        return communicationOfferDetailEditOfferDetailWithHttpInfo(offerId, model, id).getBody();
    }

    /**
     * Редактирование деталей для акции.
     * 
     * <p><b>200</b> - OK
     * @param offerId Идентификатор акции. (required)
     * @param model Модель деталей. (required)
     * @param id Идентификатор. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> communicationOfferDetailEditOfferDetailWithHttpInfo(Integer offerId, CreateAndEditDetailModel model, String id) throws RestClientException {
        Object postBody = model;
        
        // verify the required parameter 'offerId' is set
        if (offerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'offerId' when calling communicationOfferDetailEditOfferDetail");
        }
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling communicationOfferDetailEditOfferDetail");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling communicationOfferDetailEditOfferDetail");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("offerId", offerId);
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/communicationOffers/{offerId}/details/{id}").buildAndExpand(uriVariables).toUriString();

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
     * Получение описания детали для акции.
     * 
     * <p><b>200</b> - OK
     * @param offerId Идентификатор акции. (required)
     * @param id Идентификатор деталей. (required)
     * @return ResultModelOfOfferDetailModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfOfferDetailModel communicationOfferDetailGetOfferDetail(Integer offerId, String id) throws RestClientException {
        return communicationOfferDetailGetOfferDetailWithHttpInfo(offerId, id).getBody();
    }

    /**
     * Получение описания детали для акции.
     * 
     * <p><b>200</b> - OK
     * @param offerId Идентификатор акции. (required)
     * @param id Идентификатор деталей. (required)
     * @return ResponseEntity&lt;ResultModelOfOfferDetailModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfOfferDetailModel> communicationOfferDetailGetOfferDetailWithHttpInfo(Integer offerId, String id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'offerId' is set
        if (offerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'offerId' when calling communicationOfferDetailGetOfferDetail");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling communicationOfferDetailGetOfferDetail");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("offerId", offerId);
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/communicationOffers/{offerId}/details/{id}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfOfferDetailModel> returnType = new ParameterizedTypeReference<ResultModelOfOfferDetailModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Возвращает список деталей для акций.
     * 
     * <p><b>200</b> - OK
     * @param offerId Идентификатор акции. (required)
     * @return ResultModelOfListOfOfferDetailModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfOfferDetailModel communicationOfferDetailGetOfferDetails(Integer offerId) throws RestClientException {
        return communicationOfferDetailGetOfferDetailsWithHttpInfo(offerId).getBody();
    }

    /**
     * Возвращает список деталей для акций.
     * 
     * <p><b>200</b> - OK
     * @param offerId Идентификатор акции. (required)
     * @return ResponseEntity&lt;ResultModelOfListOfOfferDetailModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfOfferDetailModel> communicationOfferDetailGetOfferDetailsWithHttpInfo(Integer offerId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'offerId' is set
        if (offerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'offerId' when calling communicationOfferDetailGetOfferDetails");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("offerId", offerId);
        String path = UriComponentsBuilder.fromPath("/api/communicationOffers/{offerId}/details").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfListOfOfferDetailModel> returnType = new ParameterizedTypeReference<ResultModelOfListOfOfferDetailModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
