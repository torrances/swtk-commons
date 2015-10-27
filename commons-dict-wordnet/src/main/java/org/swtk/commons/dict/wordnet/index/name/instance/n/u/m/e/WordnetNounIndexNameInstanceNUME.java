package org.swtk.commons.dict.wordnet.index.name.instance.n.u.m.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceNUME {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"numen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10386183\"]}");
	add("{\"term\":\"numenius\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02036098\"]}");
	add("{\"term\":\"numeracy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05647276\"]}");
	add("{\"term\":\"numeral\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06820056\"]}");
	add("{\"term\":\"numeration\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00635829\", \"07245619\"]}");
	add("{\"term\":\"numerator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13755011\"]}");
	add("{\"term\":\"numerologist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10386082\"]}");
	add("{\"term\":\"numerology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06258660\"]}");
	add("{\"term\":\"numerosity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05129173\"]}");
	add("{\"term\":\"numerousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05129173\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }