package restclient.api;

import restclient.ApiClient;

import restclient.model.CardViewModel;
import restclient.model.ConfirmCodeModel;
import restclient.model.ResultModel;
import restclient.model.ResultModelOfAttachCardState;
import restclient.model.ResultModelOfBeginAttachCardResultModel;
import restclient.model.ResultModelOfListOfSystemApiCardInfoModel;
import restclient.model.ResultModelOfSetCardActionInfoModel;
import restclient.model.SetCardModel;

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
@Component("restclient.api.UserCardsApi")
public class UserCardsApi {
    private ApiClient apiClient;

    public UserCardsApi() {
        this(new ApiClient());
    }

    @Autowired
    public UserCardsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Начинает действие по объединению карт.
     * 
     * <p><b>200</b> - OK
     * @param personId Идентификатор пользователя. (required)
     * @param attachCardModel ViewModel входных параметров привязки карты. (required)
     * @return ResultModelOfBeginAttachCardResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfBeginAttachCardResultModel userCardsAttachCard(Integer personId, CardViewModel attachCardModel) throws RestClientException {
        return userCardsAttachCardWithHttpInfo(personId, attachCardModel).getBody();
    }

    /**
     * Начинает действие по объединению карт.
     * 
     * <p><b>200</b> - OK
     * @param personId Идентификатор пользователя. (required)
     * @param attachCardModel ViewModel входных параметров привязки карты. (required)
     * @return ResponseEntity&lt;ResultModelOfBeginAttachCardResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfBeginAttachCardResultModel> userCardsAttachCardWithHttpInfo(Integer personId, CardViewModel attachCardModel) throws RestClientException {
        Object postBody = attachCardModel;
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling userCardsAttachCard");
        }
        
        // verify the required parameter 'attachCardModel' is set
        if (attachCardModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'attachCardModel' when calling userCardsAttachCard");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("personId", personId);
        String path = UriComponentsBuilder.fromPath("/api/users/{personId}/cards/Attach").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfBeginAttachCardResultModel> returnType = new ParameterizedTypeReference<ResultModelOfBeginAttachCardResultModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Отменяет начатое действие по присоединению карты.
     * 
     * <p><b>200</b> - OK
     * @param personId Идентификатор пользователя. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel userCardsAttachCardCancel(Integer personId) throws RestClientException {
        return userCardsAttachCardCancelWithHttpInfo(personId).getBody();
    }

    /**
     * Отменяет начатое действие по присоединению карты.
     * 
     * <p><b>200</b> - OK
     * @param personId Идентификатор пользователя. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> userCardsAttachCardCancelWithHttpInfo(Integer personId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling userCardsAttachCardCancel");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("personId", personId);
        String path = UriComponentsBuilder.fromPath("/api/users/{personId}/cards/Attach/Cancel").buildAndExpand(uriVariables).toUriString();

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
     * Завершает начатое действие по присоединению карты.
     * 
     * <p><b>200</b> - OK
     * @param personId Идентификатор пользователя. (required)
     * @param confirmCodeModel Модель кода подтверждения. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel userCardsAttachCardConfirm(Integer personId, ConfirmCodeModel confirmCodeModel) throws RestClientException {
        return userCardsAttachCardConfirmWithHttpInfo(personId, confirmCodeModel).getBody();
    }

    /**
     * Завершает начатое действие по присоединению карты.
     * 
     * <p><b>200</b> - OK
     * @param personId Идентификатор пользователя. (required)
     * @param confirmCodeModel Модель кода подтверждения. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> userCardsAttachCardConfirmWithHttpInfo(Integer personId, ConfirmCodeModel confirmCodeModel) throws RestClientException {
        Object postBody = confirmCodeModel;
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling userCardsAttachCardConfirm");
        }
        
        // verify the required parameter 'confirmCodeModel' is set
        if (confirmCodeModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'confirmCodeModel' when calling userCardsAttachCardConfirm");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("personId", personId);
        String path = UriComponentsBuilder.fromPath("/api/users/{personId}/cards/Attach/Confirm").buildAndExpand(uriVariables).toUriString();

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
     * Процесс \&quot;объединение карт\&quot;: повторная отправка кода подтверждения.
     * 
     * <p><b>200</b> - OK
     * @param personId Идентификатор пользователя. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel userCardsAttachCardSendConfirmCode(Integer personId) throws RestClientException {
        return userCardsAttachCardSendConfirmCodeWithHttpInfo(personId).getBody();
    }

    /**
     * Процесс \&quot;объединение карт\&quot;: повторная отправка кода подтверждения.
     * 
     * <p><b>200</b> - OK
     * @param personId Идентификатор пользователя. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> userCardsAttachCardSendConfirmCodeWithHttpInfo(Integer personId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling userCardsAttachCardSendConfirmCode");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("personId", personId);
        String path = UriComponentsBuilder.fromPath("/api/users/{personId}/cards/Attach/SendConfirmCode").buildAndExpand(uriVariables).toUriString();

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
     * Возвращает текущее состояние процесса присоединения карты.
     * 
     * <p><b>200</b> - OK
     * @param personId Идентификатор пользователя. (required)
     * @return ResultModelOfAttachCardState
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfAttachCardState userCardsAttachCardState(Integer personId) throws RestClientException {
        return userCardsAttachCardStateWithHttpInfo(personId).getBody();
    }

    /**
     * Возвращает текущее состояние процесса присоединения карты.
     * 
     * <p><b>200</b> - OK
     * @param personId Идентификатор пользователя. (required)
     * @return ResponseEntity&lt;ResultModelOfAttachCardState&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfAttachCardState> userCardsAttachCardStateWithHttpInfo(Integer personId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling userCardsAttachCardState");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("personId", personId);
        String path = UriComponentsBuilder.fromPath("/api/users/{personId}/cards/Attach").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfAttachCardState> returnType = new ParameterizedTypeReference<ResultModelOfAttachCardState>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить список не удаленных карт пользователя, владельцем которых он является.
     * 
     * <p><b>200</b> - OK
     * @param personId Идентификатор пользователя. (required)
     * @param cardShowMode Режим отображения карт пользователя. (optional, default to Active)
     * @return ResultModelOfListOfSystemApiCardInfoModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfSystemApiCardInfoModel userCardsGetCardsInfo(Integer personId, String cardShowMode) throws RestClientException {
        return userCardsGetCardsInfoWithHttpInfo(personId, cardShowMode).getBody();
    }

    /**
     * Получить список не удаленных карт пользователя, владельцем которых он является.
     * 
     * <p><b>200</b> - OK
     * @param personId Идентификатор пользователя. (required)
     * @param cardShowMode Режим отображения карт пользователя. (optional, default to Active)
     * @return ResponseEntity&lt;ResultModelOfListOfSystemApiCardInfoModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfSystemApiCardInfoModel> userCardsGetCardsInfoWithHttpInfo(Integer personId, String cardShowMode) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling userCardsGetCardsInfo");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("personId", personId);
        String path = UriComponentsBuilder.fromPath("/api/users/{personId}/cards").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cardShowMode", cardShowMode));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfListOfSystemApiCardInfoModel> returnType = new ParameterizedTypeReference<ResultModelOfListOfSystemApiCardInfoModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Добавление карты.
     * 
     * <p><b>200</b> - OK
     * @param personId Идентификатор пользователя. (required)
     * @param setCardModel Модель добавления карты. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel userCardsSetCard(Integer personId, SetCardModel setCardModel) throws RestClientException {
        return userCardsSetCardWithHttpInfo(personId, setCardModel).getBody();
    }

    /**
     * Добавление карты.
     * 
     * <p><b>200</b> - OK
     * @param personId Идентификатор пользователя. (required)
     * @param setCardModel Модель добавления карты. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> userCardsSetCardWithHttpInfo(Integer personId, SetCardModel setCardModel) throws RestClientException {
        Object postBody = setCardModel;
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling userCardsSetCard");
        }
        
        // verify the required parameter 'setCardModel' is set
        if (setCardModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'setCardModel' when calling userCardsSetCard");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("personId", personId);
        String path = UriComponentsBuilder.fromPath("/api/users/{personId}/cards/Set").buildAndExpand(uriVariables).toUriString();

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
     * Получить информацию о возможности прикрепления физической карты.
     * 
     * <p><b>200</b> - OK
     * @param personId Идентификатор пользователя. (required)
     * @return ResultModelOfSetCardActionInfoModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfSetCardActionInfoModel userCardsSetCardInfo(Integer personId) throws RestClientException {
        return userCardsSetCardInfoWithHttpInfo(personId).getBody();
    }

    /**
     * Получить информацию о возможности прикрепления физической карты.
     * 
     * <p><b>200</b> - OK
     * @param personId Идентификатор пользователя. (required)
     * @return ResponseEntity&lt;ResultModelOfSetCardActionInfoModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfSetCardActionInfoModel> userCardsSetCardInfoWithHttpInfo(Integer personId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling userCardsSetCardInfo");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("personId", personId);
        String path = UriComponentsBuilder.fromPath("/api/users/{personId}/cards/Set").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfSetCardActionInfoModel> returnType = new ParameterizedTypeReference<ResultModelOfSetCardActionInfoModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
