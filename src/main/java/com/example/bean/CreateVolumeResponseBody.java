package com.example.bean;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * 创建卷时返回对象
 */
@ApiModel(description = "创建卷时返回对象")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-05T11:25:12.074+08:00[GMT+08:00]")
public class CreateVolumeResponseBody  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("volume_id")
  private Long volumeId;

  public CreateVolumeResponseBody volumeId(Long volumeId) {
    this.volumeId = volumeId;
    return this;
  }

  /**
   * 卷id
   * @return volumeId
  */
  @ApiModelProperty(value = "卷id")


  public Long getVolumeId() {
    return volumeId;
  }

  public void setVolumeId(Long volumeId) {
    this.volumeId = volumeId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateVolumeResponseBody createVolumeResponseBody = (CreateVolumeResponseBody) o;
    return Objects.equals(this.volumeId, createVolumeResponseBody.volumeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(volumeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateVolumeResponseBody {\n");
    
    sb.append("    volumeId: ").append(toIndentedString(volumeId)).append("\n");
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

