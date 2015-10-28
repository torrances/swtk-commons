package org.swtk.commons.dict.wordnet.indexbyname.instance.c.o.f;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCOF {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"cofactor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14824876\"]}");
	add("{\"term\":\"coffea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12683415\"]}");
	add("{\"term\":\"coffee\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"04979718\", \"07945591\", \"12683533\", \"07945759\"]}");
	add("{\"term\":\"coffeeberry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13162959\"]}");
	add("{\"term\":\"coffeecake\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07646121\"]}");
	add("{\"term\":\"coffeehouse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02939042\"]}");
	add("{\"term\":\"coffeepot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03067692\"]}");
	add("{\"term\":\"coffer\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03068353\", \"03068446\"]}");
	add("{\"term\":\"cofferdam\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02940477\"]}");
	add("{\"term\":\"coffin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03068762\"]}");
	add("{\"term\":\"cofounder\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09633203\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }