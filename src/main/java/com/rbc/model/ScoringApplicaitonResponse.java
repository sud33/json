package com.rbc.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class ScoringApplicaitonResponse {

	private String applicationId;
	private Timestamp timestamp;
	@JsonIgnore
	private String b2IPID2;
	private BigDecimal applicationScore;
	private BigDecimal applicationPd;
	private int applicaitonScoreConfidence;
	public String getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}
	public Timestamp getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	public String getB2IPID2() {
		return b2IPID2;
	}
	public void setB2IPID2(String b2ipid2) {
		b2IPID2 = b2ipid2;
	}
	public BigDecimal getApplicationScore() {
		return applicationScore;
	}
	public void setApplicationScore(BigDecimal applicationScore) {
		this.applicationScore = applicationScore;
	}
	public BigDecimal getApplicationPd() {
		return applicationPd;
	}
	public void setApplicationPd(BigDecimal applicationPd) {
		this.applicationPd = applicationPd;
	}
	public int getApplicaitonScoreConfidence() {
		return applicaitonScoreConfidence;
	}
	public void setApplicaitonScoreConfidence(int applicaitonScoreConfidence) {
		this.applicaitonScoreConfidence = applicaitonScoreConfidence;
	}
	
	
}
