package com.example.demo.restclient.api;

import com.example.demo.restclient.ApiClient;

import com.example.demo.restclient.model.ResultModelOfListOfAnketaQuestionViewModel;

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
@Component("com.example.demo.restclient.api.AnketaApi")
public class AnketaApi {
    private ApiClient apiClient;

    public AnketaApi() {
        this(new ApiClient());
    }

    @Autowired
    public AnketaApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Получить список вопросов анкеты.
     * 
     * <p><b>200</b> - OK
     * @return ResultModelOfListOfAnketaQuestionViewModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfListOfAnketaQuestionViewModel anketaGetQuestions() throws RestClientException {
        return anketaGetQuestionsWithHttpInfo().getBody();
    }

    /**
     * Получить список вопросов анкеты.
     * 
     * <p><b>200</b> - OK
     * @return ResponseEntity&lt;ResultModelOfListOfAnketaQuestionViewModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfListOfAnketaQuestionViewModel> anketaGetQuestionsWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/Anketa/Questions").build().toUriString();

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

        ParameterizedTypeReference<ResultModelOfListOfAnketaQuestionViewModel> returnType = new ParameterizedTypeReference<ResultModelOfListOfAnketaQuestionViewModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
