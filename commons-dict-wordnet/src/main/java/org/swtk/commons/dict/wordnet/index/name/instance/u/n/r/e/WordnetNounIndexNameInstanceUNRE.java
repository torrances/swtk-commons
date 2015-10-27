package org.swtk.commons.dict.wordnet.index.name.instance.u.n.r.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceUNRE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"unrealism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05949587\"]}");
	add("{\"term\":\"unreality\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13983403\", \"04769747\"]}");
	add("{\"term\":\"unreason\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14420967\"]}");
	add("{\"term\":\"unregularity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04777450\"]}");
	add("{\"term\":\"unrelatedness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13818615\"]}");
	add("{\"term\":\"unreliability\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04678751\"]}");
	add("{\"term\":\"unreliableness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04678751\"]}");
	add("{\"term\":\"unrespectability\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04881604\"]}");
	add("{\"term\":\"unresponsiveness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05220469\"]}");
	add("{\"term\":\"unrest\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07528950\", \"14002988\"]}");
	add("{\"term\":\"unrestraint\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04892286\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }