package com.example.demo.restclient.api;

import com.example.demo.restclient.ApiClient;

import java.io.File;
import com.example.demo.restclient.model.ResultModel;
import com.example.demo.restclient.model.ResultModelOfFileEdit;
import com.example.demo.restclient.model.ResultModelOfInt32;
import com.example.demo.restclient.model.ResultModelOfPagedViewModelOfFileEdit;
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
@Component("com.example.demo.restclient.api.FileApi")
public class FileApi {
    private ApiClient apiClient;

    public FileApi() {
        this(new ApiClient());
    }

    @Autowired
    public FileApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Создание файла.
     * 
     * <p><b>201</b> - Created
     * @param name Имя файла. (required)
     * @param file file to upload (required)
     * @param guid Уникальное имя файла. (optional)
     * @return ResultModelOfInt32
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfInt32 fileCreateFile(String name, File file, UUID guid) throws RestClientException {
        return fileCreateFileWithHttpInfo(name, file, guid).getBody();
    }

    /**
     * Создание файла.
     * 
     * <p><b>201</b> - Created
     * @param name Имя файла. (required)
     * @param file file to upload (required)
     * @param guid Уникальное имя файла. (optional)
     * @return ResponseEntity&lt;ResultModelOfInt32&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfInt32> fileCreateFileWithHttpInfo(String name, File file, UUID guid) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling fileCreateFile");
        }
        
        // verify the required parameter 'file' is set
        if (file == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'file' when calling fileCreateFile");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/files").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "guid", guid));

        if (file != null)
            formParams.add("file", new FileSystemResource(file));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "multipart/form-data"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfInt32> returnType = new ParameterizedTypeReference<ResultModelOfInt32>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Удаление файла.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор файла. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel fileDeleteFile(Integer id) throws RestClientException {
        return fileDeleteFileWithHttpInfo(id).getBody();
    }

    /**
     * Удаление файла.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор файла. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> fileDeleteFileWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling fileDeleteFile");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/files/{id}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModel> returnType = new ParameterizedTypeReference<ResultModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить параметры файла.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор файла. (required)
     * @return ResultModelOfFileEdit
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfFileEdit fileGet(Integer id) throws RestClientException {
        return fileGetWithHttpInfo(id).getBody();
    }

    /**
     * Получить параметры файла.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор файла. (required)
     * @return ResponseEntity&lt;ResultModelOfFileEdit&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfFileEdit> fileGetWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling fileGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/files/{id}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfFileEdit> returnType = new ParameterizedTypeReference<ResultModelOfFileEdit>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить параметры файла.
     * Используется только в витрине.
     * <p><b>200</b> - OK
     * @param guid Guid файла. (required)
     * @return ResultModelOfFileEdit
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfFileEdit fileGetFileByGuid(UUID guid) throws RestClientException {
        return fileGetFileByGuidWithHttpInfo(guid).getBody();
    }

    /**
     * Получить параметры файла.
     * Используется только в витрине.
     * <p><b>200</b> - OK
     * @param guid Guid файла. (required)
     * @return ResponseEntity&lt;ResultModelOfFileEdit&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfFileEdit> fileGetFileByGuidWithHttpInfo(UUID guid) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'guid' is set
        if (guid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'guid' when calling fileGetFileByGuid");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("guid", guid);
        String path = UriComponentsBuilder.fromPath("/api/files/guid/{guid}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfFileEdit> returnType = new ParameterizedTypeReference<ResultModelOfFileEdit>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить указанное количество файлов с указанной позиции.
     * 
     * <p><b>200</b> - OK
     * @param from Позиция первого файла. (optional, default to 0)
     * @param count Количество файлов. (optional, default to 20)
     * @param fileName Поиск по имени файла. (optional)
     * @param guid Поиск по Guid. (optional)
     * @return ResultModelOfPagedViewModelOfFileEdit
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfFileEdit fileGets(Integer from, Integer count, String fileName, UUID guid) throws RestClientException {
        return fileGetsWithHttpInfo(from, count, fileName, guid).getBody();
    }

    /**
     * Получить указанное количество файлов с указанной позиции.
     * 
     * <p><b>200</b> - OK
     * @param from Позиция первого файла. (optional, default to 0)
     * @param count Количество файлов. (optional, default to 20)
     * @param fileName Поиск по имени файла. (optional)
     * @param guid Поиск по Guid. (optional)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfFileEdit&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfFileEdit> fileGetsWithHttpInfo(Integer from, Integer count, String fileName, UUID guid) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/files").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "fileName", fileName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "guid", guid));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfFileEdit> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfFileEdit>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Максимальный размер загружаемого файла.
     * 
     * <p><b>200</b> - OK
     * @return Integer
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Integer fileMaxSize() throws RestClientException {
        return fileMaxSizeWithHttpInfo().getBody();
    }

    /**
     * Максимальный размер загружаемого файла.
     * 
     * <p><b>200</b> - OK
     * @return ResponseEntity&lt;Integer&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Integer> fileMaxSizeWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/files/maxSizeFile").build().toUriString();

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

        ParameterizedTypeReference<Integer> returnType = new ParameterizedTypeReference<Integer>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Редактирование файла.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор файла. (required)
     * @param guid Уникальное имя файла. (required)
     * @param name Имя файла. (required)
     * @param file file to upload (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel fileUpdateFile(Integer id, UUID guid, String name, File file) throws RestClientException {
        return fileUpdateFileWithHttpInfo(id, guid, name, file).getBody();
    }

    /**
     * Редактирование файла.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор файла. (required)
     * @param guid Уникальное имя файла. (required)
     * @param name Имя файла. (required)
     * @param file file to upload (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> fileUpdateFileWithHttpInfo(Integer id, UUID guid, String name, File file) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling fileUpdateFile");
        }
        
        // verify the required parameter 'guid' is set
        if (guid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'guid' when calling fileUpdateFile");
        }
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling fileUpdateFile");
        }
        
        // verify the required parameter 'file' is set
        if (file == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'file' when calling fileUpdateFile");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/files/{id}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "guid", guid));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));

        if (file != null)
            formParams.add("file", new FileSystemResource(file));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "multipart/form-data"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModel> returnType = new ParameterizedTypeReference<ResultModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
