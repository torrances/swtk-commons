package org.swtk.commons.dict.wordnet.index.name.instance.a.v.e.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceAVER {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"average\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05865563\", \"13842867\", \"06031110\"]}");
	add("{\"term\":\"averageness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04802310\", \"14524756\"]}");
	add("{\"term\":\"averment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06742248\"]}");
	add("{\"term\":\"averrhoa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12724951\"]}");
	add("{\"term\":\"averroes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10849054\"]}");
	add("{\"term\":\"aversion\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00204871\", \"07517908\"]}");
	add("{\"term\":\"averting\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00204871\", \"01079662\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }