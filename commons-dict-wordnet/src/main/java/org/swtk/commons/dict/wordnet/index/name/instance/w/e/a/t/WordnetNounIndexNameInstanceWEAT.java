package org.swtk.commons.dict.wordnet.index.name.instance.w.e.a.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceWEAT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"weather\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11545095\"]}");
	add("{\"term\":\"weatherboard\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13851933\", \"15127574\"]}");
	add("{\"term\":\"weatherboarding\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15127574\"]}");
	add("{\"term\":\"weathercock\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04574042\"]}");
	add("{\"term\":\"weatherglass\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04574384\"]}");
	add("{\"term\":\"weatherliness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04782140\"]}");
	add("{\"term\":\"weatherman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10791760\"]}");
	add("{\"term\":\"weatherstrip\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04575156\"]}");
	add("{\"term\":\"weatherstripping\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04575156\"]}");
	add("{\"term\":\"weathervane\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04575355\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }