package org.swtk.commons.dict.wordnet.indexbyname.instance.w.a.x;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceWAX {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"wax\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15118861\"]}");
	add("{\"term\":\"wax bean\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07744684\", \"12578061\"]}");
	add("{\"term\":\"wax begonia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12382791\"]}");
	add("{\"term\":\"wax crayon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03132899\"]}");
	add("{\"term\":\"wax figure\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04571867\"]}");
	add("{\"term\":\"wax insect\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02251908\"]}");
	add("{\"term\":\"wax light\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02951508\"]}");
	add("{\"term\":\"wax mallow\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12204612\"]}");
	add("{\"term\":\"wax moth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02291959\"]}");
	add("{\"term\":\"wax myrtle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11761819\"]}");
	add("{\"term\":\"wax palm\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"12608248\", \"12609081\", \"12609541\"]}");
	add("{\"term\":\"wax paper\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15121228\"]}");
	add("{\"term\":\"wax plant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13258086\"]}");
	add("{\"term\":\"waxberry\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11762266\", \"12698373\"]}");
	add("{\"term\":\"waxflower\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"12279402\", \"12386703\", \"13260075\"]}");
	add("{\"term\":\"waxiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05223508\"]}");
	add("{\"term\":\"waxing\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07429166\", \"00720640\"]}");
	add("{\"term\":\"waxmallow\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12204612\"]}");
	add("{\"term\":\"waxwing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01606241\"]}");
	add("{\"term\":\"waxwork\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04571867\", \"12769008\"]}");
	add("{\"term\":\"waxycap\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13091068\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }