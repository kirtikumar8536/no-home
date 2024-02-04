package com.nobroker.payload;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OwnerPlanDto {
    private Long planId;

    private String planName;
    private Double price;
    private int planValidity;  // in months

    private boolean relationshipManager;
    private boolean hasRentalAgreement;
    private boolean hasGuaranteedTenants;
    private boolean propertyPromotion;
    private boolean privacyOfPhoneNumber;
    private boolean showingPropertyOnBehalf;

    @Override
    public String toString() {
        return "OwnerPlanDto{" +
                "planId=" + planId +
                ", planName='" + planName + '\'' +
                ", price=" + price +
                ", planValidity=" + planValidity +
                ", relationshipManager=" + relationshipManager +
                ", hasRentalAgreement=" + hasRentalAgreement +
                ", hasGuaranteedTenants=" + hasGuaranteedTenants +
                ", propertyPromotion=" + propertyPromotion +
                ", privacyOfPhoneNumber=" + privacyOfPhoneNumber +
                ", showingPropertyOnBehalf=" + showingPropertyOnBehalf +
                '}';
    }
}
