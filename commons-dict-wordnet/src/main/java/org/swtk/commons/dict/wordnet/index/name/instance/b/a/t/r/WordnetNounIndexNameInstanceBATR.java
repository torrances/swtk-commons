package org.swtk.commons.dict.wordnet.index.name.instance.b.a.t.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBATR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"batrachia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01642010\"]}");
	add("{\"term\":\"batrachian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01642406\"]}");
	add("{\"term\":\"batrachoididae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02551153\"]}");
	add("{\"term\":\"batrachomyomachia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07199312\"]}");
	add("{\"term\":\"batrachoseps\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01640119\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }