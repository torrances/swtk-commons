package org.swtk.commons.dict.wordnet.indexbyname.instance.a.v.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceAVE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"avena\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12130236\"]}");
	add("{\"term\":\"avenger\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09845476\"]}");
	add("{\"term\":\"avens\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12652092\"]}");
	add("{\"term\":\"aventail\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02945300\"]}");
	add("{\"term\":\"aventurine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15089127\"]}");
	add("{\"term\":\"avenue\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02766477\", \"00943420\"]}");
	add("{\"term\":\"average\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05865563\", \"13842867\", \"06031110\"]}");
	add("{\"term\":\"averageness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04802310\", \"14524756\"]}");
	add("{\"term\":\"averment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06742248\"]}");
	add("{\"term\":\"averrhoa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12724951\"]}");
	add("{\"term\":\"averroes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10849054\"]}");
	add("{\"term\":\"aversion\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00204871\", \"07517908\"]}");
	add("{\"term\":\"averting\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00204871\", \"01079662\"]}");
	add("{\"term\":\"aves\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01504903\"]}");
	add("{\"term\":\"avesta\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06442666\"]}");
	add("{\"term\":\"avestan\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06363708\", \"06986601\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }