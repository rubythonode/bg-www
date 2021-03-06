package com.bg.model;

import java.util.List;

import lombok.Data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Data
@JsonIgnoreProperties(ignoreUnknown  = true)
public class Location {
	@JsonProperty
	private String status;
	
	@JsonProperty
	private List<LocationDetail> results;
}
