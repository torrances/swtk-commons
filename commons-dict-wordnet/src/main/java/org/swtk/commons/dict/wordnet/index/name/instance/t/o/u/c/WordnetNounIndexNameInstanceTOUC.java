package org.swtk.commons.dict.wordnet.index.name.instance.t.o.u.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTOUC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"toucan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01846024\"]}");
	add("{\"term\":\"toucanet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01846360\"]}");
	add("{\"term\":\"touch\", \"synsetCount\":12, \"upperType\":\"NOUN\", \"ids\":[\"04953937\", \"05650398\", \"05730374\", \"07202898\", \"14105668\", \"07293990\", \"13796315\", \"00047263\", \"04938605\", \"07178814\", \"05662964\", \"07424192\"]}");
	add("{\"term\":\"touchback\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00189298\"]}");
	add("{\"term\":\"touchdown\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00305831\", \"00189615\"]}");
	add("{\"term\":\"toucher\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10737238\"]}");
	add("{\"term\":\"touchiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07568482\"]}");
	add("{\"term\":\"touching\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00047263\", \"07424192\"]}");
	add("{\"term\":\"touchline\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08671604\"]}");
	add("{\"term\":\"touchscreen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04466078\"]}");
	add("{\"term\":\"touchstone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07275291\"]}");
	add("{\"term\":\"touchwood\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15126153\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }