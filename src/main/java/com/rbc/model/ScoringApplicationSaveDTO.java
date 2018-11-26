package com.rbc.model;

import io.swagger.annotations.ApiModel;

@ApiModel(description="A complex object holding various data models to save credit scoring applicaiton. All external calls to the save API must use this object")
public class ScoringApplicationSaveDTO {

	private	ScoringApplicationData applicationData;
	private	ScoringApplicaitonResponse applicaitonResponse;
	private	ScoringApplicationResponseReason applicationResponseReason;
	private	ScoringBorrowerInformation borrowerInformation;
	private	ScoringBorrowerInformationResponse borrowerInformationResponse;
	private	ScoringFacilityData scoringFacilityData;
	private	ScoringFacilityResponse scoringFacilityResponse;
	private	ScoringPricing scoringPricing;
	private	ScoringPricingResponse pricingResponse;
	private	ScoringFacilityAssets facilityAssets;
	private	ScoringCollaterals scoringCollaterals;
	private	ScoringCollateralSignatory scoringCollateralSignatory;
	private	ScorningCollateralAssets scorningCollateralAssets;
	private	ScoringCovenants scoringCovenants;
	private	ScoringCovenantsResponse scoringCovenantsResponse;
	private	ScoringEventApplicationData scoringEventApplicationData;
	private	ScoringVersionControl scoringVersionControl;
	private	ScoringLookup scoringLookup;
	private	ScoringTableType scoringTableType;
	private	ScoringProduct scoringProduct;
	private	ScoringFees scoringFees;
	private	ScoringFinancials scoringFinancials;
	
	public ScoringApplicationData getApplicationData() {
		return applicationData;
	}
	public void setApplicationData(ScoringApplicationData applicationData) {
		this.applicationData = applicationData;
	}
	public ScoringApplicaitonResponse getApplicaitonResponse() {
		return applicaitonResponse;
	}
	public void setApplicaitonResponse(ScoringApplicaitonResponse applicaitonResponse) {
		this.applicaitonResponse = applicaitonResponse;
	}
	public ScoringApplicationResponseReason getApplicationResponseReason() {
		return applicationResponseReason;
	}
	public void setApplicationResponseReason(ScoringApplicationResponseReason applicationResponseReason) {
		this.applicationResponseReason = applicationResponseReason;
	}
	public ScoringBorrowerInformation getBorrowerInformation() {
		return borrowerInformation;
	}
	public void setBorrowerInformation(ScoringBorrowerInformation borrowerInformation) {
		this.borrowerInformation = borrowerInformation;
	}
	public ScoringBorrowerInformationResponse getBorrowerInformationResponse() {
		return borrowerInformationResponse;
	}
	public void setBorrowerInformationResponse(ScoringBorrowerInformationResponse borrowerInformationResponse) {
		this.borrowerInformationResponse = borrowerInformationResponse;
	}
	public ScoringFacilityData getScoringFacilityData() {
		return scoringFacilityData;
	}
	public void setScoringFacilityData(ScoringFacilityData scoringFacilityData) {
		this.scoringFacilityData = scoringFacilityData;
	}
	public ScoringFacilityResponse getScoringFacilityResponse() {
		return scoringFacilityResponse;
	}
	public void setScoringFacilityResponse(ScoringFacilityResponse scoringFacilityResponse) {
		this.scoringFacilityResponse = scoringFacilityResponse;
	}
	public ScoringPricing getScoringPricing() {
		return scoringPricing;
	}
	public void setScoringPricing(ScoringPricing scoringPricing) {
		this.scoringPricing = scoringPricing;
	}
	public ScoringPricingResponse getPricingResponse() {
		return pricingResponse;
	}
	public void setPricingResponse(ScoringPricingResponse pricingResponse) {
		this.pricingResponse = pricingResponse;
	}
	public ScoringFacilityAssets getFacilityAssets() {
		return facilityAssets;
	}
	public void setFacilityAssets(ScoringFacilityAssets facilityAssets) {
		this.facilityAssets = facilityAssets;
	}
	public ScoringCollaterals getScoringCollaterals() {
		return scoringCollaterals;
	}
	public void setScoringCollaterals(ScoringCollaterals scoringCollaterals) {
		this.scoringCollaterals = scoringCollaterals;
	}
	public ScoringCollateralSignatory getScoringCollateralSignatory() {
		return scoringCollateralSignatory;
	}
	public void setScoringCollateralSignatory(ScoringCollateralSignatory scoringCollateralSignatory) {
		this.scoringCollateralSignatory = scoringCollateralSignatory;
	}
	public ScorningCollateralAssets getScorningCollateralAssets() {
		return scorningCollateralAssets;
	}
	public void setScorningCollateralAssets(ScorningCollateralAssets scorningCollateralAssets) {
		this.scorningCollateralAssets = scorningCollateralAssets;
	}
	public ScoringCovenants getScoringCovenants() {
		return scoringCovenants;
	}
	public void setScoringCovenants(ScoringCovenants scoringCovenants) {
		this.scoringCovenants = scoringCovenants;
	}
	public ScoringCovenantsResponse getScoringCovenantsResponse() {
		return scoringCovenantsResponse;
	}
	public void setScoringCovenantsResponse(ScoringCovenantsResponse scoringCovenantsResponse) {
		this.scoringCovenantsResponse = scoringCovenantsResponse;
	}
	public ScoringEventApplicationData getScoringEventApplicationData() {
		return scoringEventApplicationData;
	}
	public void setScoringEventApplicationData(ScoringEventApplicationData scoringEventApplicationData) {
		this.scoringEventApplicationData = scoringEventApplicationData;
	}
	public ScoringVersionControl getScoringVersionControl() {
		return scoringVersionControl;
	}
	public void setScoringVersionControl(ScoringVersionControl scoringVersionControl) {
		this.scoringVersionControl = scoringVersionControl;
	}
	public ScoringLookup getScoringLookup() {
		return scoringLookup;
	}
	public void setScoringLookup(ScoringLookup scoringLookup) {
		this.scoringLookup = scoringLookup;
	}
	public ScoringTableType getScoringTableType() {
		return scoringTableType;
	}
	public void setScoringTableType(ScoringTableType scoringTableType) {
		this.scoringTableType = scoringTableType;
	}
	public ScoringProduct getScoringProduct() {
		return scoringProduct;
	}
	public void setScoringProduct(ScoringProduct scoringProduct) {
		this.scoringProduct = scoringProduct;
	}
	public ScoringFees getScoringFees() {
		return scoringFees;
	}
	public void setScoringFees(ScoringFees scoringFees) {
		this.scoringFees = scoringFees;
	}
	public ScoringFinancials getScoringFinancials() {
		return scoringFinancials;
	}
	public void setScoringFinancials(ScoringFinancials scoringFinancials) {
		this.scoringFinancials = scoringFinancials;
	}
	
	
	public ScoringApplicationSaveDTO(ScoringApplicationData applicationData,
			ScoringApplicaitonResponse applicaitonResponse, ScoringApplicationResponseReason applicationResponseReason,
			ScoringBorrowerInformation borrowerInformation,
			ScoringBorrowerInformationResponse borrowerInformationResponse, ScoringFacilityData scoringFacilityData,
			ScoringFacilityResponse scoringFacilityResponse, ScoringPricing scoringPricing,
			ScoringPricingResponse pricingResponse, ScoringFacilityAssets facilityAssets,
			ScoringCollaterals scoringCollaterals, ScoringCollateralSignatory scoringCollateralSignatory,
			ScorningCollateralAssets scorningCollateralAssets, ScoringCovenants scoringCovenants,
			ScoringCovenantsResponse scoringCovenantsResponse, ScoringEventApplicationData scoringEventApplicationData,
			ScoringVersionControl scoringVersionControl, ScoringLookup scoringLookup, ScoringTableType scoringTableType,
			ScoringProduct scoringProduct, ScoringFees scoringFees, ScoringFinancials scoringFinancials) {
		super();
		this.applicationData = applicationData;
		this.applicaitonResponse = applicaitonResponse;
		this.applicationResponseReason = applicationResponseReason;
		this.borrowerInformation = borrowerInformation;
		this.borrowerInformationResponse = borrowerInformationResponse;
		this.scoringFacilityData = scoringFacilityData;
		this.scoringFacilityResponse = scoringFacilityResponse;
		this.scoringPricing = scoringPricing;
		this.pricingResponse = pricingResponse;
		this.facilityAssets = facilityAssets;
		this.scoringCollaterals = scoringCollaterals;
		this.scoringCollateralSignatory = scoringCollateralSignatory;
		this.scorningCollateralAssets = scorningCollateralAssets;
		this.scoringCovenants = scoringCovenants;
		this.scoringCovenantsResponse = scoringCovenantsResponse;
		this.scoringEventApplicationData = scoringEventApplicationData;
		this.scoringVersionControl = scoringVersionControl;
		this.scoringLookup = scoringLookup;
		this.scoringTableType = scoringTableType;
		this.scoringProduct = scoringProduct;
		this.scoringFees = scoringFees;
		this.scoringFinancials = scoringFinancials;
	}
	public ScoringApplicationSaveDTO() {
		// TODO Auto-generated constructor stub
	}
	
}
