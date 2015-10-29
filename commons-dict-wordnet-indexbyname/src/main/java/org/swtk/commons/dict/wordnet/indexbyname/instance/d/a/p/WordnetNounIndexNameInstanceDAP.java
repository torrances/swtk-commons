package org.swtk.commons.dict.wordnet.indexbyname.instance.d.a.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDAP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"daphne\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09573407\", \"12367095\"]}");
	add("{\"term\":\"daphne cneorum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12367330\"]}");
	add("{\"term\":\"daphne du maurier\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10965255\"]}");
	add("{\"term\":\"daphne family\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12366696\"]}");
	add("{\"term\":\"daphne laureola\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12367503\"]}");
	add("{\"term\":\"daphne mezereum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12367675\"]}");
	add("{\"term\":\"daphnia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01997564\"]}");
	add("{\"term\":\"dapperness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04821256\"]}");
	add("{\"term\":\"dapple\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04689819\"]}");
	add("{\"term\":\"dapsang\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09345607\"]}");
	add("{\"term\":\"dapsone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03166837\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }