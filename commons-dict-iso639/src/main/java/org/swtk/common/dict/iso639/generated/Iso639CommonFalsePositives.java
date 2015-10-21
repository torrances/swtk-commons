package org.swtk.common.dict.iso639.generated;

import java.util.Set;
import java.util.TreeSet;

import com.trimc.blogger.commons.utils.string.StringUtils;

/**
 *	Purpose:
 *	Manually derived list of common false positives
 *	when using the Iso639Db to annotate unstructured text for languages 
 */
public final class Iso639CommonFalsePositives implements Iterable<String> {

	private static Set<String> set = new TreeSet<String>();

	static {
		add("yei");
		add("yale");
		add("wan");
		add("ura");
		add("una");
		add("u");
		add("tu");
		add("tem");
		add("teen");
		add("sou");
		add("so");
		add("slave");
		add("sio");
		add("sie");
		add("shi");
		add("she");
		add("sere");
		add("sar");
		add("sam");
		add("sake");
		add("sa");
		add("rogo");
		add("reel");
		add("puri");
		add("pero");
		add("perai");
		add("pear");
		add("pare");
		add("pao");
		add("pal");
		add("oro");
		add("omi");
		add("od");
		add("notre");
		add("norn");
		add("neo");
		add("na");
		add("mono");
		add("mese");
		add("mer");
		add("median");
		add("male");
		add("lave");
		add("jad");
		add("ir");
		add("ila");
		add("hu");
		add("han");
		add("ha");
		add("gun");
		add("gogo");
		add("gen");
		add("geez");
		add("ge");
		add("gane");
		add("galeya");
		add("ga");
		add("fur");
		add("fon");
		add("even");
		add("ese");
		add("ere");
		add("ende");
		add("en");
		add("e");
		add("dem");
		add("deg");
		add("con");
		add("col");
		add("bum");
		add("bu");
		add("boor");
		add("bo");
		add("bit");
		add("bai");
		add("baba");
		add("au");
		add("ata");
		add("are");
		add("anal");
		add("ama");
		add("afar");
		add("aer");
		add("abu");
		add("abé");
	}

	private static void add(String value) {

		if (!StringUtils.hasValue(value)) return;
		value = StringUtils.trim(value).toLowerCase();

		if (!StringUtils.hasValue(value)) return;
		set.add(value);
	}

	public static boolean contains(String value) {
		return set.contains(value.toLowerCase());
	}

	@Override
	public java.util.Iterator<String> iterator() {
		return set.iterator();
	}
}
