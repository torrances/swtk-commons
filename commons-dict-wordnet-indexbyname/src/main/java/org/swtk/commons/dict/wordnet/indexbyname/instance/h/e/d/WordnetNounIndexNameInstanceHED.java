package org.swtk.commons.dict.wordnet.indexbyname.instance.h.e.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHED {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"hedeoma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12868509\"]}");
	add("{\"term\":\"hedera\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11819320\"]}");
	add("{\"term\":\"hedge\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06774314\", \"13365477\", \"03516319\"]}");
	add("{\"term\":\"hedgefund\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08088065\"]}");
	add("{\"term\":\"hedgehog\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01896466\", \"02349279\"]}");
	add("{\"term\":\"hedger\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"10187333\", \"10187431\", \"10187605\"]}");
	add("{\"term\":\"hedgerow\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03516319\"]}");
	add("{\"term\":\"hedging\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06774314\", \"13365477\"]}");
	add("{\"term\":\"hediondilla\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12743822\"]}");
	add("{\"term\":\"hedjaz\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09017885\"]}");
	add("{\"term\":\"hedonism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06170312\", \"09206868\"]}");
	add("{\"term\":\"hedonist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10187776\"]}");
	add("{\"term\":\"hedysarum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12554958\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }