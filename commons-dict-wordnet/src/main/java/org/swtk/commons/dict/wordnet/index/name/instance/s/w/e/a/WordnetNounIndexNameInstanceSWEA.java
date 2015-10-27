package org.swtk.commons.dict.wordnet.index.name.instance.s.w.e.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSWEA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"swearer\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10701827\", \"10701948\"]}");
	add("{\"term\":\"swearing\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06697317\", \"07139804\"]}");
	add("{\"term\":\"swearword\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07139804\"]}");
	add("{\"term\":\"sweat\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00622867\", \"11466555\", \"14426964\", \"05413094\"]}");
	add("{\"term\":\"sweatband\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04376819\", \"04376705\"]}");
	add("{\"term\":\"sweatbox\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04376943\", \"04377060\"]}");
	add("{\"term\":\"sweater\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10438480\", \"04377135\"]}");
	add("{\"term\":\"sweating\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13556464\"]}");
	add("{\"term\":\"sweatpants\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04377375\"]}");
	add("{\"term\":\"sweats\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04377861\"]}");
	add("{\"term\":\"sweatshirt\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04377543\"]}");
	add("{\"term\":\"sweatshop\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04377687\"]}");
	add("{\"term\":\"sweatsuit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04377861\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }