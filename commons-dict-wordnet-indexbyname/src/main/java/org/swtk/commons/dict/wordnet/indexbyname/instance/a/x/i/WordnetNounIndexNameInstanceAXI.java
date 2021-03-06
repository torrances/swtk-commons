package org.swtk.commons.dict.wordnet.indexbyname.instance.a.x.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceAXI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"axial motion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07456219\"]}");
	add("{\"term\":\"axial muscle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05595181\"]}");
	add("{\"term\":\"axial rotation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07456219\"]}");
	add("{\"term\":\"axial skeleton\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05594938\"]}");
	add("{\"term\":\"axil\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13151182\"]}");
	add("{\"term\":\"axile placentation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11701862\"]}");
	add("{\"term\":\"axilla\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05557209\"]}");
	add("{\"term\":\"axillary artery\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05345714\"]}");
	add("{\"term\":\"axillary cavity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05557209\"]}");
	add("{\"term\":\"axillary fossa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05557209\"]}");
	add("{\"term\":\"axillary node\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05437877\"]}");
	add("{\"term\":\"axillary vein\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05365893\"]}");
	add("{\"term\":\"axiology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06171322\"]}");
	add("{\"term\":\"axiom\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06766264\", \"07167656\"]}");
	add("{\"term\":\"axis\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"02767619\", \"05596490\", \"08187993\", \"08188691\", \"13149530\", \"06017958\"]}");
	add("{\"term\":\"axis of rotation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02767619\"]}");
	add("{\"term\":\"axis vertebra\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05596490\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }