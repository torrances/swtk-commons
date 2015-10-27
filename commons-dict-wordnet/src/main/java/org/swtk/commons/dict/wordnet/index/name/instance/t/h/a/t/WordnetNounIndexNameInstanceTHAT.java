package org.swtk.commons.dict.wordnet.index.name.instance.t.h.a.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTHAT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"thatch\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"04424807\", \"11353998\", \"15094279\", \"05268809\"]}");
	add("{\"term\":\"thatcher\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10724860\", \"11357774\"]}");
	add("{\"term\":\"thatcherism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05996407\"]}");
	add("{\"term\":\"thatcherite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10724994\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }