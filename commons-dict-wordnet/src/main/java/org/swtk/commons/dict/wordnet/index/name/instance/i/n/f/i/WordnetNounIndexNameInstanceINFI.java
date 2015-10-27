package org.swtk.commons.dict.wordnet.index.name.instance.i.n.f.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceINFI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"infidel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10185987\"]}");
	add("{\"term\":\"infidelity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04886056\"]}");
	add("{\"term\":\"infield\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02802752\"]}");
	add("{\"term\":\"infielder\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10225076\"]}");
	add("{\"term\":\"infiltration\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13555477\", \"00978784\"]}");
	add("{\"term\":\"infiltrator\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10225333\", \"10225452\"]}");
	add("{\"term\":\"infinite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00028950\"]}");
	add("{\"term\":\"infiniteness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05216592\"]}");
	add("{\"term\":\"infinitesimal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05872631\"]}");
	add("{\"term\":\"infinitive\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06329897\"]}");
	add("{\"term\":\"infinitude\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05216592\", \"13798260\"]}");
	add("{\"term\":\"infinity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15268787\"]}");
	add("{\"term\":\"infirmary\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03545775\"]}");
	add("{\"term\":\"infirmity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14571235\"]}");
	add("{\"term\":\"infix\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06320262\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }