package org.swtk.commons.dict.wordnet.index.name.instance.t.h.u.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTHUN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"thunbergia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12833784\"]}");
	add("{\"term\":\"thunder\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"02840630\", \"07411955\", \"07392282\"]}");
	add("{\"term\":\"thunderbird\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10729628\"]}");
	add("{\"term\":\"thunderbolt\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07313014\", \"11539554\"]}");
	add("{\"term\":\"thunderclap\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07313014\", \"07412152\"]}");
	add("{\"term\":\"thundercloud\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09284678\"]}");
	add("{\"term\":\"thunderer\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04439059\", \"09597528\"]}");
	add("{\"term\":\"thunderhead\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09480823\"]}");
	add("{\"term\":\"thundershower\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11522406\"]}");
	add("{\"term\":\"thunderstorm\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11539686\"]}");
	add("{\"term\":\"thunk\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07412241\"]}");
	add("{\"term\":\"thunnus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02629220\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }