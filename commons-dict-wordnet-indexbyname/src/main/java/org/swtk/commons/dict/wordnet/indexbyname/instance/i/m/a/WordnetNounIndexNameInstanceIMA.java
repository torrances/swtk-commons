package org.swtk.commons.dict.wordnet.indexbyname.instance.i.m.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceIMA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"image\", \"synsetCount\":9, \"upperType\":\"NOUN\", \"ids\":[\"03270785\", \"04683134\", \"08016746\", \"10046971\", \"07120141\", \"05946242\", \"03937282\", \"04685073\", \"05936904\"]}");
	add("{\"term\":\"imagery\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05775730\"]}");
	add("{\"term\":\"imaginary\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13751538\"]}");
	add("{\"term\":\"imagination\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05641705\", \"05775730\", \"05633248\"]}");
	add("{\"term\":\"imaginativeness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05633248\"]}");
	add("{\"term\":\"imaging\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00902781\", \"05775730\"]}");
	add("{\"term\":\"imagism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08485510\"]}");
	add("{\"term\":\"imago\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02315564\", \"05946732\"]}");
	add("{\"term\":\"imam\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10218870\"]}");
	add("{\"term\":\"imaret\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03566753\"]}");
	add("{\"term\":\"imaum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10218870\"]}");
	add("{\"term\":\"imavate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03567069\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }