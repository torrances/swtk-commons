package org.swtk.common.dict.iso639.generated;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.swtk.common.dict.dto.Entity;
import org.swtk.common.dict.dto.adapter.EntityAdapter;
import org.swtk.common.dict.iso639.utils.Iso639Utils;

/**	
 * 	AUTO-GENERATED
 * 		time 		<$datetime>
 * 		activity 	<$clazz>
 * 		url			<$url>
 * 		agent 		<$name>
 * 	DO NOT MODIFY THIS CLASS
 * 	CONTENTS ARE AUTOMATICALLY REPLACED BY MDA ROUTINE
 */
public final class Iso639_$alpha$num {

	private static Map<Integer, Entity> map = new HashMap<Integer, Entity>();

	static {
		$content
	}

	private static void add(String line) {
		try {
			Entity entity = EntityAdapter.transform(line);
			map.put(entity.hashCode(), entity);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Entity findById(String id) {
		return Iso639Utils.findById(id, map);
	}

	public static Entity findByName(String name) {
		return Iso639Utils.findByName(name, map);
	}

	public static Map<String, Collection<String>> getLanguageNamesWithVariantsAsMap() {
		return Iso639Utils.getLanguageNamesWithVariantsAsMap(map);
	}

	public static Collection<String> getLanguageNamesWithVariantsAsSet() {
		return Iso639Utils.getLanguageNamesWithVariantsAsSet(map);
	}
}
