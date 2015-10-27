package org.swtk.commons.dict.wordnet.index.name.instance.k.a.r.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceKARA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"karabiner\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02964126\"]}");
	add("{\"term\":\"karachi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08999581\"]}");
	add("{\"term\":\"karaites\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08111352\"]}");
	add("{\"term\":\"karakalpak\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06940628\", \"09755345\"]}");
	add("{\"term\":\"karakoram\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09346730\"]}");
	add("{\"term\":\"karakul\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02416689\"]}");
	add("{\"term\":\"karaoke\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01257889\"]}");
	add("{\"term\":\"karat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13606330\"]}");
	add("{\"term\":\"karate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00828058\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }