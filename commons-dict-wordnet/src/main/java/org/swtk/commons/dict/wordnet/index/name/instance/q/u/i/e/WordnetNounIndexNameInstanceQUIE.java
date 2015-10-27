package org.swtk.commons.dict.wordnet.index.name.instance.q.u.i.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceQUIE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"quiescence\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01066787\", \"14035282\"]}");
	add("{\"term\":\"quiescency\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01066787\", \"14035282\"]}");
	add("{\"term\":\"quiet\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"04911529\", \"04989456\", \"13992548\", \"14546558\"]}");
	add("{\"term\":\"quietism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05957955\"]}");
	add("{\"term\":\"quietist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10521220\"]}");
	add("{\"term\":\"quietness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07530799\", \"04990105\"]}");
	add("{\"term\":\"quietude\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07530799\"]}");
	add("{\"term\":\"quietus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13986101\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }