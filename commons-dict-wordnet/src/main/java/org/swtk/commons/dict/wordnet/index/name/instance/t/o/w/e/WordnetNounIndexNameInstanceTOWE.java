package org.swtk.commons.dict.wordnet.index.name.instance.t.o.w.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTOWE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"towel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04466597\"]}");
	add("{\"term\":\"toweling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04466845\"]}");
	add("{\"term\":\"towelling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04466845\"]}");
	add("{\"term\":\"tower\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04503138\", \"13923115\", \"04467365\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }