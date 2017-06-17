package com.shoaibxmeg.dagger2firstapp.network;

import java.util.ArrayList;

/**
 * Created by shoaibmeghani on 17/06/2017.
 */

public class LocalCache {

    ArrayList<String> localCache;

    public LocalCache() {

        localCache = new ArrayList<>();
    }


    public void addToCache(String response){
        localCache.add(response);
    }

    public String fetchFromCache(){
        return localCache.get(localCache.size() - 1);
    }


}
