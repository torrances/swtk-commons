package org.swtk.commons.dict.wordnet.indexbyname.instance.i.s.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceISR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"israel\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08810147\", \"08810400\"]}");
	add("{\"term\":\"israel baline\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10867050\"]}");
	add("{\"term\":\"israel strassberg\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11341046\"]}");
	add("{\"term\":\"israel zangwill\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11424867\"]}");
	add("{\"term\":\"israeli\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09735229\"]}");
	add("{\"term\":\"israeli defense force\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08362540\"]}");
	add("{\"term\":\"israeli monetary unit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13728288\"]}");
	add("{\"term\":\"israelite\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09700747\", \"09735081\"]}");
	add("{\"term\":\"israelites\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08500946\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }