package org.swtk.commons.dict.wordnet.index.name.instance.t.h.u.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTHUR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"thurber\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11361755\"]}");
	add("{\"term\":\"thurible\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02996823\"]}");
	add("{\"term\":\"thurifer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10729820\"]}");
	add("{\"term\":\"thuringia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08794153\"]}");
	add("{\"term\":\"thursday\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15189401\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }