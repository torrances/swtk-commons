package org.swtk.common.dict.iso639.utils;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.swtk.common.dict.dto.Entity;

public final class Iso639Utils {

	public static Entity findById(String id, Map<Integer, Entity> map) {
		for (Entity entity : map.values())
			if (entity.getId().equalsIgnoreCase(id)) return entity;
		return null;
	}

	public static Map<String, Collection<String>> getLanguageNamesWithVariantsAsMap(Map<Integer, Entity> map) {
		Map<String, Collection<String>> results = new TreeMap<String, Collection<String>>();

		for (Entity entity : map.values()) {

			Set<String> set = new TreeSet<String>();
			set.add(entity.getShortName());
			set.addAll(entity.getVariations());

			results.put(entity.getName(), set);
		}

		return results;
	}

	public static Collection<String> getLanguageNamesWithVariantsAsSet(Map<Integer, Entity> map) {
		Set<String> set = new TreeSet<String>();

		for (Entity entity : map.values()) {
			set.add(entity.getShortName());
			set.add(entity.getName());
			set.addAll(entity.getVariations());
		}

		return set;
	}
}
