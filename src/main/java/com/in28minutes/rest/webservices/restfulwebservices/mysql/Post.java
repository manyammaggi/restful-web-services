package com.in28minutes.rest.webservices.restfulwebservices.mysql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="frnds_posts")
public class Post {

	@Id
	@GeneratedValue
	private Long id;

	@Column(name="likes")
    private int likes;

	@ManyToOne(fetch=FetchType.LAZY)
	private Friends f;

	public Post(Long id, int likes, Friends f) {
		super();
		this.id = id;
		this.likes = likes;
		this.f = f;
	}

	public Post(int likes, Friends f) {
		super();
		this.likes = likes;
		this.f = f;
	}

	public Post() {
		super();

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public Friends getF() {
		return f;
	}

	public void setF(Friends f) {
		this.f = f;
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", likes=" + likes + "]";
	}
	
	
}
