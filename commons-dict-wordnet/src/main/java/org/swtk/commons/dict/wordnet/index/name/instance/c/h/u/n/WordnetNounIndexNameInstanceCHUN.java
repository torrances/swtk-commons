package org.swtk.commons.dict.wordnet.index.name.instance.c.h.u.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCHUN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"chunga\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02017178\"]}");
	add("{\"term\":\"chungking\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08742994\"]}");
	add("{\"term\":\"chunk\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13780337\", \"07977630\"]}");
	add("{\"term\":\"chunking\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05739513\"]}");
	add("{\"term\":\"chunnel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03031618\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }