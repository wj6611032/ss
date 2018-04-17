-<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/js/bootstarp-3.3.7/css/bootstrap.css" />
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js" ></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstarp-3.3.7/js/bootstrap.min.js" ></script>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/js/bootstarp-table-1.11.1/bootstrap-table.min.css" />
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstarp-table-1.11.1/bootstrap-table.min.js" >
	</script><script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstarp-table-1.11.1/bootstrap-table-zh-CN.min.js" ></script>
       

</head>
<body>
<center>
<h1>人员信息详情表</h1>
</center>
<table class="table  table-bordered table-hover table-condensed">
			<tr class="active">
				<td>主键:</td>
				<td>${emp.eid}</td>
				<td>人员编号:</td>
				<td>${emp.eno}</td>
				<td>人员姓名</td>
				<td>${emp.ename}</td>
				<td>相片:</td>
				<td><img src="${emp.empImg}" width=150 height=100></td>
			</tr>
			
			<tr class="success">
				<td>所在部门:</td>
				<td>${emp.department.dname}</td>
				<td>所在职位:</td>
				<td>${emp.position.pname}</td>
				<td>英文名：</td>
				<td>${emp.englishName}</td>
				<td>曾用名:</td>
				<td>${emp.nameUsedBefore}</td>
			</tr>
			
			<tr class="info">
				<td>性别:</td>
				<td>${emp.sex}</td>
				<td>身份证号:</td>
				<td>${emp.idCard}</td>
				<td>出生日期:</td>
				<td>${emp.borthday}</td>
				<td>籍贯:</td>
				<td>${emp.native_e}</td>
			</tr>
			
			<tr class="warning">
				<td>民族:</td>
				<td>${emp.nation}</td>
				<td>政治面貌:</td>
				<td>${emp.politicalStatus}</td>
				<td>宗教信仰:</td>
				<td>${emp.religiousBelief}</td>
				<td>健康状态:</td>
				<td>${emp.healthCondition}</td>
			</tr>
			
			<tr class="danger">
				<td>婚姻状态:</td>
				<td>${emp.maritalStatus}</td>
				<td>工资账号:</td>
				<td>${emp.wagesAccount}</td>
				<td>社保账号:</td>
				<td>${emp.socialSecurityNumbers}</td>
				<td>参加工作时间:</td>
				<td>${emp.participateInTheWorktime}</td>
			</tr>
			
				<tr class="danger">
				<td>进入单位时间:</td>
				<td>${emp.enterTheUnitofTime}</td>
				<td>户口所在地:</td>
				<td>${emp.permanentResidence}</td>
				<td>学历:</td>
				<td>${emp.education}</td>
				<td>职称:</td>
				<td>${emp.job.jobname}</td>
			</tr>
		
				<tr class="danger">
				<td>办公电话:</td>
				<td>${emp.officePhone}</td>
				<td>住宅电话:</td>
				<td>${emp.homePhone}</td>
				<td>移动电话:</td>
				<td>${emp.mobileTelephone}</td>
				<td>家庭住址:</td>
				<td>${emp.homeAddress}</td>
			</tr>
			<tr class="danger">
				<td>通讯地址:</td>
				<td>${emp.contactAddress}</td>
				<td>邮政编号:</td>
				<td>${emp.zipCode}</td>
				<td>Email:</td>
				<td>${emp.email}</td>
				<td>现从事专业:</td>
				<td>${emp.workField}</td>
			</tr>
			
			<tr class="danger">
				<td>兴趣爱好:</td>
				<td>${emp.hobbies}</td>
				<td>状态:</td>
				<td>${emp.status}</td>
				<td>123</td>
				<td>123</td>
				<td>123</td>
				<td>123</td>
			</tr>
			
		</table>
</body>
</html>