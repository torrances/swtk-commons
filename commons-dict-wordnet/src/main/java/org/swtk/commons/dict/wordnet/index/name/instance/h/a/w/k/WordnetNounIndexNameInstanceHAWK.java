package org.swtk.commons.dict.wordnet.index.name.instance.h.a.w.k;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHAWK {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"hawk\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03792697\", \"10182237\", \"01608271\"]}");
	add("{\"term\":\"hawkbill\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01667631\"]}");
	add("{\"term\":\"hawkbit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12009362\"]}");
	add("{\"term\":\"hawker\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10096384\", \"10431296\"]}");
	add("{\"term\":\"hawking\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01119289\", \"11054870\"]}");
	add("{\"term\":\"hawkins\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11055013\", \"11055128\"]}");
	add("{\"term\":\"hawkishness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06231735\"]}");
	add("{\"term\":\"hawkmoth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02301193\"]}");
	add("{\"term\":\"hawksbill\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01667631\"]}");
	add("{\"term\":\"hawkshaw\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10031439\"]}");
	add("{\"term\":\"hawkweed\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12002584\", \"12024165\"]}");
	add("{\"term\":\"hawkyns\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11055128\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }