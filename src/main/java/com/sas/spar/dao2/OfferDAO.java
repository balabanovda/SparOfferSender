package com.sas.spar.dao2;

import javax.persistence.*;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "loymax_Offer", schema = "exchange", catalog = "DDS")
public class OfferDAO {
    @Id
    @Column(name = "Offer_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Offer_id_generator")
    @SequenceGenerator(name = "Offer_id_generator", sequenceName = "Offer_id_seq", schema = "exchange", allocationSize = 1)
    private Long idKey;

    private String id = null;

    private String title = null;

    private String applyChangesDateValue = null;

    private String expirationDateValue = null;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "OffersImportModel_id",  nullable = false)
    private OffersImportModelDAO offersImportModelDAO;

    public enum WorkingStateEnum {
        STOPPED("Stopped"),

        RUNNING("Running");

        private String value;

        WorkingStateEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static OfferDAO.WorkingStateEnum fromValue(String text) {
            for (OfferDAO.WorkingStateEnum b : OfferDAO.WorkingStateEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    @Enumerated(EnumType.STRING)
    private WorkingStateEnum workingState = null;

    public enum ChangesStateEnum {
        EDITING("Editing"),

        ONAPPROVAL("OnApproval"),

        APPROVED("Approved");

        private String value;

        ChangesStateEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static OfferDAO.ChangesStateEnum fromValue(String text) {
            for (OfferDAO.ChangesStateEnum b : OfferDAO.ChangesStateEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    @Enumerated(EnumType.STRING)
    private ChangesStateEnum changesState = null;

    private Integer priority = null;

    private Boolean isSum = null;
    @OneToOne(mappedBy = "offerDAO", cascade = {CascadeType.ALL})
    private TimeRefinementDAO timeRefinement = null;

    private String description = null;

    private String category = null;

    private Integer marketingCampaign = null;
    @OneToOne(mappedBy = "offerDAO", cascade = {CascadeType.ALL})
    private OfferPartnersDAO partnersDAO = null;
    @OneToOne(mappedBy = "offerDAO", cascade = {CascadeType.ALL})
    private OfferLoyaltyProgramsDAO loyaltyProgramsDAO = null;
    @OneToOne(mappedBy = "offerDAO", cascade = {CascadeType.ALL})
    private PointsOfSalesDAO pointsOfSalesDAO = null;
//    @OneToMany(mappedBy = "offerDAO", cascade = {CascadeType.ALL})
//    private List<BaseTargetGroupDAO> targetGroups = null;
    @OneToOne(mappedBy = "offerDAO", cascade = {CascadeType.ALL})
    private OfferRulesDAO rulesDAO = null;

    private OffsetDateTime applyChangesDate = null;

    private OffsetDateTime expirationDate = null;

    public OfferDAO id(String id) {
        this.id = id;
        return this;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public OfferDAO title(String title) {
        this.title = title;
        return this;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public OfferDAO applyChangesDateValue(String applyChangesDateValue) {
        this.applyChangesDateValue = applyChangesDateValue;
        return this;
    }

    public String getApplyChangesDateValue() {
        return applyChangesDateValue;
    }

    public void setApplyChangesDateValue(String applyChangesDateValue) {
        this.applyChangesDateValue = applyChangesDateValue;
    }

    public OfferDAO expirationDateValue(String expirationDateValue) {
        this.expirationDateValue = expirationDateValue;
        return this;
    }

    public String getExpirationDateValue() {
        return expirationDateValue;
    }

    public void setExpirationDateValue(String expirationDateValue) {
        this.expirationDateValue = expirationDateValue;
    }

    public OfferDAO workingState(OfferDAO.WorkingStateEnum workingState) {
        this.workingState = workingState;
        return this;
    }

    public WorkingStateEnum getWorkingState() {
        return workingState;
    }

    public void setWorkingState(WorkingStateEnum workingState) {
        this.workingState = workingState;
    }

    public OfferDAO changesState(OfferDAO.ChangesStateEnum changesState) {
        this.changesState = changesState;
        return this;
    }

    public OfferDAO.ChangesStateEnum getChangesState() {
        return changesState;
    }

    public void setChangesState(OfferDAO.ChangesStateEnum changesState) {
        this.changesState = changesState;
    }

    public OfferDAO priority(Integer priority) {
        this.priority = priority;
        return this;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public OfferDAO isSum(Boolean isSum) {
        this.isSum = isSum;
        return this;
    }

    public Boolean isIsSum() {
        return isSum;
    }

    public void setIsSum(Boolean isSum) {
        this.isSum = isSum;
    }

    public OfferDAO timeRefinement(TimeRefinementDAO timeRefinement) {
        this.timeRefinement = timeRefinement;
        return this;
    }

    public TimeRefinementDAO getTimeRefinement() {
        return timeRefinement;
    }

    public void setTimeRefinement(TimeRefinementDAO timeRefinement) {
        this.timeRefinement = timeRefinement;
    }

    public OfferDAO description(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public OfferDAO category(String category) {
        this.category = category;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public OfferDAO marketingCampaign(Integer marketingCampaign) {
        this.marketingCampaign = marketingCampaign;
        return this;
    }

    public Integer getMarketingCampaign() {
        return marketingCampaign;
    }

    public void setMarketingCampaign(Integer marketingCampaign) {
        this.marketingCampaign = marketingCampaign;
    }

    public OfferDAO partners(OfferPartnersDAO partnersDAO) {
        this.partnersDAO = partnersDAO;
        return this;
    }


    public OfferPartnersDAO getPartners() {
        return partnersDAO;
    }

    public void setPartners(OfferPartnersDAO partnersDAO) {
        this.partnersDAO = partnersDAO;
    }

    public OfferDAO loyaltyPrograms(OfferLoyaltyProgramsDAO loyaltyProgramsDAO) {
        this.loyaltyProgramsDAO = loyaltyProgramsDAO;
        return this;
    }

    public OfferLoyaltyProgramsDAO getLoyaltyPrograms() {
        return loyaltyProgramsDAO;
    }

    public void setLoyaltyPrograms(OfferLoyaltyProgramsDAO loyaltyProgramsDAO) {
        this.loyaltyProgramsDAO = loyaltyProgramsDAO;
    }

    public OfferDAO pointsOfSales(PointsOfSalesDAO pointsOfSalesDAO) {
        this.pointsOfSalesDAO = pointsOfSalesDAO;
        return this;
    }

    public PointsOfSalesDAO getPointsOfSales() {
        return pointsOfSalesDAO;
    }

    public void setPointsOfSales(PointsOfSalesDAO pointsOfSalesDAO) {
        this.pointsOfSalesDAO = pointsOfSalesDAO;
    }



//    public List<BaseTargetGroupDAO> getTargetGroups() {
//        return targetGroups;
//    }
//
//    public void setTargetGroups(List<BaseTargetGroupDAO> targetGroups) {
//        this.targetGroups = targetGroups;
//    }

    public OfferRulesDAO getRules() {
        return rulesDAO;
    }

    public void setRules(OfferRulesDAO rulesDAO) {
        this.rulesDAO = rulesDAO;
    }

    public OfferDAO applyChangesDate(OffsetDateTime applyChangesDate) {
        this.applyChangesDate = applyChangesDate;
        return this;
    }

    public OffsetDateTime getApplyChangesDate() {
        return applyChangesDate;
    }

    public void setApplyChangesDate(OffsetDateTime applyChangesDate) {
        this.applyChangesDate = applyChangesDate;
    }

    public OfferDAO expirationDate(OffsetDateTime expirationDate) {
        this.expirationDate = expirationDate;
        return this;
    }

    public OffsetDateTime getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(OffsetDateTime expirationDate) {
        this.expirationDate = expirationDate;
    }

    public OffersImportModelDAO getOffersImportModelDAO() {
        return offersImportModelDAO;
    }

    public void setOffersImportModelDAO(OffersImportModelDAO offersImportModelDAO) {
        this.offersImportModelDAO = offersImportModelDAO;
    }

    public Long getIdKey() {
        return idKey;
    }

    public void setIdKey(Long idKey) {
        this.idKey = idKey;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OfferDAO {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    applyChangesDateValue: ").append(toIndentedString(applyChangesDateValue)).append("\n");
        sb.append("    expirationDateValue: ").append(toIndentedString(expirationDateValue)).append("\n");
        sb.append("    workingState: ").append(toIndentedString(workingState)).append("\n");
        sb.append("    changesState: ").append(toIndentedString(changesState)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    isSum: ").append(toIndentedString(isSum)).append("\n");
        sb.append("    timeRefinement: ").append(toIndentedString(timeRefinement)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    marketingCampaign: ").append(toIndentedString(marketingCampaign)).append("\n");
        sb.append("    partners: ").append(toIndentedString(partnersDAO)).append("\n");
        sb.append("    loyaltyPrograms: ").append(toIndentedString(loyaltyProgramsDAO)).append("\n");
        sb.append("    pointsOfSales: ").append(toIndentedString(pointsOfSalesDAO)).append("\n");
        //sb.append("    targetGroups: ").append(toIndentedString(targetGroups)).append("\n");
        sb.append("    rules: ").append(toIndentedString(rulesDAO)).append("\n");
        sb.append("    applyChangesDate: ").append(toIndentedString(applyChangesDate)).append("\n");
        sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
