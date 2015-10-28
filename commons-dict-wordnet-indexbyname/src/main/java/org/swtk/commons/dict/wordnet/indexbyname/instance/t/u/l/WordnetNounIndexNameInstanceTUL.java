package org.swtk.commons.dict.wordnet.indexbyname.instance.t.u.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTUL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"tularaemia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14299862\"]}");
	add("{\"term\":\"tularemia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14299862\"]}");
	add("{\"term\":\"tulestoma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12991320\"]}");
	add("{\"term\":\"tulip\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12474664\"]}");
	add("{\"term\":\"tulipa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12474526\"]}");
	add("{\"term\":\"tulipwood\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11733090\", \"12209001\"]}");
	add("{\"term\":\"tulle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04503909\"]}");
	add("{\"term\":\"tully\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10917698\"]}");
	add("{\"term\":\"tulostoma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12991320\"]}");
	add("{\"term\":\"tulostomaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12991139\"]}");
	add("{\"term\":\"tulostomataceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12991139\"]}");
	add("{\"term\":\"tulostomatales\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13062308\"]}");
	add("{\"term\":\"tulsa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09155466\"]}");
	add("{\"term\":\"tulu\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06992745\", \"09695284\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }