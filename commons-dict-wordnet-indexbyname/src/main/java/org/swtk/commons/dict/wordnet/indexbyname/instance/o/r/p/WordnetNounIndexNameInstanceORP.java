package org.swtk.commons.dict.wordnet.indexbyname.instance.o.r.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceORP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"orphan\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"01324261\", \"07026385\", \"10404195\", \"10404091\"]}");
	add("{\"term\":\"orphan site\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08679435\"]}");
	add("{\"term\":\"orphanage\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03861532\", \"14594762\"]}");
	add("{\"term\":\"orphanhood\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14594762\"]}");
	add("{\"term\":\"orphenadrine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03861668\"]}");
	add("{\"term\":\"orpheus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09595092\"]}");
	add("{\"term\":\"orphrey\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03861855\"]}");
	add("{\"term\":\"orpiment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14712992\"]}");
	add("{\"term\":\"orpin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12807224\"]}");
	add("{\"term\":\"orpine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12807224\"]}");
	add("{\"term\":\"orpington\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01796356\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }