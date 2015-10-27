package org.swtk.commons.dict.wordnet.index.name.instance.e.p.i.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceEPID {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"epidemic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07450133\"]}");
	add("{\"term\":\"epidemiologist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10081690\"]}");
	add("{\"term\":\"epidemiology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06059555\"]}");
	add("{\"term\":\"epidendron\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12082606\"]}");
	add("{\"term\":\"epidendrum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12082350\"]}");
	add("{\"term\":\"epidermis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05247554\"]}");
	add("{\"term\":\"epidiascope\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03297871\"]}");
	add("{\"term\":\"epididymis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05533279\"]}");
	add("{\"term\":\"epididymitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14368860\"]}");
	add("{\"term\":\"epidural\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14052134\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }