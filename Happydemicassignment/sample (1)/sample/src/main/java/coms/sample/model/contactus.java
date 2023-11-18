package coms.sample.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class contactus {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
private String name;
private String email;
private Long contactno;
@DateTimeFormat(pattern = "yyyy-MM-dd")
private LocalDate date;




public contactus(int id, String name, String email, Long contactno, LocalDate date) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.contactno = contactno;
	this.date = date;
}
@Override
public String toString() {
	return "contactus [id=" + id + ", name=" + name + ", email=" + email + ", contactno=" + contactno + ", date=" + date
			+ "]";
}
public contactus() {
	super();
}
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Long getContactno() {
	return contactno;
}
public void setContactno(Long contactno) {
	this.contactno = contactno;
}
public LocalDate getDate() {
	return date;
}
public void setDate(LocalDate date) {
	this.date = date;
}





}
