package org.swtk.commons.dict.wordnet.index.name.instance.b.o.l.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBOLD {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"bold\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06840269\"]}");
	add("{\"term\":\"boldface\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06840269\"]}");
	add("{\"term\":\"boldness\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04714546\", \"04845441\", \"04866016\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }