package com.harkue.crawler.libraries.servise;

import com.harkue.crawler.libraries.api.PlatformAPI;
import com.harkue.crawler.libraries.model.Platform;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.util.List;

public class PlatformService {
    public void start() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl("https://libraries.io/api/")
                .addConverterFactory(JacksonConverterFactory.create()).build();
        PlatformAPI api = retrofit.create(PlatformAPI.class);
        Call<List<Platform>> call = api.getPlatformList();
        call.enqueue(new Callback<List<Platform>>(){

            public void onResponse(Call<List<Platform>> call, Response<List<Platform>> response) {
                System.out.println(response.body());
                for(Platform platform: response.body()){
                    System.out.println(platform.getName());
                }
            }

            public void onFailure(Call<List<Platform>> call, Throwable throwable) {
                throwable.printStackTrace();
            }
        });
    }
}
