package com.nobroker.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "owner_plans")
public class OwnerPlan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long planId;
    @Column(name = "plan_name", unique = true)
    private String planName;
    @Column(name = "price")
    private Double price;
    @Column(name = "plan_validity")
    private int planValidity;  // in months
    @Column(name = "relationship_manager")
    private boolean relationshipManager;
    @Column(name = "has_rental_agreement")
    private boolean hasRentalAgreement;
    @Column(name = "has_guaranteed_tenants")
    private boolean hasGuaranteedTenants;
    @Column(name = "property_promotion")
    private boolean propertyPromotion;
    @Column(name = "privacy_of_phone_number")
    private boolean privacyOfPhoneNumber;
    @Column(name = "showing_property_on_behalf")
    private boolean showingPropertyOnBehalf;

    @Override
    public String toString() {
        return "OwnerPlan{" +
                "planId=" + planId +
                ", planName='" + planName + '\'' +
                ", planValidity=" + planValidity +
                ", relationshipManager='" + relationshipManager + '\'' +
                ", hasRentalAgreement=" + hasRentalAgreement +
                ", hasGuaranteedTenants=" + hasGuaranteedTenants +
                ", propertyPromotionOnWebsite=" + propertyPromotion +
                ", privacyOfPhoneNumber=" + privacyOfPhoneNumber +
                ", showingPropertyOnBehalf=" + showingPropertyOnBehalf +
                '}';
    }
}