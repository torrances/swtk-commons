package org.swtk.commons.dict.wordnet.index.name.instance.b.i.t.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBITE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"bite\", \"synsetCount\":9, \"upperType\":\"NOUN\", \"ids\":[\"00361867\", \"00840477\", \"05000012\", \"06789825\", \"07492553\", \"07592939\", \"14321372\", \"07594641\", \"14310910\"]}");
	add("{\"term\":\"biteplate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02848368\"]}");
	add("{\"term\":\"biter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09877258\"]}");
	add("{\"term\":\"bitewing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02848531\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }