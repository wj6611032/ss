package org.ssh.pojo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Funs {//系统功能点 Funs
	/*------>NO.21 系统功能点 Funs<-------
	fid                 int                   √     主键
	fname               varchar(20)    20           功能点名
	fdesc               varchar(50)    50           功能点描述
	furl                varchar(100)   100          对应url
*/
	private Integer fid;//主键
	private String fname;//功能点名
	private String fdesc;//功能点描述
	private String furl;//对应url
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
