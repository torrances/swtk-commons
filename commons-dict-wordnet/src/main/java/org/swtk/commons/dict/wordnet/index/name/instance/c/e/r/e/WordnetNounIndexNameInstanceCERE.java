package org.swtk.commons.dict.wordnet.index.name.instance.c.e.r.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCERE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"cere\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01761278\"]}");
	add("{\"term\":\"cereal\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07718541\", \"07818393\", \"12162012\"]}");
	add("{\"term\":\"cerebellum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05493206\"]}");
	add("{\"term\":\"cerebration\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05778923\"]}");
	add("{\"term\":\"cerebromeningitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14366816\"]}");
	add("{\"term\":\"cerebrum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05499645\"]}");
	add("{\"term\":\"cerecloth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03001714\"]}");
	add("{\"term\":\"cerement\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03884813\"]}");
	add("{\"term\":\"ceremonial\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07465442\"]}");
	add("{\"term\":\"ceremoniousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04918954\"]}");
	add("{\"term\":\"ceremony\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01029321\", \"01028839\", \"07465442\"]}");
	add("{\"term\":\"ceres\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09263315\", \"09581885\"]}");
	add("{\"term\":\"ceresin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14829492\"]}");
	add("{\"term\":\"cereus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11865120\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }