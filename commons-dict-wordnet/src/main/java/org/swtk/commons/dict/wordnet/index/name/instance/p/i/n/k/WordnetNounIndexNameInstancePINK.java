package org.swtk.commons.dict.wordnet.index.name.instance.p.i.n.k;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePINK {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"pink\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"10454085\", \"11828448\", \"04978183\"]}");
	add("{\"term\":\"pinkeye\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14364837\"]}");
	add("{\"term\":\"pinkie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05575360\"]}");
	add("{\"term\":\"pinkness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04978398\"]}");
	add("{\"term\":\"pinko\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10454085\"]}");
	add("{\"term\":\"pinkroot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14306599\"]}");
	add("{\"term\":\"pinky\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05575360\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }