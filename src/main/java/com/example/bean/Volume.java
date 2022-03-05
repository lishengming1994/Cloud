package com.example.bean;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * 卷对象
 */
@ApiModel(description = "卷对象")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-05T11:25:12.074+08:00[GMT+08:00]")
public class Volume  implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * 存储类型[SSD, SATA, SCSI]
   */
  public enum StorageTypeEnum {
    SSD("SSD"),
    
    SATA("SATA"),
    
    SCSI("SCSI");

    private String value;

    StorageTypeEnum(String value) {
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
    public static StorageTypeEnum fromValue(String value) {
      for (StorageTypeEnum b : StorageTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("storage_type")
  private StorageTypeEnum storageType;

  @JsonProperty("volume_id")
  private Long volumeId;

  @JsonProperty("volume_name")
  private String volumeName;

  @JsonProperty("size")
  private Long size;

  @JsonProperty("createTime")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createTime;

  public Volume storageType(StorageTypeEnum storageType) {
    this.storageType = storageType;
    return this;
  }

  /**
   * 存储类型[SSD, SATA, SCSI]
   * @return storageType
  */
  @ApiModelProperty(value = "存储类型[SSD, SATA, SCSI]")


  public StorageTypeEnum getStorageType() {
    return storageType;
  }

  public void setStorageType(StorageTypeEnum storageType) {
    this.storageType = storageType;
  }

  public Volume volumeId(Long volumeId) {
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

  public Volume volumeName(String volumeName) {
    this.volumeName = volumeName;
    return this;
  }

  /**
   * 卷名称
   * @return volumeName
  */
  @ApiModelProperty(value = "卷名称")


  public String getVolumeName() {
    return volumeName;
  }

  public void setVolumeName(String volumeName) {
    this.volumeName = volumeName;
  }

  public Volume size(Long size) {
    this.size = size;
    return this;
  }

  /**
   * 卷大小
   * @return size
  */
  @ApiModelProperty(value = "卷大小")


  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public Volume createTime(OffsetDateTime createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * 创建时间
   * @return createTime
  */
  @ApiModelProperty(value = "创建时间")

  @Valid

  public OffsetDateTime getCreateTime() {
    return createTime;
  }

  public void setCreateTime(OffsetDateTime createTime) {
    this.createTime = createTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Volume volume = (Volume) o;
    return Objects.equals(this.storageType, volume.storageType) &&
        Objects.equals(this.volumeId, volume.volumeId) &&
        Objects.equals(this.volumeName, volume.volumeName) &&
        Objects.equals(this.size, volume.size) &&
        Objects.equals(this.createTime, volume.createTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storageType, volumeId, volumeName, size, createTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Volume {\n");
    
    sb.append("    storageType: ").append(toIndentedString(storageType)).append("\n");
    sb.append("    volumeId: ").append(toIndentedString(volumeId)).append("\n");
    sb.append("    volumeName: ").append(toIndentedString(volumeName)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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

