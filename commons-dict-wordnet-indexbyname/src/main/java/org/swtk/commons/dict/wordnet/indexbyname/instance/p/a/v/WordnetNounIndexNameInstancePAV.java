package org.swtk.commons.dict.wordnet.indexbyname.instance.p.a.v;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePAV {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"pavage\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00718333\", \"13336540\"]}");
	add("{\"term\":\"pavan\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00527985\", \"07070446\"]}");
	add("{\"term\":\"pavane\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00527985\", \"07070446\"]}");
	add("{\"term\":\"pavarotti\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11247091\"]}");
	add("{\"term\":\"pave\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03906471\"]}");
	add("{\"term\":\"pavement\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04222469\", \"15002063\", \"03906828\"]}");
	add("{\"term\":\"pavilion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03907057\"]}");
	add("{\"term\":\"paving\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00718333\", \"03906828\", \"15002063\"]}");
	add("{\"term\":\"pavior\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03907307\"]}");
	add("{\"term\":\"paviour\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03907307\"]}");
	add("{\"term\":\"pavis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03907416\"]}");
	add("{\"term\":\"pavise\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03907416\"]}");
	add("{\"term\":\"pavlov\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11247196\"]}");
	add("{\"term\":\"pavlova\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07627746\", \"11247390\"]}");
	add("{\"term\":\"pavo\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01808333\", \"09410657\"]}");
	add("{\"term\":\"pavonia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12205429\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }