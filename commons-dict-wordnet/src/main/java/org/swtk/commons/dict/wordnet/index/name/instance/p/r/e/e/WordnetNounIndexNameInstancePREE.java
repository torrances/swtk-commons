package org.swtk.commons.dict.wordnet.index.name.instance.p.r.e.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePREE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"preeclampsia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14214924\"]}");
	add("{\"term\":\"preemie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10485017\"]}");
	add("{\"term\":\"preeminence\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14458911\"]}");
	add("{\"term\":\"preempt\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06750757\"]}");
	add("{\"term\":\"preemption\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00085861\", \"05185921\", \"05186098\", \"05966105\"]}");
	add("{\"term\":\"preemptor\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10484436\", \"10484568\"]}");
	add("{\"term\":\"preexistence\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13980403\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }