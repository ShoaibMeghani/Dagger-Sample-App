package com.shoaibxmeg.dagger2firstapp.di.component;

import android.app.Activity;

import com.shoaibxmeg.dagger2firstapp.MainActivity;
import com.shoaibxmeg.dagger2firstapp.di.module.AppModule;
import com.shoaibxmeg.dagger2firstapp.di.module.NetworkModule;
import com.shoaibxmeg.dagger2firstapp.di.module.UtilModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by shoaibmeghani on 03/06/2017.
 */

@Singleton
@Component(modules = {AppModule.class, UtilModule.class, NetworkModule.class})
public interface MainComponent {
    void inject(MainActivity activity);
    // void inject(MyFragment fragment);
    // void inject(MyService service);
}
