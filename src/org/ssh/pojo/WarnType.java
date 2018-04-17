package org.ssh.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class WarnType {//��ͬԤ������ warnType
	/*------>NO.15 ��ͬԤ������ warnType<-------
	wtid                int                   ��     ����
	wno                 varchar(20)    20           Ԥ�����ͱ��
	wname               varchar(20)    20           Ԥ����������
	wdesc               varchar(200)   200          Ԥ������˵��*/
	private Integer wtid;//����
	private String wno;//Ԥ�����ͱ��
	private String wname;// Ԥ����������
	private String wdesc;//   Ԥ������˵��
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
