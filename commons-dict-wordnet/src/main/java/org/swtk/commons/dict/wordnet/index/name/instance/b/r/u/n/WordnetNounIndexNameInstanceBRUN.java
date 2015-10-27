package org.swtk.commons.dict.wordnet.index.name.instance.b.r.u.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBRUN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"brunanburh\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01275574\"]}");
	add("{\"term\":\"brunch\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07590488\"]}");
	add("{\"term\":\"brunei\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08916319\"]}");
	add("{\"term\":\"bruneian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09714910\"]}");
	add("{\"term\":\"brunelleschi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10888149\"]}");
	add("{\"term\":\"brunet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09897322\"]}");
	add("{\"term\":\"brunette\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09897322\"]}");
	add("{\"term\":\"brunfelsia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12919719\"]}");
	add("{\"term\":\"brunhild\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09613669\"]}");
	add("{\"term\":\"brunn\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08776167\"]}");
	add("{\"term\":\"brunnhilde\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09613669\"]}");
	add("{\"term\":\"bruno\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"10888325\", \"10888567\", \"11147555\"]}");
	add("{\"term\":\"brunswick\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"08790384\", \"09099777\", \"09115650\"]}");
	add("{\"term\":\"brunt\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05042867\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }