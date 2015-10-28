package org.swtk.commons.dict.wordnet.indexbyname.instance.l.i.q;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLIQ {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"liquaemin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03520118\"]}");
	add("{\"term\":\"liquefaction\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13529854\"]}");
	add("{\"term\":\"liqueur\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07924183\"]}");
	add("{\"term\":\"liquid\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"07134351\", \"14964238\", \"14504004\", \"14964524\"]}");
	add("{\"term\":\"liquidambar\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"12336817\", \"12336961\", \"12337370\"]}");
	add("{\"term\":\"liquidation\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00224587\", \"01247608\", \"00229402\"]}");
	add("{\"term\":\"liquidator\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10285229\", \"10358420\"]}");
	add("{\"term\":\"liquidiser\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02853991\"]}");
	add("{\"term\":\"liquidity\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04744670\", \"04944220\", \"14504004\"]}");
	add("{\"term\":\"liquidizer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02853991\"]}");
	add("{\"term\":\"liquidness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04944220\", \"14504004\"]}");
	add("{\"term\":\"liquor\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07600292\", \"14965368\", \"07917827\"]}");
	add("{\"term\":\"liquorice\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07622970\", \"12553391\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }