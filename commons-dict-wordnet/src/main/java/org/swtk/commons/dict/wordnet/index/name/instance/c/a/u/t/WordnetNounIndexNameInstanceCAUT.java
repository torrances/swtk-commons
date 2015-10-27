package org.swtk.commons.dict.wordnet.index.name.instance.c.a.u.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCAUT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"cauterant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02990502\"]}");
	add("{\"term\":\"cauterisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00669355\"]}");
	add("{\"term\":\"cauterization\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00669355\"]}");
	add("{\"term\":\"cautery\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00669355\", \"02990502\"]}");
	add("{\"term\":\"caution\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"04898379\", \"05623652\", \"07239827\", \"04671415\"]}");
	add("{\"term\":\"cautious\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07961176\"]}");
	add("{\"term\":\"cautiousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04671415\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }