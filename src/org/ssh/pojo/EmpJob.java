package org.ssh.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table 
public class EmpJob {
	/*------>NO.8 行政职务表 empJob<-------
	ejid                int                   √     主键
	eid                 int                         员工外键
	beginTime           datetime                    起始时间
	endTime             datetime                    终止时间
	jobName             varchar(50)    50           职务名称
	jobLevel            varchar(50)    50           职务级别
	compAndDept         varchar(50)    50           任职单位极其部门
	desc                varchar(50)    50           主管或从事工作*/
	
	private Integer ejid;//主键
	private Employee employee;// 员工外键
	private Date beginTime;//起始时间
	private Date endTime;// 终止时间
	private JOB job;// 职务名称  职务名称
	private CompanyInfo companyInfo;//任职单位
	private Department department;//部门
	private String desc_ej;//主管或从事工作
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getEjid() {
		return ejid;
	}
	public void setEjid(Integer ejid) {
		this.ejid = ejid;
	}
	@ManyToOne
	@JoinColumn(name="eid")//关系？
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	@DateTimeFormat(pattern="yyyy-MM-dd")
	public Date getBeginTime() {
		return beginTime;
	}
	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}
	//@DateTimeFormat(pattern="yyyy-MM-dd")
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	@OneToOne
	@JoinColumn(name="jid")
	public JOB getJob() {
		return job;
	}
	public void setJob(JOB job) {
		this.job = job;
	}
	@ManyToOne
	@JoinColumn(name="cid")
	public CompanyInfo getCompanyInfo() {
		return companyInfo;
	}
	public void setCompanyInfo(CompanyInfo companyInfo) {
		this.companyInfo = companyInfo;
	}
	@ManyToOne
	@JoinColumn(name="did")
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public String getDesc_ej() {
		return desc_ej;
	}
	public void setDesc_ej(String desc_ej) {
		this.desc_ej = desc_ej;
	}
	
	
	
	
	
}
