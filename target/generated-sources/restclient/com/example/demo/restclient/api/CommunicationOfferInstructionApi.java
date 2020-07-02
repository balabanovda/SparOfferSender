package com.example.demo.restclient.api;

import com.example.demo.restclient.ApiClient;

import com.example.demo.restclient.model.OfferInstructionsModel;
import com.example.demo.restclient.model.ResultModel;
import com.example.demo.restclient.model.ResultModelOfOfferInstructionsModel;

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
@Component("com.example.demo.restclient.api.CommunicationOfferInstructionApi")
public class CommunicationOfferInstructionApi {
    private ApiClient apiClient;

    public CommunicationOfferInstructionApi() {
        this(new ApiClient());
    }

    @Autowired
    public CommunicationOfferInstructionApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Создает коллекцию инструкций для акции.
     * 
     * <p><b>201</b> - Created
     * @param offerId Идентификатор акции. (required)
     * @param model Модель инструкций. (required)
     * @return ResultModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModel communicationOfferInstructionCreateOfferInstruction(Integer offerId, OfferInstructionsModel model) throws RestClientException {
        return communicationOfferInstructionCreateOfferInstructionWithHttpInfo(offerId, model).getBody();
    }

    /**
     * Создает коллекцию инструкций для акции.
     * 
     * <p><b>201</b> - Created
     * @param offerId Идентификатор акции. (required)
     * @param model Модель инструкций. (required)
     * @return ResponseEntity&lt;ResultModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModel> communicationOfferInstructionCreateOfferInstructionWithHttpInfo(Integer offerId, OfferInstructionsModel model) throws RestClientException {
        Object postBody = model;
        
        // verify the required parameter 'offerId' is set
        if (offerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'offerId' when calling communicationOfferInstructionCreateOfferInstruction");
        }
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model' when calling communicationOfferInstructionCreateOfferInstruction");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("offerId", offerId);
        String path = UriComponentsBuilder.fromPath("/api/communicationOffers/{offerId}/instructions").buildAndExpand(uriVariables).toUriString();

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
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Возвращает все инструкций для акций в виде многострочного текста.
     * 
     * <p><b>200</b> - OK
     * @param offerId Идентификатор акции. (required)
     * @return ResultModelOfOfferInstructionsModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfOfferInstructionsModel communicationOfferInstructionGetOfferInstructions(Integer offerId) throws RestClientException {
        return communicationOfferInstructionGetOfferInstructionsWithHttpInfo(offerId).getBody();
    }

    /**
     * Возвращает все инструкций для акций в виде многострочного текста.
     * 
     * <p><b>200</b> - OK
     * @param offerId Идентификатор акции. (required)
     * @return ResponseEntity&lt;ResultModelOfOfferInstructionsModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfOfferInstructionsModel> communicationOfferInstructionGetOfferInstructionsWithHttpInfo(Integer offerId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'offerId' is set
        if (offerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'offerId' when calling communicationOfferInstructionGetOfferInstructions");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("offerId", offerId);
        String path = UriComponentsBuilder.fromPath("/api/communicationOffers/{offerId}/instructions").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ResultModelOfOfferInstructionsModel> returnType = new ParameterizedTypeReference<ResultModelOfOfferInstructionsModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
