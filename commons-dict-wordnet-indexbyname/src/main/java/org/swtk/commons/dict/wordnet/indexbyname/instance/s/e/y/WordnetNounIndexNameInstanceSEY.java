package org.swtk.commons.dict.wordnet.indexbyname.instance.s.e.y;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSEY {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"seychelles\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09018654\", \"09018853\"]}");
	add("{\"term\":\"seychelles islands\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09018654\"]}");
	add("{\"term\":\"seychelles monetary unit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13727142\"]}");
	add("{\"term\":\"seychelles rupee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13727258\"]}");
	add("{\"term\":\"seychellois\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09750293\"]}");
	add("{\"term\":\"seyhan\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09062950\", \"09454037\"]}");
	add("{\"term\":\"seyhan river\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09454037\"]}");
	add("{\"term\":\"seymour\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11314670\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }