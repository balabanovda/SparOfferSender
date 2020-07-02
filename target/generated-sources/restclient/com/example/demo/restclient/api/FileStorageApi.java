package com.example.demo.restclient.api;

import com.example.demo.restclient.ApiClient;

import java.util.UUID;

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
@Component("com.example.demo.restclient.api.FileStorageApi")
public class FileStorageApi {
    private ApiClient apiClient;

    public FileStorageApi() {
        this(new ApiClient());
    }

    @Autowired
    public FileStorageApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Получение файла из файлового хранилища.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор файла. (required)
     * @param taskId Идентификатор задачи рассылки. (optional)
     * @param isDownload Триггер скачивания файла. (optional, default to false)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object fileStorageGet(UUID id, Integer taskId, Boolean isDownload) throws RestClientException {
        return fileStorageGetWithHttpInfo(id, taskId, isDownload).getBody();
    }

    /**
     * Получение файла из файлового хранилища.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор файла. (required)
     * @param taskId Идентификатор задачи рассылки. (optional)
     * @param isDownload Триггер скачивания файла. (optional, default to false)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> fileStorageGetWithHttpInfo(UUID id, Integer taskId, Boolean isDownload) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling fileStorageGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/Files/{id}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "taskId", taskId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "isDownload", isDownload));

        final String[] accepts = { 
            "application/json", "text/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<Object> returnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
