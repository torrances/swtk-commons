package org.swtk.commons.dict.wordnet.index.name.instance.b.r.o.w;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBROW {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"brow\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"08602314\", \"05321060\", \"05610303\"]}");
	add("{\"term\":\"browallia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12919534\"]}");
	add("{\"term\":\"brown\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"02911310\", \"10885804\", \"10885972\", \"04979195\"]}");
	add("{\"term\":\"browne\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10886158\", \"10886325\"]}");
	add("{\"term\":\"brownie\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07651880\", \"09563850\", \"09896836\"]}");
	add("{\"term\":\"browning\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00247419\", \"10886470\", \"10886651\", \"10886825\"]}");
	add("{\"term\":\"brownness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04979195\"]}");
	add("{\"term\":\"brownout\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14007567\"]}");
	add("{\"term\":\"brownshirt\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09896909\"]}");
	add("{\"term\":\"brownstone\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02911198\", \"14809999\"]}");
	add("{\"term\":\"brownsville\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09166058\"]}");
	add("{\"term\":\"browntail\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02289077\"]}");
	add("{\"term\":\"browse\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00840684\", \"06611001\", \"08454309\"]}");
	add("{\"term\":\"browser\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06583477\", \"09897053\"]}");
	add("{\"term\":\"browsing\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00840684\", \"06611001\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }