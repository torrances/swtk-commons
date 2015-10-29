package org.swtk.commons.dict.wordnet.indexbyname.instance.h.i.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHIE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"hieracium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12002286\"]}");
	add("{\"term\":\"hieracium aurantiacum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12024283\"]}");
	add("{\"term\":\"hieracium pilocella\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12024589\"]}");
	add("{\"term\":\"hieracium praealtum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12002811\"]}");
	add("{\"term\":\"hieracium venosum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12003014\"]}");
	add("{\"term\":\"hierarch\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09826498\", \"10189530\"]}");
	add("{\"term\":\"hierarchical classification system\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05740391\"]}");
	add("{\"term\":\"hierarchical data structure\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05740218\"]}");
	add("{\"term\":\"hierarchical menu\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06505712\"]}");
	add("{\"term\":\"hierarchical structure\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05740218\"]}");
	add("{\"term\":\"hierarchy\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08392782\", \"08394537\"]}");
	add("{\"term\":\"hieratic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06373667\"]}");
	add("{\"term\":\"hieratic script\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06373667\"]}");
	add("{\"term\":\"hierocracy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08380549\"]}");
	add("{\"term\":\"hieroglyph\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06373848\", \"06415322\"]}");
	add("{\"term\":\"hieroglyphic\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06373848\", \"06415322\"]}");
	add("{\"term\":\"hierolatry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01048181\"]}");
	add("{\"term\":\"hieronymus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11103054\"]}");
	add("{\"term\":\"hieronymus bosch\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10878064\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }