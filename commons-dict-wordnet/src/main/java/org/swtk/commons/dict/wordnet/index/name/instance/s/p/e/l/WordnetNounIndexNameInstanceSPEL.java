package org.swtk.commons.dict.wordnet.index.name.instance.s.p.e.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSPEL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"spelaeologist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10479852\"]}");
	add("{\"term\":\"spelaeology\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00799769\", \"06131161\"]}");
	add("{\"term\":\"speleologist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10479852\"]}");
	add("{\"term\":\"speleology\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00799769\", \"06131161\"]}");
	add("{\"term\":\"spell\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"07174442\", \"15271164\", \"15317305\", \"14430940\"]}");
	add("{\"term\":\"spellbinder\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10654388\"]}");
	add("{\"term\":\"spelldown\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07492206\"]}");
	add("{\"term\":\"speller\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06426966\", \"10654547\"]}");
	add("{\"term\":\"spelling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06364852\"]}");
	add("{\"term\":\"spelt\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12163582\"]}");
	add("{\"term\":\"spelter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15074312\"]}");
	add("{\"term\":\"spelunker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10479852\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }