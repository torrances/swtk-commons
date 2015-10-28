package org.swtk.commons.dict.wordnet.indexbyname.instance.s.k.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSKE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"skeat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11324349\"]}");
	add("{\"term\":\"skedaddle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00061567\"]}");
	add("{\"term\":\"skeet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00125162\"]}");
	add("{\"term\":\"skeg\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04233384\"]}");
	add("{\"term\":\"skein\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04233526\"]}");
	add("{\"term\":\"skeleton\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"04233599\", \"05593033\", \"07321099\", \"13785766\"]}");
	add("{\"term\":\"skep\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04234024\", \"04234112\"]}");
	add("{\"term\":\"skepful\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13792134\"]}");
	add("{\"term\":\"skeptic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10624042\"]}");
	add("{\"term\":\"skepticism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05988918\", \"05706947\"]}");
	add("{\"term\":\"sketch\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"06793517\", \"06481365\", \"07217676\", \"04234206\"]}");
	add("{\"term\":\"sketchbook\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04234432\"]}");
	add("{\"term\":\"sketcher\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04234581\", \"10624288\"]}");
	add("{\"term\":\"sketchiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14486149\"]}");
	add("{\"term\":\"skewer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04234962\"]}");
	add("{\"term\":\"skewness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05073364\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }