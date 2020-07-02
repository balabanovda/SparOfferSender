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
@Component("com.example.demo.restclient.api.CommunicationOfferImagesApi")
public class CommunicationOfferImagesApi {
    private ApiClient apiClient;

    public CommunicationOfferImagesApi() {
        this(new ApiClient());
    }

    @Autowired
    public CommunicationOfferImagesApi(ApiClient apiClient) {
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
     * @param offerId Идентификатор акции. (required)
     * @param model Новое изображение. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel communicationOfferImagesAddImage(Integer offerId, NewImageFileModel model) throws RestClientException {
        return communicationOfferImagesAddImageWithHttpInfo(offerId, model).getBody();
    }

    /**
     * Создать изображение.
     * 
     * <p><b>201</b> - Created
     * @param offerId Идентификатор акции. (required)
     * @param model Новое изображение. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> communicationOfferImagesAddImageWithHttpInfo(Integer offerId, NewImageFileModel model) throws RestClientException {
        Object postBody = model;
        
        // verify the required parameter 'offerId' is set
        if (offerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'offerId' when calling communicationOfferImagesAddImage");
        }
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling communicationOfferImagesAddImage");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("offerId", offerId);
        String path = UriComponentsBuilder.fromPath("/api/communicationOffers/{offerId}/Images").buildAndExpand(uriVariables).toUriString();

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
     * @param offerId Идентификатор акции. (required)
     * @param imageId Идентификатор изображение. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel communicationOfferImagesDeleteImage(Integer offerId, Integer imageId) throws RestClientException {
        return communicationOfferImagesDeleteImageWithHttpInfo(offerId, imageId).getBody();
    }

    /**
     * Удалить изображение.
     * 
     * <p><b>200</b> - OK
     * @param offerId Идентификатор акции. (required)
     * @param imageId Идентификатор изображение. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> communicationOfferImagesDeleteImageWithHttpInfo(Integer offerId, Integer imageId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'offerId' is set
        if (offerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'offerId' when calling communicationOfferImagesDeleteImage");
        }
        
        // verify the required parameter 'imageId' is set
        if (imageId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'imageId' when calling communicationOfferImagesDeleteImage");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("offerId", offerId);
        uriVariables.put("imageId", imageId);
        String path = UriComponentsBuilder.fromPath("/api/communicationOffers/{offerId}/Images/{imageId}").buildAndExpand(uriVariables).toUriString();

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
     * @param offerId Идентификатор акции. (required)
     * @param imageId Идентификатор изображения. (required)
     * @param model Модель изображения. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel communicationOfferImagesEditImage(Integer offerId, Integer imageId, UpdatedImageFileModel model) throws RestClientException {
        return communicationOfferImagesEditImageWithHttpInfo(offerId, imageId, model).getBody();
    }

    /**
     * Обновить изображение.
     * 
     * <p><b>200</b> - OK
     * @param offerId Идентификатор акции. (required)
     * @param imageId Идентификатор изображения. (required)
     * @param model Модель изображения. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> communicationOfferImagesEditImageWithHttpInfo(Integer offerId, Integer imageId, UpdatedImageFileModel model) throws RestClientException {
        Object postBody = model;
        
        // verify the required parameter 'offerId' is set
        if (offerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'offerId' when calling communicationOfferImagesEditImage");
        }
        
        // verify the required parameter 'imageId' is set
        if (imageId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'imageId' when calling communicationOfferImagesEditImage");
        }
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling communicationOfferImagesEditImage");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("offerId", offerId);
        uriVariables.put("imageId", imageId);
        String path = UriComponentsBuilder.fromPath("/api/communicationOffers/{offerId}/Images/{imageId}").buildAndExpand(uriVariables).toUriString();

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
     * @param offerId Идентификатор акции. (required)
     * @param imageId Идентификатор файла. (required)
     * @return ResultModelOfImageFileViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfImageFileViewModel communicationOfferImagesGetImage(Integer offerId, Integer imageId) throws RestClientException {
        return communicationOfferImagesGetImageWithHttpInfo(offerId, imageId).getBody();
    }

    /**
     * Получить изображение.
     * 
     * <p><b>200</b> - OK
     * @param offerId Идентификатор акции. (required)
     * @param imageId Идентификатор файла. (required)
     * @return ResponseEntity&lt;ResultModelOfImageFileViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfImageFileViewModel> communicationOfferImagesGetImageWithHttpInfo(Integer offerId, Integer imageId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'offerId' is set
        if (offerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'offerId' when calling communicationOfferImagesGetImage");
        }
        
        // verify the required parameter 'imageId' is set
        if (imageId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'imageId' when calling communicationOfferImagesGetImage");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("offerId", offerId);
        uriVariables.put("imageId", imageId);
        String path = UriComponentsBuilder.fromPath("/api/communicationOffers/{offerId}/Images/{imageId}").buildAndExpand(uriVariables).toUriString();

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
     * Получить список изображений для акции.
     * 
     * <p><b>200</b> - OK
     * @param offerId Идентификатор акции. (required)
     * @return ResultModelOfListOfImageFileViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfImageFileViewModel communicationOfferImagesGetImages(Integer offerId) throws RestClientException {
        return communicationOfferImagesGetImagesWithHttpInfo(offerId).getBody();
    }

    /**
     * Получить список изображений для акции.
     * 
     * <p><b>200</b> - OK
     * @param offerId Идентификатор акции. (required)
     * @return ResponseEntity&lt;ResultModelOfListOfImageFileViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfImageFileViewModel> communicationOfferImagesGetImagesWithHttpInfo(Integer offerId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'offerId' is set
        if (offerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'offerId' when calling communicationOfferImagesGetImages");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("offerId", offerId);
        String path = UriComponentsBuilder.fromPath("/api/communicationOffers/{offerId}/Images").buildAndExpand(uriVariables).toUriString();

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
