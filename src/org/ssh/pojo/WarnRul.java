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
public class WarnRul {//��ͬԤ������ WarnRule
	/*------>NO.16 ��ͬԤ������ WarnRule<-------
	wrid                int                   ��     ����
	wrname              varchar(20)    20           Ԥ����������
	wtid                int                         Ԥ������
	wdateNumber         int                         Ԥ����ǰ����
	depts               varchar(100)   100          Ӧ����֯��Χ
	compareColumn       varchar(20)    20           ��ȵ������ֶ���
	maxDay              int                         ���������������
	estatus             char(1)        1            Ա��״̬
	cstatus             char(1)        1            ��ͬ״̬
	uid                 int                         �ռ���*/
	
	private Integer wrid;//����
	private String wrname;//Ԥ����������
	private WarnType warnType;//Ԥ������
	private Integer wadateNumber;//Ԥ����ǰ����
	private String depts;// Ӧ����֯��Χ
	private String compareColumn;// ��ȵ������ֶ���
	private Integer maxDay;//���������������
	private char estatus;//Ա��״̬
	private char cstatus;//��ͬ״̬
	private Sysuser sysuser;//�ռ���
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
