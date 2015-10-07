package org.swtk.common.ds.d3js.dto;

import com.google.gson.annotations.Expose;

public class NodeStructure {

	/**
	 *	Purpose
	 *	Uncertain
	 *	Maybe: Used for color-coding
	 *	eg. Can be used to visualize relationship strength
	 *	given a range of 0-9;
	 *		the CSS can equate 0 with green, and 9 with red
	 *		and a spectrum of color in between
	 */
	@Expose
	private Integer	group;

	/**
	 * 	Purpose
	 * 	Display Name on the UI
	 */
	@Expose
	private String	name;

	/**
	 * 	Purpose
	 * 	Used for entity linking in {Links.java}
	 * 	This attribute is not exposed in the JSON
	 */
	private Integer	position;

	public Integer getGroup() {
		return group;
	}

	public String getName() {
		return name;
	}

	public Integer getPosition() {
		return position;
	}

	public void setGroup(Integer group) {
		this.group = group;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

}
