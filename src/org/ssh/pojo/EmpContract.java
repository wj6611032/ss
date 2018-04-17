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

@Entity
@Table
public class EmpContract {//Ա����ͬά��
	/*------>NO.14 Ա����ͬά�� EmpContract<-------
	ecid                int                   ��     ����
	ecno                varchar(50)    50           ��ͬ���
	eid                 int                         Ա������
	eno                 varchar(20)    20           Ա�����
	cid                 int                         ��ͬ�ĵ�����
	createtime          datetime                    ǩ����ͬʱ��
	beginTime           datetime                    ��ͬ��ʼʱ��
	endTime             datetime                    ��ͬ��ֹʱ��
	status              char(1)        1            ��ͬ״̬
	dissolutionDesc     varchar(100)   100          ���ԭ��
	extendDesc          varchar(100)   100          ��ǩԭ��
	terminationDesc     varchar(100)   100          ��ֹԭ��*/
	
	private Integer ecid;//����
	private String ecno;//��ͬ���
	private Employee employee;//Ա������ Ա�����
	private Contract contract;//��ͬ�ĵ�����
	private Date createtime;//ǩ����ͬʱ��
	private Date beginTime;//��ͬ��ʼʱ��
	private Date endTime;//��ͬ��ֹʱ��
	private char status;//��ͬ״̬
	private String dissolutionDesc;//���ԭ��
	private String extendDesc;//��ǩԭ��
	private String terminationDesc;//��ֹԭ��
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getEcid() {
		return ecid;
	}
	public void setEcid(Integer ecid) {
		this.ecid = ecid;
	}
	public String getEcno() {
		return ecno;
	}
	public void setEcno(String ecno) {
		this.ecno = ecno;
	}
	
	@OneToOne
	@JoinColumn(name="eid")
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	@OneToOne//һ�ݺ�ͬ��һ��Ա��
	@JoinColumn(name="cid")
	public Contract getContract() {
		return contract;
	}
	public void setContract(Contract contract) {
		this.contract = contract;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
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
	public char getStatus() {
		return status;
	}
	public void setStatus(char status) {
		this.status = status;
	}
	public String getDissolutionDesc() {
		return dissolutionDesc;
	}
	public void setDissolutionDesc(String dissolutionDesc) {
		this.dissolutionDesc = dissolutionDesc;
	}
	public String getExtendDesc() {
		return extendDesc;
	}
	public void setExtendDesc(String extendDesc) {
		this.extendDesc = extendDesc;
	}
	public String getTerminationDesc() {
		return terminationDesc;
	}
	public void setTerminationDesc(String terminationDesc) {
		this.terminationDesc = terminationDesc;
	}
	

}
