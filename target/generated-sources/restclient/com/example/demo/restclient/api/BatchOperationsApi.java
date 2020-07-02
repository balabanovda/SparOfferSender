package com.example.demo.restclient.api;

import com.example.demo.restclient.ApiClient;

import com.example.demo.restclient.model.BatchOperationsViewModel;
import java.io.File;
import java.time.OffsetDateTime;
import com.example.demo.restclient.model.ResultModelOfBatchOperationsQueueInfo;
import com.example.demo.restclient.model.ResultModelOfBatchOperationsTransactionQueueInfo;
import com.example.demo.restclient.model.ResultModelOfBatchOperationsViewModel;
import com.example.demo.restclient.model.ResultModelOfInt32;
import com.example.demo.restclient.model.ResultModelOfPagedViewModelOfBatchOperationsBriefViewModel;
import com.example.demo.restclient.model.ResultModelOfPagedViewModelOfDeviceBriefViewModel;
import com.example.demo.restclient.model.ResultModelOfPagedViewModelOfOperationViewModel;
import com.example.demo.restclient.model.ResultModelOfParsedBatchOperationsModel;

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
@Component("com.example.demo.restclient.api.BatchOperationsApi")
public class BatchOperationsApi {
    private ApiClient apiClient;

    public BatchOperationsApi() {
        this(new ApiClient());
    }

    @Autowired
    public BatchOperationsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Выполняет начисление или списание средств со счетов группы карт.
     * 
     * <p><b>201</b> - Created
     * @param data Данные по операциям. (required)
     * @return ResultModelOfInt32
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfInt32 batchOperationsDeposit(BatchOperationsViewModel data) throws RestClientException {
        return batchOperationsDepositWithHttpInfo(data).getBody();
    }

    /**
     * Выполняет начисление или списание средств со счетов группы карт.
     * 
     * <p><b>201</b> - Created
     * @param data Данные по операциям. (required)
     * @return ResponseEntity&lt;ResultModelOfInt32&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfInt32> batchOperationsDepositWithHttpInfo(BatchOperationsViewModel data) throws RestClientException {
        Object postBody = data;
        
        // verify the required parameter 'data' is set
        if (data == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'data' when calling batchOperationsDeposit");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/deposit").build().toUriString();

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
     * Показывает доступные пользователю устройства(кассы) для операций начисления/списания.
     * 
     * <p><b>200</b> - OK
     * @param from С какого. (optional, default to 0)
     * @param count Сколько. (optional, default to 2147483647)
     * @param substring Подстрока для поиска. (optional, default to )
     * @param mode Режим вывода по признаку удаления. (optional)
     * @param loyaltyProgramId Ид программы лояльности. (optional)
     * @return ResultModelOfPagedViewModelOfDeviceBriefViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfDeviceBriefViewModel batchOperationsGetAvailableDevices(Integer from, Integer count, String substring, String mode, Integer loyaltyProgramId) throws RestClientException {
        return batchOperationsGetAvailableDevicesWithHttpInfo(from, count, substring, mode, loyaltyProgramId).getBody();
    }

    /**
     * Показывает доступные пользователю устройства(кассы) для операций начисления/списания.
     * 
     * <p><b>200</b> - OK
     * @param from С какого. (optional, default to 0)
     * @param count Сколько. (optional, default to 2147483647)
     * @param substring Подстрока для поиска. (optional, default to )
     * @param mode Режим вывода по признаку удаления. (optional)
     * @param loyaltyProgramId Ид программы лояльности. (optional)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfDeviceBriefViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfDeviceBriefViewModel> batchOperationsGetAvailableDevicesWithHttpInfo(Integer from, Integer count, String substring, String mode, Integer loyaltyProgramId) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/deposit/devices").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "substring", substring));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "mode", mode));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "loyaltyProgramId", loyaltyProgramId));

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
     * Получить список операций по ID пакета.
     * 
     * <p><b>200</b> - OK
     * @param batchId ID пакетной операции. (required)
     * @return ResultModelOfBatchOperationsViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfBatchOperationsViewModel batchOperationsGetBatch(Integer batchId) throws RestClientException {
        return batchOperationsGetBatchWithHttpInfo(batchId).getBody();
    }

    /**
     * Получить список операций по ID пакета.
     * 
     * <p><b>200</b> - OK
     * @param batchId ID пакетной операции. (required)
     * @return ResponseEntity&lt;ResultModelOfBatchOperationsViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfBatchOperationsViewModel> batchOperationsGetBatchWithHttpInfo(Integer batchId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'batchId' is set
        if (batchId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'batchId' when calling batchOperationsGetBatch");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("batchId", batchId);
        String path = UriComponentsBuilder.fromPath("/api/deposit/{batchId}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfBatchOperationsViewModel> returnType = new ParameterizedTypeReference<ResultModelOfBatchOperationsViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить информацию о фоновой обработке операций для группы операций.
     * 
     * <p><b>200</b> - OK
     * @param batchId Id группы операций. (required)
     * @return ResultModelOfBatchOperationsQueueInfo
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfBatchOperationsQueueInfo batchOperationsGetBatchOperationsQueueProgress(Integer batchId) throws RestClientException {
        return batchOperationsGetBatchOperationsQueueProgressWithHttpInfo(batchId).getBody();
    }

    /**
     * Получить информацию о фоновой обработке операций для группы операций.
     * 
     * <p><b>200</b> - OK
     * @param batchId Id группы операций. (required)
     * @return ResponseEntity&lt;ResultModelOfBatchOperationsQueueInfo&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfBatchOperationsQueueInfo> batchOperationsGetBatchOperationsQueueProgressWithHttpInfo(Integer batchId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'batchId' is set
        if (batchId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'batchId' when calling batchOperationsGetBatchOperationsQueueProgress");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("batchId", batchId);
        String path = UriComponentsBuilder.fromPath("/api/deposit/{batchId}/progress").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfBatchOperationsQueueInfo> returnType = new ParameterizedTypeReference<ResultModelOfBatchOperationsQueueInfo>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить информацию о фоновой обработке транзакций операций для группы операций.
     * 
     * <p><b>200</b> - OK
     * @param batchId Id группы операций. (required)
     * @return ResultModelOfBatchOperationsTransactionQueueInfo
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfBatchOperationsTransactionQueueInfo batchOperationsGetBatchOperationsTransactionQueueProgress(Integer batchId) throws RestClientException {
        return batchOperationsGetBatchOperationsTransactionQueueProgressWithHttpInfo(batchId).getBody();
    }

    /**
     * Получить информацию о фоновой обработке транзакций операций для группы операций.
     * 
     * <p><b>200</b> - OK
     * @param batchId Id группы операций. (required)
     * @return ResponseEntity&lt;ResultModelOfBatchOperationsTransactionQueueInfo&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfBatchOperationsTransactionQueueInfo> batchOperationsGetBatchOperationsTransactionQueueProgressWithHttpInfo(Integer batchId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'batchId' is set
        if (batchId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'batchId' when calling batchOperationsGetBatchOperationsTransactionQueueProgress");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("batchId", batchId);
        String path = UriComponentsBuilder.fromPath("/api/deposit/{batchId}/transactionProgress").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfBatchOperationsTransactionQueueInfo> returnType = new ParameterizedTypeReference<ResultModelOfBatchOperationsTransactionQueueInfo>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить список ошибочных операций для группы операций в виде csv-файла.
     * 
     * <p><b>200</b> - OK
     * @param batchId Id группы операций. (required)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object batchOperationsGetErrorOperationsCsv(Integer batchId) throws RestClientException {
        return batchOperationsGetErrorOperationsCsvWithHttpInfo(batchId).getBody();
    }

    /**
     * Получить список ошибочных операций для группы операций в виде csv-файла.
     * 
     * <p><b>200</b> - OK
     * @param batchId Id группы операций. (required)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> batchOperationsGetErrorOperationsCsvWithHttpInfo(Integer batchId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'batchId' is set
        if (batchId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'batchId' when calling batchOperationsGetErrorOperationsCsv");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("batchId", batchId);
        String path = UriComponentsBuilder.fromPath("/api/deposit/{batchId}/exportErrors").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json", "text/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<Object> returnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получает историю операций в виде csv-файла.
     * 
     * <p><b>200</b> - OK
     * @param timeZone Часовой пояс. (required)
     * @param filterFromDate Начало периода. (optional)
     * @param filterToDate Конец периода. (optional)
     * @param filterType Тип операций. (optional)
     * @param filterState Состояние операции. (optional)
     * @param filterCardNumber Номер карты. (optional)
     * @param filterLoyaltyPrograms Список программ лояльности. (optional)
     * @param filterMarketingCampaigns Список маркетинговых компаний. (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object batchOperationsGetHistoryCsv(Integer timeZone, OffsetDateTime filterFromDate, OffsetDateTime filterToDate, String filterType, String filterState, String filterCardNumber, List<Integer> filterLoyaltyPrograms, List<Integer> filterMarketingCampaigns) throws RestClientException {
        return batchOperationsGetHistoryCsvWithHttpInfo(timeZone, filterFromDate, filterToDate, filterType, filterState, filterCardNumber, filterLoyaltyPrograms, filterMarketingCampaigns).getBody();
    }

    /**
     * Получает историю операций в виде csv-файла.
     * 
     * <p><b>200</b> - OK
     * @param timeZone Часовой пояс. (required)
     * @param filterFromDate Начало периода. (optional)
     * @param filterToDate Конец периода. (optional)
     * @param filterType Тип операций. (optional)
     * @param filterState Состояние операции. (optional)
     * @param filterCardNumber Номер карты. (optional)
     * @param filterLoyaltyPrograms Список программ лояльности. (optional)
     * @param filterMarketingCampaigns Список маркетинговых компаний. (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> batchOperationsGetHistoryCsvWithHttpInfo(Integer timeZone, OffsetDateTime filterFromDate, OffsetDateTime filterToDate, String filterType, String filterState, String filterCardNumber, List<Integer> filterLoyaltyPrograms, List<Integer> filterMarketingCampaigns) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'timeZone' is set
        if (timeZone == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'timeZone' when calling batchOperationsGetHistoryCsv");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/deposit/export").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "timeZone", timeZone));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.fromDate", filterFromDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.toDate", filterToDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.type", filterType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.state", filterState));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.cardNumber", filterCardNumber));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "filter.loyaltyPrograms", filterLoyaltyPrograms));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "filter.marketingCampaigns", filterMarketingCampaigns));

        final String[] accepts = { 
            "application/json", "text/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<Object> returnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить список операций по ID пакета.
     * 
     * <p><b>200</b> - OK
     * @param batchId ID пакетной операции. (required)
     * @param from Начальный элемент. (optional, default to 0)
     * @param count Количество элементов. (optional, default to 100)
     * @return ResultModelOfPagedViewModelOfOperationViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfOperationViewModel batchOperationsGetOperations(Integer batchId, Integer from, Integer count) throws RestClientException {
        return batchOperationsGetOperationsWithHttpInfo(batchId, from, count).getBody();
    }

    /**
     * Получить список операций по ID пакета.
     * 
     * <p><b>200</b> - OK
     * @param batchId ID пакетной операции. (required)
     * @param from Начальный элемент. (optional, default to 0)
     * @param count Количество элементов. (optional, default to 100)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfOperationViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfOperationViewModel> batchOperationsGetOperationsWithHttpInfo(Integer batchId, Integer from, Integer count) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'batchId' is set
        if (batchId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'batchId' when calling batchOperationsGetOperations");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("batchId", batchId);
        String path = UriComponentsBuilder.fromPath("/api/deposit/{batchId}/operations").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfOperationViewModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfOperationViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить список номеров карт и соответствующих сумм для списания/начисления, извлеченных из CSV-файла.
     * 
     * <p><b>200</b> - OK
     * @param file file to upload (required)
     * @return ResultModelOfParsedBatchOperationsModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfParsedBatchOperationsModel batchOperationsGetOperationsDataFromCsv(File file) throws RestClientException {
        return batchOperationsGetOperationsDataFromCsvWithHttpInfo(file).getBody();
    }

    /**
     * Получить список номеров карт и соответствующих сумм для списания/начисления, извлеченных из CSV-файла.
     * 
     * <p><b>200</b> - OK
     * @param file file to upload (required)
     * @return ResponseEntity&lt;ResultModelOfParsedBatchOperationsModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfParsedBatchOperationsModel> batchOperationsGetOperationsDataFromCsvWithHttpInfo(File file) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'file' is set
        if (file == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'file' when calling batchOperationsGetOperationsDataFromCsv");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/deposit/validateCsv").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (file != null)
            formParams.add("file", new FileSystemResource(file));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "multipart/form-data"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfParsedBatchOperationsModel> returnType = new ParameterizedTypeReference<ResultModelOfParsedBatchOperationsModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить историю операций с бонусами.
     * 
     * <p><b>200</b> - OK
     * @param from Начальный элемент. (optional, default to 0)
     * @param count Количество элементов. (optional, default to 10)
     * @param filterFromDate Начало периода. (optional)
     * @param filterToDate Конец периода. (optional)
     * @param filterType Тип операций. (optional)
     * @param filterState Состояние операции. (optional)
     * @param filterCardNumber Номер карты. (optional)
     * @param filterLoyaltyPrograms Список программ лояльности. (optional)
     * @param filterMarketingCampaigns Список маркетинговых компаний. (optional)
     * @return ResultModelOfPagedViewModelOfBatchOperationsBriefViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfBatchOperationsBriefViewModel batchOperationsGetOperationsHistory(Integer from, Integer count, OffsetDateTime filterFromDate, OffsetDateTime filterToDate, String filterType, String filterState, String filterCardNumber, List<Integer> filterLoyaltyPrograms, List<Integer> filterMarketingCampaigns) throws RestClientException {
        return batchOperationsGetOperationsHistoryWithHttpInfo(from, count, filterFromDate, filterToDate, filterType, filterState, filterCardNumber, filterLoyaltyPrograms, filterMarketingCampaigns).getBody();
    }

    /**
     * Получить историю операций с бонусами.
     * 
     * <p><b>200</b> - OK
     * @param from Начальный элемент. (optional, default to 0)
     * @param count Количество элементов. (optional, default to 10)
     * @param filterFromDate Начало периода. (optional)
     * @param filterToDate Конец периода. (optional)
     * @param filterType Тип операций. (optional)
     * @param filterState Состояние операции. (optional)
     * @param filterCardNumber Номер карты. (optional)
     * @param filterLoyaltyPrograms Список программ лояльности. (optional)
     * @param filterMarketingCampaigns Список маркетинговых компаний. (optional)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfBatchOperationsBriefViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfBatchOperationsBriefViewModel> batchOperationsGetOperationsHistoryWithHttpInfo(Integer from, Integer count, OffsetDateTime filterFromDate, OffsetDateTime filterToDate, String filterType, String filterState, String filterCardNumber, List<Integer> filterLoyaltyPrograms, List<Integer> filterMarketingCampaigns) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/deposit").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.fromDate", filterFromDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.toDate", filterToDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.type", filterType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.state", filterState));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.cardNumber", filterCardNumber));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "filter.loyaltyPrograms", filterLoyaltyPrograms));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "filter.marketingCampaigns", filterMarketingCampaigns));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfBatchOperationsBriefViewModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfBatchOperationsBriefViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
