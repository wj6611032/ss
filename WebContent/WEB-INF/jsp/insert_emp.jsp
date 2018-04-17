<%@ page language="java" contentType="text/html; charset=UTF-8"
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
<script type="text/javascript">
$(function(){
	$.ajax({
		url:"hello2",
		dataType:"json",
		success:function(data){
			
	        	$("#department_did").append("<option value=-1>请选择部门</option>");//下拉列表里不能带点 不然id选择器不识别
	        	for(i=0;i<data.length;i++){
	        	$("#department_did").append("<option value='"+data[i].did+"'>"+data[i].dname+"</option>");
	        	}
	        	$("#position_pid").append("<option value=-1>请选择所在职位</option>");
			
		}
	})
	
	$("#department_did").on('change',function(){
		//alert("123")
		var a=$("#department_did").val();
		//alert(a);
		
		if(a==-1){
			//alert('-1')
			$("#position_pid").find("option").remove();
			$("#position_pid").append("<option value=-1>请选择所在职位</option>");
		}else{
			$.ajax({
				url:"hello5?did="+a,
				dataType:"json",
				success:function(data){
					//alert("321")
					/*$("#search").find("option").remove(); 
								或者 $("#search").empty();*/
					$("#position_pid").find("option").remove();
					
								
					$("#position_pid").append("<option value=-1>请选择所在职位</option>");
				
					for(i=0;i<data.length;i++){
			        	$("#position_pid").append("<option value='"+data[i].pid+"'>"+data[i].pname+"</option>");
			        	}
					
				}
			
			})
		}
		
	})

	
	$("#position_pid").on('change',function(){
		var c=$("#position_pid").val();
		if(c==-1){
			$("#job_jobname").val("");
			$("#job_jobname").val("");
		}else{
			alert("10")
			$.ajax({
				url:"hello6?pid="+c,//如果传单个成员变量可以用其他的方式
				dataType:"json",
				success:function(data){
					alert("11")
					//$("#job_jobname").val(data.job.jid); job——》position 双向  position 放弃维护外键关系时 这样写会报错
					$("#job_jid").val("12");
				}
			})
		}
	})
})




</script>
<body>
<center>
<h1>添加新员工</h1>

<br>
<form action="${pageContext.request.contextPath}/emp/hello7" method="post" enctype="multipart/form-data">
<table class="table  table-bordered table-hover table-condensed">
			<tr class="active">
				
				<td>人员编号:</td>
				<td><input type="text"  id="eno" name="eno"></td>
				<td>人员姓名</td>
				<td><input type="text"  id="ename" name="ename"></td>
				<td>相片:</td>
				<td><input type="file" name="mfile"></td>
			</tr>
			
			<tr class="success">
				<td>所在部门:</td>
				 <td><select id="department_did" name="department.did"></select></td> 
				<td>所在职位:</td>
				<!-- <td><select id="position_pid" name="position.did"></select></td> -->
				<td>职称:</td>
				<td><!-- <input type="text" id="job_jobname" name="job.jobname">
					<input type="hidden" id="job_jid" name="job.jid">  -->
				</td>
			</tr>
			
			<tr class="info">
			
				<td>性别:</td>
				<td><input type="radio" name="sex" value="男" checked>男&nbsp; &nbsp; &nbsp; 
				<input type="radio" name="sex" value="女" >女</td> 
				<td>身份证号:</td>
				<td><input type="text"  id="idCard" name="idCard"></td>
				<td>出生日期:</td>
				<td> <input type="date" id="borthday" name="borthday"/> </td>
				
			</tr>
			
			<tr class="warning">
			    <td>籍贯:</td>
				<td><input type="text" id="native_e" name="native_e"></td>
				<td>民族:</td>
				<td><input type="text" id="nation" name="nation"> </td>
				<td>政治面貌:</td>
				<td><input type="text" id="politicalStatus" name="politicalStatus"> </td>
				
			</tr>
			
			<tr class="danger">
			    <td>宗教信仰:</td>
				<td><input type="text" id="religiousBelief" name="religiousBelief"></td>
				<td>健康状态:</td>
				<td><input type="text" id="healthCondition" name="healthCondition"></td>
				<td>婚姻状态:</td>
				<td><input type="radio" name="maritalStatus" value="已婚" checked>已婚&nbsp; &nbsp; &nbsp; 
				<input type="radio" name="maritalStatus" value="未婚" >未婚&nbsp; &nbsp; &nbsp;
				<input type="radio" name="maritalStatus" value="丧偶" >丧偶 
				</td>
				
			</tr>
			
				<tr class="danger">
				<td>工资账号:</td>
				<td><input type="text" id="wagesAccount" name="wagesAccount"/></td>
				<td>社保账号:</td>
				<td> <input type="text" id="socialSecurityNumbers" name="socialSecurityNumbers"/></td>
				<td>参加工作时间:</td>
				<td><input type="date" id="participateInTheWorktime" name="participateInTheWorktime"/></td>
				
				
			</tr>
		
				<tr class="danger">
				<td>进入单位时间:</td>
				<td><input type="date" id="enterTheUnitofTime" name="enterTheUnitofTime"/></td>
				<td>户口所在地:</td>
				<td><input type="text" id="permanentResidence" name="permanentResidence" ></td>
				<td>学历:</td>
				<td> 
				<select name="education" id="education">
				<option value="博士">博士</option>
				<option value="研究生">研究生</option>
				<option value="本科">本科</option>
				<option value="大专">大专</option>
				<option value="高中">高中</option>
				</select> </td>
				
			</tr>
			<tr class="danger">
			    <td>办公电话:</td>
				<td><input type="text" id="officePhone" name="officePhone"></td>
				<td>住宅电话:</td>
				<td><input type="text" id="homePhone" name="homePhone"></td>
				<td>移动电话:</td>
				<td><input type="text" id="mobileTelephone" name="mobileTelephone"></td>
				
			</tr>
			
			<tr class="danger">
			    <td>家庭住址:</td>
				<td><input type="text" id="homeAddress" name="homeAddress"> </td>
				<td>通讯地址:</td>
				<td> <input type="text" id="contactAddress" name="contactAddress"> </td>
				<td>邮政编号:</td>
				<td><input type="text" id="zipCode" name="zipCode"></td>
				
				
			</tr>
			<tr class="danger">
			<td>Email:</td>
				<td> <input type="text" id="email" name="email"> </td>
				<td>现从事专业:</td>
				<td><input type="text" id="workField" name="workField"> </td>
				<td>兴趣爱好:</td>
				<td> <input type="text" id="hobbies" name="hobbies"> </td>
				
			</tr>
			<tr class="danger">
			<td>状态</td>
				<td> <select id="status" name="status">
				<option value="1">在职</option>
				<option value="2">不在职</option>
				<option value="3">辞职</option>
				<option value="4">辞退</option>
				<option value="5">返聘</option>
				<option value="6">解除返聘</option>
				
			
				</select>  </td>
				<td><input type="submit" value="添加新员工"></td>
				<td></td>
				<td></td>
				<td></td>
				
			</tr>
			
		</table>
		</form>
		</center>
</body>
</html>