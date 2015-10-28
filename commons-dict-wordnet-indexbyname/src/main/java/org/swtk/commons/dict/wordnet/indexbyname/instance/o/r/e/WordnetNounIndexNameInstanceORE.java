package org.swtk.commons.dict.wordnet.indexbyname.instance.o.r.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceORE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ore\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13704555\", \"14712661\"]}");
	add("{\"term\":\"oread\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09572772\"]}");
	add("{\"term\":\"oreamnos\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02420987\"]}");
	add("{\"term\":\"orectolobidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01488882\"]}");
	add("{\"term\":\"orectolobus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01489052\"]}");
	add("{\"term\":\"oregano\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07834971\", \"12874047\"]}");
	add("{\"term\":\"oregon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09155698\"]}");
	add("{\"term\":\"oregonian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09764560\"]}");
	add("{\"term\":\"oreide\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14712866\"]}");
	add("{\"term\":\"oreo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07652901\"]}");
	add("{\"term\":\"oreopteris\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13250256\"]}");
	add("{\"term\":\"oreortyx\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01811088\"]}");
	add("{\"term\":\"orestes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09619131\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }