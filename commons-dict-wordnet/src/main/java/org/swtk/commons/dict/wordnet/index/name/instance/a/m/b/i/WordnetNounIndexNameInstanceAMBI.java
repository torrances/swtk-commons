package org.swtk.commons.dict.wordnet.index.name.instance.a.m.b.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceAMBI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ambiance\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08511143\", \"14548451\"]}");
	add("{\"term\":\"ambidexterity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05074368\"]}");
	add("{\"term\":\"ambidextrousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05074368\"]}");
	add("{\"term\":\"ambience\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08511143\", \"14548451\"]}");
	add("{\"term\":\"ambiguity\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04832345\", \"06616672\"]}");
	add("{\"term\":\"ambit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05132642\"]}");
	add("{\"term\":\"ambition\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04843499\", \"07499687\"]}");
	add("{\"term\":\"ambitiousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04843499\"]}");
	add("{\"term\":\"ambivalence\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07498445\"]}");
	add("{\"term\":\"ambivalency\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07498445\"]}");
	add("{\"term\":\"ambiversion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04629573\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }