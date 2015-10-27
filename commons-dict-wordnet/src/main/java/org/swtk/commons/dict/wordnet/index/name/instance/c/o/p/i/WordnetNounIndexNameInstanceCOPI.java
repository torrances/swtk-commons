package org.swtk.commons.dict.wordnet.index.name.instance.c.o.p.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCOPI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"copier\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03262289\"]}");
	add("{\"term\":\"copilot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09983732\"]}");
	add("{\"term\":\"coping\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03508241\"]}");
	add("{\"term\":\"copiousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05122340\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }