package com.in28minutes.rest.webservices.restfulwebservices.mysql;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="frnds")
public class Friends {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="name")
    private String name;
	
	@Column(name="bdate")
	private Date birthDate;

	@OneToMany(mappedBy="f")
	private List<Post> posts;

	public Friends(Long id, String name, Date birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
	}

	public Friends(String name, Date birthDate) {
		super();
		this.name = name;
		this.birthDate = birthDate;
	}

	public Friends() {
		super();
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	public List<Post> getPosts() {
		return posts;
	}
	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

	@Override
	public String toString() {
		return "Friends [id=" + id + ", name=" + name + ", birthDate=" + birthDate + "]";
	}
}
