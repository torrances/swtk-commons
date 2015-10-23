package org.swtk.common.dict.iso639.utils;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.swtk.common.dict.dto.iso639.Language;

import com.trimc.blogger.commons.utils.SetUtils;

public final class Iso639Utils {

	public static Language findById(String id, Map<Integer, Language> map) {
		for (Language entity : map.values())
			if (entity.getId().equalsIgnoreCase(id)) return entity;

		return null;
	}

	public static Language findByName(String name, Map<Integer, Language> map) {
		for (Language entity : map.values()) {
			if (entity.getName().equalsIgnoreCase(name)) return entity;
			if (entity.getShortName().equalsIgnoreCase(name)) return entity;
			if (SetUtils.memberOfCaseInsensitive(name, entity.getVariations())) return entity;
		}

		return null;
	}

	public static Map<String, Collection<String>> getLanguageNamesWithVariantsAsMap(Map<Integer, Language> map) {
		Map<String, Collection<String>> results = new TreeMap<String, Collection<String>>();

		for (Language entity : map.values()) {

			Set<String> set = new TreeSet<String>();
			set.add(entity.getShortName());
			set.addAll(entity.getVariations());

			results.put(entity.getName(), set);
		}

		return results;
	}

	public static Collection<String> getLanguageNamesWithVariantsAsSet(Map<Integer, Language> map) {
		Set<String> set = new TreeSet<String>();

		for (Language entity : map.values()) {
			set.add(entity.getShortName());
			set.add(entity.getName());
			set.addAll(entity.getVariations());
		}

		return set;
	}
}
