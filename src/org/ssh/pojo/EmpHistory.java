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
public class EmpHistory {//������ʷ��¼ 
	
	private Integer hid;//����
	private Employee employee;//Ա�����
	private Date changeTime;//����ʱ��
	private String changeDesc;// ����ԭ��
	private String type;//��������
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getHid() {
		return hid;
	}
	public void setHid(Integer hid) {
		this.hid = hid;
	}
	@ManyToOne
	@JoinColumn(name="eid")//һ��Ա�������м���������¼
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Date getChangeTime() {
		return changeTime;
	}
	public void setChangeTime(Date changeTime) {
		this.changeTime = changeTime;
	}
	public String getChangeDesc() {
		return changeDesc;
	}
	public void setChangeDesc(String changeDesc) {
		this.changeDesc = changeDesc;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	

}
