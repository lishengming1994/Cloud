# VolumesApi

All URIs are relative to *http://xxxx.test/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createVolume**](VolumesApi.md#createVolume) | **POST** /volume | 创建卷


<a name="createVolume"></a>
# **createVolume**
> CreateVolumeResponseBody createVolume(createVolumeRequestBody)

创建卷

创建卷

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

        VolumesApi apiInstance = new VolumesApi(defaultClient);
        CreateVolumeRequestBody createVolumeRequestBody = new CreateVolumeRequestBody(); // CreateVolumeRequestBody | 
        try {
            CreateVolumeResponseBody result = apiInstance.createVolume(createVolumeRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VolumesApi#createVolume");
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
 **createVolumeRequestBody** | [**CreateVolumeRequestBody**](CreateVolumeRequestBody.md)|  |

### Return type

[**CreateVolumeResponseBody**](CreateVolumeResponseBody.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | 操作成功 |  -  |
**404** | 服务未找到 |  -  |

