package org.swtk.commons.dict.wordnet.index.name.instance.o.u.t.f;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceOUTF {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"outfall\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03865128\"]}");
	add("{\"term\":\"outfield\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03865237\"]}");
	add("{\"term\":\"outfielder\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10406573\", \"10406683\"]}");
	add("{\"term\":\"outfit\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03624605\", \"03865478\", \"08291747\"]}");
	add("{\"term\":\"outfitter\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03865754\", \"10407411\"]}");
	add("{\"term\":\"outfitting\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01159625\"]}");
	add("{\"term\":\"outflow\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"09466357\", \"13550498\", \"07451261\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }