package org.swtk.commons.dict.wordnet.index.name.instance.a.l.b.u;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceALBU {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"albuca\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12450275\"]}");
	add("{\"term\":\"albuginaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13002355\"]}");
	add("{\"term\":\"albuginea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05614283\"]}");
	add("{\"term\":\"albugo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13002551\"]}");
	add("{\"term\":\"albula\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02544914\"]}");
	add("{\"term\":\"albulidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02544793\"]}");
	add("{\"term\":\"album\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02697938\", \"06604096\"]}");
	add("{\"term\":\"albumen\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07857013\", \"14755688\"]}");
	add("{\"term\":\"albumin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14755688\"]}");
	add("{\"term\":\"albuminoid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15051283\"]}");
	add("{\"term\":\"albuminuria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14289460\"]}");
	add("{\"term\":\"albuquerque\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09137975\"]}");
	add("{\"term\":\"albuterol\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02698180\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }