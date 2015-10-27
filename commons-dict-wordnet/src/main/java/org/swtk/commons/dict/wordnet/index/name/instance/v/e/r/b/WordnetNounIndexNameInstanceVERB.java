package org.swtk.commons.dict.wordnet.index.name.instance.v.e.r.b;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceVERB {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"verb\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06331562\", \"06329055\"]}");
	add("{\"term\":\"verbalisation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07095060\", \"07095235\"]}");
	add("{\"term\":\"verbaliser\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10649550\"]}");
	add("{\"term\":\"verbalism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07104211\", \"07154581\"]}");
	add("{\"term\":\"verbalization\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07095060\", \"07095235\"]}");
	add("{\"term\":\"verbalizer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10649550\"]}");
	add("{\"term\":\"verbascum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12909493\"]}");
	add("{\"term\":\"verbena\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12935683\"]}");
	add("{\"term\":\"verbenaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12935193\"]}");
	add("{\"term\":\"verbesina\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12050734\"]}");
	add("{\"term\":\"verbiage\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07095931\", \"07104211\"]}");
	add("{\"term\":\"verbolatry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01046907\"]}");
	add("{\"term\":\"verboseness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07103943\"]}");
	add("{\"term\":\"verbosity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07103943\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }