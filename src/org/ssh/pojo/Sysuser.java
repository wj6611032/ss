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
	/*------>NO.18 系统用户表 sysuser<-------
	uid                 int                   √     主键
	username            varchar(20@)    20           用户名
	password            varchar(20)    20           用户密码
	status              char(1)        1            状态
	desc                varchar(100)   100          备注
	eid                 int                         对应员工*/
	private Integer uid;//主键
	private String username;//用户名
	private String password;//用户密码
	private char status;//状态
	private String desc_sy;//备注
	private Employee employee;// 对应员工
	private Set<Roles> roles=new HashSet<>();//用户角色表多对多关系
	
	
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
