package org.ssh.util;

import java.util.List;

import org.ssh.pojo.Employee;

public class Empss {
	private List<Employee> rows;
	private Long total;
	public List<Employee> getRows() {
		return rows;
	}
	public void setRows(List<Employee> rows) {
		this.rows = rows;
	}
	public Long getTotal() {
		return total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "Empss [rows=" + rows + ", total=" + total + "]";
	}
	

}
