package org.swtk.commons.dict.wordnet.indexbyname.instance.a.n.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceANS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ans\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05512183\"]}");
	add("{\"term\":\"ansaid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03376378\"]}");
	add("{\"term\":\"ansar al islam\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08032074\"]}");
	add("{\"term\":\"anselm\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10838464\"]}");
	add("{\"term\":\"anser\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01858866\"]}");
	add("{\"term\":\"anser anser\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01859194\"]}");
	add("{\"term\":\"anser cygnoides\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01859021\"]}");
	add("{\"term\":\"anseres\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01848797\"]}");
	add("{\"term\":\"anseriform bird\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01848118\"]}");
	add("{\"term\":\"anseriformes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01847913\"]}");
	add("{\"term\":\"anserinae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01860664\"]}");
	add("{\"term\":\"anshar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09538404\"]}");
	add("{\"term\":\"answer\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"01237517\", \"06572245\", \"07215187\", \"06756201\", \"06758700\"]}");
	add("{\"term\":\"answerability\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04677185\"]}");
	add("{\"term\":\"answerableness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04677185\"]}");
	add("{\"term\":\"answerer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10544006\"]}");
	add("{\"term\":\"answering machine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02717662\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }