package org.swtk.commons.dict.wordnet.indexbyname.instance.e.g.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceEGO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ego\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05620953\", \"05683445\", \"07524045\"]}");
	add("{\"term\":\"ego ideal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05934494\"]}");
	add("{\"term\":\"ego trip\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00374670\"]}");
	add("{\"term\":\"egocentric\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10067007\"]}");
	add("{\"term\":\"egocentrism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04842259\"]}");
	add("{\"term\":\"egoism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04842259\", \"05962130\"]}");
	add("{\"term\":\"egoist\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10067007\", \"10067267\"]}");
	add("{\"term\":\"egomania\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09205039\"]}");
	add("{\"term\":\"egomaniac\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10067179\"]}");
	add("{\"term\":\"egotism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07524045\", \"04894692\"]}");
	add("{\"term\":\"egotist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10067267\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }