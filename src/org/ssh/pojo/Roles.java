package org.ssh.pojo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table
public class Roles {//角色表
	/*------>NO.20 角色表 roles<-------
	rid                 int                   √     主键
	rname               varchar(20)    20           角色名
	rdesc               varchar(50)    50           角色描述*/
	private Integer rid;//主键
	private String rname;// 角色名
	private String edesc;//角色描述
	private Set<Sysuser> sysuser=new HashSet<>();//多对多关系
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getRid() {
		return rid;
	}
	public void setRid(Integer rid) {
		this.rid = rid;
	}
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	public String getEdesc() {
		return edesc;
	}
	public void setEdesc(String edesc) {
		this.edesc = edesc;
	}
	@ManyToMany(mappedBy = "roles")
	//@JoinColumn(name="uid")
	public Set<Sysuser> getSysuser() {
		return sysuser;
	}
	public void setSysuser(Set<Sysuser> sysuser) {
		this.sysuser = sysuser;
	}
	

}
