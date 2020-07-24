package restclient.api;

import restclient.ApiClient;

import restclient.model.PartnerModel;
import restclient.model.ResultModel;
import restclient.model.ResultModelOfExternalCardInfoModel;
import restclient.model.ResultModelOfInt32;
import restclient.model.ResultModelOfPagedViewModelOfPartnerModel;
import restclient.model.ResultModelOfPartnerModel;

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
@Component("restclient.api.PartnerApi")
public class PartnerApi {
    private ApiClient apiClient;

    public PartnerApi() {
        this(new ApiClient());
    }

    @Autowired
    public PartnerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Добавление партнера.
     * 
     * <p><b>201</b> - Created
     * @param partnerModel ViewModel партнера. (required)
     * @return ResultModelOfInt32
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfInt32 partnerAddPartner(PartnerModel partnerModel) throws RestClientException {
        return partnerAddPartnerWithHttpInfo(partnerModel).getBody();
    }

    /**
     * Добавление партнера.
     * 
     * <p><b>201</b> - Created
     * @param partnerModel ViewModel партнера. (required)
     * @return ResponseEntity&lt;ResultModelOfInt32&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfInt32> partnerAddPartnerWithHttpInfo(PartnerModel partnerModel) throws RestClientException {
        Object postBody = partnerModel;
        
        // verify the required parameter 'partnerModel' is set
        if (partnerModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partnerModel' when calling partnerAddPartner");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/partners").build().toUriString();

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
     * Получить информацию о партнерской карте.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор партнера. (required)
     * @param number Номер партнерской карты. (required)
     * @return ResultModelOfExternalCardInfoModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfExternalCardInfoModel partnerGetExternalCardInfo(Integer id, String number) throws RestClientException {
        return partnerGetExternalCardInfoWithHttpInfo(id, number).getBody();
    }

    /**
     * Получить информацию о партнерской карте.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор партнера. (required)
     * @param number Номер партнерской карты. (required)
     * @return ResponseEntity&lt;ResultModelOfExternalCardInfoModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfExternalCardInfoModel> partnerGetExternalCardInfoWithHttpInfo(Integer id, String number) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling partnerGetExternalCardInfo");
        }
        
        // verify the required parameter 'number' is set
        if (number == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'number' when calling partnerGetExternalCardInfo");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("number", number);
        String path = UriComponentsBuilder.fromPath("/api/partners/{id}/Cards/{number}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfExternalCardInfoModel> returnType = new ParameterizedTypeReference<ResultModelOfExternalCardInfoModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получение партнера по идентификатору.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор партнера. (required)
     * @return ResultModelOfPartnerModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPartnerModel partnerGetPartnerByID(Integer id) throws RestClientException {
        return partnerGetPartnerByIDWithHttpInfo(id).getBody();
    }

    /**
     * Получение партнера по идентификатору.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор партнера. (required)
     * @return ResponseEntity&lt;ResultModelOfPartnerModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPartnerModel> partnerGetPartnerByIDWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling partnerGetPartnerByID");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/partners/{id}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfPartnerModel> returnType = new ParameterizedTypeReference<ResultModelOfPartnerModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Возвращает список партнеров.
     * 
     * <p><b>200</b> - OK
     * @param filterFrom Начало выборки. (optional)
     * @param filterCount Количество. (optional)
     * @param filterName Подстрока для поиска по имени. (optional)
     * @param filterPermission Выбираются партнеры, на которые текущий пользователь имеет указанное право. (optional)
     * @param filterOrderByDesc Сортировать в обратном порядке. (optional)
     * @param filterSortingIds Список идентификаторов для первоочередного выбора. (optional)
     * @param filterLoyaltyPrograms Список ПЛ для фильтра по ПЛ. (optional)
     * @return ResultModelOfPagedViewModelOfPartnerModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfPartnerModel partnerGetPartnersByName(Integer filterFrom, Integer filterCount, String filterName, String filterPermission, Boolean filterOrderByDesc, List<Integer> filterSortingIds, List<Integer> filterLoyaltyPrograms) throws RestClientException {
        return partnerGetPartnersByNameWithHttpInfo(filterFrom, filterCount, filterName, filterPermission, filterOrderByDesc, filterSortingIds, filterLoyaltyPrograms).getBody();
    }

    /**
     * Возвращает список партнеров.
     * 
     * <p><b>200</b> - OK
     * @param filterFrom Начало выборки. (optional)
     * @param filterCount Количество. (optional)
     * @param filterName Подстрока для поиска по имени. (optional)
     * @param filterPermission Выбираются партнеры, на которые текущий пользователь имеет указанное право. (optional)
     * @param filterOrderByDesc Сортировать в обратном порядке. (optional)
     * @param filterSortingIds Список идентификаторов для первоочередного выбора. (optional)
     * @param filterLoyaltyPrograms Список ПЛ для фильтра по ПЛ. (optional)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfPartnerModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfPartnerModel> partnerGetPartnersByNameWithHttpInfo(Integer filterFrom, Integer filterCount, String filterName, String filterPermission, Boolean filterOrderByDesc, List<Integer> filterSortingIds, List<Integer> filterLoyaltyPrograms) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/partners").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.from", filterFrom));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.count", filterCount));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.name", filterName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.permission", filterPermission));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.orderByDesc", filterOrderByDesc));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "filter.sortingIds", filterSortingIds));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "filter.loyaltyPrograms", filterLoyaltyPrograms));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfPartnerModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfPartnerModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Заменить карту партнера на карту системы.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор партнера. (required)
     * @param number Номер партнерской карты. (required)
     * @param loymaxCardId Идентификатор карты системы. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel partnerReplaceExternalCard(Integer id, String number, Integer loymaxCardId) throws RestClientException {
        return partnerReplaceExternalCardWithHttpInfo(id, number, loymaxCardId).getBody();
    }

    /**
     * Заменить карту партнера на карту системы.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор партнера. (required)
     * @param number Номер партнерской карты. (required)
     * @param loymaxCardId Идентификатор карты системы. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> partnerReplaceExternalCardWithHttpInfo(Integer id, String number, Integer loymaxCardId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling partnerReplaceExternalCard");
        }
        
        // verify the required parameter 'number' is set
        if (number == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'number' when calling partnerReplaceExternalCard");
        }
        
        // verify the required parameter 'loymaxCardId' is set
        if (loymaxCardId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'loymaxCardId' when calling partnerReplaceExternalCard");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("number", number);
        String path = UriComponentsBuilder.fromPath("/api/partners/{id}/Cards/{number}/Replace").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "loymaxCardId", loymaxCardId));

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
     * Редактирование партнера.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор партнера. (required)
     * @param partnerModel Модель для редактирования партнера. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel partnerUpdatePartner(Integer id, PartnerModel partnerModel) throws RestClientException {
        return partnerUpdatePartnerWithHttpInfo(id, partnerModel).getBody();
    }

    /**
     * Редактирование партнера.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор партнера. (required)
     * @param partnerModel Модель для редактирования партнера. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> partnerUpdatePartnerWithHttpInfo(Integer id, PartnerModel partnerModel) throws RestClientException {
        Object postBody = partnerModel;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling partnerUpdatePartner");
        }
        
        // verify the required parameter 'partnerModel' is set
        if (partnerModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partnerModel' when calling partnerUpdatePartner");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/partners/{id}").buildAndExpand(uriVariables).toUriString();

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
