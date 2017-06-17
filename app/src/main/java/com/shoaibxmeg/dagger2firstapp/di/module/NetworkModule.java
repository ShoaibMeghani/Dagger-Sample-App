package com.shoaibxmeg.dagger2firstapp.di.module;

import com.shoaibxmeg.dagger2firstapp.network.LocalCache;
import com.shoaibxmeg.dagger2firstapp.network.MyAPI;
import com.shoaibxmeg.dagger2firstapp.network.OkHttp;
import com.shoaibxmeg.dagger2firstapp.network.Retrofit;

import dagger.Module;
import dagger.Provides;

/**
 * Created by shoaibmeghani on 17/06/2017.
 */


@Module
public class NetworkModule {

    @Provides
    OkHttp providesOkHTTP(){
        return  new OkHttp();
    }

    @Provides
    Retrofit providesRetrofit(OkHttp okHttp){
        return new Retrofit(okHttp);
    }

    @Provides
    LocalCache providesLocalCache(){
        return  new LocalCache();
    }

    @Provides
    MyAPI providesMyAPI(Retrofit retrofit,LocalCache localCache){
        return new MyAPI(retrofit,localCache);
    }
}
