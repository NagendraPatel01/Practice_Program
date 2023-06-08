package com.example.apicallingpractice.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetmyDisributer {

    @SerializedName("result")
    @Expose
    private String result;
    @SerializedName("msg")
    @Expose
    private String msg;
    @SerializedName("data")
    @Expose
    private List<Datum> data = null;

    @Override
    public String toString() {
        return "GetmyDisributer{" +
                "result='" + result + '\'' +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }

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

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    public class Datum {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("destributor_name")
        @Expose
        private String destributorName;
        @SerializedName("emailid")
        @Expose
        private String emailid;
        @SerializedName("mobileno")
        @Expose
        private String mobileno;
        @SerializedName("gst_no")
        @Expose
        private String gstNo;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getDestributorName() {
            return destributorName;
        }

        public void setDestributorName(String destributorName) {
            this.destributorName = destributorName;
        }

        public String getEmailid() {
            return emailid;
        }

        public void setEmailid(String emailid) {
            this.emailid = emailid;
        }

        public String getMobileno() {
            return mobileno;
        }

        public void setMobileno(String mobileno) {
            this.mobileno = mobileno;
        }

        public String getGstNo() {
            return gstNo;
        }

        public void setGstNo(String gstNo) {
            this.gstNo = gstNo;
        }


        @Override
        public String toString() {
            return "Datum{" +
                    "id='" + id + '\'' +
                    ", destributorName='" + destributorName + '\'' +
                    ", emailid='" + emailid + '\'' +
                    ", mobileno='" + mobileno + '\'' +
                    ", gstNo='" + gstNo + '\'' +
                    '}';
        }
    }



}
