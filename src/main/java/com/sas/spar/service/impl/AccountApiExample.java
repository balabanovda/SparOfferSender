package com.sas.spar.service.impl;

import com.example.demo.restclient.*;
import com.example.demo.restclient.auth.*;
import com.example.demo.restclient.model.*;
import com.example.demo.restclient.api.AccountApi;

import java.io.File;
import java.util.*;

public class AccountApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = new ApiClient();

        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("YOUR API KEY");
       // HttpBasicAuth httpBasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Authorization.setApiKeyPrefix("Token");

        // Configure OAuth2 access token for authorization: OAuth2ClientCredentials
        OAuth OAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("OAuth2ClientCredentials");
        OAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2 access token for authorization: OAuth2Code
        OAuth OAuth2Code = (OAuth) defaultClient.getAuthentication("OAuth2Code");
        OAuth2Code.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2 access token for authorization: OAuth2Password
        OAuth OAuth2Password = (OAuth) defaultClient.getAuthentication("OAuth2Password");
        OAuth2Password.setAccessToken("YOUR ACCESS TOKEN");

        AccountApi apiInstance = new AccountApi();
        Integer personId = 56; // Integer | Идентификатор клиента.
        try {
            ResultModelOfListOfAccountViewModel result = apiInstance.accountGetAccountModels(personId);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Exception when calling AccountApi#accountGetAccountModels");
            e.printStackTrace();
        }
    }
}
