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
       
  <script type="text/javascript" language="javascript">

$(function(){

 $.ajax({//下拉列表显示的方法
    	url:"hello2",
        dataType:"json",
        success:function(data){
        	$("#search_did").append("<option value=-1>请选择</option>");
        	for(i=0;i<data.length;i++){
        	$("#search_did").append("<option value='"+data[i].did+"'>"+data[i].dname+"</option>");
        	}
        	
        }
    }); 
	

    
	    $("#tab").bootstrapTable({//表的数据载入方法
	    	url:"hello1",//请求数据
	    	dataType:"json",//请求的数据格式，注意用双引号
	    	striped:true,//分割线
	    	idField:"eid",//指定主键列 
	    	toolbar:"#toolbar",//使用下方自定义的工具栏
	    	pagination:true,//是否显示分页
	    	sidePagination:"server",
	    	pageNumber:1,
	    	pageSize:5,
	    	ajaxOptions:{
	    		async:false
	    	},
	    	pageList:[5,10,15,20],
	    	queryParams:queryParams,
	    	columns:[
	    	         {
	    	         field:"eid",
	    	         title:"人员主键",
	    	         align:"center",
	    	        
	    	         },
	    	         {
		    	      field:"eno",
		    	      title:"人员编号",
		    	      align:"center",
		    	        
		    	      },
		    	      {
			    	  field:"ename",
			    	  title:"主题主键",
			    	  align:"center",
			    	  },
		    	      {
			    	  field:"department.dname",
			    	  title:"所在部门",
			    	  align:"center",
			    	        
			    	   },
			    	    {
					   field:"sex",
					   title:"性别",
					   align:"center",
					    	        
					    	    },
			    	   {
				    	field:"borthday",
				    	title:"出生日期",
				    	align:"center",
				    	        
				    	},
				    	{
					    field:"education",
					    title:"学历",
					    align:"center",
					    },
				    	{
					    field:"job.jobname",
					    title:"职称",
					    align:"center",
					    	        
					    },
					    {
						 field:"position.pname",
						 title:"职位",
						 align:"center",
						    	        
						    },
					    {
						 field:"officePhone",
						 title:"办公电话",
						 align:"center",
						    	        
						    },
					   {
			    	 field:"caozuo",
			 		 title:"操作",
			 		//visible:false,//隐藏 ,用这个也可以，用下面那个隐藏也可以
			 		 width:"160px",
			 	     align:"center",
			 	     formatter:function(val,rowdata){
			 	    	
			 	    	 return "<button type='button' onclick='see("
		 	    			 +rowdata.eid+");' class='btn btn-info btn-xs'><i class='glyphicon glyphicon-pencil'></i>&nbsp;查看</button>&nbsp;&nbsp;"
		 	    	         +"<button type='button' class='btn btn-danger btn-xs' onclick='delete_emplyee("
		 	    	         +rowdata.eid+");'><i class='glyphicon glyphicon-trash'></i>&nbsp;删除</button>";
			 	     }
			 	     
			    	         }
	    	         ] 
	    });
	    
	    $("select:eq(0)").on('change',function(){
	    	$("#tab").bootstrapTable("refresh",{silent:true});
	    })
	  
	
	
})

function queryParams(params){//tab的传参方法
	return  {
		limit:params.limit,
		offset:params.offset,
		did:$("#search_did").val(),
		mohu:$("#search_zhonghe").val()
		
	};
}

function search(){
	$("#tab").bootstrapTable("refresh",{silent : true});
}

function see(eid){
	location.href="${pageContext.request.contextPath}/emp/hello3?eid="+eid;
		
	
}

function insert(){
	location.href="${pageContext.request.contextPath}/emp/hello4";//用ssh框架不能直接超链接网页要通过controller来处理（跳到后台在转）
	
}
function delete_emplyee(eid){
	$("#delete_employee_eid").html(eid);
	$("#deleteModal").modal("show");
}

function delete_emp(){
	alert("7");
	$.ajax({
		url:"hello8?eid="+$("#delete_employee_eid").html(),
		dataType:"json",
		type:"post",
		success:function(data){
			alert("8");
			$("#deleteModal").modal("hide"); //隐藏添加模态框
			$("#tab").bootstrapTable("refresh",{silent : true});
			
		}
	})
}
  
  
	 </script>  
</head>
<body> 
<div class="container" id="all" >
<div class="row">
<div class="col-lg-12 col-sm-12">

<center><h1>通力人力资源管理系统在职人员管理</h1></center>
</div>
</div>
<br>
<div class="row">
<div class="col-lg-12 col-sm-12">
<div class="panel panel-info">

  <div class="panel-body" >
   <form class="form-inline" role="form">
   
   <div class="form-group">
    <label for="search_did">部门：</label>
   <select id="search_did" class="form-control" ></select>
  </div>
 
  <div class="form-group">
    <label for="search_zhonghe">综合查询：</label>
    <input type="text" class="form-control" id="search_zhonghe" placeholder="请输入要查询的主题标题">
  </div>
   
  <div class="form-group">
  <button type="button" class="btn btn-info " onclick="search()"><i class="glyphicon glyphicon-search"></i>&nbsp;模糊查询</button>
  </div>
  
  <div class="form-group">
  <button type="button" class="btn btn-info " onclick="insert()"><i class="glyphicon glyphicon-search"></i>&nbsp;添加新员工</button>
  </div>
  </form>
   
  </div>
  </div>
</div>
</div>
<div class="row">
<div class="col-lg-12 col-sm-12">
   <table id="tab"></table> 
</div>
</div>
</div>


<div class="modal fade" tabindex="-1" role="dialog" id="deleteModal">
  <div class="modal-dialog" role="document">
    <div class="modal-content danger">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h3 class="modal-title" align="center">删除确认</h3>
      </div>
      <div class="modal-body">
	      <div class="alert alert-danger alert-dismissible fade in" role="alert" id="deleteAlert" >
	        	<p>您真的要删除&nbsp; <span id="delete_employee_eid"></span>&nbsp; 的信息吗？请谨慎删除！</p>
	       </div>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-danger" onclick="delete_emp();"><i class="glyphicon glyphicon-trash"></i>&nbsp; 确认删除</button>
        <button type="button" class="btn btn-default" data-dismiss="modal"><i class="glyphicon glyphicon-repeat"></i>&nbsp; 放弃</button>
      </div>
    </div><!-- /.modal-content -->
  </div><!-- /.modal-dialog -->
</div><!-- /.modal -->
</body>
</html>