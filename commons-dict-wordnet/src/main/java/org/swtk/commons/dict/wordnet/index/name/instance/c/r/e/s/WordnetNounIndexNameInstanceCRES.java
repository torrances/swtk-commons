package org.swtk.commons.dict.wordnet.index.name.instance.c.r.e.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCRES {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"crescendo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04997743\"]}");
	add("{\"term\":\"crescent\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13918910\"]}");
	add("{\"term\":\"crescentia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12836194\"]}");
	add("{\"term\":\"cresol\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14850152\"]}");
	add("{\"term\":\"cress\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07748723\", \"11889820\"]}");
	add("{\"term\":\"crest\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"01328656\", \"03135689\", \"03143632\", \"08635538\", \"08565119\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }