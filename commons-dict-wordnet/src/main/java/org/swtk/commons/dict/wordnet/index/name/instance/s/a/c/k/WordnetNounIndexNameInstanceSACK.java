package org.swtk.commons.dict.wordnet.index.name.instance.s.a.c.k;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSACK {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"sack\", \"synsetCount\":9, \"upperType\":\"NOUN\", \"ids\":[\"00217041\", \"00969550\", \"03017092\", \"03487335\", \"04130120\", \"07913950\", \"13791346\", \"13937488\", \"04129919\"]}");
	add("{\"term\":\"sackbut\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04130217\"]}");
	add("{\"term\":\"sackcloth\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04130322\", \"04130411\"]}");
	add("{\"term\":\"sackful\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13791346\"]}");
	add("{\"term\":\"sacking\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00217041\", \"04130661\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }