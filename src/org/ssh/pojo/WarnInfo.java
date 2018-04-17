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
public class WarnInfo {//��ͬԤ����Ϣ warnInfo
	/*------>NO.17 ��ͬԤ����Ϣ warnInfo<-------
	id                  int                   ��     ����
	eno                 varchar(50)    50           Ա�����
	ename               varchar(50)    50           Ա������
	dname               varchar(50)    50           ���ڲ���
	position            varchar(50)    50           ����ְλ
	warnInfo            varchar(100)   100          Ԥ����Ϣ
	status              char(1)        1            ״̬
	uid                 int                         �ռ���*/

	private Integer id;//����
	private Employee employee;//Ա�����, Ա������
	private Department department;//���ڲ���
	private Position position;//����ְλ
	private String warnInfo;//   Ԥ����Ϣ
	private char status;//   ״̬
	private Sysuser sysuser;//�ռ���
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@OneToOne
	@JoinColumn(name="eid")//һ��Ա��ֻ����һ��������Ϣ
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	@ManyToOne
	@JoinColumn(name="did")//һ��������������кö౨����Ϣ��
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
