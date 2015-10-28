package org.swtk.commons.dict.wordnet.indexbyname.instance.w.h.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceWHA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"whack\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00134158\", \"07414429\"]}");
	add("{\"term\":\"whacker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04581520\"]}");
	add("{\"term\":\"whacking\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01163216\"]}");
	add("{\"term\":\"whacko\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10388113\"]}");
	add("{\"term\":\"whale\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02065397\", \"10148670\"]}");
	add("{\"term\":\"whaleboat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04581634\"]}");
	add("{\"term\":\"whalebone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14782431\"]}");
	add("{\"term\":\"whaler\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04581757\", \"10794796\"]}");
	add("{\"term\":\"whalesucker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02578221\"]}");
	add("{\"term\":\"whammy\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07175075\", \"07491232\"]}");
	add("{\"term\":\"whang\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00134158\"]}");
	add("{\"term\":\"wharf\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03939805\"]}");
	add("{\"term\":\"wharfage\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03939805\", \"13345210\"]}");
	add("{\"term\":\"wharton\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11402790\"]}");
	add("{\"term\":\"whatchamacallit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03223248\"]}");
	add("{\"term\":\"whatchamacallum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03223248\"]}");
	add("{\"term\":\"whatnot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02900975\"]}");
	add("{\"term\":\"whatsis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03223248\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }