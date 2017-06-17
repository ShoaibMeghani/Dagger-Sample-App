package com.shoaibxmeg.dagger2firstapp.network;

import javax.inject.Inject;

/**
 * Created by shoaibmeghani on 17/06/2017.
 */

public class MyAPI {

    Retrofit retrofit;
    LocalCache localCache;

    public MyAPI(Retrofit retrofit, LocalCache localCache) {
        this.retrofit = retrofit;
        this.localCache = localCache;
    }


    public String getResponse(){
        return retrofit.completeRequest();
    }
}
