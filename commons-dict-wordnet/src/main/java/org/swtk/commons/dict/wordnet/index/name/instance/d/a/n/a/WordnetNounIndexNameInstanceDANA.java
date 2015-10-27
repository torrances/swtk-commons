package org.swtk.commons.dict.wordnet.index.name.instance.d.a.n.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDANA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"dana\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09531941\"]}");
	add("{\"term\":\"danaea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13236697\"]}");
	add("{\"term\":\"danaid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02282289\"]}");
	add("{\"term\":\"danaidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02282094\"]}");
	add("{\"term\":\"danau\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09285993\"]}");
	add("{\"term\":\"danaus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02282471\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }