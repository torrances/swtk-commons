package org.swtk.commons.dict.wordnet.indexbyname.instance.a.a.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceAAL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"aalborg\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08780076\"]}");
	add("{\"term\":\"aalii\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12761727\"]}");
	add("{\"term\":\"aalst\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08869655\"]}");
	add("{\"term\":\"aalto\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10826297\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }