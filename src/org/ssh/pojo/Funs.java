package org.ssh.pojo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Funs {//ϵͳ���ܵ� Funs
	/*------>NO.21 ϵͳ���ܵ� Funs<-------
	fid                 int                   ��     ����
	fname               varchar(20)    20           ���ܵ���
	fdesc               varchar(50)    50           ���ܵ�����
	furl                varchar(100)   100          ��Ӧurl
*/
	private Integer fid;//����
	private String fname;//���ܵ���
	private String fdesc;//���ܵ�����
	private String furl;//��Ӧurl
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getFid() {
		return fid;
	}
	public void setFid(Integer fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getFdesc() {
		return fdesc;
	}
	public void setFdesc(String fdesc) {
		this.fdesc = fdesc;
	}
	public String getFurl() {
		return furl;
	}
	public void setFurl(String furl) {
		this.furl = furl;
	}
	
}
