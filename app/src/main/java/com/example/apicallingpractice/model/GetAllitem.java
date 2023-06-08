package com.example.apicallingpractice.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetAllitem {

    @SerializedName("result")
    @Expose
    private String result;
    @SerializedName("msg")
    @Expose
    private String msg;
    @SerializedName("data")
    @Expose
    private List<Datum> data = null;

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
        @SerializedName("cat_id")
        @Expose
        private String catId;
        @SerializedName("pack_id")
        @Expose
        private String packId;
        @SerializedName("unit_id")
        @Expose
        private String unitId;
        @SerializedName("gst_id")
        @Expose
        private String gstId;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("weight")
        @Expose
        private String weight;
        @SerializedName("mrp")
        @Expose
        private String mrp;
        @SerializedName("hsn_no")
        @Expose
        private String hsnNo;
        @SerializedName("item_category_name")
        @Expose
        private String itemCategoryName;
        @SerializedName("item_pack_name")
        @Expose
        private String itemPackName;
        @SerializedName("item_unit_name")
        @Expose
        private String itemUnitName;
        @SerializedName("item_gst_percent")
        @Expose
        private String itemGstPercent;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getCatId() {
            return catId;
        }

        public void setCatId(String catId) {
            this.catId = catId;
        }

        public String getPackId() {
            return packId;
        }

        public void setPackId(String packId) {
            this.packId = packId;
        }

        public String getUnitId() {
            return unitId;
        }

        public void setUnitId(String unitId) {
            this.unitId = unitId;
        }

        public String getGstId() {
            return gstId;
        }

        public void setGstId(String gstId) {
            this.gstId = gstId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getWeight() {
            return weight;
        }

        public void setWeight(String weight) {
            this.weight = weight;
        }

        public String getMrp() {
            return mrp;
        }

        public void setMrp(String mrp) {
            this.mrp = mrp;
        }

        public String getHsnNo() {
            return hsnNo;
        }

        public void setHsnNo(String hsnNo) {
            this.hsnNo = hsnNo;
        }

        public String getItemCategoryName() {
            return itemCategoryName;
        }

        public void setItemCategoryName(String itemCategoryName) {
            this.itemCategoryName = itemCategoryName;
        }

        public String getItemPackName() {
            return itemPackName;
        }

        public void setItemPackName(String itemPackName) {
            this.itemPackName = itemPackName;
        }

        public String getItemUnitName() {
            return itemUnitName;
        }

        public void setItemUnitName(String itemUnitName) {
            this.itemUnitName = itemUnitName;
        }

        public String getItemGstPercent() {
            return itemGstPercent;
        }

        public void setItemGstPercent(String itemGstPercent) {
            this.itemGstPercent = itemGstPercent;
        }

    }

}
