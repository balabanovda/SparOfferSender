package restclient.api;

import restclient.ApiClient;

import restclient.model.EditOfferTargetGroupsModel;
import restclient.model.ResultModelOfListOfTargetGroupBriefViewModel;

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
@Component("restclient.api.OfferTargetGroupApi")
public class OfferTargetGroupApi {
    private ApiClient apiClient;

    public OfferTargetGroupApi() {
        this(new ApiClient());
    }

    @Autowired
    public OfferTargetGroupApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Редактирует список целевых аудиторий для акции.
     * 
     * <p><b>200</b> - OK
     * @param offerId Идентификатор для акции. (required)
     * @param editOfferTargetGroupsModel Модель для редактирования списка ЦА для акции. (required)
     * @return ResultModelOfListOfTargetGroupBriefViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfTargetGroupBriefViewModel offerTargetGroupEditOfferTargetGroups(Integer offerId, EditOfferTargetGroupsModel editOfferTargetGroupsModel) throws RestClientException {
        return offerTargetGroupEditOfferTargetGroupsWithHttpInfo(offerId, editOfferTargetGroupsModel).getBody();
    }

    /**
     * Редактирует список целевых аудиторий для акции.
     * 
     * <p><b>200</b> - OK
     * @param offerId Идентификатор для акции. (required)
     * @param editOfferTargetGroupsModel Модель для редактирования списка ЦА для акции. (required)
     * @return ResponseEntity&lt;ResultModelOfListOfTargetGroupBriefViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfTargetGroupBriefViewModel> offerTargetGroupEditOfferTargetGroupsWithHttpInfo(Integer offerId, EditOfferTargetGroupsModel editOfferTargetGroupsModel) throws RestClientException {
        Object postBody = editOfferTargetGroupsModel;
        
        // verify the required parameter 'offerId' is set
        if (offerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'offerId' when calling offerTargetGroupEditOfferTargetGroups");
        }
        
        // verify the required parameter 'editOfferTargetGroupsModel' is set
        if (editOfferTargetGroupsModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'editOfferTargetGroupsModel' when calling offerTargetGroupEditOfferTargetGroups");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("offerId", offerId);
        String path = UriComponentsBuilder.fromPath("/api/Offers/{offerId}/targetGroups").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfListOfTargetGroupBriefViewModel> returnType = new ParameterizedTypeReference<ResultModelOfListOfTargetGroupBriefViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получает список целевых аудиторий для акции.
     * 
     * <p><b>200</b> - OK
     * @param offerId Id акции. (required)
     * @param version Тип версии. (optional, default to Draft)
     * @return ResultModelOfListOfTargetGroupBriefViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfTargetGroupBriefViewModel offerTargetGroupGetOfferTargetGroups(Integer offerId, String version) throws RestClientException {
        return offerTargetGroupGetOfferTargetGroupsWithHttpInfo(offerId, version).getBody();
    }

    /**
     * Получает список целевых аудиторий для акции.
     * 
     * <p><b>200</b> - OK
     * @param offerId Id акции. (required)
     * @param version Тип версии. (optional, default to Draft)
     * @return ResponseEntity&lt;ResultModelOfListOfTargetGroupBriefViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfTargetGroupBriefViewModel> offerTargetGroupGetOfferTargetGroupsWithHttpInfo(Integer offerId, String version) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'offerId' is set
        if (offerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'offerId' when calling offerTargetGroupGetOfferTargetGroups");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("offerId", offerId);
        String path = UriComponentsBuilder.fromPath("/api/Offers/{offerId}/targetGroups").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "version", version));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfListOfTargetGroupBriefViewModel> returnType = new ParameterizedTypeReference<ResultModelOfListOfTargetGroupBriefViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
