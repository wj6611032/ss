package org.ssh.dao;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;



import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import org.ssh.pojo.Employee;
import org.ssh.pojo.Position;
import org.ssh.util.Empyeesss;




@Transactional
public class EmployeeDao<T> extends HibernateDaoSupport{
	@Resource
	private void set(SessionFactory sdf){
		super.setSessionFactory(sdf);
		
	}
	
	@Resource
	private SessionFactory sff;
	
	
	public List<?> getObjects(String hql){
		HibernateTemplate jdbc=this.getHibernateTemplate();
		List<?> list=jdbc.find(hql);
		return list;
		
	}
	
	public List<?> getemps(String sql,Integer offset,Integer limit) {//hibernate的方法
		//System.out.println("sql:"+sql);
		Session session=sff.openSession();//注意这里的session 不是作用域的意思 像是JDBC中的connection
		Transaction tx=session.beginTransaction();//开启事物

		Query query=session.createQuery(sql);
	
		query.setFirstResult(offset);//sessionFactory offset 是从第几个开始
		query.setMaxResults(limit);//limit是一页保持几条数据
		List<?> list=query.list();//转换成list
		System.out.println(123456);
		for (Object object : list) {
			System.out.println("object:"+object);
			
		}
		tx.commit();//提交事物
		return list;
		
		
	}
	
	public Employee getEmp(Integer eid){
		HibernateTemplate jdbc=this.getHibernateTemplate();
		Employee emp=jdbc.get(Employee.class, eid);
		return emp;
		
		
	}
	
	public List<Position> getPositions(Integer did){
		
		HibernateTemplate jdbc=this.getHibernateTemplate();
		String hql="from Position p where p.department.did=?";
		List<Position> list=(List<Position>) jdbc.find(hql, did);
		return list;
		
	}
	
	public Position getPosition(Integer pid){
		HibernateTemplate jdbc=this.getHibernateTemplate();
		Position po=jdbc.get(Position.class, pid);
		return po;
	}
	
	public void insert_employee(Employee emp){
		HibernateTemplate jdbc=this.getHibernateTemplate();
		jdbc.save(emp);
		
	}
	
	public  void delete_emp(Employee emp){
		HibernateTemplate jdbc=this.getHibernateTemplate();
		jdbc.delete(emp);
		
		
	}
	
	@Test
	public void getEmpTest(){
		HibernateTemplate jdbc=this.getHibernateTemplate();
		String sql="select new util.Empyeesss(e.eid,e.eno,e.ename) from Employee e";
		List<Empyeesss> list=(List<Empyeesss>) jdbc.find(sql);
		for (Empyeesss empyeesss : list) {
			System.out.println(empyeesss);
		}
	}
}
