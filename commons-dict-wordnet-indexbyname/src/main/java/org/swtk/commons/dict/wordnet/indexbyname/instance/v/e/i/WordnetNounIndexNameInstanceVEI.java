package org.swtk.commons.dict.wordnet.indexbyname.instance.v.e.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceVEI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"veil\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"03554110\", \"05318121\", \"13115315\", \"03507475\"]}");
	add("{\"term\":\"veiling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03434824\"]}");
	add("{\"term\":\"vein\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"02471366\", \"09493352\", \"13118945\", \"07103814\", \"05426061\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }