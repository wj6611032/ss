package org.ssh.pojo;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
/*
@Entity
@Table*/
public class Role_funs {//角色功能点role_funs
	/*------>NO.22 角色功能点 role_funs<-------
	rid                 int                   √     角色id
	fid                 int                   √     功能点id*/
	private Roles roles;//角色id
	private Funs funs;// 功能点id
	@OneToOne//?????????
	@JoinColumn(name="rid")
	public Roles getRoles() {
		return roles;
	}
	public void setRoles(Roles roles) {
		this.roles = roles;
	}
	@OneToOne//?????????
	@JoinColumn(name="fid")
	public Funs getFuns() {
		return funs;
	}
	public void setFuns(Funs funs) {
		this.funs = funs;
	}
	
}
