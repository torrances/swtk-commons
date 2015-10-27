package org.swtk.commons.dict.wordnet.index.name.instance.l.e.f.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLEFT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"left\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"00351994\", \"03659700\", \"05573181\", \"08433285\", \"08643037\"]}");
	add("{\"term\":\"leftfield\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00725684\", \"03659700\"]}");
	add("{\"term\":\"lefthander\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10272618\"]}");
	add("{\"term\":\"leftism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06228396\"]}");
	add("{\"term\":\"leftist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10638692\"]}");
	add("{\"term\":\"leftover\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13833396\"]}");
	add("{\"term\":\"leftovers\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07579074\"]}");
	add("{\"term\":\"lefty\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10272618\", \"10272819\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }