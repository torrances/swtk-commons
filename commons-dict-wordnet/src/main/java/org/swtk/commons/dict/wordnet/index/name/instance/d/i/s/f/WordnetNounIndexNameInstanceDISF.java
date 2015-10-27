package org.swtk.commons.dict.wordnet.index.name.instance.d.i.s.f;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDISF {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"disfavor\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06210476\", \"14437048\"]}");
	add("{\"term\":\"disfavour\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06210476\", \"14437048\"]}");
	add("{\"term\":\"disfiguration\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00404274\", \"04698526\"]}");
	add("{\"term\":\"disfigurement\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00404274\", \"04698526\"]}");
	add("{\"term\":\"disfluency\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05650917\"]}");
	add("{\"term\":\"disforestation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01264934\"]}");
	add("{\"term\":\"disfranchisement\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01024766\"]}");
	add("{\"term\":\"disfunction\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14581490\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }