package org.swtk.commons.dict.wordnet.indexbyname.instance.p.y.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePYC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"pycnanthemum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12884218\"]}");
	add("{\"term\":\"pycnidium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11571071\"]}");
	add("{\"term\":\"pycnodysostosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14530135\"]}");
	add("{\"term\":\"pycnogonid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01789647\"]}");
	add("{\"term\":\"pycnogonida\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01789520\"]}");
	add("{\"term\":\"pycnosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14100149\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }