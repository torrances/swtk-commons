package org.swtk.commons.dict.wordnet.index.name.instance.l.o.a.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLOAN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"loan\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06304241\", \"13420126\"]}");
	add("{\"term\":\"loanblend\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06304010\"]}");
	add("{\"term\":\"loaner\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03685838\", \"10274089\"]}");
	add("{\"term\":\"loaning\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01095590\"]}");
	add("{\"term\":\"loanword\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06304241\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }