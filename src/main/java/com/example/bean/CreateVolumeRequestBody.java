package com.example.bean;

import java.util.Objects;
import com.example.bean.Volume;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * 创建卷时请求对象
 */
@ApiModel(description = "创建卷时请求对象")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-05T11:25:12.074+08:00[GMT+08:00]")
public class CreateVolumeRequestBody  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("volume")
  private Volume volume;

  public CreateVolumeRequestBody volume(Volume volume) {
    this.volume = volume;
    return this;
  }

  /**
   * Get volume
   * @return volume
  */
  @ApiModelProperty(value = "")

  @Valid

  public Volume getVolume() {
    return volume;
  }

  public void setVolume(Volume volume) {
    this.volume = volume;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateVolumeRequestBody createVolumeRequestBody = (CreateVolumeRequestBody) o;
    return Objects.equals(this.volume, createVolumeRequestBody.volume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(volume);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateVolumeRequestBody {\n");
    
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
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

