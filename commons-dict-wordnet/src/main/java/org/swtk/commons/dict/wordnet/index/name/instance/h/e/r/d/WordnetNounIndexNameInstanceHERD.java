package org.swtk.commons.dict.wordnet.index.name.instance.h.e.r.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHERD {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"herd\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"08199964\", \"08010997\", \"08010773\"]}");
	add("{\"term\":\"herder\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10191239\", \"11064784\"]}");
	add("{\"term\":\"herdsman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10191239\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }