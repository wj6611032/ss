package org.ssh.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class WarnType {//合同预警类型 warnType
	/*------>NO.15 合同预警类型 warnType<-------
	wtid                int                   √     主键
	wno                 varchar(20)    20           预警类型编号
	wname               varchar(20)    20           预警类型名称
	wdesc               varchar(200)   200          预警类型说明*/
	private Integer wtid;//主键
	private String wno;//预警类型编号
	private String wname;// 预警类型名称
	private String wdesc;//   预警类型说明
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getWtid() {
		return wtid;
	}
	public void setWtid(Integer wtid) {
		this.wtid = wtid;
	}
	public String getWno() {
		return wno;
	}
	public void setWno(String wno) {
		this.wno = wno;
	}
	public String getWname() {
		return wname;
	}
	public void setWname(String wname) {
		this.wname = wname;
	}
	public String getWdesc() {
		return wdesc;
	}
	public void setWdesc(String wdesc) {
		this.wdesc = wdesc;
	}
	

}
