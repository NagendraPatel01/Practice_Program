package com.example.apicallingpractice.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class myone {

        @SerializedName("result")
        @Expose
        private String result;
        @SerializedName("msg")
        @Expose
        private String msg;


    public String getResult() {
            return result;
        }

        public void setResult(String result) {
            this.result = result;
        }

        public String getMsg() {
            return msg;
        }

    public void setMsg(String msg) {
            this.msg = msg;


        }

    @Override
    public String toString() {
        return "myone{" +
                "result='" + result + '\'' +
                ", msg='" + msg + '\'' +
                '}';
    }
}
