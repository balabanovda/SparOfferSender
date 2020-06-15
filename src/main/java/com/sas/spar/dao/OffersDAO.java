package com.sas.spar.dao;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "lx_Offers", schema = "exchange", catalog = "DDS")
public class OffersDAO {
    @Id
    @Column(name = "Offers_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Offers_id_generator")
    @SequenceGenerator(name = "Offers_id_generator", sequenceName = "Offers_id_seq", schema = "exchange", allocationSize = 1)
    private Long keyId;

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
    //@OneToOne(cascade = CascadeType.ALL)
    @OneToOne(mappedBy = "offersDAO", cascade = CascadeType.ALL)
    private PartnersDAO partnersDAO;

    private String pointsOfSales;

    private String targetGroups;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "root_id")
    public RootDAO rootDAO;

    public PartnersDAO getPartnersDAO() {
        return partnersDAO;
    }

    public void setPartnersDAO(PartnersDAO partnersDAO) {
        this.partnersDAO = partnersDAO;
    }

    @OneToOne(mappedBy = "offersDAO", cascade = CascadeType.ALL)
    private RulesDAO rulesDAO;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setApplyChangesDateValue(String applyChangesDateValue) {
        this.applyChangesDateValue = applyChangesDateValue;
    }

    public String getApplyChangesDateValue() {
        return this.applyChangesDateValue;
    }

    public void setExpirationDateValue(String expirationDateValue) {
        this.expirationDateValue = expirationDateValue;
    }

    public String getExpirationDateValue() {
        return this.expirationDateValue;
    }

    public void setWorkingState(String workingState) {
        this.workingState = workingState;
    }

    public String getWorkingState() {
        return this.workingState;
    }

    public void setChangesState(String changesState) {
        this.changesState = changesState;
    }

    public String getChangesState() {
        return this.changesState;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getPriority() {
        return this.priority;
    }

    public void setIsSum(boolean isSum) {
        this.isSum = isSum;
    }

    public boolean getIsSum() {
        return this.isSum;
    }

    public void setTimeRefinement(String timeRefinement) {
        this.timeRefinement = timeRefinement;
    }

    public String getTimeRefinement() {
        return this.timeRefinement;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return this.category;
    }

    public void setPointsOfSales(String pointsOfSales) {
        this.pointsOfSales = pointsOfSales;
    }

    public String getPointsOfSales() {
        return this.pointsOfSales;
    }

    public void setTargetGroups(String targetGroups) {
        this.targetGroups = targetGroups;
    }

    public String getTargetGroups() {
        return this.targetGroups;
    }

    public Long getKeyId() {
        return keyId;
    }

    public void setKeyId(Long keyId) {
        this.keyId = keyId;
    }

    public boolean isSum() {
        return isSum;
    }

    public void setSum(boolean sum) {
        isSum = sum;
    }

    public RootDAO getRootDAO() {
        return rootDAO;
    }

    public void setRootDAO(RootDAO rootDAO) {
        this.rootDAO = rootDAO;
    }

    public RulesDAO getRulesDAO() {
        return rulesDAO;
    }

    public void setRulesDAO(RulesDAO rulesDAO) {
        this.rulesDAO = rulesDAO;
    }

    @Override
    public String toString() {
        return "OffersDAO{" +
                "keyId=" + keyId +
                ", id='" + id + '\'' +
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
                ", partnersDAO=" + partnersDAO +
                ", pointsOfSales='" + pointsOfSales + '\'' +
                ", targetGroups='" + targetGroups + '\'' +
                ", rootDAO=" +
                ", rulesDAO=" + rulesDAO +
                '}';
    }
}