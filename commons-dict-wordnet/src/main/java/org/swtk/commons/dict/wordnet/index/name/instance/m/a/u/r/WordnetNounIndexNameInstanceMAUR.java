package org.swtk.commons.dict.wordnet.index.name.instance.m.a.u.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMAUR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"mauriac\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11185509\"]}");
	add("{\"term\":\"mauritania\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08989171\"]}");
	add("{\"term\":\"mauritanian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09741795\"]}");
	add("{\"term\":\"mauritanie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08989171\"]}");
	add("{\"term\":\"mauritian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09741926\"]}");
	add("{\"term\":\"mauritius\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08989680\", \"08989835\"]}");
	add("{\"term\":\"maurois\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11185702\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }