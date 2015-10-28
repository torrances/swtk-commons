package org.swtk.commons.dict.wordnet.indexbyname.instance.s.c.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSCE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"sceliphron\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02218148\"]}");
	add("{\"term\":\"sceloglaux\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01627628\"]}");
	add("{\"term\":\"sceloporus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01682778\"]}");
	add("{\"term\":\"scenario\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06768822\", \"08585959\", \"07025251\"]}");
	add("{\"term\":\"scenarist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10575364\"]}");
	add("{\"term\":\"scene\", \"synsetCount\":10, \"upperType\":\"NOUN\", \"ids\":[\"04152121\", \"08585785\", \"04151847\", \"14429707\", \"07022924\", \"13960108\", \"06627082\", \"05941982\", \"07375441\", \"08663538\"]}");
	add("{\"term\":\"scenery\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08664362\", \"04152121\"]}");
	add("{\"term\":\"sceneshifter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10575552\"]}");
	add("{\"term\":\"scent\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04987257\", \"05722108\", \"05722413\"]}");
	add("{\"term\":\"scepter\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07282278\", \"14467142\"]}");
	add("{\"term\":\"sceptic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10624042\"]}");
	add("{\"term\":\"scepticism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05988918\"]}");
	add("{\"term\":\"sceptre\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07282278\", \"14467142\"]}");
	add("{\"term\":\"scet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15156400\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }