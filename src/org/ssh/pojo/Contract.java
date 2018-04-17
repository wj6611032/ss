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
public class Contract {//��ͬ�ĵ�
	/*------>NO.13 ��ͬ�ĵ� contract<-------
	cid                 int                   ��     ����
	cno                 varchar(20)    20           ��ͬ�ļ����
	cname               varchar(50)    50           ��ͬ�ļ�����
	ctid                int                         ������ͬ����
	cpath               varchar(100)   100          ��ͬ�ļ�ģ��·����
	cdesc               varchar(200)   200          ��ͬ�ļ�˵��*/
	private Integer cid;//����
	private String cno;//��ͬ�ļ����
	private String cname;//��ͬ�ļ�����
	private ContractType contractType;//������ͬ����
	private String cpath;//��ͬ�ļ�ģ��·����
	private String cdesc;// ��ͬ�ļ�˵��
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
