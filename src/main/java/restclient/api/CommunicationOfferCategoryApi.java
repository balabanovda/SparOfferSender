package restclient.api;

import restclient.ApiClient;

import restclient.model.CommunicationOfferCategoryViewModel;
import restclient.model.ResultModel;
import restclient.model.ResultModelOfCommunicationOfferCategoryViewModel;
import restclient.model.ResultModelOfPagedViewModelOfCommunicationOfferCategoryViewModel;

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
@Component("restclient.api.CommunicationOfferCategoryApi")
public class CommunicationOfferCategoryApi {
    private ApiClient apiClient;

    public CommunicationOfferCategoryApi() {
        this(new ApiClient());
    }

    @Autowired
    public CommunicationOfferCategoryApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Архивировать категорию рекламного материала.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel communicationOfferCategoryArchiveCategory(Integer id) throws RestClientException {
        return communicationOfferCategoryArchiveCategoryWithHttpInfo(id).getBody();
    }

    /**
     * Архивировать категорию рекламного материала.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> communicationOfferCategoryArchiveCategoryWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling communicationOfferCategoryArchiveCategory");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/communicationOffersCategories/{id}/archive").buildAndExpand(uriVariables).toUriString();

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
     * Создать категорию рекламного материала.
     * 
     * <p><b>201</b> - Created
     * @param categoryModel Модель категории. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel communicationOfferCategoryCreateCategory(CommunicationOfferCategoryViewModel categoryModel) throws RestClientException {
        return communicationOfferCategoryCreateCategoryWithHttpInfo(categoryModel).getBody();
    }

    /**
     * Создать категорию рекламного материала.
     * 
     * <p><b>201</b> - Created
     * @param categoryModel Модель категории. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> communicationOfferCategoryCreateCategoryWithHttpInfo(CommunicationOfferCategoryViewModel categoryModel) throws RestClientException {
        Object postBody = categoryModel;
        
        // verify the required parameter 'categoryModel' is set
        if (categoryModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'categoryModel' when calling communicationOfferCategoryCreateCategory");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/communicationOffersCategories").build().toUriString();

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
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Редактировать категорию рекламного материала.
     * 
     * <p><b>200</b> - OK
     * @param categoryModel Модель категории. (required)
     * @param id  (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel communicationOfferCategoryEditCategory(CommunicationOfferCategoryViewModel categoryModel, String id) throws RestClientException {
        return communicationOfferCategoryEditCategoryWithHttpInfo(categoryModel, id).getBody();
    }

    /**
     * Редактировать категорию рекламного материала.
     * 
     * <p><b>200</b> - OK
     * @param categoryModel Модель категории. (required)
     * @param id  (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> communicationOfferCategoryEditCategoryWithHttpInfo(CommunicationOfferCategoryViewModel categoryModel, String id) throws RestClientException {
        Object postBody = categoryModel;
        
        // verify the required parameter 'categoryModel' is set
        if (categoryModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'categoryModel' when calling communicationOfferCategoryEditCategory");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling communicationOfferCategoryEditCategory");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/communicationOffersCategories/{id}").buildAndExpand(uriVariables).toUriString();

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
     * Получить список категорий рекламных материалов.
     * 
     * <p><b>200</b> - OK
     * @param from Индекс первого элемента выборки. (optional, default to 0)
     * @param count Количество элементов. (optional, default to 10)
     * @param filterName Название категории. (optional)
     * @param filterState Признак архивирования категории. (optional)
     * @param filterPartnersIds Список идентификаторов партнеров. (optional)
     * @param filterSortingIds Идентификаторы, которые будут выбираться первыми. (optional)
     * @return ResultModelOfPagedViewModelOfCommunicationOfferCategoryViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfCommunicationOfferCategoryViewModel communicationOfferCategoryGetCategories(Integer from, Integer count, String filterName, String filterState, List<Integer> filterPartnersIds, List<Integer> filterSortingIds) throws RestClientException {
        return communicationOfferCategoryGetCategoriesWithHttpInfo(from, count, filterName, filterState, filterPartnersIds, filterSortingIds).getBody();
    }

    /**
     * Получить список категорий рекламных материалов.
     * 
     * <p><b>200</b> - OK
     * @param from Индекс первого элемента выборки. (optional, default to 0)
     * @param count Количество элементов. (optional, default to 10)
     * @param filterName Название категории. (optional)
     * @param filterState Признак архивирования категории. (optional)
     * @param filterPartnersIds Список идентификаторов партнеров. (optional)
     * @param filterSortingIds Идентификаторы, которые будут выбираться первыми. (optional)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfCommunicationOfferCategoryViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfCommunicationOfferCategoryViewModel> communicationOfferCategoryGetCategoriesWithHttpInfo(Integer from, Integer count, String filterName, String filterState, List<Integer> filterPartnersIds, List<Integer> filterSortingIds) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/communicationOffersCategories").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.name", filterName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.state", filterState));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "filter.partnersIds", filterPartnersIds));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "filter.sortingIds", filterSortingIds));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfCommunicationOfferCategoryViewModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfCommunicationOfferCategoryViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить категорию рекламного материала.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор. (required)
     * @return ResultModelOfCommunicationOfferCategoryViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfCommunicationOfferCategoryViewModel communicationOfferCategoryGetCategory(Integer id) throws RestClientException {
        return communicationOfferCategoryGetCategoryWithHttpInfo(id).getBody();
    }

    /**
     * Получить категорию рекламного материала.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор. (required)
     * @return ResponseEntity&lt;ResultModelOfCommunicationOfferCategoryViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfCommunicationOfferCategoryViewModel> communicationOfferCategoryGetCategoryWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling communicationOfferCategoryGetCategory");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/communicationOffersCategories/{id}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfCommunicationOfferCategoryViewModel> returnType = new ParameterizedTypeReference<ResultModelOfCommunicationOfferCategoryViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Восстановить архивированную категорию рекламного материала.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel communicationOfferCategoryRestoreCategory(Integer id) throws RestClientException {
        return communicationOfferCategoryRestoreCategoryWithHttpInfo(id).getBody();
    }

    /**
     * Восстановить архивированную категорию рекламного материала.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> communicationOfferCategoryRestoreCategoryWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling communicationOfferCategoryRestoreCategory");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/communicationOffersCategories/{id}/restore").buildAndExpand(uriVariables).toUriString();

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
