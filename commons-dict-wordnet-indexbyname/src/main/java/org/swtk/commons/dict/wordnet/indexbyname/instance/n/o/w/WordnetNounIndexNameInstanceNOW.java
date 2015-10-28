package org.swtk.commons.dict.wordnet.indexbyname.instance.n.o.w;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceNOW {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"now\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15144861\"]}");
	add("{\"term\":\"nowadays\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15144478\"]}");
	add("{\"term\":\"nowhere\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14460133\"]}");
	add("{\"term\":\"nowness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05057266\"]}");
	add("{\"term\":\"nowrooz\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15248712\"]}");
	add("{\"term\":\"nowruz\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15248712\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }