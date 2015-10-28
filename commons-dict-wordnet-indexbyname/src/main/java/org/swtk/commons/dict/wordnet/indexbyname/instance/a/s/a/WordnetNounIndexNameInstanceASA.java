package org.swtk.commons.dict.wordnet.indexbyname.instance.a.s.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceASA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"asadha\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15245063\"]}");
	add("{\"term\":\"asafetida\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14793168\"]}");
	add("{\"term\":\"asafoetida\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14793168\"]}");
	add("{\"term\":\"asahikawa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08942950\"]}");
	add("{\"term\":\"asala\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08033138\"]}");
	add("{\"term\":\"asama\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08946454\"]}");
	add("{\"term\":\"asamiya\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06983458\"]}");
	add("{\"term\":\"asana\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05089164\"]}");
	add("{\"term\":\"asanga\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10845011\"]}");
	add("{\"term\":\"asarabacca\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11823464\"]}");
	add("{\"term\":\"asarh\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15245063\"]}");
	add("{\"term\":\"asarum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11822545\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }