package restclient.api;

import restclient.ApiClient;

import restclient.model.PayTypeViewModel;
import restclient.model.ResultModel;
import restclient.model.ResultModelOfInt32;
import restclient.model.ResultModelOfPagedViewModelOfPayTypeViewModel;
import restclient.model.ResultModelOfPayTypeViewModel;

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
@Component("restclient.api.PayTypeApi")
public class PayTypeApi {
    private ApiClient apiClient;

    public PayTypeApi() {
        this(new ApiClient());
    }

    @Autowired
    public PayTypeApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Создает способ оплаты.
     * 
     * <p><b>201</b> - Created
     * @param payTypeViewModel Модель способа оплаты. (required)
     * @return ResultModelOfInt32
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfInt32 payTypeCreatePayType(PayTypeViewModel payTypeViewModel) throws RestClientException {
        return payTypeCreatePayTypeWithHttpInfo(payTypeViewModel).getBody();
    }

    /**
     * Создает способ оплаты.
     * 
     * <p><b>201</b> - Created
     * @param payTypeViewModel Модель способа оплаты. (required)
     * @return ResponseEntity&lt;ResultModelOfInt32&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfInt32> payTypeCreatePayTypeWithHttpInfo(PayTypeViewModel payTypeViewModel) throws RestClientException {
        Object postBody = payTypeViewModel;
        
        // verify the required parameter 'payTypeViewModel' is set
        if (payTypeViewModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'payTypeViewModel' when calling payTypeCreatePayType");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/payType").build().toUriString();

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
     * Убрать в архив способ оплаты.
     * 
     * <p><b>200</b> - OK
     * @param id Id способа оплаты. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel payTypeDeletePayType(Integer id) throws RestClientException {
        return payTypeDeletePayTypeWithHttpInfo(id).getBody();
    }

    /**
     * Убрать в архив способ оплаты.
     * 
     * <p><b>200</b> - OK
     * @param id Id способа оплаты. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> payTypeDeletePayTypeWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling payTypeDeletePayType");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/payType/{id}").buildAndExpand(uriVariables).toUriString();

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
     * Получить список всех способов оплаты.
     * 
     * <p><b>200</b> - OK
     * @param payTypeFilterName Название типа оплаты. (optional)
     * @param payTypeFilterCount Количество элементов в выборке. (optional)
     * @param payTypeFilterFrom С какого элемента начать выборку. (optional)
     * @return ResultModelOfPagedViewModelOfPayTypeViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfPayTypeViewModel payTypeGetList(String payTypeFilterName, Integer payTypeFilterCount, Integer payTypeFilterFrom) throws RestClientException {
        return payTypeGetListWithHttpInfo(payTypeFilterName, payTypeFilterCount, payTypeFilterFrom).getBody();
    }

    /**
     * Получить список всех способов оплаты.
     * 
     * <p><b>200</b> - OK
     * @param payTypeFilterName Название типа оплаты. (optional)
     * @param payTypeFilterCount Количество элементов в выборке. (optional)
     * @param payTypeFilterFrom С какого элемента начать выборку. (optional)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfPayTypeViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfPayTypeViewModel> payTypeGetListWithHttpInfo(String payTypeFilterName, Integer payTypeFilterCount, Integer payTypeFilterFrom) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/payType").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "payTypeFilter.name", payTypeFilterName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "payTypeFilter.count", payTypeFilterCount));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "payTypeFilter.from", payTypeFilterFrom));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfPayTypeViewModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfPayTypeViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получение информации по типу оплаты.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор типа оплаты. (required)
     * @return ResultModelOfPayTypeViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPayTypeViewModel payTypeGetPayType(Integer id) throws RestClientException {
        return payTypeGetPayTypeWithHttpInfo(id).getBody();
    }

    /**
     * Получение информации по типу оплаты.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор типа оплаты. (required)
     * @return ResponseEntity&lt;ResultModelOfPayTypeViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPayTypeViewModel> payTypeGetPayTypeWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling payTypeGetPayType");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/payType/{id}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfPayTypeViewModel> returnType = new ParameterizedTypeReference<ResultModelOfPayTypeViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Восстановление способа оплаты.
     * 
     * <p><b>200</b> - OK
     * @param id Id способа оплаты. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel payTypeRecoverPayType(Integer id) throws RestClientException {
        return payTypeRecoverPayTypeWithHttpInfo(id).getBody();
    }

    /**
     * Восстановление способа оплаты.
     * 
     * <p><b>200</b> - OK
     * @param id Id способа оплаты. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> payTypeRecoverPayTypeWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling payTypeRecoverPayType");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/payType/{id}/recover").buildAndExpand(uriVariables).toUriString();

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
     * Редактирование типа оплаты.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор способа оплаты. (required)
     * @param payTypeViewModel Модель для редактирования способа оплаты. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel payTypeUpdatePayType(Integer id, PayTypeViewModel payTypeViewModel) throws RestClientException {
        return payTypeUpdatePayTypeWithHttpInfo(id, payTypeViewModel).getBody();
    }

    /**
     * Редактирование типа оплаты.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор способа оплаты. (required)
     * @param payTypeViewModel Модель для редактирования способа оплаты. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> payTypeUpdatePayTypeWithHttpInfo(Integer id, PayTypeViewModel payTypeViewModel) throws RestClientException {
        Object postBody = payTypeViewModel;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling payTypeUpdatePayType");
        }
        
        // verify the required parameter 'payTypeViewModel' is set
        if (payTypeViewModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'payTypeViewModel' when calling payTypeUpdatePayType");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/payType/{id}").buildAndExpand(uriVariables).toUriString();

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
