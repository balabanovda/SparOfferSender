package restclient.api;

import restclient.ApiClient;

import restclient.model.DeviceCapabilityListViewModel;
import restclient.model.ResultModel;
import restclient.model.ResultModelOfListOfDeviceCapabilityViewModel;

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
@Component("restclient.api.DeviceCapabilityApi")
public class DeviceCapabilityApi {
    private ApiClient apiClient;

    public DeviceCapabilityApi() {
        this(new ApiClient());
    }

    @Autowired
    public DeviceCapabilityApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Получить все возможности типа кассы.
     * 
     * <p><b>200</b> - OK
     * @param deviceTypeId Индификатор типа кассы. (required)
     * @return ResultModelOfListOfDeviceCapabilityViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfDeviceCapabilityViewModel deviceCapabilityGetAll(Integer deviceTypeId) throws RestClientException {
        return deviceCapabilityGetAllWithHttpInfo(deviceTypeId).getBody();
    }

    /**
     * Получить все возможности типа кассы.
     * 
     * <p><b>200</b> - OK
     * @param deviceTypeId Индификатор типа кассы. (required)
     * @return ResponseEntity&lt;ResultModelOfListOfDeviceCapabilityViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfDeviceCapabilityViewModel> deviceCapabilityGetAllWithHttpInfo(Integer deviceTypeId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'deviceTypeId' is set
        if (deviceTypeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'deviceTypeId' when calling deviceCapabilityGetAll");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("deviceTypeId", deviceTypeId);
        String path = UriComponentsBuilder.fromPath("/api/DeviceCapabilities/{deviceTypeId}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfListOfDeviceCapabilityViewModel> returnType = new ParameterizedTypeReference<ResultModelOfListOfDeviceCapabilityViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Обновить возможности типа кассы.
     * 
     * <p><b>200</b> - OK
     * @param deviceTypeId Индификатор {Loymax.Entities.DeviceType}. (required)
     * @param capabilities Коллекция моделей {Loymax.SystemApi.Models.Devices.DeviceCapabilityViewModel}. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel deviceCapabilityUpdate(Integer deviceTypeId, DeviceCapabilityListViewModel capabilities) throws RestClientException {
        return deviceCapabilityUpdateWithHttpInfo(deviceTypeId, capabilities).getBody();
    }

    /**
     * Обновить возможности типа кассы.
     * 
     * <p><b>200</b> - OK
     * @param deviceTypeId Индификатор {Loymax.Entities.DeviceType}. (required)
     * @param capabilities Коллекция моделей {Loymax.SystemApi.Models.Devices.DeviceCapabilityViewModel}. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> deviceCapabilityUpdateWithHttpInfo(Integer deviceTypeId, DeviceCapabilityListViewModel capabilities) throws RestClientException {
        Object postBody = capabilities;
        
        // verify the required parameter 'deviceTypeId' is set
        if (deviceTypeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'deviceTypeId' when calling deviceCapabilityUpdate");
        }
        
        // verify the required parameter 'capabilities' is set
        if (capabilities == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'capabilities' when calling deviceCapabilityUpdate");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("deviceTypeId", deviceTypeId);
        String path = UriComponentsBuilder.fromPath("/api/DeviceCapabilities/{deviceTypeId}").buildAndExpand(uriVariables).toUriString();

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
