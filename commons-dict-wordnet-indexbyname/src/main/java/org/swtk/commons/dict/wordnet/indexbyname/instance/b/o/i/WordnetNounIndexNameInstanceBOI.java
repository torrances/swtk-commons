package org.swtk.commons.dict.wordnet.indexbyname.instance.b.o.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBOI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"boidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01744385\"]}");
	add("{\"term\":\"boil\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05021283\", \"14206692\"]}");
	add("{\"term\":\"boil smut\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13088090\"]}");
	add("{\"term\":\"boiled dinner\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07878922\"]}");
	add("{\"term\":\"boiled egg\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07857471\"]}");
	add("{\"term\":\"boiler\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03618023\", \"02867090\"]}");
	add("{\"term\":\"boilerplate\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02867335\", \"07089027\"]}");
	add("{\"term\":\"boilers suit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03868782\"]}");
	add("{\"term\":\"boilersuit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03868782\"]}");
	add("{\"term\":\"boiling\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00248659\", \"13461952\"]}");
	add("{\"term\":\"boiling point\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04636387\", \"05021283\"]}");
	add("{\"term\":\"boiling water reactor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02867462\"]}");
	add("{\"term\":\"boise\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09104091\"]}");
	add("{\"term\":\"boisterousness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04992313\", \"14547271\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }