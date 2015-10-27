package org.swtk.commons.dict.wordnet.index.name.instance.e.x.p.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceEXPO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"expo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08424576\"]}");
	add("{\"term\":\"exponent\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06825275\", \"09641790\", \"09794206\"]}");
	add("{\"term\":\"exponential\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13811674\"]}");
	add("{\"term\":\"exponentiation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00874089\"]}");
	add("{\"term\":\"export\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03311152\"]}");
	add("{\"term\":\"exportation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01113857\", \"03311152\"]}");
	add("{\"term\":\"exporter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10093422\"]}");
	add("{\"term\":\"exporting\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01113857\"]}");
	add("{\"term\":\"expose\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07230228\"]}");
	add("{\"term\":\"exposition\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"06754688\", \"06754868\", \"08424576\", \"06755121\"]}");
	add("{\"term\":\"expositor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10093550\"]}");
	add("{\"term\":\"expostulation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07140824\", \"07261402\"]}");
	add("{\"term\":\"exposure\", \"synsetCount\":10, \"upperType\":\"NOUN\", \"ids\":[\"00205508\", \"00523593\", \"00909038\", \"03931348\", \"13661685\", \"14567533\", \"05942859\", \"07230037\", \"00158283\", \"05051127\"]}");
	add("{\"term\":\"expounder\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10093550\"]}");
	add("{\"term\":\"expounding\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06755121\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }