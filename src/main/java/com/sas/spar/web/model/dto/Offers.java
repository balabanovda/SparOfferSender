package com.sas.spar.web.model.dto;



import java.util.List;

public class Offers
{
    private String id;

    private String title;

    private String applyChangesDateValue;

    private String expirationDateValue;

    private String workingState;

    private String changesState;

    private int priority;

    private boolean isSum;

    private String timeRefinement;

    private String description;

    private String category;

    private Partners partners;

    private String pointsOfSales;

    private String targetGroups;

    private Rules rules;

    public boolean isSum() {
        return isSum;
    }

    public void setSum(boolean sum) {
        isSum = sum;
    }

    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return this.id;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return this.title;
    }
    public void setApplyChangesDateValue(String applyChangesDateValue){
        this.applyChangesDateValue = applyChangesDateValue;
    }
    public String getApplyChangesDateValue(){
        return this.applyChangesDateValue;
    }
    public void setExpirationDateValue(String expirationDateValue){
        this.expirationDateValue = expirationDateValue;
    }
    public String getExpirationDateValue(){
        return this.expirationDateValue;
    }
    public void setWorkingState(String workingState){
        this.workingState = workingState;
    }
    public String getWorkingState(){
        return this.workingState;
    }
    public void setChangesState(String changesState){
        this.changesState = changesState;
    }
    public String getChangesState(){
        return this.changesState;
    }
    public void setPriority(int priority){
        this.priority = priority;
    }
    public int getPriority(){
        return this.priority;
    }
    public void setIsSum(boolean isSum){
        this.isSum = isSum;
    }
    public boolean getIsSum(){
        return this.isSum;
    }
    public void setTimeRefinement(String timeRefinement){
        this.timeRefinement = timeRefinement;
    }
    public String getTimeRefinement(){
        return this.timeRefinement;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getDescription(){
        return this.description;
    }
    public void setCategory(String category){
        this.category = category;
    }
    public String getCategory(){
        return this.category;
    }

    public Partners getPartners() {
        return partners;
    }

    public void setPartners(Partners partners) {
        this.partners = partners;
    }

    public void setPointsOfSales(String pointsOfSales){
        this.pointsOfSales = pointsOfSales;
    }
    public String getPointsOfSales(){
        return this.pointsOfSales;
    }
    public void setTargetGroups(String targetGroups){
        this.targetGroups = targetGroups;
    }
    public String getTargetGroups(){
        return this.targetGroups;
    }
    public void setRules(Rules rules){
        this.rules = rules;
    }
    public Rules getRules(){
        return this.rules;
    }

    @Override
    public String toString() {
        return "Offers{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", applyChangesDateValue='" + applyChangesDateValue + '\'' +
                ", expirationDateValue='" + expirationDateValue + '\'' +
                ", workingState='" + workingState + '\'' +
                ", changesState='" + changesState + '\'' +
                ", priority=" + priority +
                ", isSum=" + isSum +
                ", timeRefinement='" + timeRefinement + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", partners=" + partners +
                ", pointsOfSales='" + pointsOfSales + '\'' +
                ", targetGroups='" + targetGroups + '\'' +
                ", rules=" + rules +
                '}';
    }
}