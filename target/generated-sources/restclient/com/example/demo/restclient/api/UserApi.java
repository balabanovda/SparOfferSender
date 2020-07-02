package com.example.demo.restclient.api;

import com.example.demo.restclient.ApiClient;

import com.example.demo.restclient.model.CreateUserModel;
import com.example.demo.restclient.model.DeregisterModel;
import java.time.OffsetDateTime;
import com.example.demo.restclient.model.PersonFilter;
import com.example.demo.restclient.model.PostConfirmCodeModel;
import com.example.demo.restclient.model.QuestionAnswerModel;
import com.example.demo.restclient.model.ResultModel;
import com.example.demo.restclient.model.ResultModelOfConfirmCodeResultModel;
import com.example.demo.restclient.model.ResultModelOfDetailedBalanceInfoViewModel;
import com.example.demo.restclient.model.ResultModelOfEmitVirtualCardInfoModel;
import com.example.demo.restclient.model.ResultModelOfInt32;
import com.example.demo.restclient.model.ResultModelOfListOfAccountBalanceModel;
import com.example.demo.restclient.model.ResultModelOfListOfAttributePartnerValueModel;
import com.example.demo.restclient.model.ResultModelOfListOfPersonAttributeModel;
import com.example.demo.restclient.model.ResultModelOfListOfPersonInfoModel;
import com.example.demo.restclient.model.ResultModelOfListOfQuestionnaireItemModel;
import com.example.demo.restclient.model.ResultModelOfListOfSubscriptionViewModel;
import com.example.demo.restclient.model.ResultModelOfMoneyViewModel;
import com.example.demo.restclient.model.ResultModelOfPagedViewModelOfCommunicationOfferModel;
import com.example.demo.restclient.model.ResultModelOfPagedViewModelOfCouponViewModel;
import com.example.demo.restclient.model.ResultModelOfPagedViewModelOfDetailItem;
import com.example.demo.restclient.model.ResultModelOfPagedViewModelOfPersonInfoModel;
import com.example.demo.restclient.model.ResultModelOfPersonInfoModel;
import com.example.demo.restclient.model.ResultModelOfQuestionsErrorsModel;
import com.example.demo.restclient.model.ResultModelOfUserActionsResult;
import com.example.demo.restclient.model.ResultModelOfUserName;
import com.example.demo.restclient.model.ResultModelOfUserPhoneNumberInfo;
import com.example.demo.restclient.model.SetCardModel;
import com.example.demo.restclient.model.SetNewEmailModel;
import com.example.demo.restclient.model.SetNewPhoneModel;
import com.example.demo.restclient.model.SubscriptionViewModel;
import java.util.UUID;

import java.util.ArrayList;
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
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
@Component("com.example.demo.restclient.api.UserApi")
public class UserApi {
    private ApiClient apiClient;

    public UserApi() {
        this(new ApiClient());
    }

    @Autowired
    public UserApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Принятие оферты.
     * 
     * <p><b>200</b> - OK
     * @param personId Идентификатор клиента. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel userAcceptTenderOffer(Integer personId) throws RestClientException {
        return userAcceptTenderOfferWithHttpInfo(personId).getBody();
    }

    /**
     * Принятие оферты.
     * 
     * <p><b>200</b> - OK
     * @param personId Идентификатор клиента. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> userAcceptTenderOfferWithHttpInfo(Integer personId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling userAcceptTenderOffer");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("personId", personId);
        String path = UriComponentsBuilder.fromPath("/api/Users/{personId}/AcceptTenderOffer").buildAndExpand(uriVariables).toUriString();

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
     * Отменить проверку телефона.
     * 
     * <p><b>200</b> - OK
     * @param personId Id клиента. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel userCancelConfirmPhone(Integer personId) throws RestClientException {
        return userCancelConfirmPhoneWithHttpInfo(personId).getBody();
    }

    /**
     * Отменить проверку телефона.
     * 
     * <p><b>200</b> - OK
     * @param personId Id клиента. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> userCancelConfirmPhoneWithHttpInfo(Integer personId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling userCancelConfirmPhone");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("personId", personId);
        String path = UriComponentsBuilder.fromPath("/api/Users/{personId}/CancelConfirmPhone").buildAndExpand(uriVariables).toUriString();

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
     * Проверка пароля клиента.
     * 
     * <p><b>200</b> - OK
     * @param personId Идентификатор клиента. (required)
     * @param password Пароль. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel userCheckUserPassword(Integer personId, String password) throws RestClientException {
        return userCheckUserPasswordWithHttpInfo(personId, password).getBody();
    }

    /**
     * Проверка пароля клиента.
     * 
     * <p><b>200</b> - OK
     * @param personId Идентификатор клиента. (required)
     * @param password Пароль. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> userCheckUserPasswordWithHttpInfo(Integer personId, String password) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling userCheckUserPassword");
        }
        
        // verify the required parameter 'password' is set
        if (password == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'password' when calling userCheckUserPassword");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("personId", personId);
        String path = UriComponentsBuilder.fromPath("/api/Users/{personId}/CheckPassword").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "password", password));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModel> returnType = new ParameterizedTypeReference<ResultModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Проверить код подтверждения телефона.
     * 
     * <p><b>200</b> - OK
     * @param personId Id клиента. (required)
     * @param confirmCode Модель кода подтверждения. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel userConfirmPhoneCode(Integer personId, PostConfirmCodeModel confirmCode) throws RestClientException {
        return userConfirmPhoneCodeWithHttpInfo(personId, confirmCode).getBody();
    }

    /**
     * Проверить код подтверждения телефона.
     * 
     * <p><b>200</b> - OK
     * @param personId Id клиента. (required)
     * @param confirmCode Модель кода подтверждения. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> userConfirmPhoneCodeWithHttpInfo(Integer personId, PostConfirmCodeModel confirmCode) throws RestClientException {
        Object postBody = confirmCode;
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling userConfirmPhoneCode");
        }
        
        // verify the required parameter 'confirmCode' is set
        if (confirmCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'confirmCode' when calling userConfirmPhoneCode");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("personId", personId);
        String path = UriComponentsBuilder.fromPath("/api/Users/{personId}/PostConfirmPhoneCode").buildAndExpand(uriVariables).toUriString();

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
     * Регистрация нового пользователя.
     * 
     * <p><b>201</b> - Created
     * @param createModel Модель для регистрации в системе нового пользователя. (required)
     * @return ResultModelOfInt32
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfInt32 userCreateUser(CreateUserModel createModel) throws RestClientException {
        return userCreateUserWithHttpInfo(createModel).getBody();
    }

    /**
     * Регистрация нового пользователя.
     * 
     * <p><b>201</b> - Created
     * @param createModel Модель для регистрации в системе нового пользователя. (required)
     * @return ResponseEntity&lt;ResultModelOfInt32&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfInt32> userCreateUserWithHttpInfo(CreateUserModel createModel) throws RestClientException {
        Object postBody = createModel;
        
        // verify the required parameter 'createModel' is set
        if (createModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createModel' when calling userCreateUser");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/Users").build().toUriString();

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
     * Исключить пользователя из программы лояльности.
     * 
     * <p><b>200</b> - OK
     * @param personId Идентификатор клиента. (required)
     * @param model Модель с параметрами. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel userDeregister(Integer personId, DeregisterModel model) throws RestClientException {
        return userDeregisterWithHttpInfo(personId, model).getBody();
    }

    /**
     * Исключить пользователя из программы лояльности.
     * 
     * <p><b>200</b> - OK
     * @param personId Идентификатор клиента. (required)
     * @param model Модель с параметрами. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> userDeregisterWithHttpInfo(Integer personId, DeregisterModel model) throws RestClientException {
        Object postBody = model;
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling userDeregister");
        }
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling userDeregister");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("personId", personId);
        String path = UriComponentsBuilder.fromPath("/api/Users/{personId}/Deregister").buildAndExpand(uriVariables).toUriString();

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
     * Добавление виртуальной карты.
     * 
     * <p><b>201</b> - Created
     * @param personId Идентификатор пользователя. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel userEmitVirtualCard(Integer personId) throws RestClientException {
        return userEmitVirtualCardWithHttpInfo(personId).getBody();
    }

    /**
     * Добавление виртуальной карты.
     * 
     * <p><b>201</b> - Created
     * @param personId Идентификатор пользователя. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> userEmitVirtualCardWithHttpInfo(Integer personId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling userEmitVirtualCard");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("personId", personId);
        String path = UriComponentsBuilder.fromPath("/api/Users/{personId}/EmitVirtual").buildAndExpand(uriVariables).toUriString();

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
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить информацию о возможности выпуска виртуальной карты.
     * 
     * <p><b>200</b> - OK
     * @param personId Идентификатор пользователя. (required)
     * @return ResultModelOfEmitVirtualCardInfoModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfEmitVirtualCardInfoModel userEmitVirtualCardInfo(Integer personId) throws RestClientException {
        return userEmitVirtualCardInfoWithHttpInfo(personId).getBody();
    }

    /**
     * Получить информацию о возможности выпуска виртуальной карты.
     * 
     * <p><b>200</b> - OK
     * @param personId Идентификатор пользователя. (required)
     * @return ResponseEntity&lt;ResultModelOfEmitVirtualCardInfoModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfEmitVirtualCardInfoModel> userEmitVirtualCardInfoWithHttpInfo(Integer personId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling userEmitVirtualCardInfo");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("personId", personId);
        String path = UriComponentsBuilder.fromPath("/api/Users/{personId}/EmitVirtual").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfEmitVirtualCardInfoModel> returnType = new ParameterizedTypeReference<ResultModelOfEmitVirtualCardInfoModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Возвращает список партнерских атрибутов пользователя.
     * 
     * <p><b>200</b> - OK
     * @param personId Идентификатор пользователя. (required)
     * @return ResultModelOfListOfAttributePartnerValueModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfAttributePartnerValueModel userGetAttributes(Integer personId) throws RestClientException {
        return userGetAttributesWithHttpInfo(personId).getBody();
    }

    /**
     * Возвращает список партнерских атрибутов пользователя.
     * 
     * <p><b>200</b> - OK
     * @param personId Идентификатор пользователя. (required)
     * @return ResponseEntity&lt;ResultModelOfListOfAttributePartnerValueModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfAttributePartnerValueModel> userGetAttributesWithHttpInfo(Integer personId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling userGetAttributes");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("personId", personId);
        String path = UriComponentsBuilder.fromPath("/api/Users/{personId}/Attributes").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfListOfAttributePartnerValueModel> returnType = new ParameterizedTypeReference<ResultModelOfListOfAttributePartnerValueModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получение информации о балансе пользователя.
     * 
     * <p><b>200</b> - OK
     * @param personId Идентификатор клиента. (required)
     * @return ResultModelOfListOfAccountBalanceModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfAccountBalanceModel userGetBalances(Integer personId) throws RestClientException {
        return userGetBalancesWithHttpInfo(personId).getBody();
    }

    /**
     * Получение информации о балансе пользователя.
     * 
     * <p><b>200</b> - OK
     * @param personId Идентификатор клиента. (required)
     * @return ResponseEntity&lt;ResultModelOfListOfAccountBalanceModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfAccountBalanceModel> userGetBalancesWithHttpInfo(Integer personId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling userGetBalances");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("personId", personId);
        String path = UriComponentsBuilder.fromPath("/api/Users/{personId}/Balance").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfListOfAccountBalanceModel> returnType = new ParameterizedTypeReference<ResultModelOfListOfAccountBalanceModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить список акций пользователя.
     * 
     * <p><b>200</b> - OK
     * @param personId ID пользователя. (required)
     * @param filterCommunicationOfferState Статус акции. (optional)
     * @param filterFromDate Дата С. (optional)
     * @param filterToDate Дата По. (optional)
     * @param filterBrandIds Набор идентификаторов брендов. (optional)
     * @param filterCategoriesIds Набор идентификаторов категорий рекламных материалов. (optional)
     * @param filterName Подстрока для поиска по имени. (optional)
     * @param filterIsArchived Признак удаления. (optional)
     * @param filterPriorityMin Минимальный приоритет. (optional)
     * @param filterPriorityMax Максимальный приоритет. (optional)
     * @return ResultModelOfPagedViewModelOfCommunicationOfferModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfCommunicationOfferModel userGetCommunicationOffers(Integer personId, String filterCommunicationOfferState, OffsetDateTime filterFromDate, OffsetDateTime filterToDate, List<Integer> filterBrandIds, List<Integer> filterCategoriesIds, String filterName, String filterIsArchived, Integer filterPriorityMin, Integer filterPriorityMax) throws RestClientException {
        return userGetCommunicationOffersWithHttpInfo(personId, filterCommunicationOfferState, filterFromDate, filterToDate, filterBrandIds, filterCategoriesIds, filterName, filterIsArchived, filterPriorityMin, filterPriorityMax).getBody();
    }

    /**
     * Получить список акций пользователя.
     * 
     * <p><b>200</b> - OK
     * @param personId ID пользователя. (required)
     * @param filterCommunicationOfferState Статус акции. (optional)
     * @param filterFromDate Дата С. (optional)
     * @param filterToDate Дата По. (optional)
     * @param filterBrandIds Набор идентификаторов брендов. (optional)
     * @param filterCategoriesIds Набор идентификаторов категорий рекламных материалов. (optional)
     * @param filterName Подстрока для поиска по имени. (optional)
     * @param filterIsArchived Признак удаления. (optional)
     * @param filterPriorityMin Минимальный приоритет. (optional)
     * @param filterPriorityMax Максимальный приоритет. (optional)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfCommunicationOfferModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfCommunicationOfferModel> userGetCommunicationOffersWithHttpInfo(Integer personId, String filterCommunicationOfferState, OffsetDateTime filterFromDate, OffsetDateTime filterToDate, List<Integer> filterBrandIds, List<Integer> filterCategoriesIds, String filterName, String filterIsArchived, Integer filterPriorityMin, Integer filterPriorityMax) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling userGetCommunicationOffers");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("personId", personId);
        String path = UriComponentsBuilder.fromPath("/api/Users/{personId}/CommunicationOffers").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.communicationOfferState", filterCommunicationOfferState));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.fromDate", filterFromDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.toDate", filterToDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "filter.brandIds", filterBrandIds));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "filter.categoriesIds", filterCategoriesIds));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.name", filterName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.isArchived", filterIsArchived));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.priorityMin", filterPriorityMin));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.priorityMax", filterPriorityMax));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfCommunicationOfferModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfCommunicationOfferModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Информация о текущем клиенте.
     * 
     * <p><b>200</b> - OK
     * @return ResultModelOfPersonInfoModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPersonInfoModel userGetCurrentPersonInfo() throws RestClientException {
        return userGetCurrentPersonInfoWithHttpInfo().getBody();
    }

    /**
     * Информация о текущем клиенте.
     * 
     * <p><b>200</b> - OK
     * @return ResponseEntity&lt;ResultModelOfPersonInfoModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPersonInfoModel> userGetCurrentPersonInfoWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/user").build().toUriString();

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

        ParameterizedTypeReference<ResultModelOfPersonInfoModel> returnType = new ParameterizedTypeReference<ResultModelOfPersonInfoModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Имя текущего пользователя.
     * 
     * <p><b>200</b> - OK
     * @return ResultModelOfUserName
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfUserName userGetCurrentUserName() throws RestClientException {
        return userGetCurrentUserNameWithHttpInfo().getBody();
    }

    /**
     * Имя текущего пользователя.
     * 
     * <p><b>200</b> - OK
     * @return ResponseEntity&lt;ResultModelOfUserName&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfUserName> userGetCurrentUserNameWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/user/name").build().toUriString();

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

        ParameterizedTypeReference<ResultModelOfUserName> returnType = new ParameterizedTypeReference<ResultModelOfUserName>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получение информации о детализированном балансе пользователя.
     * 
     * <p><b>200</b> - OK
     * @param personId Идентификатор клиента. (required)
     * @param date Дата (если null - то текущая). (optional)
     * @return ResultModelOfDetailedBalanceInfoViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfDetailedBalanceInfoViewModel userGetDetailedBalance(Integer personId, OffsetDateTime date) throws RestClientException {
        return userGetDetailedBalanceWithHttpInfo(personId, date).getBody();
    }

    /**
     * Получение информации о детализированном балансе пользователя.
     * 
     * <p><b>200</b> - OK
     * @param personId Идентификатор клиента. (required)
     * @param date Дата (если null - то текущая). (optional)
     * @return ResponseEntity&lt;ResultModelOfDetailedBalanceInfoViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfDetailedBalanceInfoViewModel> userGetDetailedBalanceWithHttpInfo(Integer personId, OffsetDateTime date) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling userGetDetailedBalance");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("personId", personId);
        String path = UriComponentsBuilder.fromPath("/api/Users/{personId}/DetailedBalance").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "date", date));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfDetailedBalanceInfoViewModel> returnType = new ParameterizedTypeReference<ResultModelOfDetailedBalanceInfoViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получение суммы покупок у партнера.
     * 
     * <p><b>200</b> - OK
     * @param personId Ид пользователя. (required)
     * @param partnerId Ид партнера. (required)
     * @return ResultModelOfMoneyViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfMoneyViewModel userGetPartnerPurchaseAmount(Integer personId, UUID partnerId) throws RestClientException {
        return userGetPartnerPurchaseAmountWithHttpInfo(personId, partnerId).getBody();
    }

    /**
     * Получение суммы покупок у партнера.
     * 
     * <p><b>200</b> - OK
     * @param personId Ид пользователя. (required)
     * @param partnerId Ид партнера. (required)
     * @return ResponseEntity&lt;ResultModelOfMoneyViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfMoneyViewModel> userGetPartnerPurchaseAmountWithHttpInfo(Integer personId, UUID partnerId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling userGetPartnerPurchaseAmount");
        }
        
        // verify the required parameter 'partnerId' is set
        if (partnerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partnerId' when calling userGetPartnerPurchaseAmount");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("personId", personId);
        uriVariables.put("partnerId", partnerId);
        String path = UriComponentsBuilder.fromPath("/api/Users/{personId}/GetPartnerPurchaseAmount/{partnerId}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfMoneyViewModel> returnType = new ParameterizedTypeReference<ResultModelOfMoneyViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить информацию об атрибутах клиента.
     * 
     * <p><b>200</b> - OK
     * @return ResultModelOfListOfPersonAttributeModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfPersonAttributeModel userGetPersonAttributesInfo() throws RestClientException {
        return userGetPersonAttributesInfoWithHttpInfo().getBody();
    }

    /**
     * Получить информацию об атрибутах клиента.
     * 
     * <p><b>200</b> - OK
     * @return ResponseEntity&lt;ResultModelOfListOfPersonAttributeModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfPersonAttributeModel> userGetPersonAttributesInfoWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/Users/GetPersonAttributesInfo").build().toUriString();

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

        ParameterizedTypeReference<ResultModelOfListOfPersonAttributeModel> returnType = new ParameterizedTypeReference<ResultModelOfListOfPersonAttributeModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получение купонов по id пользователя.
     * 
     * <p><b>200</b> - OK
     * @param count Количество. (required)
     * @param from Начало. (required)
     * @param personId Идентификатор пользователя. (required)
     * @param filterEmissionIds  (optional)
     * @param filterCouponStates  (optional)
     * @param filterChangedStateDateFrom  (optional)
     * @param filterChangedStateDateTo  (optional)
     * @param filterCouponNumber  (optional)
     * @return ResultModelOfPagedViewModelOfCouponViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfCouponViewModel userGetPersonCoupons(Integer count, Integer from, Integer personId, List<Integer> filterEmissionIds, List<String> filterCouponStates, OffsetDateTime filterChangedStateDateFrom, OffsetDateTime filterChangedStateDateTo, String filterCouponNumber) throws RestClientException {
        return userGetPersonCouponsWithHttpInfo(count, from, personId, filterEmissionIds, filterCouponStates, filterChangedStateDateFrom, filterChangedStateDateTo, filterCouponNumber).getBody();
    }

    /**
     * Получение купонов по id пользователя.
     * 
     * <p><b>200</b> - OK
     * @param count Количество. (required)
     * @param from Начало. (required)
     * @param personId Идентификатор пользователя. (required)
     * @param filterEmissionIds  (optional)
     * @param filterCouponStates  (optional)
     * @param filterChangedStateDateFrom  (optional)
     * @param filterChangedStateDateTo  (optional)
     * @param filterCouponNumber  (optional)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfCouponViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfCouponViewModel> userGetPersonCouponsWithHttpInfo(Integer count, Integer from, Integer personId, List<Integer> filterEmissionIds, List<String> filterCouponStates, OffsetDateTime filterChangedStateDateFrom, OffsetDateTime filterChangedStateDateTo, String filterCouponNumber) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'count' is set
        if (count == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'count' when calling userGetPersonCoupons");
        }
        
        // verify the required parameter 'from' is set
        if (from == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'from' when calling userGetPersonCoupons");
        }
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling userGetPersonCoupons");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("personId", personId);
        String path = UriComponentsBuilder.fromPath("/api/Users/{personId}/Coupons").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "filter.emissionIds", filterEmissionIds));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "filter.couponStates", filterCouponStates));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.changedStateDateFrom", filterChangedStateDateFrom));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.changedStateDateTo", filterChangedStateDateTo));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.couponNumber", filterCouponNumber));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfCouponViewModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfCouponViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Информация о клиенте по идентификатору.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор. (required)
     * @return ResultModelOfPersonInfoModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPersonInfoModel userGetPersonInfoById(Integer id) throws RestClientException {
        return userGetPersonInfoByIdWithHttpInfo(id).getBody();
    }

    /**
     * Информация о клиенте по идентификатору.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор. (required)
     * @return ResponseEntity&lt;ResultModelOfPersonInfoModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPersonInfoModel> userGetPersonInfoByIdWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling userGetPersonInfoById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/Users/{id}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfPersonInfoModel> returnType = new ParameterizedTypeReference<ResultModelOfPersonInfoModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Информация о клиенте по номеру телефона.
     * 
     * <p><b>200</b> - OK
     * @param phone Номер телефона. (required)
     * @return ResultModelOfListOfPersonInfoModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfPersonInfoModel userGetPersonInfoByPhone(String phone) throws RestClientException {
        return userGetPersonInfoByPhoneWithHttpInfo(phone).getBody();
    }

    /**
     * Информация о клиенте по номеру телефона.
     * 
     * <p><b>200</b> - OK
     * @param phone Номер телефона. (required)
     * @return ResponseEntity&lt;ResultModelOfListOfPersonInfoModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfPersonInfoModel> userGetPersonInfoByPhoneWithHttpInfo(String phone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'phone' is set
        if (phone == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'phone' when calling userGetPersonInfoByPhone");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/Users").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "phone", phone));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfListOfPersonInfoModel> returnType = new ParameterizedTypeReference<ResultModelOfListOfPersonInfoModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получение деталей персонального предложения клиента.
     * 
     * <p><b>200</b> - OK
     * @param personId Id клиента. (required)
     * @param offerId Id акции. (required)
     * @param from Начальный элемент. (optional, default to 0)
     * @param count Количество. (optional, default to 2147483647)
     * @return ResultModelOfPagedViewModelOfDetailItem
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfDetailItem userGetPersonalOfferDetails(Integer personId, Integer offerId, Integer from, Integer count) throws RestClientException {
        return userGetPersonalOfferDetailsWithHttpInfo(personId, offerId, from, count).getBody();
    }

    /**
     * Получение деталей персонального предложения клиента.
     * 
     * <p><b>200</b> - OK
     * @param personId Id клиента. (required)
     * @param offerId Id акции. (required)
     * @param from Начальный элемент. (optional, default to 0)
     * @param count Количество. (optional, default to 2147483647)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfDetailItem&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfDetailItem> userGetPersonalOfferDetailsWithHttpInfo(Integer personId, Integer offerId, Integer from, Integer count) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling userGetPersonalOfferDetails");
        }
        
        // verify the required parameter 'offerId' is set
        if (offerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'offerId' when calling userGetPersonalOfferDetails");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("personId", personId);
        uriVariables.put("offerId", offerId);
        String path = UriComponentsBuilder.fromPath("/api/Users/{personId}/CommunicationOffers/{offerId}/Details").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfDetailItem> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfDetailItem>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Список всех клиентов.
     * 
     * <p><b>200</b> - OK
     * @param filter Фильтр. (required)
     * @param from Начало выборки. (optional, default to 0)
     * @param count Количество. (optional, default to 10)
     * @return ResultModelOfPagedViewModelOfPersonInfoModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfPersonInfoModel userGetPersons(PersonFilter filter, Integer from, Integer count) throws RestClientException {
        return userGetPersonsWithHttpInfo(filter, from, count).getBody();
    }

    /**
     * Список всех клиентов.
     * 
     * <p><b>200</b> - OK
     * @param filter Фильтр. (required)
     * @param from Начало выборки. (optional, default to 0)
     * @param count Количество. (optional, default to 10)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfPersonInfoModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfPersonInfoModel> userGetPersonsWithHttpInfo(PersonFilter filter, Integer from, Integer count) throws RestClientException {
        Object postBody = filter;
        
        // verify the required parameter 'filter' is set
        if (filter == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'filter' when calling userGetPersons");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/Users").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/x-www-form-urlencoded", "application/json", "text/json", "application/xml", "text/xml"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfPersonInfoModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfPersonInfoModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить текущее состояние телефона пользователя.
     * 
     * <p><b>200</b> - OK
     * @param personId Идентификатор клиента. (required)
     * @return ResultModelOfUserPhoneNumberInfo
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfUserPhoneNumberInfo userGetPhone(Integer personId) throws RestClientException {
        return userGetPhoneWithHttpInfo(personId).getBody();
    }

    /**
     * Получить текущее состояние телефона пользователя.
     * 
     * <p><b>200</b> - OK
     * @param personId Идентификатор клиента. (required)
     * @return ResponseEntity&lt;ResultModelOfUserPhoneNumberInfo&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfUserPhoneNumberInfo> userGetPhoneWithHttpInfo(Integer personId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling userGetPhone");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("personId", personId);
        String path = UriComponentsBuilder.fromPath("/api/Users/{personId}/Phone").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfUserPhoneNumberInfo> returnType = new ParameterizedTypeReference<ResultModelOfUserPhoneNumberInfo>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить информацию о вопросах анкеты.
     * 
     * <p><b>200</b> - OK
     * @param personId Идентификатор клиента. (required)
     * @param filterOnlyRequired Получает информацию о вопросах анкеты с отмеченным чекбоксом \&quot;Видимый при регистрации\&quot;. (optional)
     * @return ResultModelOfListOfQuestionnaireItemModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfQuestionnaireItemModel userGetQuestions(Integer personId, Boolean filterOnlyRequired) throws RestClientException {
        return userGetQuestionsWithHttpInfo(personId, filterOnlyRequired).getBody();
    }

    /**
     * Получить информацию о вопросах анкеты.
     * 
     * <p><b>200</b> - OK
     * @param personId Идентификатор клиента. (required)
     * @param filterOnlyRequired Получает информацию о вопросах анкеты с отмеченным чекбоксом \&quot;Видимый при регистрации\&quot;. (optional)
     * @return ResponseEntity&lt;ResultModelOfListOfQuestionnaireItemModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfQuestionnaireItemModel> userGetQuestionsWithHttpInfo(Integer personId, Boolean filterOnlyRequired) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling userGetQuestions");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("personId", personId);
        String path = UriComponentsBuilder.fromPath("/api/Users/{personId}/Questions").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.onlyRequired", filterOnlyRequired));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfListOfQuestionnaireItemModel> returnType = new ParameterizedTypeReference<ResultModelOfListOfQuestionnaireItemModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить вопросы анкеты для предварительного просмотра.
     * 
     * <p><b>200</b> - OK
     * @param filterOnlyRequired Получает информацию о вопросах анкеты с отмеченным чекбоксом \&quot;Видимый при регистрации\&quot;. (optional)
     * @return ResultModelOfListOfQuestionnaireItemModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfQuestionnaireItemModel userGetQuestionsForPreview(Boolean filterOnlyRequired) throws RestClientException {
        return userGetQuestionsForPreviewWithHttpInfo(filterOnlyRequired).getBody();
    }

    /**
     * Получить вопросы анкеты для предварительного просмотра.
     * 
     * <p><b>200</b> - OK
     * @param filterOnlyRequired Получает информацию о вопросах анкеты с отмеченным чекбоксом \&quot;Видимый при регистрации\&quot;. (optional)
     * @return ResponseEntity&lt;ResultModelOfListOfQuestionnaireItemModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfQuestionnaireItemModel> userGetQuestionsForPreviewWithHttpInfo(Boolean filterOnlyRequired) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/Users/QuestionsForPreview").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.onlyRequired", filterOnlyRequired));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfListOfQuestionnaireItemModel> returnType = new ParameterizedTypeReference<ResultModelOfListOfQuestionnaireItemModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить все обязательные действия необходимые для регистрации.
     * 
     * <p><b>200</b> - OK
     * @param personId Идентификатор клиента. (required)
     * @return ResultModelOfUserActionsResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfUserActionsResult userGetRequiredUserActions(Integer personId) throws RestClientException {
        return userGetRequiredUserActionsWithHttpInfo(personId).getBody();
    }

    /**
     * Получить все обязательные действия необходимые для регистрации.
     * 
     * <p><b>200</b> - OK
     * @param personId Идентификатор клиента. (required)
     * @return ResponseEntity&lt;ResultModelOfUserActionsResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfUserActionsResult> userGetRequiredUserActionsWithHttpInfo(Integer personId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling userGetRequiredUserActions");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("personId", personId);
        String path = UriComponentsBuilder.fromPath("/api/Users/{personId}/RequiredActions").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfUserActionsResult> returnType = new ParameterizedTypeReference<ResultModelOfUserActionsResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Подписки.
     * 
     * <p><b>200</b> - OK
     * @param personId Идентификатор клиента. (required)
     * @return ResultModelOfListOfSubscriptionViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfSubscriptionViewModel userGetSubscriptions(Integer personId) throws RestClientException {
        return userGetSubscriptionsWithHttpInfo(personId).getBody();
    }

    /**
     * Подписки.
     * 
     * <p><b>200</b> - OK
     * @param personId Идентификатор клиента. (required)
     * @return ResponseEntity&lt;ResultModelOfListOfSubscriptionViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfSubscriptionViewModel> userGetSubscriptionsWithHttpInfo(Integer personId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling userGetSubscriptions");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("personId", personId);
        String path = UriComponentsBuilder.fromPath("/api/Users/{personId}/Subscriptions").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfListOfSubscriptionViewModel> returnType = new ParameterizedTypeReference<ResultModelOfListOfSubscriptionViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Отправить повторно код подтверждения.
     * 
     * <p><b>200</b> - OK
     * @param personId Id клиента. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel userSendConfirmCode(Integer personId) throws RestClientException {
        return userSendConfirmCodeWithHttpInfo(personId).getBody();
    }

    /**
     * Отправить повторно код подтверждения.
     * 
     * <p><b>200</b> - OK
     * @param personId Id клиента. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> userSendConfirmCodeWithHttpInfo(Integer personId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling userSendConfirmCode");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("personId", personId);
        String path = UriComponentsBuilder.fromPath("/api/Users/{personId}/SendConfirmPhoneCode").buildAndExpand(uriVariables).toUriString();

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
     * Прикрепление карты к пользователю.
     * 
     * <p><b>200</b> - OK
     * @param personId Ид пользователя. (required)
     * @param setCardModel Модель карты. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel userSetCard(Integer personId, SetCardModel setCardModel) throws RestClientException {
        return userSetCardWithHttpInfo(personId, setCardModel).getBody();
    }

    /**
     * Прикрепление карты к пользователю.
     * 
     * <p><b>200</b> - OK
     * @param personId Ид пользователя. (required)
     * @param setCardModel Модель карты. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> userSetCardWithHttpInfo(Integer personId, SetCardModel setCardModel) throws RestClientException {
        Object postBody = setCardModel;
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling userSetCard");
        }
        
        // verify the required parameter 'setCardModel' is set
        if (setCardModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'setCardModel' when calling userSetCard");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("personId", personId);
        String path = UriComponentsBuilder.fromPath("/api/Users/{personId}/SetCard").buildAndExpand(uriVariables).toUriString();

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
     * Прикрепить почту.
     * 
     * <p><b>200</b> - OK
     * @param personId Идентификатор клиента. (required)
     * @param setNewEmailModel Модель для прикрепления почты. (required)
     * @param attachType Тип привязки Email. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel userSetEmail(Integer personId, SetNewEmailModel setNewEmailModel, String attachType) throws RestClientException {
        return userSetEmailWithHttpInfo(personId, setNewEmailModel, attachType).getBody();
    }

    /**
     * Прикрепить почту.
     * 
     * <p><b>200</b> - OK
     * @param personId Идентификатор клиента. (required)
     * @param setNewEmailModel Модель для прикрепления почты. (required)
     * @param attachType Тип привязки Email. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> userSetEmailWithHttpInfo(Integer personId, SetNewEmailModel setNewEmailModel, String attachType) throws RestClientException {
        Object postBody = setNewEmailModel;
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling userSetEmail");
        }
        
        // verify the required parameter 'setNewEmailModel' is set
        if (setNewEmailModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'setNewEmailModel' when calling userSetEmail");
        }
        
        // verify the required parameter 'attachType' is set
        if (attachType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'attachType' when calling userSetEmail");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("personId", personId);
        String path = UriComponentsBuilder.fromPath("/api/Users/{personId}/SetEmail").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "attachType", attachType));

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
     * Прикрепить телефон.
     * 
     * <p><b>200</b> - OK
     * @param personId Идентификатор клиента. (required)
     * @param setNewPhoneModel Модель для прикрепления телефона. (required)
     * @return ResultModelOfConfirmCodeResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfConfirmCodeResultModel userSetPhone(Integer personId, SetNewPhoneModel setNewPhoneModel) throws RestClientException {
        return userSetPhoneWithHttpInfo(personId, setNewPhoneModel).getBody();
    }

    /**
     * Прикрепить телефон.
     * 
     * <p><b>200</b> - OK
     * @param personId Идентификатор клиента. (required)
     * @param setNewPhoneModel Модель для прикрепления телефона. (required)
     * @return ResponseEntity&lt;ResultModelOfConfirmCodeResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfConfirmCodeResultModel> userSetPhoneWithHttpInfo(Integer personId, SetNewPhoneModel setNewPhoneModel) throws RestClientException {
        Object postBody = setNewPhoneModel;
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling userSetPhone");
        }
        
        // verify the required parameter 'setNewPhoneModel' is set
        if (setNewPhoneModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'setNewPhoneModel' when calling userSetPhone");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("personId", personId);
        String path = UriComponentsBuilder.fromPath("/api/Users/{personId}/SetPhone").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfConfirmCodeResultModel> returnType = new ParameterizedTypeReference<ResultModelOfConfirmCodeResultModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Установить пароль.
     * 
     * <p><b>200</b> - OK
     * @param personId Идентификатор клиента. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel userSetRandomPassword(Integer personId) throws RestClientException {
        return userSetRandomPasswordWithHttpInfo(personId).getBody();
    }

    /**
     * Установить пароль.
     * 
     * <p><b>200</b> - OK
     * @param personId Идентификатор клиента. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> userSetRandomPasswordWithHttpInfo(Integer personId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling userSetRandomPassword");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("personId", personId);
        String path = UriComponentsBuilder.fromPath("/api/Users/{personId}/SetRandomPassword").buildAndExpand(uriVariables).toUriString();

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
     * Ответить на вопросы анкеты.
     * 
     * <p><b>200</b> - OK
     * @param personId Идентификатор клиента. (required)
     * @param updateAnswers Ответы. (required)
     * @return ResultModelOfQuestionsErrorsModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfQuestionsErrorsModel userUpdateAnswers(Integer personId, List<QuestionAnswerModel> updateAnswers) throws RestClientException {
        return userUpdateAnswersWithHttpInfo(personId, updateAnswers).getBody();
    }

    /**
     * Ответить на вопросы анкеты.
     * 
     * <p><b>200</b> - OK
     * @param personId Идентификатор клиента. (required)
     * @param updateAnswers Ответы. (required)
     * @return ResponseEntity&lt;ResultModelOfQuestionsErrorsModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfQuestionsErrorsModel> userUpdateAnswersWithHttpInfo(Integer personId, List<QuestionAnswerModel> updateAnswers) throws RestClientException {
        Object postBody = updateAnswers;
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling userUpdateAnswers");
        }
        
        // verify the required parameter 'updateAnswers' is set
        if (updateAnswers == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updateAnswers' when calling userUpdateAnswers");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("personId", personId);
        String path = UriComponentsBuilder.fromPath("/api/Users/{personId}/UpdateAnswers").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfQuestionsErrorsModel> returnType = new ParameterizedTypeReference<ResultModelOfQuestionsErrorsModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Обновить информацию о подписках пользователя.
     * 
     * <p><b>200</b> - OK
     * @param personId Идентификатор клиента. (required)
     * @param subscriptions Подписки. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel userUpdateSubscriptions(Integer personId, List<SubscriptionViewModel> subscriptions) throws RestClientException {
        return userUpdateSubscriptionsWithHttpInfo(personId, subscriptions).getBody();
    }

    /**
     * Обновить информацию о подписках пользователя.
     * 
     * <p><b>200</b> - OK
     * @param personId Идентификатор клиента. (required)
     * @param subscriptions Подписки. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> userUpdateSubscriptionsWithHttpInfo(Integer personId, List<SubscriptionViewModel> subscriptions) throws RestClientException {
        Object postBody = subscriptions;
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling userUpdateSubscriptions");
        }
        
        // verify the required parameter 'subscriptions' is set
        if (subscriptions == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'subscriptions' when calling userUpdateSubscriptions");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("personId", personId);
        String path = UriComponentsBuilder.fromPath("/api/Users/{personId}/Subscriptions").buildAndExpand(uriVariables).toUriString();

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
