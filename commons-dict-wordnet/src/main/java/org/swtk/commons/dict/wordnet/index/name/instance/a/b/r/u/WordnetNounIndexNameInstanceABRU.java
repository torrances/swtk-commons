package org.swtk.commons.dict.wordnet.index.name.instance.a.b.r.u;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceABRU {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"abruption\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01070452\"]}");
	add("{\"term\":\"abruptness\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05067645\", \"05076793\", \"04922639\"]}");
	add("{\"term\":\"abruzzi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08822006\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }