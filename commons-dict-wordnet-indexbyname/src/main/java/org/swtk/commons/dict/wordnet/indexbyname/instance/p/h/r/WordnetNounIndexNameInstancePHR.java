package org.swtk.commons.dict.wordnet.indexbyname.instance.p.h.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePHR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"phragmacone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01907606\"]}");
	add("{\"term\":\"phragmipedium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12098006\"]}");
	add("{\"term\":\"phragmites\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12151276\"]}");
	add("{\"term\":\"phragmocone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01907606\"]}");
	add("{\"term\":\"phrase\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00528098\", \"07169038\", \"07059411\", \"06327041\"]}");
	add("{\"term\":\"phraseology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07095931\"]}");
	add("{\"term\":\"phrasing\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07095931\", \"01014550\"]}");
	add("{\"term\":\"phratry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07987168\"]}");
	add("{\"term\":\"phrenitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14365537\"]}");
	add("{\"term\":\"phrenologist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10447231\"]}");
	add("{\"term\":\"phrenology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06055378\"]}");
	add("{\"term\":\"phrontistery\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03933890\"]}");
	add("{\"term\":\"phrygia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08719224\"]}");
	add("{\"term\":\"phrygian\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06956140\", \"10447422\"]}");
	add("{\"term\":\"phrynosoma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01684453\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }