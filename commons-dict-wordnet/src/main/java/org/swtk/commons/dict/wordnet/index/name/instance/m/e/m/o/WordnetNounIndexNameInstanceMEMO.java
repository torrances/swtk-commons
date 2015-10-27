package org.swtk.commons.dict.wordnet.index.name.instance.m.e.m.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMEMO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"memo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06518182\"]}");
	add("{\"term\":\"memoir\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06421830\", \"06528486\"]}");
	add("{\"term\":\"memorabilia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06517696\"]}");
	add("{\"term\":\"memorability\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05223189\"]}");
	add("{\"term\":\"memoranda\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06518182\"]}");
	add("{\"term\":\"memorandum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06518182\"]}");
	add("{\"term\":\"memorial\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03749393\", \"06525615\", \"06701267\"]}");
	add("{\"term\":\"memorialisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07467451\"]}");
	add("{\"term\":\"memorialization\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07467451\"]}");
	add("{\"term\":\"memorisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05763153\"]}");
	add("{\"term\":\"memoriser\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10328171\"]}");
	add("{\"term\":\"memorization\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05763153\"]}");
	add("{\"term\":\"memorizer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10328171\"]}");
	add("{\"term\":\"memory\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"06149719\", \"03749767\", \"05659244\", \"05768199\", \"05943778\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }