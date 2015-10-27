package org.swtk.commons.dict.wordnet.index.name.instance.c.o.l.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCOLI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"colic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14349141\"]}");
	add("{\"term\":\"colicroot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12450703\"]}");
	add("{\"term\":\"colima\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09196912\"]}");
	add("{\"term\":\"colinus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01806981\"]}");
	add("{\"term\":\"coliphage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01337859\"]}");
	add("{\"term\":\"coliseum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02707808\"]}");
	add("{\"term\":\"colitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14364496\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }