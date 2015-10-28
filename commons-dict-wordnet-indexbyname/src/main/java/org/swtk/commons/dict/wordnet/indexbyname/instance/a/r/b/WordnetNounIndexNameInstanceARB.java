package org.swtk.commons.dict.wordnet.indexbyname.instance.a.r.b;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceARB {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"arb\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09823223\"]}");
	add("{\"term\":\"arbalest\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02985366\"]}");
	add("{\"term\":\"arbalist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02985366\"]}");
	add("{\"term\":\"arbiter\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09822852\", \"09823476\"]}");
	add("{\"term\":\"arbitrage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01095889\"]}");
	add("{\"term\":\"arbitrager\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09823223\"]}");
	add("{\"term\":\"arbitrageur\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09823223\"]}");
	add("{\"term\":\"arbitrament\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01193374\"]}");
	add("{\"term\":\"arbitrariness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04679198\"]}");
	add("{\"term\":\"arbitration\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01193374\", \"07165558\"]}");
	add("{\"term\":\"arbitrator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09822852\"]}");
	add("{\"term\":\"arbitrement\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01193374\"]}");
	add("{\"term\":\"arbor\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"02735832\", \"04284631\", \"13128650\"]}");
	add("{\"term\":\"arboretum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02736080\"]}");
	add("{\"term\":\"arboriculture\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00919445\"]}");
	add("{\"term\":\"arboriculturist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10124525\"]}");
	add("{\"term\":\"arborist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10747470\"]}");
	add("{\"term\":\"arborolatry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01047638\"]}");
	add("{\"term\":\"arborvirus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01331827\"]}");
	add("{\"term\":\"arborvitae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11664286\"]}");
	add("{\"term\":\"arbour\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02735832\"]}");
	add("{\"term\":\"arbovirus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01331827\"]}");
	add("{\"term\":\"arbutus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12250864\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }