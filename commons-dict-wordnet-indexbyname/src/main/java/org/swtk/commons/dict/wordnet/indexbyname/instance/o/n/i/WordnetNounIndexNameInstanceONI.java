package org.swtk.commons.dict.wordnet.indexbyname.instance.o.n.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceONI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"oni\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08211206\"]}");
	add("{\"term\":\"onion\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07737962\", \"12453313\", \"12453586\"]}");
	add("{\"term\":\"onion bagel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07709634\"]}");
	add("{\"term\":\"onion bread\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07700167\"]}");
	add("{\"term\":\"onion butter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07871697\"]}");
	add("{\"term\":\"onion dome\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03852991\"]}");
	add("{\"term\":\"onion louse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02275204\"]}");
	add("{\"term\":\"onion mildew\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13002061\"]}");
	add("{\"term\":\"onion plant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12453313\"]}");
	add("{\"term\":\"onion roll\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07708150\"]}");
	add("{\"term\":\"onion salt\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07829471\"]}");
	add("{\"term\":\"onion smut\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13089495\"]}");
	add("{\"term\":\"onion stem\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13035639\"]}");
	add("{\"term\":\"onion thrips\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02275204\"]}");
	add("{\"term\":\"onion yellow dwarf\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14308510\"]}");
	add("{\"term\":\"onionskin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14993813\"]}");
	add("{\"term\":\"oniscidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01994330\"]}");
	add("{\"term\":\"oniscus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01994462\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }