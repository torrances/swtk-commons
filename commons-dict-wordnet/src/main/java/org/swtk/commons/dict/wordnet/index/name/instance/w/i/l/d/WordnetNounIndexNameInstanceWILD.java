package org.swtk.commons.dict.wordnet.index.name.instance.w.i.l.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceWILD {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"wild\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08701286\", \"13962386\"]}");
	add("{\"term\":\"wildcat\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"02127275\", \"09864997\", \"04591925\"]}");
	add("{\"term\":\"wildcatter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10801223\"]}");
	add("{\"term\":\"wilde\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11406341\"]}");
	add("{\"term\":\"wildebeest\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02424095\"]}");
	add("{\"term\":\"wilder\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11406498\", \"11406687\"]}");
	add("{\"term\":\"wilderness\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"05124030\", \"08701286\", \"09502554\", \"14437235\"]}");
	add("{\"term\":\"wildfire\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07319371\"]}");
	add("{\"term\":\"wildflower\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11692851\"]}");
	add("{\"term\":\"wildfowl\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07662536\"]}");
	add("{\"term\":\"wilding\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00555763\", \"11551644\"]}");
	add("{\"term\":\"wildlife\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08010218\"]}");
	add("{\"term\":\"wildness\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"04915003\", \"04917064\", \"05044968\", \"07496363\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }