

# Volume

卷对象
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**storageType** | [**StorageTypeEnum**](#StorageTypeEnum) | 存储类型[SSD, SATA, SCSI] |  [optional]
**volumeId** | **Long** | 卷id |  [optional]
**volumeName** | **String** | 卷名称 |  [optional]
**size** | **Long** | 卷大小 |  [optional]
**createTime** | **OffsetDateTime** | 创建时间 |  [optional]



## Enum: StorageTypeEnum

Name | Value
---- | -----
SSD | &quot;SSD&quot;
SATA | &quot;SATA&quot;
SCSI | &quot;SCSI&quot;


## Implemented Interfaces

* Serializable


