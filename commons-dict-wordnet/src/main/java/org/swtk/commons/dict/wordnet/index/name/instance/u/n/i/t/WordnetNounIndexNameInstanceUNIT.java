package org.swtk.commons.dict.wordnet.index.name.instance.u.n.i.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceUNIT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"unit\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"00003553\", \"09488589\", \"05878479\", \"08206589\", \"13832535\", \"13604927\"]}");
	add("{\"term\":\"unitard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03662837\"]}");
	add("{\"term\":\"unitarian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10758327\"]}");
	add("{\"term\":\"unitarianism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06240471\"]}");
	add("{\"term\":\"uniting\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00382488\", \"01240989\"]}");
	add("{\"term\":\"unitisation\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00954898\", \"01095456\", \"01106079\", \"05739513\"]}");
	add("{\"term\":\"unitization\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00954898\", \"01095456\", \"01106079\", \"05739513\"]}");
	add("{\"term\":\"unity\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04750610\", \"13764713\", \"14484149\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }