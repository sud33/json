package com.rbc.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class ScoringApplicationResponseReason {

	@JsonIgnore
	private String applicationId;
	private String borrowerId;
	private String facilityId;
	private String borrowingOptionTypeId;
	private String applicaitonScoreReason;
	@JsonIgnore
	private BigDecimal singleReasonVer;
	
	@JsonIgnore
	private BigDecimal sequenceNumber;
	
	@JsonIgnore
	private Timestamp timestamp;
	
	
	public String getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}
	public String getBorrowerId() {
		return borrowerId;
	}
	public void setBorrowerId(String borrowerId) {
		this.borrowerId = borrowerId;
	}
	public String getFacilityId() {
		return facilityId;
	}
	public void setFacilityId(String facilityId) {
		this.facilityId = facilityId;
	}
	
	public BigDecimal getSequenceNumber() {
		return sequenceNumber;
	}
	public void setSequenceNumber(BigDecimal sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}
	public String getBorrowingOptionTypeId() {
		return borrowingOptionTypeId;
	}
	public void setBorrowingOptionTypeId(String borrowingOptionTypeId) {
		this.borrowingOptionTypeId = borrowingOptionTypeId;
	}
	public String getApplicaitonScoreReason() {
		return applicaitonScoreReason;
	}
	public void setApplicaitonScoreReason(String applicaitonScoreReason) {
		this.applicaitonScoreReason = applicaitonScoreReason;
	}
	public BigDecimal getSingleReasonVer() {
		return singleReasonVer;
	}
	public void setSingleReasonVer(BigDecimal singleReasonVer) {
		this.singleReasonVer = singleReasonVer;
	}
	public Timestamp getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	
	
	
	
}
