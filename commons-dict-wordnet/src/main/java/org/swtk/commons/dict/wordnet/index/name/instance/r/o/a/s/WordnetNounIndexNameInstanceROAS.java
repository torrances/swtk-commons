package org.swtk.commons.dict.wordnet.index.name.instance.r.o.a.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceROAS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"roast\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05742326\", \"07596347\"]}");
	add("{\"term\":\"roaster\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"04104854\", \"07661240\", \"10553834\", \"10553946\"]}");
	add("{\"term\":\"roasting\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00248309\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }