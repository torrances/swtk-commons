package org.swtk.commons.dict.wordnet.indexbyname.instance.f.e.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFEC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"fecal impaction\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14395025\"]}");
	add("{\"term\":\"fecal matter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14878449\"]}");
	add("{\"term\":\"fecal occult test\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05749285\"]}");
	add("{\"term\":\"fecalith\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09279266\"]}");
	add("{\"term\":\"feces\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14878449\"]}");
	add("{\"term\":\"fechner\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10988050\"]}");
	add("{\"term\":\"fecklessness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05147207\"]}");
	add("{\"term\":\"fecula\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14879579\"]}");
	add("{\"term\":\"feculence\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14511702\"]}");
	add("{\"term\":\"fecundation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07449073\", \"07451586\"]}");
	add("{\"term\":\"fecundity\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05154628\", \"14074976\", \"05632849\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }