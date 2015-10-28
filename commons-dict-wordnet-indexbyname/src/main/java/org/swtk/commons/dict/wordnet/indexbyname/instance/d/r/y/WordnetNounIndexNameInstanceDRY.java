package org.swtk.commons.dict.wordnet.indexbyname.instance.d.r.y;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDRY {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"dry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10057647\"]}");
	add("{\"term\":\"dryad\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09574169\"]}");
	add("{\"term\":\"dryadella\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12080619\"]}");
	add("{\"term\":\"dryas\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12649948\"]}");
	add("{\"term\":\"dryden\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10963651\"]}");
	add("{\"term\":\"drydock\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03256236\"]}");
	add("{\"term\":\"dryer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03256469\"]}");
	add("{\"term\":\"drygoods\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03256767\"]}");
	add("{\"term\":\"drymarchon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01743757\"]}");
	add("{\"term\":\"drymoglossum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13196222\"]}");
	add("{\"term\":\"drynaria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13196382\"]}");
	add("{\"term\":\"dryness\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04637494\", \"04890999\", \"14560040\"]}");
	add("{\"term\":\"dryopithecine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02480708\"]}");
	add("{\"term\":\"dryopithecus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02480521\"]}");
	add("{\"term\":\"dryopteridaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13212923\"]}");
	add("{\"term\":\"dryopteris\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13213796\"]}");
	add("{\"term\":\"drypis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11830499\"]}");
	add("{\"term\":\"drywall\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04555277\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }