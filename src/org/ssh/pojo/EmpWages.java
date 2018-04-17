package org.ssh.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.sun.beans.editors.FloatEditor;

@Entity
@Table
public class EmpWages {//工资表 empWages
	
	private Integer wid;//主键
	private Employee employee;// 员工外键
	private Date wtime;// 发放时间
	private float shouldWages;//应发合计
	private float realWages;//实发合计
	private float titleWages;//职称工资
	private float jobWage;//职务工资
	private float positionWages;//岗位工资
	private float levelWages;//级别工资
	private float baseWages;//基础工资
	private float workersPpostAllowance;//工人岗位津贴
	private float seniorityPay;//工龄工资
	private float bonus;//奖金
	private float allowance;//津贴
	private float timeWages;//计时工资
	private float pieceWages;//计件工资
	private float foodAllowance;//伙食补贴
	private float overtimePay;//加班工资
	private float otherWages;//其他工资
	private float areaOfAdditionalAllowance;// 地区附加津贴
	private float shouldDeductWages;// 应扣工资
	private float taxBase;//缴税基数
	private float individualIncomeTax;//个人所得税
	private float housingFund;// 住房公积金
	private float pendsionInsurance;//养老保险
	private float endOfMonth;//月末零扣
	private float nnlyFee;//独子费
	private float housingSubsidy;//住房补贴
	private float consumptionSubsidies;//消费补贴
	private float remotewAreasAllowance;// 边远艰苦地区津贴
	private float yearendBonus;// 年终奖
	private float medicalInsurance;//医疗保险
	private float unemploymentInsurance;//失业保险
	private float festivalBonus;//过节费
	private float telephoneBouns; //电话费
	private float taxBase2;//扣税基数
	private float governmentSpecialA;//政府特贴
	private float BonusIssue;//奖金补发
	private float issueOne;//补发一
	private float issueTwo; //补发二
	private float medicalFee;//医疗费
	private float taxDeductionTogether;//      扣税合计
	private float deductionOfLeave;//  扣减事假
	private float deductionOfSickLeave; // 扣减病假
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getWid() {
		return wid;
	}
	public void setWid(Integer wid) {
		this.wid = wid;
	}
	@OneToOne
	@JoinColumn(name="eid")
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Date getWtime() {
		return wtime;
	}
	public void setWtime(Date wtime) {
		this.wtime = wtime;
	}
	public float getShouldWages() {
		return shouldWages;
	}
	public void setShouldWages(float shouldWages) {
		this.shouldWages = shouldWages;
	}
	public float getRealWages() {
		return realWages;
	}
	public void setRealWages(float realWages) {
		this.realWages = realWages;
	}
	public float getTitleWages() {
		return titleWages;
	}
	public void setTitleWages(float titleWages) {
		this.titleWages = titleWages;
	}
	public float getJobWage() {
		return jobWage;
	}
	public void setJobWage(float jobWage) {
		this.jobWage = jobWage;
	}
	public float getPositionWages() {
		return positionWages;
	}
	public void setPositionWages(float positionWages) {
		this.positionWages = positionWages;
	}
	public float getLevelWages() {
		return levelWages;
	}
	public void setLevelWages(float levelWages) {
		this.levelWages = levelWages;
	}
	public float getBaseWages() {
		return baseWages;
	}
	public void setBaseWages(float baseWages) {
		this.baseWages = baseWages;
	}
	public float getWorkersPpostAllowance() {
		return workersPpostAllowance;
	}
	public void setWorkersPpostAllowance(float workersPpostAllowance) {
		this.workersPpostAllowance = workersPpostAllowance;
	}
	public float getSeniorityPay() {
		return seniorityPay;
	}
	public void setSeniorityPay(float seniorityPay) {
		this.seniorityPay = seniorityPay;
	}
	public float getBonus() {
		return bonus;
	}
	public void setBonus(float bonus) {
		this.bonus = bonus;
	}
	public float getAllowance() {
		return allowance;
	}
	public void setAllowance(float allowance) {
		this.allowance = allowance;
	}
	public float getTimeWages() {
		return timeWages;
	}
	public void setTimeWages(float timeWages) {
		this.timeWages = timeWages;
	}
	public float getPieceWages() {
		return pieceWages;
	}
	public void setPieceWages(float pieceWages) {
		this.pieceWages = pieceWages;
	}
	public float getFoodAllowance() {
		return foodAllowance;
	}
	public void setFoodAllowance(float foodAllowance) {
		this.foodAllowance = foodAllowance;
	}
	public float getOvertimePay() {
		return overtimePay;
	}
	public void setOvertimePay(float overtimePay) {
		this.overtimePay = overtimePay;
	}
	public float getOtherWages() {
		return otherWages;
	}
	public void setOtherWages(float otherWages) {
		this.otherWages = otherWages;
	}
	public float getAreaOfAdditionalAllowance() {
		return areaOfAdditionalAllowance;
	}
	public void setAreaOfAdditionalAllowance(float areaOfAdditionalAllowance) {
		this.areaOfAdditionalAllowance = areaOfAdditionalAllowance;
	}
	public float getShouldDeductWages() {
		return shouldDeductWages;
	}
	public void setShouldDeductWages(float shouldDeductWages) {
		this.shouldDeductWages = shouldDeductWages;
	}
	public float getTaxBase() {
		return taxBase;
	}
	public void setTaxBase(float taxBase) {
		this.taxBase = taxBase;
	}
	public float getIndividualIncomeTax() {
		return individualIncomeTax;
	}
	public void setIndividualIncomeTax(float individualIncomeTax) {
		this.individualIncomeTax = individualIncomeTax;
	}
	public float getHousingFund() {
		return housingFund;
	}
	public void setHousingFund(float housingFund) {
		this.housingFund = housingFund;
	}
	public float getPendsionInsurance() {
		return pendsionInsurance;
	}
	public void setPendsionInsurance(float pendsionInsurance) {
		this.pendsionInsurance = pendsionInsurance;
	}
	public float getEndOfMonth() {
		return endOfMonth;
	}
	public void setEndOfMonth(float endOfMonth) {
		this.endOfMonth = endOfMonth;
	}
	public float getNnlyFee() {
		return nnlyFee;
	}
	public void setNnlyFee(float nnlyFee) {
		this.nnlyFee = nnlyFee;
	}
	public float getHousingSubsidy() {
		return housingSubsidy;
	}
	public void setHousingSubsidy(float housingSubsidy) {
		this.housingSubsidy = housingSubsidy;
	}
	public float getConsumptionSubsidies() {
		return consumptionSubsidies;
	}
	public void setConsumptionSubsidies(float consumptionSubsidies) {
		this.consumptionSubsidies = consumptionSubsidies;
	}
	public float getRemotewAreasAllowance() {
		return remotewAreasAllowance;
	}
	public void setRemotewAreasAllowance(float remotewAreasAllowance) {
		this.remotewAreasAllowance = remotewAreasAllowance;
	}
	public float getYearendBonus() {
		return yearendBonus;
	}
	public void setYearendBonus(float yearendBonus) {
		this.yearendBonus = yearendBonus;
	}
	public float getMedicalInsurance() {
		return medicalInsurance;
	}
	public void setMedicalInsurance(float medicalInsurance) {
		this.medicalInsurance = medicalInsurance;
	}
	public float getUnemploymentInsurance() {
		return unemploymentInsurance;
	}
	public void setUnemploymentInsurance(float unemploymentInsurance) {
		this.unemploymentInsurance = unemploymentInsurance;
	}
	public float getFestivalBonus() {
		return festivalBonus;
	}
	public void setFestivalBonus(float festivalBonus) {
		this.festivalBonus = festivalBonus;
	}
	public float getTelephoneBouns() {
		return telephoneBouns;
	}
	public void setTelephoneBouns(float telephoneBouns) {
		this.telephoneBouns = telephoneBouns;
	}
	public float getTaxBase2() {
		return taxBase2;
	}
	public void setTaxBase2(float taxBase2) {
		this.taxBase2 = taxBase2;
	}
	public float getGovernmentSpecialA() {
		return governmentSpecialA;
	}
	public void setGovernmentSpecialA(float governmentSpecialA) {
		this.governmentSpecialA = governmentSpecialA;
	}
	public float getBonusIssue() {
		return BonusIssue;
	}
	public void setBonusIssue(float bonusIssue) {
		BonusIssue = bonusIssue;
	}
	public float getIssueOne() {
		return issueOne;
	}
	public void setIssueOne(float issueOne) {
		this.issueOne = issueOne;
	}
	public float getIssueTwo() {
		return issueTwo;
	}
	public void setIssueTwo(float issueTwo) {
		this.issueTwo = issueTwo;
	}
	public float getMedicalFee() {
		return medicalFee;
	}
	public void setMedicalFee(float medicalFee) {
		this.medicalFee = medicalFee;
	}
	public float getTaxDeductionTogether() {
		return taxDeductionTogether;
	}
	public void setTaxDeductionTogether(float taxDeductionTogether) {
		this.taxDeductionTogether = taxDeductionTogether;
	}
	public float getDeductionOfLeave() {
		return deductionOfLeave;
	}
	public void setDeductionOfLeave(float deductionOfLeave) {
		this.deductionOfLeave = deductionOfLeave;
	}
	public float getDeductionOfSickLeave() {
		return deductionOfSickLeave;
	}
	public void setDeductionOfSickLeave(float deductionOfSickLeave) {
		this.deductionOfSickLeave = deductionOfSickLeave;
	}
	
	
	
	
	
}
