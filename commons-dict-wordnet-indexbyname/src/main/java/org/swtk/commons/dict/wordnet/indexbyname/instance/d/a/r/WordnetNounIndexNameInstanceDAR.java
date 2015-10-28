package org.swtk.commons.dict.wordnet.indexbyname.instance.d.a.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDAR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"daraf\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13659467\"]}");
	add("{\"term\":\"dard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06984971\"]}");
	add("{\"term\":\"dardan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09769855\"]}");
	add("{\"term\":\"dardanelles\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01279781\", \"09063846\"]}");
	add("{\"term\":\"dardanian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09769855\"]}");
	add("{\"term\":\"dardanus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09517411\"]}");
	add("{\"term\":\"dardic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06984971\"]}");
	add("{\"term\":\"dare\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07246192\"]}");
	add("{\"term\":\"daredevil\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10011068\"]}");
	add("{\"term\":\"daredevilry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04866554\"]}");
	add("{\"term\":\"daredeviltry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04866554\"]}");
	add("{\"term\":\"darfur\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09052254\"]}");
	add("{\"term\":\"dari\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06986943\"]}");
	add("{\"term\":\"daricon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03874900\"]}");
	add("{\"term\":\"daring\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04866016\", \"07246192\"]}");
	add("{\"term\":\"darjeeling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07951040\"]}");
	add("{\"term\":\"dark\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"05997383\", \"15192074\", \"08663881\", \"14587156\", \"14007000\"]}");
	add("{\"term\":\"darkening\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00275281\"]}");
	add("{\"term\":\"darkness\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"04985483\", \"04987119\", \"05997383\", \"14587156\", \"08663881\", \"14007000\"]}");
	add("{\"term\":\"darkroom\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03167126\"]}");
	add("{\"term\":\"darling\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09286385\", \"10011405\"]}");
	add("{\"term\":\"darlingtonia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12801612\"]}");
	add("{\"term\":\"darmera\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12817973\"]}");
	add("{\"term\":\"darmstadtium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14660570\"]}");
	add("{\"term\":\"darn\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03750776\", \"05148040\"]}");
	add("{\"term\":\"darnel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12145700\"]}");
	add("{\"term\":\"darner\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10011676\"]}");
	add("{\"term\":\"darning\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00268061\"]}");
	add("{\"term\":\"darpa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08149028\"]}");
	add("{\"term\":\"darrow\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10942898\"]}");
	add("{\"term\":\"darsana\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06248172\"]}");
	add("{\"term\":\"dart\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00335182\", \"03167380\", \"03167484\"]}");
	add("{\"term\":\"dartboard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03167606\"]}");
	add("{\"term\":\"darter\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01317401\", \"02057156\"]}");
	add("{\"term\":\"dartmouth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03167747\"]}");
	add("{\"term\":\"darts\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00505220\"]}");
	add("{\"term\":\"darvon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04019228\"]}");
	add("{\"term\":\"darwin\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08854050\", \"10943065\"]}");
	add("{\"term\":\"darwinian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10011869\"]}");
	add("{\"term\":\"darwinism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06119698\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }