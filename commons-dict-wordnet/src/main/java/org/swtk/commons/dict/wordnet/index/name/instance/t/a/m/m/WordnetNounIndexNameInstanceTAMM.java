package org.swtk.commons.dict.wordnet.index.name.instance.t.a.m.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTAMM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"tamm\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11350223\"]}");
	add("{\"term\":\"tammany\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08064794\"]}");
	add("{\"term\":\"tammerfors\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08798232\"]}");
	add("{\"term\":\"tammuz\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09540627\", \"15241182\"]}");
	add("{\"term\":\"tammy\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04394182\", \"04394618\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }