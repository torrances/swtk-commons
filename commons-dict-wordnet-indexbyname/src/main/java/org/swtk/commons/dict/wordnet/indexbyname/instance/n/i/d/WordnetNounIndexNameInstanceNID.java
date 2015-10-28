package org.swtk.commons.dict.wordnet.indexbyname.instance.n.i.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceNID {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"nidaros\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08783456\"]}");
	add("{\"term\":\"nidation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13517489\"]}");
	add("{\"term\":\"niddm\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14142418\"]}");
	add("{\"term\":\"nidularia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13067647\"]}");
	add("{\"term\":\"nidulariaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13067272\"]}");
	add("{\"term\":\"nidulariales\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13067045\"]}");
	add("{\"term\":\"nidus\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09393939\", \"14206179\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }