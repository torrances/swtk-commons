package org.swtk.commons.dict.wordnet.index.name.instance.v.i.c.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceVICA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"vicar\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"10769856\", \"10770033\", \"10769699\"]}");
	add("{\"term\":\"vicarage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03898254\"]}");
	add("{\"term\":\"vicariate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08117873\"]}");
	add("{\"term\":\"vicarship\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08117873\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }