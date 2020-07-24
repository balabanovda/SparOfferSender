package restclient.api;

import restclient.ApiClient;

import restclient.model.RegexpConfigurationListViewModel;
import restclient.model.ResultModel;
import restclient.model.ResultModelOfListOfRegexpConfigurationViewModel;

import java.util.List;

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
@Component("restclient.api.RegexpApi")
public class RegexpApi {
    private ApiClient apiClient;

    public RegexpApi() {
        this(new ApiClient());
    }

    @Autowired
    public RegexpApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Изменить значения конфигураций на новые.
     * 
     * <p><b>200</b> - OK
     * @param regexpConfigs Новые значения. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel regexpEditConfiguration(RegexpConfigurationListViewModel regexpConfigs) throws RestClientException {
        return regexpEditConfigurationWithHttpInfo(regexpConfigs).getBody();
    }

    /**
     * Изменить значения конфигураций на новые.
     * 
     * <p><b>200</b> - OK
     * @param regexpConfigs Новые значения. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> regexpEditConfigurationWithHttpInfo(RegexpConfigurationListViewModel regexpConfigs) throws RestClientException {
        Object postBody = regexpConfigs;
        
        // verify the required parameter 'regexpConfigs' is set
        if (regexpConfigs == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'regexpConfigs' when calling regexpEditConfiguration");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/regexp").build().toUriString();

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
     * Получить коллекцию всех конфигураций регулярных выражений.
     * 
     * <p><b>200</b> - OK
     * @return ResultModelOfListOfRegexpConfigurationViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfRegexpConfigurationViewModel regexpGet() throws RestClientException {
        return regexpGetWithHttpInfo().getBody();
    }

    /**
     * Получить коллекцию всех конфигураций регулярных выражений.
     * 
     * <p><b>200</b> - OK
     * @return ResponseEntity&lt;ResultModelOfListOfRegexpConfigurationViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfRegexpConfigurationViewModel> regexpGetWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/regexp").build().toUriString();

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

        ParameterizedTypeReference<ResultModelOfListOfRegexpConfigurationViewModel> returnType = new ParameterizedTypeReference<ResultModelOfListOfRegexpConfigurationViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
