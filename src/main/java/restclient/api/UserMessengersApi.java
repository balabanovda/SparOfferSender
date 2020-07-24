package restclient.api;

import restclient.ApiClient;

import restclient.model.ResultModelOfUserMessengersViewModel;

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
@Component("restclient.api.UserMessengersApi")
public class UserMessengersApi {
    private ApiClient apiClient;

    public UserMessengersApi() {
        this(new ApiClient());
    }

    @Autowired
    public UserMessengersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Получает информацию о менеджерах пользователя.
     * 
     * <p><b>200</b> - OK
     * @param personId Id пользователя. (required)
     * @return ResultModelOfUserMessengersViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfUserMessengersViewModel userMessengersGet(Integer personId) throws RestClientException {
        return userMessengersGetWithHttpInfo(personId).getBody();
    }

    /**
     * Получает информацию о менеджерах пользователя.
     * 
     * <p><b>200</b> - OK
     * @param personId Id пользователя. (required)
     * @return ResponseEntity&lt;ResultModelOfUserMessengersViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfUserMessengersViewModel> userMessengersGetWithHttpInfo(Integer personId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling userMessengersGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("personId", personId);
        String path = UriComponentsBuilder.fromPath("/api/users/{personId}/messengers").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfUserMessengersViewModel> returnType = new ParameterizedTypeReference<ResultModelOfUserMessengersViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
