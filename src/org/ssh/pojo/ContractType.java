package org.ssh.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class ContractType {//��ͬ����
	/*------>NO.12 ��ͬ���� contractType<-------
	ctid                int                   ��     ����
	ctNo                varchar(50)    50           ��ͬ���ͱ��
	ctName              varchar(50)    50           ��ͬ��������
	ctDesc              varchar(100)   100          ��ͬ����˵��*/
	
	private Integer ctid;//����
	private String ctNo;//��ͬ���ͱ��
	private String ctName;//��ͬ��������
	private String ctDesc;//��ͬ����˵��
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
