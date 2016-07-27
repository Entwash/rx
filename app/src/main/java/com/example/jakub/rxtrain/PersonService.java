package com.example.jakub.rxtrain;

import rx.Observable;

import retrofit2.http.GET;

/**
 * Created by Jakub on 27.07.2016.
 */
public interface PersonService {

    @GET("?seed=foobar")
    Observable<Person> getPerson();

}
