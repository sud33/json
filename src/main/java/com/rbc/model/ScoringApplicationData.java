package com.rbc.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.swagger.annotations.ApiModel;

@ApiModel(description="Contains scorinng applicaiton related data")
public class ScoringApplicationData {

	private String singleNameId;
	private int singleNameSequence;
	private int bbtrSequence;
	private String applicaitonType;
	private BigDecimal totalSingleNameExposure;
	private BigDecimal proposedTotalSingleNameExposure;
	private String appCode;
	private String appChannel;
	private int applicationId;
	private BigDecimal appVersion;
	
	@JsonIgnore
	private Timestamp timestamp;
	public String getSingleNameId() {
		return singleNameId;
	}
	public void setSingleNameId(String singleNameId) {
		this.singleNameId = singleNameId;
	}
	public int getSingleNameSequence() {
		return singleNameSequence;
	}
	public void setSingleNameSequence(int singleNameSequence) {
		this.singleNameSequence = singleNameSequence;
	}
	public int getBbtrSequence() {
		return bbtrSequence;
	}
	public void setBbtrSequence(int bbtrSequence) {
		this.bbtrSequence = bbtrSequence;
	}
	public String getApplicaitonType() {
		return applicaitonType;
	}
	public void setApplicaitonType(String applicaitonType) {
		this.applicaitonType = applicaitonType;
	}
	public BigDecimal getTotalSingleNameExposure() {
		return totalSingleNameExposure;
	}
	public void setTotalSingleNameExposure(BigDecimal totalSingleNameExposure) {
		this.totalSingleNameExposure = totalSingleNameExposure;
	}
	public BigDecimal getProposedTotalSingleNameExposure() {
		return proposedTotalSingleNameExposure;
	}
	public void setProposedTotalSingleNameExposure(BigDecimal proposedTotalSingleNameExposure) {
		this.proposedTotalSingleNameExposure = proposedTotalSingleNameExposure;
	}
	public String getAppCode() {
		return appCode;
	}
	public void setAppCode(String appCode) {
		this.appCode = appCode;
	}
	public String getAppChannel() {
		return appChannel;
	}
	public void setAppChannel(String appChannel) {
		this.appChannel = appChannel;
	}
	public int getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}
	public BigDecimal getAppVersion() {
		return appVersion;
	}
	public void setAppVersion(BigDecimal appVersion) {
		this.appVersion = appVersion;
	}
	public Timestamp getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	
	
	
	
}
