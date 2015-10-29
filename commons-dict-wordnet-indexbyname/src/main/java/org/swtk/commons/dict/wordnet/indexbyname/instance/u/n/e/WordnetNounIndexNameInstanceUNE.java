package org.swtk.commons.dict.wordnet.indexbyname.instance.u.n.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceUNE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"unearned income\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13282279\", \"13282496\"]}");
	add("{\"term\":\"unearned increment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13332701\"]}");
	add("{\"term\":\"unearned revenue\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13282279\", \"13282496\"]}");
	add("{\"term\":\"unearned run\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00190889\"]}");
	add("{\"term\":\"unease\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04912028\", \"14470485\"]}");
	add("{\"term\":\"uneasiness\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"04632641\", \"04912028\", \"07522568\", \"14470485\", \"07540296\"]}");
	add("{\"term\":\"uneducated person\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10218577\"]}");
	add("{\"term\":\"unemotional person\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10678306\"]}");
	add("{\"term\":\"unemotionality\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04636551\", \"07498922\"]}");
	add("{\"term\":\"unemployed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08494318\"]}");
	add("{\"term\":\"unemployed people\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08494318\"]}");
	add("{\"term\":\"unemployed person\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10757517\"]}");
	add("{\"term\":\"unemployment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13991755\"]}");
	add("{\"term\":\"unemployment compensation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01090361\"]}");
	add("{\"term\":\"unemployment line\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08450353\"]}");
	add("{\"term\":\"unemployment rate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13841286\"]}");
	add("{\"term\":\"unenlightenment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05998150\"]}");
	add("{\"term\":\"unequivocalness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04829033\"]}");
	add("{\"term\":\"unesco\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08318973\"]}");
	add("{\"term\":\"uneven bars\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04516555\"]}");
	add("{\"term\":\"uneven parallel bars\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04516555\"]}");
	add("{\"term\":\"unevenness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04760586\", \"04779129\"]}");
	add("{\"term\":\"unexchangeability\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04748104\"]}");
	add("{\"term\":\"unexpectedness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04803974\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }