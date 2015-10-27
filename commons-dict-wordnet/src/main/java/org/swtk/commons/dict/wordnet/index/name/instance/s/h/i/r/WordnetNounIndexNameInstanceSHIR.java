package org.swtk.commons.dict.wordnet.index.name.instance.s.h.i.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSHIR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"shiraz\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08932052\"]}");
	add("{\"term\":\"shire\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02389998\", \"08605383\"]}");
	add("{\"term\":\"shirer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11318624\"]}");
	add("{\"term\":\"shirker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10627901\"]}");
	add("{\"term\":\"shirking\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00742776\"]}");
	add("{\"term\":\"shirring\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00247327\"]}");
	add("{\"term\":\"shirt\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04204434\"]}");
	add("{\"term\":\"shirtdress\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04204921\"]}");
	add("{\"term\":\"shirtfront\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03196245\", \"04205058\"]}");
	add("{\"term\":\"shirting\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04205276\"]}");
	add("{\"term\":\"shirtmaker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10610311\"]}");
	add("{\"term\":\"shirtsleeve\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04205398\"]}");
	add("{\"term\":\"shirtsleeves\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14481424\"]}");
	add("{\"term\":\"shirttail\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04205496\", \"06411513\"]}");
	add("{\"term\":\"shirtwaist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04205605\"]}");
	add("{\"term\":\"shirtwaister\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04205605\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }