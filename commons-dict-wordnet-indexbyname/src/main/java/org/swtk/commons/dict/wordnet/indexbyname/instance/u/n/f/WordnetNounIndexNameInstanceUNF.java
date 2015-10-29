package org.swtk.commons.dict.wordnet.indexbyname.instance.u.n.f;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceUNF {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"unfairness\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00745914\", \"04846907\", \"06212288\"]}");
	add("{\"term\":\"unfaithfulness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04886056\"]}");
	add("{\"term\":\"unfamiliarity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04804731\"]}");
	add("{\"term\":\"unfastener\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10757088\"]}");
	add("{\"term\":\"unfastening\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00150082\"]}");
	add("{\"term\":\"unfavorable judgment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06723485\"]}");
	add("{\"term\":\"unfavorable position\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05172702\"]}");
	add("{\"term\":\"unfavorableness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05169440\"]}");
	add("{\"term\":\"unfavourableness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05169440\"]}");
	add("{\"term\":\"unfeasibility\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05160606\"]}");
	add("{\"term\":\"unfeelingness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04851856\"]}");
	add("{\"term\":\"unfinished business\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00582922\"]}");
	add("{\"term\":\"unfitness\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04729649\", \"05214398\", \"14570961\"]}");
	add("{\"term\":\"unfolding\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13592420\"]}");
	add("{\"term\":\"unformatted capacity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13777767\"]}");
	add("{\"term\":\"unfortunate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09653829\"]}");
	add("{\"term\":\"unfortunate person\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09653829\"]}");
	add("{\"term\":\"unfriendliness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04665233\", \"07517480\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }