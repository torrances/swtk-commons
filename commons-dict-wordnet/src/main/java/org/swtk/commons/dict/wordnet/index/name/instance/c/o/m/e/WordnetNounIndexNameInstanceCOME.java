package org.swtk.commons.dict.wordnet.index.name.instance.c.o.m.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCOME {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"come\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05411679\"]}");
	add("{\"term\":\"comeback\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00051897\", \"07214582\"]}");
	add("{\"term\":\"comedian\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09960183\", \"09959604\"]}");
	add("{\"term\":\"comedienne\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09960276\", \"09960445\"]}");
	add("{\"term\":\"comedo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05253118\"]}");
	add("{\"term\":\"comedown\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00274445\"]}");
	add("{\"term\":\"comedy\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06794240\", \"07028624\"]}");
	add("{\"term\":\"comeliness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04692745\"]}");
	add("{\"term\":\"comenius\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10925320\"]}");
	add("{\"term\":\"comer\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09829571\", \"09960547\"]}");
	add("{\"term\":\"comestible\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07572202\"]}");
	add("{\"term\":\"comet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09274313\"]}");
	add("{\"term\":\"comeupance\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07309129\"]}");
	add("{\"term\":\"comeuppance\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07309129\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }