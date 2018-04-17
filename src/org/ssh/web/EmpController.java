package org.ssh.web;


import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;


import org.apache.commons.io.FileUtils;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.ssh.pojo.Department;
import org.ssh.pojo.Employee;
import org.ssh.pojo.Position;
import org.ssh.service.EmpService;
import org.ssh.util.Biaoji;
import org.ssh.util.Empss;




@Controller
@RequestMapping("/emp")
public class EmpController<T> {
	@Resource
	private EmpService es;
	
	@RequestMapping("/hello1")
	@ResponseBody
	public Empss getEmps(Integer limit,Integer offset,Integer did,String mohu) {
		System.out.println("mohu:"+mohu);
		String hql="from Employee e where 1=1 and e.status=1 ";
		if(did!=null&&did!=-1){
			hql+=" and e.department.did="+did;	
		}
		if(mohu!=null&&!mohu.equals("")){
			hql+=" and (e.sex like'%"+mohu+"%' or e.job.jobname like '%"+mohu+"%' or e.education like '%"
				+mohu+"%')";
		}
	    
		
		System.out.println("hql:"+hql);
		List<Employee> list=es.getEmployees(hql);
		Long total=(long) list.size();
		System.out.println("total:"+total);
		Empss emp=new Empss();
		
		List<Employee> list2=es.getemps(hql, limit, offset);
		System.out.println("limit："+limit+",offset:"+offset);
		
		emp.setRows(list2);
		emp.setTotal(total);
		return emp;
		
		
	}
	
	@RequestMapping("/hello")
	public String index(){
		return "emp";
	}
	
	@RequestMapping("/hello2")
	@ResponseBody
	public List<Department> demp(){
		String hql="from Department";
		List<Department> list=es.getDepartment(hql);
		return list;
		
	}
	
	@RequestMapping("/hello3")
	public String se(Integer eid,ModelMap map){
		Employee emp=es.getEmpByEid(eid);
		map.put("emp", emp);
		return "see_emp";
		
	}
	
	@RequestMapping("/hello4")
	public String zhuan_insert_emp(){
		return "insert_emp";
	}	
	
	@RequestMapping("/hello5")
	@ResponseBody
	public List<Position> gb_position(Integer did){
		
		System.out.println("diddd:"+did);
		List<Position> list=es.getPositions(did);
		System.out.println("list.size:"+list.size());
		return list;
		
	}
	
	@RequestMapping("/hello6")
	@ResponseBody
	public  Position get_position(Integer pid){
		System.out.println("pid:"+pid);
		Position po=es.getPosition(pid);
		System.out.println("po:"+po);
		return po;
	}
	
	@RequestMapping("/hello7")
	public String insert_employee( MultipartFile mfile,Employee emp) throws IOException{
		// MultipartFile mfile mfile 是前段file控件的名字
		//部门是-1时与数据库中的表中的did对不上回报错
		//如果用ajax上传时用二期项目那个方法
		String filename=mfile.getOriginalFilename();
		System.out.println("filename:"+filename);
		if(!filename.equals("")&&mfile!=null){//判断是否有没有上传文件
			
		int start=filename.lastIndexOf(".");
		String suffix=filename.substring(start);
		long string = System.currentTimeMillis();//得到的是long型时间
		File file=new File("D:/insert_exe/Apache Software Foundation/Tomcat 7.0/webapps/photo",
				"upload/"+string+suffix);
		FileUtils.copyInputStreamToFile(mfile.getInputStream(),file);//注意驱动包
		String aa="/photo/upload/"+string+suffix;//因为把项目发布 是tomcat 了这时路径要注意了不能写全部路径了
		emp.setEmpImg(aa);
		}
		es.insert_emplyee(emp);
		return "emp";
		
	}
	@RequestMapping("/hello8")
	@ResponseBody
	public Biaoji delete_emp(Employee emp){//虽然写了@ResponseBody返回json 格式但只是针对对象，对字符串无效
		System.out.println("delete_emp:"+emp.getEid());
		es.delete_emp(emp);
		Biaoji b=new Biaoji();
		b.setOk("ok");
		return b;//要返回对象才行，返回个字符串不行
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
