package org.swtk.commons.dict.wordnet.indexbyname.instance.e.d.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceEDG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"edgar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10968985\"]}");
	add("{\"term\":\"edgar albert guest\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11038679\"]}");
	add("{\"term\":\"edgar allan poe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11260470\"]}");
	add("{\"term\":\"edgar degas\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10947438\"]}");
	add("{\"term\":\"edgar douglas adrian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10828490\"]}");
	add("{\"term\":\"edgar guest\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11038679\"]}");
	add("{\"term\":\"edgar lee masters\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11184048\"]}");
	add("{\"term\":\"edgar rice burroughs\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10893980\"]}");
	add("{\"term\":\"edgar varese\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11380529\"]}");
	add("{\"term\":\"edgar wallace\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11391617\"]}");
	add("{\"term\":\"edgard lawrence doctorow\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10957874\"]}");
	add("{\"term\":\"edge\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"03269453\", \"05166240\", \"05179505\", \"03269047\", \"13926085\", \"08583230\"]}");
	add("{\"term\":\"edge tool\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03269943\"]}");
	add("{\"term\":\"edger\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03269817\", \"10064571\"]}");
	add("{\"term\":\"edginess\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07540296\"]}");
	add("{\"term\":\"edging\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03270390\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }