package restclient.api;

import restclient.ApiClient;

import restclient.model.DeviceViewModel;
import restclient.model.DevicesForApplicationFilter;
import restclient.model.ResultModel;
import restclient.model.ResultModelOfDeviceViewModel;
import restclient.model.ResultModelOfInt32;
import restclient.model.ResultModelOfListOfDeviceTypeViewModel;
import restclient.model.ResultModelOfPagedViewModelOfDeviceBriefViewModel;
import restclient.model.ResultModelOfPagedViewModelOfDeviceViewModel;

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
@Component("restclient.api.PartnerDeviceApi")
public class PartnerDeviceApi {
    private ApiClient apiClient;

    public PartnerDeviceApi() {
        this(new ApiClient());
    }

    @Autowired
    public PartnerDeviceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Создать кассу.
     * 
     * <p><b>201</b> - Created
     * @param partnerId Идентификатор партнера. (required)
     * @param model ViewModel кассы. (required)
     * @return ResultModelOfInt32
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfInt32 partnerDeviceCreate(Integer partnerId, DeviceViewModel model) throws RestClientException {
        return partnerDeviceCreateWithHttpInfo(partnerId, model).getBody();
    }

    /**
     * Создать кассу.
     * 
     * <p><b>201</b> - Created
     * @param partnerId Идентификатор партнера. (required)
     * @param model ViewModel кассы. (required)
     * @return ResponseEntity&lt;ResultModelOfInt32&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfInt32> partnerDeviceCreateWithHttpInfo(Integer partnerId, DeviceViewModel model) throws RestClientException {
        Object postBody = model;
        
        // verify the required parameter 'partnerId' is set
        if (partnerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partnerId' when calling partnerDeviceCreate");
        }
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling partnerDeviceCreate");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("partnerId", partnerId);
        String path = UriComponentsBuilder.fromPath("/api/partners/{partnerId}/devices").buildAndExpand(uriVariables).toUriString();

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
     * Отправить кассу в архив.
     * 
     * <p><b>200</b> - OK
     * @param partnerId Идентификатор партнера. (required)
     * @param deviceId Идентификатор кассы. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel partnerDeviceDelete(Integer partnerId, Integer deviceId) throws RestClientException {
        return partnerDeviceDeleteWithHttpInfo(partnerId, deviceId).getBody();
    }

    /**
     * Отправить кассу в архив.
     * 
     * <p><b>200</b> - OK
     * @param partnerId Идентификатор партнера. (required)
     * @param deviceId Идентификатор кассы. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> partnerDeviceDeleteWithHttpInfo(Integer partnerId, Integer deviceId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'partnerId' is set
        if (partnerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partnerId' when calling partnerDeviceDelete");
        }
        
        // verify the required parameter 'deviceId' is set
        if (deviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'deviceId' when calling partnerDeviceDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("partnerId", partnerId);
        uriVariables.put("deviceId", deviceId);
        String path = UriComponentsBuilder.fromPath("/api/partners/{partnerId}/devices/{deviceId}").buildAndExpand(uriVariables).toUriString();

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
     * Редактировать кассу.
     * 
     * <p><b>200</b> - OK
     * @param partnerId Идентификатор партнера. (required)
     * @param deviceId Идентификатор кассы. (required)
     * @param model ViewModel кассы. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel partnerDeviceEdit(Integer partnerId, Integer deviceId, DeviceViewModel model) throws RestClientException {
        return partnerDeviceEditWithHttpInfo(partnerId, deviceId, model).getBody();
    }

    /**
     * Редактировать кассу.
     * 
     * <p><b>200</b> - OK
     * @param partnerId Идентификатор партнера. (required)
     * @param deviceId Идентификатор кассы. (required)
     * @param model ViewModel кассы. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> partnerDeviceEditWithHttpInfo(Integer partnerId, Integer deviceId, DeviceViewModel model) throws RestClientException {
        Object postBody = model;
        
        // verify the required parameter 'partnerId' is set
        if (partnerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partnerId' when calling partnerDeviceEdit");
        }
        
        // verify the required parameter 'deviceId' is set
        if (deviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'deviceId' when calling partnerDeviceEdit");
        }
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling partnerDeviceEdit");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("partnerId", partnerId);
        uriVariables.put("deviceId", deviceId);
        String path = UriComponentsBuilder.fromPath("/api/partners/{partnerId}/devices/{deviceId}").buildAndExpand(uriVariables).toUriString();

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
     * Получение кассы.
     * 
     * <p><b>200</b> - OK
     * @param partnerId Идентификатор партнера. (required)
     * @param deviceId Идентификатор кассы. (required)
     * @return ResultModelOfDeviceViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfDeviceViewModel partnerDeviceGetDevice(Integer partnerId, Integer deviceId) throws RestClientException {
        return partnerDeviceGetDeviceWithHttpInfo(partnerId, deviceId).getBody();
    }

    /**
     * Получение кассы.
     * 
     * <p><b>200</b> - OK
     * @param partnerId Идентификатор партнера. (required)
     * @param deviceId Идентификатор кассы. (required)
     * @return ResponseEntity&lt;ResultModelOfDeviceViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfDeviceViewModel> partnerDeviceGetDeviceWithHttpInfo(Integer partnerId, Integer deviceId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'partnerId' is set
        if (partnerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partnerId' when calling partnerDeviceGetDevice");
        }
        
        // verify the required parameter 'deviceId' is set
        if (deviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'deviceId' when calling partnerDeviceGetDevice");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("partnerId", partnerId);
        uriVariables.put("deviceId", deviceId);
        String path = UriComponentsBuilder.fromPath("/api/partners/{partnerId}/devices/{deviceId}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfDeviceViewModel> returnType = new ParameterizedTypeReference<ResultModelOfDeviceViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получение короткой информации о кассах партнера.
     * 
     * <p><b>200</b> - OK
     * @param partnerId Идентификатор партнера. (required)
     * @param from С какого. (optional)
     * @param count Сколько. (optional)
     * @param merchantIds Список идентификаторов магазинов. (optional)
     * @param legalId Идентификатор юр. лица. (optional)
     * @param logicalId Логическое имя. (optional)
     * @param mode Режим вывода по признаку удаления. (optional)
     * @param isOrderedByAscending Режим прямой сортировки. (optional)
     * @param debetOnly Выбор только дебетовых касс. (optional)
     * @return ResultModelOfPagedViewModelOfDeviceBriefViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfDeviceBriefViewModel partnerDeviceGetPartnerDeviceInfo(Integer partnerId, Integer from, Integer count, String merchantIds, Integer legalId, String logicalId, String mode, Boolean isOrderedByAscending, Boolean debetOnly) throws RestClientException {
        return partnerDeviceGetPartnerDeviceInfoWithHttpInfo(partnerId, from, count, merchantIds, legalId, logicalId, mode, isOrderedByAscending, debetOnly).getBody();
    }

    /**
     * Получение короткой информации о кассах партнера.
     * 
     * <p><b>200</b> - OK
     * @param partnerId Идентификатор партнера. (required)
     * @param from С какого. (optional)
     * @param count Сколько. (optional)
     * @param merchantIds Список идентификаторов магазинов. (optional)
     * @param legalId Идентификатор юр. лица. (optional)
     * @param logicalId Логическое имя. (optional)
     * @param mode Режим вывода по признаку удаления. (optional)
     * @param isOrderedByAscending Режим прямой сортировки. (optional)
     * @param debetOnly Выбор только дебетовых касс. (optional)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfDeviceBriefViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfDeviceBriefViewModel> partnerDeviceGetPartnerDeviceInfoWithHttpInfo(Integer partnerId, Integer from, Integer count, String merchantIds, Integer legalId, String logicalId, String mode, Boolean isOrderedByAscending, Boolean debetOnly) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'partnerId' is set
        if (partnerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partnerId' when calling partnerDeviceGetPartnerDeviceInfo");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("partnerId", partnerId);
        String path = UriComponentsBuilder.fromPath("/api/partners/{partnerId}/deviceInfo").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "merchantIds", merchantIds));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "legalId", legalId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "logicalId", logicalId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "mode", mode));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "isOrderedByAscending", isOrderedByAscending));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "debetOnly", debetOnly));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfDeviceBriefViewModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfDeviceBriefViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получение короткой информации о кассах партнера.
     * 
     * <p><b>200</b> - OK
     * @param partnerId Идентификатор партнера. (required)
     * @param filter Фильтр запроса. (required)
     * @return ResultModelOfPagedViewModelOfDeviceBriefViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfDeviceBriefViewModel partnerDeviceGetPartnerDeviceInfoForOAuthApplication(Integer partnerId, DevicesForApplicationFilter filter) throws RestClientException {
        return partnerDeviceGetPartnerDeviceInfoForOAuthApplicationWithHttpInfo(partnerId, filter).getBody();
    }

    /**
     * Получение короткой информации о кассах партнера.
     * 
     * <p><b>200</b> - OK
     * @param partnerId Идентификатор партнера. (required)
     * @param filter Фильтр запроса. (required)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfDeviceBriefViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfDeviceBriefViewModel> partnerDeviceGetPartnerDeviceInfoForOAuthApplicationWithHttpInfo(Integer partnerId, DevicesForApplicationFilter filter) throws RestClientException {
        Object postBody = filter;
        
        // verify the required parameter 'partnerId' is set
        if (partnerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partnerId' when calling partnerDeviceGetPartnerDeviceInfoForOAuthApplication");
        }
        
        // verify the required parameter 'filter' is set
        if (filter == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'filter' when calling partnerDeviceGetPartnerDeviceInfoForOAuthApplication");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("partnerId", partnerId);
        String path = UriComponentsBuilder.fromPath("/api/partners/{partnerId}/oauth/deviceInfo").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfDeviceBriefViewModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfDeviceBriefViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получение списка касс партнера.
     * 
     * <p><b>200</b> - OK
     * @param partnerId Идентификатор партнера. (required)
     * @param from С какого. (optional)
     * @param count Сколько. (optional)
     * @param merchantIds Список идентификаторов магазинов. (optional)
     * @param legalId Идентификатор юр. лица. (optional)
     * @param logicalId Логическое имя. (optional)
     * @param mode Режим вывода по признаку удаления. (optional)
     * @param isOrderedByAscending Режим прямой сортировки. (optional)
     * @param debetOnly Выбор только дебетовых касс. (optional)
     * @return ResultModelOfPagedViewModelOfDeviceViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfDeviceViewModel partnerDeviceGetPartnerDevices(Integer partnerId, Integer from, Integer count, String merchantIds, Integer legalId, String logicalId, String mode, Boolean isOrderedByAscending, Boolean debetOnly) throws RestClientException {
        return partnerDeviceGetPartnerDevicesWithHttpInfo(partnerId, from, count, merchantIds, legalId, logicalId, mode, isOrderedByAscending, debetOnly).getBody();
    }

    /**
     * Получение списка касс партнера.
     * 
     * <p><b>200</b> - OK
     * @param partnerId Идентификатор партнера. (required)
     * @param from С какого. (optional)
     * @param count Сколько. (optional)
     * @param merchantIds Список идентификаторов магазинов. (optional)
     * @param legalId Идентификатор юр. лица. (optional)
     * @param logicalId Логическое имя. (optional)
     * @param mode Режим вывода по признаку удаления. (optional)
     * @param isOrderedByAscending Режим прямой сортировки. (optional)
     * @param debetOnly Выбор только дебетовых касс. (optional)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfDeviceViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfDeviceViewModel> partnerDeviceGetPartnerDevicesWithHttpInfo(Integer partnerId, Integer from, Integer count, String merchantIds, Integer legalId, String logicalId, String mode, Boolean isOrderedByAscending, Boolean debetOnly) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'partnerId' is set
        if (partnerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partnerId' when calling partnerDeviceGetPartnerDevices");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("partnerId", partnerId);
        String path = UriComponentsBuilder.fromPath("/api/partners/{partnerId}/devices").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "merchantIds", merchantIds));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "legalId", legalId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "logicalId", logicalId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "mode", mode));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "isOrderedByAscending", isOrderedByAscending));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "debetOnly", debetOnly));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfDeviceViewModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfDeviceViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить список возможных типов кассы.
     * 
     * <p><b>200</b> - OK
     * @param partnerId Идентификатор партнера. (required)
     * @param count Количество. (required)
     * @param nameSubstr Подстрока названия. (optional, default to )
     * @return ResultModelOfListOfDeviceTypeViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfDeviceTypeViewModel partnerDeviceGetPossibleTypes(Integer partnerId, Integer count, String nameSubstr) throws RestClientException {
        return partnerDeviceGetPossibleTypesWithHttpInfo(partnerId, count, nameSubstr).getBody();
    }

    /**
     * Получить список возможных типов кассы.
     * 
     * <p><b>200</b> - OK
     * @param partnerId Идентификатор партнера. (required)
     * @param count Количество. (required)
     * @param nameSubstr Подстрока названия. (optional, default to )
     * @return ResponseEntity&lt;ResultModelOfListOfDeviceTypeViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfDeviceTypeViewModel> partnerDeviceGetPossibleTypesWithHttpInfo(Integer partnerId, Integer count, String nameSubstr) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'partnerId' is set
        if (partnerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partnerId' when calling partnerDeviceGetPossibleTypes");
        }
        
        // verify the required parameter 'count' is set
        if (count == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'count' when calling partnerDeviceGetPossibleTypes");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("partnerId", partnerId);
        String path = UriComponentsBuilder.fromPath("/api/partners/{partnerId}/devices/possibleTypes").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "nameSubstr", nameSubstr));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfListOfDeviceTypeViewModel> returnType = new ParameterizedTypeReference<ResultModelOfListOfDeviceTypeViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Восстановить кассу.
     * 
     * <p><b>200</b> - OK
     * @param partnerId Идентификатор партнера. (required)
     * @param deviceId Идентификатор кассы. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel partnerDeviceRestore(Integer partnerId, Integer deviceId) throws RestClientException {
        return partnerDeviceRestoreWithHttpInfo(partnerId, deviceId).getBody();
    }

    /**
     * Восстановить кассу.
     * 
     * <p><b>200</b> - OK
     * @param partnerId Идентификатор партнера. (required)
     * @param deviceId Идентификатор кассы. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> partnerDeviceRestoreWithHttpInfo(Integer partnerId, Integer deviceId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'partnerId' is set
        if (partnerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partnerId' when calling partnerDeviceRestore");
        }
        
        // verify the required parameter 'deviceId' is set
        if (deviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'deviceId' when calling partnerDeviceRestore");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("partnerId", partnerId);
        uriVariables.put("deviceId", deviceId);
        String path = UriComponentsBuilder.fromPath("/api/partners/{partnerId}/devices/{deviceId}/restore").buildAndExpand(uriVariables).toUriString();

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
