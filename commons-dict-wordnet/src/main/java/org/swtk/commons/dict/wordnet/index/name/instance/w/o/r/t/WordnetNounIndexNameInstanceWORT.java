package org.swtk.commons.dict.wordnet.index.name.instance.w.o.r.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceWORT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"wort\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07905168\", \"13106507\"]}");
	add("{\"term\":\"worth\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"11417880\", \"05145473\", \"13786482\"]}");
	add("{\"term\":\"worthiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04813883\"]}");
	add("{\"term\":\"worthlessness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05158233\", \"05146826\"]}");
	add("{\"term\":\"worthwhileness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05146701\"]}");
	add("{\"term\":\"worthy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10812146\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }