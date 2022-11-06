package com.notes.recyclerviewpractice.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetModel {

    @SerializedName("user")
    @Expose
    private User user;
    @SerializedName("data")
    @Expose
    private Data data;
    @SerializedName("token")
    @Expose
    private String token;

    @Override
    public String toString() {
        return "GetModel{" +
                "user=" + user +
                ", data=" + data +
                ", token='" + token + '\'' +
                '}';
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }


    public class Data {

        @SerializedName("emailExists")
        @Expose
        private boolean emailExists;
        @SerializedName("platform")
        @Expose
        private Platform platform;

        @Override
        public String toString() {
            return "Data{" +
                    "emailExists=" + emailExists +
                    ", platform=" + platform +
                    '}';
        }

        public boolean isEmailExists() {
            return emailExists;
        }

        public void setEmailExists(boolean emailExists) {
            this.emailExists = emailExists;
        }

        public Platform getPlatform() {
            return platform;
        }

        public void setPlatform(Platform platform) {
            this.platform = platform;
        }

    }

    public class Platform {

        @SerializedName("mode")
        @Expose
        private String mode;
        @SerializedName("latestUpdateDate")
        @Expose
        private String latestUpdateDate;
        @SerializedName("_id")
        @Expose
        private String id;
        @SerializedName("platform")
        @Expose
        private String platform;
        @SerializedName("instabug")
        @Expose
        private String instabug;
        @SerializedName("version")
        @Expose
        private String version;
        @SerializedName("webLink")
        @Expose
        private String webLink;

        @Override
        public String toString() {
            return "Platform{" +
                    "mode='" + mode + '\'' +
                    ", latestUpdateDate='" + latestUpdateDate + '\'' +
                    ", id='" + id + '\'' +
                    ", platform='" + platform + '\'' +
                    ", instabug='" + instabug + '\'' +
                    ", version='" + version + '\'' +
                    ", webLink='" + webLink + '\'' +
                    '}';
        }

        public String getMode() {
            return mode;
        }

        public void setMode(String mode) {
            this.mode = mode;
        }

        public String getLatestUpdateDate() {
            return latestUpdateDate;
        }

        public void setLatestUpdateDate(String latestUpdateDate) {
            this.latestUpdateDate = latestUpdateDate;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getPlatform() {
            return platform;
        }

        public void setPlatform(String platform) {
            this.platform = platform;
        }

        public String getInstabug() {
            return instabug;
        }

        public void setInstabug(String instabug) {
            this.instabug = instabug;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public String getWebLink() {
            return webLink;
        }

        public void setWebLink(String webLink) {
            this.webLink = webLink;
        }

    }

    public class Profile {

        @SerializedName("isPhoneVerified")
        @Expose
        private boolean isPhoneVerified;
        @SerializedName("isEmailVerified")
        @Expose
        private boolean isEmailVerified;
        @SerializedName("email")
        @Expose
        private String email;
        @SerializedName("lastName")
        @Expose
        private String lastName;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("user_id")
        @Expose
        private String userId;
        @SerializedName("createdAt")
        @Expose
        private String createdAt;
        @SerializedName("updatedAt")
        @Expose
        private String updatedAt;
        @SerializedName("profileId")
        @Expose
        private long profileId;
        @SerializedName("__v")
        @Expose
        private long v;
        @SerializedName("profileCompletionLevel")
        @Expose
        private long profileCompletionLevel;
        @SerializedName("id")
        @Expose
        private String id;

        @Override
        public String toString() {
            return "Profile{" +
                    "isPhoneVerified=" + isPhoneVerified +
                    ", isEmailVerified=" + isEmailVerified +
                    ", email='" + email + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", name='" + name + '\'' +
                    ", userId='" + userId + '\'' +
                    ", createdAt='" + createdAt + '\'' +
                    ", updatedAt='" + updatedAt + '\'' +
                    ", profileId=" + profileId +
                    ", v=" + v +
                    ", profileCompletionLevel=" + profileCompletionLevel +
                    ", id='" + id + '\'' +
                    '}';
        }

        public boolean isIsPhoneVerified() {
            return isPhoneVerified;
        }

        public void setIsPhoneVerified(boolean isPhoneVerified) {
            this.isPhoneVerified = isPhoneVerified;
        }

        public boolean isIsEmailVerified() {
            return isEmailVerified;
        }

        public void setIsEmailVerified(boolean isEmailVerified) {
            this.isEmailVerified = isEmailVerified;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

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

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
        }

        public long getProfileId() {
            return profileId;
        }

        public void setProfileId(long profileId) {
            this.profileId = profileId;
        }

        public long getV() {
            return v;
        }

        public void setV(long v) {
            this.v = v;
        }

        public long getProfileCompletionLevel() {
            return profileCompletionLevel;
        }

        public void setProfileCompletionLevel(long profileCompletionLevel) {
            this.profileCompletionLevel = profileCompletionLevel;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

    }

    public class User {

        @SerializedName("profile")
        @Expose
        private Profile profile;
        @SerializedName("transactionId")
        @Expose
        private Object transactionId;
        @SerializedName("isSubscription")
        @Expose
        private boolean isSubscription;
        @SerializedName("isPhoneVerified")
        @Expose
        private boolean isPhoneVerified;
        @SerializedName("subscriptionDevice")
        @Expose
        private Object subscriptionDevice;
        @SerializedName("isNeedToShowWelcomePopup")
        @Expose
        private boolean isNeedToShowWelcomePopup;
        @SerializedName("isEmailVerified")
        @Expose
        private boolean isEmailVerified;
        @SerializedName("email")
        @Expose
        private String email;
        @SerializedName("userId")
        @Expose
        private long userId;
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
        private boolean isNewAccount;

        @Override
        public String toString() {
            return "User{" +
                    "profile=" + profile +
                    ", transactionId=" + transactionId +
                    ", isSubscription=" + isSubscription +
                    ", isPhoneVerified=" + isPhoneVerified +
                    ", subscriptionDevice=" + subscriptionDevice +
                    ", isNeedToShowWelcomePopup=" + isNeedToShowWelcomePopup +
                    ", isEmailVerified=" + isEmailVerified +
                    ", email='" + email + '\'' +
                    ", userId=" + userId +
                    ", id='" + id + '\'' +
                    ", accountType='" + accountType + '\'' +
                    ", platform='" + platform + '\'' +
                    ", auth0Id='" + auth0Id + '\'' +
                    ", isNewAccount=" + isNewAccount +
                    '}';
        }

        public Profile getProfile() {
            return profile;
        }

        public void setProfile(Profile profile) {
            this.profile = profile;
        }

        public Object getTransactionId() {
            return transactionId;
        }

        public void setTransactionId(Object transactionId) {
            this.transactionId = transactionId;
        }

        public boolean isIsSubscription() {
            return isSubscription;
        }

        public void setIsSubscription(boolean isSubscription) {
            this.isSubscription = isSubscription;
        }

        public boolean isIsPhoneVerified() {
            return isPhoneVerified;
        }

        public void setIsPhoneVerified(boolean isPhoneVerified) {
            this.isPhoneVerified = isPhoneVerified;
        }

        public Object getSubscriptionDevice() {
            return subscriptionDevice;
        }

        public void setSubscriptionDevice(Object subscriptionDevice) {
            this.subscriptionDevice = subscriptionDevice;
        }

        public boolean isIsNeedToShowWelcomePopup() {
            return isNeedToShowWelcomePopup;
        }

        public void setIsNeedToShowWelcomePopup(boolean isNeedToShowWelcomePopup) {
            this.isNeedToShowWelcomePopup = isNeedToShowWelcomePopup;
        }

        public boolean isIsEmailVerified() {
            return isEmailVerified;
        }

        public void setIsEmailVerified(boolean isEmailVerified) {
            this.isEmailVerified = isEmailVerified;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public long getUserId() {
            return userId;
        }

        public void setUserId(long userId) {
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

        public boolean isIsNewAccount() {
            return isNewAccount;
        }

        public void setIsNewAccount(boolean isNewAccount) {
            this.isNewAccount = isNewAccount;
        }

    }

}