package org.swtk.commons.dict.wordnet.index.name.instance.d.a.m.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDAMA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"dama\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02435836\"]}");
	add("{\"term\":\"damage\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"00745429\", \"13324337\", \"00403900\", \"07354253\", \"07435370\"]}");
	add("{\"term\":\"damages\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13311699\"]}");
	add("{\"term\":\"damaliscus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02424895\"]}");
	add("{\"term\":\"damar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14919958\"]}");
	add("{\"term\":\"damascene\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03165259\", \"09753012\"]}");
	add("{\"term\":\"damascus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09056411\"]}");
	add("{\"term\":\"damask\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03165406\", \"03165560\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }