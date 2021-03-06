package org.swtk.commons.dict.wordnet.indexbyname.instance.s.o.y;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSOY {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"soy\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"07745461\", \"07841948\", \"12552673\", \"12553069\"]}");
	add("{\"term\":\"soy flour\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07585438\"]}");
	add("{\"term\":\"soy sauce\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07841948\"]}");
	add("{\"term\":\"soya\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07745461\", \"12552673\"]}");
	add("{\"term\":\"soya bean\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07745461\", \"12552673\", \"12553069\"]}");
	add("{\"term\":\"soya milk\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07860843\"]}");
	add("{\"term\":\"soyabean oil\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07691007\"]}");
	add("{\"term\":\"soybean\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07745461\", \"12552673\", \"12553069\"]}");
	add("{\"term\":\"soybean flour\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07585438\"]}");
	add("{\"term\":\"soybean future\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04271595\"]}");
	add("{\"term\":\"soybean meal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07585438\"]}");
	add("{\"term\":\"soybean milk\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07860843\"]}");
	add("{\"term\":\"soybean oil\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07691007\"]}");
	add("{\"term\":\"soybean plant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12552673\"]}");
	add("{\"term\":\"soymilk\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07860843\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }