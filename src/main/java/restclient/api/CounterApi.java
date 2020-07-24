package restclient.api;

import restclient.ApiClient;

import restclient.model.CounterViewModel;
import java.time.OffsetDateTime;
import restclient.model.ResultModel;
import restclient.model.ResultModelOfCounterViewModel;
import restclient.model.ResultModelOfListOfCounterTargetViewModel;
import restclient.model.ResultModelOfPagedViewModelOfCounterViewModel;

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
@Component("restclient.api.CounterApi")
public class CounterApi {
    private ApiClient apiClient;

    public CounterApi() {
        this(new ApiClient());
    }

    @Autowired
    public CounterApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Создание нового счётчика.
     * 
     * <p><b>201</b> - Created
     * @param model Модель. (required)
     * @return ResultModelOfCounterViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfCounterViewModel counterCreate(CounterViewModel model) throws RestClientException {
        return counterCreateWithHttpInfo(model).getBody();
    }

    /**
     * Создание нового счётчика.
     * 
     * <p><b>201</b> - Created
     * @param model Модель. (required)
     * @return ResponseEntity&lt;ResultModelOfCounterViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfCounterViewModel> counterCreateWithHttpInfo(CounterViewModel model) throws RestClientException {
        Object postBody = model;
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling counterCreate");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/Counters").build().toUriString();

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

        ParameterizedTypeReference<ResultModelOfCounterViewModel> returnType = new ParameterizedTypeReference<ResultModelOfCounterViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Возвращает счётчик по идентификатору.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор счётчика. (required)
     * @return ResultModelOfCounterViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfCounterViewModel counterGet(Integer id) throws RestClientException {
        return counterGetWithHttpInfo(id).getBody();
    }

    /**
     * Возвращает счётчик по идентификатору.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор счётчика. (required)
     * @return ResponseEntity&lt;ResultModelOfCounterViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfCounterViewModel> counterGetWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling counterGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/Counters/{id}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfCounterViewModel> returnType = new ParameterizedTypeReference<ResultModelOfCounterViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Возвращает список доступных счётчиков.
     * 
     * <p><b>200</b> - OK
     * @param filterEventType Тип события. (optional)
     * @param filterNameText Текст, содержащийся в названии счетчика. (optional)
     * @param filterCounterType Тип счетчика. (optional)
     * @param filterDateFrom С какой даты искать. (optional)
     * @param filterDateTo По какую дату искать. (optional)
     * @param filterPartners Список партнеров, по которым будут отфильтрованы счетчики. (optional)
     * @param filterFrom Начало выборки. (optional)
     * @param filterCount Количество. (optional)
     * @param filterLoyaltyProgramIds Список id программ лояльности, для фильтрации счетчиков. (optional)
     * @return ResultModelOfPagedViewModelOfCounterViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfCounterViewModel counterGetAvailableCounters(String filterEventType, String filterNameText, String filterCounterType, OffsetDateTime filterDateFrom, OffsetDateTime filterDateTo, List<Integer> filterPartners, Integer filterFrom, Integer filterCount, List<Integer> filterLoyaltyProgramIds) throws RestClientException {
        return counterGetAvailableCountersWithHttpInfo(filterEventType, filterNameText, filterCounterType, filterDateFrom, filterDateTo, filterPartners, filterFrom, filterCount, filterLoyaltyProgramIds).getBody();
    }

    /**
     * Возвращает список доступных счётчиков.
     * 
     * <p><b>200</b> - OK
     * @param filterEventType Тип события. (optional)
     * @param filterNameText Текст, содержащийся в названии счетчика. (optional)
     * @param filterCounterType Тип счетчика. (optional)
     * @param filterDateFrom С какой даты искать. (optional)
     * @param filterDateTo По какую дату искать. (optional)
     * @param filterPartners Список партнеров, по которым будут отфильтрованы счетчики. (optional)
     * @param filterFrom Начало выборки. (optional)
     * @param filterCount Количество. (optional)
     * @param filterLoyaltyProgramIds Список id программ лояльности, для фильтрации счетчиков. (optional)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfCounterViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfCounterViewModel> counterGetAvailableCountersWithHttpInfo(String filterEventType, String filterNameText, String filterCounterType, OffsetDateTime filterDateFrom, OffsetDateTime filterDateTo, List<Integer> filterPartners, Integer filterFrom, Integer filterCount, List<Integer> filterLoyaltyProgramIds) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/Counters").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.eventType", filterEventType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.nameText", filterNameText));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.counterType", filterCounterType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.dateFrom", filterDateFrom));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.dateTo", filterDateTo));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "filter.partners", filterPartners));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.from", filterFrom));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.count", filterCount));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "filter.loyaltyProgramIds", filterLoyaltyProgramIds));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfCounterViewModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfCounterViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Возвращает список параметров для счётчика.
     * 
     * <p><b>200</b> - OK
     * @param eventTypes Список типов событий. (required)
     * @return ResultModelOfListOfCounterTargetViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfCounterTargetViewModel counterGetTargets(List<String> eventTypes) throws RestClientException {
        return counterGetTargetsWithHttpInfo(eventTypes).getBody();
    }

    /**
     * Возвращает список параметров для счётчика.
     * 
     * <p><b>200</b> - OK
     * @param eventTypes Список типов событий. (required)
     * @return ResponseEntity&lt;ResultModelOfListOfCounterTargetViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfCounterTargetViewModel> counterGetTargetsWithHttpInfo(List<String> eventTypes) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'eventTypes' is set
        if (eventTypes == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'eventTypes' when calling counterGetTargets");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/Counters/Targets").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "eventTypes", eventTypes));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfListOfCounterTargetViewModel> returnType = new ParameterizedTypeReference<ResultModelOfListOfCounterTargetViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Редактирование счетчика.
     * 
     * <p><b>200</b> - OK
     * @param id Id редактируемого счетчика. (required)
     * @param model Модель счетчика. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel counterUpdateCounter(Integer id, CounterViewModel model) throws RestClientException {
        return counterUpdateCounterWithHttpInfo(id, model).getBody();
    }

    /**
     * Редактирование счетчика.
     * 
     * <p><b>200</b> - OK
     * @param id Id редактируемого счетчика. (required)
     * @param model Модель счетчика. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> counterUpdateCounterWithHttpInfo(Integer id, CounterViewModel model) throws RestClientException {
        Object postBody = model;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling counterUpdateCounter");
        }
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling counterUpdateCounter");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/Counters/{id}").buildAndExpand(uriVariables).toUriString();

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
