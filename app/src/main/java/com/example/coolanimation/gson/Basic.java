package com.example.coolanimation.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2019/4/18.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    @SerializedName("update")
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
