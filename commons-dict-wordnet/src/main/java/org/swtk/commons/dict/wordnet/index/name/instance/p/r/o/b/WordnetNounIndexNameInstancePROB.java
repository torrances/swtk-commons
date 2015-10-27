package org.swtk.commons.dict.wordnet.index.name.instance.p.r.o.b;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePROB {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"probabilism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05984125\", \"06170497\"]}");
	add("{\"term\":\"probability\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04763427\", \"05098974\"]}");
	add("{\"term\":\"probable\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10477590\"]}");
	add("{\"term\":\"probate\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00155714\", \"06556423\"]}");
	add("{\"term\":\"probation\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01260931\", \"15322546\", \"15322715\"]}");
	add("{\"term\":\"probationer\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10497170\", \"10497298\"]}");
	add("{\"term\":\"probe\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00642765\", \"00948857\", \"04012787\", \"05808619\"]}");
	add("{\"term\":\"probenecid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04012960\"]}");
	add("{\"term\":\"probiotic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01352136\"]}");
	add("{\"term\":\"probity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04877024\"]}");
	add("{\"term\":\"problem\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05695143\", \"06796860\", \"14434009\"]}");
	add("{\"term\":\"proboscidea\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02505533\", \"12895756\"]}");
	add("{\"term\":\"proboscidean\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02505758\"]}");
	add("{\"term\":\"proboscidian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02505758\"]}");
	add("{\"term\":\"proboscis\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02455598\", \"05606839\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }