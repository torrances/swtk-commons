package org.swtk.common.ds.d3js.dto.adapter;

import org.swtk.common.ds.d3js.dto.NodeStructure;

import com.trimc.blogger.commons.exception.AdapterValidationException;

public final class NodeStructureAdapter {

	public static NodeStructure transform(String name, Integer position) throws AdapterValidationException {
		return transform(name, position, 1);
	}

	public static NodeStructure transform(String name, Integer position, Integer group) throws AdapterValidationException {
		NodeStructure nodeStructure = new NodeStructure();

		nodeStructure.setName(name);
		nodeStructure.setPosition(position);
		nodeStructure.setGroup(group);

		return nodeStructure;
	}
}
