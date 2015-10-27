package org.swtk.commons.dict.wordnet.index.name.instance.p.o.s.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePOSS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"posse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08422447\"]}");
	add("{\"term\":\"posseman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10475957\"]}");
	add("{\"term\":\"possession\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"00811363\", \"04869236\", \"08649106\", \"09205421\", \"14431199\", \"00032912\", \"00811126\"]}");
	add("{\"term\":\"possessive\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06322842\"]}");
	add("{\"term\":\"possessiveness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04953119\"]}");
	add("{\"term\":\"possessor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10409097\"]}");
	add("{\"term\":\"posset\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07933013\"]}");
	add("{\"term\":\"possibility\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"05800018\", \"05897536\", \"14505513\", \"05960047\"]}");
	add("{\"term\":\"possible\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10476080\", \"05800200\"]}");
	add("{\"term\":\"possibleness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14505513\"]}");
	add("{\"term\":\"possum\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01883812\", \"01877569\"]}");
	add("{\"term\":\"possumwood\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12792357\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }