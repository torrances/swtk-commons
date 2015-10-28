package org.swtk.commons.dict.wordnet.indexbyname.instance.k.i.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceKIT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"kit\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01325646\", \"03624605\", \"03624859\"]}");
	add("{\"term\":\"kitakyushu\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08945473\"]}");
	add("{\"term\":\"kitambilla\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07778510\", \"12399480\"]}");
	add("{\"term\":\"kitbag\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03625002\"]}");
	add("{\"term\":\"kitchen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03625099\"]}");
	add("{\"term\":\"kitchener\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11126469\"]}");
	add("{\"term\":\"kitchenette\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03625562\"]}");
	add("{\"term\":\"kitchenware\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03626586\"]}");
	add("{\"term\":\"kite\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"01611073\", \"03626682\", \"13403479\", \"13403644\"]}");
	add("{\"term\":\"kitembilla\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07778510\", \"12399480\"]}");
	add("{\"term\":\"kith\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07986748\"]}");
	add("{\"term\":\"kitsch\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03627144\"]}");
	add("{\"term\":\"kittee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00424225\"]}");
	add("{\"term\":\"kitten\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02125600\"]}");
	add("{\"term\":\"kittiwake\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02045413\"]}");
	add("{\"term\":\"kittul\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12607893\"]}");
	add("{\"term\":\"kitty\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"02124950\", \"02125600\", \"13364789\", \"13390647\"]}");
	add("{\"term\":\"kitul\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12607893\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }