package org.swtk.commons.dict.wordnet.indexbyname.instance.o.a.k;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceOAK {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"oak\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12288763\", \"12289435\"]}");
	add("{\"term\":\"oak apple\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13120493\"]}");
	add("{\"term\":\"oak blight\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14241775\"]}");
	add("{\"term\":\"oak chestnut\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12285029\"]}");
	add("{\"term\":\"oak fern\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13218172\"]}");
	add("{\"term\":\"oak leaf cluster\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06721603\"]}");
	add("{\"term\":\"oak tree\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12288763\"]}");
	add("{\"term\":\"oakland\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09086741\"]}");
	add("{\"term\":\"oakleaf goosefoot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11850141\"]}");
	add("{\"term\":\"oakley\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11230796\"]}");
	add("{\"term\":\"oakum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14990722\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }