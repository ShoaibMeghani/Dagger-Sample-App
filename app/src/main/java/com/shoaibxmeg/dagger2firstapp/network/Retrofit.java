package com.shoaibxmeg.dagger2firstapp.network;


import android.os.Handler;

import java.util.Observable;

/**
 * Created by shoaibmeghani on 17/06/2017.
 *
 * Mock class to make requests.
 */

public class Retrofit {

    protected OkHttp okHttp;


    public Retrofit(OkHttp okHttp) {
        this.okHttp = okHttp;
    }

    /*
    * Mock method to simulate retrofit request
    * **/
    public String completeRequest(){
        return okHttp.rawResponse();

    }
}
