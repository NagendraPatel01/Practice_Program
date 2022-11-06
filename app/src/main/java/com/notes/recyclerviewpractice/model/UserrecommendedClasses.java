package com.notes.recyclerviewpractice.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class UserrecommendedClasses {

        @SerializedName("message")
        @Expose
        private String message;
        @SerializedName("data")
        @Expose
        private Data data;

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public Data getData() {
            return data;
        }

        public void setData(Data data) {
            this.data = data;
        }




    public class ClassDetail {

        @SerializedName("_id")
        @Expose
        private String id;
        @SerializedName("categoryIds")
        @Expose
        private List<Long> categoryIds = null;
        @SerializedName("equipmentIds")
        @Expose
        private List<Long> equipmentIds = null;
        @SerializedName("duration")
        @Expose
        private long duration;
        @SerializedName("userId")
        @Expose
        private long userId;
        @SerializedName("description")
        @Expose
        private String description;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("goalId")
        @Expose
        private long goalId;
        @SerializedName("timeSlotId")
        @Expose
        private long timeSlotId;
        @SerializedName("intensityId")
        @Expose
        private long intensityId;
        @SerializedName("nutritionId")
        @Expose
        private long nutritionId;
        @SerializedName("fileUrl") //link
        @Expose
        private FileUrl__1 fileUrl;
        @SerializedName("createdAt")
        @Expose
        private String createdAt;
        @SerializedName("updatedAt")
        @Expose
        private String updatedAt;
        @SerializedName("classId")
        @Expose
        private long classId;
        @SerializedName("__v")
        @Expose
        private long v;
        @SerializedName("intensityName")
        @Expose
        private String intensityName;
        @SerializedName("timeSlotName")
        @Expose
        private String timeSlotName;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public List<Long> getCategoryIds() {
            return categoryIds;
        }

        public void setCategoryIds(List<Long> categoryIds) {
            this.categoryIds = categoryIds;
        }

        public List<Long> getEquipmentIds() {
            return equipmentIds;
        }

        public void setEquipmentIds(List<Long> equipmentIds) {
            this.equipmentIds = equipmentIds;
        }

        public long getDuration() {
            return duration;
        }

        public void setDuration(long duration) {
            this.duration = duration;
        }

        public long getUserId() {
            return userId;
        }

        public void setUserId(long userId) {
            this.userId = userId;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public long getGoalId() {
            return goalId;
        }

        public void setGoalId(long goalId) {
            this.goalId = goalId;
        }

        public long getTimeSlotId() {
            return timeSlotId;
        }

        public void setTimeSlotId(long timeSlotId) {
            this.timeSlotId = timeSlotId;
        }

        public long getIntensityId() {
            return intensityId;
        }

        public void setIntensityId(long intensityId) {
            this.intensityId = intensityId;
        }

        public long getNutritionId() {
            return nutritionId;
        }

        public void setNutritionId(long nutritionId) {
            this.nutritionId = nutritionId;
        }

        public FileUrl__1 getFileUrl() {
            return fileUrl;
        }

        public void setFileUrl(FileUrl__1 fileUrl) {
            this.fileUrl = fileUrl;
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

        public long getClassId() {
            return classId;
        }

        public void setClassId(long classId) {
            this.classId = classId;
        }

        public long getV() {
            return v;
        }

        public void setV(long v) {
            this.v = v;
        }

        public String getIntensityName() {
            return intensityName;
        }

        public void setIntensityName(String intensityName) {
            this.intensityName = intensityName;
        }

        public String getTimeSlotName() {
            return timeSlotName;
        }

        public void setTimeSlotName(String timeSlotName) {
            this.timeSlotName = timeSlotName;
        }

    }

    public class Data {

        @SerializedName("recommendedClasses")
        @Expose
        private List<RecommendedClass> recommendedClasses = null;
        @SerializedName("goalDetails")
        @Expose
        private List<GoalDetail> goalDetails = null;

        public List<RecommendedClass> getRecommendedClasses() {
            return recommendedClasses;
        }

        public void setRecommendedClasses(List<RecommendedClass> recommendedClasses) {
            this.recommendedClasses = recommendedClasses;
        }

        public List<GoalDetail> getGoalDetails() {
            return goalDetails;
        }

        public void setGoalDetails(List<GoalDetail> goalDetails) {
            this.goalDetails = goalDetails;
        }

    }

    public class FileUrl {

        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("size")
        @Expose
        private long size;
        @SerializedName("mime")
        @Expose
        private String mime;
        @SerializedName("id")
        @Expose
        private String id;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public long getSize() {
            return size;
        }

        public void setSize(long size) {
            this.size = size;
        }

        public String getMime() {
            return mime;
        }

        public void setMime(String mime) {
            this.mime = mime;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

    }

    public class FileUrl__1 {

        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("size")
        @Expose
        private long size;
        @SerializedName("mime")
        @Expose
        private String mime;
        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("link")
        @Expose
        private String link;

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public long getSize() {
            return size;
        }

        public void setSize(long size) {
            this.size = size;
        }

        public String getMime() {
            return mime;
        }

        public void setMime(String mime) {
            this.mime = mime;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

    }

    public class GoalDetail {

        @SerializedName("_id")
        @Expose
        private String id;
        @SerializedName("userId")
        @Expose
        private long userId;
        @SerializedName("description")
        @Expose
        private String description;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("fileUrl")
        @Expose
        private Object fileUrl;
        @SerializedName("createdAt")
        @Expose
        private String createdAt;
        @SerializedName("updatedAt")
        @Expose
        private String updatedAt;
        @SerializedName("goalId")
        @Expose
        private long goalId;
        @SerializedName("__v")
        @Expose
        private long v;
        @SerializedName("classDetails")
        @Expose
        private List<ClassDetail> classDetails = null;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public long getUserId() {
            return userId;
        }

        public void setUserId(long userId) {
            this.userId = userId;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Object getFileUrl() {
            return fileUrl;
        }

        public void setFileUrl(Object fileUrl) {
            this.fileUrl = fileUrl;
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

        public long getGoalId() {
            return goalId;
        }

        public void setGoalId(long goalId) {
            this.goalId = goalId;
        }

        public long getV() {
            return v;
        }

        public void setV(long v) {
            this.v = v;
        }

        public List<ClassDetail> getClassDetails() {
            return classDetails;
        }

        public void setClassDetails(List<ClassDetail> classDetails) {
            this.classDetails = classDetails;
        }

    }

    public class RecommendedClass {

        @SerializedName("_id")
        @Expose
        private String id;
        @SerializedName("categoryIds")
        @Expose
        private List<Long> categoryIds = null;
        @SerializedName("equipmentIds")
        @Expose
        private List<Long> equipmentIds = null;
        @SerializedName("duration")
        @Expose
        private long duration;
        @SerializedName("userId")
        @Expose
        private long userId;
        @SerializedName("description")
        @Expose
        private String description;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("goalId")
        @Expose
        private long goalId;
        @SerializedName("timeSlotId")
        @Expose
        private long timeSlotId;
        @SerializedName("intensityId")
        @Expose
        private long intensityId;
        @SerializedName("nutritionId")
        @Expose
        private long nutritionId;
        @SerializedName("fileUrl")
        @Expose
        private FileUrl fileUrl;
        @SerializedName("createdAt")
        @Expose
        private String createdAt;
        @SerializedName("updatedAt")
        @Expose
        private String updatedAt;
        @SerializedName("classId")
        @Expose
        private long classId;
        @SerializedName("__v")
        @Expose
        private long v;
        @SerializedName("goalName")
        @Expose
        private String goalName;
        @SerializedName("intensityName")
        @Expose
        private String intensityName;
        @SerializedName("timeSlotName")
        @Expose
        private String timeSlotName;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public List<Long> getCategoryIds() {
            return categoryIds;
        }

        public void setCategoryIds(List<Long> categoryIds) {
            this.categoryIds = categoryIds;
        }

        public List<Long> getEquipmentIds() {
            return equipmentIds;
        }

        public void setEquipmentIds(List<Long> equipmentIds) {
            this.equipmentIds = equipmentIds;
        }

        public long getDuration() {
            return duration;
        }

        public void setDuration(long duration) {
            this.duration = duration;
        }

        public long getUserId() {
            return userId;
        }

        public void setUserId(long userId) {
            this.userId = userId;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public long getGoalId() {
            return goalId;
        }

        public void setGoalId(long goalId) {
            this.goalId = goalId;
        }

        public long getTimeSlotId() {
            return timeSlotId;
        }

        public void setTimeSlotId(long timeSlotId) {
            this.timeSlotId = timeSlotId;
        }

        public long getIntensityId() {
            return intensityId;
        }

        public void setIntensityId(long intensityId) {
            this.intensityId = intensityId;
        }

        public long getNutritionId() {
            return nutritionId;
        }

        public void setNutritionId(long nutritionId) {
            this.nutritionId = nutritionId;
        }

        public FileUrl getFileUrl() {
            return fileUrl;
        }

        public void setFileUrl(FileUrl fileUrl) {
            this.fileUrl = fileUrl;
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

        public long getClassId() {
            return classId;
        }

        public void setClassId(long classId) {
            this.classId = classId;
        }

        public long getV() {
            return v;
        }

        public void setV(long v) {
            this.v = v;
        }

        public String getGoalName() {
            return goalName;
        }

        public void setGoalName(String goalName) {
            this.goalName = goalName;
        }

        public String getIntensityName() {
            return intensityName;
        }

        public void setIntensityName(String intensityName) {
            this.intensityName = intensityName;
        }

        public String getTimeSlotName() {
            return timeSlotName;
        }

        public void setTimeSlotName(String timeSlotName) {
            this.timeSlotName = timeSlotName;
        }

    }
}
