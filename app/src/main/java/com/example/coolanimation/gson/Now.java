package com.example.coolanimation.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2019/4/18.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }

}
