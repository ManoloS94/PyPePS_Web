package modelos.datos;

import java.sql.Date;

import org.springframework.data.annotation.Id;

public class User {
	  @Id
	  public String id;

	  public String name;
	  public String sname1;
	  public String sname2;
	  public Date bdate;
	  public String mail;
	  public String tlf;
	  public boolean status;
	  
	  public User(String name, String sname1, String sname2, Date bdate, String mail, String tlf, Boolean status) {
		  this.name = name;
		  this.sname1 = sname1;
		  this.sname2 = sname2;
		  this.bdate = bdate;
		  this.mail = mail;
		  this.tlf = tlf;
		  this.status = status;
	}

	public User() {
	}

	public User(String name2, String sname12, String sname22, String email, Date bdate2, String tlf2, boolean status2) {
		// TODO Auto-generated constructor stub
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String mail) {
		this.mail = mail;
	}
	  
	  

}
