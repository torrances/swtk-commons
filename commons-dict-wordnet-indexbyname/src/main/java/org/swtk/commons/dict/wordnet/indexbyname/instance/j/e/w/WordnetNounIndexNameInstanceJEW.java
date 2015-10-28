package org.swtk.commons.dict.wordnet.indexbyname.instance.j.e.w;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceJEW {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"jew\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09700747\"]}");
	add("{\"term\":\"jewbush\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12949251\"]}");
	add("{\"term\":\"jewel\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10241326\", \"03601980\"]}");
	add("{\"term\":\"jeweler\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10241447\", \"10241626\"]}");
	add("{\"term\":\"jeweller\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10241447\", \"10241626\"]}");
	add("{\"term\":\"jewellery\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03602662\"]}");
	add("{\"term\":\"jewelry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03602662\"]}");
	add("{\"term\":\"jewelweed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12705140\"]}");
	add("{\"term\":\"jewess\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09701369\"]}");
	add("{\"term\":\"jewfish\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02572795\", \"02598697\"]}");
	add("{\"term\":\"jewison\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11104399\"]}");
	add("{\"term\":\"jewry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08496106\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }