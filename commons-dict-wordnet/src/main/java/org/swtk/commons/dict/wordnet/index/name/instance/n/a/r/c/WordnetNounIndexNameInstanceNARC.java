package org.swtk.commons.dict.wordnet.index.name.instance.n.a.r.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceNARC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"narc\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10365033\"]}");
	add("{\"term\":\"narcan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03811921\"]}");
	add("{\"term\":\"narcism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04842491\"]}");
	add("{\"term\":\"narcissism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04842491\"]}");
	add("{\"term\":\"narcissist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10365153\"]}");
	add("{\"term\":\"narcissus\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09522469\", \"12441972\"]}");
	add("{\"term\":\"narcist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10365153\"]}");
	add("{\"term\":\"narcolepsy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14330895\"]}");
	add("{\"term\":\"narcoleptic\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03813964\", \"10365287\"]}");
	add("{\"term\":\"narcosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05689896\"]}");
	add("{\"term\":\"narcoterrorism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00765789\"]}");
	add("{\"term\":\"narcotic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03814104\"]}");
	add("{\"term\":\"narcotraffic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01116165\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }