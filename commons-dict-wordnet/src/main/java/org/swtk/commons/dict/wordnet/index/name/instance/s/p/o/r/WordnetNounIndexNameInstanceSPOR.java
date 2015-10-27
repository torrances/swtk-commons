package org.swtk.commons.dict.wordnet.index.name.instance.s.p.o.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSPOR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"sporangiophore\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13112741\"]}");
	add("{\"term\":\"sporangium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13112533\"]}");
	add("{\"term\":\"sporanox\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03593855\"]}");
	add("{\"term\":\"spore\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11568306\"]}");
	add("{\"term\":\"spork\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04291576\"]}");
	add("{\"term\":\"sporobolus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12160654\"]}");
	add("{\"term\":\"sporocarp\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11571176\"]}");
	add("{\"term\":\"sporophore\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13114139\"]}");
	add("{\"term\":\"sporophyl\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13112379\"]}");
	add("{\"term\":\"sporophyll\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13112379\"]}");
	add("{\"term\":\"sporophyte\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11707381\"]}");
	add("{\"term\":\"sporotrichosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14205935\"]}");
	add("{\"term\":\"sporozoa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01424137\"]}");
	add("{\"term\":\"sporozoan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01424448\"]}");
	add("{\"term\":\"sporozoite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01424826\"]}");
	add("{\"term\":\"sporran\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04291710\"]}");
	add("{\"term\":\"sport\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"06793739\", \"10361391\", \"10658320\", \"10658445\", \"10658636\", \"00434156\", \"00524569\"]}");
	add("{\"term\":\"sportfishing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00454959\"]}");
	add("{\"term\":\"sportiveness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04657192\"]}");
	add("{\"term\":\"sportscast\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06696340\"]}");
	add("{\"term\":\"sportscaster\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10659035\"]}");
	add("{\"term\":\"sportsman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10658320\"]}");
	add("{\"term\":\"sportsmanship\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04846786\"]}");
	add("{\"term\":\"sportswear\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04292941\"]}");
	add("{\"term\":\"sportswoman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10658320\"]}");
	add("{\"term\":\"sportswriter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10659482\"]}");
	add("{\"term\":\"sporulation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13538402\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }