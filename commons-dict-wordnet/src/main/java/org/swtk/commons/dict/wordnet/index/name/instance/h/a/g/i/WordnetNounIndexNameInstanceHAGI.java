package org.swtk.commons.dict.wordnet.index.name.instance.h.a.g.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHAGI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"hagiographa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06464994\"]}");
	add("{\"term\":\"hagiographer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10175252\"]}");
	add("{\"term\":\"hagiographist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10175252\"]}");
	add("{\"term\":\"hagiography\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06528233\"]}");
	add("{\"term\":\"hagiolatry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01048181\"]}");
	add("{\"term\":\"hagiologist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10175252\"]}");
	add("{\"term\":\"hagiology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06388623\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }