package com.notes.recyclerviewpractice.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginRespons {

    private String token;
    private AuthUserData data;
    private AuthUser user;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public AuthUserData getData() {
        return data;
    }

    public void setData(AuthUserData data) {
        this.data = data;
    }

    public AuthUser getUser() {
        return user;
    }

    public void setUser(AuthUser user) {
        this.user = user;
    }

    public class AuthUser {

        @SerializedName("transactionId")
        @Expose
        private Object transactionId;
        @SerializedName("isSubscription")
        @Expose
        private Boolean isSubscription;
        @SerializedName("isPhoneVerified")
        @Expose
        private Boolean isPhoneVerified;
        @SerializedName("subscriptionDevice")
        @Expose
        private Object subscriptionDevice;
        @SerializedName("isNeedToShowWelcomePopup")
        @Expose
        private Boolean isNeedToShowWelcomePopup;
        @SerializedName("isEmailVerified")
        @Expose
        private Boolean isEmailVerified;
        @SerializedName("email")
        @Expose
        private String email;
        @SerializedName("userId")
        @Expose
        private Integer userId;
        @SerializedName("_id")
        @Expose
        private String id;
        @SerializedName("accountType")
        @Expose
        private String accountType;
        @SerializedName("platform")
        @Expose
        private String platform;

        @SerializedName("auth0Id")
        @Expose
        private String auth0Id;
        @SerializedName("isNewAccount")
        @Expose
        private Boolean isNewAccount;

        public Object getTransactionId() {
            return transactionId;
        }

        public void setTransactionId(Object transactionId) {
            this.transactionId = transactionId;
        }

        public Boolean getIsSubscription() {
            return isSubscription;
        }

        public void setIsSubscription(Boolean isSubscription) {
            this.isSubscription = isSubscription;
        }

        public Boolean getIsPhoneVerified() {
            return isPhoneVerified;
        }

        public void setIsPhoneVerified(Boolean isPhoneVerified) {
            this.isPhoneVerified = isPhoneVerified;
        }

        public Object getSubscriptionDevice() {
            return subscriptionDevice;
        }

        public void setSubscriptionDevice(Object subscriptionDevice) {
            this.subscriptionDevice = subscriptionDevice;
        }

        public Boolean getIsNeedToShowWelcomePopup() {
            return isNeedToShowWelcomePopup;
        }

        public void setIsNeedToShowWelcomePopup(Boolean isNeedToShowWelcomePopup) {
            this.isNeedToShowWelcomePopup = isNeedToShowWelcomePopup;
        }

        public Boolean getIsEmailVerified() {
            return isEmailVerified;
        }

        public void setIsEmailVerified(Boolean isEmailVerified) {
            this.isEmailVerified = isEmailVerified;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public Integer getUserId() {
            return userId;
        }

        public void setUserId(Integer userId) {
            this.userId = userId;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getAccountType() {
            return accountType;
        }

        public void setAccountType(String accountType) {
            this.accountType = accountType;
        }

        public String getPlatform() {
            return platform;
        }

        public void setPlatform(String platform) {
            this.platform = platform;
        }

        public String getAuth0Id() {
            return auth0Id;
        }

        public void setAuth0Id(String auth0Id) {
            this.auth0Id = auth0Id;
        }

        public Boolean getIsNewAccount() {
            return isNewAccount;
        }

        public void setIsNewAccount(Boolean isNewAccount) {
            this.isNewAccount = isNewAccount;
        }

    }

    public class AuthUserData {

        @SerializedName("lastName")
        @Expose
        private String lastName;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("user_id")
        @Expose
        private String userId;
        @SerializedName("profileCompletionLevel")
        @Expose
        private Integer profileCompletionLevel;
        @SerializedName("id")
        @Expose
        private String id;

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public Integer getProfileCompletionLevel() {
            return profileCompletionLevel;
        }

        public void setProfileCompletionLevel(Integer profileCompletionLevel) {
            this.profileCompletionLevel = profileCompletionLevel;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

    }


    @SerializedName("emailExists")
    @Expose
    private Boolean emailExists;
    @SerializedName("platform")
    @Expose
    private Platform platform;

    public Boolean getEmailExists() {
        return emailExists;
    }

    public void setEmailExists(Boolean emailExists) {
        this.emailExists = emailExists;
    }

    public Platform getPlatform() {
        return platform;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    public class Platform {

    }

}


