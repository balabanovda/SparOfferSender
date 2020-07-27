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
        headerParams.add("Authorization", "Bearer qQ-TKgNu9RMsoHE4nPzS5MIZtBWInDNQLWmWxvishS8rC7vEzvGKT3TvZ_kez4Q4J_T7w5fE_y_34LXSbvCCDgV6XWR02xCefxOb5CCd8YuG77rAHZcr8uH6Y3VWH7SegDcoQCMhUMQqIhWfnnbqEGjX4HFu70YEnAJpKPW1raVJ6HZDwWRN82dJxM9_KmbAMgmn8vYC1EAZB_bc3pLutIcrjD_kCn97w401bj6TY9GFzXHGRy8Bw1VtNhyTKdlsKgMHh9WzhQi2lvABV0TniF7jncLM44QPpsNUz9Fq35-sYY7kufjjbOEroDUjMWJF9OnVBEbw43wb-sRnc3qWdorwdtdK_jjMg05ovAAeXfCE784D2B8FH_cazKD7pa3Qw-5TJ8023kNuwBRhJ8BpmuS12sdy7VvxsHtL9-Wy8KkBBLjDanmo6JyUnHPX8Bw2hFS-l37b5YhLDQvzmTbvBpzbXZcBZa4EblFiWATajNJmIa05JgKIQsLnmP4Cerb1rEA6nzbxMUYW3kpQcJw-avzl1po6Fv0bbsDEZvjJXdhYDtErevW6D4D_eO6VGPiDT1tJiBLPbiSNp1_hv2x7NE_9ITh7Q439dycFTcQ2pQrnPplvYEJu91PEXIstEycr78s2roWhDFnGdhHHyfWtlJc1bdW6zEZ0vKCa_bNyiYFe3okvntEiUcPBTFgbtPhWmZKRxYl-n7LU-_zWJkePk209zZvkEeOYMk_0-uxUM17EPI2d6GSkGtnN2ueB2uKMtS6_PzTe1R3LX7izxkdE68emsFef19lyZYZWdVC8WfW9AopFS5C3euEsIEwgQnCX5Yxl-M6DjTNJigyFhQDs_cBLGeiXC5kHmuusJLF5tmNMBVThjbw3sqjidkyETOwV9tgs5s7Qd1t5vq_eRLCD4QLFXeajMrLSrcfRm3BhFgbTl5DSTwHsPUwVbIatoohn3he38d52g4RCT_hgxiOMonvxGvweDI6lDhE18TUOiztmAiT45AaKM9FxGI-e-_Sr4i6LjiNcUBx68FY27wmyGldwbDtePKz-Qdo7q1bYq1HgrFWhR1dD57Shs5TVb-n1OEn3q6j5R4sWSVfRPAQTfOlMIgrUM7nAcSUa_lQzbxV3TSREzbKZ_neURcdy_hAEcnVtePoiCYtCKG7Bao6EP95bWJUnkuHcg9FiBF0d2MM");

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
