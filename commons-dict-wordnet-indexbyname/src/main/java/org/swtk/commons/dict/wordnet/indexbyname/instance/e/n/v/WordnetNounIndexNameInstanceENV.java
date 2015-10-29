package org.swtk.commons.dict.wordnet.indexbyname.instance.e.n.v;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceENV {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"envelope\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"03296874\", \"05211741\", \"09296682\", \"13892427\", \"03296652\", \"03296730\"]}");
	add("{\"term\":\"envelopment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00322782\"]}");
	add("{\"term\":\"enviousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07565182\"]}");
	add("{\"term\":\"environment\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08584764\", \"13957629\"]}");
	add("{\"term\":\"environmental condition\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14540103\"]}");
	add("{\"term\":\"environmental protection agency\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08139934\"]}");
	add("{\"term\":\"environmental science\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06080479\"]}");
	add("{\"term\":\"environmentalism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00277033\", \"05979431\"]}");
	add("{\"term\":\"environmentalist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10080429\"]}");
	add("{\"term\":\"environs\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08557020\", \"08584764\"]}");
	add("{\"term\":\"envisioning\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05776412\"]}");
	add("{\"term\":\"envoi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06396014\"]}");
	add("{\"term\":\"envoy\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06396014\", \"10072502\", \"10080851\"]}");
	add("{\"term\":\"envoy extraordinary\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10080851\"]}");
	add("{\"term\":\"envy\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00759688\", \"07565182\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }