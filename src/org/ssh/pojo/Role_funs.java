package org.ssh.pojo;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
/*
@Entity
@Table*/
public class Role_funs {//��ɫ���ܵ�role_funs
	/*------>NO.22 ��ɫ���ܵ� role_funs<-------
	rid                 int                   ��     ��ɫid
	fid                 int                   ��     ���ܵ�id*/
	private Roles roles;//��ɫid
	private Funs funs;// ���ܵ�id
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
