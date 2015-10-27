package org.swtk.commons.dict.wordnet.index.name.instance.t.i.g.h;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTIGH {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"tightening\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00148877\"]}");
	add("{\"term\":\"tightfistedness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04840918\"]}");
	add("{\"term\":\"tightness\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"04784179\", \"04840918\", \"05096011\", \"05729675\", \"14474006\"]}");
	add("{\"term\":\"tightrope\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04441914\"]}");
	add("{\"term\":\"tights\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04442066\"]}");
	add("{\"term\":\"tightwad\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09932139\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }