/*
 * Loymax.SystemApi
 * Loymax version: 2020.1.1.55071
 *
 * OpenAPI spec version: V1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package restclient.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Вью модель настроек соц.сетей.
 */
@ApiModel(description = "Вью модель настроек соц.сетей.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-25T13:30:11.810+03:00")
public class OAuthSettingsViewModelEx {
  /**
   * Провайдер.
   */
  public enum ProviderTypeEnum {
    FACEBOOK("Facebook"),
    
    VKONTAKTE("VKontakte"),
    
    INSTAGRAM("Instagram"),
    
    TWITTER("Twitter"),
    
    GOOGLE("Google"),
    
    MYMAIL("MyMail"),
    
    ODNOKLASSNIKI("Odnoklassniki"),
    
    LOYMAX("Loymax");

    private String value;

    ProviderTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ProviderTypeEnum fromValue(String text) {
      for (ProviderTypeEnum b : ProviderTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("providerType")
  private ProviderTypeEnum providerType = null;

  @JsonProperty("clientId")
  private String clientId = null;

  @JsonProperty("clientSecret")
  private String clientSecret = null;

  @JsonProperty("text")
  private String text = null;

  @JsonProperty("token")
  private String token = null;

  /**
   * Протокол.
   */
  public enum ProtocolEnum {
    OAUTH1("OAuth1"),
    
    OAUTH2("OAuth2");

    private String value;

    ProtocolEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ProtocolEnum fromValue(String text) {
      for (ProtocolEnum b : ProtocolEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("protocol")
  private ProtocolEnum protocol = null;

  @JsonProperty("scope")
  private String scope = null;

  @JsonProperty("authorizeUri")
  private ClientUri authorizeUri = null;

  @JsonProperty("accessTokenUri")
  private ClientUri accessTokenUri = null;

  @JsonProperty("apiSettings")
  private ClientApiSettings apiSettings = null;

  public OAuthSettingsViewModelEx providerType(ProviderTypeEnum providerType) {
    this.providerType = providerType;
    return this;
  }

   /**
   * Провайдер.
   * @return providerType
  **/
  @ApiModelProperty(value = "Провайдер.")
  public ProviderTypeEnum getProviderType() {
    return providerType;
  }

  public void setProviderType(ProviderTypeEnum providerType) {
    this.providerType = providerType;
  }

  public OAuthSettingsViewModelEx clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Идентификатор приложения.
   * @return clientId
  **/
  @ApiModelProperty(value = "Идентификатор приложения.")
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public OAuthSettingsViewModelEx clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

   /**
   * Секрет клиента.
   * @return clientSecret
  **/
  @ApiModelProperty(value = "Секрет клиента.")
  public String getClientSecret() {
    return clientSecret;
  }

  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }

  public OAuthSettingsViewModelEx text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Наименование провайдера.
   * @return text
  **/
  @ApiModelProperty(value = "Наименование провайдера.")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public OAuthSettingsViewModelEx token(String token) {
    this.token = token;
    return this;
  }

   /**
   * Токен.
   * @return token
  **/
  @ApiModelProperty(value = "Токен.")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public OAuthSettingsViewModelEx protocol(ProtocolEnum protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * Протокол.
   * @return protocol
  **/
  @ApiModelProperty(value = "Протокол.")
  public ProtocolEnum getProtocol() {
    return protocol;
  }

  public void setProtocol(ProtocolEnum protocol) {
    this.protocol = protocol;
  }

  public OAuthSettingsViewModelEx scope(String scope) {
    this.scope = scope;
    return this;
  }

   /**
   * Запрашиваемое окружение.
   * @return scope
  **/
  @ApiModelProperty(value = "Запрашиваемое окружение.")
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public OAuthSettingsViewModelEx authorizeUri(ClientUri authorizeUri) {
    this.authorizeUri = authorizeUri;
    return this;
  }

   /**
   * URL авторизации.
   * @return authorizeUri
  **/
  @ApiModelProperty(value = "URL авторизации.")
  public ClientUri getAuthorizeUri() {
    return authorizeUri;
  }

  public void setAuthorizeUri(ClientUri authorizeUri) {
    this.authorizeUri = authorizeUri;
  }

  public OAuthSettingsViewModelEx accessTokenUri(ClientUri accessTokenUri) {
    this.accessTokenUri = accessTokenUri;
    return this;
  }

   /**
   * URL access токена.
   * @return accessTokenUri
  **/
  @ApiModelProperty(value = "URL access токена.")
  public ClientUri getAccessTokenUri() {
    return accessTokenUri;
  }

  public void setAccessTokenUri(ClientUri accessTokenUri) {
    this.accessTokenUri = accessTokenUri;
  }

  public OAuthSettingsViewModelEx apiSettings(ClientApiSettings apiSettings) {
    this.apiSettings = apiSettings;
    return this;
  }

   /**
   * Настройки Api OAuth клиента.
   * @return apiSettings
  **/
  @ApiModelProperty(value = "Настройки Api OAuth клиента.")
  public ClientApiSettings getApiSettings() {
    return apiSettings;
  }

  public void setApiSettings(ClientApiSettings apiSettings) {
    this.apiSettings = apiSettings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OAuthSettingsViewModelEx oauthSettingsViewModelEx = (OAuthSettingsViewModelEx) o;
    return Objects.equals(this.providerType, oauthSettingsViewModelEx.providerType) &&
        Objects.equals(this.clientId, oauthSettingsViewModelEx.clientId) &&
        Objects.equals(this.clientSecret, oauthSettingsViewModelEx.clientSecret) &&
        Objects.equals(this.text, oauthSettingsViewModelEx.text) &&
        Objects.equals(this.token, oauthSettingsViewModelEx.token) &&
        Objects.equals(this.protocol, oauthSettingsViewModelEx.protocol) &&
        Objects.equals(this.scope, oauthSettingsViewModelEx.scope) &&
        Objects.equals(this.authorizeUri, oauthSettingsViewModelEx.authorizeUri) &&
        Objects.equals(this.accessTokenUri, oauthSettingsViewModelEx.accessTokenUri) &&
        Objects.equals(this.apiSettings, oauthSettingsViewModelEx.apiSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(providerType, clientId, clientSecret, text, token, protocol, scope, authorizeUri, accessTokenUri, apiSettings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuthSettingsViewModelEx {\n");
    
    sb.append("    providerType: ").append(toIndentedString(providerType)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    authorizeUri: ").append(toIndentedString(authorizeUri)).append("\n");
    sb.append("    accessTokenUri: ").append(toIndentedString(accessTokenUri)).append("\n");
    sb.append("    apiSettings: ").append(toIndentedString(apiSettings)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

