package restclient.api;

import restclient.ApiClient;

import restclient.model.ActivatedCardModel;
import restclient.model.BlockAccountModel;
import restclient.model.BlockCardModel;
import restclient.model.ChangeCardCategoryModel;
import restclient.model.ChangeEmailModel;
import restclient.model.ChangePhoneModel;
import restclient.model.CompleteCallModel;
import restclient.model.DeleteCardModel;
import restclient.model.DeregisterPersonModel;
import restclient.model.ReplacePersonCardModel;
import restclient.model.ResultModel;
import restclient.model.SendNewPasswordModel;
import restclient.model.UnBlockCardModel;
import restclient.model.UpdateSubscriptionsModel;
import restclient.model.UpdateTicketModel;

import java.util.List;

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
@Component("restclient.api.CallCenterApi")
public class CallCenterApi {
    private ApiClient apiClient;

    public CallCenterApi() {
        this(new ApiClient());
    }

    @Autowired
    public CallCenterApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Активация карты.
     * 
     * <p><b>200</b> - OK
     * @param activatedCardModel Модель активации. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel callCenterActivatedCard(ActivatedCardModel activatedCardModel) throws RestClientException {
        return callCenterActivatedCardWithHttpInfo(activatedCardModel).getBody();
    }

    /**
     * Активация карты.
     * 
     * <p><b>200</b> - OK
     * @param activatedCardModel Модель активации. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> callCenterActivatedCardWithHttpInfo(ActivatedCardModel activatedCardModel) throws RestClientException {
        Object postBody = activatedCardModel;
        
        // verify the required parameter 'activatedCardModel' is set
        if (activatedCardModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'activatedCardModel' when calling callCenterActivatedCard");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/CallCenter/ActivatedCard").build().toUriString();

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
     * Блокировка счета.
     * 
     * <p><b>200</b> - OK
     * @param blockAccountModel Модель для операции блокировки счета. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel callCenterBlockAccount(BlockAccountModel blockAccountModel) throws RestClientException {
        return callCenterBlockAccountWithHttpInfo(blockAccountModel).getBody();
    }

    /**
     * Блокировка счета.
     * 
     * <p><b>200</b> - OK
     * @param blockAccountModel Модель для операции блокировки счета. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> callCenterBlockAccountWithHttpInfo(BlockAccountModel blockAccountModel) throws RestClientException {
        Object postBody = blockAccountModel;
        
        // verify the required parameter 'blockAccountModel' is set
        if (blockAccountModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'blockAccountModel' when calling callCenterBlockAccount");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/CallCenter/BlockAccount").build().toUriString();

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
     * Блокирует карту.
     * 
     * <p><b>200</b> - OK
     * @param blockCardModel Модель для блокировки карт. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel callCenterBlockCard(BlockCardModel blockCardModel) throws RestClientException {
        return callCenterBlockCardWithHttpInfo(blockCardModel).getBody();
    }

    /**
     * Блокирует карту.
     * 
     * <p><b>200</b> - OK
     * @param blockCardModel Модель для блокировки карт. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> callCenterBlockCardWithHttpInfo(BlockCardModel blockCardModel) throws RestClientException {
        Object postBody = blockCardModel;
        
        // verify the required parameter 'blockCardModel' is set
        if (blockCardModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'blockCardModel' when calling callCenterBlockCard");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/CallCenter/BlockCard").build().toUriString();

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
     * Смена категории для карты.
     * 
     * <p><b>200</b> - OK
     * @param changeCardCategory Данные для смены категории карты. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel callCenterChangeCardCategory(ChangeCardCategoryModel changeCardCategory) throws RestClientException {
        return callCenterChangeCardCategoryWithHttpInfo(changeCardCategory).getBody();
    }

    /**
     * Смена категории для карты.
     * 
     * <p><b>200</b> - OK
     * @param changeCardCategory Данные для смены категории карты. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> callCenterChangeCardCategoryWithHttpInfo(ChangeCardCategoryModel changeCardCategory) throws RestClientException {
        Object postBody = changeCardCategory;
        
        // verify the required parameter 'changeCardCategory' is set
        if (changeCardCategory == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'changeCardCategory' when calling callCenterChangeCardCategory");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/CallCenter/ChangeCardCategory").build().toUriString();

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
     * Измененяет модель Email.
     * 
     * <p><b>200</b> - OK
     * @param changeEmailModel Модель для смены email. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel callCenterChangeEmail(ChangeEmailModel changeEmailModel) throws RestClientException {
        return callCenterChangeEmailWithHttpInfo(changeEmailModel).getBody();
    }

    /**
     * Измененяет модель Email.
     * 
     * <p><b>200</b> - OK
     * @param changeEmailModel Модель для смены email. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> callCenterChangeEmailWithHttpInfo(ChangeEmailModel changeEmailModel) throws RestClientException {
        Object postBody = changeEmailModel;
        
        // verify the required parameter 'changeEmailModel' is set
        if (changeEmailModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'changeEmailModel' when calling callCenterChangeEmail");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/CallCenter/ChangeEmail").build().toUriString();

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
     * Измененяет номера телефона.
     * 
     * <p><b>200</b> - OK
     * @param changePhoneModel Модель для смены телефона. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel callCenterChangePhone(ChangePhoneModel changePhoneModel) throws RestClientException {
        return callCenterChangePhoneWithHttpInfo(changePhoneModel).getBody();
    }

    /**
     * Измененяет номера телефона.
     * 
     * <p><b>200</b> - OK
     * @param changePhoneModel Модель для смены телефона. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> callCenterChangePhoneWithHttpInfo(ChangePhoneModel changePhoneModel) throws RestClientException {
        Object postBody = changePhoneModel;
        
        // verify the required parameter 'changePhoneModel' is set
        if (changePhoneModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'changePhoneModel' when calling callCenterChangePhone");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/CallCenter/ChangePhone").build().toUriString();

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
     * Завершение звонка клиента.
     * 
     * <p><b>200</b> - OK
     * @param model Данные о причинах обращения в тех. поддержку. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel callCenterCompleteCall(CompleteCallModel model) throws RestClientException {
        return callCenterCompleteCallWithHttpInfo(model).getBody();
    }

    /**
     * Завершение звонка клиента.
     * 
     * <p><b>200</b> - OK
     * @param model Данные о причинах обращения в тех. поддержку. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> callCenterCompleteCallWithHttpInfo(CompleteCallModel model) throws RestClientException {
        Object postBody = model;
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling callCenterCompleteCall");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/CallCenter/CompleteCall").build().toUriString();

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
     * Удаление карты клиента.
     * 
     * <p><b>200</b> - OK
     * @param deleteCardModel Данные для удаления карты. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel callCenterDeleteCard(DeleteCardModel deleteCardModel) throws RestClientException {
        return callCenterDeleteCardWithHttpInfo(deleteCardModel).getBody();
    }

    /**
     * Удаление карты клиента.
     * 
     * <p><b>200</b> - OK
     * @param deleteCardModel Данные для удаления карты. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> callCenterDeleteCardWithHttpInfo(DeleteCardModel deleteCardModel) throws RestClientException {
        Object postBody = deleteCardModel;
        
        // verify the required parameter 'deleteCardModel' is set
        if (deleteCardModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'deleteCardModel' when calling callCenterDeleteCard");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/CallCenter/DeleteCard").build().toUriString();

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
     * Дерегистрировать пользователя.
     * 
     * <p><b>200</b> - OK
     * @param model Модель с параметрами. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel callCenterDeregisterPerson(DeregisterPersonModel model) throws RestClientException {
        return callCenterDeregisterPersonWithHttpInfo(model).getBody();
    }

    /**
     * Дерегистрировать пользователя.
     * 
     * <p><b>200</b> - OK
     * @param model Модель с параметрами. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> callCenterDeregisterPersonWithHttpInfo(DeregisterPersonModel model) throws RestClientException {
        Object postBody = model;
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling callCenterDeregisterPerson");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/CallCenter/DeregisterPerson").build().toUriString();

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
     * Восстановление карты.
     * 
     * <p><b>200</b> - OK
     * @param recoverCardModel Данные для восстановления карты. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel callCenterRecoverCard(DeleteCardModel recoverCardModel) throws RestClientException {
        return callCenterRecoverCardWithHttpInfo(recoverCardModel).getBody();
    }

    /**
     * Восстановление карты.
     * 
     * <p><b>200</b> - OK
     * @param recoverCardModel Данные для восстановления карты. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> callCenterRecoverCardWithHttpInfo(DeleteCardModel recoverCardModel) throws RestClientException {
        Object postBody = recoverCardModel;
        
        // verify the required parameter 'recoverCardModel' is set
        if (recoverCardModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'recoverCardModel' when calling callCenterRecoverCard");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/CallCenter/RecoverCard").build().toUriString();

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
     * Заменяет карты.
     * 
     * <p><b>200</b> - OK
     * @param replacePersonCardModel Модель для замены карты клиента. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel callCenterReplacePersonCard(ReplacePersonCardModel replacePersonCardModel) throws RestClientException {
        return callCenterReplacePersonCardWithHttpInfo(replacePersonCardModel).getBody();
    }

    /**
     * Заменяет карты.
     * 
     * <p><b>200</b> - OK
     * @param replacePersonCardModel Модель для замены карты клиента. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> callCenterReplacePersonCardWithHttpInfo(ReplacePersonCardModel replacePersonCardModel) throws RestClientException {
        Object postBody = replacePersonCardModel;
        
        // verify the required parameter 'replacePersonCardModel' is set
        if (replacePersonCardModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'replacePersonCardModel' when calling callCenterReplacePersonCard");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/CallCenter/ReplaceCard").build().toUriString();

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
     * Установить новый пароль для клиента и выслать на почту.
     * 
     * <p><b>200</b> - OK
     * @param sendNewPasswordModel Модель для отправки нового пароля. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel callCenterSendNewPasswordToEmail(SendNewPasswordModel sendNewPasswordModel) throws RestClientException {
        return callCenterSendNewPasswordToEmailWithHttpInfo(sendNewPasswordModel).getBody();
    }

    /**
     * Установить новый пароль для клиента и выслать на почту.
     * 
     * <p><b>200</b> - OK
     * @param sendNewPasswordModel Модель для отправки нового пароля. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> callCenterSendNewPasswordToEmailWithHttpInfo(SendNewPasswordModel sendNewPasswordModel) throws RestClientException {
        Object postBody = sendNewPasswordModel;
        
        // verify the required parameter 'sendNewPasswordModel' is set
        if (sendNewPasswordModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sendNewPasswordModel' when calling callCenterSendNewPasswordToEmail");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/CallCenter/SendNewPasswordToEmail").build().toUriString();

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
     * Установить новый пароль для клиента и выслать на телефон.
     * 
     * <p><b>200</b> - OK
     * @param sendNewPasswordModel Модель для отправки нового пароля. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel callCenterSendNewPasswordToPhone(SendNewPasswordModel sendNewPasswordModel) throws RestClientException {
        return callCenterSendNewPasswordToPhoneWithHttpInfo(sendNewPasswordModel).getBody();
    }

    /**
     * Установить новый пароль для клиента и выслать на телефон.
     * 
     * <p><b>200</b> - OK
     * @param sendNewPasswordModel Модель для отправки нового пароля. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> callCenterSendNewPasswordToPhoneWithHttpInfo(SendNewPasswordModel sendNewPasswordModel) throws RestClientException {
        Object postBody = sendNewPasswordModel;
        
        // verify the required parameter 'sendNewPasswordModel' is set
        if (sendNewPasswordModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sendNewPasswordModel' when calling callCenterSendNewPasswordToPhone");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/CallCenter/SendNewPasswordToPhone").build().toUriString();

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
     * Разблокировка счета.
     * 
     * <p><b>200</b> - OK
     * @param blockAccountModel Модель для операции блокировки счета. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel callCenterUnBlockAccount(BlockAccountModel blockAccountModel) throws RestClientException {
        return callCenterUnBlockAccountWithHttpInfo(blockAccountModel).getBody();
    }

    /**
     * Разблокировка счета.
     * 
     * <p><b>200</b> - OK
     * @param blockAccountModel Модель для операции блокировки счета. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> callCenterUnBlockAccountWithHttpInfo(BlockAccountModel blockAccountModel) throws RestClientException {
        Object postBody = blockAccountModel;
        
        // verify the required parameter 'blockAccountModel' is set
        if (blockAccountModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'blockAccountModel' when calling callCenterUnBlockAccount");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/CallCenter/UnBlockAccount").build().toUriString();

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
     * Разблокирует карту.
     * 
     * <p><b>200</b> - OK
     * @param unBlockCardModel Модель для разблокировки карты. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel callCenterUnBlockCard(UnBlockCardModel unBlockCardModel) throws RestClientException {
        return callCenterUnBlockCardWithHttpInfo(unBlockCardModel).getBody();
    }

    /**
     * Разблокирует карту.
     * 
     * <p><b>200</b> - OK
     * @param unBlockCardModel Модель для разблокировки карты. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> callCenterUnBlockCardWithHttpInfo(UnBlockCardModel unBlockCardModel) throws RestClientException {
        Object postBody = unBlockCardModel;
        
        // verify the required parameter 'unBlockCardModel' is set
        if (unBlockCardModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'unBlockCardModel' when calling callCenterUnBlockCard");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/CallCenter/UnBlockCard").build().toUriString();

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
     * Обновление подписок.
     * 
     * <p><b>200</b> - OK
     * @param updateSubscriptionsModel Модель для обновления подписок. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel callCenterUpdateSubscriptions(UpdateSubscriptionsModel updateSubscriptionsModel) throws RestClientException {
        return callCenterUpdateSubscriptionsWithHttpInfo(updateSubscriptionsModel).getBody();
    }

    /**
     * Обновление подписок.
     * 
     * <p><b>200</b> - OK
     * @param updateSubscriptionsModel Модель для обновления подписок. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> callCenterUpdateSubscriptionsWithHttpInfo(UpdateSubscriptionsModel updateSubscriptionsModel) throws RestClientException {
        Object postBody = updateSubscriptionsModel;
        
        // verify the required parameter 'updateSubscriptionsModel' is set
        if (updateSubscriptionsModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updateSubscriptionsModel' when calling callCenterUpdateSubscriptions");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/CallCenter/UpdateSubscriptions").build().toUriString();

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
     * Обновить тикет.
     * 
     * <p><b>200</b> - OK
     * @param updateTicketModel Модель с параметрами. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel callCenterUpdateTicket(UpdateTicketModel updateTicketModel) throws RestClientException {
        return callCenterUpdateTicketWithHttpInfo(updateTicketModel).getBody();
    }

    /**
     * Обновить тикет.
     * 
     * <p><b>200</b> - OK
     * @param updateTicketModel Модель с параметрами. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> callCenterUpdateTicketWithHttpInfo(UpdateTicketModel updateTicketModel) throws RestClientException {
        Object postBody = updateTicketModel;
        
        // verify the required parameter 'updateTicketModel' is set
        if (updateTicketModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updateTicketModel' when calling callCenterUpdateTicket");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/CallCenter/UpdateTicket").build().toUriString();

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
