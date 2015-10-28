package org.swtk.commons.dict.wordnet.indexbyname.instance.l.e.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLET {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"let\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00570110\", \"08047773\"]}");
	add("{\"term\":\"letch\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10572408\"]}");
	add("{\"term\":\"letdown\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07555990\"]}");
	add("{\"term\":\"lethality\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04798291\"]}");
	add("{\"term\":\"lethargy\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04643310\", \"05049292\", \"14038461\"]}");
	add("{\"term\":\"lethe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09361359\"]}");
	add("{\"term\":\"leto\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09601011\"]}");
	add("{\"term\":\"letter\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"06719443\", \"07188040\", \"10274904\", \"06841868\", \"06636668\"]}");
	add("{\"term\":\"lettercard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06640632\"]}");
	add("{\"term\":\"letterer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10275045\"]}");
	add("{\"term\":\"letterhead\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06269680\"]}");
	add("{\"term\":\"lettering\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06417342\"]}");
	add("{\"term\":\"letterman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10275156\"]}");
	add("{\"term\":\"letterpress\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06691409\"]}");
	add("{\"term\":\"letters\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05995180\", \"05760419\"]}");
	add("{\"term\":\"letting\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13269292\"]}");
	add("{\"term\":\"lettish\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06959117\"]}");
	add("{\"term\":\"lettuce\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07739304\", \"12006775\", \"13406389\"]}");
	add("{\"term\":\"letup\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15299427\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }