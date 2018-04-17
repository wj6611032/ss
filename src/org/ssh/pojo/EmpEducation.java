package org.ssh.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table
public class EmpEducation {
	/*------>NO.7 员工学历表 empEducation<-------
	eid                 int                         员工外键
	education           int                         学历
	eduType             varchar(100)   100          学历类别
	eduMajor            varchar(100)   100          所学专业
	eudWay              varchar(100)   100          学习形式
	beginTime           datetime                    入学时间
	endTime             datetime                    毕业时间
	eduDesc             varchar(100)   100          学历注释
	eduSchool           varchar(100)   100          毕业学校及其单位
	degree              varchar(100)   100          学位
	degreeConferringUnit  varchar(100)   100          学位授予单位*/
	
	private Integer edid;//主键
	private Employee employee;// 员工外键
    private Integer education;//学历
    private String eduType;//学历类别
    private String eduMajor;//所学专业
    private String eduWay;//学习形式
    private Date beginTime;//入学时间
    private Date endTime;//毕业时间
    private String eduDesc;//学历注释
    private String eduSchool;//毕业学校及其单位
    private String  degree;//学位
    private String degreeConferringUnit;//学位授予单位
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getEdid() {
		return edid;
	}
	public void setEdid(Integer edid) {
		this.edid = edid;
	}
	@OneToOne
	@JoinColumn(name="eid")//一个员工只有一个学历
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Integer getEducation() {
		return education;
	}
	public void setEducation(Integer education) {
		this.education = education;
	}
	public String getEduType() {
		return eduType;
	}
	public void setEduType(String eduType) {
		this.eduType = eduType;
	}
	public String getEduMajor() {
		return eduMajor;
	}
	public void setEduMajor(String eduMajor) {
		this.eduMajor = eduMajor;
	}
	public String getEduWay() {
		return eduWay;
	}
	public void setEduWay(String eduWay) {
		this.eduWay = eduWay;
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
	public String getEduDesc() {
		return eduDesc;
	}
	public void setEduDesc(String eduDesc) {
		this.eduDesc = eduDesc;
	}
	public String getEduSchool() {
		return eduSchool;
	}
	public void setEduSchool(String eduSchool) {
		this.eduSchool = eduSchool;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getDegreeConferringUnit() {
		return degreeConferringUnit;
	}
	public void setDegreeConferringUnit(String degreeConferringUnit) {
		this.degreeConferringUnit = degreeConferringUnit;
	}
    
    
    

}
