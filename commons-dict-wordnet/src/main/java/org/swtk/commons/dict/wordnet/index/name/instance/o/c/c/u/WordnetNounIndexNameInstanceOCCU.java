package org.swtk.commons.dict.wordnet.index.name.instance.o.c.c.u;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceOCCU {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"occult\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00413585\", \"09527009\"]}");
	add("{\"term\":\"occultation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07383246\"]}");
	add("{\"term\":\"occultism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05977155\", \"05977317\"]}");
	add("{\"term\":\"occultist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10390080\"]}");
	add("{\"term\":\"occupancy\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00087629\", \"01056259\"]}");
	add("{\"term\":\"occupant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10543112\"]}");
	add("{\"term\":\"occupation\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"15166446\", \"00087629\", \"00583905\", \"01135427\", \"00583425\"]}");
	add("{\"term\":\"occupier\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10389654\", \"10543112\"]}");
	add("{\"term\":\"occurrence\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13982355\", \"07298313\"]}");
	add("{\"term\":\"occurrent\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07298313\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }