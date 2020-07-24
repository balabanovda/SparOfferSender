package restclient.api;

import restclient.ApiClient;

import restclient.model.CreateOfferModel;
import restclient.model.OffersExportResponse;
import restclient.model.OffersImportModel;

import java.time.OffsetDateTime;

import restclient.model.ResultModelOfInt32;
import restclient.model.ResultModelOfOffersImportResponse;

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
@Component("restclient.api.OfferImportExportApi")
public class OfferImportExportApi {
    private ApiClient apiClient;

    public OfferImportExportApi() {
        this(new ApiClient());
    }

    @Autowired
    public OfferImportExportApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Копировать акцию по Id.
     *
     * <p><b>200</b> - OK
     *
     * @param offerId          Id акции. (required)
     * @param createOfferModel Модель для создания акции. (required)
     * @return ResultModelOfInt32
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfInt32 offerImportExportCopyOffer(Integer offerId, CreateOfferModel createOfferModel) throws RestClientException {
        return offerImportExportCopyOfferWithHttpInfo(offerId, createOfferModel).getBody();
    }

    /**
     * Копировать акцию по Id.
     *
     * <p><b>200</b> - OK
     *
     * @param offerId          Id акции. (required)
     * @param createOfferModel Модель для создания акции. (required)
     * @return ResponseEntity&lt;ResultModelOfInt32&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfInt32> offerImportExportCopyOfferWithHttpInfo(Integer offerId, CreateOfferModel createOfferModel) throws RestClientException {
        Object postBody = createOfferModel;

        // verify the required parameter 'offerId' is set
        if (offerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'offerId' when calling offerImportExportCopyOffer");
        }

        // verify the required parameter 'createOfferModel' is set
        if (createOfferModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createOfferModel' when calling offerImportExportCopyOffer");
        }

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("offerId", offerId);
        String path = UriComponentsBuilder.fromPath("/api/Offers/{offerId}/Copy").buildAndExpand(uriVariables).toUriString();

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

        String[] authNames = new String[]{"Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password"};

        ParameterizedTypeReference<ResultModelOfInt32> returnType = new ParameterizedTypeReference<ResultModelOfInt32>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Экспортировать акцию по Id.
     *
     * <p><b>200</b> - OK
     *
     * @param offerId Id акции. (required)
     * @return OffersExportResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public OffersExportResponse offerImportExportExportOffer(Integer offerId) throws RestClientException {
        return offerImportExportExportOfferWithHttpInfo(offerId).getBody();
    }

    /**
     * Экспортировать акцию по Id.
     *
     * <p><b>200</b> - OK
     *
     * @param offerId Id акции. (required)
     * @return ResponseEntity&lt;OffersExportResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<OffersExportResponse> offerImportExportExportOfferWithHttpInfo(Integer offerId) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'offerId' is set
        if (offerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'offerId' when calling offerImportExportExportOffer");
        }

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("offerId", offerId);
        String path = UriComponentsBuilder.fromPath("/api/Offers/{offerId}/Export").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {
                "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {};
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password"};

        ParameterizedTypeReference<OffersExportResponse> returnType = new ParameterizedTypeReference<OffersExportResponse>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Экспортировать все акции.
     *
     * <p><b>200</b> - OK
     *
     * @param fromDate                   Дата С. (optional)
     * @param toDate                     Дата По. (optional)
     * @param from                       С какого элемента брать. (optional)
     * @param count                      Сколько элементов брать. (optional)
     * @param name                       Подстрока для поиска по имени. (optional)
     * @param merchantIds                Список id магазинов для фильтрации. (optional)
     * @param creatorIds                 Список id создателей акций для фильтрации. (optional)
     * @param viewStates                 Список состояний акции для фильтрации. (optional)
     * @param sortColumn                 Колонка для сортировки. (optional)
     * @param direction                  Направление сортировки. (optional)
     * @param states                     Список состояний акции для фильтрации. (optional)
     * @param partnerIds                 Список Id партнеров для фильтрации. (optional)
     * @param categoryIds                Список Id категорий акций. (optional)
     * @param priorityLowerBound         Нижняя граница приоритета. (optional)
     * @param priorityUpperBound         Верхняя граница приоритета. (optional)
     * @param marketingCampaignId        Идентификатор маркетинговой кампании. (optional)
     * @param includeMarketingCampaignId Значение, указывающее, включать или исключать акции с заданной МК. (optional)
     * @param loyaltyProgramIds          Список Id программ лояльности для фильтрации. (optional)
     * @param excludeMarketingCampaign   Исключает все акции для которых установлена компания. (optional)
     * @return OffersExportResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public OffersExportResponse offerImportExportGetOffers(OffsetDateTime fromDate, OffsetDateTime toDate, Integer from, Integer count, String name, String merchantIds, String creatorIds, List<String> viewStates, String sortColumn, Boolean direction, List<String> states, String partnerIds, String categoryIds, Integer priorityLowerBound, Integer priorityUpperBound, Integer marketingCampaignId, Boolean includeMarketingCampaignId, String loyaltyProgramIds, Boolean excludeMarketingCampaign) throws RestClientException {
        return offerImportExportGetOffersWithHttpInfo(fromDate, toDate, from, count, name, merchantIds, creatorIds, viewStates, sortColumn, direction, states, partnerIds, categoryIds, priorityLowerBound, priorityUpperBound, marketingCampaignId, includeMarketingCampaignId, loyaltyProgramIds, excludeMarketingCampaign).getBody();
    }

    /**
     * Экспортировать все акции.
     *
     * <p><b>200</b> - OK
     *
     * @param fromDate                   Дата С. (optional)
     * @param toDate                     Дата По. (optional)
     * @param from                       С какого элемента брать. (optional)
     * @param count                      Сколько элементов брать. (optional)
     * @param name                       Подстрока для поиска по имени. (optional)
     * @param merchantIds                Список id магазинов для фильтрации. (optional)
     * @param creatorIds                 Список id создателей акций для фильтрации. (optional)
     * @param viewStates                 Список состояний акции для фильтрации. (optional)
     * @param sortColumn                 Колонка для сортировки. (optional)
     * @param direction                  Направление сортировки. (optional)
     * @param states                     Список состояний акции для фильтрации. (optional)
     * @param partnerIds                 Список Id партнеров для фильтрации. (optional)
     * @param categoryIds                Список Id категорий акций. (optional)
     * @param priorityLowerBound         Нижняя граница приоритета. (optional)
     * @param priorityUpperBound         Верхняя граница приоритета. (optional)
     * @param marketingCampaignId        Идентификатор маркетинговой кампании. (optional)
     * @param includeMarketingCampaignId Значение, указывающее, включать или исключать акции с заданной МК. (optional)
     * @param loyaltyProgramIds          Список Id программ лояльности для фильтрации. (optional)
     * @param excludeMarketingCampaign   Исключает все акции для которых установлена компания. (optional)
     * @return ResponseEntity&lt;OffersExportResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<OffersExportResponse> offerImportExportGetOffersWithHttpInfo(OffsetDateTime fromDate, OffsetDateTime toDate, Integer from, Integer count, String name, String merchantIds, String creatorIds, List<String> viewStates, String sortColumn, Boolean direction, List<String> states, String partnerIds, String categoryIds, Integer priorityLowerBound, Integer priorityUpperBound, Integer marketingCampaignId, Boolean includeMarketingCampaignId, String loyaltyProgramIds, Boolean excludeMarketingCampaign) throws RestClientException {
        Object postBody = null;

        String path = UriComponentsBuilder.fromPath("/api/Offers/Export").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "fromDate", fromDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "toDate", toDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "count", count));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "merchantIds", merchantIds));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "creatorIds", creatorIds));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "viewStates", viewStates));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sortColumn", sortColumn));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "direction", direction));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "states", states));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "partnerIds", partnerIds));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "categoryIds", categoryIds));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "priority.lowerBound", priorityLowerBound));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "priority.upperBound", priorityUpperBound));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "marketingCampaignId", marketingCampaignId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "includeMarketingCampaignId", includeMarketingCampaignId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "loyaltyProgramIds", loyaltyProgramIds));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "excludeMarketingCampaign", excludeMarketingCampaign));

        final String[] accepts = {
                "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {};
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[]{"Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password"};

        ParameterizedTypeReference<OffersExportResponse> returnType = new ParameterizedTypeReference<OffersExportResponse>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }

    /**
     * Импортировать акции.
     *
     * <p><b>200</b> - OK
     *
     * @param importModel  Модель импортируемых акций. (required)
     * @param cancelDrafts Отклонять ли черновики при импорте существующих акций. (optional, default to false)
     * @return ResultModelOfOffersImportResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResultModelOfOffersImportResponse offerImportExportPostOffers(OffersImportModel importModel, Boolean cancelDrafts) throws RestClientException {
        return offerImportExportPostOffersWithHttpInfo(importModel, cancelDrafts).getBody();
    }

    /**
     * Импортировать акции.
     *
     * <p><b>200</b> - OK
     *
     * @param importModel  Модель импортируемых акций. (required)
     * @param cancelDrafts Отклонять ли черновики при импорте существующих акций. (optional, default to false)
     * @return ResponseEntity&lt;ResultModelOfOffersImportResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResultModelOfOffersImportResponse> offerImportExportPostOffersWithHttpInfo(OffersImportModel importModel, Boolean cancelDrafts) throws RestClientException {
        Object postBody = importModel;

        // verify the required parameter 'importModel' is set
        if (importModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'importModel' when calling offerImportExportPostOffers");
        }

        String path = UriComponentsBuilder.fromPath("/api/Offers/Import").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
//        List<Object> list = new ArrayList();
//        list.add("userSaS");
//        List<Object> list2 = new ArrayList();
//        list2.add("123456");
//        List<Object> list3 = new ArrayList();
//        list3.add("password");
//        formParams.add("username","userSaS");
//        formParams.add("password", "123456");
//        formParams.add("grant_type", "password");
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cancelDrafts", cancelDrafts));
       // headerParams.add("Content-Type", "application/x-www-form-urlencoded");
        headerParams.add("Authorization", "Bearer 1DR_P_FisGP2ntDd_iqQPfm86-c8eHWd6BjyWp9CpCrsBHZGkuDLs4C7e26sQes1QUObkBmB5sOHd0DXCZzqlA3ThSp82hZs613EOu0XjEBUKGbJx5OYPxnR1abMBM9F88EPH0EjXV9mndM23s5G3WT9vXSqguo10ogyXfL1uQLEl9ugrwXVSgcNvSwk5wbI6glUKAqsXHPQoVFS-Q_SHyySnwXJaLT-xmYxOVWHZXroAerdQNvljIE_9tSr4cWVBDby0_AtZR37TA_1KjA1y3GvtEXgI4tsC-J1FTemgZY1uQUaxn2NowkIJcX77qZqHnYIqnq0HhGjC1N6_owPYN0bSY1fzoDjJ780zgiOC9IHoVMNAG8bd18c26-Fpe4UafENylWlsYCNRQIMifr_8_gdHCVg43kSNMUVdjdX_Sxi7Td1pkGvGsL4tQbq_edHjZGKkZx-ZV5s7_s--Ws11Dhr1U-cptKAjCdDL5X-UhUPNuVKDihp3dpT8cXCHkySEk1PN8D6zJ1RreYRKdS1FQymVRjD5LIsee4krsQkcBwe71RolRXcL6FH4PE-dQyras1JUy5OQoJGwokY8Slo5bwaUiNiNaErvxPs3Npn4eWGLb_jx0g5w32fQwwgspKn4wOXcGFnAZ7hTl-iwrcBz8H-u1VEdyvJR5v29lFZwXl9lGwPYZKK-Vnfa1HcG9JDXYpFAHESrgbgfb1mOhHHnbXwZ_TPApKlC5w2Xj-iVzha4rvVUWO3lx441TTyiFt7ktR-kZPPsXk9Oe7hW3QTDRN9Gh-PmIY3goxm1nvuw8MCChly5xZn3F3sKUkKyUYtHgPZvqTUsuX9m5k2kTEK6ru5QGhdevO0FrW5NFqG3M3SSHyH0D5udIEA1HCIh8Mt4ft5Y_Ol68Q3OeAYnvuwt_dPmFk-iTbW5Mos0A7pr8Yt3haZ6k9-GaPEqQAerNx4S7GhqX-LlYW00fBUqZoh0AA5zQpwXdR-ICbZQjLdSjfIdsL4FY26tZGCAK3ldWDJReqBVmODgJbJmITUhoXp24RbJ_FeGXIVS1EDoljGrlOvuB8bOsEBLEwF1y3Ahp1bLbZmh3HV3a-RGjhTNienssLD4rJfDqM7yyieTLq7AwRai4hVV8DqFsXfbF_HMjLjgWYZ4MVmlBY3T7kf_0WpTA");

        final String[] accepts = {
                "*/*"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {
            "application/x-www-form-urlencoded", "application/json", "text/json", "application/xml", "text/xml"
        };
        final MediaType contentType = MediaType.APPLICATION_JSON;
        System.out.println(contentType + "330 строка OfferImportExportApi");
        String[] authNames = new String[]{"Authorization", "OAuth2ClientCredentials", "OAuth2Code", "OAuth2Password"};

        ParameterizedTypeReference<ResultModelOfOffersImportResponse> returnType = new ParameterizedTypeReference<ResultModelOfOffersImportResponse>() {
        };
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
