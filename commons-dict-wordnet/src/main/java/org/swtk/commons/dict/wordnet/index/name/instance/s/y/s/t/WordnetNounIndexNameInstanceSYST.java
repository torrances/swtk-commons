package org.swtk.commons.dict.wordnet.index.name.instance.s.y.s.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSYST {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"system\", \"synsetCount\":9, \"upperType\":\"NOUN\", \"ids\":[\"04775896\", \"05226371\", \"05911466\", \"05244557\", \"05734541\", \"05669841\", \"15005742\", \"08452398\", \"04384144\"]}");
	add("{\"term\":\"systematics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06162291\"]}");
	add("{\"term\":\"systematisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01011132\"]}");
	add("{\"term\":\"systematiser\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10401068\"]}");
	add("{\"term\":\"systematism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01033737\"]}");
	add("{\"term\":\"systematist\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10401068\", \"10713320\"]}");
	add("{\"term\":\"systematization\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01011132\"]}");
	add("{\"term\":\"systematizer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10401068\"]}");
	add("{\"term\":\"systemiser\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10401068\"]}");
	add("{\"term\":\"systemizer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10401068\"]}");
	add("{\"term\":\"systole\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07416009\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }