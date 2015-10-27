package org.swtk.commons.dict.wordnet.index.name.instance.c.a.p.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCAPT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"captain\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"09911965\", \"09912145\", \"09912796\", \"10318579\", \"09912467\", \"09912283\", \"09912643\"]}");
	add("{\"term\":\"captaincy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00590806\"]}");
	add("{\"term\":\"captainship\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00590806\"]}");
	add("{\"term\":\"caption\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06358261\", \"06358958\", \"07224351\"]}");
	add("{\"term\":\"captivation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07513215\", \"14431303\"]}");
	add("{\"term\":\"captive\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"09913052\", \"09912954\", \"10495671\"]}");
	add("{\"term\":\"captivity\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14020535\", \"14022691\"]}");
	add("{\"term\":\"captopril\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02961438\"]}");
	add("{\"term\":\"captor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09632591\"]}");
	add("{\"term\":\"capture\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"00167523\", \"00776783\", \"13463888\", \"13464040\", \"00089301\"]}");
	add("{\"term\":\"capturer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09632591\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }