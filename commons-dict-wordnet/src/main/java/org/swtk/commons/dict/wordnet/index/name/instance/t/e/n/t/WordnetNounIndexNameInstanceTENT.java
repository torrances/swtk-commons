package org.swtk.commons.dict.wordnet.index.name.instance.t.e.n.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTENT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"tent\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09479040\", \"04418399\"]}");
	add("{\"term\":\"tentacle\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02587274\", \"05202443\"]}");
	add("{\"term\":\"tentaculata\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01922145\"]}");
	add("{\"term\":\"tenter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04418970\"]}");
	add("{\"term\":\"tenterhook\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04419101\"]}");
	add("{\"term\":\"tenth\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13870055\", \"13760467\"]}");
	add("{\"term\":\"tenthredinidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02221215\"]}");
	add("{\"term\":\"tenting\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01057089\"]}");
	add("{\"term\":\"tentmaker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10721726\"]}");
	add("{\"term\":\"tentorium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05615157\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }