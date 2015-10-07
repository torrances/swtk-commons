package org.swtk.common.ds.d3js.dto;

import com.google.gson.annotations.Expose;

public class LinkStructure {

	/**
	 * 	Purpose
	 * 	the JSON position of the source node
	 */
	@Expose
	private Integer	source;

	/**
	 * 	Purpose
	 * 	the JSON position of the target node
	 */
	@Expose
	private Integer	target;

	/**
	 *	Purpose
	 *	Uncertain 
	 */
	@Expose
	private String	value;

	public Integer getSource() {
		return source;
	}

	public Integer getTarget() {
		return target;
	}

	public String getValue() {
		return value;
	}

	public void setSource(Integer source) {
		this.source = source;
	}

	public void setTarget(Integer target) {
		this.target = target;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
