package org.swtk.commons.dict.wordnet.index.name.instance.e.n.d.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceENDA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"endaemonism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06170134\"]}");
	add("{\"term\":\"endameba\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01394916\"]}");
	add("{\"term\":\"endamoeba\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01394763\"]}");
	add("{\"term\":\"endamoebidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01394574\"]}");
	add("{\"term\":\"endangerment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14565454\"]}");
	add("{\"term\":\"endarterectomy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00674590\"]}");
	add("{\"term\":\"endarteritis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14366043\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }