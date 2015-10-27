package org.swtk.commons.dict.wordnet.index.name.instance.m.e.l.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMELL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"mellaril\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04432397\"]}");
	add("{\"term\":\"mellivora\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02450831\"]}");
	add("{\"term\":\"mellon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11192599\"]}");
	add("{\"term\":\"mellowing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13534425\"]}");
	add("{\"term\":\"mellowness\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"04663805\", \"04965479\", \"04996251\", \"05726065\", \"07569690\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }