package org.swtk.commons.dict.wordnet.indexbyname.instance.d.e.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDED {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ded\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06715976\"]}");
	add("{\"term\":\"dedicated file server\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03175125\"]}");
	add("{\"term\":\"dedication\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"01208643\", \"06417960\", \"06697128\", \"07466958\", \"04884616\"]}");
	add("{\"term\":\"dedifferentiation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13480043\"]}");
	add("{\"term\":\"deductible\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06405067\", \"13294573\"]}");
	add("{\"term\":\"deduction\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"00362929\", \"00361583\", \"05782126\", \"05788882\", \"13295620\", \"13350069\"]}");
	add("{\"term\":\"deductive reasoning\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05782126\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }