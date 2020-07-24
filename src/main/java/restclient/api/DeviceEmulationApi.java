package restclient.api;

import restclient.ApiClient;

import restclient.model.DeviceEmulationAddBonusPaymentModel;
import restclient.model.DeviceEmulationAddOtherPaymentModel;
import restclient.model.DeviceEmulationCashPaymentModel;
import restclient.model.DeviceEmulationCreateChequePositionModel;
import restclient.model.DeviceEmulationCreateCouponsFromListModel;
import restclient.model.DeviceEmulationPositionParamCollectionViewModel;
import restclient.model.DeviceEmulationThirdPartyBonusPaymentModel;
import restclient.model.DeviceEmulationUpdateChequePositionModel;
import java.time.OffsetDateTime;
import restclient.model.ResultModel;
import restclient.model.ResultModelOfDeviceEmulationBalanceViewModel;
import restclient.model.ResultModelOfDeviceEmulationCalculateResultStateViewModel;
import restclient.model.ResultModelOfDeviceEmulationCashierViewModel;
import restclient.model.ResultModelOfDeviceEmulationChequeViewModel;
import restclient.model.ResultModelOfDeviceEmulationPurchaseViewModel;
import restclient.model.ResultModelOfDeviceEmulationResultStateViewModel;
import restclient.model.ResultModelOfListOfDeviceEmulationPositionParamViewModel;
import restclient.model.ResultModelOfPagedViewModelOfBrandViewModel;
import restclient.model.ResultModelOfPagedViewModelOfMerchantViewModel;
import restclient.model.ResultModelOfPagedViewModelOfPurchaseViewModel;
import restclient.model.ResultModelOfPagedViewModelOfTestDeviceViewModel;
import restclient.model.ResultModelOfTestDeviceViewModel;

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
@Component("restclient.api.DeviceEmulationApi")
public class DeviceEmulationApi {
    private ApiClient apiClient;

    public DeviceEmulationApi() {
        this(new ApiClient());
    }

    @Autowired
    public DeviceEmulationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Добавление идентификатора пользователя.
     * 
     * <p><b>201</b> - Created
     * @param identifierValue Значение. (optional)
     * @param identifierLoyaltyProgram Программа лояльности. (optional)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel deviceEmulationAddUserIdentifier(String identifierValue, String identifierLoyaltyProgram) throws RestClientException {
        return deviceEmulationAddUserIdentifierWithHttpInfo(identifierValue, identifierLoyaltyProgram).getBody();
    }

    /**
     * Добавление идентификатора пользователя.
     * 
     * <p><b>201</b> - Created
     * @param identifierValue Значение. (optional)
     * @param identifierLoyaltyProgram Программа лояльности. (optional)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> deviceEmulationAddUserIdentifierWithHttpInfo(String identifierValue, String identifierLoyaltyProgram) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/deviceEmulation/purchases/current/userIdentifier").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "identifier.value", identifierValue));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "identifier.loyaltyProgram", identifierLoyaltyProgram));

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
     * Рассчитать прямую скидку.
     * 
     * <p><b>200</b> - OK
     * @return ResultModelOfDeviceEmulationCalculateResultStateViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfDeviceEmulationCalculateResultStateViewModel deviceEmulationCalculate() throws RestClientException {
        return deviceEmulationCalculateWithHttpInfo().getBody();
    }

    /**
     * Рассчитать прямую скидку.
     * 
     * <p><b>200</b> - OK
     * @return ResponseEntity&lt;ResultModelOfDeviceEmulationCalculateResultStateViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfDeviceEmulationCalculateResultStateViewModel> deviceEmulationCalculateWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/deviceEmulation/purchases/current/calculate").build().toUriString();

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

        ParameterizedTypeReference<ResultModelOfDeviceEmulationCalculateResultStateViewModel> returnType = new ParameterizedTypeReference<ResultModelOfDeviceEmulationCalculateResultStateViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Отменить покупку.
     * 
     * <p><b>200</b> - OK
     * @return ResultModelOfDeviceEmulationResultStateViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfDeviceEmulationResultStateViewModel deviceEmulationCancelPurchase() throws RestClientException {
        return deviceEmulationCancelPurchaseWithHttpInfo().getBody();
    }

    /**
     * Отменить покупку.
     * 
     * <p><b>200</b> - OK
     * @return ResponseEntity&lt;ResultModelOfDeviceEmulationResultStateViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfDeviceEmulationResultStateViewModel> deviceEmulationCancelPurchaseWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/deviceEmulation/purchases/current/cancel").build().toUriString();

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

        ParameterizedTypeReference<ResultModelOfDeviceEmulationResultStateViewModel> returnType = new ParameterizedTypeReference<ResultModelOfDeviceEmulationResultStateViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Подтвердить покупку.
     * 
     * <p><b>200</b> - OK
     * @return ResultModelOfDeviceEmulationChequeViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfDeviceEmulationChequeViewModel deviceEmulationConfirmPurchase() throws RestClientException {
        return deviceEmulationConfirmPurchaseWithHttpInfo().getBody();
    }

    /**
     * Подтвердить покупку.
     * 
     * <p><b>200</b> - OK
     * @return ResponseEntity&lt;ResultModelOfDeviceEmulationChequeViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfDeviceEmulationChequeViewModel> deviceEmulationConfirmPurchaseWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/deviceEmulation/purchases/current/confirm").build().toUriString();

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

        ParameterizedTypeReference<ResultModelOfDeviceEmulationChequeViewModel> returnType = new ParameterizedTypeReference<ResultModelOfDeviceEmulationChequeViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Задает список параметров чековой позиции.
     * 
     * <p><b>201</b> - Created
     * @param id Идентификатор позиции. (required)
     * @param paramCollection Параметры для обновления. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel deviceEmulationCreateChequePositionParams(Integer id, DeviceEmulationPositionParamCollectionViewModel paramCollection) throws RestClientException {
        return deviceEmulationCreateChequePositionParamsWithHttpInfo(id, paramCollection).getBody();
    }

    /**
     * Задает список параметров чековой позиции.
     * 
     * <p><b>201</b> - Created
     * @param id Идентификатор позиции. (required)
     * @param paramCollection Параметры для обновления. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> deviceEmulationCreateChequePositionParamsWithHttpInfo(Integer id, DeviceEmulationPositionParamCollectionViewModel paramCollection) throws RestClientException {
        Object postBody = paramCollection;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deviceEmulationCreateChequePositionParams");
        }
        
        // verify the required parameter 'paramCollection' is set
        if (paramCollection == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'paramCollection' when calling deviceEmulationCreateChequePositionParams");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/deviceEmulation/purchases/current/positions/{id}/params").buildAndExpand(uriVariables).toUriString();

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
     * Добавляет чековые позиции.
     * 
     * <p><b>201</b> - Created
     * @param createChequePositionViewModels Список чековых позиций. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel deviceEmulationCreateChequePositions(List<DeviceEmulationCreateChequePositionModel> createChequePositionViewModels) throws RestClientException {
        return deviceEmulationCreateChequePositionsWithHttpInfo(createChequePositionViewModels).getBody();
    }

    /**
     * Добавляет чековые позиции.
     * 
     * <p><b>201</b> - Created
     * @param createChequePositionViewModels Список чековых позиций. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> deviceEmulationCreateChequePositionsWithHttpInfo(List<DeviceEmulationCreateChequePositionModel> createChequePositionViewModels) throws RestClientException {
        Object postBody = createChequePositionViewModels;
        
        // verify the required parameter 'createChequePositionViewModels' is set
        if (createChequePositionViewModels == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createChequePositionViewModels' when calling deviceEmulationCreateChequePositions");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/deviceEmulation/purchases/current/positions").build().toUriString();

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
     * Добавляет список купонов.
     * 
     * <p><b>201</b> - Created
     * @param model Входная модель. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel deviceEmulationCreateCoupons(DeviceEmulationCreateCouponsFromListModel model) throws RestClientException {
        return deviceEmulationCreateCouponsWithHttpInfo(model).getBody();
    }

    /**
     * Добавляет список купонов.
     * 
     * <p><b>201</b> - Created
     * @param model Входная модель. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> deviceEmulationCreateCouponsWithHttpInfo(DeviceEmulationCreateCouponsFromListModel model) throws RestClientException {
        Object postBody = model;
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling deviceEmulationCreateCoupons");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/deviceEmulation/purchases/current/coupons").build().toUriString();

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
     * Создает покупку на тестовой кассе.
     * 
     * <p><b>201</b> - Created
     * @param deviceId Идентификатор тестовой кассы. (required)
     * @param dateTime Время покупки. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel deviceEmulationCreatePurchase(Integer deviceId, OffsetDateTime dateTime) throws RestClientException {
        return deviceEmulationCreatePurchaseWithHttpInfo(deviceId, dateTime).getBody();
    }

    /**
     * Создает покупку на тестовой кассе.
     * 
     * <p><b>201</b> - Created
     * @param deviceId Идентификатор тестовой кассы. (required)
     * @param dateTime Время покупки. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> deviceEmulationCreatePurchaseWithHttpInfo(Integer deviceId, OffsetDateTime dateTime) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'deviceId' is set
        if (deviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'deviceId' when calling deviceEmulationCreatePurchase");
        }
        
        // verify the required parameter 'dateTime' is set
        if (dateTime == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dateTime' when calling deviceEmulationCreatePurchase");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/deviceEmulation/purchases/current").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "deviceId", deviceId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "dateTime", dateTime));

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
     * Удаляет чековую позицию.
     * 
     * <p><b>200</b> - OK
     * @param positionId Номер позиции в покупке. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel deviceEmulationDeleteChequePosition(Integer positionId) throws RestClientException {
        return deviceEmulationDeleteChequePositionWithHttpInfo(positionId).getBody();
    }

    /**
     * Удаляет чековую позицию.
     * 
     * <p><b>200</b> - OK
     * @param positionId Номер позиции в покупке. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> deviceEmulationDeleteChequePositionWithHttpInfo(Integer positionId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'positionId' is set
        if (positionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'positionId' when calling deviceEmulationDeleteChequePosition");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("positionId", positionId);
        String path = UriComponentsBuilder.fromPath("/api/deviceEmulation/purchases/current/positions/{positionId}").buildAndExpand(uriVariables).toUriString();

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
     * Удаляет купон по номеру.
     * 
     * <p><b>200</b> - OK
     * @param number Номер купона. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel deviceEmulationDeleteCouponByNumber(String number) throws RestClientException {
        return deviceEmulationDeleteCouponByNumberWithHttpInfo(number).getBody();
    }

    /**
     * Удаляет купон по номеру.
     * 
     * <p><b>200</b> - OK
     * @param number Номер купона. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> deviceEmulationDeleteCouponByNumberWithHttpInfo(String number) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'number' is set
        if (number == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'number' when calling deviceEmulationDeleteCouponByNumber");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("number", number);
        String path = UriComponentsBuilder.fromPath("/api/deviceEmulation/purchases/current/coupons/{number}").buildAndExpand(uriVariables).toUriString();

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
     * Завершить покупку.
     * 
     * <p><b>200</b> - OK
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel deviceEmulationFinishCheque() throws RestClientException {
        return deviceEmulationFinishChequeWithHttpInfo().getBody();
    }

    /**
     * Завершить покупку.
     * 
     * <p><b>200</b> - OK
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> deviceEmulationFinishChequeWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/deviceEmulation/purchases/current/finish").build().toUriString();

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
     * Возвращает доступные средства по карте.
     * 
     * <p><b>200</b> - OK
     * @param identifierValue Значение. (optional)
     * @param identifierLoyaltyProgram Программа лояльности. (optional)
     * @return ResultModelOfDeviceEmulationBalanceViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfDeviceEmulationBalanceViewModel deviceEmulationGetAvailableAmount(String identifierValue, String identifierLoyaltyProgram) throws RestClientException {
        return deviceEmulationGetAvailableAmountWithHttpInfo(identifierValue, identifierLoyaltyProgram).getBody();
    }

    /**
     * Возвращает доступные средства по карте.
     * 
     * <p><b>200</b> - OK
     * @param identifierValue Значение. (optional)
     * @param identifierLoyaltyProgram Программа лояльности. (optional)
     * @return ResponseEntity&lt;ResultModelOfDeviceEmulationBalanceViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfDeviceEmulationBalanceViewModel> deviceEmulationGetAvailableAmountWithHttpInfo(String identifierValue, String identifierLoyaltyProgram) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/deviceEmulation/purchases/current/availableAmount").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "identifier.value", identifierValue));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "identifier.loyaltyProgram", identifierLoyaltyProgram));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfDeviceEmulationBalanceViewModel> returnType = new ParameterizedTypeReference<ResultModelOfDeviceEmulationBalanceViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Возвращает список доступных касс.
     * 
     * <p><b>200</b> - OK
     * @param brandId Идентификатор бренда. (required)
     * @param merchantId Идентификатор мерчанта. (required)
     * @param from Начало выборки. (optional, default to 0)
     * @param count Количество. (optional, default to 10)
     * @return ResultModelOfPagedViewModelOfTestDeviceViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfTestDeviceViewModel deviceEmulationGetAvailableDevices(Integer brandId, Integer merchantId, Integer from, Integer count) throws RestClientException {
        return deviceEmulationGetAvailableDevicesWithHttpInfo(brandId, merchantId, from, count).getBody();
    }

    /**
     * Возвращает список доступных касс.
     * 
     * <p><b>200</b> - OK
     * @param brandId Идентификатор бренда. (required)
     * @param merchantId Идентификатор мерчанта. (required)
     * @param from Начало выборки. (optional, default to 0)
     * @param count Количество. (optional, default to 10)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfTestDeviceViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfTestDeviceViewModel> deviceEmulationGetAvailableDevicesWithHttpInfo(Integer brandId, Integer merchantId, Integer from, Integer count) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'brandId' is set
        if (brandId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'brandId' when calling deviceEmulationGetAvailableDevices");
        }
        
        // verify the required parameter 'merchantId' is set
        if (merchantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'merchantId' when calling deviceEmulationGetAvailableDevices");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("brandId", brandId);
        uriVariables.put("merchantId", merchantId);
        String path = UriComponentsBuilder.fromPath("/api/deviceEmulation/brands/{brandId}/merchants/{merchantId}/devices").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfTestDeviceViewModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfTestDeviceViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Возвращает баланс.
     * 
     * <p><b>200</b> - OK
     * @param deviceId Идентификатор кассы. (required)
     * @param date Время запроса. (required)
     * @param identifierValue Значение. (optional)
     * @param identifierLoyaltyProgram Программа лояльности. (optional)
     * @return ResultModelOfDeviceEmulationBalanceViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfDeviceEmulationBalanceViewModel deviceEmulationGetBalance(Integer deviceId, OffsetDateTime date, String identifierValue, String identifierLoyaltyProgram) throws RestClientException {
        return deviceEmulationGetBalanceWithHttpInfo(deviceId, date, identifierValue, identifierLoyaltyProgram).getBody();
    }

    /**
     * Возвращает баланс.
     * 
     * <p><b>200</b> - OK
     * @param deviceId Идентификатор кассы. (required)
     * @param date Время запроса. (required)
     * @param identifierValue Значение. (optional)
     * @param identifierLoyaltyProgram Программа лояльности. (optional)
     * @return ResponseEntity&lt;ResultModelOfDeviceEmulationBalanceViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfDeviceEmulationBalanceViewModel> deviceEmulationGetBalanceWithHttpInfo(Integer deviceId, OffsetDateTime date, String identifierValue, String identifierLoyaltyProgram) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'deviceId' is set
        if (deviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'deviceId' when calling deviceEmulationGetBalance");
        }
        
        // verify the required parameter 'date' is set
        if (date == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'date' when calling deviceEmulationGetBalance");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/deviceEmulation/balance").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "deviceId", deviceId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "date", date));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "identifier.value", identifierValue));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "identifier.loyaltyProgram", identifierLoyaltyProgram));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfDeviceEmulationBalanceViewModel> returnType = new ParameterizedTypeReference<ResultModelOfDeviceEmulationBalanceViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Возвращает список всех доступных брендов.
     * 
     * <p><b>200</b> - OK
     * @param from Начало выборки. (optional, default to 0)
     * @param count Объем выборки. (optional, default to 10)
     * @param name Название. (optional)
     * @return ResultModelOfPagedViewModelOfBrandViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfBrandViewModel deviceEmulationGetBrandsWithDevices(Integer from, Integer count, String name) throws RestClientException {
        return deviceEmulationGetBrandsWithDevicesWithHttpInfo(from, count, name).getBody();
    }

    /**
     * Возвращает список всех доступных брендов.
     * 
     * <p><b>200</b> - OK
     * @param from Начало выборки. (optional, default to 0)
     * @param count Объем выборки. (optional, default to 10)
     * @param name Название. (optional)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfBrandViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfBrandViewModel> deviceEmulationGetBrandsWithDevicesWithHttpInfo(Integer from, Integer count, String name) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/deviceEmulation/brands").build().toUriString();

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

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfBrandViewModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfBrandViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить информацию о кассире.
     * 
     * <p><b>200</b> - OK
     * @return ResultModelOfDeviceEmulationCashierViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfDeviceEmulationCashierViewModel deviceEmulationGetCashierInfo() throws RestClientException {
        return deviceEmulationGetCashierInfoWithHttpInfo().getBody();
    }

    /**
     * Получить информацию о кассире.
     * 
     * <p><b>200</b> - OK
     * @return ResponseEntity&lt;ResultModelOfDeviceEmulationCashierViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfDeviceEmulationCashierViewModel> deviceEmulationGetCashierInfoWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/deviceEmulation/purchases/current/cashier").build().toUriString();

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

        ParameterizedTypeReference<ResultModelOfDeviceEmulationCashierViewModel> returnType = new ParameterizedTypeReference<ResultModelOfDeviceEmulationCashierViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Возвращает список параметров чековой позиции.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор позиции. (required)
     * @return ResultModelOfListOfDeviceEmulationPositionParamViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfDeviceEmulationPositionParamViewModel deviceEmulationGetChequePositionParams(Integer id) throws RestClientException {
        return deviceEmulationGetChequePositionParamsWithHttpInfo(id).getBody();
    }

    /**
     * Возвращает список параметров чековой позиции.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор позиции. (required)
     * @return ResponseEntity&lt;ResultModelOfListOfDeviceEmulationPositionParamViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfDeviceEmulationPositionParamViewModel> deviceEmulationGetChequePositionParamsWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deviceEmulationGetChequePositionParams");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/deviceEmulation/purchases/current/positions/{id}/params").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfListOfDeviceEmulationPositionParamViewModel> returnType = new ParameterizedTypeReference<ResultModelOfListOfDeviceEmulationPositionParamViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Возвращает кассу по идентификатору.
     * 
     * <p><b>200</b> - OK
     * @param deviceID Идентификатор кассы. (required)
     * @return ResultModelOfTestDeviceViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfTestDeviceViewModel deviceEmulationGetDeviceByID(Integer deviceID) throws RestClientException {
        return deviceEmulationGetDeviceByIDWithHttpInfo(deviceID).getBody();
    }

    /**
     * Возвращает кассу по идентификатору.
     * 
     * <p><b>200</b> - OK
     * @param deviceID Идентификатор кассы. (required)
     * @return ResponseEntity&lt;ResultModelOfTestDeviceViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfTestDeviceViewModel> deviceEmulationGetDeviceByIDWithHttpInfo(Integer deviceID) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'deviceID' is set
        if (deviceID == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'deviceID' when calling deviceEmulationGetDeviceByID");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("deviceID", deviceID);
        String path = UriComponentsBuilder.fromPath("/api/deviceEmulation/devices/{deviceID}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfTestDeviceViewModel> returnType = new ParameterizedTypeReference<ResultModelOfTestDeviceViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Возвращает список всех доступных магазинов.
     * 
     * <p><b>200</b> - OK
     * @param brandId Идентификатор бренда. (required)
     * @param from Начало выборки. (optional, default to 0)
     * @param count Объем выборки. (optional, default to 10)
     * @param name Название. (optional)
     * @return ResultModelOfPagedViewModelOfMerchantViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfMerchantViewModel deviceEmulationGetMerchantsWithDevices(Integer brandId, Integer from, Integer count, String name) throws RestClientException {
        return deviceEmulationGetMerchantsWithDevicesWithHttpInfo(brandId, from, count, name).getBody();
    }

    /**
     * Возвращает список всех доступных магазинов.
     * 
     * <p><b>200</b> - OK
     * @param brandId Идентификатор бренда. (required)
     * @param from Начало выборки. (optional, default to 0)
     * @param count Объем выборки. (optional, default to 10)
     * @param name Название. (optional)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfMerchantViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfMerchantViewModel> deviceEmulationGetMerchantsWithDevicesWithHttpInfo(Integer brandId, Integer from, Integer count, String name) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'brandId' is set
        if (brandId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'brandId' when calling deviceEmulationGetMerchantsWithDevices");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("brandId", brandId);
        String path = UriComponentsBuilder.fromPath("/api/deviceEmulation/brands/{brandId}/merchants").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfMerchantViewModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfMerchantViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Возвращает текущую покупку.
     * 
     * <p><b>200</b> - OK
     * @return ResultModelOfDeviceEmulationPurchaseViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfDeviceEmulationPurchaseViewModel deviceEmulationGetPurchase() throws RestClientException {
        return deviceEmulationGetPurchaseWithHttpInfo().getBody();
    }

    /**
     * Возвращает текущую покупку.
     * 
     * <p><b>200</b> - OK
     * @return ResponseEntity&lt;ResultModelOfDeviceEmulationPurchaseViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfDeviceEmulationPurchaseViewModel> deviceEmulationGetPurchaseWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/deviceEmulation/purchases/current").build().toUriString();

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

        ParameterizedTypeReference<ResultModelOfDeviceEmulationPurchaseViewModel> returnType = new ParameterizedTypeReference<ResultModelOfDeviceEmulationPurchaseViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить указанное количество покупок с указанной позиции.
     * 
     * <p><b>200</b> - OK
     * @param startChequeTime Нижняя граница времени покупки. (optional)
     * @param lastChequeTime Верхняя граница времени покупки. (optional)
     * @param merchantIds Идентификатор магазина. (optional)
     * @param loyaltyPrograms Идентификатор программ лояльности. (optional)
     * @param chequeNumber Номер чека. (optional)
     * @param count Количество. (optional)
     * @param from Начальная позиция в списке. (optional)
     * @param cardNumber Номер карты. (optional)
     * @param personId Идентификатор пользователя. (optional)
     * @param personIdentifier Идентификатор пользователя связанный с покупкой. (optional)
     * @return ResultModelOfPagedViewModelOfPurchaseViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfPurchaseViewModel deviceEmulationGetPurchases(OffsetDateTime startChequeTime, OffsetDateTime lastChequeTime, String merchantIds, String loyaltyPrograms, String chequeNumber, Integer count, Integer from, String cardNumber, Integer personId, String personIdentifier) throws RestClientException {
        return deviceEmulationGetPurchasesWithHttpInfo(startChequeTime, lastChequeTime, merchantIds, loyaltyPrograms, chequeNumber, count, from, cardNumber, personId, personIdentifier).getBody();
    }

    /**
     * Получить указанное количество покупок с указанной позиции.
     * 
     * <p><b>200</b> - OK
     * @param startChequeTime Нижняя граница времени покупки. (optional)
     * @param lastChequeTime Верхняя граница времени покупки. (optional)
     * @param merchantIds Идентификатор магазина. (optional)
     * @param loyaltyPrograms Идентификатор программ лояльности. (optional)
     * @param chequeNumber Номер чека. (optional)
     * @param count Количество. (optional)
     * @param from Начальная позиция в списке. (optional)
     * @param cardNumber Номер карты. (optional)
     * @param personId Идентификатор пользователя. (optional)
     * @param personIdentifier Идентификатор пользователя связанный с покупкой. (optional)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfPurchaseViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfPurchaseViewModel> deviceEmulationGetPurchasesWithHttpInfo(OffsetDateTime startChequeTime, OffsetDateTime lastChequeTime, String merchantIds, String loyaltyPrograms, String chequeNumber, Integer count, Integer from, String cardNumber, Integer personId, String personIdentifier) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/deviceEmulation/purchases").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "startChequeTime", startChequeTime));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "lastChequeTime", lastChequeTime));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "merchantIds", merchantIds));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "loyaltyPrograms", loyaltyPrograms));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "chequeNumber", chequeNumber));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cardNumber", cardNumber));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "personId", personId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "personIdentifier", personIdentifier));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfPurchaseViewModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfPurchaseViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Добавить оплату реальными деньгами.
     * 
     * <p><b>201</b> - Created
     * @param cashPaymentModel Модель добавления оплаты. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel deviceEmulationSetCashPayment(DeviceEmulationCashPaymentModel cashPaymentModel) throws RestClientException {
        return deviceEmulationSetCashPaymentWithHttpInfo(cashPaymentModel).getBody();
    }

    /**
     * Добавить оплату реальными деньгами.
     * 
     * <p><b>201</b> - Created
     * @param cashPaymentModel Модель добавления оплаты. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> deviceEmulationSetCashPaymentWithHttpInfo(DeviceEmulationCashPaymentModel cashPaymentModel) throws RestClientException {
        Object postBody = cashPaymentModel;
        
        // verify the required parameter 'cashPaymentModel' is set
        if (cashPaymentModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cashPaymentModel' when calling deviceEmulationSetCashPayment");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/deviceEmulation/purchases/current/payments/cash").build().toUriString();

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
     * Добавить оплату бонусами сторонних компаний.
     * 
     * <p><b>201</b> - Created
     * @param otherPaymentModel Модель добавления оплаты. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel deviceEmulationSetOtherPayment(DeviceEmulationAddOtherPaymentModel otherPaymentModel) throws RestClientException {
        return deviceEmulationSetOtherPaymentWithHttpInfo(otherPaymentModel).getBody();
    }

    /**
     * Добавить оплату бонусами сторонних компаний.
     * 
     * <p><b>201</b> - Created
     * @param otherPaymentModel Модель добавления оплаты. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> deviceEmulationSetOtherPaymentWithHttpInfo(DeviceEmulationAddOtherPaymentModel otherPaymentModel) throws RestClientException {
        Object postBody = otherPaymentModel;
        
        // verify the required parameter 'otherPaymentModel' is set
        if (otherPaymentModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'otherPaymentModel' when calling deviceEmulationSetOtherPayment");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/deviceEmulation/purchases/current/payments/other").build().toUriString();

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
     * Задать оплаты.
     * 
     * <p><b>201</b> - Created
     * @param addPaymentModels Модели оплат. (required)
     * @return ResultModelOfDeviceEmulationResultStateViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfDeviceEmulationResultStateViewModel deviceEmulationSetPayments(List<DeviceEmulationAddBonusPaymentModel> addPaymentModels) throws RestClientException {
        return deviceEmulationSetPaymentsWithHttpInfo(addPaymentModels).getBody();
    }

    /**
     * Задать оплаты.
     * 
     * <p><b>201</b> - Created
     * @param addPaymentModels Модели оплат. (required)
     * @return ResponseEntity&lt;ResultModelOfDeviceEmulationResultStateViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfDeviceEmulationResultStateViewModel> deviceEmulationSetPaymentsWithHttpInfo(List<DeviceEmulationAddBonusPaymentModel> addPaymentModels) throws RestClientException {
        Object postBody = addPaymentModels;
        
        // verify the required parameter 'addPaymentModels' is set
        if (addPaymentModels == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'addPaymentModels' when calling deviceEmulationSetPayments");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/deviceEmulation/purchases/current/payments").build().toUriString();

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

        ParameterizedTypeReference<ResultModelOfDeviceEmulationResultStateViewModel> returnType = new ParameterizedTypeReference<ResultModelOfDeviceEmulationResultStateViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Добавить оплату бонусами сторонних компаний.
     * 
     * <p><b>201</b> - Created
     * @param thirdPartyBonusPaymentModel Модель добавления оплаты. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel deviceEmulationSetThirdPartyBonusPayment(DeviceEmulationThirdPartyBonusPaymentModel thirdPartyBonusPaymentModel) throws RestClientException {
        return deviceEmulationSetThirdPartyBonusPaymentWithHttpInfo(thirdPartyBonusPaymentModel).getBody();
    }

    /**
     * Добавить оплату бонусами сторонних компаний.
     * 
     * <p><b>201</b> - Created
     * @param thirdPartyBonusPaymentModel Модель добавления оплаты. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> deviceEmulationSetThirdPartyBonusPaymentWithHttpInfo(DeviceEmulationThirdPartyBonusPaymentModel thirdPartyBonusPaymentModel) throws RestClientException {
        Object postBody = thirdPartyBonusPaymentModel;
        
        // verify the required parameter 'thirdPartyBonusPaymentModel' is set
        if (thirdPartyBonusPaymentModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'thirdPartyBonusPaymentModel' when calling deviceEmulationSetThirdPartyBonusPayment");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/deviceEmulation/purchases/current/payments/thirdPartyBonus").build().toUriString();

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
     * Меняет местами позиции в чеке.
     * 
     * <p><b>200</b> - OK
     * @param positionId Номер позиции в покупке. (required)
     * @param secondPositionId Номер второй позиции в покупке. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel deviceEmulationSwapChequePositions(Integer positionId, Integer secondPositionId) throws RestClientException {
        return deviceEmulationSwapChequePositionsWithHttpInfo(positionId, secondPositionId).getBody();
    }

    /**
     * Меняет местами позиции в чеке.
     * 
     * <p><b>200</b> - OK
     * @param positionId Номер позиции в покупке. (required)
     * @param secondPositionId Номер второй позиции в покупке. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> deviceEmulationSwapChequePositionsWithHttpInfo(Integer positionId, Integer secondPositionId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'positionId' is set
        if (positionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'positionId' when calling deviceEmulationSwapChequePositions");
        }
        
        // verify the required parameter 'secondPositionId' is set
        if (secondPositionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'secondPositionId' when calling deviceEmulationSwapChequePositions");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("positionId", positionId);
        String path = UriComponentsBuilder.fromPath("/api/deviceEmulation/purchases/current/positions/{positionId}/swap").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "secondPositionId", secondPositionId));

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
     * Обновляет чековую позицию.
     * 
     * <p><b>200</b> - OK
     * @param positionId Номер позиции в покупке. (required)
     * @param newPosition Новая чековая позиция. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel deviceEmulationUpdateChequePosition(Integer positionId, DeviceEmulationUpdateChequePositionModel newPosition) throws RestClientException {
        return deviceEmulationUpdateChequePositionWithHttpInfo(positionId, newPosition).getBody();
    }

    /**
     * Обновляет чековую позицию.
     * 
     * <p><b>200</b> - OK
     * @param positionId Номер позиции в покупке. (required)
     * @param newPosition Новая чековая позиция. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> deviceEmulationUpdateChequePositionWithHttpInfo(Integer positionId, DeviceEmulationUpdateChequePositionModel newPosition) throws RestClientException {
        Object postBody = newPosition;
        
        // verify the required parameter 'positionId' is set
        if (positionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'positionId' when calling deviceEmulationUpdateChequePosition");
        }
        
        // verify the required parameter 'newPosition' is set
        if (newPosition == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'newPosition' when calling deviceEmulationUpdateChequePosition");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("positionId", positionId);
        String path = UriComponentsBuilder.fromPath("/api/deviceEmulation/purchases/current/positions/{positionId}").buildAndExpand(uriVariables).toUriString();

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
