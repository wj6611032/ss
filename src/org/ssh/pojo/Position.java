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
	/*------>NO.5 职位表 position<-------
	pid                 int                   √     主键
	pno                 varchar(30)    30           职位编号
	pname               varchar(30)    30           职位名称
	jid                 int                         对应职务
	did                 int                         所属部门
	limitNum            int                         编制人数
	desc                varchar(300)   300          职位说明
*/
	private Integer pid;//主键
	private String  pno;//职位编号
	private String pname;// 职位名称
	private JOB job;
	private Department department;// 所属部门
	private Integer limitNum;// 编制人数
	private String desc_po;//职位说明
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
	public Set<JOB> getJobs() {//一对多，多对一双向关系的话，这时会一对多会多出个表来维护关系，如果放弃了一对多的维护关系，
	
	//那个表就没有了，但可以通过多对一关系，来维护关系，查找可以通过查找一个部门对象，查看部门下的所有员工
		
		
	}
	public void setJobs(Set<JOB> jobs) {
		this.jobs = jobs;
	}*/
	
	@OneToOne(mappedBy="position",fetch=FetchType.LAZY)
	//放弃了维护关系 一对一双向关系 你查我，我查你，这样会死循环，先加个懒加载，这样会
	//用时在查，但在发送给前台json格式时会要显示全部，这样又出现了死循环 这时需要放弃查找一个某个部门时，下面的员工会也会查到，这时需json格式的放弃查找
	
	
	@JsonIgnore//放弃查找
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
