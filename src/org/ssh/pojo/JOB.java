package org.ssh.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class JOB {
	/*------>NO.4 职务表 JOB<-------
	jid                 int                   √     主键
	jobno               varchar(30)    30           职务编号
	jobname             varchar(30)    30           职务名称
	jtid                int                         对应职务类型
	jobLevel            int                         职务等级*/
	
	private Integer jid;// 主键
	private String jobno;//职务编号
	private String jobname;//职务名称
	private JOBType jobType;//对应职务类型
	private Integer jobLevel;//职务等级  1-->>一级     1-->>二级     1-->>三级    1-->>四级  
	private Position position;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getJid() {
		return jid;
	}
	public void setJid(Integer jid) {
		this.jid = jid;
	}
	public String getJobno() {
		return jobno;
	}
	public void setJobno(String jobno) {
		this.jobno = jobno;
	}
	public String getJobname() {
		return jobname;
	}
	public void setJobname(String jobname) {
		this.jobname = jobname;
	}
	
	@ManyToOne
	@JoinColumn(name="jtid")
	public JOBType getJobType() {
		return jobType;
	}
	public void setJobType(JOBType jobType) {
		this.jobType = jobType;
	}
	
	public Integer getJobLevel() {
		return jobLevel;
	}
	
	public void setJobLevel(Integer jobLevel) {
		this.jobLevel = jobLevel;
	}
	
	@OneToOne
	@JoinColumn(name="pid")
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}

	
	

}
