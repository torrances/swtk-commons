package org.swtk.commons.dict.wordnet.index.name.instance.a.n.o.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceANOR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"anorak\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03896748\"]}");
	add("{\"term\":\"anorchia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14046320\"]}");
	add("{\"term\":\"anorchidism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14046320\"]}");
	add("{\"term\":\"anorchism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14046320\"]}");
	add("{\"term\":\"anorectic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09815192\"]}");
	add("{\"term\":\"anorexia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14079278\"]}");
	add("{\"term\":\"anorexic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09815192\"]}");
	add("{\"term\":\"anorgasmia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14080070\"]}");
	add("{\"term\":\"anorthite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14889818\"]}");
	add("{\"term\":\"anorthography\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14119430\"]}");
	add("{\"term\":\"anorthopia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14120803\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }