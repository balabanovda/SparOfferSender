package com.sas.spar.service.impl;

import restclient.api.OfferImportExportApi;
import restclient.auth.*;
import restclient.model.*;
import restclient.*;


import java.io.IOException;

public class AccountApiExample {

    public static ResultModelOfOffersImportResponse importModel(OffersImportModel offersImportModel) throws IOException {
        ApiClient defaultClient = new ApiClient();
        System.out.println("Я в import Model");
        // Configure API key authorization: Authorization
        ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setApiKey("1DR_P_FisGP2ntDd_iqQPfm86-c8eHWd6BjyWp9CpCrsBHZGkuDLs4C7e26sQes1QUObkBmB5sOHd0DXCZzqlA3ThSp82hZs613EOu0XjEBUKGbJx5OYPxnR1abMBM9F88EPH0EjXV9mndM23s5G3WT9vXSqguo10ogyXfL1uQLEl9ugrwXVSgcNvSwk5wbI6glUKAqsXHPQoVFS-Q_SHyySnwXJaLT-xmYxOVWHZXroAerdQNvljIE_9tSr4cWVBDby0_AtZR37TA_1KjA1y3GvtEXgI4tsC-J1FTemgZY1uQUaxn2NowkIJcX77qZqHnYIqnq0HhGjC1N6_owPYN0bSY1fzoDjJ780zgiOC9IHoVMNAG8bd18c26-Fpe4UafENylWlsYCNRQIMifr_8_gdHCVg43kSNMUVdjdX_Sxi7Td1pkGvGsL4tQbq_edHjZGKkZx-ZV5s7_s--Ws11Dhr1U-cptKAjCdDL5X-UhUPNuVKDihp3dpT8cXCHkySEk1PN8D6zJ1RreYRKdS1FQymVRjD5LIsee4krsQkcBwe71RolRXcL6FH4PE-dQyras1JUy5OQoJGwokY8Slo5bwaUiNiNaErvxPs3Npn4eWGLb_jx0g5w32fQwwgspKn4wOXcGFnAZ7hTl-iwrcBz8H-u1VEdyvJR5v29lFZwXl9lGwPYZKK-Vnfa1HcG9JDXYpFAHESrgbgfb1mOhHHnbXwZ_TPApKlC5w2Xj-iVzha4rvVUWO3lx441TTyiFt7ktR-kZPPsXk9Oe7hW3QTDRN9Gh-PmIY3goxm1nvuw8MCChly5xZn3F3sKUkKyUYtHgPZvqTUsuX9m5k2kTEK6ru5QGhdevO0FrW5NFqG3M3SSHyH0D5udIEA1HCIh8Mt4ft5Y_Ol68Q3OeAYnvuwt_dPmFk-iTbW5Mos0A7pr8Yt3haZ6k9-GaPEqQAerNx4S7GhqX-LlYW00fBUqZoh0AA5zQpwXdR-ICbZQjLdSjfIdsL4FY26tZGCAK3ldWDJReqBVmODgJbJmITUhoXp24RbJ_FeGXIVS1EDoljGrlOvuB8bOsEBLEwF1y3Ahp1bLbZmh3HV3a-RGjhTNienssLD4rJfDqM7yyieTLq7AwRai4hVV8DqFsXfbF_HMjLjgWYZ4MVmlBY3T7kf_0WpTA");
//        // HttpBasicAuth httpBasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("");
//        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//        //Authorization.setApiKeyPrefix("Token");
//
//        // Configure OAuth2 access token for authorization: OAuth2ClientCredentials
//        OAuth OAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("OAuth2ClientCredentials");
//        OAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");
//
//        // Configure OAuth2 access token for authorization: OAuth2Code
//        OAuth OAuth2Code = (OAuth) defaultClient.getAuthentication("OAuth2Code");
//        OAuth2Code.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2 access token for authorization: OAuth2Password
//        OAuth OAuth2Password = (OAuth) defaultClient.getAuthentication("OAuth2Password");
//        OAuth2Password.setAccessToken("1DR_P_FisGP2ntDd_iqQPfm86-c8eHWd6BjyWp9CpCrsBHZGkuDLs4C7e26sQes1QUObkBmB5sOHd0DXCZzqlA3ThSp82hZs613EOu0XjEBUKGbJx5OYPxnR1abMBM9F88EPH0EjXV9mndM23s5G3WT9vXSqguo10ogyXfL1uQLEl9ugrwXVSgcNvSwk5wbI6glUKAqsXHPQoVFS-Q_SHyySnwXJaLT-xmYxOVWHZXroAerdQNvljIE_9tSr4cWVBDby0_AtZR37TA_1KjA1y3GvtEXgI4tsC-J1FTemgZY1uQUaxn2NowkIJcX77qZqHnYIqnq0HhGjC1N6_owPYN0bSY1fzoDjJ780zgiOC9IHoVMNAG8bd18c26-Fpe4UafENylWlsYCNRQIMifr_8_gdHCVg43kSNMUVdjdX_Sxi7Td1pkGvGsL4tQbq_edHjZGKkZx-ZV5s7_s--Ws11Dhr1U-cptKAjCdDL5X-UhUPNuVKDihp3dpT8cXCHkySEk1PN8D6zJ1RreYRKdS1FQymVRjD5LIsee4krsQkcBwe71RolRXcL6FH4PE-dQyras1JUy5OQoJGwokY8Slo5bwaUiNiNaErvxPs3Npn4eWGLb_jx0g5w32fQwwgspKn4wOXcGFnAZ7hTl-iwrcBz8H-u1VEdyvJR5v29lFZwXl9lGwPYZKK-Vnfa1HcG9JDXYpFAHESrgbgfb1mOhHHnbXwZ_TPApKlC5w2Xj-iVzha4rvVUWO3lx441TTyiFt7ktR-kZPPsXk9Oe7hW3QTDRN9Gh-PmIY3goxm1nvuw8MCChly5xZn3F3sKUkKyUYtHgPZvqTUsuX9m5k2kTEK6ru5QGhdevO0FrW5NFqG3M3SSHyH0D5udIEA1HCIh8Mt4ft5Y_Ol68Q3OeAYnvuwt_dPmFk-iTbW5Mos0A7pr8Yt3haZ6k9-GaPEqQAerNx4S7GhqX-LlYW00fBUqZoh0AA5zQpwXdR-ICbZQjLdSjfIdsL4FY26tZGCAK3ldWDJReqBVmODgJbJmITUhoXp24RbJ_FeGXIVS1EDoljGrlOvuB8bOsEBLEwF1y3Ahp1bLbZmh3HV3a-RGjhTNienssLD4rJfDqM7yyieTLq7AwRai4hVV8DqFsXfbF_HMjLjgWYZ4MVmlBY3T7kf_0WpTA");
//        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
//        queryParams.add("username","userSaS");
//        queryParams.add("password","123456");
//
//        OAuth2Password.applyToParams(queryParams, new HttpHeaders());


        OfferImportExportApi offerImportExportApi = new OfferImportExportApi();
        //OffersImportModel offersImportModel = new OffersImportModel();
//        offersImportModel.setVersion(OffersImportModel.VersionEnum.VERSION20);
//        List<OfferDto> listOfferDto = new ArrayList<>();
//        OfferDto offerDto = new OfferDto();
//        offerDto.setTitle("Title");
//        offerDto.setId("Id");
//        offerDto.setApplyChangesDateValue("Apply Changes Date Value");
//        listOfferDto.add(offerDto);
//        System.out.println(listOfferDto);
//        offersImportModel.setOffers(listOfferDto);
        ResultModelOfOffersImportResponse result = new ResultModelOfOffersImportResponse();
        try {
              result = offerImportExportApi.offerImportExportPostOffers(offersImportModel, true);
            //resultModelOfOffersImportResponse = offerImportExportApi.offerImportExportPostOffersWithHttpInfo(offersImportModel, true);
        System.out.println(result);

            // System.out.println(result);
        } catch (Exception e) {
            System.err.println("Exception when calling AccountApi#accountGetAccountModels");
            e.printStackTrace();
        }
        return result;

//        OkHttpClient client = new OkHttpClient().newBuilder()
//                .build();
//        MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
//        RequestBody body = RequestBody.create();
//        Request request = new Request.Builder()
//                .url("https://sparmv-stg.loymax.tech/systemapi/api/Offers/Import")
//                .method("POST", body)
//                .addHeader("Content-Type", "application/x-www-form-urlencoded")
//                .addHeader("Authorization", "Bearer 1DR_P_FisGP2ntDd_iqQPfm86-c8eHWd6BjyWp9CpCrsBHZGkuDLs4C7e26sQes1QUObkBmB5sOHd0DXCZzqlA3ThSp82hZs613EOu0XjEBUKGbJx5OYPxnR1abMBM9F88EPH0EjXV9mndM23s5G3WT9vXSqguo10ogyXfL1uQLEl9ugrwXVSgcNvSwk5wbI6glUKAqsXHPQoVFS-Q_SHyySnwXJaLT-xmYxOVWHZXroAerdQNvljIE_9tSr4cWVBDby0_AtZR37TA_1KjA1y3GvtEXgI4tsC-J1FTemgZY1uQUaxn2NowkIJcX77qZqHnYIqnq0HhGjC1N6_owPYN0bSY1fzoDjJ780zgiOC9IHoVMNAG8bd18c26-Fpe4UafENylWlsYCNRQIMifr_8_gdHCVg43kSNMUVdjdX_Sxi7Td1pkGvGsL4tQbq_edHjZGKkZx-ZV5s7_s--Ws11Dhr1U-cptKAjCdDL5X-UhUPNuVKDihp3dpT8cXCHkySEk1PN8D6zJ1RreYRKdS1FQymVRjD5LIsee4krsQkcBwe71RolRXcL6FH4PE-dQyras1JUy5OQoJGwokY8Slo5bwaUiNiNaErvxPs3Npn4eWGLb_jx0g5w32fQwwgspKn4wOXcGFnAZ7hTl-iwrcBz8H-u1VEdyvJR5v29lFZwXl9lGwPYZKK-Vnfa1HcG9JDXYpFAHESrgbgfb1mOhHHnbXwZ_TPApKlC5w2Xj-iVzha4rvVUWO3lx441TTyiFt7ktR-kZPPsXk9Oe7hW3QTDRN9Gh-PmIY3goxm1nvuw8MCChly5xZn3F3sKUkKyUYtHgPZvqTUsuX9m5k2kTEK6ru5QGhdevO0FrW5NFqG3M3SSHyH0D5udIEA1HCIh8Mt4ft5Y_Ol68Q3OeAYnvuwt_dPmFk-iTbW5Mos0A7pr8Yt3haZ6k9-GaPEqQAerNx4S7GhqX-LlYW00fBUqZoh0AA5zQpwXdR-ICbZQjLdSjfIdsL4FY26tZGCAK3ldWDJReqBVmODgJbJmITUhoXp24RbJ_FeGXIVS1EDoljGrlOvuB8bOsEBLEwF1y3Ahp1bLbZmh3HV3a-RGjhTNienssLD4rJfDqM7yyieTLq7AwRai4hVV8DqFsXfbF_HMjLjgWYZ4MVmlBY3T7kf_0WpTA")
//                .build();
//        Response response = client.newCall(request).execute();
//        System.out.println(response);
    }
}
