package com.kuviam.dopa.analyticalengine.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AnalyticalData")
public class AnalyticalData {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	
	Long deviceId;
	String disciplineName;
	String locusName;
	Long assignedRecallTime;
	Long assignedPracticeTime;
	// long practiceTime;
	// long recallTime;
	Integer noOfItems;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(Long deviceId) {
		this.deviceId = deviceId;
	}

	public String getDisciplineName() {
		return disciplineName;
	}

	public void setDisciplineName(String disciplineName) {
		this.disciplineName = disciplineName;
	}

	public String getLocusName() {
		return locusName;
	}

	public void setLocusName(String locusName) {
		this.locusName = locusName;
	}

	public Long getAssignedRecallTime() {
		return assignedRecallTime;
	}

	public void setAssignedRecallTime(Long assignedRecallTime) {
		this.assignedRecallTime = assignedRecallTime;
	}

	public Long getAssignedPracticeTime() {
		return assignedPracticeTime;
	}

	public void setAssignedPracticeTime(Long assignedPracticeTime) {
		this.assignedPracticeTime = assignedPracticeTime;
	}

	public Integer getNoOfItems() {
		return noOfItems;
	}

	public void setNoOfItems(Integer noOfItems) {
		this.noOfItems = noOfItems;
	}

}