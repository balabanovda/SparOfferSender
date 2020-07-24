package restclient.api;

import restclient.ApiClient;

import restclient.model.ResultModelOfVersionModel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
@Component("restclient.api.VersionApi")
public class VersionApi {
    private ApiClient apiClient;

    public VersionApi() {
        this(new ApiClient());
    }

    @Autowired
    public VersionApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Возвращает текущую версию api.
     * 
     * <p><b>200</b> - OK
     * @return ResultModelOfVersionModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfVersionModel versionGetVersion() throws RestClientException {
        return versionGetVersionWithHttpInfo().getBody();
    }

    /**
     * Возвращает текущую версию api.
     * 
     * <p><b>200</b> - OK
     * @return ResponseEntity&lt;ResultModelOfVersionModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfVersionModel> versionGetVersionWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/version").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization" };

        ParameterizedTypeReference<ResultModelOfVersionModel> returnType = new ParameterizedTypeReference<ResultModelOfVersionModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
