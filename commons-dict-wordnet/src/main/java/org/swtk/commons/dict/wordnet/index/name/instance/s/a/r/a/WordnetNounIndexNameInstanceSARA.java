package org.swtk.commons.dict.wordnet.index.name.instance.s.a.r.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSARA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"saraband\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00528235\", \"07071041\"]}");
	add("{\"term\":\"saracen\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"10571326\", \"10571631\", \"10571447\"]}");
	add("{\"term\":\"sarafem\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03375773\"]}");
	add("{\"term\":\"saragossa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09050049\"]}");
	add("{\"term\":\"sarah\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11301545\"]}");
	add("{\"term\":\"sarajevo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08836099\"]}");
	add("{\"term\":\"saran\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14617725\"]}");
	add("{\"term\":\"sarape\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04180968\"]}");
	add("{\"term\":\"sarasota\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09097212\"]}");
	add("{\"term\":\"sarasvati\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09551514\"]}");
	add("{\"term\":\"saratoga\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01296620\", \"02547784\"]}");
	add("{\"term\":\"saratov\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09032063\"]}");
	add("{\"term\":\"sarawak\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08987197\"]}");
	add("{\"term\":\"sarawakian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09749419\"]}");
	add("{\"term\":\"sarazen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11301672\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }