package org.swtk.commons.dict.wordnet.indexbyname.instance.u.n.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceUNI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"uniat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09700503\"]}");
	add("{\"term\":\"uniate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09700503\"]}");
	add("{\"term\":\"unicef\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08316832\"]}");
	add("{\"term\":\"unicorn\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10757621\"]}");
	add("{\"term\":\"unicycle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04516712\"]}");
	add("{\"term\":\"unicyclist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10757768\"]}");
	add("{\"term\":\"unification\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00382488\", \"14441799\", \"07388202\"]}");
	add("{\"term\":\"uniform\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04516887\"]}");
	add("{\"term\":\"uniformity\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04752610\", \"04776288\"]}");
	add("{\"term\":\"uniformness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04752610\"]}");
	add("{\"term\":\"unilateralism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05972611\"]}");
	add("{\"term\":\"unilateralist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10757872\"]}");
	add("{\"term\":\"unimportance\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05180123\", \"14459904\"]}");
	add("{\"term\":\"uninitiate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07965340\"]}");
	add("{\"term\":\"uninsurability\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04725582\"]}");
	add("{\"term\":\"unintelligibility\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04830937\", \"06621330\"]}");
	add("{\"term\":\"uninterestingness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05212608\"]}");
	add("{\"term\":\"unio\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01967462\"]}");
	add("{\"term\":\"union\", \"synsetCount\":11, \"upperType\":\"NOUN\", \"ids\":[\"00382488\", \"04517110\", \"07387877\", \"08015154\", \"08321825\", \"13592568\", \"13987306\", \"14441799\", \"00848970\", \"09074770\", \"08249977\"]}");
	add("{\"term\":\"unionidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01967277\"]}");
	add("{\"term\":\"unionisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00243450\"]}");
	add("{\"term\":\"unionism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08490493\"]}");
	add("{\"term\":\"unionist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10740613\"]}");
	add("{\"term\":\"unionization\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00243450\"]}");
	add("{\"term\":\"uniqueness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04770905\"]}");
	add("{\"term\":\"unison\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04989030\", \"05056288\", \"13995952\"]}");
	add("{\"term\":\"unit\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"00003553\", \"09488589\", \"05878479\", \"08206589\", \"13832535\", \"13604927\"]}");
	add("{\"term\":\"unitard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03662837\"]}");
	add("{\"term\":\"unitarian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10758327\"]}");
	add("{\"term\":\"unitarianism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06240471\"]}");
	add("{\"term\":\"uniting\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00382488\", \"01240989\"]}");
	add("{\"term\":\"unitisation\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00954898\", \"01095456\", \"01106079\", \"05739513\"]}");
	add("{\"term\":\"unitization\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00954898\", \"01095456\", \"01106079\", \"05739513\"]}");
	add("{\"term\":\"unity\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04750610\", \"13764713\", \"14484149\"]}");
	add("{\"term\":\"univalve\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01944818\"]}");
	add("{\"term\":\"universal\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"04518001\", \"05676203\", \"06764081\", \"07274652\"]}");
	add("{\"term\":\"universalism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06202400\"]}");
	add("{\"term\":\"universality\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04772946\"]}");
	add("{\"term\":\"universe\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05822288\", \"06035684\", \"09489410\"]}");
	add("{\"term\":\"university\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"08303490\", \"04518297\", \"08303084\"]}");
	add("{\"term\":\"unix\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06580882\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }