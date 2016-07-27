package com.example.jakub.rxtrain;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Jakub on 27.07.2016.
 */
public class ServiceGenerator {

    public static final String BASE_URL = "http://api.randomuser.me/";

    public static final OkHttpClient.Builder clientBuilder = new OkHttpClient.Builder();

    public static Retrofit.Builder builder = new Retrofit.Builder()
            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL);

    public static <S> S createService(Class<S> serviceClass) {
        OkHttpClient client = clientBuilder.build();
        Retrofit retrofit = builder.client(client).build();
        return retrofit.create(serviceClass);

    }
}
