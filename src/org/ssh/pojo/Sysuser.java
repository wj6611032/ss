package org.ssh.pojo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Sysuser {
	/*------>NO.18 ϵͳ�û��� sysuser<-------
	uid                 int                   ��     ����
	username            varchar(20@)    20           �û���
	password            varchar(20)    20           �û�����
	status              char(1)        1            ״̬
	desc                varchar(100)   100          ��ע
	eid                 int                         ��ӦԱ��*/
	private Integer uid;//����
	private String username;//�û���
	private String password;//�û�����
	private char status;//״̬
	private String desc_sy;//��ע
	private Employee employee;// ��ӦԱ��
	private Set<Roles> roles=new HashSet<>();//�û���ɫ���Զ��ϵ
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public char getStatus() {
		return status;
	}
	public void setStatus(char status) {
		this.status = status;
	}
	
	public String getDesc_sy() {
		return desc_sy;
	}
	public void setDesc_sy(String desc_sy) {
		this.desc_sy = desc_sy;
	}
	@OneToOne
	@JoinColumn(name="eid")
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	@ManyToMany
	//@JoinColumn(name="rid")
	public Set<Roles> getRoles() {
		return roles;
	}
	public void setRoles(Set<Roles> roles) {
		this.roles = roles;
	}

}
