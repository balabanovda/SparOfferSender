package restclient.api;

import restclient.ApiClient;

import restclient.model.CardPackingModel;
import restclient.model.ResultModel;

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
@Component("restclient.api.CardPackingApi")
public class CardPackingApi {
    private ApiClient apiClient;

    public CardPackingApi() {
        this(new ApiClient());
    }

    @Autowired
    public CardPackingApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Расфасовать карту.
     * 
     * <p><b>200</b> - OK
     * @param cardId Идентификатор карты для фасовки. (required)
     * @param packingModel Дополнительная информация для фасовки. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel cardPackingPackCard(Integer cardId, CardPackingModel packingModel) throws RestClientException {
        return cardPackingPackCardWithHttpInfo(cardId, packingModel).getBody();
    }

    /**
     * Расфасовать карту.
     * 
     * <p><b>200</b> - OK
     * @param cardId Идентификатор карты для фасовки. (required)
     * @param packingModel Дополнительная информация для фасовки. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> cardPackingPackCardWithHttpInfo(Integer cardId, CardPackingModel packingModel) throws RestClientException {
        Object postBody = packingModel;
        
        // verify the required parameter 'cardId' is set
        if (cardId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cardId' when calling cardPackingPackCard");
        }
        
        // verify the required parameter 'packingModel' is set
        if (packingModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'packingModel' when calling cardPackingPackCard");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("cardId", cardId);
        String path = UriComponentsBuilder.fromPath("/api/Cards/{cardId}/Pack").buildAndExpand(uriVariables).toUriString();

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
