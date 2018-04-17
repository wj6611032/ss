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
public class Employee {// 员工表
	private Integer eid;//主键
	private String eno;// 人员编号
	private String ename;// 人员姓名
	private Department department;// 所在部门
	private Position position;//  所在职位
	private String englishName;// 英文名
	private String nameUsedBefore;//曾用名
	private char sex;//性别
	private String idCard;//身份证号
	private Date borthday;// 出生日期
	private String native_e;// 籍贯
	private String nation;//民族
	private String politicalStatus;//政治面貌
	private String religiousBelief;//宗教信仰
	private String healthCondition;//健康状况
	private String maritalStatus;//婚姻状况
	private String wagesAccount;//工资账号
	private String socialSecurityNumbers;//社保账号
	private Date participateInTheWorktime;//参加工作时间
	private Date enterTheUnitofTime;//进入单位时间
	private String permanentResidence;//户口所在地
	private String education;//学历 和员工学历表有什么联系
	private JOB job;//职称
	private String officePhone;//办公电话
	private String homePhone;//住宅电话
	private String mobileTelephone;//移动电话
	private String homeAddress;//家庭住址
	private String contactAddress;//通讯地址
	private String zipCode;//邮政编号
	private String email;//这边用大写Email时 jsp用的是表达式${emp.Email}就出错了 不知道为什么
	private String workField;//现从事专业
	private String hobbies;//兴趣爱好
	private String empImg;// 相片
	private char status;//状态 1.在职2.不在职3.辞职（离职）4.辞职（离退）5.
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
	@JoinColumn(name="jid")//关系？
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
