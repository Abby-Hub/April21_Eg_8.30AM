package JDBC_Appn;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int id;
	@Column
	private String name;
	@Column
	private String address;
	@Column
	private Date joinDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return address;
	}
	public void setAddr(String addr) {
		this.address = addr;
	}
	
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	
	public Date getJoinDate() {
		return joinDate;
	}
	
	@Override
	public String toString() {
		return getId()+"\t"+getName()+" \t"+getAddr()+"\t"+getJoinDate();
	}

}
