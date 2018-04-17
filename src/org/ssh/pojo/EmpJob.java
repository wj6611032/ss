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
	/*------>NO.8 ����ְ��� empJob<-------
	ejid                int                   ��     ����
	eid                 int                         Ա�����
	beginTime           datetime                    ��ʼʱ��
	endTime             datetime                    ��ֹʱ��
	jobName             varchar(50)    50           ְ������
	jobLevel            varchar(50)    50           ְ�񼶱�
	compAndDept         varchar(50)    50           ��ְ��λ���䲿��
	desc                varchar(50)    50           ���ܻ���¹���*/
	
	private Integer ejid;//����
	private Employee employee;// Ա�����
	private Date beginTime;//��ʼʱ��
	private Date endTime;// ��ֹʱ��
	private JOB job;// ְ������  ְ������
	private CompanyInfo companyInfo;//��ְ��λ
	private Department department;//����
	private String desc_ej;//���ܻ���¹���
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getEjid() {
		return ejid;
	}
	public void setEjid(Integer ejid) {
		this.ejid = ejid;
	}
	@ManyToOne
	@JoinColumn(name="eid")//��ϵ��
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
