package org.swtk.commons.dict.wordnet.indexbyname.instance.e.m.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceEMO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"emollient\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03133170\"]}");
	add("{\"term\":\"emolument\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13311308\"]}");
	add("{\"term\":\"emoticon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06290592\"]}");
	add("{\"term\":\"emotion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07495208\"]}");
	add("{\"term\":\"emotional arousal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14059685\"]}");
	add("{\"term\":\"emotional disorder\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14412315\"]}");
	add("{\"term\":\"emotional disturbance\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14412315\"]}");
	add("{\"term\":\"emotional person\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10072651\"]}");
	add("{\"term\":\"emotional state\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14009303\"]}");
	add("{\"term\":\"emotionalism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04633637\"]}");
	add("{\"term\":\"emotionality\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04633637\"]}");
	add("{\"term\":\"emotionlessness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04636551\", \"07498922\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }