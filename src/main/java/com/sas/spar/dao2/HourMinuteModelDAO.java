package com.sas.spar.dao2;

import javax.persistence.*;

@Entity
@Table(name = "loymax_HourMinuteModel_Offer", schema = "exchange", catalog = "DDS")
public class HourMinuteModelDAO {
    @Id
    @Column(name = "HourMinuteModel_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "HourMinuteModel_id_generator")
    @SequenceGenerator(name = "HourMinuteModel_id_generator", sequenceName = "HourMinuteModel_id_seq", schema = "exchange", allocationSize = 1)
    private Long id;
    private Integer hour = null;

    private Integer minute = null;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "timeRefinement_id", referencedColumnName = "timeRefinement_id")
    private TimeRefinementDAO timeRefinementDAO;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TimeRefinementDAO getTimeRefinementDAO() {
        return timeRefinementDAO;
    }

    public void setTimeRefinementDAO(TimeRefinementDAO timeRefinementDAO) {
        this.timeRefinementDAO = timeRefinementDAO;
    }

    public HourMinuteModelDAO hour(Integer hour) {
        this.hour = hour;
        return this;
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public HourMinuteModelDAO minute(Integer minute) {
        this.minute = minute;
        return this;
    }

    public Integer getMinute() {
        return minute;
    }

    public void setMinute(Integer minute) {
        this.minute = minute;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HourMinuteModelDAO {\n");

        sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
        sb.append("    minute: ").append(toIndentedString(minute)).append("\n");
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