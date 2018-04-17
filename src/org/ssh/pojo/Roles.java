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
public class Roles {//��ɫ��
	/*------>NO.20 ��ɫ�� roles<-------
	rid                 int                   ��     ����
	rname               varchar(20)    20           ��ɫ��
	rdesc               varchar(50)    50           ��ɫ����*/
	private Integer rid;//����
	private String rname;// ��ɫ��
	private String edesc;//��ɫ����
	private Set<Sysuser> sysuser=new HashSet<>();//��Զ��ϵ
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
