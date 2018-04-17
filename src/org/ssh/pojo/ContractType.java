package org.ssh.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class ContractType {//合同类型
	/*------>NO.12 合同类型 contractType<-------
	ctid                int                   √     主键
	ctNo                varchar(50)    50           合同类型编号
	ctName              varchar(50)    50           合同类型名称
	ctDesc              varchar(100)   100          合同类型说明*/
	
	private Integer ctid;//主键
	private String ctNo;//合同类型编号
	private String ctName;//合同类型名称
	private String ctDesc;//合同类型说明
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getCtid() {
		return ctid;
	}
	public void setCtid(Integer ctid) {
		this.ctid = ctid;
	}
	public String getCtNo() {
		return ctNo;
	}
	public void setCtNo(String ctNo) {
		this.ctNo = ctNo;
	}
	public String getCtName() {
		return ctName;
	}
	public void setCtName(String ctName) {
		this.ctName = ctName;
	}
	public String getCtDesc() {
		return ctDesc;
	}
	public void setCtDesc(String ctDesc) {
		this.ctDesc = ctDesc;
	}
	

}
