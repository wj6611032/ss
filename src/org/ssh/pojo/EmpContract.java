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
public class EmpContract {//员工合同维护
	/*------>NO.14 员工合同维护 EmpContract<-------
	ecid                int                   √     主键
	ecno                varchar(50)    50           合同编号
	eid                 int                         员工主键
	eno                 varchar(20)    20           员工编号
	cid                 int                         合同文档主键
	createtime          datetime                    签订合同时间
	beginTime           datetime                    合同开始时间
	endTime             datetime                    合同终止时间
	status              char(1)        1            合同状态
	dissolutionDesc     varchar(100)   100          解除原因
	extendDesc          varchar(100)   100          续签原因
	terminationDesc     varchar(100)   100          终止原因*/
	
	private Integer ecid;//主键
	private String ecno;//合同编号
	private Employee employee;//员工主键 员工编号
	private Contract contract;//合同文档主键
	private Date createtime;//签订合同时间
	private Date beginTime;//合同开始时间
	private Date endTime;//合同终止时间
	private char status;//合同状态
	private String dissolutionDesc;//解除原因
	private String extendDesc;//续签原因
	private String terminationDesc;//终止原因
	
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
	@OneToOne//一份合同对一个员工
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
