package restclient.api;

import restclient.ApiClient;

import restclient.model.CouponEmissionViewModel;
import java.time.OffsetDateTime;
import restclient.model.ResultModel;
import restclient.model.ResultModelOfCouponEmissionViewModel;
import restclient.model.ResultModelOfInt32;
import restclient.model.ResultModelOfPagedViewModelOfCouponEmissionViewModel;
import restclient.model.ResultModelOfPagedViewModelOfCouponViewModel;

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
@Component("restclient.api.CouponEmissionApi")
public class CouponEmissionApi {
    private ApiClient apiClient;

    public CouponEmissionApi() {
        this(new ApiClient());
    }

    @Autowired
    public CouponEmissionApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Производит архивирование выпуска.
     * 
     * <p><b>200</b> - OK
     * @param emissionId Идентификатор выпуска. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel couponEmissionArchive(Integer emissionId) throws RestClientException {
        return couponEmissionArchiveWithHttpInfo(emissionId).getBody();
    }

    /**
     * Производит архивирование выпуска.
     * 
     * <p><b>200</b> - OK
     * @param emissionId Идентификатор выпуска. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> couponEmissionArchiveWithHttpInfo(Integer emissionId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'emissionId' is set
        if (emissionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'emissionId' when calling couponEmissionArchive");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("emissionId", emissionId);
        String path = UriComponentsBuilder.fromPath("/api/emissions/coupons/{emissionId}").buildAndExpand(uriVariables).toUriString();

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
     * Создание выпуска.
     * 
     * <p><b>201</b> - Created
     * @param viewModel Фильтр на создание. (required)
     * @return ResultModelOfInt32
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfInt32 couponEmissionCreate(CouponEmissionViewModel viewModel) throws RestClientException {
        return couponEmissionCreateWithHttpInfo(viewModel).getBody();
    }

    /**
     * Создание выпуска.
     * 
     * <p><b>201</b> - Created
     * @param viewModel Фильтр на создание. (required)
     * @return ResponseEntity&lt;ResultModelOfInt32&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfInt32> couponEmissionCreateWithHttpInfo(CouponEmissionViewModel viewModel) throws RestClientException {
        Object postBody = viewModel;
        
        // verify the required parameter 'viewModel' is set
        if (viewModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'viewModel' when calling couponEmissionCreate");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/emissions/coupons").build().toUriString();

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
     * Редактирование выпуска.
     * 
     * <p><b>200</b> - OK
     * @param emissionId Идентификатор выпуска. (required)
     * @param viewModel Параметры выпуска. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel couponEmissionEditEmission(Integer emissionId, CouponEmissionViewModel viewModel) throws RestClientException {
        return couponEmissionEditEmissionWithHttpInfo(emissionId, viewModel).getBody();
    }

    /**
     * Редактирование выпуска.
     * 
     * <p><b>200</b> - OK
     * @param emissionId Идентификатор выпуска. (required)
     * @param viewModel Параметры выпуска. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> couponEmissionEditEmissionWithHttpInfo(Integer emissionId, CouponEmissionViewModel viewModel) throws RestClientException {
        Object postBody = viewModel;
        
        // verify the required parameter 'emissionId' is set
        if (emissionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'emissionId' when calling couponEmissionEditEmission");
        }
        
        // verify the required parameter 'viewModel' is set
        if (viewModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'viewModel' when calling couponEmissionEditEmission");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("emissionId", emissionId);
        String path = UriComponentsBuilder.fromPath("/api/emissions/coupons/{emissionId}").buildAndExpand(uriVariables).toUriString();

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
     * Получает список купонов.
     * 
     * <p><b>200</b> - OK
     * @param emissionId Идентификатор эмиссии. (required)
     * @param state Состояние. (optional, default to Issued)
     * @param from Начало выборки. (optional, default to 0)
     * @param count Количество. (optional, default to 10)
     * @return ResultModelOfPagedViewModelOfCouponViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfCouponViewModel couponEmissionGetApiCouponsByEmissionByEmissionId(Integer emissionId, String state, Integer from, Integer count) throws RestClientException {
        return couponEmissionGetApiCouponsByEmissionByEmissionIdWithHttpInfo(emissionId, state, from, count).getBody();
    }

    /**
     * Получает список купонов.
     * 
     * <p><b>200</b> - OK
     * @param emissionId Идентификатор эмиссии. (required)
     * @param state Состояние. (optional, default to Issued)
     * @param from Начало выборки. (optional, default to 0)
     * @param count Количество. (optional, default to 10)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfCouponViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfCouponViewModel> couponEmissionGetApiCouponsByEmissionByEmissionIdWithHttpInfo(Integer emissionId, String state, Integer from, Integer count) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'emissionId' is set
        if (emissionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'emissionId' when calling couponEmissionGetApiCouponsByEmissionByEmissionId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("emissionId", emissionId);
        String path = UriComponentsBuilder.fromPath("/api/coupons/byEmission/{emissionId}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "state", state));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));

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
     * Получает информацию о выпуске купонов.
     * 
     * <p><b>200</b> - OK
     * @param emissionId Идентификатор выпуска. (required)
     * @return ResultModelOfCouponEmissionViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfCouponEmissionViewModel couponEmissionGetCouponEmission(Integer emissionId) throws RestClientException {
        return couponEmissionGetCouponEmissionWithHttpInfo(emissionId).getBody();
    }

    /**
     * Получает информацию о выпуске купонов.
     * 
     * <p><b>200</b> - OK
     * @param emissionId Идентификатор выпуска. (required)
     * @return ResponseEntity&lt;ResultModelOfCouponEmissionViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfCouponEmissionViewModel> couponEmissionGetCouponEmissionWithHttpInfo(Integer emissionId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'emissionId' is set
        if (emissionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'emissionId' when calling couponEmissionGetCouponEmission");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("emissionId", emissionId);
        String path = UriComponentsBuilder.fromPath("/api/emissions/coupons/{emissionId}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfCouponEmissionViewModel> returnType = new ParameterizedTypeReference<ResultModelOfCouponEmissionViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получает список существующих выпусков купонов.
     * 
     * <p><b>200</b> - OK
     * @param from Начало выборки. (optional, default to 0)
     * @param count Количество. (optional, default to 10)
     * @param properties Требуемые свойства view-модели. Если не указано ни одного, то будут заданы все. (optional)
     * @param filterChangeDateFrom  (optional)
     * @param filterChangeDateTo  (optional)
     * @param filterTypes  (optional)
     * @param filterPartnerIds  (optional)
     * @param filterLoyaltyProgramIds  (optional)
     * @param filterStatus  (optional)
     * @param filterTitle  (optional)
     * @param filterPersonId  (optional)
     * @return ResultModelOfPagedViewModelOfCouponEmissionViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfCouponEmissionViewModel couponEmissionGetCouponEmissions(Integer from, Integer count, List<String> properties, OffsetDateTime filterChangeDateFrom, OffsetDateTime filterChangeDateTo, List<String> filterTypes, List<Integer> filterPartnerIds, List<Integer> filterLoyaltyProgramIds, String filterStatus, String filterTitle, Integer filterPersonId) throws RestClientException {
        return couponEmissionGetCouponEmissionsWithHttpInfo(from, count, properties, filterChangeDateFrom, filterChangeDateTo, filterTypes, filterPartnerIds, filterLoyaltyProgramIds, filterStatus, filterTitle, filterPersonId).getBody();
    }

    /**
     * Получает список существующих выпусков купонов.
     * 
     * <p><b>200</b> - OK
     * @param from Начало выборки. (optional, default to 0)
     * @param count Количество. (optional, default to 10)
     * @param properties Требуемые свойства view-модели. Если не указано ни одного, то будут заданы все. (optional)
     * @param filterChangeDateFrom  (optional)
     * @param filterChangeDateTo  (optional)
     * @param filterTypes  (optional)
     * @param filterPartnerIds  (optional)
     * @param filterLoyaltyProgramIds  (optional)
     * @param filterStatus  (optional)
     * @param filterTitle  (optional)
     * @param filterPersonId  (optional)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfCouponEmissionViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfCouponEmissionViewModel> couponEmissionGetCouponEmissionsWithHttpInfo(Integer from, Integer count, List<String> properties, OffsetDateTime filterChangeDateFrom, OffsetDateTime filterChangeDateTo, List<String> filterTypes, List<Integer> filterPartnerIds, List<Integer> filterLoyaltyProgramIds, String filterStatus, String filterTitle, Integer filterPersonId) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/emissions/coupons").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "properties", properties));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.changeDateFrom", filterChangeDateFrom));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.changeDateTo", filterChangeDateTo));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "filter.types", filterTypes));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "filter.partnerIds", filterPartnerIds));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "filter.loyaltyProgramIds", filterLoyaltyProgramIds));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.status", filterStatus));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.title", filterTitle));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.personId", filterPersonId));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfCouponEmissionViewModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfCouponEmissionViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получает выпуск в виде CSV файла.
     * 
     * <p><b>200</b> - OK
     * @param emissionId ID выпуска. (required)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object couponEmissionGetEmissionCsv(Integer emissionId) throws RestClientException {
        return couponEmissionGetEmissionCsvWithHttpInfo(emissionId).getBody();
    }

    /**
     * Получает выпуск в виде CSV файла.
     * 
     * <p><b>200</b> - OK
     * @param emissionId ID выпуска. (required)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> couponEmissionGetEmissionCsvWithHttpInfo(Integer emissionId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'emissionId' is set
        if (emissionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'emissionId' when calling couponEmissionGetEmissionCsv");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("emissionId", emissionId);
        String path = UriComponentsBuilder.fromPath("/api/emissions/coupons/{emissionId}/csv").buildAndExpand(uriVariables).toUriString();

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
     * Выдать купоны из выпуска.
     * 
     * <p><b>200</b> - OK
     * @param emissionId Идентификатор выпуска. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel couponEmissionIssueCoupons(Integer emissionId) throws RestClientException {
        return couponEmissionIssueCouponsWithHttpInfo(emissionId).getBody();
    }

    /**
     * Выдать купоны из выпуска.
     * 
     * <p><b>200</b> - OK
     * @param emissionId Идентификатор выпуска. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> couponEmissionIssueCouponsWithHttpInfo(Integer emissionId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'emissionId' is set
        if (emissionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'emissionId' when calling couponEmissionIssueCoupons");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("emissionId", emissionId);
        String path = UriComponentsBuilder.fromPath("/api/emissions/coupons/{emissionId}/issue").buildAndExpand(uriVariables).toUriString();

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
     * Производит восстановление выпуска из архива.
     * 
     * <p><b>200</b> - OK
     * @param emissionId Идентификатор выпуска. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel couponEmissionRestore(Integer emissionId) throws RestClientException {
        return couponEmissionRestoreWithHttpInfo(emissionId).getBody();
    }

    /**
     * Производит восстановление выпуска из архива.
     * 
     * <p><b>200</b> - OK
     * @param emissionId Идентификатор выпуска. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> couponEmissionRestoreWithHttpInfo(Integer emissionId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'emissionId' is set
        if (emissionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'emissionId' when calling couponEmissionRestore");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("emissionId", emissionId);
        String path = UriComponentsBuilder.fromPath("/api/emissions/coupons/{emissionId}/restore").buildAndExpand(uriVariables).toUriString();

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
}
