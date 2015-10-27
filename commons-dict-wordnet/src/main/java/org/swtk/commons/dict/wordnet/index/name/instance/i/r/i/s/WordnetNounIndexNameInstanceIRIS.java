package org.swtk.commons.dict.wordnet.index.name.instance.i.r.i.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceIRIS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"iris\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03589818\", \"05327486\", \"12432427\"]}");
	add("{\"term\":\"irish\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06973518\", \"07923401\", \"09752192\"]}");
	add("{\"term\":\"irishman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09734561\"]}");
	add("{\"term\":\"irishwoman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09734699\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }