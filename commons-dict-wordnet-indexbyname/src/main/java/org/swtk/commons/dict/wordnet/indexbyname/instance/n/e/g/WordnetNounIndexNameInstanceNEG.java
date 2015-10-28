package org.swtk.commons.dict.wordnet.indexbyname.instance.n.e.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceNEG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"negaprion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01493187\"]}");
	add("{\"term\":\"negation\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06764286\", \"07221121\", \"07295646\"]}");
	add("{\"term\":\"negative\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03822731\", \"07219571\"]}");
	add("{\"term\":\"negativeness\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05115562\", \"05175145\", \"13879205\"]}");
	add("{\"term\":\"negativism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05175145\"]}");
	add("{\"term\":\"negativist\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10019315\", \"10371222\"]}");
	add("{\"term\":\"negativity\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"04951690\", \"05115562\", \"05175145\", \"13879205\"]}");
	add("{\"term\":\"negatron\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09294810\"]}");
	add("{\"term\":\"negev\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09194457\"]}");
	add("{\"term\":\"neggram\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03811580\"]}");
	add("{\"term\":\"neglect\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"00740568\", \"04673170\", \"00419628\", \"14446832\", \"05714576\"]}");
	add("{\"term\":\"neglecter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10371356\"]}");
	add("{\"term\":\"neglectfulness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04673170\"]}");
	add("{\"term\":\"neglige\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03823187\"]}");
	add("{\"term\":\"negligee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03823187\"]}");
	add("{\"term\":\"negligence\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04673170\", \"00740568\"]}");
	add("{\"term\":\"negotiant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10371605\"]}");
	add("{\"term\":\"negotiation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01268857\", \"07162900\"]}");
	add("{\"term\":\"negotiator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10371605\"]}");
	add("{\"term\":\"negotiatress\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10371939\"]}");
	add("{\"term\":\"negotiatrix\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10371939\"]}");
	add("{\"term\":\"negritude\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06229360\"]}");
	add("{\"term\":\"negro\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09659490\"]}");
	add("{\"term\":\"negroid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09659490\"]}");
	add("{\"term\":\"negus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07943310\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }