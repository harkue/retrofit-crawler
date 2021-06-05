package com.harkue.crawler.libraries.api;

import com.harkue.crawler.libraries.model.Platform;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;

import java.util.List;

public interface PlatformAPI {
    @GET("platforms?api_key=22b3ece8aec84186469d2e381d8ec2c9")
    Call<List<Platform>> getPlatformList();
}
