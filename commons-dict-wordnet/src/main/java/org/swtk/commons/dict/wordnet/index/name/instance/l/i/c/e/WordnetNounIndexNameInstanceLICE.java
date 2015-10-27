package org.swtk.commons.dict.wordnet.index.name.instance.l.i.c.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLICE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"licence\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06561652\", \"14018291\", \"14018863\"]}");
	add("{\"term\":\"license\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"01141515\", \"14018863\", \"14018291\", \"06561652\"]}");
	add("{\"term\":\"licensee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10278190\"]}");
	add("{\"term\":\"licenser\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10278299\"]}");
	add("{\"term\":\"licentiate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10278483\"]}");
	add("{\"term\":\"licentiousness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00749605\", \"04858946\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }