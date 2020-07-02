package com.example.demo.restclient.api;

import com.example.demo.restclient.ApiClient;

import com.example.demo.restclient.model.ResultModelOfListOfLegalViewModel;

import java.util.ArrayList;
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
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
@Component("com.example.demo.restclient.api.LegalApi")
public class LegalApi {
    private ApiClient apiClient;

    public LegalApi() {
        this(new ApiClient());
    }

    @Autowired
    public LegalApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Возвращает список доступных юридических лиц.
     * 
     * <p><b>200</b> - OK
     * @param name Название. (optional, default to )
     * @param partnersIds Идентификаторы партнеров. (optional)
     * @param from С какого. (optional, default to 0)
     * @param count Сколько. (optional, default to 10)
     * @param loyaltyProgramId Идентификатор программы лояльности. (optional)
     * @return ResultModelOfListOfLegalViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfLegalViewModel legalGetLegals(String name, List<Integer> partnersIds, Integer from, Integer count, Integer loyaltyProgramId) throws RestClientException {
        return legalGetLegalsWithHttpInfo(name, partnersIds, from, count, loyaltyProgramId).getBody();
    }

    /**
     * Возвращает список доступных юридических лиц.
     * 
     * <p><b>200</b> - OK
     * @param name Название. (optional, default to )
     * @param partnersIds Идентификаторы партнеров. (optional)
     * @param from С какого. (optional, default to 0)
     * @param count Сколько. (optional, default to 10)
     * @param loyaltyProgramId Идентификатор программы лояльности. (optional)
     * @return ResponseEntity&lt;ResultModelOfListOfLegalViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfLegalViewModel> legalGetLegalsWithHttpInfo(String name, List<Integer> partnersIds, Integer from, Integer count, Integer loyaltyProgramId) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/legals").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "partnersIds", partnersIds));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "loyaltyProgramId", loyaltyProgramId));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfListOfLegalViewModel> returnType = new ParameterizedTypeReference<ResultModelOfListOfLegalViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
