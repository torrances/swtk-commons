package org.swtk.commons.dict.wordnet.indexbyname.instance.s.u.f;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSUF {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"sufferance\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04645532\", \"05039950\"]}");
	add("{\"term\":\"sufferer\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10316279\", \"10615055\"]}");
	add("{\"term\":\"suffering\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"07510467\", \"07511603\", \"14472376\", \"14347683\"]}");
	add("{\"term\":\"sufficiency\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05119909\", \"13601618\", \"14516537\"]}");
	add("{\"term\":\"suffix\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06319977\"]}");
	add("{\"term\":\"suffixation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00929776\"]}");
	add("{\"term\":\"suffocation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14067364\", \"00226460\"]}");
	add("{\"term\":\"suffragan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10691979\"]}");
	add("{\"term\":\"suffrage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05193574\"]}");
	add("{\"term\":\"suffragette\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10692101\"]}");
	add("{\"term\":\"suffragism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05961234\"]}");
	add("{\"term\":\"suffragist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10692347\"]}");
	add("{\"term\":\"suffrutex\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13139466\"]}");
	add("{\"term\":\"suffusion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13556157\"]}");
	add("{\"term\":\"sufi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10691810\"]}");
	add("{\"term\":\"sufism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05958133\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }