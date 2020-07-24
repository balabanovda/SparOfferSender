package restclient.api;

import restclient.ApiClient;

import restclient.model.CampaignMetricsViewModel;
import restclient.model.MarketingCampaignViewModel;
import java.time.OffsetDateTime;
import restclient.model.ResultModel;
import restclient.model.ResultModelOfCampaignMetricsViewModel;
import restclient.model.ResultModelOfInt32;
import restclient.model.ResultModelOfListOfBatchOperationsBriefViewModel;
import restclient.model.ResultModelOfMarketingCampaignViewModel;
import restclient.model.ResultModelOfOffersBriefModel;
import restclient.model.ResultModelOfPagedViewModelOfMailingBriefViewModel;
import restclient.model.ResultModelOfPagedViewModelOfMarketingCampaignViewModel;

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
@Component("restclient.api.MarketingCampaignApi")
public class MarketingCampaignApi {
    private ApiClient apiClient;

    public MarketingCampaignApi() {
        this(new ApiClient());
    }

    @Autowired
    public MarketingCampaignApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Добавляет новую кампанию.
     * 
     * <p><b>201</b> - Created
     * @param model View-модель кампании. (required)
     * @return ResultModelOfInt32
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfInt32 marketingCampaignAdd(MarketingCampaignViewModel model) throws RestClientException {
        return marketingCampaignAddWithHttpInfo(model).getBody();
    }

    /**
     * Добавляет новую кампанию.
     * 
     * <p><b>201</b> - Created
     * @param model View-модель кампании. (required)
     * @return ResponseEntity&lt;ResultModelOfInt32&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfInt32> marketingCampaignAddWithHttpInfo(MarketingCampaignViewModel model) throws RestClientException {
        Object postBody = model;
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling marketingCampaignAdd");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/campaigns").build().toUriString();

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
     * Добавляет операцию начисления/списания к кампании.
     * 
     * <p><b>201</b> - Created
     * @param id Идентификатор кампании. (required)
     * @param batchOperationId Идентификатор операции начисления/списания. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel marketingCampaignAddBatchOperations(Integer id, Integer batchOperationId) throws RestClientException {
        return marketingCampaignAddBatchOperationsWithHttpInfo(id, batchOperationId).getBody();
    }

    /**
     * Добавляет операцию начисления/списания к кампании.
     * 
     * <p><b>201</b> - Created
     * @param id Идентификатор кампании. (required)
     * @param batchOperationId Идентификатор операции начисления/списания. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> marketingCampaignAddBatchOperationsWithHttpInfo(Integer id, Integer batchOperationId) throws RestClientException {
        Object postBody = batchOperationId;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling marketingCampaignAddBatchOperations");
        }
        
        // verify the required parameter 'batchOperationId' is set
        if (batchOperationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'batchOperationId' when calling marketingCampaignAddBatchOperations");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/campaigns/{id}/batchOperations").buildAndExpand(uriVariables).toUriString();

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
     * Добавляет рассылку к кампании.
     * 
     * <p><b>201</b> - Created
     * @param id Идентификатор кампании. (required)
     * @param mailingId Идентификатор рассылки. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel marketingCampaignAddMailing(Integer id, Integer mailingId) throws RestClientException {
        return marketingCampaignAddMailingWithHttpInfo(id, mailingId).getBody();
    }

    /**
     * Добавляет рассылку к кампании.
     * 
     * <p><b>201</b> - Created
     * @param id Идентификатор кампании. (required)
     * @param mailingId Идентификатор рассылки. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> marketingCampaignAddMailingWithHttpInfo(Integer id, Integer mailingId) throws RestClientException {
        Object postBody = mailingId;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling marketingCampaignAddMailing");
        }
        
        // verify the required parameter 'mailingId' is set
        if (mailingId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailingId' when calling marketingCampaignAddMailing");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/campaigns/{id}/mailings").buildAndExpand(uriVariables).toUriString();

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
     * Добавить акцию для маркетинговой кампании.
     * 
     * <p><b>201</b> - Created
     * @param id Идентификатор маркетинговой кампании. (required)
     * @param offerId Идентификатор акции. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel marketingCampaignAddOffer(Integer id, Integer offerId) throws RestClientException {
        return marketingCampaignAddOfferWithHttpInfo(id, offerId).getBody();
    }

    /**
     * Добавить акцию для маркетинговой кампании.
     * 
     * <p><b>201</b> - Created
     * @param id Идентификатор маркетинговой кампании. (required)
     * @param offerId Идентификатор акции. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> marketingCampaignAddOfferWithHttpInfo(Integer id, Integer offerId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling marketingCampaignAddOffer");
        }
        
        // verify the required parameter 'offerId' is set
        if (offerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'offerId' when calling marketingCampaignAddOffer");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/campaigns/{id}/offers").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offerId", offerId));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModel> returnType = new ParameterizedTypeReference<ResultModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Добавляет показатели для кампании.
     * 
     * <p><b>201</b> - Created
     * @param id Идентификатор кампании. (required)
     * @param model View-модель показателей кампании. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel marketingCampaignCreateMetrics(Integer id, CampaignMetricsViewModel model) throws RestClientException {
        return marketingCampaignCreateMetricsWithHttpInfo(id, model).getBody();
    }

    /**
     * Добавляет показатели для кампании.
     * 
     * <p><b>201</b> - Created
     * @param id Идентификатор кампании. (required)
     * @param model View-модель показателей кампании. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> marketingCampaignCreateMetricsWithHttpInfo(Integer id, CampaignMetricsViewModel model) throws RestClientException {
        Object postBody = model;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling marketingCampaignCreateMetrics");
        }
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling marketingCampaignCreateMetrics");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/campaigns/{id}/metrics").buildAndExpand(uriVariables).toUriString();

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
     * Отправляет кампанию в архив.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор кампании. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel marketingCampaignDelete(Integer id) throws RestClientException {
        return marketingCampaignDeleteWithHttpInfo(id).getBody();
    }

    /**
     * Отправляет кампанию в архив.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор кампании. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> marketingCampaignDeleteWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling marketingCampaignDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/campaigns/{id}").buildAndExpand(uriVariables).toUriString();

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
     * Удаляет показатели для кампании.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор кампании. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel marketingCampaignDeleteMetrics(Integer id) throws RestClientException {
        return marketingCampaignDeleteMetricsWithHttpInfo(id).getBody();
    }

    /**
     * Удаляет показатели для кампании.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор кампании. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> marketingCampaignDeleteMetricsWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling marketingCampaignDeleteMetrics");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/campaigns/{id}/metrics").buildAndExpand(uriVariables).toUriString();

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
     * Удалить акцию из маркетинговой кампании.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор маркетинговой кампании. (required)
     * @param offerId Идентификатор акции. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel marketingCampaignDeleteOffer(Integer id, Integer offerId) throws RestClientException {
        return marketingCampaignDeleteOfferWithHttpInfo(id, offerId).getBody();
    }

    /**
     * Удалить акцию из маркетинговой кампании.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор маркетинговой кампании. (required)
     * @param offerId Идентификатор акции. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> marketingCampaignDeleteOfferWithHttpInfo(Integer id, Integer offerId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling marketingCampaignDeleteOffer");
        }
        
        // verify the required parameter 'offerId' is set
        if (offerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'offerId' when calling marketingCampaignDeleteOffer");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("offerId", offerId);
        String path = UriComponentsBuilder.fromPath("/api/campaigns/{id}/offers/{offerId}").buildAndExpand(uriVariables).toUriString();

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
     * Редактирует существующую кампанию.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор кампании. (required)
     * @param model View-модель кампании. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel marketingCampaignEdit(Integer id, MarketingCampaignViewModel model) throws RestClientException {
        return marketingCampaignEditWithHttpInfo(id, model).getBody();
    }

    /**
     * Редактирует существующую кампанию.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор кампании. (required)
     * @param model View-модель кампании. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> marketingCampaignEditWithHttpInfo(Integer id, MarketingCampaignViewModel model) throws RestClientException {
        Object postBody = model;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling marketingCampaignEdit");
        }
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling marketingCampaignEdit");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/campaigns/{id}").buildAndExpand(uriVariables).toUriString();

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
     * Редактирует показатели кампании.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор кампании. (required)
     * @param model View-модель показателей кампании. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel marketingCampaignEditMetrics(Integer id, CampaignMetricsViewModel model) throws RestClientException {
        return marketingCampaignEditMetricsWithHttpInfo(id, model).getBody();
    }

    /**
     * Редактирует показатели кампании.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор кампании. (required)
     * @param model View-модель показателей кампании. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> marketingCampaignEditMetricsWithHttpInfo(Integer id, CampaignMetricsViewModel model) throws RestClientException {
        Object postBody = model;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling marketingCampaignEditMetrics");
        }
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling marketingCampaignEditMetrics");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/campaigns/{id}/metrics").buildAndExpand(uriVariables).toUriString();

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
     * Получает доступные для прикрепления операции начисления/списания.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор кампании. (required)
     * @param from Номер первого элемента. (optional, default to 0)
     * @param count Количество элементов. (optional, default to 20)
     * @param name Подстрока системного описания начисления/списания . (optional, default to )
     * @return ResultModelOfListOfBatchOperationsBriefViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfBatchOperationsBriefViewModel marketingCampaignGetAvailableBatchOperations(Integer id, Integer from, Integer count, String name) throws RestClientException {
        return marketingCampaignGetAvailableBatchOperationsWithHttpInfo(id, from, count, name).getBody();
    }

    /**
     * Получает доступные для прикрепления операции начисления/списания.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор кампании. (required)
     * @param from Номер первого элемента. (optional, default to 0)
     * @param count Количество элементов. (optional, default to 20)
     * @param name Подстрока системного описания начисления/списания . (optional, default to )
     * @return ResponseEntity&lt;ResultModelOfListOfBatchOperationsBriefViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfBatchOperationsBriefViewModel> marketingCampaignGetAvailableBatchOperationsWithHttpInfo(Integer id, Integer from, Integer count, String name) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling marketingCampaignGetAvailableBatchOperations");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/campaigns/{id}/availableBatchOperations").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfListOfBatchOperationsBriefViewModel> returnType = new ParameterizedTypeReference<ResultModelOfListOfBatchOperationsBriefViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получает доступные для прикрепления рассылки.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор кампании. (required)
     * @param from Номер первого элемента. (optional, default to 0)
     * @param count Количество элементов. (optional, default to 20)
     * @param name Подстрока названия рассылок. (optional, default to )
     * @return ResultModelOfPagedViewModelOfMailingBriefViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfMailingBriefViewModel marketingCampaignGetAvailableMailings(Integer id, Integer from, Integer count, String name) throws RestClientException {
        return marketingCampaignGetAvailableMailingsWithHttpInfo(id, from, count, name).getBody();
    }

    /**
     * Получает доступные для прикрепления рассылки.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор кампании. (required)
     * @param from Номер первого элемента. (optional, default to 0)
     * @param count Количество элементов. (optional, default to 20)
     * @param name Подстрока названия рассылок. (optional, default to )
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfMailingBriefViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfMailingBriefViewModel> marketingCampaignGetAvailableMailingsWithHttpInfo(Integer id, Integer from, Integer count, String name) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling marketingCampaignGetAvailableMailings");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/campaigns/{id}/availableMailings").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfMailingBriefViewModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfMailingBriefViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param from  (optional, default to 0)
     * @param count  (optional, default to 10)
     * @param partnerIds  (optional)
     * @param name  (optional)
     * @param mode  (optional)
     * @param fromDate  (optional)
     * @param toDate  (optional)
     * @return ResultModelOfPagedViewModelOfMarketingCampaignViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfMarketingCampaignViewModel marketingCampaignGetList(Integer from, Integer count, List<Integer> partnerIds, String name, String mode, OffsetDateTime fromDate, OffsetDateTime toDate) throws RestClientException {
        return marketingCampaignGetListWithHttpInfo(from, count, partnerIds, name, mode, fromDate, toDate).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param from  (optional, default to 0)
     * @param count  (optional, default to 10)
     * @param partnerIds  (optional)
     * @param name  (optional)
     * @param mode  (optional)
     * @param fromDate  (optional)
     * @param toDate  (optional)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfMarketingCampaignViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfMarketingCampaignViewModel> marketingCampaignGetListWithHttpInfo(Integer from, Integer count, List<Integer> partnerIds, String name, String mode, OffsetDateTime fromDate, OffsetDateTime toDate) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/campaigns").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "partnerIds", partnerIds));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "mode", mode));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "fromDate", fromDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "toDate", toDate));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfMarketingCampaignViewModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfMarketingCampaignViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Возвращает показатели кампании.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор кампании. (required)
     * @return ResultModelOfCampaignMetricsViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfCampaignMetricsViewModel marketingCampaignGetMetrics(Integer id) throws RestClientException {
        return marketingCampaignGetMetricsWithHttpInfo(id).getBody();
    }

    /**
     * Возвращает показатели кампании.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор кампании. (required)
     * @return ResponseEntity&lt;ResultModelOfCampaignMetricsViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfCampaignMetricsViewModel> marketingCampaignGetMetricsWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling marketingCampaignGetMetrics");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/campaigns/{id}/metrics").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfCampaignMetricsViewModel> returnType = new ParameterizedTypeReference<ResultModelOfCampaignMetricsViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить список акций для маркетинговой кампании.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор маркетинговой кампании. (required)
     * @param from С какого элемента брать. (required)
     * @param count Сколько элементов брать. (required)
     * @return ResultModelOfOffersBriefModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfOffersBriefModel marketingCampaignGetOffers(Integer id, Integer from, Integer count) throws RestClientException {
        return marketingCampaignGetOffersWithHttpInfo(id, from, count).getBody();
    }

    /**
     * Получить список акций для маркетинговой кампании.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор маркетинговой кампании. (required)
     * @param from С какого элемента брать. (required)
     * @param count Сколько элементов брать. (required)
     * @return ResponseEntity&lt;ResultModelOfOffersBriefModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfOffersBriefModel> marketingCampaignGetOffersWithHttpInfo(Integer id, Integer from, Integer count) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling marketingCampaignGetOffers");
        }
        
        // verify the required parameter 'from' is set
        if (from == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'from' when calling marketingCampaignGetOffers");
        }
        
        // verify the required parameter 'count' is set
        if (count == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'count' when calling marketingCampaignGetOffers");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/campaigns/{id}/offers").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfOffersBriefModel> returnType = new ParameterizedTypeReference<ResultModelOfOffersBriefModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Возвращает кампанию по идентификатору.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор кампании. (required)
     * @return ResultModelOfMarketingCampaignViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfMarketingCampaignViewModel marketingCampaignGetOne(Integer id) throws RestClientException {
        return marketingCampaignGetOneWithHttpInfo(id).getBody();
    }

    /**
     * Возвращает кампанию по идентификатору.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор кампании. (required)
     * @return ResponseEntity&lt;ResultModelOfMarketingCampaignViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfMarketingCampaignViewModel> marketingCampaignGetOneWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling marketingCampaignGetOne");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/campaigns/{id}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfMarketingCampaignViewModel> returnType = new ParameterizedTypeReference<ResultModelOfMarketingCampaignViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Удаляет рассылку из кампании.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор кампании. (required)
     * @param mailingId Идентификатор рассылки. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel marketingCampaignRemoveMailing(Integer id, Integer mailingId) throws RestClientException {
        return marketingCampaignRemoveMailingWithHttpInfo(id, mailingId).getBody();
    }

    /**
     * Удаляет рассылку из кампании.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор кампании. (required)
     * @param mailingId Идентификатор рассылки. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> marketingCampaignRemoveMailingWithHttpInfo(Integer id, Integer mailingId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling marketingCampaignRemoveMailing");
        }
        
        // verify the required parameter 'mailingId' is set
        if (mailingId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailingId' when calling marketingCampaignRemoveMailing");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("mailingId", mailingId);
        String path = UriComponentsBuilder.fromPath("/api/campaigns/{id}/mailings/{mailingId}").buildAndExpand(uriVariables).toUriString();

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
     * Восстанавливает кампанию из архива.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор кампании. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel marketingCampaignRestore(Integer id) throws RestClientException {
        return marketingCampaignRestoreWithHttpInfo(id).getBody();
    }

    /**
     * Восстанавливает кампанию из архива.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор кампании. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> marketingCampaignRestoreWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling marketingCampaignRestore");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/campaigns/{id}/restore").buildAndExpand(uriVariables).toUriString();

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
}
