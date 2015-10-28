package org.swtk.commons.dict.wordnet.indexbyname.instance.s.a.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSAD {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"sadat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11297890\"]}");
	add("{\"term\":\"saddam\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11088391\"]}");
	add("{\"term\":\"saddhu\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10565239\"]}");
	add("{\"term\":\"saddle\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"01897860\", \"02839120\", \"04131081\", \"07683381\", \"09441688\", \"04130834\"]}");
	add("{\"term\":\"saddleback\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03414501\", \"09441688\"]}");
	add("{\"term\":\"saddlebag\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04131199\"]}");
	add("{\"term\":\"saddlebill\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02006785\"]}");
	add("{\"term\":\"saddlebow\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03986536\"]}");
	add("{\"term\":\"saddlecloth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04131303\"]}");
	add("{\"term\":\"saddler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10564972\"]}");
	add("{\"term\":\"saddlery\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04131589\", \"04302219\"]}");
	add("{\"term\":\"sadducee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10565081\"]}");
	add("{\"term\":\"sade\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11298110\"]}");
	add("{\"term\":\"sadhe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06851593\"]}");
	add("{\"term\":\"sadhu\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10565239\"]}");
	add("{\"term\":\"sadism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07508970\"]}");
	add("{\"term\":\"sadist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10565349\"]}");
	add("{\"term\":\"sadleria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13206718\"]}");
	add("{\"term\":\"sadness\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04638827\", \"14012536\", \"07547828\"]}");
	add("{\"term\":\"sadomasochism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07509158\"]}");
	add("{\"term\":\"sadomasochist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10565497\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }