package com.example.demo.entities;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import jakarta.persistence.ManyToOne;


/***
 * Composite Id Class
 * Must implement serializable
 */


@Embeddable
public class CommentId implements Serializable{

	private static final long serialVersionUID = 8301700676727148246L;
	private User user;
	private Customer customer;

	@ManyToOne
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	@ManyToOne
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
