package org.swtk.commons.dict.wordnet.index.name.instance.f.a.i.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFAIL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"failing\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00067721\", \"14486530\"]}");
	add("{\"term\":\"faille\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03322834\"]}");
	add("{\"term\":\"failure\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"14083145\", \"14502017\", \"00067217\", \"10292761\", \"14501461\", \"07332364\", \"00067456\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }