package org.swtk.commons.dict.wordnet.index.name.instance.s.t.o.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSTOP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"stop\", \"synsetCount\":11, \"upperType\":\"NOUN\", \"ids\":[\"02856708\", \"02986245\", \"03193767\", \"04334462\", \"06856570\", \"07130622\", \"08674524\", \"14034398\", \"01058335\", \"01077970\", \"07380449\"]}");
	add("{\"term\":\"stopcock\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04334820\"]}");
	add("{\"term\":\"stopes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11340039\"]}");
	add("{\"term\":\"stopgap\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00179400\"]}");
	add("{\"term\":\"stoplight\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06887235\", \"07280695\"]}");
	add("{\"term\":\"stopover\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01058335\", \"08674731\"]}");
	add("{\"term\":\"stoppage\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01077970\", \"02856708\", \"14034398\"]}");
	add("{\"term\":\"stoppard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11340240\"]}");
	add("{\"term\":\"stopper\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"03974274\", \"04334963\", \"06781185\", \"06905397\"]}");
	add("{\"term\":\"stopping\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00102629\", \"03343088\"]}");
	add("{\"term\":\"stopple\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03974274\"]}");
	add("{\"term\":\"stops\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00494319\"]}");
	add("{\"term\":\"stopwatch\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04335324\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }