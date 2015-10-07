package org.swtk.common.ds.d3js.dto.adapter;

import java.util.Collection;

import org.swtk.common.ds.d3js.dto.LinkStructure;
import org.swtk.common.ds.d3js.dto.NodeLinkStructure;
import org.swtk.common.ds.d3js.dto.NodeStructure;

import com.trimc.blogger.commons.exception.AdapterValidationException;

public final class NodeLinkStructureAdapter {

	public static NodeLinkStructure transform(Collection<NodeStructure> nodes, Collection<LinkStructure> links) throws AdapterValidationException {
		NodeLinkStructure nodeLinkStructure = new NodeLinkStructure();
		
		nodeLinkStructure.setNodes(nodes);
		nodeLinkStructure.setLinks(links);
		
		return nodeLinkStructure;
	}
}
