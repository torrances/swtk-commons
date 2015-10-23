package org.swtk.common.dict.dto.iso639.adapter;

import java.util.Set;
import java.util.TreeSet;

import org.swtk.common.dict.dto.iso639.Language;
import org.swtk.common.dict.types.LanguageType;
import org.swtk.common.dict.types.ScopeType;

import com.trimc.blogger.commons.exception.AdapterValidationException;
import com.trimc.blogger.commons.utils.string.StringUtils;

public class LanguageAdapter {

	private static void add(Set<String> set, String original, String variant) {
		if (variant.equalsIgnoreCase(original)) return;

		/*	replace 
		 * 		"zo e" with "zoe"
		 * 	but preserve
		 * 		"zo es" as "zo es"
		 */
		String t1 = variant.substring(variant.length() - 2, variant.length() - 1);
		String t2 = variant.substring(variant.length() - 1);
		if (" ".equals(t1) && StringUtils.hasValue(t2)) {
			variant = variant.substring(0, variant.length() - 2) + variant.substring(variant.length() - 1);
		}

		set.add(StringUtils.trim(variant));
	}

	public static String getShortName(String name) {
		name = StringUtils.trim(name.toLowerCase());
		if (name.contains("(")) name = StringUtils.substringBefore(name, "(").trim();

		return name;
	}

	public static Set<String> getVariations(String name) {
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

	public static String toString(Language entity) {
		StringBuilder sb = new StringBuilder();

		sb.append("id = " + entity.getId());
		if (entity.hasScope()) sb.append(", scope = " + entity.getScope().toString());
		if (entity.hasLanguageType()) sb.append(", language-type = " + entity.getLanguageType().toString());
		sb.append(", name = " + entity.getName());
		sb.append(", short-name = " + entity.getShortName());
		if (entity.hasVariations()) sb.append(", variations = " + StringUtils.toString(entity.getVariations(), ";"));

		return sb.toString();
	}

	public static Language transform(String line) throws AdapterValidationException {
		Language entity = new Language();

		String[] tokens = StringUtils.splitPreserveAllTokens(line, '\t');
		if (8 != tokens.length) throw new AdapterValidationException("Invalid Line (expected-length = %s, actual-length = %s)", 8, tokens.length);

		entity.setId(tokens[0]);
		entity.setScope(ScopeType.find(tokens[4]));
		entity.setLanguageType(LanguageType.find(tokens[5]));
		entity.setName(tokens[6].toLowerCase());
		entity.setShortName(getShortName(entity.getName()));
		entity.setVariations(getVariations(entity.getShortName()));

		return entity;
	}
}
