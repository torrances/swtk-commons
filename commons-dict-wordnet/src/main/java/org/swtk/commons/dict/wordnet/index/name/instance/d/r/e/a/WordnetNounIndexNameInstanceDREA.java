package org.swtk.commons.dict.wordnet.index.name.instance.d.r.e.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDREA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"dread\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07536913\"]}");
	add("{\"term\":\"dreadfulness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04789380\"]}");
	add("{\"term\":\"dreadlock\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05266226\"]}");
	add("{\"term\":\"dreadnaught\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03240796\"]}");
	add("{\"term\":\"dreadnought\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03240796\"]}");
	add("{\"term\":\"dream\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"14483299\", \"05708890\", \"05640577\", \"07499687\", \"05776803\", \"05776550\"]}");
	add("{\"term\":\"dreamer\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"10082803\", \"10216584\", \"10052712\"]}");
	add("{\"term\":\"dreaminess\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07531461\"]}");
	add("{\"term\":\"dreaming\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05776550\", \"05776803\"]}");
	add("{\"term\":\"dreamland\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05639087\"]}");
	add("{\"term\":\"dreamworld\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05639087\"]}");
	add("{\"term\":\"dreariness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05213274\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }