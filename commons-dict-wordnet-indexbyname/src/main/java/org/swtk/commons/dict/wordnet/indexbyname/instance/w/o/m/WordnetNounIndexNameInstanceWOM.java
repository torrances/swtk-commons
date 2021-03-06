package org.swtk.commons.dict.wordnet.indexbyname.instance.w.o.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceWOM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"woman\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"08494645\", \"09930684\", \"10808492\", \"10807146\"]}");
	add("{\"term\":\"woman chaser\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10806873\"]}");
	add("{\"term\":\"woman hater\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10342306\"]}");
	add("{\"term\":\"woman of the house\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10209395\"]}");
	add("{\"term\":\"woman of the street\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10505025\"]}");
	add("{\"term\":\"womanhood\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00607121\", \"08494645\", \"14449119\"]}");
	add("{\"term\":\"womaniser\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10808758\"]}");
	add("{\"term\":\"womanishness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04675496\"]}");
	add("{\"term\":\"womanizer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10808758\"]}");
	add("{\"term\":\"womankind\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08494923\"]}");
	add("{\"term\":\"womanlike\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04675017\"]}");
	add("{\"term\":\"womanliness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04675017\"]}");
	add("{\"term\":\"womb\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05526736\"]}");
	add("{\"term\":\"wombat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01885711\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }