package org.swtk.commons.dict.wordnet.indexbyname.instance.h.u.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHUD {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"hud\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08152044\"]}");
	add("{\"term\":\"huddie leadbetter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11143252\"]}");
	add("{\"term\":\"huddle\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08201357\", \"07159124\"]}");
	add("{\"term\":\"huddler\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10210364\", \"10210490\"]}");
	add("{\"term\":\"hudood\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08473189\"]}");
	add("{\"term\":\"hudson\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"11084101\", \"11084325\", \"09329746\"]}");
	add("{\"term\":\"hudson bay\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09329937\"]}");
	add("{\"term\":\"hudson bay collared lemming\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02348426\"]}");
	add("{\"term\":\"hudson hoagland\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11072838\"]}");
	add("{\"term\":\"hudson river\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09329746\"]}");
	add("{\"term\":\"hudson river school\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08485272\"]}");
	add("{\"term\":\"hudson seal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14789866\"]}");
	add("{\"term\":\"hudsonia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12396899\"]}");
	add("{\"term\":\"hudsonia ericoides\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12397070\"]}");
	add("{\"term\":\"hudsonia tomentosa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12397257\"]}");
	add("{\"term\":\"hudsonian godwit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02036949\"]}");
	add("{\"term\":\"hudud\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08473189\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }