package org.swtk.commons.dict.wordnet.indexbyname.instance.l.o.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLOD {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"loddon pondweed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12637391\"]}");
	add("{\"term\":\"lode\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11466163\"]}");
	add("{\"term\":\"lodestar\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05946135\", \"09365469\"]}");
	add("{\"term\":\"lodestone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14966549\"]}");
	add("{\"term\":\"lodge\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"03546876\", \"03690633\", \"03690812\", \"03690966\", \"08244135\", \"11156963\"]}");
	add("{\"term\":\"lodgement\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04784873\", \"07251287\"]}");
	add("{\"term\":\"lodgepole\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11635477\"]}");
	add("{\"term\":\"lodgepole pine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11635477\"]}");
	add("{\"term\":\"lodger\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10289155\"]}");
	add("{\"term\":\"lodging\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01056151\", \"04784873\", \"03551520\"]}");
	add("{\"term\":\"lodging house\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03691146\"]}");
	add("{\"term\":\"lodgings\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03200169\"]}");
	add("{\"term\":\"lodgment\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04784873\", \"07251287\"]}");
	add("{\"term\":\"lodine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03305852\"]}");
	add("{\"term\":\"lodz\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09006492\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }