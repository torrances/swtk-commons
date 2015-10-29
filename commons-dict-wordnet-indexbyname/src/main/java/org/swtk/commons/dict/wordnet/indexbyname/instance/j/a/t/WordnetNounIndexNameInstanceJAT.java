package org.swtk.commons.dict.wordnet.indexbyname.instance.j.a.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceJAT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"jat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10239549\"]}");
	add("{\"term\":\"jati\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08323301\"]}");
	add("{\"term\":\"jatropha\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12946154\"]}");
	add("{\"term\":\"jatropha curcus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12946343\"]}");
	add("{\"term\":\"jatropha stimulosus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12945939\"]}");
	add("{\"term\":\"jatropha urens\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12945939\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }