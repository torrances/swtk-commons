package org.swtk.commons.dict.wordnet.index.name.instance.o.r.d.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceORDE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ordeal\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01198967\", \"07302435\"]}");
	add("{\"term\":\"order\", \"synsetCount\":15, \"upperType\":\"NOUN\", \"ids\":[\"01011813\", \"04706004\", \"07294392\", \"08123900\", \"08164801\", \"13974030\", \"06665623\", \"08244135\", \"06541210\", \"06551761\", \"14520294\", \"08474004\", \"13991994\", \"05098520\", \"07183274\"]}");
	add("{\"term\":\"orderer\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10401068\", \"10401397\"]}");
	add("{\"term\":\"ordering\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01011813\", \"08474004\"]}");
	add("{\"term\":\"orderliness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14520294\", \"04775722\"]}");
	add("{\"term\":\"orderly\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10401503\", \"10401680\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }