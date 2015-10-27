package org.swtk.commons.dict.wordnet.index.name.instance.r.h.y.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceRHYN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"rhynchocephalia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01675591\"]}");
	add("{\"term\":\"rhynchoelaps\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01749785\"]}");
	add("{\"term\":\"rhyncostylis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12101989\"]}");
	add("{\"term\":\"rhynia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13239179\"]}");
	add("{\"term\":\"rhyniaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13239012\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }