package org.swtk.commons.dict.wordnet.indexbyname.instance.j.o.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceJOC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"jocasta\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09619907\"]}");
	add("{\"term\":\"jock\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02755620\", \"09839665\"]}");
	add("{\"term\":\"jock itch\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14150001\"]}");
	add("{\"term\":\"jockey\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10242964\", \"10242847\"]}");
	add("{\"term\":\"jockey cap\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02802482\"]}");
	add("{\"term\":\"jockey club\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08246930\"]}");
	add("{\"term\":\"jockey shorts\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02904397\"]}");
	add("{\"term\":\"jockstrap\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02755620\"]}");
	add("{\"term\":\"jocoseness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04656408\"]}");
	add("{\"term\":\"jocosity\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04656408\", \"06794008\"]}");
	add("{\"term\":\"jocote\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12786803\"]}");
	add("{\"term\":\"jocularity\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00431990\", \"06794008\", \"07545071\"]}");
	add("{\"term\":\"jocundity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07545071\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }