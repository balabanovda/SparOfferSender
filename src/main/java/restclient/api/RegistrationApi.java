package restclient.api;

import restclient.ApiClient;

import restclient.model.FinishRegistrationViewModel;
import restclient.model.ResultModelOfFinishRegistrationResultModel;
import restclient.model.ResultModelOfSystemRegistrationResult;
import restclient.model.SystemRegistrationModel;

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
@Component("restclient.api.RegistrationApi")
public class RegistrationApi {
    private ApiClient apiClient;

    public RegistrationApi() {
        this(new ApiClient());
    }

    @Autowired
    public RegistrationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Регистрация по номеру карты.
     * 
     * <p><b>200</b> - OK
     * @param model Данные для регистрации. (required)
     * @return ResultModelOfSystemRegistrationResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfSystemRegistrationResult registrationPostBeginRegistration(SystemRegistrationModel model) throws RestClientException {
        return registrationPostBeginRegistrationWithHttpInfo(model).getBody();
    }

    /**
     * Регистрация по номеру карты.
     * 
     * <p><b>200</b> - OK
     * @param model Данные для регистрации. (required)
     * @return ResponseEntity&lt;ResultModelOfSystemRegistrationResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfSystemRegistrationResult> registrationPostBeginRegistrationWithHttpInfo(SystemRegistrationModel model) throws RestClientException {
        Object postBody = model;
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling registrationPostBeginRegistration");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/Registration/BeginRegistration").build().toUriString();

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

        ParameterizedTypeReference<ResultModelOfSystemRegistrationResult> returnType = new ParameterizedTypeReference<ResultModelOfSystemRegistrationResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Попробовать закончить активацию.
     * 
     * <p><b>200</b> - OK
     * @param finishRegistrationModel Идентификатор клиента. (required)
     * @return ResultModelOfFinishRegistrationResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfFinishRegistrationResultModel registrationTryFinishRegistration(FinishRegistrationViewModel finishRegistrationModel) throws RestClientException {
        return registrationTryFinishRegistrationWithHttpInfo(finishRegistrationModel).getBody();
    }

    /**
     * Попробовать закончить активацию.
     * 
     * <p><b>200</b> - OK
     * @param finishRegistrationModel Идентификатор клиента. (required)
     * @return ResponseEntity&lt;ResultModelOfFinishRegistrationResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfFinishRegistrationResultModel> registrationTryFinishRegistrationWithHttpInfo(FinishRegistrationViewModel finishRegistrationModel) throws RestClientException {
        Object postBody = finishRegistrationModel;
        
        // verify the required parameter 'finishRegistrationModel' is set
        if (finishRegistrationModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'finishRegistrationModel' when calling registrationTryFinishRegistration");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/Registration/TryFinishRegistration").build().toUriString();

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

        ParameterizedTypeReference<ResultModelOfFinishRegistrationResultModel> returnType = new ParameterizedTypeReference<ResultModelOfFinishRegistrationResultModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
