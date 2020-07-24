package restclient.api;

import restclient.ApiClient;

import restclient.model.ResultModel;
import restclient.model.ResultModelOfBoolean;
import restclient.model.ResultModelOfEmitCardInfoModel;
import restclient.model.ResultModelOfListOfCardCompactInfoModel;
import restclient.model.ResultModelOfPagedViewModelOfSystemApiCardInfoModel;
import restclient.model.ResultModelOfSystemApiCardInfoModel;

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
@Component("restclient.api.CardApi")
public class CardApi {
    private ApiClient apiClient;

    public CardApi() {
        this(new ApiClient());
    }

    @Autowired
    public CardApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Проверка пароля карты.
     * 
     * <p><b>200</b> - OK
     * @param cardId Идентификатор карты. (required)
     * @param cardPassword Пароль. (required)
     * @return ResultModelOfBoolean
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfBoolean cardCheckCardPassword(Integer cardId, String cardPassword) throws RestClientException {
        return cardCheckCardPasswordWithHttpInfo(cardId, cardPassword).getBody();
    }

    /**
     * Проверка пароля карты.
     * 
     * <p><b>200</b> - OK
     * @param cardId Идентификатор карты. (required)
     * @param cardPassword Пароль. (required)
     * @return ResponseEntity&lt;ResultModelOfBoolean&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfBoolean> cardCheckCardPasswordWithHttpInfo(Integer cardId, String cardPassword) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'cardId' is set
        if (cardId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cardId' when calling cardCheckCardPassword");
        }
        
        // verify the required parameter 'cardPassword' is set
        if (cardPassword == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cardPassword' when calling cardCheckCardPassword");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("cardId", cardId);
        String path = UriComponentsBuilder.fromPath("/api/Cards/{cardId}/checkPassword").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cardPassword", cardPassword));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfBoolean> returnType = new ParameterizedTypeReference<ResultModelOfBoolean>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить информацию о карте по ее номеру.
     * 
     * <p><b>200</b> - OK
     * @param cardNumber Номер карты. (required)
     * @param loyaltyProgramId Идентификатор программы лояльности. (optional)
     * @return ResultModelOfSystemApiCardInfoModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfSystemApiCardInfoModel cardGetApiCards(String cardNumber, Integer loyaltyProgramId) throws RestClientException {
        return cardGetApiCardsWithHttpInfo(cardNumber, loyaltyProgramId).getBody();
    }

    /**
     * Получить информацию о карте по ее номеру.
     * 
     * <p><b>200</b> - OK
     * @param cardNumber Номер карты. (required)
     * @param loyaltyProgramId Идентификатор программы лояльности. (optional)
     * @return ResponseEntity&lt;ResultModelOfSystemApiCardInfoModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfSystemApiCardInfoModel> cardGetApiCardsWithHttpInfo(String cardNumber, Integer loyaltyProgramId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'cardNumber' is set
        if (cardNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cardNumber' when calling cardGetApiCards");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/Cards").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cardNumber", cardNumber));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "loyaltyProgramId", loyaltyProgramId));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfSystemApiCardInfoModel> returnType = new ParameterizedTypeReference<ResultModelOfSystemApiCardInfoModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить информацию о карте по ее идентификатору.
     * 
     * <p><b>200</b> - OK
     * @param cardId Номер карты. (required)
     * @return ResultModelOfSystemApiCardInfoModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfSystemApiCardInfoModel cardGetCardInfo(Integer cardId) throws RestClientException {
        return cardGetCardInfoWithHttpInfo(cardId).getBody();
    }

    /**
     * Получить информацию о карте по ее идентификатору.
     * 
     * <p><b>200</b> - OK
     * @param cardId Номер карты. (required)
     * @return ResponseEntity&lt;ResultModelOfSystemApiCardInfoModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfSystemApiCardInfoModel> cardGetCardInfoWithHttpInfo(Integer cardId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'cardId' is set
        if (cardId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cardId' when calling cardGetCardInfo");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("cardId", cardId);
        String path = UriComponentsBuilder.fromPath("/api/Cards/{cardId}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfSystemApiCardInfoModel> returnType = new ParameterizedTypeReference<ResultModelOfSystemApiCardInfoModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить список карт по магнитному номеру.
     * 
     * <p><b>200</b> - OK
     * @param stripNumbersStrip1 Магнитная полоса №1. (optional)
     * @param stripNumbersStrip2 Магнитная полоса №2. (optional)
     * @param stripNumbersStrip3 Магнитная полоса №3. (optional)
     * @return ResultModelOfPagedViewModelOfSystemApiCardInfoModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfSystemApiCardInfoModel cardGetCardInfoByStripNumber(String stripNumbersStrip1, String stripNumbersStrip2, String stripNumbersStrip3) throws RestClientException {
        return cardGetCardInfoByStripNumberWithHttpInfo(stripNumbersStrip1, stripNumbersStrip2, stripNumbersStrip3).getBody();
    }

    /**
     * Получить список карт по магнитному номеру.
     * 
     * <p><b>200</b> - OK
     * @param stripNumbersStrip1 Магнитная полоса №1. (optional)
     * @param stripNumbersStrip2 Магнитная полоса №2. (optional)
     * @param stripNumbersStrip3 Магнитная полоса №3. (optional)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfSystemApiCardInfoModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfSystemApiCardInfoModel> cardGetCardInfoByStripNumberWithHttpInfo(String stripNumbersStrip1, String stripNumbersStrip2, String stripNumbersStrip3) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/Cards").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "stripNumbers.strip1", stripNumbersStrip1));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "stripNumbers.strip2", stripNumbersStrip2));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "stripNumbers.strip3", stripNumbersStrip3));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfSystemApiCardInfoModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfSystemApiCardInfoModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить цепочку замен карт по идентификатору карты.
     * 
     * <p><b>200</b> - OK
     * @param cardId Идентификатор карты. (required)
     * @param from Начало выборки. (optional, default to 0)
     * @param count Количество элементов в цепочке. (optional, default to 10)
     * @return ResultModelOfPagedViewModelOfSystemApiCardInfoModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfSystemApiCardInfoModel cardGetCardReplacementsByCardId(Integer cardId, Integer from, Integer count) throws RestClientException {
        return cardGetCardReplacementsByCardIdWithHttpInfo(cardId, from, count).getBody();
    }

    /**
     * Получить цепочку замен карт по идентификатору карты.
     * 
     * <p><b>200</b> - OK
     * @param cardId Идентификатор карты. (required)
     * @param from Начало выборки. (optional, default to 0)
     * @param count Количество элементов в цепочке. (optional, default to 10)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfSystemApiCardInfoModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfSystemApiCardInfoModel> cardGetCardReplacementsByCardIdWithHttpInfo(Integer cardId, Integer from, Integer count) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'cardId' is set
        if (cardId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cardId' when calling cardGetCardReplacementsByCardId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("cardId", cardId);
        String path = UriComponentsBuilder.fromPath("/api/Cards/{cardId}/ReplacementChain").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfSystemApiCardInfoModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfSystemApiCardInfoModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить информацию по картам для диапазона карт. Карты должны быть из одной эмиссии. Количество карт в диапазоне не должно быть более 500.
     * 
     * <p><b>200</b> - OK
     * @param beginCardId Id карты начала диапазона. (required)
     * @param endCardId Id карты конца диапазона. (required)
     * @return ResultModelOfListOfCardCompactInfoModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfCardCompactInfoModel cardGetRange(Integer beginCardId, Integer endCardId) throws RestClientException {
        return cardGetRangeWithHttpInfo(beginCardId, endCardId).getBody();
    }

    /**
     * Получить информацию по картам для диапазона карт. Карты должны быть из одной эмиссии. Количество карт в диапазоне не должно быть более 500.
     * 
     * <p><b>200</b> - OK
     * @param beginCardId Id карты начала диапазона. (required)
     * @param endCardId Id карты конца диапазона. (required)
     * @return ResponseEntity&lt;ResultModelOfListOfCardCompactInfoModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfCardCompactInfoModel> cardGetRangeWithHttpInfo(Integer beginCardId, Integer endCardId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'beginCardId' is set
        if (beginCardId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'beginCardId' when calling cardGetRange");
        }
        
        // verify the required parameter 'endCardId' is set
        if (endCardId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'endCardId' when calling cardGetRange");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("beginCardId", beginCardId);
        uriVariables.put("endCardId", endCardId);
        String path = UriComponentsBuilder.fromPath("/api/Cards/Range/{beginCardId}/{endCardId}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfListOfCardCompactInfoModel> returnType = new ParameterizedTypeReference<ResultModelOfListOfCardCompactInfoModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Выдать карту.
     * 
     * <p><b>200</b> - OK
     * @param cardId Идентификатор карты. (required)
     * @param partnerId Идентификатор партнера, выдающего карту. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel cardIssueCard(Integer cardId, Integer partnerId) throws RestClientException {
        return cardIssueCardWithHttpInfo(cardId, partnerId).getBody();
    }

    /**
     * Выдать карту.
     * 
     * <p><b>200</b> - OK
     * @param cardId Идентификатор карты. (required)
     * @param partnerId Идентификатор партнера, выдающего карту. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> cardIssueCardWithHttpInfo(Integer cardId, Integer partnerId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'cardId' is set
        if (cardId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cardId' when calling cardIssueCard");
        }
        
        // verify the required parameter 'partnerId' is set
        if (partnerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partnerId' when calling cardIssueCard");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("cardId", cardId);
        String path = UriComponentsBuilder.fromPath("/api/Cards/{cardId}/Issue").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "partnerId", partnerId));

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
     * Получить информацию о настройках по выпуску карт.
     * 
     * <p><b>200</b> - OK
     * @return ResultModelOfEmitCardInfoModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfEmitCardInfoModel cardSetCardInfo() throws RestClientException {
        return cardSetCardInfoWithHttpInfo().getBody();
    }

    /**
     * Получить информацию о настройках по выпуску карт.
     * 
     * <p><b>200</b> - OK
     * @return ResponseEntity&lt;ResultModelOfEmitCardInfoModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfEmitCardInfoModel> cardSetCardInfoWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/Cards/SetCardInfo").build().toUriString();

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

        ParameterizedTypeReference<ResultModelOfEmitCardInfoModel> returnType = new ParameterizedTypeReference<ResultModelOfEmitCardInfoModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
