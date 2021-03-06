package org.swtk.commons.dict.wordnet.indexbyname.instance.g.a.y;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGAY {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"gay\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10202544\"]}");
	add("{\"term\":\"gay lib\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00802318\"]}");
	add("{\"term\":\"gay liberation movement\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00802318\"]}");
	add("{\"term\":\"gay woman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10274662\"]}");
	add("{\"term\":\"gayal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02412787\"]}");
	add("{\"term\":\"gayfeather\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12011732\"]}");
	add("{\"term\":\"gaylussacia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12256880\"]}");
	add("{\"term\":\"gaylussacia baccata\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12257285\"]}");
	add("{\"term\":\"gaylussacia brachycera\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12257669\"]}");
	add("{\"term\":\"gaylussacia frondosa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12257494\"]}");
	add("{\"term\":\"gayness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00858476\"]}");
	add("{\"term\":\"gaywings\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12726458\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }