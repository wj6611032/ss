package org.ssh.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class CompanyInfo {//单位信息表
	private Integer cid;//主键
	private String compName;//单位名称
	private String  artificialPerson;//法人代表
	private String compLeader;//单位负责人
	private Integer compType;//所属行业  1,2,3,4,5
	private Integer economyType;//经济类型1港台投资经济2外商投资经济3国有经济
	private String compAddress;//单位地址
	private String compNO;//邮政编码
	private String compURL;//单位网址
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCompName() {
		return compName;
	}
	public void setCompName(String compName) {
		this.compName = compName;
	}
	public String getArtificialPerson() {
		return artificialPerson;
	}
	public void setArtificialPerson(String artificialPerson) {
		this.artificialPerson = artificialPerson;
	}
	public String getCompLeader() {
		return compLeader;
	}
	public void setCompLeader(String compLeader) {
		this.compLeader = compLeader;
	}
	public Integer getCompType() {
		return compType;
	}
	public void setCompType(Integer compType) {
		this.compType = compType;
	}
	public Integer getEconomyType() {
		return economyType;
	}
	public void setEconomyType(Integer economyType) {
		this.economyType = economyType;
	}
	public String getCompAddress() {
		return compAddress;
	}
	public void setCompAddress(String compAddress) {
		this.compAddress = compAddress;
	}
	public String getCompNO() {
		return compNO;
	}
	public void setCompNO(String compNO) {
		this.compNO = compNO;
	}
	public String getCompURL() {
		return compURL;
	}
	public void setCompURL(String compURL) {
		this.compURL = compURL;
	}
	public String getCompEmail() {
		return compEmail;
	}
	public void setCompEmail(String compEmail) {
		this.compEmail = compEmail;
	}
	public String getCompTel() {
		return compTel;
	}
	public void setCompTel(String compTel) {
		this.compTel = compTel;
	}
	public String getCompFax() {
		return compFax;
	}
	public void setCompFax(String compFax) {
		this.compFax = compFax;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getCompDesc() {
		return compDesc;
	}
	public void setCompDesc(String compDesc) {
		this.compDesc = compDesc;
	}
	private String compEmail;//电子邮箱
	private String compTel;//单位电话
	private String compFax;//单位传真
	private Date createTime;//单位成立时间
	private String compDesc;//单位简介
	

}
