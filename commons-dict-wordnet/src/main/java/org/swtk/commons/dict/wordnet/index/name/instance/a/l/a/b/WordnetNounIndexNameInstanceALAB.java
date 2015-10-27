package org.swtk.commons.dict.wordnet.index.name.instance.a.l.a.b;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceALAB {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"alabama\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"06925024\", \"09214753\", \"09666058\", \"09075641\"]}");
	add("{\"term\":\"alabaman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09760187\"]}");
	add("{\"term\":\"alabamian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09760187\"]}");
	add("{\"term\":\"alabaster\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04968239\", \"14689648\", \"14689530\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }