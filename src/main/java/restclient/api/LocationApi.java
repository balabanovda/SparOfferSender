package restclient.api;

import restclient.ApiClient;

import restclient.model.ResultModelOfListOfString;
import restclient.model.ResultModelOfPagedViewModelOfCityViewModel;
import restclient.model.ResultModelOfPagedViewModelOfRegionViewModel;

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
@Component("restclient.api.LocationApi")
public class LocationApi {
    private ApiClient apiClient;

    public LocationApi() {
        this(new ApiClient());
    }

    @Autowired
    public LocationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Получить список городов.
     * 
     * <p><b>200</b> - OK
     * @param startWith Поисковая строка. (optional)
     * @param count Кол-во выводимых элементов. (optional, default to 10)
     * @return ResultModelOfListOfString
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfString locationGetCities(String startWith, Integer count) throws RestClientException {
        return locationGetCitiesWithHttpInfo(startWith, count).getBody();
    }

    /**
     * Получить список городов.
     * 
     * <p><b>200</b> - OK
     * @param startWith Поисковая строка. (optional)
     * @param count Кол-во выводимых элементов. (optional, default to 10)
     * @return ResponseEntity&lt;ResultModelOfListOfString&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfString> locationGetCitiesWithHttpInfo(String startWith, Integer count) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/Location/Cities").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "startWith", startWith));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfListOfString> returnType = new ParameterizedTypeReference<ResultModelOfListOfString>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить список регионов.
     * 
     * <p><b>200</b> - OK
     * @param regionId Id региона. (required)
     * @param from Индекс первого элемента выборки. (optional, default to 0)
     * @param count Количество элементов. (optional, default to 10)
     * @return ResultModelOfPagedViewModelOfCityViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfCityViewModel locationGetCitiesByRegionId(Integer regionId, Integer from, Integer count) throws RestClientException {
        return locationGetCitiesByRegionIdWithHttpInfo(regionId, from, count).getBody();
    }

    /**
     * Получить список регионов.
     * 
     * <p><b>200</b> - OK
     * @param regionId Id региона. (required)
     * @param from Индекс первого элемента выборки. (optional, default to 0)
     * @param count Количество элементов. (optional, default to 10)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfCityViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfCityViewModel> locationGetCitiesByRegionIdWithHttpInfo(Integer regionId, Integer from, Integer count) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'regionId' is set
        if (regionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'regionId' when calling locationGetCitiesByRegionId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("regionId", regionId);
        String path = UriComponentsBuilder.fromPath("/api/Location/Region/{regionId}/Cities").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfCityViewModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfCityViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить список домов.
     * 
     * <p><b>200</b> - OK
     * @param startWith С какого элемента выводить. (optional)
     * @param count Кол-во выводимых элементов. (optional, default to 10)
     * @param street Фильтр по улице. (optional)
     * @param city Название города. (optional)
     * @return ResultModelOfListOfString
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfString locationGetHouses(String startWith, Integer count, String street, String city) throws RestClientException {
        return locationGetHousesWithHttpInfo(startWith, count, street, city).getBody();
    }

    /**
     * Получить список домов.
     * 
     * <p><b>200</b> - OK
     * @param startWith С какого элемента выводить. (optional)
     * @param count Кол-во выводимых элементов. (optional, default to 10)
     * @param street Фильтр по улице. (optional)
     * @param city Название города. (optional)
     * @return ResponseEntity&lt;ResultModelOfListOfString&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfString> locationGetHousesWithHttpInfo(String startWith, Integer count, String street, String city) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/Location/Houses").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "startWith", startWith));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "street", street));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "city", city));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfListOfString> returnType = new ParameterizedTypeReference<ResultModelOfListOfString>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить список регионов.
     * 
     * <p><b>200</b> - OK
     * @param from Индекс первого элемента выборки. (optional, default to 0)
     * @param count Количество элементов. (optional, default to 10)
     * @return ResultModelOfPagedViewModelOfRegionViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfRegionViewModel locationGetRegions(Integer from, Integer count) throws RestClientException {
        return locationGetRegionsWithHttpInfo(from, count).getBody();
    }

    /**
     * Получить список регионов.
     * 
     * <p><b>200</b> - OK
     * @param from Индекс первого элемента выборки. (optional, default to 0)
     * @param count Количество элементов. (optional, default to 10)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfRegionViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfRegionViewModel> locationGetRegionsWithHttpInfo(Integer from, Integer count) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/Location/Regions").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfRegionViewModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfRegionViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить список улиц.
     * 
     * <p><b>200</b> - OK
     * @param startWith С какого элемента выводить. (optional)
     * @param count Кол-во выводимых элементов. (optional, default to 10)
     * @param city Фильтр по городу. (optional)
     * @return ResultModelOfListOfString
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfString locationGetStreets(String startWith, Integer count, String city) throws RestClientException {
        return locationGetStreetsWithHttpInfo(startWith, count, city).getBody();
    }

    /**
     * Получить список улиц.
     * 
     * <p><b>200</b> - OK
     * @param startWith С какого элемента выводить. (optional)
     * @param count Кол-во выводимых элементов. (optional, default to 10)
     * @param city Фильтр по городу. (optional)
     * @return ResponseEntity&lt;ResultModelOfListOfString&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfString> locationGetStreetsWithHttpInfo(String startWith, Integer count, String city) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/Location/Streets").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "startWith", startWith));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "city", city));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfListOfString> returnType = new ParameterizedTypeReference<ResultModelOfListOfString>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
