package org.swtk.commons.dict.wordnet.indexbyname.instance.g.o.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGOS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"gosainthan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09313532\"]}");
	add("{\"term\":\"goshawk\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01609163\"]}");
	add("{\"term\":\"gosling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01858713\"]}");
	add("{\"term\":\"gosmore\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12004613\"]}");
	add("{\"term\":\"gospel\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"05971119\", \"06802268\", \"07075374\", \"06737072\", \"06466808\"]}");
	add("{\"term\":\"gospeler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10086818\"]}");
	add("{\"term\":\"gospeller\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10086818\"]}");
	add("{\"term\":\"gospels\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06466808\"]}");
	add("{\"term\":\"gossamer\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03063809\", \"03453640\"]}");
	add("{\"term\":\"gossip\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"10158867\", \"07237830\", \"07149788\"]}");
	add("{\"term\":\"gossiper\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10158867\"]}");
	add("{\"term\":\"gossiping\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07150158\"]}");
	add("{\"term\":\"gossipmonger\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10158867\"]}");
	add("{\"term\":\"gossipmongering\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07150158\"]}");
	add("{\"term\":\"gossypium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12196314\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }