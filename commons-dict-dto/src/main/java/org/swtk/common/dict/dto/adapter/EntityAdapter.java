package org.swtk.common.dict.dto.adapter;

import java.util.Set;
import java.util.TreeSet;

import org.swtk.common.dict.dto.Entity;
import org.swtk.common.dict.dto.LanguageType;
import org.swtk.common.dict.dto.ScopeType;

import com.trimc.blogger.commons.exception.AdapterValidationException;
import com.trimc.blogger.commons.utils.string.StringUtils;

public class EntityAdapter {

	private static void add(Set<String> set, String original, String variant) {
		if (!variant.equalsIgnoreCase(original)) set.add(StringUtils.trim(variant));
	}

	private static String getShortName(String name) {
		name = StringUtils.trim(name.toLowerCase());
		if (name.contains("(")) name = StringUtils.substringBefore(name, "(").trim();

		return name;
	}

	private static Set<String> getVariations(String name) {
		Set<String> set = new TreeSet<String>();

		add(set, name, StringUtils.unicodeNormalization(name));
		add(set, name, name.replaceAll("-", " "));
		add(set, name, name.replaceAll("'", " "));
		add(set, name, name.replaceAll("'", " ").replaceAll("-", " "));
		add(set, name, StringUtils.unicodeNormalization(name).replaceAll("'", " "));
		add(set, name, StringUtils.unicodeNormalization(name).replaceAll("-", " "));
		add(set, name, StringUtils.unicodeNormalization(name).replaceAll("'", " ").replaceAll("-", " "));

		return set;
	}

	public static String toString(Entity entity) {
		StringBuilder sb = new StringBuilder();

		sb.append("id = " + entity.getId());
		if (entity.hasScope()) sb.append(", scope = " + entity.getScope().toString());
		if (entity.hasLanguageType()) sb.append(", language-type = " + entity.getLanguageType().toString());
		sb.append(", name = " + entity.getName());
		sb.append(", short-name = " + entity.getShortName());
		if (entity.hasVariations()) sb.append(", variations = " + StringUtils.toString(entity.getVariations(), ";"));

		return sb.toString();
	}

	public static Entity transform(String line) throws AdapterValidationException {
		Entity entity = new Entity();

		String[] tokens = StringUtils.splitPreserveAllTokens(line, '\t');
		if (8 != tokens.length) throw new AdapterValidationException("Invalid Line (expected-length = %s, actual-length = %s)", 8, tokens.length);

		entity.setId(tokens[0]);
		entity.setScope(ScopeType.find(tokens[4]));
		entity.setLanguageType(LanguageType.find(tokens[5]));
		entity.setName(tokens[6]);
		entity.setShortName(getShortName(entity.getName()));
		entity.setVariations(getVariations(entity.getShortName()));

		return entity;
	}
}
