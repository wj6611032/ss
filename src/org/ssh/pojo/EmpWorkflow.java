package org.ssh.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class EmpWorkflow {
/*	------>NO.9 工作经历表 empWorkflow<-------
	ewid                int                   √     主键
	eid                 int                         员工外键
	beginTime           datetime                    起始时间
	endTime             datetime                    终止时间
	compAndDept         varchar(50)    50           所在单位及其部门
	job                 varchar(50)    50           职务
	desc                varchar(50)    50           从事工作
	authenticator       varchar(50)    50           证明人*/
	
	private Integer ewid;//主键
	private Employee employee;//员工外键
	private Date beginTime;// 起始时间
	private Date endTime;//终止时间
	private String compAndDept;// 所在单位及其部门
	private JOB job;//职务
	private String desc_ew;// 从事工作
	private String authenticator;//证明人
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getEwid() {
		return ewid;
	}
	public void setEwid(Integer ewid) {
		this.ewid = ewid;
	}
	@ManyToOne
	@JoinColumn(name="eid")
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Date getBeginTime() {
		return beginTime;
	}
	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public String getCompAndDept() {
		return compAndDept;
	}
	public void setCompAndDept(String compAndDept) {
		this.compAndDept = compAndDept;
	}
	@ManyToOne
	@JoinColumn(name="jid")
	public JOB getJob() {
		return job;
	}
	public void setJob(JOB job) {
		this.job = job;
	}
	
	public String getDesc_ew() {
		return desc_ew;
	}
	public void setDesc_ew(String desc_ew) {
		this.desc_ew = desc_ew;
	}
	public String getAuthenticator() {
		return authenticator;
	}
	public void setAuthenticator(String authenticator) {
		this.authenticator = authenticator;
	}
	
	
	

}
