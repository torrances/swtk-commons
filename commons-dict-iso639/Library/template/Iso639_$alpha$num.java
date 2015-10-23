package org.swtk.common.dict.iso639.generated;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.swtk.common.dict.dto.Language;
import org.swtk.common.dict.dto.adapter.LanguageAdapter;
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

	private static Map<Integer, Language> map = new HashMap<Integer, Language>();

	static {
		$content
	}

	private static void add(String line) {
		try {
			Entity entity = LanguageAdapter.transform(line);
			map.put(entity.hashCode(), entity);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Language findById(String id) {
		return Iso639Utils.findById(id, map);
	}

	public static Language findByName(String name) {
		return Iso639Utils.findByName(name, map);
	}

	public static Map<String, Collection<String>> getLanguageNamesWithVariantsAsMap() {
		return Iso639Utils.getLanguageNamesWithVariantsAsMap(map);
	}

	public static Collection<String> getLanguageNamesWithVariantsAsSet() {
		return Iso639Utils.getLanguageNamesWithVariantsAsSet(map);
	}

	public static boolean hasById(String id) {
		return null != findById(id);
	}

	public static boolean hasByName(String name) {
		return null != findByName(name);
	}
}
