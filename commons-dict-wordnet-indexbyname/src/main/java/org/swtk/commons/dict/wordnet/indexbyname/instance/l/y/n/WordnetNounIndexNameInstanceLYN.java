package org.swtk.commons.dict.wordnet.indexbyname.instance.l.y.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLYN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"lynch law\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00418018\"]}");
	add("{\"term\":\"lynch mob\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08201648\"]}");
	add("{\"term\":\"lynchburg\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09173869\"]}");
	add("{\"term\":\"lynching\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00225466\"]}");
	add("{\"term\":\"lynchpin\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03675665\", \"05702197\"]}");
	add("{\"term\":\"lyndon baines johnson\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11108336\"]}");
	add("{\"term\":\"lyndon johnson\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11108336\"]}");
	add("{\"term\":\"lynn fontanne\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10994263\"]}");
	add("{\"term\":\"lynx\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02129704\", \"06583900\"]}");
	add("{\"term\":\"lynx canadensis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02130033\"]}");
	add("{\"term\":\"lynx caracal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02130330\"]}");
	add("{\"term\":\"lynx lynx\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02129944\"]}");
	add("{\"term\":\"lynx pardina\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02130238\"]}");
	add("{\"term\":\"lynx rufus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02130134\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }