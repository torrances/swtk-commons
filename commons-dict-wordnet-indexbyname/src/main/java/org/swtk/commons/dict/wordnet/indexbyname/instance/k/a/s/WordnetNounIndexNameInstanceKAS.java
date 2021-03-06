package org.swtk.commons.dict.wordnet.indexbyname.instance.k.a.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceKAS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"kasai\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09347380\"]}");
	add("{\"term\":\"kasai river\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09347380\"]}");
	add("{\"term\":\"kasbah\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08645716\"]}");
	add("{\"term\":\"kasha\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07720324\"]}");
	add("{\"term\":\"kashag\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08399916\"]}");
	add("{\"term\":\"kashmir\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08997987\"]}");
	add("{\"term\":\"kashmir goat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02419888\"]}");
	add("{\"term\":\"kashmiri\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06985534\", \"09695506\"]}");
	add("{\"term\":\"kaspar friedrich wolff\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11414843\"]}");
	add("{\"term\":\"kasparov\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11117325\"]}");
	add("{\"term\":\"kassite\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06981275\", \"09661556\"]}");
	add("{\"term\":\"kastler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11117515\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }