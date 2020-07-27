package com.sas.spar.dao2;

import javax.persistence.*;

@Entity
@Table(name = "loymax_AttributeDiscount", schema = "exchange", catalog = "DDS")
class AttributeDiscountDAO{
    @Id
    @Column(name = "AttributeDiscount_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "AttributeDiscount_id_generator")
    @SequenceGenerator(name = "AttributeDiscount_id_generator", sequenceName = "AttributeDiscount_id_seq", schema = "exchange", allocationSize = 1)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Action_id", referencedColumnName = "Action_id")
    private DirectDiscountActionDAO directDiscountActionDAO;

    public enum AttributeDiscountTypeEnum {
        PRICEPERUNIT("PricePerUnit"),

        AMOUNTPERWEIGHT("AmountPerWeight");

        private String value;

        AttributeDiscountTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static AttributeDiscountTypeEnum fromValue(String text) {
            for (AttributeDiscountTypeEnum b : AttributeDiscountTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }
    private AttributeDiscountTypeEnum attributeDiscountType = null;

    private Integer catalogAttributeId = null;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AttributeDiscountTypeEnum getAttributeDiscountType() {
        return attributeDiscountType;
    }

    public DirectDiscountActionDAO getDirectDiscountActionDAO() {
        return directDiscountActionDAO;
    }

    public void setDirectDiscountActionDAO(DirectDiscountActionDAO directDiscountActionDAO) {
        this.directDiscountActionDAO = directDiscountActionDAO;
    }

    public void setAttributeDiscountType(AttributeDiscountTypeEnum attributeDiscountType) {
        this.attributeDiscountType = attributeDiscountType;
    }

    public Integer getCatalogAttributeId() {
        return catalogAttributeId;
    }

    public void setCatalogAttributeId(Integer catalogAttributeId) {
        this.catalogAttributeId = catalogAttributeId;
    }

    @Override
    public String toString() {
        return "AttributeDiscountDAO{" +
                "id=" + id +
                ", attributeDiscountType=" + attributeDiscountType +
                ", catalogAttributeId=" + catalogAttributeId +
                '}';
    }
}
