package org.swtk.commons.dict.wordnet.index.name.instance.p.u.l.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePULL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"pull\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"00626667\", \"00839336\", \"14322572\", \"04026090\", \"05164657\", \"11518440\", \"00115251\"]}");
	add("{\"term\":\"pullback\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00057508\", \"04026275\"]}");
	add("{\"term\":\"puller\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10511787\", \"10512032\"]}");
	add("{\"term\":\"pullet\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01795890\", \"07661078\"]}");
	add("{\"term\":\"pulley\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04026692\"]}");
	add("{\"term\":\"pulling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00115251\"]}");
	add("{\"term\":\"pullman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04027306\"]}");
	add("{\"term\":\"pullout\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00058126\"]}");
	add("{\"term\":\"pullover\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04027422\"]}");
	add("{\"term\":\"pullulation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13565171\", \"13565276\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }