package com.example.demo.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

/***
 * Originally "Votes table"
 */

@Entity
public class Presented {
	
	private PresetedId pk;
	private Boolean presented;
	


	@EmbeddedId
	public PresetedId getPk() {
		return pk;
	}

	public void setPk(PresetedId pk) {
		this.pk = pk;
	}

	public Boolean getPresented() {
		return presented;
	}

	public void setPresented(Boolean presented) {
		this.presented = presented;
	}
}