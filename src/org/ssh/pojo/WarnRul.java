package org.ssh.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table
@Entity
public class WarnRul {//合同预警规则 WarnRule
	/*------>NO.16 合同预警规则 WarnRule<-------
	wrid                int                   √     主键
	wrname              varchar(20)    20           预警规则名称
	wtid                int                         预警类型
	wdateNumber         int                         预警提前天数
	depts               varchar(100)   100          应用组织范围
	compareColumn       varchar(20)    20           相比的日期字段名
	maxDay              int                         截至间隔最大的天数
	estatus             char(1)        1            员工状态
	cstatus             char(1)        1            合同状态
	uid                 int                         收件人*/
	
	private Integer wrid;//主键
	private String wrname;//预警规则名称
	private WarnType warnType;//预警类型
	private Integer wadateNumber;//预警提前天数
	private String depts;// 应用组织范围
	private String compareColumn;// 相比的日期字段名
	private Integer maxDay;//截至间隔最大的天数
	private char estatus;//员工状态
	private char cstatus;//合同状态
	private Sysuser sysuser;//收件人
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getWrid() {
		return wrid;
	}
	public void setWrid(Integer wrid) {
		this.wrid = wrid;
	}
	public String getWrname() {
		return wrname;
	}
	public void setWrname(String wrname) {
		this.wrname = wrname;
	}
	@ManyToOne
	@JoinColumn(name="wtid")
	public WarnType getWarnType() {
		return warnType;
	}
	public void setWarnType(WarnType warnType) {
		this.warnType = warnType;
	}
	public Integer getWadateNumber() {
		return wadateNumber;
	}
	public void setWadateNumber(Integer wadateNumber) {
		this.wadateNumber = wadateNumber;
	}
	public String getCompareColumn() {
		return compareColumn;
	}
	public void setCompareColumn(String compareColumn) {
		this.compareColumn = compareColumn;
	}
	public Integer getMaxDay() {
		return maxDay;
	}
	public void setMaxDay(Integer maxDay) {
		this.maxDay = maxDay;
	}
	public char getEstatus() {
		return estatus;
	}
	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}
	public char getCstatus() {
		return cstatus;
	}
	public void setCstatus(char cstatus) {
		this.cstatus = cstatus;
	}
	@ManyToOne
	@JoinColumn(name="uid")
	public Sysuser getSysuser() {
		return sysuser;
	}
	public void setSysuser(Sysuser sysuser) {
		this.sysuser = sysuser;
	}
	

}
