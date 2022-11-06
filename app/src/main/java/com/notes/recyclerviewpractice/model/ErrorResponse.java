package com.notes.recyclerviewpractice.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ErrorResponse {

        @SerializedName("statusCode")
        @Expose
        private long statusCode;
        @SerializedName("message")
        @Expose
        private String message;
        @SerializedName("error")
        @Expose
        private String error;

        public long getStatusCode() {
            return statusCode;
        }

        public void setStatusCode(long statusCode) {
            this.statusCode = statusCode;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String getError() {
            return error;
        }

        public void setError(String error) {
            this.error = error;
        }

    }
