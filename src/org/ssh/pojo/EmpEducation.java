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
	/*------>NO.7 Ա��ѧ���� empEducation<-------
	eid                 int                         Ա�����
	education           int                         ѧ��
	eduType             varchar(100)   100          ѧ�����
	eduMajor            varchar(100)   100          ��ѧרҵ
	eudWay              varchar(100)   100          ѧϰ��ʽ
	beginTime           datetime                    ��ѧʱ��
	endTime             datetime                    ��ҵʱ��
	eduDesc             varchar(100)   100          ѧ��ע��
	eduSchool           varchar(100)   100          ��ҵѧУ���䵥λ
	degree              varchar(100)   100          ѧλ
	degreeConferringUnit  varchar(100)   100          ѧλ���赥λ*/
	
	private Integer edid;//����
	private Employee employee;// Ա�����
    private Integer education;//ѧ��
    private String eduType;//ѧ�����
    private String eduMajor;//��ѧרҵ
    private String eduWay;//ѧϰ��ʽ
    private Date beginTime;//��ѧʱ��
    private Date endTime;//��ҵʱ��
    private String eduDesc;//ѧ��ע��
    private String eduSchool;//��ҵѧУ���䵥λ
    private String  degree;//ѧλ
    private String degreeConferringUnit;//ѧλ���赥λ
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getEdid() {
		return edid;
	}
	public void setEdid(Integer edid) {
		this.edid = edid;
	}
	@OneToOne
	@JoinColumn(name="eid")//һ��Ա��ֻ��һ��ѧ��
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
