package org.swtk.commons.dict.wordnet.index.name.instance.b.u.r.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBURN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"burn\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"00404732\", \"04701438\", \"14313092\", \"14314036\", \"14348846\"]}");
	add("{\"term\":\"burnability\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04719681\"]}");
	add("{\"term\":\"burner\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02926715\", \"02926513\"]}");
	add("{\"term\":\"burnett\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10892890\"]}");
	add("{\"term\":\"burnham\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10893092\"]}");
	add("{\"term\":\"burning\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"00423394\", \"01167108\", \"01167602\", \"13471379\", \"14348846\", \"00378877\"]}");
	add("{\"term\":\"burnish\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04962337\"]}");
	add("{\"term\":\"burnoose\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02926919\"]}");
	add("{\"term\":\"burnous\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02926919\"]}");
	add("{\"term\":\"burnouse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02926919\"]}");
	add("{\"term\":\"burns\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10893266\", \"10893370\"]}");
	add("{\"term\":\"burnside\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05270301\", \"10893524\"]}");
	add("{\"term\":\"burnup\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00357342\", \"07474599\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }