package org.swtk.commons.dict.wordnet.indexbyname.instance.d.e.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDEO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"deodar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11644418\"]}");
	add("{\"term\":\"deodar cedar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11644418\"]}");
	add("{\"term\":\"deodorant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03181260\"]}");
	add("{\"term\":\"deodourant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03181260\"]}");
	add("{\"term\":\"deontic logic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06175882\"]}");
	add("{\"term\":\"deossification\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13483287\"]}");
	add("{\"term\":\"deoxyadenosine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15097585\"]}");
	add("{\"term\":\"deoxyadenosine monophosphate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14853735\"]}");
	add("{\"term\":\"deoxycytidine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15097714\"]}");
	add("{\"term\":\"deoxycytidine monophosphate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14853935\"]}");
	add("{\"term\":\"deoxyephedrine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03759824\"]}");
	add("{\"term\":\"deoxyguanosine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15097852\"]}");
	add("{\"term\":\"deoxyguanosine monophosphate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14854134\"]}");
	add("{\"term\":\"deoxyribonucleic acid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14854534\"]}");
	add("{\"term\":\"deoxyribose\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14857684\"]}");
	add("{\"term\":\"deoxythymidine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15097991\"]}");
	add("{\"term\":\"deoxythymidine monophosphate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14854334\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }