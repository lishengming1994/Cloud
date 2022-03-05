# VolumeApi

All URIs are relative to *http://xxxx.test/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getVolumeDetail**](VolumeApi.md#getVolumeDetail) | **GET** /volume/{volumeId} | 根据卷id获取卷详情


<a name="getVolumeDetail"></a>
# **getVolumeDetail**
> Volume getVolumeDetail(volumeId)

根据卷id获取卷详情

若已经同步到主站，详情包括同步补充信息

### Example

```java
// Import classes:

import com.example.ApiClient;
import com.example.ApiException;
import com.example.Configuration;
import com.example.models.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://xxxx.test/v1");

        VolumeApi apiInstance = new VolumeApi(defaultClient);
        Long volumeId = 56L; // Long | 卷id
        try {
            Volume result = apiInstance.getVolumeDetail(volumeId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VolumeApi#getVolumeDetail");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **volumeId** | **Long**| 卷id |

### Return type

[**Volume**](Volume.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | 操作成功 |  -  |
**404** | 资源未找到 |  -  |

