package restclient.api;

import restclient.ApiClient;

import restclient.model.ResultModelOfPagedViewModelOfDeviceBriefViewModel;
import restclient.model.ResultModelOfPagedViewModelOfMoneyViewModel;

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
@Component("restclient.api.DeviceApi")
public class DeviceApi {
    private ApiClient apiClient;

    public DeviceApi() {
        this(new ApiClient());
    }

    @Autowired
    public DeviceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Показывает доступные пользователю устройства(кассы).
     * 
     * <p><b>200</b> - OK
     * @param from С какого. (optional, default to 0)
     * @param count Сколько. (optional, default to 2147483647)
     * @param logicalName Подстрока для поиска. (optional, default to )
     * @param mode Режим вывода по признаку удаления. (optional)
     * @param loyaltyProgramId Ид программы лояльности. (optional)
     * @param sortingId Id для сортировки и отображения. (optional)
     * @return ResultModelOfPagedViewModelOfDeviceBriefViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfDeviceBriefViewModel deviceGetAvailableDevices(Integer from, Integer count, String logicalName, String mode, Integer loyaltyProgramId, Integer sortingId) throws RestClientException {
        return deviceGetAvailableDevicesWithHttpInfo(from, count, logicalName, mode, loyaltyProgramId, sortingId).getBody();
    }

    /**
     * Показывает доступные пользователю устройства(кассы).
     * 
     * <p><b>200</b> - OK
     * @param from С какого. (optional, default to 0)
     * @param count Сколько. (optional, default to 2147483647)
     * @param logicalName Подстрока для поиска. (optional, default to )
     * @param mode Режим вывода по признаку удаления. (optional)
     * @param loyaltyProgramId Ид программы лояльности. (optional)
     * @param sortingId Id для сортировки и отображения. (optional)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfDeviceBriefViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfDeviceBriefViewModel> deviceGetAvailableDevicesWithHttpInfo(Integer from, Integer count, String logicalName, String mode, Integer loyaltyProgramId, Integer sortingId) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/Devices").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "logicalName", logicalName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "mode", mode));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "loyaltyProgramId", loyaltyProgramId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sortingId", sortingId));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfDeviceBriefViewModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfDeviceBriefViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить информацию о балансах кассы.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор кассы. (required)
     * @param loyaltyProgramId Идентификатор программы лояльности. (required)
     * @param filterFrom Начало выборки. (optional)
     * @param filterCount Количество. (optional)
     * @param filterName Подстрока для поиска по названию валюты. (optional)
     * @param filterSortingIds Список идентификаторов для первоочередного выбора.. (optional)
     * @return ResultModelOfPagedViewModelOfMoneyViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfMoneyViewModel deviceGetDeviceBalances(Integer id, Integer loyaltyProgramId, Integer filterFrom, Integer filterCount, String filterName, List<Integer> filterSortingIds) throws RestClientException {
        return deviceGetDeviceBalancesWithHttpInfo(id, loyaltyProgramId, filterFrom, filterCount, filterName, filterSortingIds).getBody();
    }

    /**
     * Получить информацию о балансах кассы.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор кассы. (required)
     * @param loyaltyProgramId Идентификатор программы лояльности. (required)
     * @param filterFrom Начало выборки. (optional)
     * @param filterCount Количество. (optional)
     * @param filterName Подстрока для поиска по названию валюты. (optional)
     * @param filterSortingIds Список идентификаторов для первоочередного выбора.. (optional)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfMoneyViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfMoneyViewModel> deviceGetDeviceBalancesWithHttpInfo(Integer id, Integer loyaltyProgramId, Integer filterFrom, Integer filterCount, String filterName, List<Integer> filterSortingIds) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deviceGetDeviceBalances");
        }
        
        // verify the required parameter 'loyaltyProgramId' is set
        if (loyaltyProgramId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'loyaltyProgramId' when calling deviceGetDeviceBalances");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/Devices/{id}/balances").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "loyaltyProgramId", loyaltyProgramId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.from", filterFrom));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.count", filterCount));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.name", filterName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "filter.sortingIds", filterSortingIds));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfMoneyViewModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfMoneyViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
