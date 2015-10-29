package org.swtk.commons.dict.wordnet.indexbyname.instance.m.a.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMAP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"map\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13806028\", \"03725654\"]}");
	add("{\"term\":\"map collection\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06438756\"]}");
	add("{\"term\":\"map maker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09917667\"]}");
	add("{\"term\":\"map projection\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03725934\"]}");
	add("{\"term\":\"mapinguari\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02462267\"]}");
	add("{\"term\":\"maple\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12772965\", \"12773426\"]}");
	add("{\"term\":\"maple family\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12772583\"]}");
	add("{\"term\":\"maple sugar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14971840\"]}");
	add("{\"term\":\"maple syrup\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07876423\"]}");
	add("{\"term\":\"maple syrup urine disease\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14183369\"]}");
	add("{\"term\":\"mapmaking\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00926393\"]}");
	add("{\"term\":\"mapper\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10462147\"]}");
	add("{\"term\":\"mapping\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01026585\", \"13806028\"]}");
	add("{\"term\":\"mapquest\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06590703\"]}");
	add("{\"term\":\"maputo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08993905\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }