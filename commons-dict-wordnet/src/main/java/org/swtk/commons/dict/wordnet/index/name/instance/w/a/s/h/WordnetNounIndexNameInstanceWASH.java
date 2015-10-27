package org.swtk.commons.dict.wordnet.index.name.instance.w.a.s.h;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceWASH {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"wash\", \"synsetCount\":8, \"upperType\":\"NOUN\", \"ids\":[\"01098579\", \"03653533\", \"04560531\", \"11443311\", \"13595396\", \"09498025\", \"00256577\", \"04560675\"]}");
	add("{\"term\":\"washables\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03653533\"]}");
	add("{\"term\":\"washbasin\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04560989\", \"04561206\"]}");
	add("{\"term\":\"washboard\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04561497\", \"04561692\"]}");
	add("{\"term\":\"washbowl\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04560989\", \"04561206\"]}");
	add("{\"term\":\"washcloth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04561809\"]}");
	add("{\"term\":\"washday\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15247636\"]}");
	add("{\"term\":\"washer\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04561970\", \"04562157\", \"10788571\"]}");
	add("{\"term\":\"washerman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10788752\"]}");
	add("{\"term\":\"washerwoman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10788856\"]}");
	add("{\"term\":\"washhouse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04562284\"]}");
	add("{\"term\":\"washing\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03653533\", \"00256577\"]}");
	add("{\"term\":\"washington\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"11395672\", \"11395413\", \"08374056\", \"09175699\", \"09093291\"]}");
	add("{\"term\":\"washingtonian\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09765520\", \"09765645\"]}");
	add("{\"term\":\"washout\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"10117246\", \"13595396\", \"13942206\"]}");
	add("{\"term\":\"washrag\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04561809\"]}");
	add("{\"term\":\"washroom\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04562577\"]}");
	add("{\"term\":\"washstand\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04561206\", \"04562686\"]}");
	add("{\"term\":\"washtub\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04562886\"]}");
	add("{\"term\":\"washup\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00256467\", \"00256081\"]}");
	add("{\"term\":\"washwoman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10788856\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }