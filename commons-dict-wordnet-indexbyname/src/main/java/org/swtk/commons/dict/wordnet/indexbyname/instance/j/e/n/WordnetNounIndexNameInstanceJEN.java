package org.swtk.commons.dict.wordnet.indexbyname.instance.j.e.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceJEN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"je ne sais quoi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03600372\"]}");
	add("{\"term\":\"jena\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01284782\"]}");
	add("{\"term\":\"jenghiz khan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11014304\"]}");
	add("{\"term\":\"jenner\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11102125\"]}");
	add("{\"term\":\"jennet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02392667\"]}");
	add("{\"term\":\"jenny\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02392667\", \"11102343\"]}");
	add("{\"term\":\"jenny ass\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02392667\"]}");
	add("{\"term\":\"jenny lind\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11152758\"]}");
	add("{\"term\":\"jenny wren\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01586866\"]}");
	add("{\"term\":\"jens otto harry jespersen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11103517\"]}");
	add("{\"term\":\"jensen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11102525\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }