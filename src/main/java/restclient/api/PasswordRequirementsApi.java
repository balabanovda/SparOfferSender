package restclient.api;

import restclient.ApiClient;

import restclient.model.PasswordRuleViewModel;
import restclient.model.ResultModel;
import restclient.model.ResultModelOfListOfPasswordRequirementViewModel;
import restclient.model.ResultModelOfListOfPasswordRuleViewModel;

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
@Component("restclient.api.PasswordRequirementsApi")
public class PasswordRequirementsApi {
    private ApiClient apiClient;

    public PasswordRequirementsApi() {
        this(new ApiClient());
    }

    @Autowired
    public PasswordRequirementsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Получить список правил проверок пароля.
     * 
     * <p><b>200</b> - OK
     * @return ResultModelOfListOfPasswordRuleViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfPasswordRuleViewModel passwordRequirementsGetAll() throws RestClientException {
        return passwordRequirementsGetAllWithHttpInfo().getBody();
    }

    /**
     * Получить список правил проверок пароля.
     * 
     * <p><b>200</b> - OK
     * @return ResponseEntity&lt;ResultModelOfListOfPasswordRuleViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfPasswordRuleViewModel> passwordRequirementsGetAllWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/Password/Requirements/Settings").build().toUriString();

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

        ParameterizedTypeReference<ResultModelOfListOfPasswordRuleViewModel> returnType = new ParameterizedTypeReference<ResultModelOfListOfPasswordRuleViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить список активных правил проверок пароля.
     * 
     * <p><b>200</b> - OK
     * @return ResultModelOfListOfPasswordRequirementViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfPasswordRequirementViewModel passwordRequirementsGetAllActiveRules() throws RestClientException {
        return passwordRequirementsGetAllActiveRulesWithHttpInfo().getBody();
    }

    /**
     * Получить список активных правил проверок пароля.
     * 
     * <p><b>200</b> - OK
     * @return ResponseEntity&lt;ResultModelOfListOfPasswordRequirementViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfPasswordRequirementViewModel> passwordRequirementsGetAllActiveRulesWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/Password/Requirements").build().toUriString();

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

        ParameterizedTypeReference<ResultModelOfListOfPasswordRequirementViewModel> returnType = new ParameterizedTypeReference<ResultModelOfListOfPasswordRequirementViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Обновить список правил проверок пароля.
     * 
     * <p><b>200</b> - OK
     * @param viewModels Список правил проверок пароля. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel passwordRequirementsUpdate(List<PasswordRuleViewModel> viewModels) throws RestClientException {
        return passwordRequirementsUpdateWithHttpInfo(viewModels).getBody();
    }

    /**
     * Обновить список правил проверок пароля.
     * 
     * <p><b>200</b> - OK
     * @param viewModels Список правил проверок пароля. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> passwordRequirementsUpdateWithHttpInfo(List<PasswordRuleViewModel> viewModels) throws RestClientException {
        Object postBody = viewModels;
        
        // verify the required parameter 'viewModels' is set
        if (viewModels == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'viewModels' when calling passwordRequirementsUpdate");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/Password/Requirements/Settings").build().toUriString();

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
