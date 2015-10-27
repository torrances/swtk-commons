package org.swtk.commons.dict.wordnet.index.name.instance.s.i.c.k;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSICK {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"sick\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07967004\"]}");
	add("{\"term\":\"sickbag\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04220010\"]}");
	add("{\"term\":\"sickbay\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04220172\"]}");
	add("{\"term\":\"sickbed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04220331\"]}");
	add("{\"term\":\"sickeningness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05003736\"]}");
	add("{\"term\":\"sickle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04220420\"]}");
	add("{\"term\":\"sicklepod\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11892793\", \"12521023\"]}");
	add("{\"term\":\"sickness\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"14383357\", \"14496638\", \"14085287\"]}");
	add("{\"term\":\"sickroom\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04220597\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }