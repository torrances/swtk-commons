package org.swtk.commons.dict.wordnet.indexbyname.instance.s.k.u;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSKU {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"skua\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02047432\"]}");
	add("{\"term\":\"skuld\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09606020\"]}");
	add("{\"term\":\"skulduggery\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06773433\"]}");
	add("{\"term\":\"skulker\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10297049\", \"10306236\"]}");
	add("{\"term\":\"skulking\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00742570\"]}");
	add("{\"term\":\"skull\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05547754\"]}");
	add("{\"term\":\"skull and crossbones\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04239143\"]}");
	add("{\"term\":\"skull practice\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00897812\"]}");
	add("{\"term\":\"skull session\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00897812\", \"07162441\"]}");
	add("{\"term\":\"skullcap\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05548040\", \"12888586\", \"04239262\"]}");
	add("{\"term\":\"skullduggery\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06773433\"]}");
	add("{\"term\":\"skunk\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"02448346\", \"03997192\", \"07491635\", \"10559272\"]}");
	add("{\"term\":\"skunk bear\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02451814\"]}");
	add("{\"term\":\"skunk cabbage\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11809535\", \"11813211\"]}");
	add("{\"term\":\"skunkbush\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12785267\"]}");
	add("{\"term\":\"skunkweed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12830911\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }