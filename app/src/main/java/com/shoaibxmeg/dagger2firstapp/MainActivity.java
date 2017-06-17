package com.shoaibxmeg.dagger2firstapp;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


import com.shoaibxmeg.dagger2firstapp.network.MyAPI;
import com.shoaibxmeg.dagger2firstapp.network.Retrofit;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class MainActivity extends AppCompatActivity {


    @Inject
    SharedPreferences preferences;

    @Inject
    MyAPI myAPI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ((BaseApplication)getApplication()).getMainComponent().inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boolean isUtilInjected =  preferences == null ? false:true;
        boolean isAPIInjected = myAPI == null ? false:true;



        Log.d("MainActivity","Injection status: Util-> " + isUtilInjected + " API-> " + isAPIInjected);


        myAPI.getResponse();



    }

}
