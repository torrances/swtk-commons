package org.swtk.commons.dict.wordnet.index.name.instance.n.e.c.k;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceNECK {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"neck\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"03819652\", \"03819888\", \"07677102\", \"09390630\", \"05554173\"]}");
	add("{\"term\":\"neckar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09390724\"]}");
	add("{\"term\":\"neckband\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03028565\", \"03072185\", \"03820068\"]}");
	add("{\"term\":\"neckcloth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03820267\"]}");
	add("{\"term\":\"necker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10370795\"]}");
	add("{\"term\":\"neckerchief\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03820357\"]}");
	add("{\"term\":\"necking\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00855630\", \"03453435\"]}");
	add("{\"term\":\"necklace\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03820446\"]}");
	add("{\"term\":\"necklet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03820689\"]}");
	add("{\"term\":\"neckline\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03820818\"]}");
	add("{\"term\":\"neckpiece\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03821022\"]}");
	add("{\"term\":\"necktie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03821155\"]}");
	add("{\"term\":\"neckwear\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03821545\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }