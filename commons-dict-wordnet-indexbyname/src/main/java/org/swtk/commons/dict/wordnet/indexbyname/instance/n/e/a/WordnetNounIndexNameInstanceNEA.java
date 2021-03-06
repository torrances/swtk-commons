package org.swtk.commons.dict.wordnet.indexbyname.instance.n.e.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceNEA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"neandertal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02477709\"]}");
	add("{\"term\":\"neandertal man\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02477709\"]}");
	add("{\"term\":\"neanderthal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02477709\"]}");
	add("{\"term\":\"neanderthal man\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02477709\"]}");
	add("{\"term\":\"neap\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07417900\"]}");
	add("{\"term\":\"neap tide\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07417900\"]}");
	add("{\"term\":\"neapolitan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10370397\"]}");
	add("{\"term\":\"neapolitan ice cream\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07630661\"]}");
	add("{\"term\":\"near beer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07907164\"]}");
	add("{\"term\":\"near east\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08809019\"]}");
	add("{\"term\":\"near gale\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11482412\"]}");
	add("{\"term\":\"near miss\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07316464\"]}");
	add("{\"term\":\"near thing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00205183\"]}");
	add("{\"term\":\"near vision\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05664735\"]}");
	add("{\"term\":\"nearness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05092779\"]}");
	add("{\"term\":\"nearside\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03819374\"]}");
	add("{\"term\":\"nearsightedness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14576882\"]}");
	add("{\"term\":\"neatness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04903710\", \"14520949\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }