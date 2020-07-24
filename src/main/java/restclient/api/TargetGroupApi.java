package restclient.api;

import restclient.ApiClient;

import java.time.OffsetDateTime;
import restclient.model.ResultModel;
import restclient.model.ResultModelOfCalculationModel;
import restclient.model.ResultModelOfInt32;
import restclient.model.ResultModelOfListOfCreatorModel;
import restclient.model.ResultModelOfPagedViewModelOfTargetGroupViewModel;
import restclient.model.ResultModelOfTargetGroupViewModel;
import restclient.model.TargetGroupModel;

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
@Component("restclient.api.TargetGroupApi")
public class TargetGroupApi {
    private ApiClient apiClient;

    public TargetGroupApi() {
        this(new ApiClient());
    }

    @Autowired
    public TargetGroupApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Архивировать целевую аудиторию.
     * 
     * <p><b>200</b> - OK
     * @param id Id целевой аудитории. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel targetGroupArchiveTargetGroup(Integer id) throws RestClientException {
        return targetGroupArchiveTargetGroupWithHttpInfo(id).getBody();
    }

    /**
     * Архивировать целевую аудиторию.
     * 
     * <p><b>200</b> - OK
     * @param id Id целевой аудитории. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> targetGroupArchiveTargetGroupWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling targetGroupArchiveTargetGroup");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/targetGroups/{id}").buildAndExpand(uriVariables).toUriString();

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
     * Запуск расчета целевой аудитории.
     * 
     * <p><b>200</b> - OK
     * @param id Id целевой аудитории. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel targetGroupCalculateTargetGroup(Integer id) throws RestClientException {
        return targetGroupCalculateTargetGroupWithHttpInfo(id).getBody();
    }

    /**
     * Запуск расчета целевой аудитории.
     * 
     * <p><b>200</b> - OK
     * @param id Id целевой аудитории. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> targetGroupCalculateTargetGroupWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling targetGroupCalculateTargetGroup");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/targetGroups/{id}/calculate").buildAndExpand(uriVariables).toUriString();

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
    /**
     * Создание целевой аудитории.
     * 
     * <p><b>201</b> - Created
     * @param model Модель целевой аудитории. (required)
     * @return ResultModelOfInt32
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfInt32 targetGroupCreateTargetGroup(TargetGroupModel model) throws RestClientException {
        return targetGroupCreateTargetGroupWithHttpInfo(model).getBody();
    }

    /**
     * Создание целевой аудитории.
     * 
     * <p><b>201</b> - Created
     * @param model Модель целевой аудитории. (required)
     * @return ResponseEntity&lt;ResultModelOfInt32&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfInt32> targetGroupCreateTargetGroupWithHttpInfo(TargetGroupModel model) throws RestClientException {
        Object postBody = model;
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling targetGroupCreateTargetGroup");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/targetGroups").build().toUriString();

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
     * Получает список доступных создателей целевых аудиторий.
     * 
     * <p><b>200</b> - OK
     * @return ResultModelOfListOfCreatorModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfCreatorModel targetGroupGetAvailableCreators() throws RestClientException {
        return targetGroupGetAvailableCreatorsWithHttpInfo().getBody();
    }

    /**
     * Получает список доступных создателей целевых аудиторий.
     * 
     * <p><b>200</b> - OK
     * @return ResponseEntity&lt;ResultModelOfListOfCreatorModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfCreatorModel> targetGroupGetAvailableCreatorsWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/targetGroups/AvailableCreators").build().toUriString();

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
     * Получить целевую аудиторию по Id.
     * 
     * <p><b>200</b> - OK
     * @param id Id целевой аудитории. (required)
     * @return ResultModelOfTargetGroupViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfTargetGroupViewModel targetGroupGetTargetGroup(Integer id) throws RestClientException {
        return targetGroupGetTargetGroupWithHttpInfo(id).getBody();
    }

    /**
     * Получить целевую аудиторию по Id.
     * 
     * <p><b>200</b> - OK
     * @param id Id целевой аудитории. (required)
     * @return ResponseEntity&lt;ResultModelOfTargetGroupViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfTargetGroupViewModel> targetGroupGetTargetGroupWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling targetGroupGetTargetGroup");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/targetGroups/{id}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfTargetGroupViewModel> returnType = new ParameterizedTypeReference<ResultModelOfTargetGroupViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получение информации о последнем расчете целевой аудитории.
     * 
     * <p><b>200</b> - OK
     * @param id Id целевой аудитории. (required)
     * @return ResultModelOfCalculationModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfCalculationModel targetGroupGetTargetGroupCalculationInfo(Integer id) throws RestClientException {
        return targetGroupGetTargetGroupCalculationInfoWithHttpInfo(id).getBody();
    }

    /**
     * Получение информации о последнем расчете целевой аудитории.
     * 
     * <p><b>200</b> - OK
     * @param id Id целевой аудитории. (required)
     * @return ResponseEntity&lt;ResultModelOfCalculationModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfCalculationModel> targetGroupGetTargetGroupCalculationInfoWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling targetGroupGetTargetGroupCalculationInfo");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/targetGroups/{id}/calculationInfo").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfCalculationModel> returnType = new ParameterizedTypeReference<ResultModelOfCalculationModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить все целевые аудитории.
     * 
     * <p><b>200</b> - OK
     * @param from Начало выборки. (optional, default to 0)
     * @param count Объем выборки. (optional, default to 10)
     * @param properties Требуемые свойства view-модели. Если не указано ни одного, то будут заданы все. (optional)
     * @param filterId Id фильтра. (optional)
     * @param offerId Id акции. (optional)
     * @param chainId Id цепочки. (optional)
     * @param offerVersionId Id версии акции, ЦА которой необходимо получить. (optional)
     * @param filterDateFrom  (optional)
     * @param filterDateTo  (optional)
     * @param filterPartnerIds  (optional)
     * @param filterLoyaltyPrograms  (optional)
     * @param filterCreatorIds  (optional)
     * @param filterName  (optional)
     * @param filterArchivedShowMode  (optional)
     * @param filterCalculatedShowMode  (optional)
     * @return ResultModelOfPagedViewModelOfTargetGroupViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfTargetGroupViewModel targetGroupGetTargetGroups(Integer from, Integer count, List<String> properties, Integer filterId, Integer offerId, Integer chainId, Integer offerVersionId, OffsetDateTime filterDateFrom, OffsetDateTime filterDateTo, List<Integer> filterPartnerIds, List<Integer> filterLoyaltyPrograms, List<Integer> filterCreatorIds, String filterName, String filterArchivedShowMode, String filterCalculatedShowMode) throws RestClientException {
        return targetGroupGetTargetGroupsWithHttpInfo(from, count, properties, filterId, offerId, chainId, offerVersionId, filterDateFrom, filterDateTo, filterPartnerIds, filterLoyaltyPrograms, filterCreatorIds, filterName, filterArchivedShowMode, filterCalculatedShowMode).getBody();
    }

    /**
     * Получить все целевые аудитории.
     * 
     * <p><b>200</b> - OK
     * @param from Начало выборки. (optional, default to 0)
     * @param count Объем выборки. (optional, default to 10)
     * @param properties Требуемые свойства view-модели. Если не указано ни одного, то будут заданы все. (optional)
     * @param filterId Id фильтра. (optional)
     * @param offerId Id акции. (optional)
     * @param chainId Id цепочки. (optional)
     * @param offerVersionId Id версии акции, ЦА которой необходимо получить. (optional)
     * @param filterDateFrom  (optional)
     * @param filterDateTo  (optional)
     * @param filterPartnerIds  (optional)
     * @param filterLoyaltyPrograms  (optional)
     * @param filterCreatorIds  (optional)
     * @param filterName  (optional)
     * @param filterArchivedShowMode  (optional)
     * @param filterCalculatedShowMode  (optional)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfTargetGroupViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfTargetGroupViewModel> targetGroupGetTargetGroupsWithHttpInfo(Integer from, Integer count, List<String> properties, Integer filterId, Integer offerId, Integer chainId, Integer offerVersionId, OffsetDateTime filterDateFrom, OffsetDateTime filterDateTo, List<Integer> filterPartnerIds, List<Integer> filterLoyaltyPrograms, List<Integer> filterCreatorIds, String filterName, String filterArchivedShowMode, String filterCalculatedShowMode) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/targetGroups").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "properties", properties));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filterId", filterId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offerId", offerId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "chainId", chainId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offerVersionId", offerVersionId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.dateFrom", filterDateFrom));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.dateTo", filterDateTo));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "filter.partnerIds", filterPartnerIds));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "filter.loyaltyPrograms", filterLoyaltyPrograms));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "filter.creatorIds", filterCreatorIds));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.name", filterName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.archivedShowMode", filterArchivedShowMode));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.calculatedShowMode", filterCalculatedShowMode));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfTargetGroupViewModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfTargetGroupViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Восстановить из архива целевую аудиторию.
     * 
     * <p><b>200</b> - OK
     * @param id Id целевой аудитории. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel targetGroupRestoreTargetGroup(Integer id) throws RestClientException {
        return targetGroupRestoreTargetGroupWithHttpInfo(id).getBody();
    }

    /**
     * Восстановить из архива целевую аудиторию.
     * 
     * <p><b>200</b> - OK
     * @param id Id целевой аудитории. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> targetGroupRestoreTargetGroupWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling targetGroupRestoreTargetGroup");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/targetGroups/{id}/restore").buildAndExpand(uriVariables).toUriString();

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
    /**
     * Снять фиксацию целевой аудитории.
     * 
     * <p><b>200</b> - OK
     * @param id Id целевой аудитории. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel targetGroupUnfixTargetGroup(Integer id) throws RestClientException {
        return targetGroupUnfixTargetGroupWithHttpInfo(id).getBody();
    }

    /**
     * Снять фиксацию целевой аудитории.
     * 
     * <p><b>200</b> - OK
     * @param id Id целевой аудитории. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> targetGroupUnfixTargetGroupWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling targetGroupUnfixTargetGroup");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/targetGroups/{id}/unfix").buildAndExpand(uriVariables).toUriString();

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
    /**
     * Редактирование целевой аудитории.
     * 
     * <p><b>200</b> - OK
     * @param id Id целевой аудитории. (required)
     * @param model Модель целевой аудитории. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel targetGroupUpdateTargetGroup(Integer id, TargetGroupModel model) throws RestClientException {
        return targetGroupUpdateTargetGroupWithHttpInfo(id, model).getBody();
    }

    /**
     * Редактирование целевой аудитории.
     * 
     * <p><b>200</b> - OK
     * @param id Id целевой аудитории. (required)
     * @param model Модель целевой аудитории. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> targetGroupUpdateTargetGroupWithHttpInfo(Integer id, TargetGroupModel model) throws RestClientException {
        Object postBody = model;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling targetGroupUpdateTargetGroup");
        }
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling targetGroupUpdateTargetGroup");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/targetGroups/{id}").buildAndExpand(uriVariables).toUriString();

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
