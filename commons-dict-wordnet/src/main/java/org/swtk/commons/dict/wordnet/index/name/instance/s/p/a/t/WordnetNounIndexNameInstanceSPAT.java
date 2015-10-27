package org.swtk.commons.dict.wordnet.index.name.instance.s.p.a.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSPAT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"spat\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01958985\", \"04276932\", \"07199395\"]}");
	add("{\"term\":\"spatangoida\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02322341\"]}");
	add("{\"term\":\"spatchcock\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07661495\"]}");
	add("{\"term\":\"spate\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07421737\", \"07454840\", \"13796604\"]}");
	add("{\"term\":\"spathe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13175970\"]}");
	add("{\"term\":\"spathiphyllum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11812810\"]}");
	add("{\"term\":\"spatiality\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05069917\"]}");
	add("{\"term\":\"spatter\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00719000\", \"07409414\"]}");
	add("{\"term\":\"spatterdock\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11736891\"]}");
	add("{\"term\":\"spattering\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00719000\", \"07409414\"]}");
	add("{\"term\":\"spatula\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04277054\", \"04277257\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }