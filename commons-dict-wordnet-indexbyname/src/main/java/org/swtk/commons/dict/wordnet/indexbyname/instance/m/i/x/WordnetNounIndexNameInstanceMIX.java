package org.swtk.commons.dict.wordnet.indexbyname.instance.m.i.x;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMIX {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"mix\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00380891\", \"07389356\", \"07898861\"]}");
	add("{\"term\":\"mixed bag\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08415730\"]}");
	add("{\"term\":\"mixed bud\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13186450\"]}");
	add("{\"term\":\"mixed drink\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07927611\"]}");
	add("{\"term\":\"mixed economy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08382149\"]}");
	add("{\"term\":\"mixed farming\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00921210\"]}");
	add("{\"term\":\"mixed marriage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08006600\"]}");
	add("{\"term\":\"mixed metaphor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07122066\"]}");
	add("{\"term\":\"mixed nuisance\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05839594\"]}");
	add("{\"term\":\"mixer\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"03780732\", \"03780921\", \"07929420\", \"08273290\"]}");
	add("{\"term\":\"mixing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00380891\"]}");
	add("{\"term\":\"mixing bowl\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03781079\"]}");
	add("{\"term\":\"mixing faucet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03781169\"]}");
	add("{\"term\":\"mixologist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09860576\"]}");
	add("{\"term\":\"mixology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05646623\"]}");
	add("{\"term\":\"mixture\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"00380891\", \"07389356\", \"08415730\", \"07898472\", \"14610438\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }