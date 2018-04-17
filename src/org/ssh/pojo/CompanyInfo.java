package org.ssh.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class CompanyInfo {//��λ��Ϣ��
	private Integer cid;//����
	private String compName;//��λ����
	private String  artificialPerson;//���˴���
	private String compLeader;//��λ������
	private Integer compType;//������ҵ  1,2,3,4,5
	private Integer economyType;//��������1��̨Ͷ�ʾ���2����Ͷ�ʾ���3���о���
	private String compAddress;//��λ��ַ
	private String compNO;//��������
	private String compURL;//��λ��ַ
	
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
	private String compEmail;//��������
	private String compTel;//��λ�绰
	private String compFax;//��λ����
	private Date createTime;//��λ����ʱ��
	private String compDesc;//��λ���
	

}
