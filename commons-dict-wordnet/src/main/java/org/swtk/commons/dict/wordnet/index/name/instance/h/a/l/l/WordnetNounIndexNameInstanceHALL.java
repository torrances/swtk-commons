package org.swtk.commons.dict.wordnet.index.name.instance.h.a.l.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHALL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"hall\", \"synsetCount\":13, \"upperType\":\"NOUN\", \"ids\":[\"03483839\", \"03484204\", \"03724592\", \"11044415\", \"11044578\", \"11044727\", \"11044904\", \"11045121\", \"03724120\", \"03229596\", \"03483990\", \"02718424\", \"03485035\"]}");
	add("{\"term\":\"hallah\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07697195\"]}");
	add("{\"term\":\"halle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08790931\"]}");
	add("{\"term\":\"hallel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07048370\"]}");
	add("{\"term\":\"hallelujah\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06706400\"]}");
	add("{\"term\":\"halley\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11045322\"]}");
	add("{\"term\":\"halliard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03485946\"]}");
	add("{\"term\":\"hallmark\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06868085\", \"04739783\"]}");
	add("{\"term\":\"halloo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07137117\"]}");
	add("{\"term\":\"halloween\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15216068\"]}");
	add("{\"term\":\"hallowmas\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15219894\"]}");
	add("{\"term\":\"hallowmass\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15219894\"]}");
	add("{\"term\":\"hallstand\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03484585\"]}");
	add("{\"term\":\"hallucination\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05821023\", \"05905340\", \"14401022\"]}");
	add("{\"term\":\"hallucinogen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03484730\"]}");
	add("{\"term\":\"hallucinosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14398646\"]}");
	add("{\"term\":\"hallux\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05585372\"]}");
	add("{\"term\":\"hallway\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03485035\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }