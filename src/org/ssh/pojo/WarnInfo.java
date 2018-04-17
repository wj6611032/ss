package org.ssh.pojo;

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
public class WarnInfo {//合同预警信息 warnInfo
	/*------>NO.17 合同预警信息 warnInfo<-------
	id                  int                   √     主键
	eno                 varchar(50)    50           员工编号
	ename               varchar(50)    50           员工姓名
	dname               varchar(50)    50           所在部门
	position            varchar(50)    50           所在职位
	warnInfo            varchar(100)   100          预警信息
	status              char(1)        1            状态
	uid                 int                         收件人*/

	private Integer id;//主键
	private Employee employee;//员工编号, 员工姓名
	private Department department;//所在部门
	private Position position;//所在职位
	private String warnInfo;//   预警信息
	private char status;//   状态
	private Sysuser sysuser;//收件人
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@OneToOne
	@JoinColumn(name="eid")//一个员工只能有一个报警信息
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	@ManyToOne
	@JoinColumn(name="did")//一个部门下面可能有好多报警信息啊
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@OneToOne
	@JoinColumn(name="pid")
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	public String getWarnInfo() {
		return warnInfo;
	}
	public void setWarnInfo(String warnInfo) {
		this.warnInfo = warnInfo;
	}
	public char getStatus() {
		return status;
	}
	public void setStatus(char status) {
		this.status = status;
	}
	@ManyToOne
	@JoinColumn(name="uid")
	public Sysuser getSysuser() {
		return sysuser;
	}
	public void setSysuser(Sysuser sysuser) {
		this.sysuser = sysuser;
	}
	
	
}
