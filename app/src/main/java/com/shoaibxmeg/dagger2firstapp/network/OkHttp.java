package com.shoaibxmeg.dagger2firstapp.network;

/**
 * Created by shoaibmeghani on 17/06/2017.
 *
 *
 * This is a mock OKHttp class to avoid any addition of library.
 */

public class OkHttp {

    /**
     * Mock method to hit endpoint.
     * */
    public String rawResponse(){
        return "This is raw response.";
    }
}
