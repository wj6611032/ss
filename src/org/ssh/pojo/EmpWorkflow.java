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
/*	------>NO.9 ���������� empWorkflow<-------
	ewid                int                   ��     ����
	eid                 int                         Ա�����
	beginTime           datetime                    ��ʼʱ��
	endTime             datetime                    ��ֹʱ��
	compAndDept         varchar(50)    50           ���ڵ�λ���䲿��
	job                 varchar(50)    50           ְ��
	desc                varchar(50)    50           ���¹���
	authenticator       varchar(50)    50           ֤����*/
	
	private Integer ewid;//����
	private Employee employee;//Ա�����
	private Date beginTime;// ��ʼʱ��
	private Date endTime;//��ֹʱ��
	private String compAndDept;// ���ڵ�λ���䲿��
	private JOB job;//ְ��
	private String desc_ew;// ���¹���
	private String authenticator;//֤����
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
