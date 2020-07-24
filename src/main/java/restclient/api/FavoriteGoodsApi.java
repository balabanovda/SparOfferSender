package restclient.api;

import restclient.ApiClient;

import java.time.OffsetDateTime;
import restclient.model.ResultModel;
import restclient.model.ResultModelOfFavoriteGoodsSetViewModel;
import restclient.model.ResultModelOfPagedViewModelOfFavoriteGoodsSetShortViewModel;

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
@Component("restclient.api.FavoriteGoodsApi")
public class FavoriteGoodsApi {
    private ApiClient apiClient;

    public FavoriteGoodsApi() {
        this(new ApiClient());
    }

    @Autowired
    public FavoriteGoodsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Функция очищает набор любимых товаров.
     * 
     * <p><b>200</b> - OK
     * @param personId Id персоны. (required)
     * @param id Id набора любимых товаров. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel favoriteGoodsDeleteFavoriteGoods(Integer personId, Integer id) throws RestClientException {
        return favoriteGoodsDeleteFavoriteGoodsWithHttpInfo(personId, id).getBody();
    }

    /**
     * Функция очищает набор любимых товаров.
     * 
     * <p><b>200</b> - OK
     * @param personId Id персоны. (required)
     * @param id Id набора любимых товаров. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> favoriteGoodsDeleteFavoriteGoodsWithHttpInfo(Integer personId, Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling favoriteGoodsDeleteFavoriteGoods");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling favoriteGoodsDeleteFavoriteGoods");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("personId", personId);
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/users/{personId}/favoriteGoods/{id}").buildAndExpand(uriVariables).toUriString();

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
     * Функция возвращает набор любимых товаров.
     * 
     * <p><b>200</b> - OK
     * @param personId Id персоны. (required)
     * @param id Id набора любимых товаров. (required)
     * @return ResultModelOfFavoriteGoodsSetViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfFavoriteGoodsSetViewModel favoriteGoodsGetFavoriteGoods(Integer personId, Integer id) throws RestClientException {
        return favoriteGoodsGetFavoriteGoodsWithHttpInfo(personId, id).getBody();
    }

    /**
     * Функция возвращает набор любимых товаров.
     * 
     * <p><b>200</b> - OK
     * @param personId Id персоны. (required)
     * @param id Id набора любимых товаров. (required)
     * @return ResponseEntity&lt;ResultModelOfFavoriteGoodsSetViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfFavoriteGoodsSetViewModel> favoriteGoodsGetFavoriteGoodsWithHttpInfo(Integer personId, Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling favoriteGoodsGetFavoriteGoods");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling favoriteGoodsGetFavoriteGoods");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("personId", personId);
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/users/{personId}/favoriteGoods/{id}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfFavoriteGoodsSetViewModel> returnType = new ParameterizedTypeReference<ResultModelOfFavoriteGoodsSetViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Функция возвращает список наборов любимых товаров.
     * 
     * <p><b>200</b> - OK
     * @param personId Id персоны. (required)
     * @param fromDate Дата начала интервала. (required)
     * @param toDate Дата окончания интервала. (required)
     * @param from С какого номера. (optional, default to 0)
     * @param count Сколько записей вернуть. (optional, default to 20)
     * @param groupName Наименование группы товаров. (optional, default to )
     * @param personalOfferName Наименование персонального предложения. (optional, default to )
     * @return ResultModelOfPagedViewModelOfFavoriteGoodsSetShortViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfFavoriteGoodsSetShortViewModel favoriteGoodsGetFavoriteGoodsList(Integer personId, OffsetDateTime fromDate, OffsetDateTime toDate, Integer from, Integer count, String groupName, String personalOfferName) throws RestClientException {
        return favoriteGoodsGetFavoriteGoodsListWithHttpInfo(personId, fromDate, toDate, from, count, groupName, personalOfferName).getBody();
    }

    /**
     * Функция возвращает список наборов любимых товаров.
     * 
     * <p><b>200</b> - OK
     * @param personId Id персоны. (required)
     * @param fromDate Дата начала интервала. (required)
     * @param toDate Дата окончания интервала. (required)
     * @param from С какого номера. (optional, default to 0)
     * @param count Сколько записей вернуть. (optional, default to 20)
     * @param groupName Наименование группы товаров. (optional, default to )
     * @param personalOfferName Наименование персонального предложения. (optional, default to )
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfFavoriteGoodsSetShortViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfFavoriteGoodsSetShortViewModel> favoriteGoodsGetFavoriteGoodsListWithHttpInfo(Integer personId, OffsetDateTime fromDate, OffsetDateTime toDate, Integer from, Integer count, String groupName, String personalOfferName) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling favoriteGoodsGetFavoriteGoodsList");
        }
        
        // verify the required parameter 'fromDate' is set
        if (fromDate == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fromDate' when calling favoriteGoodsGetFavoriteGoodsList");
        }
        
        // verify the required parameter 'toDate' is set
        if (toDate == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'toDate' when calling favoriteGoodsGetFavoriteGoodsList");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("personId", personId);
        String path = UriComponentsBuilder.fromPath("/api/users/{personId}/favoriteGoods").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "fromDate", fromDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "toDate", toDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "groupName", groupName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "personalOfferName", personalOfferName));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfFavoriteGoodsSetShortViewModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfFavoriteGoodsSetShortViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Функция устанавливает набор любимых товаров пользователя.
     * 
     * <p><b>200</b> - OK
     * @param personId Id персоны. (required)
     * @param id Id набора любимых товаров. (required)
     * @param position Номер позиции в наборе любимых товаров. (required)
     * @param goodsId Id нового товара для изменения. (required)
     * @param pin Pin код подтверждения (необязательный). (optional)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel favoriteGoodsSetFavoriteGoods(Integer personId, Integer id, Integer position, Integer goodsId, String pin) throws RestClientException {
        return favoriteGoodsSetFavoriteGoodsWithHttpInfo(personId, id, position, goodsId, pin).getBody();
    }

    /**
     * Функция устанавливает набор любимых товаров пользователя.
     * 
     * <p><b>200</b> - OK
     * @param personId Id персоны. (required)
     * @param id Id набора любимых товаров. (required)
     * @param position Номер позиции в наборе любимых товаров. (required)
     * @param goodsId Id нового товара для изменения. (required)
     * @param pin Pin код подтверждения (необязательный). (optional)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> favoriteGoodsSetFavoriteGoodsWithHttpInfo(Integer personId, Integer id, Integer position, Integer goodsId, String pin) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling favoriteGoodsSetFavoriteGoods");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling favoriteGoodsSetFavoriteGoods");
        }
        
        // verify the required parameter 'position' is set
        if (position == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'position' when calling favoriteGoodsSetFavoriteGoods");
        }
        
        // verify the required parameter 'goodsId' is set
        if (goodsId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'goodsId' when calling favoriteGoodsSetFavoriteGoods");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("personId", personId);
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/users/{personId}/favoriteGoods/{id}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "position", position));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "goodsId", goodsId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pin", pin));

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
