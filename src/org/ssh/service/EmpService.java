package org.ssh.service;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.tags.EscapeBodyTag;
import org.ssh.dao.EmployeeDao;
import org.ssh.pojo.Department;
import org.ssh.pojo.Employee;
import org.ssh.pojo.Position;

import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

@Service

public class EmpService {
	@Resource
	private EmployeeDao empdao;
	public List<Employee> getEmployees(String hql){
		List<Employee> list=(List<Employee>) empdao.getObjects(hql);
		return list;
		
		
	}
	
	public List<Employee> getemps(String sql,Integer limit,Integer offset) {
		List<Employee> list= empdao.getemps(sql, offset, limit);
		return list;
		
		
	}
	public List<Department> getDepartment(String hql){
		List<Department> list=empdao.getObjects(hql);
		return list;
	}

	public Employee getEmpByEid(Integer eid) {
		Employee emp=empdao.getEmp(eid);
		return emp;
	}

	public List<Position> getPositions(Integer did){
		List<Position> list=empdao.getPositions(did);
		return list;
		
	}
	
	public Position getPosition(Integer pid){
		Position po=empdao.getPosition(pid);
		return po;
	}
	
	public void insert_emplyee(Employee emp){
		empdao.insert_employee(emp);
	}
	
	public void delete_emp(Employee emp){
		empdao.delete_emp(emp);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
