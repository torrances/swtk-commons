package org.swtk.commons.dict.wordnet.index.name.instance.d.e.n.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDENT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"dent\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04700732\", \"13927849\", \"11433775\"]}");
	add("{\"term\":\"dental\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07130201\"]}");
	add("{\"term\":\"dentaria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11902032\"]}");
	add("{\"term\":\"denticle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02158683\"]}");
	add("{\"term\":\"dentifrice\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03180750\"]}");
	add("{\"term\":\"dentin\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05281945\", \"14781561\"]}");
	add("{\"term\":\"dentine\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05281945\", \"14781561\"]}");
	add("{\"term\":\"dentist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10023944\"]}");
	add("{\"term\":\"dentistry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06056961\"]}");
	add("{\"term\":\"dentition\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05289932\", \"13586984\"]}");
	add("{\"term\":\"denture\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03181052\"]}");
	add("{\"term\":\"denturist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10023681\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }