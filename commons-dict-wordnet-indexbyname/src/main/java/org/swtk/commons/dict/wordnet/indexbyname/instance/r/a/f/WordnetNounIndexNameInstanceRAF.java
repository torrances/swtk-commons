package org.swtk.commons.dict.wordnet.indexbyname.instance.r.a.f;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceRAF {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"raf\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08057858\", \"08212072\"]}");
	add("{\"term\":\"raffia\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"12615507\", \"12616066\", \"15027113\"]}");
	add("{\"term\":\"raffinose\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15027246\"]}");
	add("{\"term\":\"raffle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00509683\"]}");
	add("{\"term\":\"raffles\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11272212\"]}");
	add("{\"term\":\"rafflesiaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11823587\"]}");
	add("{\"term\":\"raft\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04052867\", \"13796604\", \"04052477\"]}");
	add("{\"term\":\"rafter\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10524138\", \"04052724\"]}");
	add("{\"term\":\"raftman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10524138\"]}");
	add("{\"term\":\"rafts\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13799721\"]}");
	add("{\"term\":\"raftsman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10524138\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }