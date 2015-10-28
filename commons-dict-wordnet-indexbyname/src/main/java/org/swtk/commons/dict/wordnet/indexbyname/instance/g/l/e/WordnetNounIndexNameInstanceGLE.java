package org.swtk.commons.dict.wordnet.indexbyname.instance.g.l.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGLE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"gleam\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07427078\", \"04961711\"]}");
	add("{\"term\":\"gleaming\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04961711\", \"07427078\"]}");
	add("{\"term\":\"gleaner\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10152022\", \"10152161\"]}");
	add("{\"term\":\"gleba\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11570791\"]}");
	add("{\"term\":\"glebe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13268127\"]}");
	add("{\"term\":\"glechoma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12868014\"]}");
	add("{\"term\":\"gleditsia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12516014\"]}");
	add("{\"term\":\"glee\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07547664\", \"07544765\"]}");
	add("{\"term\":\"gleefulness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07544765\"]}");
	add("{\"term\":\"gleet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05425042\"]}");
	add("{\"term\":\"gleichenia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13191184\"]}");
	add("{\"term\":\"gleicheniaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13190958\"]}");
	add("{\"term\":\"glen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09312502\"]}");
	add("{\"term\":\"glendower\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11022036\"]}");
	add("{\"term\":\"glengarry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03444555\"]}");
	add("{\"term\":\"glenn\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11022187\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }