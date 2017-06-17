package com.shoaibxmeg.dagger2firstapp;

import android.app.Application;


import com.shoaibxmeg.dagger2firstapp.di.component.DaggerMainComponent;
import com.shoaibxmeg.dagger2firstapp.di.component.MainComponent;

import com.shoaibxmeg.dagger2firstapp.di.module.AppModule;
import com.shoaibxmeg.dagger2firstapp.di.module.NetworkModule;
import com.shoaibxmeg.dagger2firstapp.di.module.UtilModule;

/**
 * Created by shoaibmeghani on 03/06/2017.
 */

public class BaseApplication extends Application{


    private MainComponent mainComponent;

    @Override
    public void onCreate() {
        super.onCreate();


        mainComponent = DaggerMainComponent.builder()
               .appModule(new AppModule(this))
               .utilModule(new UtilModule())
               .networkModule(new NetworkModule())
               .build();



    }




    public MainComponent getMainComponent(){
        return  mainComponent;
    }


}
