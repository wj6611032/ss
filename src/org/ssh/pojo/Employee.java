package org.ssh.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table
public class Employee {// Ա����
	private Integer eid;//����
	private String eno;// ��Ա���
	private String ename;// ��Ա����
	private Department department;// ���ڲ���
	private Position position;//  ����ְλ
	private String englishName;// Ӣ����
	private String nameUsedBefore;//������
	private char sex;//�Ա�
	private String idCard;//���֤��
	private Date borthday;// ��������
	private String native_e;// ����
	private String nation;//����
	private String politicalStatus;//������ò
	private String religiousBelief;//�ڽ�����
	private String healthCondition;//����״��
	private String maritalStatus;//����״��
	private String wagesAccount;//�����˺�
	private String socialSecurityNumbers;//�籣�˺�
	private Date participateInTheWorktime;//�μӹ���ʱ��
	private Date enterTheUnitofTime;//���뵥λʱ��
	private String permanentResidence;//�������ڵ�
	private String education;//ѧ�� ��Ա��ѧ������ʲô��ϵ
	private JOB job;//ְ��
	private String officePhone;//�칫�绰
	private String homePhone;//סլ�绰
	private String mobileTelephone;//�ƶ��绰
	private String homeAddress;//��ͥסַ
	private String contactAddress;//ͨѶ��ַ
	private String zipCode;//�������
	private String email;//����ô�дEmailʱ jsp�õ��Ǳ��ʽ${emp.Email}�ͳ����� ��֪��Ϊʲô
	private String workField;//�ִ���רҵ
	private String hobbies;//��Ȥ����
	private String empImg;// ��Ƭ
	private char status;//״̬ 1.��ְ2.����ְ3.��ְ����ְ��4.��ְ�����ˣ�5.
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getEno() {
		return eno;
	}
	public void setEno(String eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	@ManyToOne
	@JoinColumn(name="did")
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@ManyToOne
	@JoinColumn(name="pid")
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	public String getEnglishName() {
		return englishName;
	}
	public void setEnglishName(String englishName) {
		this.englishName = englishName;
	}
	public String getNameUsedBefore() {
		return nameUsedBefore;
	}
	public void setNameUsedBefore(String nameUsedBefore) {
		this.nameUsedBefore = nameUsedBefore;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	@DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	public Date getBorthday() {
		return borthday;
	}
	public void setBorthday(Date borthday) {
		this.borthday = borthday;
	}
	public String getNative_e() {
		return native_e;
	}
	public void setNative_e(String native_e) {
		this.native_e = native_e;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getPoliticalStatus() {
		return politicalStatus;
	}
	public void setPoliticalStatus(String politicalStatus) {
		this.politicalStatus = politicalStatus;
	}
	public String getReligiousBelief() {
		return religiousBelief;
	}
	public void setReligiousBelief(String religiousBelief) {
		this.religiousBelief = religiousBelief;
	}
	public String getHealthCondition() {
		return healthCondition;
	}
	public void setHealthCondition(String healthCondition) {
		this.healthCondition = healthCondition;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getWagesAccount() {
		return wagesAccount;
	}
	public void setWagesAccount(String wagesAccount) {
		this.wagesAccount = wagesAccount;
	}
	public String getSocialSecurityNumbers() {
		return socialSecurityNumbers;
	}
	public void setSocialSecurityNumbers(String socialSecurityNumbers) {
		this.socialSecurityNumbers = socialSecurityNumbers;
	}
	@DateTimeFormat(pattern="yyyy-MM-dd")
	public Date getParticipateInTheWorktime() {
		return participateInTheWorktime;
	}
	public void setParticipateInTheWorktime(Date participateInTheWorktime) {
		this.participateInTheWorktime = participateInTheWorktime;
	}
	@DateTimeFormat(pattern="yyyy-MM-dd")
	public Date getEnterTheUnitofTime() {
		return enterTheUnitofTime;
	}
	public void setEnterTheUnitofTime(Date enterTheUnitofTime) {
		this.enterTheUnitofTime = enterTheUnitofTime;
	}
	public String getPermanentResidence() {
		return permanentResidence;
	}
	public void setPermanentResidence(String permanentResidence) {
		this.permanentResidence = permanentResidence;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	@OneToOne
	@JoinColumn(name="jid")//��ϵ��
	public JOB getJob() {
		return job;
	}
	public void setJob(JOB job) {
		this.job = job;
	}
	public String getOfficePhone() {
		return officePhone;
	}
	public void setOfficePhone(String officePhone) {
		this.officePhone = officePhone;
	}
	public String getHomePhone() {
		return homePhone;
	}
	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}
	public String getMobileTelephone() {
		return mobileTelephone;
	}
	public void setMobileTelephone(String mobileTelephone) {
		this.mobileTelephone = mobileTelephone;
	}
	public String getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}
	public String getContactAddress() {
		return contactAddress;
	}
	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		email = email;
	}
	public String getWorkField() {
		return workField;
	}
	public void setWorkField(String workField) {
		this.workField = workField;
	}
	public String getHobbies() {
		return hobbies;
	}
	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}
	public String getEmpImg() {
		return empImg;
	}
	public void setEmpImg(String empImg) {
		this.empImg = empImg;
	}
	public char getStatus() {
		return status;
	}
	public void setStatus(char status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", eno=" + eno + ", ename=" + ename + ", department=" + department
				+ ", position=" + position + ", englishName=" + englishName + ", nameUsedBefore=" + nameUsedBefore
				+ ", sex=" + sex + ", idCard=" + idCard + ", borthday=" + borthday + ", native_e=" + native_e
				+ ", nation=" + nation + ", politicalStatus=" + politicalStatus + ", religiousBelief=" + religiousBelief
				+ ", healthCondition=" + healthCondition + ", maritalStatus=" + maritalStatus + ", wagesAccount="
				+ wagesAccount + ", socialSecurityNumbers=" + socialSecurityNumbers + ", participateInTheWorktime="
				+ participateInTheWorktime + ", enterTheUnitofTime=" + enterTheUnitofTime + ", permanentResidence="
				+ permanentResidence + ", education=" + education + ", job=" + job + ", officePhone=" + officePhone
				+ ", homePhone=" + homePhone + ", mobileTelephone=" + mobileTelephone + ", homeAddress=" + homeAddress
				+ ", contactAddress=" + contactAddress + ", zipCode=" + zipCode + ", email=" + email + ", workField="
				+ workField + ", hobbies=" + hobbies + ", empImg=" + empImg + ", status=" + status + "]";
	}
	
	
	
	
	
	
	
	

}
