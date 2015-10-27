package org.swtk.commons.dict.wordnet.index.name.instance.c.o.r.k;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCORK {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"cork\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"02863403\", \"03113504\", \"08909627\", \"14847717\", \"14847397\"]}");
	add("{\"term\":\"corkage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13329017\"]}");
	add("{\"term\":\"corkboard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14847546\"]}");
	add("{\"term\":\"corker\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03113684\", \"06518594\"]}");
	add("{\"term\":\"corkscrew\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03113801\"]}");
	add("{\"term\":\"corkwood\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11763347\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }