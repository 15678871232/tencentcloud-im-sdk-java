
package com.tencentcloudapi.im.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * ImGetAttrResponseAllOfUserAttrs
 */
@JsonPropertyOrder({
  ImGetAttrResponseAllOfUserAttrs.JSON_PROPERTY_TO_ACCOUNT,
  ImGetAttrResponseAllOfUserAttrs.JSON_PROPERTY_ATTRS
})
@JsonTypeName("ImGetAttrResponse_allOf_UserAttrs")

public class ImGetAttrResponseAllOfUserAttrs {
  public static final String JSON_PROPERTY_TO_ACCOUNT = "To_Account";
  private String toAccount;

  public static final String JSON_PROPERTY_ATTRS = "Attrs";
  private Object attrs;

  public ImGetAttrResponseAllOfUserAttrs() { 
  }

  public ImGetAttrResponseAllOfUserAttrs toAccount(String toAccount) {
    
    this.toAccount = toAccount;
    return this;
  }

   /**
   * 用户帐号
   * @return toAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "用户帐号")
  @JsonProperty(JSON_PROPERTY_TO_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getToAccount() {
    return toAccount;
  }


  @JsonProperty(JSON_PROPERTY_TO_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToAccount(String toAccount) {
    this.toAccount = toAccount;
  }


  public ImGetAttrResponseAllOfUserAttrs attrs(Object attrs) {
    
    this.attrs = attrs;
    return this;
  }

   /**
   * 属性内容
   * @return attrs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "属性内容")
  @JsonProperty(JSON_PROPERTY_ATTRS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getAttrs() {
    return attrs;
  }


  @JsonProperty(JSON_PROPERTY_ATTRS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAttrs(Object attrs) {
    this.attrs = attrs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImGetAttrResponseAllOfUserAttrs imGetAttrResponseAllOfUserAttrs = (ImGetAttrResponseAllOfUserAttrs) o;
    return Objects.equals(this.toAccount, imGetAttrResponseAllOfUserAttrs.toAccount) &&
        Objects.equals(this.attrs, imGetAttrResponseAllOfUserAttrs.attrs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toAccount, attrs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImGetAttrResponseAllOfUserAttrs {\n");
    sb.append("    toAccount: ").append(toIndentedString(toAccount)).append("\n");
    sb.append("    attrs: ").append(toIndentedString(attrs)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

