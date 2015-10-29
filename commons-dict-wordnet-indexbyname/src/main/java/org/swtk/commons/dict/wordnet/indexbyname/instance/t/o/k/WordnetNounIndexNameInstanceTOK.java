package org.swtk.commons.dict.wordnet.indexbyname.instance.t.o.k;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTOK {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"tokamak\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04455456\"]}");
	add("{\"term\":\"tokay\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07776477\", \"07914870\"]}");
	add("{\"term\":\"toke\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00839626\"]}");
	add("{\"term\":\"token\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"03615483\", \"04455632\", \"06659294\", \"06808603\"]}");
	add("{\"term\":\"token economy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00704245\"]}");
	add("{\"term\":\"token money\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13406951\"]}");
	add("{\"term\":\"token payment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13321048\"]}");
	add("{\"term\":\"tokio\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08943121\"]}");
	add("{\"term\":\"toklas\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11365012\"]}");
	add("{\"term\":\"tokyo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08943121\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }