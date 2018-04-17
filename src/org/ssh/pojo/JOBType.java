package org.ssh.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class JOBType {//职务类型表
	
	private Integer jtid;//主键
	private String  jtno;// 职务类型编号
	private String  jtname;//职务类型名称
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getJtid() {
		return jtid;
	}
	public void setJtid(Integer jtid) {
		this.jtid = jtid;
	}
	public String getJtno() {
		return jtno;
	}
	public void setJtno(String jtno) {
		this.jtno = jtno;
	}
	public String getJtname() {
		return jtname;
	}
	public void setJtname(String jtname) {
		this.jtname = jtname;
	}
	
	


}
