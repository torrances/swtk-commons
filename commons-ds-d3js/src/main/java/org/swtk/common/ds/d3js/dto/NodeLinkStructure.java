package org.swtk.common.ds.d3js.dto;

import java.util.Collection;

import com.google.gson.annotations.Expose;

/**
 * 	Purpose
 * 	This is a common data structure used in D3JS
 * 
 *  Visualizations include:
 *  	<http://bost.ocks.org/mike/miserables/>
 *  
 *  Date Created / Modified:
 *  	5:38 PM 3/17/2015
 */
public class NodeLinkStructure {

	/**
	 * 	Purpose
	 * 	The relationships between the entities 
	 */
	@Expose
	private Collection<LinkStructure>	links;

	/**
	 * 	Purpose
	 * 	The entities being displayed 
	 */
	@Expose
	private Collection<NodeStructure>	nodes;

	public Collection<LinkStructure> getLinks() {
		return links;
	}

	public Collection<NodeStructure> getNodes() {
		return nodes;
	}

	public void setLinks(Collection<LinkStructure> links) {
		this.links = links;
	}

	public void setNodes(Collection<NodeStructure> nodes) {
		this.nodes = nodes;
	}
}
