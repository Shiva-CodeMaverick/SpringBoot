package com.dailycodebuffer.SpringBootStartup.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity

public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long departnmentId ;
	@NotBlank(message = " Please Add Department Name")
	private String departmentName;
	private String departmentAddress;
	private String departmentCode;
	@Override
	public String toString() {
		return "Department [departnmentId=" + departnmentId + ", departmentName=" + departmentName
				+ ", departmentAddress=" + departmentAddress + ", departmentCode=" + departmentCode + "]";
	}
	public long getDepartnmentId() {
		return departnmentId;
	}
	public Department() {
	}
	public Department(long departnmentId, String departmentName, String departmentAddress, String departmentCode) {
		super();
		this.departnmentId = departnmentId;
		this.departmentName = departmentName;
		this.departmentAddress = departmentAddress;
		this.departmentCode = departmentCode;
	}
	public void setDepartnmentId(long departnmentId) {
		this.departnmentId = departnmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentAddress() {
		return departmentAddress;
	}
	public void setDepartmentAddress(String departmentAddress) {
		this.departmentAddress = departmentAddress;
	}
	public String getDepartmentCode() {
		return departmentCode;
	}
	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}

}

