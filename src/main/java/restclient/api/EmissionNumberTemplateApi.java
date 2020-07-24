package restclient.api;

import restclient.ApiClient;

import restclient.model.NumberTemplateViewModel;
import restclient.model.ResultModel;
import restclient.model.ResultModelOfInt32;
import restclient.model.ResultModelOfNumberTemplateViewModel;
import restclient.model.ResultModelOfPagedViewModelOfNumberTemplateViewModel;

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
@Component("restclient.api.EmissionNumberTemplateApi")
public class EmissionNumberTemplateApi {
    private ApiClient apiClient;

    public EmissionNumberTemplateApi() {
        this(new ApiClient());
    }

    @Autowired
    public EmissionNumberTemplateApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Добавить в архив шаблон для генерации номеров выпусков.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel emissionNumberTemplateArchiveEmissionNumberTemplate(Integer id) throws RestClientException {
        return emissionNumberTemplateArchiveEmissionNumberTemplateWithHttpInfo(id).getBody();
    }

    /**
     * Добавить в архив шаблон для генерации номеров выпусков.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> emissionNumberTemplateArchiveEmissionNumberTemplateWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling emissionNumberTemplateArchiveEmissionNumberTemplate");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/emissionNumberTemplates/{id}").buildAndExpand(uriVariables).toUriString();

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
     * Создание шаблона для генерации номеров выпусков.
     * 
     * <p><b>201</b> - Created
     * @param numberTemplateModel Модель шаблона для генерации номеров выпусков. (required)
     * @return ResultModelOfInt32
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfInt32 emissionNumberTemplateCreateEmissionTemplate(NumberTemplateViewModel numberTemplateModel) throws RestClientException {
        return emissionNumberTemplateCreateEmissionTemplateWithHttpInfo(numberTemplateModel).getBody();
    }

    /**
     * Создание шаблона для генерации номеров выпусков.
     * 
     * <p><b>201</b> - Created
     * @param numberTemplateModel Модель шаблона для генерации номеров выпусков. (required)
     * @return ResponseEntity&lt;ResultModelOfInt32&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfInt32> emissionNumberTemplateCreateEmissionTemplateWithHttpInfo(NumberTemplateViewModel numberTemplateModel) throws RestClientException {
        Object postBody = numberTemplateModel;
        
        // verify the required parameter 'numberTemplateModel' is set
        if (numberTemplateModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'numberTemplateModel' when calling emissionNumberTemplateCreateEmissionTemplate");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/emissionNumberTemplates").build().toUriString();

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

        ParameterizedTypeReference<ResultModelOfInt32> returnType = new ParameterizedTypeReference<ResultModelOfInt32>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Возвращает шаблон для генерации номеров выпусков по его ID.
     * 
     * <p><b>200</b> - OK
     * @param id ID шаблона уведомлений. (required)
     * @return ResultModelOfNumberTemplateViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfNumberTemplateViewModel emissionNumberTemplateGetEmissionTemplate(Integer id) throws RestClientException {
        return emissionNumberTemplateGetEmissionTemplateWithHttpInfo(id).getBody();
    }

    /**
     * Возвращает шаблон для генерации номеров выпусков по его ID.
     * 
     * <p><b>200</b> - OK
     * @param id ID шаблона уведомлений. (required)
     * @return ResponseEntity&lt;ResultModelOfNumberTemplateViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfNumberTemplateViewModel> emissionNumberTemplateGetEmissionTemplateWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling emissionNumberTemplateGetEmissionTemplate");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/emissionNumberTemplates/{id}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfNumberTemplateViewModel> returnType = new ParameterizedTypeReference<ResultModelOfNumberTemplateViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Получение списка всех шаблонов для генерации номеров выпусков.
     * 
     * <p><b>200</b> - OK
     * @param filterFrom Начало выборки. (optional)
     * @param filterCount Количество. (optional)
     * @param filterEmissionType Тип шаблона уведомлений. (optional)
     * @param filterTextSubStr Подстрока текстового описания шаблона. (optional)
     * @param filterShowMode Режим отображения архивных шаблонов. (optional)
     * @return ResultModelOfPagedViewModelOfNumberTemplateViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfPagedViewModelOfNumberTemplateViewModel emissionNumberTemplateGetEmissionTemplates(Integer filterFrom, Integer filterCount, String filterEmissionType, String filterTextSubStr, String filterShowMode) throws RestClientException {
        return emissionNumberTemplateGetEmissionTemplatesWithHttpInfo(filterFrom, filterCount, filterEmissionType, filterTextSubStr, filterShowMode).getBody();
    }

    /**
     * Получение списка всех шаблонов для генерации номеров выпусков.
     * 
     * <p><b>200</b> - OK
     * @param filterFrom Начало выборки. (optional)
     * @param filterCount Количество. (optional)
     * @param filterEmissionType Тип шаблона уведомлений. (optional)
     * @param filterTextSubStr Подстрока текстового описания шаблона. (optional)
     * @param filterShowMode Режим отображения архивных шаблонов. (optional)
     * @return ResponseEntity&lt;ResultModelOfPagedViewModelOfNumberTemplateViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfPagedViewModelOfNumberTemplateViewModel> emissionNumberTemplateGetEmissionTemplatesWithHttpInfo(Integer filterFrom, Integer filterCount, String filterEmissionType, String filterTextSubStr, String filterShowMode) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/emissionNumberTemplates").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.from", filterFrom));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.count", filterCount));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.emissionType", filterEmissionType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.textSubStr", filterTextSubStr));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter.showMode", filterShowMode));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password" };

        ParameterizedTypeReference<ResultModelOfPagedViewModelOfNumberTemplateViewModel> returnType = new ParameterizedTypeReference<ResultModelOfPagedViewModelOfNumberTemplateViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Восстановить из архива шаблон для генерации номеров выпусков.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel emissionNumberTemplateRestoreEmissionNumberTemplate(Integer id) throws RestClientException {
        return emissionNumberTemplateRestoreEmissionNumberTemplateWithHttpInfo(id).getBody();
    }

    /**
     * Восстановить из архива шаблон для генерации номеров выпусков.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> emissionNumberTemplateRestoreEmissionNumberTemplateWithHttpInfo(Integer id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling emissionNumberTemplateRestoreEmissionNumberTemplate");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/emissionNumberTemplates/{id}/restore").buildAndExpand(uriVariables).toUriString();

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
     * Редактирование шаблона для генерации номеров выпусков.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор шаблона для генерации номеров выпусков. (required)
     * @param numberTemplateModel Модель для шаблона для генерации номеров выпусков. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel emissionNumberTemplateUpdateEmissionTemplate(Integer id, NumberTemplateViewModel numberTemplateModel) throws RestClientException {
        return emissionNumberTemplateUpdateEmissionTemplateWithHttpInfo(id, numberTemplateModel).getBody();
    }

    /**
     * Редактирование шаблона для генерации номеров выпусков.
     * 
     * <p><b>200</b> - OK
     * @param id Идентификатор шаблона для генерации номеров выпусков. (required)
     * @param numberTemplateModel Модель для шаблона для генерации номеров выпусков. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> emissionNumberTemplateUpdateEmissionTemplateWithHttpInfo(Integer id, NumberTemplateViewModel numberTemplateModel) throws RestClientException {
        Object postBody = numberTemplateModel;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling emissionNumberTemplateUpdateEmissionTemplate");
        }
        
        // verify the required parameter 'numberTemplateModel' is set
        if (numberTemplateModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'numberTemplateModel' when calling emissionNumberTemplateUpdateEmissionTemplate");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/emissionNumberTemplates/{id}").buildAndExpand(uriVariables).toUriString();

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
