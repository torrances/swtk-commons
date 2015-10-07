package org.swtk.common.ds.d3js.dto.adapter;

import org.swtk.common.ds.d3js.dto.LinkStructure;

import com.trimc.blogger.commons.exception.AdapterValidationException;

public final class LinkStructureAdapter {

	public static LinkStructure transform(Integer source, Integer target) throws AdapterValidationException {
		return transform(source, target, 1);
	}

	public static LinkStructure transform(Integer source, Integer target, Object value) throws AdapterValidationException {
		LinkStructure linkStructure = new LinkStructure();

		linkStructure.setSource(source);
		linkStructure.setTarget(target);
		linkStructure.setValue(value.toString());

		return linkStructure;
	}
}
