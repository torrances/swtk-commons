package org.swtk.commons.dict.wordnet.index.name.instance.s.a.b.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSABE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"sabellian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06975194\"]}");
	add("{\"term\":\"saber\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02990947\", \"04128605\"]}");
	add("{\"term\":\"sabertooth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02133197\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }