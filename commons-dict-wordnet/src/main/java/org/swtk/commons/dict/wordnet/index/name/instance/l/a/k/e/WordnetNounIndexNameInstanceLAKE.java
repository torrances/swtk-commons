package org.swtk.commons.dict.wordnet.index.name.instance.l.a.k.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLAKE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"lake\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"15015571\", \"15015673\", \"09351810\"]}");
	add("{\"term\":\"lakefront\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09354157\"]}");
	add("{\"term\":\"lakeland\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08893639\"]}");
	add("{\"term\":\"lakeshore\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09355796\"]}");
	add("{\"term\":\"lakeside\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09355796\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }