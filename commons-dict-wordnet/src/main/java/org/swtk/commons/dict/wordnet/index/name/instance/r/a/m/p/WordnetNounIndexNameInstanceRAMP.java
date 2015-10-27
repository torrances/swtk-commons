package org.swtk.commons.dict.wordnet.index.name.instance.r.a.m.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceRAMP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ramp\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04623085\", \"12455843\", \"04058661\"]}");
	add("{\"term\":\"rampage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00555578\"]}");
	add("{\"term\":\"rampart\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04058937\"]}");
	add("{\"term\":\"ramphastidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01845879\"]}");
	add("{\"term\":\"ramphomicron\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01837053\"]}");
	add("{\"term\":\"rampion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12059367\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }