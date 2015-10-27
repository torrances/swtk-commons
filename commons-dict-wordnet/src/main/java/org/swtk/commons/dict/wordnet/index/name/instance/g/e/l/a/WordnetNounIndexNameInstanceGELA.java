package org.swtk.commons.dict.wordnet.index.name.instance.g.e.l.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGELA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"gelatin\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03437578\", \"07659590\", \"14754732\"]}");
	add("{\"term\":\"gelatine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14754732\"]}");
	add("{\"term\":\"gelatinousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04943390\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }