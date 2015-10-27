package org.swtk.commons.dict.wordnet.index.name.instance.v.e.r.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceVERT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"vertebra\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05291832\"]}");
	add("{\"term\":\"vertebrata\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01473711\"]}");
	add("{\"term\":\"vertebrate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01474323\"]}");
	add("{\"term\":\"vertex\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08695539\", \"05875905\"]}");
	add("{\"term\":\"verthandi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09605901\"]}");
	add("{\"term\":\"vertical\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04522424\", \"13851008\"]}");
	add("{\"term\":\"verticality\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05086845\"]}");
	add("{\"term\":\"verticalness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05086845\"]}");
	add("{\"term\":\"verticil\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13941998\"]}");
	add("{\"term\":\"verticilliosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14307027\"]}");
	add("{\"term\":\"verticillium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13098781\"]}");
	add("{\"term\":\"vertigo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14395918\"]}");
	add("{\"term\":\"vertu\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04796841\", \"05758024\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }