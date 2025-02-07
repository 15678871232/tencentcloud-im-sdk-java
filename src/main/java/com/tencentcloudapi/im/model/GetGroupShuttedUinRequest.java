
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
 * GetGroupShuttedUinRequest
 */
@JsonPropertyOrder({
  GetGroupShuttedUinRequest.JSON_PROPERTY_GROUP_ID
})

public class GetGroupShuttedUinRequest {
  public static final String JSON_PROPERTY_GROUP_ID = "GroupId";
  private String groupId;

  public GetGroupShuttedUinRequest() { 
  }

  public GetGroupShuttedUinRequest groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * 需要获取被禁言成员列表的群组 ID。
   * @return groupId
  **/
  @javax.annotation.Nonnull
  @NotNull
  @ApiModelProperty(required = true, value = "需要获取被禁言成员列表的群组 ID。")
  @JsonProperty(JSON_PROPERTY_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getGroupId() {
    return groupId;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetGroupShuttedUinRequest getGroupShuttedUinRequest = (GetGroupShuttedUinRequest) o;
    return Objects.equals(this.groupId, getGroupShuttedUinRequest.groupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGroupShuttedUinRequest {\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
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

