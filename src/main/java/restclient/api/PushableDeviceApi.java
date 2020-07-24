package restclient.api;

import restclient.ApiClient;

import restclient.model.ResultModelOfPagedViewModelOfPushableDeviceViewModel;

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
@Component("restclient.api.PushableDeviceApi")
public class PushableDeviceApi {
    private ApiClient apiClient;

    public PushableDeviceApi() {
        this(new ApiClient());
    }

    @Autowired
    public PushableDeviceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Список всех push-устройств клиента.
     * 
     * <p><b>200</b> - OK
     * @param personId Id пользователя. (required)
     * @param from Начало выборки. (optional, default to 0)
     * @param count Количество. (optional, default to 10)
     * @param searchOption Параметр поиска пуш-устройств. (optional, default to Active)
     * @return ResultModelOfPagedViewModelOfPushableDeviceViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfPushableDeviceViewModel pushableDeviceGetPushDevices(Integer personId, Integer from, Integer count, String searchOption) throws RestClientException {
        return pushableDeviceGetPushDevicesWithHttpInfo(personId, from, count, searchOption).getBody();
    }

    /**
     * Список всех push-устройств клиента.
     * 
     * <p><b>200</b> - OK
     * @param personId Id пользователя. (required)
     * @param from Начало выборки. (optional, default to 0)
     * @param count Количество. (optional, default to 10)
     * @param searchOption Параметр поиска пуш-устройств. (optional, default to Active)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfPushableDeviceViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfPushableDeviceViewModel> pushableDeviceGetPushDevicesWithHttpInfo(Integer personId, Integer from, Integer count, String searchOption) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling pushableDeviceGetPushDevices");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("personId", personId);
        String path = UriComponentsBuilder.fromPath("/api/users/{personId}/PushableDevices").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "searchOption", searchOption));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfPushableDeviceViewModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfPushableDeviceViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
