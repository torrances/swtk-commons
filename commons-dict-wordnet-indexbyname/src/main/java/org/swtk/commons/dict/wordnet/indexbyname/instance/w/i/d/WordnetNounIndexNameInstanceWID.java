package org.swtk.commons.dict.wordnet.indexbyname.instance.w.i.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceWID {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"widal test\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05748107\"]}");
	add("{\"term\":\"wide area network\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04590763\"]}");
	add("{\"term\":\"wide screen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04591062\"]}");
	add("{\"term\":\"wide wale\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04591174\"]}");
	add("{\"term\":\"widebody aircraft\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04590906\"]}");
	add("{\"term\":\"widegrip pushup\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00630736\"]}");
	add("{\"term\":\"wideness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05111848\", \"05143608\"]}");
	add("{\"term\":\"widening\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00408091\", \"04508161\", \"13596007\"]}");
	add("{\"term\":\"widgeon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01851289\"]}");
	add("{\"term\":\"widget\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02732963\", \"03223248\"]}");
	add("{\"term\":\"widow\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10799960\"]}");
	add("{\"term\":\"widow bird\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01546024\"]}");
	add("{\"term\":\"widow woman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10799960\"]}");
	add("{\"term\":\"widower\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10800182\"]}");
	add("{\"term\":\"widowhood\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13991417\", \"15178627\"]}");
	add("{\"term\":\"widowman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10800182\"]}");
	add("{\"term\":\"width\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05143415\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }