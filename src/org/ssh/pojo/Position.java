package org.ssh.pojo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table
public class Position {
	/*------>NO.5 ְλ�� position<-------
	pid                 int                   ��     ����
	pno                 varchar(30)    30           ְλ���
	pname               varchar(30)    30           ְλ����
	jid                 int                         ��Ӧְ��
	did                 int                         ��������
	limitNum            int                         ��������
	desc                varchar(300)   300          ְλ˵��
*/
	private Integer pid;//����
	private String  pno;//ְλ���
	private String pname;// ְλ����
	private JOB job;
	private Department department;// ��������
	private Integer limitNum;// ��������
	private String desc_po;//ְλ˵��
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPno() {
		return pno;
	}
	public void setPno(String pno) {
		this.pno = pno;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	
   /* @OneToMany
	//@JoinColumn(name="jid")
	public Set<JOB> getJobs() {//һ�Զ࣬���һ˫���ϵ�Ļ�����ʱ��һ�Զ����������ά����ϵ�����������һ�Զ��ά����ϵ��
	
	//�Ǹ����û���ˣ�������ͨ�����һ��ϵ����ά����ϵ�����ҿ���ͨ������һ�����Ŷ��󣬲鿴�����µ�����Ա��
		
		
	}
	public void setJobs(Set<JOB> jobs) {
		this.jobs = jobs;
	}*/
	
	@OneToOne(mappedBy="position",fetch=FetchType.LAZY)
	//������ά����ϵ һ��һ˫���ϵ ����ң��Ҳ��㣬��������ѭ�����ȼӸ������أ�������
	//��ʱ�ڲ飬���ڷ��͸�ǰ̨json��ʽʱ��Ҫ��ʾȫ���������ֳ�������ѭ�� ��ʱ��Ҫ��������һ��ĳ������ʱ�������Ա����Ҳ��鵽����ʱ��json��ʽ�ķ�������
	
	
	@JsonIgnore//��������
	public JOB getJob() {
		return job;
	}
	public void setJob(JOB job) {
		this.job = job;
	}
    
	@OneToOne
	@JoinColumn(name="did")
	public Department getDepartment() {
		return department;
	}
	
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Integer getLimitNum() {
		return limitNum;
	}
	public void setLimitNum(Integer limitNum) {
		this.limitNum = limitNum;
	}
	public String getDesc_po() {
		return desc_po;
	}
	public void setDesc_po(String desc_po) {
		this.desc_po = desc_po;
	}
	
	
	
}
