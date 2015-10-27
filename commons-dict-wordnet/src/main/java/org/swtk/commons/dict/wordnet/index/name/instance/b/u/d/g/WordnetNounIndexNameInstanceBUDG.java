package org.swtk.commons.dict.wordnet.index.name.instance.b.u.d.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBUDG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"budge\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10890027\"]}");
	add("{\"term\":\"budgereegah\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01824510\"]}");
	add("{\"term\":\"budgerigar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01824510\"]}");
	add("{\"term\":\"budgerygah\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01824510\"]}");
	add("{\"term\":\"budget\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13442635\", \"13443005\"]}");
	add("{\"term\":\"budgie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01824510\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }