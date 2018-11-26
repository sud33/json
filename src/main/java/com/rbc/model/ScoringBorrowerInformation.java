package com.rbc.model;

import java.math.BigDecimal;
import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class ScoringBorrowerInformation {
	
	@JsonIgnore
	private String appId;
	
	private String borrowerId;
	private String CMICode;
	private String legalStructureCode;
	private String SIC;
	private String countryCode;
	private String provinceCode;
	private Date businessEstablishedDate;
	private Date clientSinceDate;
	private String borrowerRiskRating;
	private String businessSegment;
	
	private int VICId;
	private String subVic;
	private BigDecimal ccriGeneralScore;
	private BigDecimal ccriLimitScore;
	private BigDecimal ccriLendingScore;
	private BigDecimal ccriFinancialScore;
	private BigDecimal ccriScore;
	private BigDecimal personalCriScore;
	private BigDecimal basePortabilityOfDefault;
	private BigDecimal economicCapital;
	
	private BigDecimal regulatoryCapital;
	private int stratergicValueIndustry;
	private int stratergicValueRegion;
	private int numberWriteOffsPreviousYears;
	private Date lastWriteOffDate;
	private int numberDelinquencies31To60Days;
	private Date lastDelinquency31To60DayDate;
	
	private int numberDelinquencies61To90Days;
	private Date lastDelinquency61To90DayDate;
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public String getBorrowerId() {
		return borrowerId;
	}
	public void setBorrowerId(String borrowerId) {
		this.borrowerId = borrowerId;
	}
	public String getCMICode() {
		return CMICode;
	}
	public void setCMICode(String cMICode) {
		CMICode = cMICode;
	}
	public String getLegalStructureCode() {
		return legalStructureCode;
	}
	public void setLegalStructureCode(String legalStructureCode) {
		this.legalStructureCode = legalStructureCode;
	}
	public String getSIC() {
		return SIC;
	}
	public void setSIC(String sIC) {
		SIC = sIC;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getProvinceCode() {
		return provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}
	public Date getBusinessEstablishedDate() {
		return businessEstablishedDate;
	}
	public void setBusinessEstablishedDate(Date businessEstablishedDate) {
		this.businessEstablishedDate = businessEstablishedDate;
	}
	public Date getClientSinceDate() {
		return clientSinceDate;
	}
	public void setClientSinceDate(Date clientSinceDate) {
		this.clientSinceDate = clientSinceDate;
	}
	public String getBorrowerRiskRating() {
		return borrowerRiskRating;
	}
	public void setBorrowerRiskRating(String borrowerRiskRating) {
		this.borrowerRiskRating = borrowerRiskRating;
	}
	public String getBusinessSegment() {
		return businessSegment;
	}
	public void setBusinessSegment(String businessSegment) {
		this.businessSegment = businessSegment;
	}
	public int getVICId() {
		return VICId;
	}
	public void setVICId(int vICId) {
		VICId = vICId;
	}
	public String getSubVic() {
		return subVic;
	}
	public void setSubVic(String subVic) {
		this.subVic = subVic;
	}
	public BigDecimal getCcriGeneralScore() {
		return ccriGeneralScore;
	}
	public void setCcriGeneralScore(BigDecimal ccriGeneralScore) {
		this.ccriGeneralScore = ccriGeneralScore;
	}
	public BigDecimal getCcriLimitScore() {
		return ccriLimitScore;
	}
	public void setCcriLimitScore(BigDecimal ccriLimitScore) {
		this.ccriLimitScore = ccriLimitScore;
	}
	public BigDecimal getCcriLendingScore() {
		return ccriLendingScore;
	}
	public void setCcriLendingScore(BigDecimal ccriLendingScore) {
		this.ccriLendingScore = ccriLendingScore;
	}
	public BigDecimal getCcriFinancialScore() {
		return ccriFinancialScore;
	}
	public void setCcriFinancialScore(BigDecimal ccriFinancialScore) {
		this.ccriFinancialScore = ccriFinancialScore;
	}
	public BigDecimal getCcriScore() {
		return ccriScore;
	}
	public void setCcriScore(BigDecimal ccriScore) {
		this.ccriScore = ccriScore;
	}
	public BigDecimal getPersonalCriScore() {
		return personalCriScore;
	}
	public void setPersonalCriScore(BigDecimal personalCriScore) {
		this.personalCriScore = personalCriScore;
	}
	public BigDecimal getBasePortabilityOfDefault() {
		return basePortabilityOfDefault;
	}
	public void setBasePortabilityOfDefault(BigDecimal basePortabilityOfDefault) {
		this.basePortabilityOfDefault = basePortabilityOfDefault;
	}
	public BigDecimal getEconomicCapital() {
		return economicCapital;
	}
	public void setEconomicCapital(BigDecimal economicCapital) {
		this.economicCapital = economicCapital;
	}
	public BigDecimal getRegulatoryCapital() {
		return regulatoryCapital;
	}
	public void setRegulatoryCapital(BigDecimal regulatoryCapital) {
		this.regulatoryCapital = regulatoryCapital;
	}
	public int getStratergicValueIndustry() {
		return stratergicValueIndustry;
	}
	public void setStratergicValueIndustry(int stratergicValueIndustry) {
		this.stratergicValueIndustry = stratergicValueIndustry;
	}
	public int getStratergicValueRegion() {
		return stratergicValueRegion;
	}
	public void setStratergicValueRegion(int stratergicValueRegion) {
		this.stratergicValueRegion = stratergicValueRegion;
	}
	public int getNumberWriteOffsPreviousYears() {
		return numberWriteOffsPreviousYears;
	}
	public void setNumberWriteOffsPreviousYears(int numberWriteOffsPreviousYears) {
		this.numberWriteOffsPreviousYears = numberWriteOffsPreviousYears;
	}
	public Date getLastWriteOffDate() {
		return lastWriteOffDate;
	}
	public void setLastWriteOffDate(Date lastWriteOffDate) {
		this.lastWriteOffDate = lastWriteOffDate;
	}
	public int getNumberDelinquencies31To60Days() {
		return numberDelinquencies31To60Days;
	}
	public void setNumberDelinquencies31To60Days(int numberDelinquencies31To60Days) {
		this.numberDelinquencies31To60Days = numberDelinquencies31To60Days;
	}
	public Date getLastDelinquency31To60DayDate() {
		return lastDelinquency31To60DayDate;
	}
	public void setLastDelinquency31To60DayDate(Date lastDelinquency31To60DayDate) {
		this.lastDelinquency31To60DayDate = lastDelinquency31To60DayDate;
	}
	public int getNumberDelinquencies61To90Days() {
		return numberDelinquencies61To90Days;
	}
	public void setNumberDelinquencies61To90Days(int numberDelinquencies61To90Days) {
		this.numberDelinquencies61To90Days = numberDelinquencies61To90Days;
	}
	public Date getLastDelinquency61To90DayDate() {
		return lastDelinquency61To90DayDate;
	}
	public void setLastDelinquency61To90DayDate(Date lastDelinquency61To90DayDate) {
		this.lastDelinquency61To90DayDate = lastDelinquency61To90DayDate;
	}
	
	
	
	
	
	
	
	
}