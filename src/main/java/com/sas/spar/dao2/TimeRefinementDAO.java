package com.sas.spar.dao2;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "loymax_TimeRefinement_Offer", schema = "exchange", catalog = "DDS")
public class TimeRefinementDAO {
    @Id
    @Column(name = "TimeRefinement_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TimeRefinement_id_generator")
    @SequenceGenerator(name = "TimeRefinement_id_generator", sequenceName = "TimeRefinement_id_seq", schema = "exchange", allocationSize = 1)
    private Long id;

    public enum DaysOfWeekEnum {
        SUNDAY("Sunday"),

        MONDAY("Monday"),

        TUESDAY("Tuesday"),

        WEDNESDAY("Wednesday"),

        THURSDAY("Thursday"),

        FRIDAY("Friday"),

        SATURDAY("Saturday");

        private String value;

        DaysOfWeekEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static TimeRefinementDAO.DaysOfWeekEnum fromValue(String text) {
            for (TimeRefinementDAO.DaysOfWeekEnum b : TimeRefinementDAO.DaysOfWeekEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "loymax_DaysOfWeek", schema = "exchange", catalog = "DDS", joinColumns = @JoinColumn(name = "TimeRefinement_id"))
    @Enumerated(EnumType.STRING)
    private List<DaysOfWeekEnum> daysOfWeek = null;
    @OneToOne(mappedBy = "timeRefinementDAO", cascade = {CascadeType.ALL})
    private HourMinuteModelDAO beginTime = null;
    @OneToOne(mappedBy = "timeRefinementDAO", cascade = {CascadeType.ALL})
    private HourMinuteModelDAO endTime = null;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "offer_id", referencedColumnName = "offer_id")
    private OfferDAO offerDAO;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<DaysOfWeekEnum> getDaysOfWeek() {
        return daysOfWeek;
    }

    public void setDaysOfWeek(List<DaysOfWeekEnum> daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }


    public HourMinuteModelDAO getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(HourMinuteModelDAO beginTime) {
        this.beginTime = beginTime;
    }

    public HourMinuteModelDAO getEndTime() {
        return endTime;
    }

    public void setEndTime(HourMinuteModelDAO endTime) {
        this.endTime = endTime;
    }

    public OfferDAO getOfferDAO() {
        return offerDAO;
    }

    public void setOfferDAO(OfferDAO offerDAO) {
        this.offerDAO = offerDAO;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TimeRefinementDAO {\n");

        sb.append("    daysOfWeek: ").append(toIndentedString(daysOfWeek)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
