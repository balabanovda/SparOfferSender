package restclient.api;

import restclient.ApiClient;

import restclient.model.ResultModelOfListOfSystemApiCardInfoModel;
import restclient.model.ResultModelOfPagedViewModelOfPersonsGroupInfoModel;
import restclient.model.ResultModelOfPersonsGroupInfoModel;
import restclient.model.SearchByAttributesModel;

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
@Component("restclient.api.UserGroupApi")
public class UserGroupApi {
    private ApiClient apiClient;

    public UserGroupApi() {
        this(new ApiClient());
    }

    @Autowired
    public UserGroupApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Получить информацию по картам группы пользователей.
     * 
     * <p><b>200</b> - OK
     * @param groupId Идентификатор группы. (required)
     * @param cardShowMode Режим отображения карт. (optional, default to NotDeleted)
     * @param personIdToExclude Идентификатор пользователя, карты которого не учитывать. (optional)
     * @return ResultModelOfListOfSystemApiCardInfoModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfSystemApiCardInfoModel userGroupGetGroupCardsInfo(Integer groupId, String cardShowMode, Integer personIdToExclude) throws RestClientException {
        return userGroupGetGroupCardsInfoWithHttpInfo(groupId, cardShowMode, personIdToExclude).getBody();
    }

    /**
     * Получить информацию по картам группы пользователей.
     * 
     * <p><b>200</b> - OK
     * @param groupId Идентификатор группы. (required)
     * @param cardShowMode Режим отображения карт. (optional, default to NotDeleted)
     * @param personIdToExclude Идентификатор пользователя, карты которого не учитывать. (optional)
     * @return ResponseEntity&lt;ResultModelOfListOfSystemApiCardInfoModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfSystemApiCardInfoModel> userGroupGetGroupCardsInfoWithHttpInfo(Integer groupId, String cardShowMode, Integer personIdToExclude) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'groupId' when calling userGroupGetGroupCardsInfo");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("groupId", groupId);
        String path = UriComponentsBuilder.fromPath("/api/UserGroups/{groupId}/Cards").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cardShowMode", cardShowMode));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "personIdToExclude", personIdToExclude));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfListOfSystemApiCardInfoModel> returnType = new ParameterizedTypeReference<ResultModelOfListOfSystemApiCardInfoModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получение списка пользователей группы.
     * 
     * <p><b>200</b> - OK
     * @param groupId Идентификатор группы. (required)
     * @return ResultModelOfPersonsGroupInfoModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPersonsGroupInfoModel userGroupGetGroupMembers(Integer groupId) throws RestClientException {
        return userGroupGetGroupMembersWithHttpInfo(groupId).getBody();
    }

    /**
     * Получение списка пользователей группы.
     * 
     * <p><b>200</b> - OK
     * @param groupId Идентификатор группы. (required)
     * @return ResponseEntity&lt;ResultModelOfPersonsGroupInfoModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPersonsGroupInfoModel> userGroupGetGroupMembersWithHttpInfo(Integer groupId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'groupId' when calling userGroupGetGroupMembers");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("groupId", groupId);
        String path = UriComponentsBuilder.fromPath("/api/UserGroups/{groupId}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfPersonsGroupInfoModel> returnType = new ParameterizedTypeReference<ResultModelOfPersonsGroupInfoModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получить информацию о клиентах по их атрибутам.
     * 
     * <p><b>200</b> - OK
     * @param filter Данные для поиска. (required)
     * @return ResultModelOfPagedViewModelOfPersonsGroupInfoModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfPersonsGroupInfoModel userGroupSearchPersonsByAttributes(SearchByAttributesModel filter) throws RestClientException {
        return userGroupSearchPersonsByAttributesWithHttpInfo(filter).getBody();
    }

    /**
     * Получить информацию о клиентах по их атрибутам.
     * 
     * <p><b>200</b> - OK
     * @param filter Данные для поиска. (required)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfPersonsGroupInfoModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfPersonsGroupInfoModel> userGroupSearchPersonsByAttributesWithHttpInfo(SearchByAttributesModel filter) throws RestClientException {
        Object postBody = filter;
        
        // verify the required parameter 'filter' is set
        if (filter == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'filter' when calling userGroupSearchPersonsByAttributes");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/UserGroups/SearchByAttributes").build().toUriString();

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

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfPersonsGroupInfoModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfPersonsGroupInfoModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
