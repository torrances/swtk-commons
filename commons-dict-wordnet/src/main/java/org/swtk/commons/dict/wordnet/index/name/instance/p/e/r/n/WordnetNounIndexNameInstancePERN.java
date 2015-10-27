package org.swtk.commons.dict.wordnet.index.name.instance.p.e.r.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePERN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"pernambuco\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08875467\"]}");
	add("{\"term\":\"perniciousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04798152\"]}");
	add("{\"term\":\"pernio\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14207004\"]}");
	add("{\"term\":\"pernis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01610727\"]}");
	add("{\"term\":\"pernod\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07926896\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }