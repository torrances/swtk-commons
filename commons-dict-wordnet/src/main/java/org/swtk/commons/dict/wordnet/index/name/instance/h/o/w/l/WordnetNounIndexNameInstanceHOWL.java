package org.swtk.commons.dict.wordnet.index.name.instance.h.o.w.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHOWL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"howl\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07399967\", \"07400148\", \"07141442\"]}");
	add("{\"term\":\"howler\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00077143\", \"02495291\", \"06791764\"]}");
	add("{\"term\":\"howling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07141442\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }