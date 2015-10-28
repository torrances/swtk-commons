package org.swtk.commons.dict.wordnet.indexbyname.instance.o.d.y;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceODY {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"odynophagia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14352865\"]}");
	add("{\"term\":\"odysseus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09616022\"]}");
	add("{\"term\":\"odyssey\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06393816\", \"00309105\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }