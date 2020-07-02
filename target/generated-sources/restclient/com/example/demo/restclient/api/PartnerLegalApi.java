package com.example.demo.restclient.api;

import com.example.demo.restclient.ApiClient;

import com.example.demo.restclient.model.AccountViewModel;
import com.example.demo.restclient.model.LegalViewModel;
import com.example.demo.restclient.model.ResultModel;
import com.example.demo.restclient.model.ResultModelOfInt32;
import com.example.demo.restclient.model.ResultModelOfLegalViewModel;
import com.example.demo.restclient.model.ResultModelOfListOfDeviceBriefViewModel;
import com.example.demo.restclient.model.ResultModelOfPagedViewModelOfAccountViewModel;
import com.example.demo.restclient.model.ResultModelOfPagedViewModelOfLegalViewModel;

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
@Component("com.example.demo.restclient.api.PartnerLegalApi")
public class PartnerLegalApi {
    private ApiClient apiClient;

    public PartnerLegalApi() {
        this(new ApiClient());
    }

    @Autowired
    public PartnerLegalApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Cоздание счета, принадлежащего юридическому лицу.
     * 
     * <p><b>201</b> - Created
     * @param partnerId Идентификатор партнера. (required)
     * @param legalId Идентификатор юридического лица. (required)
     * @param loyaltyProgramId Идентификатор прораммы лояльности. (required)
     * @param accountData Информация о создаваемом счете. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel partnerLegalCreateAccounts(Integer partnerId, Integer legalId, Integer loyaltyProgramId, AccountViewModel accountData) throws RestClientException {
        return partnerLegalCreateAccountsWithHttpInfo(partnerId, legalId, loyaltyProgramId, accountData).getBody();
    }

    /**
     * Cоздание счета, принадлежащего юридическому лицу.
     * 
     * <p><b>201</b> - Created
     * @param partnerId Идентификатор партнера. (required)
     * @param legalId Идентификатор юридического лица. (required)
     * @param loyaltyProgramId Идентификатор прораммы лояльности. (required)
     * @param accountData Информация о создаваемом счете. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> partnerLegalCreateAccountsWithHttpInfo(Integer partnerId, Integer legalId, Integer loyaltyProgramId, AccountViewModel accountData) throws RestClientException {
        Object postBody = accountData;
        
        // verify the required parameter 'partnerId' is set
        if (partnerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partnerId' when calling partnerLegalCreateAccounts");
        }
        
        // verify the required parameter 'legalId' is set
        if (legalId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'legalId' when calling partnerLegalCreateAccounts");
        }
        
        // verify the required parameter 'loyaltyProgramId' is set
        if (loyaltyProgramId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'loyaltyProgramId' when calling partnerLegalCreateAccounts");
        }
        
        // verify the required parameter 'accountData' is set
        if (accountData == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountData' when calling partnerLegalCreateAccounts");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("partnerId", partnerId);
        uriVariables.put("legalId", legalId);
        String path = UriComponentsBuilder.fromPath("/api/partners/{partnerId}/legals/{legalId}/accounts").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "loyaltyProgramId", loyaltyProgramId));

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
     * Добавление юридического лица партнеру.
     * 
     * <p><b>201</b> - Created
     * @param partnerId Идентификатор партнера. (required)
     * @param legalModel Модель юридического лица. (required)
     * @return ResultModelOfInt32
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfInt32 partnerLegalCreateLegal(Integer partnerId, LegalViewModel legalModel) throws RestClientException {
        return partnerLegalCreateLegalWithHttpInfo(partnerId, legalModel).getBody();
    }

    /**
     * Добавление юридического лица партнеру.
     * 
     * <p><b>201</b> - Created
     * @param partnerId Идентификатор партнера. (required)
     * @param legalModel Модель юридического лица. (required)
     * @return ResponseEntity&lt;ResultModelOfInt32&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfInt32> partnerLegalCreateLegalWithHttpInfo(Integer partnerId, LegalViewModel legalModel) throws RestClientException {
        Object postBody = legalModel;
        
        // verify the required parameter 'partnerId' is set
        if (partnerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partnerId' when calling partnerLegalCreateLegal");
        }
        
        // verify the required parameter 'legalModel' is set
        if (legalModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'legalModel' when calling partnerLegalCreateLegal");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("partnerId", partnerId);
        String path = UriComponentsBuilder.fromPath("/api/partners/{partnerId}/legals").buildAndExpand(uriVariables).toUriString();

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
     * Удаление юридического лица у партнера.
     * 
     * <p><b>200</b> - OK
     * @param partnerId Идентификатор партнера. (required)
     * @param legalId Идентификатор юридического лица. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel partnerLegalDeleteLegal(Integer partnerId, Integer legalId) throws RestClientException {
        return partnerLegalDeleteLegalWithHttpInfo(partnerId, legalId).getBody();
    }

    /**
     * Удаление юридического лица у партнера.
     * 
     * <p><b>200</b> - OK
     * @param partnerId Идентификатор партнера. (required)
     * @param legalId Идентификатор юридического лица. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> partnerLegalDeleteLegalWithHttpInfo(Integer partnerId, Integer legalId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'partnerId' is set
        if (partnerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partnerId' when calling partnerLegalDeleteLegal");
        }
        
        // verify the required parameter 'legalId' is set
        if (legalId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'legalId' when calling partnerLegalDeleteLegal");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("partnerId", partnerId);
        uriVariables.put("legalId", legalId);
        String path = UriComponentsBuilder.fromPath("/api/partners/{partnerId}/legals/{legalId}").buildAndExpand(uriVariables).toUriString();

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
     * Редактирование счета, принадлежащего юридическому лицу.
     * 
     * <p><b>200</b> - OK
     * @param partnerId Идентификатор партнера. (required)
     * @param legalId Идентификатор юридического лица. (required)
     * @param loyaltyProgramId Идентификатор прораммы лояльности. (required)
     * @param accountData Информация о редактируемом счете. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel partnerLegalEditAccounts(Integer partnerId, Integer legalId, Integer loyaltyProgramId, AccountViewModel accountData) throws RestClientException {
        return partnerLegalEditAccountsWithHttpInfo(partnerId, legalId, loyaltyProgramId, accountData).getBody();
    }

    /**
     * Редактирование счета, принадлежащего юридическому лицу.
     * 
     * <p><b>200</b> - OK
     * @param partnerId Идентификатор партнера. (required)
     * @param legalId Идентификатор юридического лица. (required)
     * @param loyaltyProgramId Идентификатор прораммы лояльности. (required)
     * @param accountData Информация о редактируемом счете. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> partnerLegalEditAccountsWithHttpInfo(Integer partnerId, Integer legalId, Integer loyaltyProgramId, AccountViewModel accountData) throws RestClientException {
        Object postBody = accountData;
        
        // verify the required parameter 'partnerId' is set
        if (partnerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partnerId' when calling partnerLegalEditAccounts");
        }
        
        // verify the required parameter 'legalId' is set
        if (legalId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'legalId' when calling partnerLegalEditAccounts");
        }
        
        // verify the required parameter 'loyaltyProgramId' is set
        if (loyaltyProgramId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'loyaltyProgramId' when calling partnerLegalEditAccounts");
        }
        
        // verify the required parameter 'accountData' is set
        if (accountData == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountData' when calling partnerLegalEditAccounts");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("partnerId", partnerId);
        uriVariables.put("legalId", legalId);
        String path = UriComponentsBuilder.fromPath("/api/partners/{partnerId}/legals/{legalId}/accounts").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "loyaltyProgramId", loyaltyProgramId));

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
     * Получение дебетовых счетов, принадлежащих юридическому лицу.
     * 
     * <p><b>200</b> - OK
     * @param partnerId Идентификатор партнера. (required)
     * @param legalId Идентификатор юридического лица. (required)
     * @param loyaltyProgramId Идентификатор прораммы лояльности. (required)
     * @param name Подстрока для поиска по названию валюты. (optional, default to )
     * @param from C. (optional, default to 0)
     * @param count Сколько. (optional, default to 10)
     * @return ResultModelOfPagedViewModelOfAccountViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfAccountViewModel partnerLegalGetAccounts(Integer partnerId, Integer legalId, Integer loyaltyProgramId, String name, Integer from, Integer count) throws RestClientException {
        return partnerLegalGetAccountsWithHttpInfo(partnerId, legalId, loyaltyProgramId, name, from, count).getBody();
    }

    /**
     * Получение дебетовых счетов, принадлежащих юридическому лицу.
     * 
     * <p><b>200</b> - OK
     * @param partnerId Идентификатор партнера. (required)
     * @param legalId Идентификатор юридического лица. (required)
     * @param loyaltyProgramId Идентификатор прораммы лояльности. (required)
     * @param name Подстрока для поиска по названию валюты. (optional, default to )
     * @param from C. (optional, default to 0)
     * @param count Сколько. (optional, default to 10)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfAccountViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfAccountViewModel> partnerLegalGetAccountsWithHttpInfo(Integer partnerId, Integer legalId, Integer loyaltyProgramId, String name, Integer from, Integer count) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'partnerId' is set
        if (partnerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partnerId' when calling partnerLegalGetAccounts");
        }
        
        // verify the required parameter 'legalId' is set
        if (legalId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'legalId' when calling partnerLegalGetAccounts");
        }
        
        // verify the required parameter 'loyaltyProgramId' is set
        if (loyaltyProgramId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'loyaltyProgramId' when calling partnerLegalGetAccounts");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("partnerId", partnerId);
        uriVariables.put("legalId", legalId);
        String path = UriComponentsBuilder.fromPath("/api/partners/{partnerId}/legals/{legalId}/accounts").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "loyaltyProgramId", loyaltyProgramId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfAccountViewModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfAccountViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получение доступных дебетовых касс для привязки к юр. лицу.
     * 
     * <p><b>200</b> - OK
     * @param partnerId Id партнера. (required)
     * @param legalId Id юр. лица. (required)
     * @return ResultModelOfListOfDeviceBriefViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfDeviceBriefViewModel partnerLegalGetAvailiableDebitDevices(Integer partnerId, Integer legalId) throws RestClientException {
        return partnerLegalGetAvailiableDebitDevicesWithHttpInfo(partnerId, legalId).getBody();
    }

    /**
     * Получение доступных дебетовых касс для привязки к юр. лицу.
     * 
     * <p><b>200</b> - OK
     * @param partnerId Id партнера. (required)
     * @param legalId Id юр. лица. (required)
     * @return ResponseEntity&lt;ResultModelOfListOfDeviceBriefViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfDeviceBriefViewModel> partnerLegalGetAvailiableDebitDevicesWithHttpInfo(Integer partnerId, Integer legalId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'partnerId' is set
        if (partnerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partnerId' when calling partnerLegalGetAvailiableDebitDevices");
        }
        
        // verify the required parameter 'legalId' is set
        if (legalId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'legalId' when calling partnerLegalGetAvailiableDebitDevices");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("partnerId", partnerId);
        uriVariables.put("legalId", legalId);
        String path = UriComponentsBuilder.fromPath("/api/partners/{partnerId}/legals/{legalId}/availableDevices").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfListOfDeviceBriefViewModel> returnType = new ParameterizedTypeReference<ResultModelOfListOfDeviceBriefViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получение юридического лица партнера по идентификатору.
     * 
     * <p><b>200</b> - OK
     * @param partnerId Идентификационный номер партнера. (required)
     * @param legalId Идентификационный номер юридического лица. (required)
     * @return ResultModelOfLegalViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfLegalViewModel partnerLegalGetLegal(Integer partnerId, Integer legalId) throws RestClientException {
        return partnerLegalGetLegalWithHttpInfo(partnerId, legalId).getBody();
    }

    /**
     * Получение юридического лица партнера по идентификатору.
     * 
     * <p><b>200</b> - OK
     * @param partnerId Идентификационный номер партнера. (required)
     * @param legalId Идентификационный номер юридического лица. (required)
     * @return ResponseEntity&lt;ResultModelOfLegalViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfLegalViewModel> partnerLegalGetLegalWithHttpInfo(Integer partnerId, Integer legalId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'partnerId' is set
        if (partnerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partnerId' when calling partnerLegalGetLegal");
        }
        
        // verify the required parameter 'legalId' is set
        if (legalId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'legalId' when calling partnerLegalGetLegal");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("partnerId", partnerId);
        uriVariables.put("legalId", legalId);
        String path = UriComponentsBuilder.fromPath("/api/partners/{partnerId}/legals/{legalId}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfLegalViewModel> returnType = new ParameterizedTypeReference<ResultModelOfLegalViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param partnerId  (required)
     * @param from  (optional, default to 0)
     * @param count  (optional, default to 10)
     * @param nameSubstring  (optional, default to )
     * @param status  (optional)
     * @param sortingIds  (optional)
     * @return ResultModelOfPagedViewModelOfLegalViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfLegalViewModel partnerLegalGetLegals(Integer partnerId, Integer from, Integer count, String nameSubstring, String status, List<Integer> sortingIds) throws RestClientException {
        return partnerLegalGetLegalsWithHttpInfo(partnerId, from, count, nameSubstring, status, sortingIds).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param partnerId  (required)
     * @param from  (optional, default to 0)
     * @param count  (optional, default to 10)
     * @param nameSubstring  (optional, default to )
     * @param status  (optional)
     * @param sortingIds  (optional)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfLegalViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfLegalViewModel> partnerLegalGetLegalsWithHttpInfo(Integer partnerId, Integer from, Integer count, String nameSubstring, String status, List<Integer> sortingIds) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'partnerId' is set
        if (partnerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partnerId' when calling partnerLegalGetLegals");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("partnerId", partnerId);
        String path = UriComponentsBuilder.fromPath("/api/partners/{partnerId}/legals").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "nameSubstring", nameSubstring));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "status", status));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "sortingIds", sortingIds));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfLegalViewModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfLegalViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Восстановление юридического лица у партнера.
     * 
     * <p><b>200</b> - OK
     * @param partnerId Идентификатор партнера. (required)
     * @param legalId Идентификатор юридического лица. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel partnerLegalRestoreLegal(Integer partnerId, Integer legalId) throws RestClientException {
        return partnerLegalRestoreLegalWithHttpInfo(partnerId, legalId).getBody();
    }

    /**
     * Восстановление юридического лица у партнера.
     * 
     * <p><b>200</b> - OK
     * @param partnerId Идентификатор партнера. (required)
     * @param legalId Идентификатор юридического лица. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> partnerLegalRestoreLegalWithHttpInfo(Integer partnerId, Integer legalId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'partnerId' is set
        if (partnerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partnerId' when calling partnerLegalRestoreLegal");
        }
        
        // verify the required parameter 'legalId' is set
        if (legalId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'legalId' when calling partnerLegalRestoreLegal");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("partnerId", partnerId);
        uriVariables.put("legalId", legalId);
        String path = UriComponentsBuilder.fromPath("/api/partners/{partnerId}/legals/{legalId}/restore").buildAndExpand(uriVariables).toUriString();

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
     * Изменение юридического лица у партнера.
     * 
     * <p><b>200</b> - OK
     * @param partnerId Идентификатор партнера. (required)
     * @param legalId Идентификатор юридического лица. (required)
     * @param legalModel Модель юридического лица. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel partnerLegalUpdateLegal(Integer partnerId, Integer legalId, LegalViewModel legalModel) throws RestClientException {
        return partnerLegalUpdateLegalWithHttpInfo(partnerId, legalId, legalModel).getBody();
    }

    /**
     * Изменение юридического лица у партнера.
     * 
     * <p><b>200</b> - OK
     * @param partnerId Идентификатор партнера. (required)
     * @param legalId Идентификатор юридического лица. (required)
     * @param legalModel Модель юридического лица. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> partnerLegalUpdateLegalWithHttpInfo(Integer partnerId, Integer legalId, LegalViewModel legalModel) throws RestClientException {
        Object postBody = legalModel;
        
        // verify the required parameter 'partnerId' is set
        if (partnerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partnerId' when calling partnerLegalUpdateLegal");
        }
        
        // verify the required parameter 'legalId' is set
        if (legalId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'legalId' when calling partnerLegalUpdateLegal");
        }
        
        // verify the required parameter 'legalModel' is set
        if (legalModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'legalModel' when calling partnerLegalUpdateLegal");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("partnerId", partnerId);
        uriVariables.put("legalId", legalId);
        String path = UriComponentsBuilder.fromPath("/api/partners/{partnerId}/legals/{legalId}").buildAndExpand(uriVariables).toUriString();

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
