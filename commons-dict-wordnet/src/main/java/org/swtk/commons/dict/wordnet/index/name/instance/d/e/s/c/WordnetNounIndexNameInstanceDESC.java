package org.swtk.commons.dict.wordnet.index.name.instance.d.e.s.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDESC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"descant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07045513\"]}");
	add("{\"term\":\"descartes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10951605\"]}");
	add("{\"term\":\"descendant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10026173\"]}");
	add("{\"term\":\"descendants\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08386147\"]}");
	add("{\"term\":\"descendent\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10026173\"]}");
	add("{\"term\":\"descender\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06813729\", \"06843758\", \"10026402\"]}");
	add("{\"term\":\"descensus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14582800\"]}");
	add("{\"term\":\"descent\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"08118903\", \"09288526\", \"13835254\", \"00327266\", \"04930920\", \"07377946\"]}");
	add("{\"term\":\"description\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05848585\", \"07216025\", \"06737512\"]}");
	add("{\"term\":\"descriptivism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06260040\", \"06260191\"]}");
	add("{\"term\":\"descriptor\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05832071\", \"06301417\"]}");
	add("{\"term\":\"descurainia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11905136\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }