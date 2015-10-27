package org.swtk.commons.dict.wordnet.index.name.instance.m.o.n.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMONE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"monegasque\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10347653\"]}");
	add("{\"term\":\"monera\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01344517\"]}");
	add("{\"term\":\"moneran\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01344910\"]}");
	add("{\"term\":\"moneron\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01344910\"]}");
	add("{\"term\":\"moneses\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12278437\"]}");
	add("{\"term\":\"monet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11205382\"]}");
	add("{\"term\":\"monetarism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06004801\"]}");
	add("{\"term\":\"monetarist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10347789\"]}");
	add("{\"term\":\"monetisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00155509\"]}");
	add("{\"term\":\"monetization\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00155509\"]}");
	add("{\"term\":\"money\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"13406050\", \"13271441\", \"13405730\"]}");
	add("{\"term\":\"moneybag\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03787127\"]}");
	add("{\"term\":\"moneyer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09954379\"]}");
	add("{\"term\":\"moneygrubber\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10347994\"]}");
	add("{\"term\":\"moneylender\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10762041\"]}");
	add("{\"term\":\"moneymaker\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05919171\", \"10348103\"]}");
	add("{\"term\":\"moneymaking\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00079213\"]}");
	add("{\"term\":\"moneyman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10109789\"]}");
	add("{\"term\":\"moneywort\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12116164\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }