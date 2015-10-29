package org.swtk.commons.dict.wordnet.indexbyname.instance.z.a.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceZAN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"zane grey\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11036071\"]}");
	add("{\"term\":\"zangwill\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11424867\"]}");
	add("{\"term\":\"zannichellia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12638711\"]}");
	add("{\"term\":\"zannichellia palustris\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12638907\"]}");
	add("{\"term\":\"zannichelliaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12638500\"]}");
	add("{\"term\":\"zantac\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04061107\"]}");
	add("{\"term\":\"zantedeschia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11814120\"]}");
	add("{\"term\":\"zantedeschia aethiopica\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11814248\"]}");
	add("{\"term\":\"zantedeschia rehmanii\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11814493\"]}");
	add("{\"term\":\"zanthoxylum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12735310\"]}");
	add("{\"term\":\"zanthoxylum americanum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12735709\"]}");
	add("{\"term\":\"zanthoxylum flavum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12736168\"]}");
	add("{\"term\":\"zanthoxylum fraxineum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12735709\"]}");
	add("{\"term\":\"zanuck\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11424967\"]}");
	add("{\"term\":\"zany\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10177319\", \"10824717\"]}");
	add("{\"term\":\"zanzibar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09057933\"]}");
	add("{\"term\":\"zanzibar copal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14920169\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }