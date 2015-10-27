package org.swtk.commons.dict.wordnet.index.name.instance.t.u.b.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTUBE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"tube\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"03762667\", \"05253854\", \"13924014\", \"04501499\", \"04500800\"]}");
	add("{\"term\":\"tubeless\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04502057\"]}");
	add("{\"term\":\"tuber\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13005996\", \"13149124\"]}");
	add("{\"term\":\"tuberaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13005770\"]}");
	add("{\"term\":\"tuberales\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13005562\"]}");
	add("{\"term\":\"tubercle\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05550319\", \"13109749\", \"14234922\"]}");
	add("{\"term\":\"tubercular\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09979480\"]}");
	add("{\"term\":\"tubercularia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13102325\"]}");
	add("{\"term\":\"tuberculariaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13102129\"]}");
	add("{\"term\":\"tuberculin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15136470\"]}");
	add("{\"term\":\"tuberculosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14166897\"]}");
	add("{\"term\":\"tuberose\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12500961\"]}");
	add("{\"term\":\"tuberosity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05550319\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }