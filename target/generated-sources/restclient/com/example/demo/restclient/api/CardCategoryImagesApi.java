package com.example.demo.restclient.api;

import com.example.demo.restclient.ApiClient;

import com.example.demo.restclient.model.NewImageFileModel;
import com.example.demo.restclient.model.ResultModel;
import com.example.demo.restclient.model.ResultModelOfImageFileViewModel;
import com.example.demo.restclient.model.ResultModelOfListOfImageFileViewModel;
import com.example.demo.restclient.model.UpdatedImageFileModel;

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
@Component("com.example.demo.restclient.api.CardCategoryImagesApi")
public class CardCategoryImagesApi {
    private ApiClient apiClient;

    public CardCategoryImagesApi() {
        this(new ApiClient());
    }

    @Autowired
    public CardCategoryImagesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Создать изображение.
     * 
     * <p><b>201</b> - Created
     * @param categoryId Идентификатор категории карт. (required)
     * @param model Новое изображение. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel cardCategoryImagesAddImage(Integer categoryId, NewImageFileModel model) throws RestClientException {
        return cardCategoryImagesAddImageWithHttpInfo(categoryId, model).getBody();
    }

    /**
     * Создать изображение.
     * 
     * <p><b>201</b> - Created
     * @param categoryId Идентификатор категории карт. (required)
     * @param model Новое изображение. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> cardCategoryImagesAddImageWithHttpInfo(Integer categoryId, NewImageFileModel model) throws RestClientException {
        Object postBody = model;
        
        // verify the required parameter 'categoryId' is set
        if (categoryId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'categoryId' when calling cardCategoryImagesAddImage");
        }
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling cardCategoryImagesAddImage");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("categoryId", categoryId);
        String path = UriComponentsBuilder.fromPath("/api/cardCategories/{categoryId}/Images").buildAndExpand(uriVariables).toUriString();

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
     * Удалить изображение.
     * 
     * <p><b>200</b> - OK
     * @param categoryId Идентификатор категории карт. (required)
     * @param imageId Идентификатор изображение. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel cardCategoryImagesDeleteImage(Integer categoryId, Integer imageId) throws RestClientException {
        return cardCategoryImagesDeleteImageWithHttpInfo(categoryId, imageId).getBody();
    }

    /**
     * Удалить изображение.
     * 
     * <p><b>200</b> - OK
     * @param categoryId Идентификатор категории карт. (required)
     * @param imageId Идентификатор изображение. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> cardCategoryImagesDeleteImageWithHttpInfo(Integer categoryId, Integer imageId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'categoryId' is set
        if (categoryId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'categoryId' when calling cardCategoryImagesDeleteImage");
        }
        
        // verify the required parameter 'imageId' is set
        if (imageId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'imageId' when calling cardCategoryImagesDeleteImage");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("categoryId", categoryId);
        uriVariables.put("imageId", imageId);
        String path = UriComponentsBuilder.fromPath("/api/cardCategories/{categoryId}/Images/{imageId}").buildAndExpand(uriVariables).toUriString();

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
     * Обновить изображение.
     * 
     * <p><b>200</b> - OK
     * @param categoryId Идентификатор категории карт. (required)
     * @param model Модель изображения. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel cardCategoryImagesEditImage(Integer categoryId, UpdatedImageFileModel model) throws RestClientException {
        return cardCategoryImagesEditImageWithHttpInfo(categoryId, model).getBody();
    }

    /**
     * Обновить изображение.
     * 
     * <p><b>200</b> - OK
     * @param categoryId Идентификатор категории карт. (required)
     * @param model Модель изображения. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> cardCategoryImagesEditImageWithHttpInfo(Integer categoryId, UpdatedImageFileModel model) throws RestClientException {
        Object postBody = model;
        
        // verify the required parameter 'categoryId' is set
        if (categoryId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'categoryId' when calling cardCategoryImagesEditImage");
        }
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling cardCategoryImagesEditImage");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("categoryId", categoryId);
        String path = UriComponentsBuilder.fromPath("/api/cardCategories/{categoryId}/Images").buildAndExpand(uriVariables).toUriString();

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
     * Получить изображение.
     * 
     * <p><b>200</b> - OK
     * @param categoryId Идентификатор категории карт. (required)
     * @param imageId Идентификатор файла. (required)
     * @return ResultModelOfImageFileViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfImageFileViewModel cardCategoryImagesGetImage(Integer categoryId, Integer imageId) throws RestClientException {
        return cardCategoryImagesGetImageWithHttpInfo(categoryId, imageId).getBody();
    }

    /**
     * Получить изображение.
     * 
     * <p><b>200</b> - OK
     * @param categoryId Идентификатор категории карт. (required)
     * @param imageId Идентификатор файла. (required)
     * @return ResponseEntity&lt;ResultModelOfImageFileViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfImageFileViewModel> cardCategoryImagesGetImageWithHttpInfo(Integer categoryId, Integer imageId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'categoryId' is set
        if (categoryId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'categoryId' when calling cardCategoryImagesGetImage");
        }
        
        // verify the required parameter 'imageId' is set
        if (imageId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'imageId' when calling cardCategoryImagesGetImage");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("categoryId", categoryId);
        uriVariables.put("imageId", imageId);
        String path = UriComponentsBuilder.fromPath("/api/cardCategories/{categoryId}/Images/{imageId}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfImageFileViewModel> returnType = new ParameterizedTypeReference<ResultModelOfImageFileViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить список изображений для категории.
     * 
     * <p><b>200</b> - OK
     * @param categoryId Идентификатор категории карт. (required)
     * @return ResultModelOfListOfImageFileViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfImageFileViewModel cardCategoryImagesGetImages(Integer categoryId) throws RestClientException {
        return cardCategoryImagesGetImagesWithHttpInfo(categoryId).getBody();
    }

    /**
     * Получить список изображений для категории.
     * 
     * <p><b>200</b> - OK
     * @param categoryId Идентификатор категории карт. (required)
     * @return ResponseEntity&lt;ResultModelOfListOfImageFileViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfImageFileViewModel> cardCategoryImagesGetImagesWithHttpInfo(Integer categoryId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'categoryId' is set
        if (categoryId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'categoryId' when calling cardCategoryImagesGetImages");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("categoryId", categoryId);
        String path = UriComponentsBuilder.fromPath("/api/cardCategories/{categoryId}/Images").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfListOfImageFileViewModel> returnType = new ParameterizedTypeReference<ResultModelOfListOfImageFileViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
