package org.swtk.commons.dict.wordnet.index.name.instance.w.e.l.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceWELT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"welt\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04580567\", \"14322122\"]}");
	add("{\"term\":\"weltanschauung\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06221124\"]}");
	add("{\"term\":\"welter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14524151\"]}");
	add("{\"term\":\"welterweight\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"10793569\", \"10793686\", \"10793781\", \"13741634\"]}");
	add("{\"term\":\"weltschmerz\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07549123\"]}");
	add("{\"term\":\"welty\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11401452\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }