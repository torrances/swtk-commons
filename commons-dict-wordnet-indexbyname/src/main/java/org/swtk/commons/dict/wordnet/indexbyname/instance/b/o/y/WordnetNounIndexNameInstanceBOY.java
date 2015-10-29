package org.swtk.commons.dict.wordnet.indexbyname.instance.b.o.y;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBOY {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"boy\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"10643436\", \"09890332\", \"10305010\"]}");
	add("{\"term\":\"boy orator of the platte\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10888972\"]}");
	add("{\"term\":\"boy scout\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09891333\", \"09891147\"]}");
	add("{\"term\":\"boy scouts\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08487721\"]}");
	add("{\"term\":\"boy scouts of america\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08487939\"]}");
	add("{\"term\":\"boy wonder\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09891418\"]}");
	add("{\"term\":\"boycott\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00206979\"]}");
	add("{\"term\":\"boyfriend\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09890770\"]}");
	add("{\"term\":\"boyhood\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15172464\"]}");
	add("{\"term\":\"boyishness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04674433\"]}");
	add("{\"term\":\"boykinia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12816952\"]}");
	add("{\"term\":\"boykinia elata\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12817145\"]}");
	add("{\"term\":\"boykinia occidentalis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12817145\"]}");
	add("{\"term\":\"boyle\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10879704\", \"10879943\"]}");
	add("{\"term\":\"boyne\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01275280\"]}");
	add("{\"term\":\"boysenberry\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07761022\", \"12675618\"]}");
	add("{\"term\":\"boysenberry bush\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12675618\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }