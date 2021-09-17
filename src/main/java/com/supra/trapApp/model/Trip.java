package com.supra.trapApp.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@EqualsAndHashCode
public class Trip implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 50, nullable = false)
	private String tour;
	
	@Column(columnDefinition = "char(5)", nullable = false)
	private String startTime;
	
	@Column(columnDefinition = "char(5)", nullable = false)
	private String endTime;
	
	private Integer confirmed;
	
	private Integer pendents;
}
