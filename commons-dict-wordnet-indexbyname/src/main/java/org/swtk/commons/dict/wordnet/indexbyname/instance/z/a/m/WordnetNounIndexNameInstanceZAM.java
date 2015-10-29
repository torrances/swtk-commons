package org.swtk.commons.dict.wordnet.indexbyname.instance.z.a.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceZAM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"zama\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01303914\"]}");
	add("{\"term\":\"zaman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11780322\"]}");
	add("{\"term\":\"zamang\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11780322\"]}");
	add("{\"term\":\"zambezi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09506259\"]}");
	add("{\"term\":\"zambezi river\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09506259\"]}");
	add("{\"term\":\"zambia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09188406\"]}");
	add("{\"term\":\"zambian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09771103\"]}");
	add("{\"term\":\"zambian kwacha\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13705683\"]}");
	add("{\"term\":\"zambian monetary unit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13705556\"]}");
	add("{\"term\":\"zamboni\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04621296\"]}");
	add("{\"term\":\"zamboorak\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08406649\"]}");
	add("{\"term\":\"zamburak\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08406649\"]}");
	add("{\"term\":\"zamburek\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08406649\"]}");
	add("{\"term\":\"zamia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11622369\"]}");
	add("{\"term\":\"zamia family\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11621938\"]}");
	add("{\"term\":\"zamia pumila\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11622542\"]}");
	add("{\"term\":\"zamiaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11621938\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }