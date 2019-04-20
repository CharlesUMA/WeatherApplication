package com.example.coolanimation.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2019/4/18.
 */

public class AQI {
    @SerializedName("city")
    public AQICity city;
    public class AQICity{
        @SerializedName("aqi")
        public String aqi;

        @SerializedName("pm25")
        public String pm25;
    }
}
