package org.swtk.commons.dict.wordnet.indexbyname.instance.a.d.j;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceADJ {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"adjacency\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05093198\"]}");
	add("{\"term\":\"adjective\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06330022\", \"06332695\"]}");
	add("{\"term\":\"adjournment\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01068994\", \"00216905\"]}");
	add("{\"term\":\"adjudication\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00876135\"]}");
	add("{\"term\":\"adjudicator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09789059\"]}");
	add("{\"term\":\"adjunct\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06323757\", \"09789226\", \"09211126\"]}");
	add("{\"term\":\"adjunction\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00148274\"]}");
	add("{\"term\":\"adjuration\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07201810\"]}");
	add("{\"term\":\"adjuster\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09789352\"]}");
	add("{\"term\":\"adjustment\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"13295115\", \"13448251\", \"01001729\", \"00200556\", \"07384204\"]}");
	add("{\"term\":\"adjustor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09789352\"]}");
	add("{\"term\":\"adjutant\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02005691\", \"09789602\"]}");
	add("{\"term\":\"adjuvant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02683801\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }