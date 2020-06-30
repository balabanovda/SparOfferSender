package com.sas.spar.dao2;


import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Модель импортируемых акций.
 */
@Entity
@Table(name = "loymax_OffersImportModel", schema = "exchange", catalog = "DDS")
public class OffersImportModelDAO {

    @Id
    @Column(name = "OffersImportModel_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "OffersImportModel_id_generator")
    @SequenceGenerator(name = "OffersImportModel_id_generator", sequenceName = "OffersImportModel_id_seq", schema = "exchange", allocationSize = 1)
    private Long id;

    @OneToMany(mappedBy = "offersImportModelDAO")
    private List<OfferDAO> offers = null;

    public enum VersionEnum {
        VERSION10("Version10"),

        VERSION20("Version20");

        private String value;

        VersionEnum(String value) {
            this.value = value;
        }


        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }


        public static OffersImportModelDAO.VersionEnum fromValue(String text) {
            for (OffersImportModelDAO.VersionEnum b : OffersImportModelDAO.VersionEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    @Enumerated(EnumType.STRING)
    private VersionEnum version = null;

    public List<OfferDAO> getOffers() {
        return offers;
    }

    public void setOffers(List<OfferDAO> offers) {
        this.offers = offers;
    }

    public VersionEnum getVersion() {
        return version;
    }
    public void setVersion(VersionEnum version) {
        this.version = version;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "OffersImportModelDAO{" +
                "id=" + id +
                ", offers=" + offers +
                ", version=" + version +
                '}';
    }
}

