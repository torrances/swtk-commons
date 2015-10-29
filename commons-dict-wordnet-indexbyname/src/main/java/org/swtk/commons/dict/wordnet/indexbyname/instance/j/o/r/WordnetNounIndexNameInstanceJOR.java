package org.swtk.commons.dict.wordnet.indexbyname.instance.j.o.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceJOR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"jordan\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08946959\", \"09344807\"]}");
	add("{\"term\":\"jordan almond\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07766712\", \"12666833\"]}");
	add("{\"term\":\"jordan curve\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13891010\"]}");
	add("{\"term\":\"jordan river\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09344807\"]}");
	add("{\"term\":\"jordanella\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01450463\"]}");
	add("{\"term\":\"jordanella floridae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01450587\"]}");
	add("{\"term\":\"jordanian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09738207\"]}");
	add("{\"term\":\"jordanian dinar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13691695\"]}");
	add("{\"term\":\"jordanian monetary unit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13691584\"]}");
	add("{\"term\":\"jorge borges\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10877293\"]}");
	add("{\"term\":\"jorge luis borges\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10877293\"]}");
	add("{\"term\":\"jorge mario pedro vargas llosa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11380890\"]}");
	add("{\"term\":\"joroslav heyrovsky\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11068734\"]}");
	add("{\"term\":\"jorum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03607407\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }