package org.swtk.commons.dict.wordnet.indexbyname.instance.h.e.y;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHEY {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"heyday\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15320288\"]}");
	add("{\"term\":\"heyerdahl\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11068581\"]}");
	add("{\"term\":\"heyrovsky\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11068734\"]}");
	add("{\"term\":\"heyse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11068874\"]}");
	add("{\"term\":\"heyward\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11068996\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }