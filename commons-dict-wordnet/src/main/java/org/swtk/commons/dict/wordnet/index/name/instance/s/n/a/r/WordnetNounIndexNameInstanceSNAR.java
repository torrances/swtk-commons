package org.swtk.commons.dict.wordnet.index.name.instance.s.n.a.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSNAR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"snare\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"04255961\", \"04256139\", \"04256314\", \"04256525\", \"05845694\"]}");
	add("{\"term\":\"snarer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10635324\"]}");
	add("{\"term\":\"snarl\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05693684\", \"06891756\", \"07144466\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }