package springmvc.model;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class User {
 
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String email;
  private String user;
  private String pass;
public String getEmail() { 
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getUser() {
	return user;
}
public void setUser(String user) {
	this.user = user;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
@Override
public String toString() {
	return "User [email=" + email + ", user=" + user + ", pass=" + pass + "]";
}
}
