package org.swtk.commons.dict.wordnet.index.name.instance.s.i.g.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSIGN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"sign\", \"synsetCount\":11, \"upperType\":\"NOUN\", \"ids\":[\"06824483\", \"07290723\", \"06889194\", \"07300719\", \"13878771\", \"14325305\", \"08703415\", \"04224949\", \"06804229\", \"06806088\", \"06659006\"]}");
	add("{\"term\":\"signage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08091257\"]}");
	add("{\"term\":\"signal\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"11467415\", \"09208177\", \"06804229\"]}");
	add("{\"term\":\"signaler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10616307\"]}");
	add("{\"term\":\"signaling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06804229\"]}");
	add("{\"term\":\"signalisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06811194\"]}");
	add("{\"term\":\"signalization\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06811194\"]}");
	add("{\"term\":\"signaller\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10616307\"]}");
	add("{\"term\":\"signalman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10616499\"]}");
	add("{\"term\":\"signatory\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10616642\"]}");
	add("{\"term\":\"signature\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"06266618\", \"06876668\", \"07042575\", \"04938605\", \"06416225\"]}");
	add("{\"term\":\"signboard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04224949\"]}");
	add("{\"term\":\"signer\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10616642\", \"10616913\"]}");
	add("{\"term\":\"signet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04225209\"]}");
	add("{\"term\":\"significance\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06613680\", \"05929385\", \"05177340\"]}");
	add("{\"term\":\"signification\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06613680\"]}");
	add("{\"term\":\"signified\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06614825\"]}");
	add("{\"term\":\"signifier\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06301417\"]}");
	add("{\"term\":\"signing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06888747\"]}");
	add("{\"term\":\"signior\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10617153\"]}");
	add("{\"term\":\"signor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10617153\"]}");
	add("{\"term\":\"signora\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06353732\", \"10617297\"]}");
	add("{\"term\":\"signore\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10617421\"]}");
	add("{\"term\":\"signorina\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06353860\", \"10617589\"]}");
	add("{\"term\":\"signory\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13273192\"]}");
	add("{\"term\":\"signpost\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06807231\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }