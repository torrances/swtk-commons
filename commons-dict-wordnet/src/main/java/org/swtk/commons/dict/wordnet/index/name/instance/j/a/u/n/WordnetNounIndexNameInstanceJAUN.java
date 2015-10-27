package org.swtk.commons.dict.wordnet.index.name.instance.j.a.u.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceJAUN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"jaundice\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04650754\", \"14343111\"]}");
	add("{\"term\":\"jaunt\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00312635\"]}");
	add("{\"term\":\"jauntiness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04641154\", \"04821256\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }