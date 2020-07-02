package com.example.demo.restclient.api;

import com.example.demo.restclient.ApiClient;

import java.time.OffsetDateTime;
import com.example.demo.restclient.model.ResultModel;
import com.example.demo.restclient.model.ResultModelOfPagedViewModelOfSystemApiAnnouncementModel;
import com.example.demo.restclient.model.ResultModelOfSystemApiAnnouncementModel;
import com.example.demo.restclient.model.SystemApiAnnouncementModel;

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
@Component("com.example.demo.restclient.api.AnnouncementApi")
public class AnnouncementApi {
    private ApiClient apiClient;

    public AnnouncementApi() {
        this(new ApiClient());
    }

    @Autowired
    public AnnouncementApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Отправить рекламу в архив.
     * 
     * <p><b>200</b> - OK
     * @param id The id. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel announcementArchiveAnnouncement(Integer id) throws RestClientException {
        return announcementArchiveAnnouncementWithHttpInfo(id).getBody();
    }

    /**
     * Отправить рекламу в архив.
     * 
     * <p><b>200</b> - OK
     * @param id The id. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> announcementArchiveAnnouncementWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling announcementArchiveAnnouncement");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/Announcements/{id}/archive").buildAndExpand(uriVariables).toUriString();

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
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Завершить создание рекламы.
     * 
     * <p><b>200</b> - OK
     * @param id The id. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel announcementCompleteAnnouncement(Integer id) throws RestClientException {
        return announcementCompleteAnnouncementWithHttpInfo(id).getBody();
    }

    /**
     * Завершить создание рекламы.
     * 
     * <p><b>200</b> - OK
     * @param id The id. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> announcementCompleteAnnouncementWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling announcementCompleteAnnouncement");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/Announcements/{id}/complete").buildAndExpand(uriVariables).toUriString();

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
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Создать рекламу.
     * 
     * <p><b>201</b> - Created
     * @param model Модель рекламы. (required)
     * @param timeZone Временная зона. (optional, default to 0)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel announcementCreateAnnouncement(SystemApiAnnouncementModel model, Integer timeZone) throws RestClientException {
        return announcementCreateAnnouncementWithHttpInfo(model, timeZone).getBody();
    }

    /**
     * Создать рекламу.
     * 
     * <p><b>201</b> - Created
     * @param model Модель рекламы. (required)
     * @param timeZone Временная зона. (optional, default to 0)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> announcementCreateAnnouncementWithHttpInfo(SystemApiAnnouncementModel model, Integer timeZone) throws RestClientException {
        Object postBody = model;
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling announcementCreateAnnouncement");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/Announcements").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (timeZone != null)
        headerParams.add("timeZone", apiClient.parameterToString(timeZone));

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
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Удалить рекламу.
     * 
     * <p><b>200</b> - OK
     * @param id The id. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel announcementDeleteAnnouncement(Integer id) throws RestClientException {
        return announcementDeleteAnnouncementWithHttpInfo(id).getBody();
    }

    /**
     * Удалить рекламу.
     * 
     * <p><b>200</b> - OK
     * @param id The id. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> announcementDeleteAnnouncementWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling announcementDeleteAnnouncement");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/Announcements/{id}").buildAndExpand(uriVariables).toUriString();

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
     * Возвращает рекламу по идентификатору.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор. (required)
     * @return ResultModelOfSystemApiAnnouncementModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfSystemApiAnnouncementModel announcementGetAnnouncement(Integer id) throws RestClientException {
        return announcementGetAnnouncementWithHttpInfo(id).getBody();
    }

    /**
     * Возвращает рекламу по идентификатору.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор. (required)
     * @return ResponseEntity&lt;ResultModelOfSystemApiAnnouncementModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfSystemApiAnnouncementModel> announcementGetAnnouncementWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling announcementGetAnnouncement");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/Announcements/{id}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfSystemApiAnnouncementModel> returnType = new ParameterizedTypeReference<ResultModelOfSystemApiAnnouncementModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Возвращает список всех реклам для рекламного места.
     * 
     * <p><b>200</b> - OK
     * @param from С какой рекламы. (optional, default to 0)
     * @param count Сколько. (optional, default to 10)
     * @param filterTitleSubstr Подстрока для поиска по названию рекламы. (optional)
     * @param filterSpaceName Подстрока для поиска по названию рекламного места. (optional)
     * @param filterState Gets or sets the state. (optional)
     * @param filterDateFrom Начальная дата выборки. (optional)
     * @param filterDateTo Конечная дата выборки. (optional)
     * @param filterArchivedState Сущности из архива. (optional)
     * @return ResultModelOfPagedViewModelOfSystemApiAnnouncementModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfSystemApiAnnouncementModel announcementGetAnnouncements(Integer from, Integer count, String filterTitleSubstr, String filterSpaceName, String filterState, OffsetDateTime filterDateFrom, OffsetDateTime filterDateTo, String filterArchivedState) throws RestClientException {
        return announcementGetAnnouncementsWithHttpInfo(from, count, filterTitleSubstr, filterSpaceName, filterState, filterDateFrom, filterDateTo, filterArchivedState).getBody();
    }

    /**
     * Возвращает список всех реклам для рекламного места.
     * 
     * <p><b>200</b> - OK
     * @param from С какой рекламы. (optional, default to 0)
     * @param count Сколько. (optional, default to 10)
     * @param filterTitleSubstr Подстрока для поиска по названию рекламы. (optional)
     * @param filterSpaceName Подстрока для поиска по названию рекламного места. (optional)
     * @param filterState Gets or sets the state. (optional)
     * @param filterDateFrom Начальная дата выборки. (optional)
     * @param filterDateTo Конечная дата выборки. (optional)
     * @param filterArchivedState Сущности из архива. (optional)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfSystemApiAnnouncementModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfSystemApiAnnouncementModel> announcementGetAnnouncementsWithHttpInfo(Integer from, Integer count, String filterTitleSubstr, String filterSpaceName, String filterState, OffsetDateTime filterDateFrom, OffsetDateTime filterDateTo, String filterArchivedState) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/Announcements").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.titleSubstr", filterTitleSubstr));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.spaceName", filterSpaceName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.state", filterState));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.dateFrom", filterDateFrom));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.dateTo", filterDateTo));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.archivedState", filterArchivedState));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfSystemApiAnnouncementModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfSystemApiAnnouncementModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Опубликовать рекламу.
     * 
     * <p><b>200</b> - OK
     * @param id The id. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel announcementPublishAnnouncement(Integer id) throws RestClientException {
        return announcementPublishAnnouncementWithHttpInfo(id).getBody();
    }

    /**
     * Опубликовать рекламу.
     * 
     * <p><b>200</b> - OK
     * @param id The id. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> announcementPublishAnnouncementWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling announcementPublishAnnouncement");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/Announcements/{id}/publish").buildAndExpand(uriVariables).toUriString();

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
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Восстановить рекламу из архива.
     * 
     * <p><b>200</b> - OK
     * @param id The id. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel announcementRestoreAnnouncement(Integer id) throws RestClientException {
        return announcementRestoreAnnouncementWithHttpInfo(id).getBody();
    }

    /**
     * Восстановить рекламу из архива.
     * 
     * <p><b>200</b> - OK
     * @param id The id. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> announcementRestoreAnnouncementWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling announcementRestoreAnnouncement");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/Announcements/{id}/restore").buildAndExpand(uriVariables).toUriString();

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
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Обновить рекламу.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор рекламы. (required)
     * @param model Модель рекламы. (required)
     * @param timeZone Временная зона. (optional, default to 0)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel announcementUpdateAnnouncement(Integer id, SystemApiAnnouncementModel model, Integer timeZone) throws RestClientException {
        return announcementUpdateAnnouncementWithHttpInfo(id, model, timeZone).getBody();
    }

    /**
     * Обновить рекламу.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор рекламы. (required)
     * @param model Модель рекламы. (required)
     * @param timeZone Временная зона. (optional, default to 0)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> announcementUpdateAnnouncementWithHttpInfo(Integer id, SystemApiAnnouncementModel model, Integer timeZone) throws RestClientException {
        Object postBody = model;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling announcementUpdateAnnouncement");
        }
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling announcementUpdateAnnouncement");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/Announcements/{id}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (timeZone != null)
        headerParams.add("timeZone", apiClient.parameterToString(timeZone));

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
