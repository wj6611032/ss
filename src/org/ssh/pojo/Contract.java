package org.ssh.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Contract {//合同文档
	/*------>NO.13 合同文档 contract<-------
	cid                 int                   √     主键
	cno                 varchar(20)    20           合同文件编号
	cname               varchar(50)    50           合同文件名称
	ctid                int                         所属合同类型
	cpath               varchar(100)   100          合同文件模块路劲名
	cdesc               varchar(200)   200          合同文件说明*/
	private Integer cid;//主键
	private String cno;//合同文件编号
	private String cname;//合同文件名称
	private ContractType contractType;//所属合同类型
	private String cpath;//合同文件模块路劲名
	private String cdesc;// 合同文件说明
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCno() {
		return cno;
	}
	public void setCno(String cno) {
		this.cno = cno;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	@ManyToOne
	@JoinColumn(name="ctid")
	public ContractType getContractType() {
		return contractType;
	}
	public void setContractType(ContractType contractType) {
		this.contractType = contractType;
	}
	public String getCpath() {
		return cpath;
	}
	public void setCpath(String cpath) {
		this.cpath = cpath;
	}
	public String getCdesc() {
		return cdesc;
	}
	public void setCdesc(String cdesc) {
		this.cdesc = cdesc;
	}
	
	

}
