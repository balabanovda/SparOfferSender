package restclient.api;

import restclient.ApiClient;

import restclient.model.DeviceTypeViewModel;
import restclient.model.ResultModel;
import restclient.model.ResultModelOfDeviceTypeViewModel;
import restclient.model.ResultModelOfInt32;
import restclient.model.ResultModelOfPagedViewModelOfDeviceTypeViewModel;

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
@Component("restclient.api.DeviceTypeApi")
public class DeviceTypeApi {
    private ApiClient apiClient;

    public DeviceTypeApi() {
        this(new ApiClient());
    }

    @Autowired
    public DeviceTypeApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Архивировать тип кассы.
     * 
     * <p><b>200</b> - OK
     * @param id Индификатор типа кассы. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel deviceTypeArchiveDeviceType(Integer id) throws RestClientException {
        return deviceTypeArchiveDeviceTypeWithHttpInfo(id).getBody();
    }

    /**
     * Архивировать тип кассы.
     * 
     * <p><b>200</b> - OK
     * @param id Индификатор типа кассы. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> deviceTypeArchiveDeviceTypeWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deviceTypeArchiveDeviceType");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/DeviceTypes/{id}").buildAndExpand(uriVariables).toUriString();

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
     * Создает тип кассы.
     * 
     * <p><b>201</b> - Created
     * @param model Модель типа кассы. (required)
     * @return ResultModelOfInt32
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfInt32 deviceTypeCreateDeviceType(DeviceTypeViewModel model) throws RestClientException {
        return deviceTypeCreateDeviceTypeWithHttpInfo(model).getBody();
    }

    /**
     * Создает тип кассы.
     * 
     * <p><b>201</b> - Created
     * @param model Модель типа кассы. (required)
     * @return ResponseEntity&lt;ResultModelOfInt32&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfInt32> deviceTypeCreateDeviceTypeWithHttpInfo(DeviceTypeViewModel model) throws RestClientException {
        Object postBody = model;
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling deviceTypeCreateDeviceType");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/DeviceTypes").build().toUriString();

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
     * Возвращает тип кассы.
     * 
     * <p><b>200</b> - OK
     * @param id Индификатор типа кассы. (required)
     * @return ResultModelOfDeviceTypeViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfDeviceTypeViewModel deviceTypeGet(Integer id) throws RestClientException {
        return deviceTypeGetWithHttpInfo(id).getBody();
    }

    /**
     * Возвращает тип кассы.
     * 
     * <p><b>200</b> - OK
     * @param id Индификатор типа кассы. (required)
     * @return ResponseEntity&lt;ResultModelOfDeviceTypeViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfDeviceTypeViewModel> deviceTypeGetWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deviceTypeGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/DeviceTypes/{id}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfDeviceTypeViewModel> returnType = new ParameterizedTypeReference<ResultModelOfDeviceTypeViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Возвращает список всех типов касс.
     * 
     * <p><b>200</b> - OK
     * @param from Начало выборки. (optional, default to 0)
     * @param count Количество. (optional, default to 10)
     * @param filterSearchedText Текст поиска. (optional)
     * @param filterVersion Версия поиска. (optional)
     * @param filterCondition Состояние. (optional)
     * @param filterEncodingType Тип кодировки. (optional)
     * @param filterSortingIds Идентификаторы типов касс, выводимых в начале списка. (optional)
     * @return ResultModelOfPagedViewModelOfDeviceTypeViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfDeviceTypeViewModel deviceTypeGetAll(Integer from, Integer count, String filterSearchedText, String filterVersion, String filterCondition, String filterEncodingType, List<Integer> filterSortingIds) throws RestClientException {
        return deviceTypeGetAllWithHttpInfo(from, count, filterSearchedText, filterVersion, filterCondition, filterEncodingType, filterSortingIds).getBody();
    }

    /**
     * Возвращает список всех типов касс.
     * 
     * <p><b>200</b> - OK
     * @param from Начало выборки. (optional, default to 0)
     * @param count Количество. (optional, default to 10)
     * @param filterSearchedText Текст поиска. (optional)
     * @param filterVersion Версия поиска. (optional)
     * @param filterCondition Состояние. (optional)
     * @param filterEncodingType Тип кодировки. (optional)
     * @param filterSortingIds Идентификаторы типов касс, выводимых в начале списка. (optional)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfDeviceTypeViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfDeviceTypeViewModel> deviceTypeGetAllWithHttpInfo(Integer from, Integer count, String filterSearchedText, String filterVersion, String filterCondition, String filterEncodingType, List<Integer> filterSortingIds) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/DeviceTypes").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.searchedText", filterSearchedText));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.version", filterVersion));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.condition", filterCondition));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.encodingType", filterEncodingType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "filter.sortingIds", filterSortingIds));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfDeviceTypeViewModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfDeviceTypeViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Восстановить тип кассы.
     * 
     * <p><b>200</b> - OK
     * @param id Индификатор типа кассы. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel deviceTypeRestoreDeviceType(Integer id) throws RestClientException {
        return deviceTypeRestoreDeviceTypeWithHttpInfo(id).getBody();
    }

    /**
     * Восстановить тип кассы.
     * 
     * <p><b>200</b> - OK
     * @param id Индификатор типа кассы. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> deviceTypeRestoreDeviceTypeWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deviceTypeRestoreDeviceType");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/DeviceTypes/{id}/restore").buildAndExpand(uriVariables).toUriString();

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
     * Обновить тип кассы.
     * 
     * <p><b>200</b> - OK
     * @param id Индификатор типа кассы. (required)
     * @param model Обновляемая модель типа кассы. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel deviceTypeUpdateDeviceType(Integer id, DeviceTypeViewModel model) throws RestClientException {
        return deviceTypeUpdateDeviceTypeWithHttpInfo(id, model).getBody();
    }

    /**
     * Обновить тип кассы.
     * 
     * <p><b>200</b> - OK
     * @param id Индификатор типа кассы. (required)
     * @param model Обновляемая модель типа кассы. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> deviceTypeUpdateDeviceTypeWithHttpInfo(Integer id, DeviceTypeViewModel model) throws RestClientException {
        Object postBody = model;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deviceTypeUpdateDeviceType");
        }
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling deviceTypeUpdateDeviceType");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/DeviceTypes/{id}").buildAndExpand(uriVariables).toUriString();

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
