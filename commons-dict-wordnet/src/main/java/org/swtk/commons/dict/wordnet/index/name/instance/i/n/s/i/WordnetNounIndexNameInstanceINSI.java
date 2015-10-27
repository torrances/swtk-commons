package org.swtk.commons.dict.wordnet.index.name.instance.i.n.s.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceINSI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"inside\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08605707\", \"08605849\"]}");
	add("{\"term\":\"insider\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10228184\"]}");
	add("{\"term\":\"insidiousness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04887333\", \"05173787\"]}");
	add("{\"term\":\"insight\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"05716154\", \"05815314\", \"07528486\", \"05718303\"]}");
	add("{\"term\":\"insightfulness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05629591\"]}");
	add("{\"term\":\"insignia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06896123\"]}");
	add("{\"term\":\"insignificance\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05181106\"]}");
	add("{\"term\":\"insincerity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04875102\"]}");
	add("{\"term\":\"insinuation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00160893\", \"07253115\"]}");
	add("{\"term\":\"insipidity\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05004447\", \"05213274\"]}");
	add("{\"term\":\"insipidness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05004447\", \"05213274\"]}");
	add("{\"term\":\"insistence\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01217047\", \"14474815\", \"07206437\"]}");
	add("{\"term\":\"insistency\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01217047\", \"14474815\"]}");
	add("{\"term\":\"insisting\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07206437\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }