package org.swtk.commons.dict.wiktionary;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.swtk.common.framework.type.Alpha;

public final class WiktionaryTerms {

	public static Collection<String> terms() {
		Set<String> set = new TreeSet<String>();

		for (Alpha alpha : Alpha.values())
			set.addAll(terms(alpha));

		return set;
	}

	public static Collection<String> terms(Alpha alpha) {
		return null;
	}

	public static Map<Alpha, Collection<String>> termsByAlpha() {
		Map<Alpha, Collection<String>> map = new TreeMap<Alpha, Collection<String>>();

		for (Alpha alpha : Alpha.values())
			map.put(alpha, terms(alpha));

		return map;
	}
}
