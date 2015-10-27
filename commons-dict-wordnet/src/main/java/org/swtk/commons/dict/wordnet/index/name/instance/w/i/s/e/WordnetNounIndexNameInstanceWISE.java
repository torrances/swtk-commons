package org.swtk.commons.dict.wordnet.index.name.instance.w.i.s.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceWISE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"wise\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"11413119\", \"11413310\", \"04938910\"]}");
	add("{\"term\":\"wiseacre\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10803789\"]}");
	add("{\"term\":\"wisecrack\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06780568\"]}");
	add("{\"term\":\"wiseness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04897307\", \"05167331\"]}");
	add("{\"term\":\"wisenheimer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10803789\"]}");
	add("{\"term\":\"wisent\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02413546\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }