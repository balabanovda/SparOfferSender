package restclient.api;

import restclient.ApiClient;

import restclient.model.AcceptOfferChangesModel;
import restclient.model.CreateOfferModel;
import restclient.model.EditOfferModel;
import restclient.model.EditOfferModelBase;
import restclient.model.EditOfferPriorityModel;
import restclient.model.OfferPeriodModel;
import java.time.OffsetDateTime;
import restclient.model.RejectOfferChangesModel;
import restclient.model.ResultModel;
import restclient.model.ResultModelOfInt32;
import restclient.model.ResultModelOfListOfCreatorModel;
import restclient.model.ResultModelOfListOfInt32;
import restclient.model.ResultModelOfListOfOfferRuleModel;
import restclient.model.ResultModelOfListOfOfferVersionChangeModel;
import restclient.model.ResultModelOfListOfPartnerModel;
import restclient.model.ResultModelOfOfferBriefModel;
import restclient.model.ResultModelOfOfferModel;
import restclient.model.ResultModelOfOfferPeriodModel;
import restclient.model.ResultModelOfOffersBriefModel;
import restclient.model.ResultModelOfPagedViewModelOfPartnerModel;
import restclient.model.SendOfferToApprovalModel;

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
@Component("restclient.api.OfferApi")
public class OfferApi {
    private ApiClient apiClient;

    public OfferApi() {
        this(new ApiClient());
    }

    @Autowired
    public OfferApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Применить изменения акции.
     * 
     * <p><b>200</b> - OK
     * @param acceptOfferChangesModel Модель применения изменений для акции. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel offerAcceptOfferChanges(AcceptOfferChangesModel acceptOfferChangesModel) throws RestClientException {
        return offerAcceptOfferChangesWithHttpInfo(acceptOfferChangesModel).getBody();
    }

    /**
     * Применить изменения акции.
     * 
     * <p><b>200</b> - OK
     * @param acceptOfferChangesModel Модель применения изменений для акции. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> offerAcceptOfferChangesWithHttpInfo(AcceptOfferChangesModel acceptOfferChangesModel) throws RestClientException {
        Object postBody = acceptOfferChangesModel;
        
        // verify the required parameter 'acceptOfferChangesModel' is set
        if (acceptOfferChangesModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'acceptOfferChangesModel' when calling offerAcceptOfferChanges");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/offers/AcceptChanges").build().toUriString();

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
     * Производит создание акции.
     * 
     * <p><b>201</b> - Created
     * @param createOfferModel Модель для создания акции. (required)
     * @return ResultModelOfInt32
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfInt32 offerCreateOffer(CreateOfferModel createOfferModel) throws RestClientException {
        return offerCreateOfferWithHttpInfo(createOfferModel).getBody();
    }

    /**
     * Производит создание акции.
     * 
     * <p><b>201</b> - Created
     * @param createOfferModel Модель для создания акции. (required)
     * @return ResponseEntity&lt;ResultModelOfInt32&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfInt32> offerCreateOfferWithHttpInfo(CreateOfferModel createOfferModel) throws RestClientException {
        Object postBody = createOfferModel;
        
        // verify the required parameter 'createOfferModel' is set
        if (createOfferModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createOfferModel' when calling offerCreateOffer");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/offers").build().toUriString();

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
     * Удаляет акцию.
     * 
     * <p><b>200</b> - OK
     * @param offerModel Модель акции. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel offerDeleteOffer(EditOfferModelBase offerModel) throws RestClientException {
        return offerDeleteOfferWithHttpInfo(offerModel).getBody();
    }

    /**
     * Удаляет акцию.
     * 
     * <p><b>200</b> - OK
     * @param offerModel Модель акции. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> offerDeleteOfferWithHttpInfo(EditOfferModelBase offerModel) throws RestClientException {
        Object postBody = offerModel;
        
        // verify the required parameter 'offerModel' is set
        if (offerModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'offerModel' when calling offerDeleteOffer");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/offers/DeleteOffer").build().toUriString();

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
     * Производит редактирование информации об акции.
     * 
     * <p><b>200</b> - OK
     * @param offerModel Модель редактирования акции. (required)
     * @return ResultModelOfInt32
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfInt32 offerEditOffer(EditOfferModel offerModel) throws RestClientException {
        return offerEditOfferWithHttpInfo(offerModel).getBody();
    }

    /**
     * Производит редактирование информации об акции.
     * 
     * <p><b>200</b> - OK
     * @param offerModel Модель редактирования акции. (required)
     * @return ResponseEntity&lt;ResultModelOfInt32&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfInt32> offerEditOfferWithHttpInfo(EditOfferModel offerModel) throws RestClientException {
        Object postBody = offerModel;
        
        // verify the required parameter 'offerModel' is set
        if (offerModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'offerModel' when calling offerEditOffer");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/offers/EditOffer").build().toUriString();

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
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Устанавливает период действия акции.
     * 
     * <p><b>200</b> - OK
     * @param offerId Идентификатор акции. (required)
     * @param viewModel Модель периода действия акции. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel offerEditOfferPeriod(Integer offerId, OfferPeriodModel viewModel) throws RestClientException {
        return offerEditOfferPeriodWithHttpInfo(offerId, viewModel).getBody();
    }

    /**
     * Устанавливает период действия акции.
     * 
     * <p><b>200</b> - OK
     * @param offerId Идентификатор акции. (required)
     * @param viewModel Модель периода действия акции. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> offerEditOfferPeriodWithHttpInfo(Integer offerId, OfferPeriodModel viewModel) throws RestClientException {
        Object postBody = viewModel;
        
        // verify the required parameter 'offerId' is set
        if (offerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'offerId' when calling offerEditOfferPeriod");
        }
        
        // verify the required parameter 'viewModel' is set
        if (viewModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'viewModel' when calling offerEditOfferPeriod");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("offerId", offerId);
        String path = UriComponentsBuilder.fromPath("/api/offers/{offerId}/period").buildAndExpand(uriVariables).toUriString();

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
     * Устанавливает приоритет акции.
     * 
     * <p><b>200</b> - OK
     * @param offerId Идентификатор акции. (required)
     * @param viewModel Модель приоритета акции. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel offerEditOfferPriority(Integer offerId, EditOfferPriorityModel viewModel) throws RestClientException {
        return offerEditOfferPriorityWithHttpInfo(offerId, viewModel).getBody();
    }

    /**
     * Устанавливает приоритет акции.
     * 
     * <p><b>200</b> - OK
     * @param offerId Идентификатор акции. (required)
     * @param viewModel Модель приоритета акции. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> offerEditOfferPriorityWithHttpInfo(Integer offerId, EditOfferPriorityModel viewModel) throws RestClientException {
        Object postBody = viewModel;
        
        // verify the required parameter 'offerId' is set
        if (offerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'offerId' when calling offerEditOfferPriority");
        }
        
        // verify the required parameter 'viewModel' is set
        if (viewModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'viewModel' when calling offerEditOfferPriority");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("offerId", offerId);
        String path = UriComponentsBuilder.fromPath("/api/offers/{offerId}/priority").buildAndExpand(uriVariables).toUriString();

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
     * Получает список доступных создателей акций.
     * 
     * <p><b>200</b> - OK
     * @return ResultModelOfListOfCreatorModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfCreatorModel offerGetAvailableCreators() throws RestClientException {
        return offerGetAvailableCreatorsWithHttpInfo().getBody();
    }

    /**
     * Получает список доступных создателей акций.
     * 
     * <p><b>200</b> - OK
     * @return ResponseEntity&lt;ResultModelOfListOfCreatorModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfCreatorModel> offerGetAvailableCreatorsWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/offers/AvailableCreators").build().toUriString();

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

        ParameterizedTypeReference<ResultModelOfListOfCreatorModel> returnType = new ParameterizedTypeReference<ResultModelOfListOfCreatorModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получает список доступных партнеров.
     * 
     * <p><b>200</b> - OK
     * @param viewMode Режим акции. (required)
     * @param from The from. (optional, default to 0)
     * @param count The count. (optional, default to 2147483647)
     * @param name The name. (optional, default to )
     * @return ResultModelOfPagedViewModelOfPartnerModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfPartnerModel offerGetAvailablePartners(String viewMode, Integer from, Integer count, String name) throws RestClientException {
        return offerGetAvailablePartnersWithHttpInfo(viewMode, from, count, name).getBody();
    }

    /**
     * Получает список доступных партнеров.
     * 
     * <p><b>200</b> - OK
     * @param viewMode Режим акции. (required)
     * @param from The from. (optional, default to 0)
     * @param count The count. (optional, default to 2147483647)
     * @param name The name. (optional, default to )
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfPartnerModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfPartnerModel> offerGetAvailablePartnersWithHttpInfo(String viewMode, Integer from, Integer count, String name) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'viewMode' is set
        if (viewMode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'viewMode' when calling offerGetAvailablePartners");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/offers/AvailablePartners").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "viewMode", viewMode));
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

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfPartnerModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfPartnerModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить список изменений в акции по сравнению с предыдущей версией.
     * 
     * <p><b>200</b> - OK
     * @param getOfferVersionChangesModelOfferVersionId Id версии акции. (optional)
     * @param getOfferVersionChangesModelMode Режим получения изменений. (optional)
     * @return ResultModelOfListOfOfferVersionChangeModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfOfferVersionChangeModel offerGetChanges(Integer getOfferVersionChangesModelOfferVersionId, String getOfferVersionChangesModelMode) throws RestClientException {
        return offerGetChangesWithHttpInfo(getOfferVersionChangesModelOfferVersionId, getOfferVersionChangesModelMode).getBody();
    }

    /**
     * Получить список изменений в акции по сравнению с предыдущей версией.
     * 
     * <p><b>200</b> - OK
     * @param getOfferVersionChangesModelOfferVersionId Id версии акции. (optional)
     * @param getOfferVersionChangesModelMode Режим получения изменений. (optional)
     * @return ResponseEntity&lt;ResultModelOfListOfOfferVersionChangeModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfOfferVersionChangeModel> offerGetChangesWithHttpInfo(Integer getOfferVersionChangesModelOfferVersionId, String getOfferVersionChangesModelMode) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/offers/GetChanges").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "getOfferVersionChangesModel.offerVersionId", getOfferVersionChangesModelOfferVersionId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "getOfferVersionChangesModel.mode", getOfferVersionChangesModelMode));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfListOfOfferVersionChangeModel> returnType = new ParameterizedTypeReference<ResultModelOfListOfOfferVersionChangeModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить модель акции.
     * 
     * <p><b>200</b> - OK
     * @param offerId Идентификатор акции. (required)
     * @param version Тип версии. (optional, default to Draft)
     * @return ResultModelOfOfferModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfOfferModel offerGetOffer(Integer offerId, String version) throws RestClientException {
        return offerGetOfferWithHttpInfo(offerId, version).getBody();
    }

    /**
     * Получить модель акции.
     * 
     * <p><b>200</b> - OK
     * @param offerId Идентификатор акции. (required)
     * @param version Тип версии. (optional, default to Draft)
     * @return ResponseEntity&lt;ResultModelOfOfferModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfOfferModel> offerGetOfferWithHttpInfo(Integer offerId, String version) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'offerId' is set
        if (offerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'offerId' when calling offerGetOffer");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("offerId", offerId);
        String path = UriComponentsBuilder.fromPath("/api/offers/{offerId}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "version", version));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfOfferModel> returnType = new ParameterizedTypeReference<ResultModelOfOfferModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получает модель для акции.
     * 
     * <p><b>200</b> - OK
     * @param offerId Id акции. (required)
     * @return ResultModelOfOfferBriefModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfOfferBriefModel offerGetOfferInfo(Integer offerId) throws RestClientException {
        return offerGetOfferInfoWithHttpInfo(offerId).getBody();
    }

    /**
     * Получает модель для акции.
     * 
     * <p><b>200</b> - OK
     * @param offerId Id акции. (required)
     * @return ResponseEntity&lt;ResultModelOfOfferBriefModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfOfferBriefModel> offerGetOfferInfoWithHttpInfo(Integer offerId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'offerId' is set
        if (offerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'offerId' when calling offerGetOfferInfo");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/offers/OfferInfo").build().toUriString();

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

        ParameterizedTypeReference<ResultModelOfOfferBriefModel> returnType = new ParameterizedTypeReference<ResultModelOfOfferBriefModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получает список партнеров акции.
     * 
     * <p><b>200</b> - OK
     * @param offerId Id акции. (required)
     * @return ResultModelOfListOfPartnerModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfPartnerModel offerGetOfferPartners(Integer offerId) throws RestClientException {
        return offerGetOfferPartnersWithHttpInfo(offerId).getBody();
    }

    /**
     * Получает список партнеров акции.
     * 
     * <p><b>200</b> - OK
     * @param offerId Id акции. (required)
     * @return ResponseEntity&lt;ResultModelOfListOfPartnerModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfPartnerModel> offerGetOfferPartnersWithHttpInfo(Integer offerId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'offerId' is set
        if (offerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'offerId' when calling offerGetOfferPartners");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/offers/OfferPartners").build().toUriString();

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

        ParameterizedTypeReference<ResultModelOfListOfPartnerModel> returnType = new ParameterizedTypeReference<ResultModelOfListOfPartnerModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получает вермя действия акции.
     * 
     * <p><b>200</b> - OK
     * @param offerId Идентификатор акции. (required)
     * @param version Тип версии. (optional, default to Draft)
     * @return ResultModelOfOfferPeriodModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfOfferPeriodModel offerGetOfferPeriod(Integer offerId, String version) throws RestClientException {
        return offerGetOfferPeriodWithHttpInfo(offerId, version).getBody();
    }

    /**
     * Получает вермя действия акции.
     * 
     * <p><b>200</b> - OK
     * @param offerId Идентификатор акции. (required)
     * @param version Тип версии. (optional, default to Draft)
     * @return ResponseEntity&lt;ResultModelOfOfferPeriodModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfOfferPeriodModel> offerGetOfferPeriodWithHttpInfo(Integer offerId, String version) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'offerId' is set
        if (offerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'offerId' when calling offerGetOfferPeriod");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("offerId", offerId);
        String path = UriComponentsBuilder.fromPath("/api/offers/{offerId}/period").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "version", version));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfOfferPeriodModel> returnType = new ParameterizedTypeReference<ResultModelOfOfferPeriodModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить приоритет акции.
     * 
     * <p><b>200</b> - OK
     * @param offerId Идентификатор акции. (required)
     * @param version Тип версии. (optional, default to Draft)
     * @return ResultModelOfInt32
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfInt32 offerGetOfferPriority(Integer offerId, String version) throws RestClientException {
        return offerGetOfferPriorityWithHttpInfo(offerId, version).getBody();
    }

    /**
     * Получить приоритет акции.
     * 
     * <p><b>200</b> - OK
     * @param offerId Идентификатор акции. (required)
     * @param version Тип версии. (optional, default to Draft)
     * @return ResponseEntity&lt;ResultModelOfInt32&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfInt32> offerGetOfferPriorityWithHttpInfo(Integer offerId, String version) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'offerId' is set
        if (offerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'offerId' when calling offerGetOfferPriority");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("offerId", offerId);
        String path = UriComponentsBuilder.fromPath("/api/offers/{offerId}/priority").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "version", version));

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
     * Получает набор правил для акции.
     * 
     * <p><b>200</b> - OK
     * @param offerId Id акции. (required)
     * @return ResultModelOfListOfOfferRuleModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfOfferRuleModel offerGetOfferRules(Integer offerId) throws RestClientException {
        return offerGetOfferRulesWithHttpInfo(offerId).getBody();
    }

    /**
     * Получает набор правил для акции.
     * 
     * <p><b>200</b> - OK
     * @param offerId Id акции. (required)
     * @return ResponseEntity&lt;ResultModelOfListOfOfferRuleModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfOfferRuleModel> offerGetOfferRulesWithHttpInfo(Integer offerId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'offerId' is set
        if (offerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'offerId' when calling offerGetOfferRules");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/offers/OfferRules").build().toUriString();

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

        ParameterizedTypeReference<ResultModelOfListOfOfferRuleModel> returnType = new ParameterizedTypeReference<ResultModelOfListOfOfferRuleModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить список акций.
     * 
     * <p><b>200</b> - OK
     * @param fromDate Дата С. (optional)
     * @param toDate Дата По. (optional)
     * @param from С какого элемента брать. (optional)
     * @param count Сколько элементов брать. (optional)
     * @param name Подстрока для поиска по имени. (optional)
     * @param merchantIds Список id магазинов для фильтрации. (optional)
     * @param creatorIds Список id создателей акций для фильтрации. (optional)
     * @param viewStates Список состояний акции для фильтрации. (optional)
     * @param sortColumn Колонка для сортировки. (optional)
     * @param direction Направление сортировки. (optional)
     * @param states Список состояний акции для фильтрации. (optional)
     * @param partnerIds Список Id партнеров для фильтрации. (optional)
     * @param categoryIds Список Id категорий акций. (optional)
     * @param priorityLowerBound Нижняя граница приоритета. (optional)
     * @param priorityUpperBound Верхняя граница приоритета. (optional)
     * @param marketingCampaignId Идентификатор маркетинговой кампании. (optional)
     * @param includeMarketingCampaignId Значение, указывающее, включать или исключать акции с заданной МК. (optional)
     * @param loyaltyProgramIds Список Id программ лояльности для фильтрации. (optional)
     * @param excludeMarketingCampaign Исключает все акции для которых установлена компания. (optional)
     * @return ResultModelOfOffersBriefModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfOffersBriefModel offerGetOffers(OffsetDateTime fromDate, OffsetDateTime toDate, Integer from, Integer count, String name, String merchantIds, String creatorIds, List<String> viewStates, String sortColumn, Boolean direction, List<String> states, String partnerIds, String categoryIds, Integer priorityLowerBound, Integer priorityUpperBound, Integer marketingCampaignId, Boolean includeMarketingCampaignId, String loyaltyProgramIds, Boolean excludeMarketingCampaign) throws RestClientException {
        return offerGetOffersWithHttpInfo(fromDate, toDate, from, count, name, merchantIds, creatorIds, viewStates, sortColumn, direction, states, partnerIds, categoryIds, priorityLowerBound, priorityUpperBound, marketingCampaignId, includeMarketingCampaignId, loyaltyProgramIds, excludeMarketingCampaign).getBody();
    }

    /**
     * Получить список акций.
     * 
     * <p><b>200</b> - OK
     * @param fromDate Дата С. (optional)
     * @param toDate Дата По. (optional)
     * @param from С какого элемента брать. (optional)
     * @param count Сколько элементов брать. (optional)
     * @param name Подстрока для поиска по имени. (optional)
     * @param merchantIds Список id магазинов для фильтрации. (optional)
     * @param creatorIds Список id создателей акций для фильтрации. (optional)
     * @param viewStates Список состояний акции для фильтрации. (optional)
     * @param sortColumn Колонка для сортировки. (optional)
     * @param direction Направление сортировки. (optional)
     * @param states Список состояний акции для фильтрации. (optional)
     * @param partnerIds Список Id партнеров для фильтрации. (optional)
     * @param categoryIds Список Id категорий акций. (optional)
     * @param priorityLowerBound Нижняя граница приоритета. (optional)
     * @param priorityUpperBound Верхняя граница приоритета. (optional)
     * @param marketingCampaignId Идентификатор маркетинговой кампании. (optional)
     * @param includeMarketingCampaignId Значение, указывающее, включать или исключать акции с заданной МК. (optional)
     * @param loyaltyProgramIds Список Id программ лояльности для фильтрации. (optional)
     * @param excludeMarketingCampaign Исключает все акции для которых установлена компания. (optional)
     * @return ResponseEntity&lt;ResultModelOfOffersBriefModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfOffersBriefModel> offerGetOffersWithHttpInfo(OffsetDateTime fromDate, OffsetDateTime toDate, Integer from, Integer count, String name, String merchantIds, String creatorIds, List<String> viewStates, String sortColumn, Boolean direction, List<String> states, String partnerIds, String categoryIds, Integer priorityLowerBound, Integer priorityUpperBound, Integer marketingCampaignId, Boolean includeMarketingCampaignId, String loyaltyProgramIds, Boolean excludeMarketingCampaign) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/offers").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "fromDate", fromDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "toDate", toDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "merchantIds", merchantIds));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "creatorIds", creatorIds));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "viewStates", viewStates));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sortColumn", sortColumn));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "direction", direction));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "states", states));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "partnerIds", partnerIds));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "categoryIds", categoryIds));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "priority.lowerBound", priorityLowerBound));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "priority.upperBound", priorityUpperBound));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "marketingCampaignId", marketingCampaignId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "includeMarketingCampaignId", includeMarketingCampaignId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "loyaltyProgramIds", loyaltyProgramIds));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "excludeMarketingCampaign", excludeMarketingCampaign));

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
     * Получить актуальные шаги округления.
     * 
     * <p><b>200</b> - OK
     * @return ResultModelOfListOfInt32
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfInt32 offerGetRoundingSteps() throws RestClientException {
        return offerGetRoundingStepsWithHttpInfo().getBody();
    }

    /**
     * Получить актуальные шаги округления.
     * 
     * <p><b>200</b> - OK
     * @return ResponseEntity&lt;ResultModelOfListOfInt32&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfInt32> offerGetRoundingStepsWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/offers/RoundingSteps").build().toUriString();

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

        ParameterizedTypeReference<ResultModelOfListOfInt32> returnType = new ParameterizedTypeReference<ResultModelOfListOfInt32>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Отклонение принятых ранее изменений акции.
     * 
     * <p><b>200</b> - OK
     * @param rejectOfferChangesModel Модель отклонения изменений. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel offerRejectChanges(RejectOfferChangesModel rejectOfferChangesModel) throws RestClientException {
        return offerRejectChangesWithHttpInfo(rejectOfferChangesModel).getBody();
    }

    /**
     * Отклонение принятых ранее изменений акции.
     * 
     * <p><b>200</b> - OK
     * @param rejectOfferChangesModel Модель отклонения изменений. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> offerRejectChangesWithHttpInfo(RejectOfferChangesModel rejectOfferChangesModel) throws RestClientException {
        Object postBody = rejectOfferChangesModel;
        
        // verify the required parameter 'rejectOfferChangesModel' is set
        if (rejectOfferChangesModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'rejectOfferChangesModel' when calling offerRejectChanges");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/offers/RejectChanges").build().toUriString();

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
     * Удаление черновика акции.
     * 
     * <p><b>200</b> - OK
     * @param offerModel Модель акции. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel offerResetChanges(EditOfferModelBase offerModel) throws RestClientException {
        return offerResetChangesWithHttpInfo(offerModel).getBody();
    }

    /**
     * Удаление черновика акции.
     * 
     * <p><b>200</b> - OK
     * @param offerModel Модель акции. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> offerResetChangesWithHttpInfo(EditOfferModelBase offerModel) throws RestClientException {
        Object postBody = offerModel;
        
        // verify the required parameter 'offerModel' is set
        if (offerModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'offerModel' when calling offerResetChanges");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/offers/ResetChanges").build().toUriString();

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
     * Востановить акцию.
     * 
     * <p><b>200</b> - OK
     * @param offerModel Модель акции. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel offerRestoreOffer(EditOfferModelBase offerModel) throws RestClientException {
        return offerRestoreOfferWithHttpInfo(offerModel).getBody();
    }

    /**
     * Востановить акцию.
     * 
     * <p><b>200</b> - OK
     * @param offerModel Модель акции. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> offerRestoreOfferWithHttpInfo(EditOfferModelBase offerModel) throws RestClientException {
        Object postBody = offerModel;
        
        // verify the required parameter 'offerModel' is set
        if (offerModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'offerModel' when calling offerRestoreOffer");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/offers/RestoreOffer").build().toUriString();

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
     * Сохраняет изменения в акции.
     * 
     * <p><b>200</b> - OK
     * @param modelBase Модель с Id акции. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel offerSaveChanges(EditOfferModelBase modelBase) throws RestClientException {
        return offerSaveChangesWithHttpInfo(modelBase).getBody();
    }

    /**
     * Сохраняет изменения в акции.
     * 
     * <p><b>200</b> - OK
     * @param modelBase Модель с Id акции. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> offerSaveChangesWithHttpInfo(EditOfferModelBase modelBase) throws RestClientException {
        Object postBody = modelBase;
        
        // verify the required parameter 'modelBase' is set
        if (modelBase == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'modelBase' when calling offerSaveChanges");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/offers/SaveChanges").build().toUriString();

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
     * Отправить акцию на согласование.
     * 
     * <p><b>200</b> - OK
     * @param sendOfferToApprovalModel Модель отправки акции на согласование. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel offerSendToApproval(SendOfferToApprovalModel sendOfferToApprovalModel) throws RestClientException {
        return offerSendToApprovalWithHttpInfo(sendOfferToApprovalModel).getBody();
    }

    /**
     * Отправить акцию на согласование.
     * 
     * <p><b>200</b> - OK
     * @param sendOfferToApprovalModel Модель отправки акции на согласование. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> offerSendToApprovalWithHttpInfo(SendOfferToApprovalModel sendOfferToApprovalModel) throws RestClientException {
        Object postBody = sendOfferToApprovalModel;
        
        // verify the required parameter 'sendOfferToApprovalModel' is set
        if (sendOfferToApprovalModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sendOfferToApprovalModel' when calling offerSendToApproval");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/offers/SendToApproval").build().toUriString();

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
     * Запускает акцию.
     * 
     * <p><b>200</b> - OK
     * @param editOfferModelBase Модель акции. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel offerStartOffer(EditOfferModelBase editOfferModelBase) throws RestClientException {
        return offerStartOfferWithHttpInfo(editOfferModelBase).getBody();
    }

    /**
     * Запускает акцию.
     * 
     * <p><b>200</b> - OK
     * @param editOfferModelBase Модель акции. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> offerStartOfferWithHttpInfo(EditOfferModelBase editOfferModelBase) throws RestClientException {
        Object postBody = editOfferModelBase;
        
        // verify the required parameter 'editOfferModelBase' is set
        if (editOfferModelBase == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'editOfferModelBase' when calling offerStartOffer");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/offers/StartOffer").build().toUriString();

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
     * Остановливает акцию.
     * 
     * <p><b>200</b> - OK
     * @param editOfferModelBase Модель акции. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel offerStopOffer(EditOfferModelBase editOfferModelBase) throws RestClientException {
        return offerStopOfferWithHttpInfo(editOfferModelBase).getBody();
    }

    /**
     * Остановливает акцию.
     * 
     * <p><b>200</b> - OK
     * @param editOfferModelBase Модель акции. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> offerStopOfferWithHttpInfo(EditOfferModelBase editOfferModelBase) throws RestClientException {
        Object postBody = editOfferModelBase;
        
        // verify the required parameter 'editOfferModelBase' is set
        if (editOfferModelBase == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'editOfferModelBase' when calling offerStopOffer");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/offers/StopOffer").build().toUriString();

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
     * Редактирует маркетинговую кампанию.
     * 
     * <p><b>200</b> - OK
     * @param offerId Id акции. (required)
     * @param marketingCampaignId Id маркетинговой кампании. (optional)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel offerUpdateMarketingCampaign(Integer offerId, Integer marketingCampaignId) throws RestClientException {
        return offerUpdateMarketingCampaignWithHttpInfo(offerId, marketingCampaignId).getBody();
    }

    /**
     * Редактирует маркетинговую кампанию.
     * 
     * <p><b>200</b> - OK
     * @param offerId Id акции. (required)
     * @param marketingCampaignId Id маркетинговой кампании. (optional)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> offerUpdateMarketingCampaignWithHttpInfo(Integer offerId, Integer marketingCampaignId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'offerId' is set
        if (offerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'offerId' when calling offerUpdateMarketingCampaign");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("offerId", offerId);
        String path = UriComponentsBuilder.fromPath("/api/offers/{offerId}/marketingCampaign").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "marketingCampaignId", marketingCampaignId));

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
     * Редактирует категорию акции.
     * 
     * <p><b>200</b> - OK
     * @param offerId Id акции. (required)
     * @param offerCategoryId Id новой категории акции. (optional)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel offerUpdateOfferCategory(Integer offerId, Integer offerCategoryId) throws RestClientException {
        return offerUpdateOfferCategoryWithHttpInfo(offerId, offerCategoryId).getBody();
    }

    /**
     * Редактирует категорию акции.
     * 
     * <p><b>200</b> - OK
     * @param offerId Id акции. (required)
     * @param offerCategoryId Id новой категории акции. (optional)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> offerUpdateOfferCategoryWithHttpInfo(Integer offerId, Integer offerCategoryId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'offerId' is set
        if (offerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'offerId' when calling offerUpdateOfferCategory");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("offerId", offerId);
        String path = UriComponentsBuilder.fromPath("/api/offers/{offerId}/categories").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offerCategoryId", offerCategoryId));

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
