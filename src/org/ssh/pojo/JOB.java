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
	/*------>NO.4 ְ��� JOB<-------
	jid                 int                   ��     ����
	jobno               varchar(30)    30           ְ����
	jobname             varchar(30)    30           ְ������
	jtid                int                         ��Ӧְ������
	jobLevel            int                         ְ��ȼ�*/
	
	private Integer jid;// ����
	private String jobno;//ְ����
	private String jobname;//ְ������
	private JOBType jobType;//��Ӧְ������
	private Integer jobLevel;//ְ��ȼ�  1-->>һ��     1-->>����     1-->>����    1-->>�ļ�  
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
