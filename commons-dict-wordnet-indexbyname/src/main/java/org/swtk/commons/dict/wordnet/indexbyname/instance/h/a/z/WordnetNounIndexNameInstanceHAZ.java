package org.swtk.commons.dict.wordnet.indexbyname.instance.h.a.z;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHAZ {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"hazan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09911316\"]}");
	add("{\"term\":\"hazard\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03506296\", \"11438252\", \"14565454\"]}");
	add("{\"term\":\"hazard insurance\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13367645\"]}");
	add("{\"term\":\"hazardia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11997184\"]}");
	add("{\"term\":\"hazardia cana\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11997402\"]}");
	add("{\"term\":\"hazardousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14565140\"]}");
	add("{\"term\":\"haze\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05692366\", \"11486287\"]}");
	add("{\"term\":\"hazel\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"04979870\", \"12309340\", \"12309632\", \"13164861\"]}");
	add("{\"term\":\"hazel alder\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12306417\"]}");
	add("{\"term\":\"hazel mouse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02355824\"]}");
	add("{\"term\":\"hazel tree\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13164861\"]}");
	add("{\"term\":\"hazelnut\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07788764\", \"12309340\"]}");
	add("{\"term\":\"hazelnut tree\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12309340\"]}");
	add("{\"term\":\"hazelwood\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12337499\"]}");
	add("{\"term\":\"haziness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04711464\", \"04831926\"]}");
	add("{\"term\":\"hazlitt\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11057153\"]}");
	add("{\"term\":\"hazmat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14610299\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }