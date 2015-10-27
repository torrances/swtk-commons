package org.swtk.commons.dict.wordnet.index.name.instance.s.t.i.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSTIG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"stigma\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"04703433\", \"05258032\", \"06807523\", \"11698054\"]}");
	add("{\"term\":\"stigmata\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14309937\"]}");
	add("{\"term\":\"stigmatic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10675927\"]}");
	add("{\"term\":\"stigmatisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01225977\"]}");
	add("{\"term\":\"stigmatism\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05662628\", \"13961696\", \"14595511\"]}");
	add("{\"term\":\"stigmatist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10675927\"]}");
	add("{\"term\":\"stigmatization\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01225977\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }