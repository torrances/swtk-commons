package org.swtk.commons.dict.wordnet.index.name.instance.m.e.a.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMEAD {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"mead\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07906725\", \"11190113\", \"11190238\"]}");
	add("{\"term\":\"meade\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11190428\", \"11190594\"]}");
	add("{\"term\":\"meadow\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08588163\"]}");
	add("{\"term\":\"meadowgrass\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12152067\"]}");
	add("{\"term\":\"meadowlark\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01575715\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }