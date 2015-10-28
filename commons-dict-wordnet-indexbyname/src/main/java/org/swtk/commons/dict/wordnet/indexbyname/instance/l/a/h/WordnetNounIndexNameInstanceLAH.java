package org.swtk.commons.dict.wordnet.indexbyname.instance.l.a.h;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLAH {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"lah\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06882036\"]}");
	add("{\"term\":\"lahar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07419892\"]}");
	add("{\"term\":\"lahore\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08999798\"]}");
	add("{\"term\":\"lahu\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06945656\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }