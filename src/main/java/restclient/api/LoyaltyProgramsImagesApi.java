package restclient.api;

import restclient.ApiClient;

import restclient.model.NewImageFileModel;
import restclient.model.ResultModel;
import restclient.model.ResultModelOfImageFileViewModel;
import restclient.model.ResultModelOfListOfImageFileViewModel;
import restclient.model.UpdatedImageFileModel;

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
@Component("restclient.api.LoyaltyProgramsImagesApi")
public class LoyaltyProgramsImagesApi {
    private ApiClient apiClient;

    public LoyaltyProgramsImagesApi() {
        this(new ApiClient());
    }

    @Autowired
    public LoyaltyProgramsImagesApi(ApiClient apiClient) {
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
     * @param loyaltyProgramId Идентификатор программы лояльности. (required)
     * @param model Новое изображение. (required)
     * @return ResultModelOfImageFileViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfImageFileViewModel loyaltyProgramsImagesAddImage(Integer loyaltyProgramId, NewImageFileModel model) throws RestClientException {
        return loyaltyProgramsImagesAddImageWithHttpInfo(loyaltyProgramId, model).getBody();
    }

    /**
     * Создать изображение.
     * 
     * <p><b>201</b> - Created
     * @param loyaltyProgramId Идентификатор программы лояльности. (required)
     * @param model Новое изображение. (required)
     * @return ResponseEntity&lt;ResultModelOfImageFileViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfImageFileViewModel> loyaltyProgramsImagesAddImageWithHttpInfo(Integer loyaltyProgramId, NewImageFileModel model) throws RestClientException {
        Object postBody = model;
        
        // verify the required parameter 'loyaltyProgramId' is set
        if (loyaltyProgramId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'loyaltyProgramId' when calling loyaltyProgramsImagesAddImage");
        }
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling loyaltyProgramsImagesAddImage");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("loyaltyProgramId", loyaltyProgramId);
        String path = UriComponentsBuilder.fromPath("/api/loyaltyPrograms/{loyaltyProgramId}/Images").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfImageFileViewModel> returnType = new ParameterizedTypeReference<ResultModelOfImageFileViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Удалить изображение.
     * 
     * <p><b>200</b> - OK
     * @param loyaltyProgramId Идентификатор программы лояльности. (required)
     * @param imageId Идентификатор изображение. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel loyaltyProgramsImagesDeleteImage(Integer loyaltyProgramId, Integer imageId) throws RestClientException {
        return loyaltyProgramsImagesDeleteImageWithHttpInfo(loyaltyProgramId, imageId).getBody();
    }

    /**
     * Удалить изображение.
     * 
     * <p><b>200</b> - OK
     * @param loyaltyProgramId Идентификатор программы лояльности. (required)
     * @param imageId Идентификатор изображение. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> loyaltyProgramsImagesDeleteImageWithHttpInfo(Integer loyaltyProgramId, Integer imageId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'loyaltyProgramId' is set
        if (loyaltyProgramId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'loyaltyProgramId' when calling loyaltyProgramsImagesDeleteImage");
        }
        
        // verify the required parameter 'imageId' is set
        if (imageId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'imageId' when calling loyaltyProgramsImagesDeleteImage");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("loyaltyProgramId", loyaltyProgramId);
        uriVariables.put("imageId", imageId);
        String path = UriComponentsBuilder.fromPath("/api/loyaltyPrograms/{loyaltyProgramId}/Images/{imageId}").buildAndExpand(uriVariables).toUriString();

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
     * @param loyaltyProgramId Идентификатор программы лояльности. (required)
     * @param model Модель изображения. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel loyaltyProgramsImagesEditImage(Integer loyaltyProgramId, UpdatedImageFileModel model) throws RestClientException {
        return loyaltyProgramsImagesEditImageWithHttpInfo(loyaltyProgramId, model).getBody();
    }

    /**
     * Обновить изображение.
     * 
     * <p><b>200</b> - OK
     * @param loyaltyProgramId Идентификатор программы лояльности. (required)
     * @param model Модель изображения. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> loyaltyProgramsImagesEditImageWithHttpInfo(Integer loyaltyProgramId, UpdatedImageFileModel model) throws RestClientException {
        Object postBody = model;
        
        // verify the required parameter 'loyaltyProgramId' is set
        if (loyaltyProgramId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'loyaltyProgramId' when calling loyaltyProgramsImagesEditImage");
        }
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling loyaltyProgramsImagesEditImage");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("loyaltyProgramId", loyaltyProgramId);
        String path = UriComponentsBuilder.fromPath("/api/loyaltyPrograms/{loyaltyProgramId}/Images").buildAndExpand(uriVariables).toUriString();

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
     * @param loyaltyProgramId Идентификатор программы лояльности. (required)
     * @param imageId Идентификатор файла. (required)
     * @return ResultModelOfImageFileViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfImageFileViewModel loyaltyProgramsImagesGetImage(Integer loyaltyProgramId, Integer imageId) throws RestClientException {
        return loyaltyProgramsImagesGetImageWithHttpInfo(loyaltyProgramId, imageId).getBody();
    }

    /**
     * Получить изображение.
     * 
     * <p><b>200</b> - OK
     * @param loyaltyProgramId Идентификатор программы лояльности. (required)
     * @param imageId Идентификатор файла. (required)
     * @return ResponseEntity&lt;ResultModelOfImageFileViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfImageFileViewModel> loyaltyProgramsImagesGetImageWithHttpInfo(Integer loyaltyProgramId, Integer imageId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'loyaltyProgramId' is set
        if (loyaltyProgramId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'loyaltyProgramId' when calling loyaltyProgramsImagesGetImage");
        }
        
        // verify the required parameter 'imageId' is set
        if (imageId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'imageId' when calling loyaltyProgramsImagesGetImage");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("loyaltyProgramId", loyaltyProgramId);
        uriVariables.put("imageId", imageId);
        String path = UriComponentsBuilder.fromPath("/api/loyaltyPrograms/{loyaltyProgramId}/Images/{imageId}").buildAndExpand(uriVariables).toUriString();

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
     * Получить список изображений для программы лояльности.
     * 
     * <p><b>200</b> - OK
     * @param loyaltyProgramId Идентификатор программы лояльности. (required)
     * @return ResultModelOfListOfImageFileViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfImageFileViewModel loyaltyProgramsImagesGetImages(Integer loyaltyProgramId) throws RestClientException {
        return loyaltyProgramsImagesGetImagesWithHttpInfo(loyaltyProgramId).getBody();
    }

    /**
     * Получить список изображений для программы лояльности.
     * 
     * <p><b>200</b> - OK
     * @param loyaltyProgramId Идентификатор программы лояльности. (required)
     * @return ResponseEntity&lt;ResultModelOfListOfImageFileViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfImageFileViewModel> loyaltyProgramsImagesGetImagesWithHttpInfo(Integer loyaltyProgramId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'loyaltyProgramId' is set
        if (loyaltyProgramId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'loyaltyProgramId' when calling loyaltyProgramsImagesGetImages");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("loyaltyProgramId", loyaltyProgramId);
        String path = UriComponentsBuilder.fromPath("/api/loyaltyPrograms/{loyaltyProgramId}/Images").buildAndExpand(uriVariables).toUriString();

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
