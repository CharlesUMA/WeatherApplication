package com.example.coolanimation.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2019/4/18.
 */

public class Forecast {
    @SerializedName("date")
    public String date;

    @SerializedName("tmp")
    public Temperature temperature;
    public class Temperature{
        @SerializedName("max")
        public String max;

        @SerializedName("min")
        public String min;
    }

    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
