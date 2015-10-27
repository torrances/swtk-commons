package org.swtk.commons.dict.wordnet.index.name.instance.p.a.r.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePARS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"parsec\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13679107\"]}");
	add("{\"term\":\"parsee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10421167\"]}");
	add("{\"term\":\"parseeism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06254575\"]}");
	add("{\"term\":\"parser\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06589545\"]}");
	add("{\"term\":\"parsi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10421167\"]}");
	add("{\"term\":\"parsiism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06254575\"]}");
	add("{\"term\":\"parsimoniousness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04840918\", \"04900720\"]}");
	add("{\"term\":\"parsimony\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04840918\", \"04900720\"]}");
	add("{\"term\":\"parsley\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07835872\", \"12963155\"]}");
	add("{\"term\":\"parsnip\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07751380\", \"12962296\", \"12962674\"]}");
	add("{\"term\":\"parson\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10003102\"]}");
	add("{\"term\":\"parsonage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03898254\"]}");
	add("{\"term\":\"parsons\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11244299\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }