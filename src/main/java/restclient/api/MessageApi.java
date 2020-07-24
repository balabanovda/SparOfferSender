package restclient.api;

import restclient.ApiClient;

import java.time.OffsetDateTime;
import restclient.model.ResultModelOfChatBotMessageViewModel;
import restclient.model.ResultModelOfListOfString;
import restclient.model.ResultModelOfMailMessageViewModel;
import restclient.model.ResultModelOfPagedViewModelOfChatBotMessageViewModel;
import restclient.model.ResultModelOfPagedViewModelOfMailMessageViewModel;
import restclient.model.ResultModelOfPagedViewModelOfPushMessageViewModel;
import restclient.model.ResultModelOfPagedViewModelOfSmsMessageViewModel;
import restclient.model.ResultModelOfPagedViewModelOfSocialNetworksMessageViewModel;
import restclient.model.ResultModelOfPagedViewModelOfViberMessageViewModel;
import restclient.model.ResultModelOfPushMessageViewModel;
import restclient.model.ResultModelOfSmsMessageViewModel;
import restclient.model.ResultModelOfSocialNetworksMessageViewModel;
import restclient.model.ResultModelOfViberMessageViewModel;
import java.util.UUID;

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
@Component("restclient.api.MessageApi")
public class MessageApi {
    private ApiClient apiClient;

    public MessageApi() {
        this(new ApiClient());
    }

    @Autowired
    public MessageApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Получает chatBot сообщение.
     * 
     * <p><b>200</b> - OK
     * @param chatBotId Идентификатор. (required)
     * @return ResultModelOfChatBotMessageViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfChatBotMessageViewModel messageGetChatBotMessage(Long chatBotId) throws RestClientException {
        return messageGetChatBotMessageWithHttpInfo(chatBotId).getBody();
    }

    /**
     * Получает chatBot сообщение.
     * 
     * <p><b>200</b> - OK
     * @param chatBotId Идентификатор. (required)
     * @return ResponseEntity&lt;ResultModelOfChatBotMessageViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfChatBotMessageViewModel> messageGetChatBotMessageWithHttpInfo(Long chatBotId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'chatBotId' is set
        if (chatBotId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'chatBotId' when calling messageGetChatBotMessage");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("chatBotId", chatBotId);
        String path = UriComponentsBuilder.fromPath("/api/messages/chatBot/{chatBotId}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfChatBotMessageViewModel> returnType = new ParameterizedTypeReference<ResultModelOfChatBotMessageViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получает список chatbot сообщений.
     * 
     * <p><b>200</b> - OK
     * @param from Начало выборки. (optional, default to 0)
     * @param count Количество. (optional, default to 10)
     * @param filterDateFrom  (optional)
     * @param filterDateTo  (optional)
     * @param filterPhone  (optional)
     * @param filterState  (optional)
     * @param filterPersonUid  (optional)
     * @return ResultModelOfPagedViewModelOfChatBotMessageViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfChatBotMessageViewModel messageGetChatBotMessages(Integer from, Integer count, OffsetDateTime filterDateFrom, OffsetDateTime filterDateTo, String filterPhone, List<String> filterState, UUID filterPersonUid) throws RestClientException {
        return messageGetChatBotMessagesWithHttpInfo(from, count, filterDateFrom, filterDateTo, filterPhone, filterState, filterPersonUid).getBody();
    }

    /**
     * Получает список chatbot сообщений.
     * 
     * <p><b>200</b> - OK
     * @param from Начало выборки. (optional, default to 0)
     * @param count Количество. (optional, default to 10)
     * @param filterDateFrom  (optional)
     * @param filterDateTo  (optional)
     * @param filterPhone  (optional)
     * @param filterState  (optional)
     * @param filterPersonUid  (optional)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfChatBotMessageViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfChatBotMessageViewModel> messageGetChatBotMessagesWithHttpInfo(Integer from, Integer count, OffsetDateTime filterDateFrom, OffsetDateTime filterDateTo, String filterPhone, List<String> filterState, UUID filterPersonUid) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/messages/chatBot").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.dateFrom", filterDateFrom));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.dateTo", filterDateTo));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.phone", filterPhone));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "filter.state", filterState));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.personUid", filterPersonUid));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfChatBotMessageViewModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfChatBotMessageViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получает информацию о mail сообщении.
     * 
     * <p><b>200</b> - OK
     * @param mailId Идентификатор mail сообщения. (required)
     * @return ResultModelOfMailMessageViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfMailMessageViewModel messageGetMailMessage(Long mailId) throws RestClientException {
        return messageGetMailMessageWithHttpInfo(mailId).getBody();
    }

    /**
     * Получает информацию о mail сообщении.
     * 
     * <p><b>200</b> - OK
     * @param mailId Идентификатор mail сообщения. (required)
     * @return ResponseEntity&lt;ResultModelOfMailMessageViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfMailMessageViewModel> messageGetMailMessageWithHttpInfo(Long mailId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'mailId' is set
        if (mailId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailId' when calling messageGetMailMessage");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("mailId", mailId);
        String path = UriComponentsBuilder.fromPath("/api/messages/mail/{mailId}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfMailMessageViewModel> returnType = new ParameterizedTypeReference<ResultModelOfMailMessageViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получает список отправленных mail сообщений.
     * 
     * <p><b>200</b> - OK
     * @param from Начало выборки. (optional, default to 0)
     * @param count Количество. (optional, default to 10)
     * @param filterDateFrom  (optional)
     * @param filterDateTo  (optional)
     * @param filterToEmail  (optional)
     * @param filterHeader  (optional)
     * @param filterState  (optional)
     * @param filterPersonUid  (optional)
     * @return ResultModelOfPagedViewModelOfMailMessageViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfMailMessageViewModel messageGetMailMessages(Integer from, Integer count, OffsetDateTime filterDateFrom, OffsetDateTime filterDateTo, String filterToEmail, String filterHeader, List<String> filterState, UUID filterPersonUid) throws RestClientException {
        return messageGetMailMessagesWithHttpInfo(from, count, filterDateFrom, filterDateTo, filterToEmail, filterHeader, filterState, filterPersonUid).getBody();
    }

    /**
     * Получает список отправленных mail сообщений.
     * 
     * <p><b>200</b> - OK
     * @param from Начало выборки. (optional, default to 0)
     * @param count Количество. (optional, default to 10)
     * @param filterDateFrom  (optional)
     * @param filterDateTo  (optional)
     * @param filterToEmail  (optional)
     * @param filterHeader  (optional)
     * @param filterState  (optional)
     * @param filterPersonUid  (optional)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfMailMessageViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfMailMessageViewModel> messageGetMailMessagesWithHttpInfo(Integer from, Integer count, OffsetDateTime filterDateFrom, OffsetDateTime filterDateTo, String filterToEmail, String filterHeader, List<String> filterState, UUID filterPersonUid) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/messages/mail").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.dateFrom", filterDateFrom));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.dateTo", filterDateTo));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.toEmail", filterToEmail));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.header", filterHeader));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "filter.state", filterState));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.personUid", filterPersonUid));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfMailMessageViewModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfMailMessageViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получает нотификаторы из сообщений.
     * 
     * <p><b>200</b> - OK
     * @param messagesNotifiersFilterPersonUid Гуид пользователя. (optional)
     * @param messagesNotifiersFilterNotifyType Тип нотификатора. (optional)
     * @param messagesNotifiersFilterSubstring Подстрока для поиска. (optional)
     * @return ResultModelOfListOfString
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfString messageGetMessagesNotifiers(UUID messagesNotifiersFilterPersonUid, String messagesNotifiersFilterNotifyType, String messagesNotifiersFilterSubstring) throws RestClientException {
        return messageGetMessagesNotifiersWithHttpInfo(messagesNotifiersFilterPersonUid, messagesNotifiersFilterNotifyType, messagesNotifiersFilterSubstring).getBody();
    }

    /**
     * Получает нотификаторы из сообщений.
     * 
     * <p><b>200</b> - OK
     * @param messagesNotifiersFilterPersonUid Гуид пользователя. (optional)
     * @param messagesNotifiersFilterNotifyType Тип нотификатора. (optional)
     * @param messagesNotifiersFilterSubstring Подстрока для поиска. (optional)
     * @return ResponseEntity&lt;ResultModelOfListOfString&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfString> messageGetMessagesNotifiersWithHttpInfo(UUID messagesNotifiersFilterPersonUid, String messagesNotifiersFilterNotifyType, String messagesNotifiersFilterSubstring) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/messages/notifiers").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "messagesNotifiersFilter.personUid", messagesNotifiersFilterPersonUid));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "messagesNotifiersFilter.notifyType", messagesNotifiersFilterNotifyType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "messagesNotifiersFilter.substring", messagesNotifiersFilterSubstring));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfListOfString> returnType = new ParameterizedTypeReference<ResultModelOfListOfString>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получает push сообщение.
     * 
     * <p><b>200</b> - OK
     * @param pushId Идентификатор. (required)
     * @return ResultModelOfPushMessageViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPushMessageViewModel messageGetPushMessage(Long pushId) throws RestClientException {
        return messageGetPushMessageWithHttpInfo(pushId).getBody();
    }

    /**
     * Получает push сообщение.
     * 
     * <p><b>200</b> - OK
     * @param pushId Идентификатор. (required)
     * @return ResponseEntity&lt;ResultModelOfPushMessageViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPushMessageViewModel> messageGetPushMessageWithHttpInfo(Long pushId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'pushId' is set
        if (pushId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pushId' when calling messageGetPushMessage");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("pushId", pushId);
        String path = UriComponentsBuilder.fromPath("/api/messages/push/{pushId}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfPushMessageViewModel> returnType = new ParameterizedTypeReference<ResultModelOfPushMessageViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получает список push сообщений.
     * 
     * <p><b>200</b> - OK
     * @param from Начало выборки. (optional, default to 0)
     * @param count Количество. (optional, default to 10)
     * @param filterDateFrom  (optional)
     * @param filterDateTo  (optional)
     * @param filterPlatformType  (optional)
     * @param filterState  (optional)
     * @param filterHeader  (optional)
     * @param filterPersonUid  (optional)
     * @return ResultModelOfPagedViewModelOfPushMessageViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfPushMessageViewModel messageGetPushMessages(Integer from, Integer count, OffsetDateTime filterDateFrom, OffsetDateTime filterDateTo, List<String> filterPlatformType, List<String> filterState, String filterHeader, UUID filterPersonUid) throws RestClientException {
        return messageGetPushMessagesWithHttpInfo(from, count, filterDateFrom, filterDateTo, filterPlatformType, filterState, filterHeader, filterPersonUid).getBody();
    }

    /**
     * Получает список push сообщений.
     * 
     * <p><b>200</b> - OK
     * @param from Начало выборки. (optional, default to 0)
     * @param count Количество. (optional, default to 10)
     * @param filterDateFrom  (optional)
     * @param filterDateTo  (optional)
     * @param filterPlatformType  (optional)
     * @param filterState  (optional)
     * @param filterHeader  (optional)
     * @param filterPersonUid  (optional)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfPushMessageViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfPushMessageViewModel> messageGetPushMessagesWithHttpInfo(Integer from, Integer count, OffsetDateTime filterDateFrom, OffsetDateTime filterDateTo, List<String> filterPlatformType, List<String> filterState, String filterHeader, UUID filterPersonUid) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/messages/push").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.dateFrom", filterDateFrom));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.dateTo", filterDateTo));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "filter.platformType", filterPlatformType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "filter.state", filterState));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.header", filterHeader));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.personUid", filterPersonUid));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfPushMessageViewModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfPushMessageViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получает информацию о sms сообщении.
     * 
     * <p><b>200</b> - OK
     * @param smsId Идентификатор sms сообщения. (required)
     * @return ResultModelOfSmsMessageViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfSmsMessageViewModel messageGetSmsMessage(Long smsId) throws RestClientException {
        return messageGetSmsMessageWithHttpInfo(smsId).getBody();
    }

    /**
     * Получает информацию о sms сообщении.
     * 
     * <p><b>200</b> - OK
     * @param smsId Идентификатор sms сообщения. (required)
     * @return ResponseEntity&lt;ResultModelOfSmsMessageViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfSmsMessageViewModel> messageGetSmsMessageWithHttpInfo(Long smsId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'smsId' is set
        if (smsId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'smsId' when calling messageGetSmsMessage");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("smsId", smsId);
        String path = UriComponentsBuilder.fromPath("/api/messages/sms/{smsId}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfSmsMessageViewModel> returnType = new ParameterizedTypeReference<ResultModelOfSmsMessageViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получает список отправленных смс сообщений.
     * 
     * <p><b>200</b> - OK
     * @param from Начало выборки. (optional, default to 0)
     * @param count Количество. (optional, default to 10)
     * @param filterDateFrom  (optional)
     * @param filterDateTo  (optional)
     * @param filterPhone  (optional)
     * @param filterPersonUid  (optional)
     * @param filterState  (optional)
     * @return ResultModelOfPagedViewModelOfSmsMessageViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfSmsMessageViewModel messageGetSmsMessages(Integer from, Integer count, OffsetDateTime filterDateFrom, OffsetDateTime filterDateTo, String filterPhone, UUID filterPersonUid, List<String> filterState) throws RestClientException {
        return messageGetSmsMessagesWithHttpInfo(from, count, filterDateFrom, filterDateTo, filterPhone, filterPersonUid, filterState).getBody();
    }

    /**
     * Получает список отправленных смс сообщений.
     * 
     * <p><b>200</b> - OK
     * @param from Начало выборки. (optional, default to 0)
     * @param count Количество. (optional, default to 10)
     * @param filterDateFrom  (optional)
     * @param filterDateTo  (optional)
     * @param filterPhone  (optional)
     * @param filterPersonUid  (optional)
     * @param filterState  (optional)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfSmsMessageViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfSmsMessageViewModel> messageGetSmsMessagesWithHttpInfo(Integer from, Integer count, OffsetDateTime filterDateFrom, OffsetDateTime filterDateTo, String filterPhone, UUID filterPersonUid, List<String> filterState) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/messages/sms").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.dateFrom", filterDateFrom));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.dateTo", filterDateTo));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.phone", filterPhone));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.personUid", filterPersonUid));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "filter.state", filterState));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfSmsMessageViewModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfSmsMessageViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получает socialNetwork сообщение.
     * 
     * <p><b>200</b> - OK
     * @param socialNetworksId Идентификатор. (required)
     * @return ResultModelOfSocialNetworksMessageViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfSocialNetworksMessageViewModel messageGetSocialNetworksMessage(Long socialNetworksId) throws RestClientException {
        return messageGetSocialNetworksMessageWithHttpInfo(socialNetworksId).getBody();
    }

    /**
     * Получает socialNetwork сообщение.
     * 
     * <p><b>200</b> - OK
     * @param socialNetworksId Идентификатор. (required)
     * @return ResponseEntity&lt;ResultModelOfSocialNetworksMessageViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfSocialNetworksMessageViewModel> messageGetSocialNetworksMessageWithHttpInfo(Long socialNetworksId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'socialNetworksId' is set
        if (socialNetworksId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'socialNetworksId' when calling messageGetSocialNetworksMessage");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("socialNetworksId", socialNetworksId);
        String path = UriComponentsBuilder.fromPath("/api/messages/socialNetworks/{socialNetworksId}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfSocialNetworksMessageViewModel> returnType = new ParameterizedTypeReference<ResultModelOfSocialNetworksMessageViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получает список socialNetworks сообщений.
     * 
     * <p><b>200</b> - OK
     * @param from Начало выборки. (optional, default to 0)
     * @param count Количество. (optional, default to 10)
     * @param filterDateFrom  (optional)
     * @param filterDateTo  (optional)
     * @param filterPhone  (optional)
     * @param filterState  (optional)
     * @param filterPersonUid  (optional)
     * @return ResultModelOfPagedViewModelOfSocialNetworksMessageViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfSocialNetworksMessageViewModel messageGetSocialNetworksMessages(Integer from, Integer count, OffsetDateTime filterDateFrom, OffsetDateTime filterDateTo, String filterPhone, List<String> filterState, UUID filterPersonUid) throws RestClientException {
        return messageGetSocialNetworksMessagesWithHttpInfo(from, count, filterDateFrom, filterDateTo, filterPhone, filterState, filterPersonUid).getBody();
    }

    /**
     * Получает список socialNetworks сообщений.
     * 
     * <p><b>200</b> - OK
     * @param from Начало выборки. (optional, default to 0)
     * @param count Количество. (optional, default to 10)
     * @param filterDateFrom  (optional)
     * @param filterDateTo  (optional)
     * @param filterPhone  (optional)
     * @param filterState  (optional)
     * @param filterPersonUid  (optional)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfSocialNetworksMessageViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfSocialNetworksMessageViewModel> messageGetSocialNetworksMessagesWithHttpInfo(Integer from, Integer count, OffsetDateTime filterDateFrom, OffsetDateTime filterDateTo, String filterPhone, List<String> filterState, UUID filterPersonUid) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/messages/socialNetworks").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.dateFrom", filterDateFrom));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.dateTo", filterDateTo));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.phone", filterPhone));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "filter.state", filterState));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.personUid", filterPersonUid));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfSocialNetworksMessageViewModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfSocialNetworksMessageViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получает viber сообщение.
     * 
     * <p><b>200</b> - OK
     * @param viberId Идентификатор. (required)
     * @return ResultModelOfViberMessageViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfViberMessageViewModel messageGetViberMessage(Long viberId) throws RestClientException {
        return messageGetViberMessageWithHttpInfo(viberId).getBody();
    }

    /**
     * Получает viber сообщение.
     * 
     * <p><b>200</b> - OK
     * @param viberId Идентификатор. (required)
     * @return ResponseEntity&lt;ResultModelOfViberMessageViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfViberMessageViewModel> messageGetViberMessageWithHttpInfo(Long viberId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'viberId' is set
        if (viberId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'viberId' when calling messageGetViberMessage");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("viberId", viberId);
        String path = UriComponentsBuilder.fromPath("/api/messages/viber/{viberId}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfViberMessageViewModel> returnType = new ParameterizedTypeReference<ResultModelOfViberMessageViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получает список viber сообщений.
     * 
     * <p><b>200</b> - OK
     * @param from Начало выборки. (optional, default to 0)
     * @param count Количество. (optional, default to 10)
     * @param filterDateFrom  (optional)
     * @param filterDateTo  (optional)
     * @param filterPhone  (optional)
     * @param filterState  (optional)
     * @param filterPersonUid  (optional)
     * @return ResultModelOfPagedViewModelOfViberMessageViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfViberMessageViewModel messageGetViberMessages(Integer from, Integer count, OffsetDateTime filterDateFrom, OffsetDateTime filterDateTo, String filterPhone, List<String> filterState, UUID filterPersonUid) throws RestClientException {
        return messageGetViberMessagesWithHttpInfo(from, count, filterDateFrom, filterDateTo, filterPhone, filterState, filterPersonUid).getBody();
    }

    /**
     * Получает список viber сообщений.
     * 
     * <p><b>200</b> - OK
     * @param from Начало выборки. (optional, default to 0)
     * @param count Количество. (optional, default to 10)
     * @param filterDateFrom  (optional)
     * @param filterDateTo  (optional)
     * @param filterPhone  (optional)
     * @param filterState  (optional)
     * @param filterPersonUid  (optional)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfViberMessageViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfViberMessageViewModel> messageGetViberMessagesWithHttpInfo(Integer from, Integer count, OffsetDateTime filterDateFrom, OffsetDateTime filterDateTo, String filterPhone, List<String> filterState, UUID filterPersonUid) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/messages/viber").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.dateFrom", filterDateFrom));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.dateTo", filterDateTo));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.phone", filterPhone));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "filter.state", filterState));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.personUid", filterPersonUid));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfViberMessageViewModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfViberMessageViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
