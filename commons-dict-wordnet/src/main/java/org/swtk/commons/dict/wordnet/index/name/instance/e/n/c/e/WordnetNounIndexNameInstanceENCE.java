package org.swtk.commons.dict.wordnet.index.name.instance.e.n.c.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceENCE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"encelia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11984224\"]}");
	add("{\"term\":\"enceliopsis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11984738\"]}");
	add("{\"term\":\"encephalartos\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11623697\"]}");
	add("{\"term\":\"encephalitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14365537\"]}");
	add("{\"term\":\"encephalocele\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14490430\"]}");
	add("{\"term\":\"encephalogram\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03290641\", \"07017357\"]}");
	add("{\"term\":\"encephalography\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00907988\"]}");
	add("{\"term\":\"encephalomeningitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14366816\"]}");
	add("{\"term\":\"encephalomyelitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14365938\"]}");
	add("{\"term\":\"encephalon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05488747\"]}");
	add("{\"term\":\"encephalopathy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14109190\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }