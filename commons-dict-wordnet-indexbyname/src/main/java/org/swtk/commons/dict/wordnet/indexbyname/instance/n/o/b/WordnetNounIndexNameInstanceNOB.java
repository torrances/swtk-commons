package org.swtk.commons.dict.wordnet.indexbyname.instance.n.o.b;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceNOB {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"nob\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10734226\"]}");
	add("{\"term\":\"nobel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11228678\"]}");
	add("{\"term\":\"nobelist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10379245\"]}");
	add("{\"term\":\"nobelium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14671900\"]}");
	add("{\"term\":\"nobility\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"14455458\", \"04877535\", \"08404938\"]}");
	add("{\"term\":\"noble\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10291374\"]}");
	add("{\"term\":\"nobleman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10291374\"]}");
	add("{\"term\":\"nobleness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04877535\"]}");
	add("{\"term\":\"noblesse\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08405234\", \"14455458\"]}");
	add("{\"term\":\"noblewoman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10262488\"]}");
	add("{\"term\":\"nobody\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09942876\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }