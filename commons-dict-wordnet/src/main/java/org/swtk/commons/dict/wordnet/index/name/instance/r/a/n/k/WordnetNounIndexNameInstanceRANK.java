package org.swtk.commons.dict.wordnet.index.name.instance.r.a.n.k;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceRANK {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"rank\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"08417922\", \"13970595\", \"08415136\", \"14453411\", \"08448952\"]}");
	add("{\"term\":\"ranker\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10526355\", \"10526508\"]}");
	add("{\"term\":\"rankin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11273792\"]}");
	add("{\"term\":\"rankine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13737010\"]}");
	add("{\"term\":\"ranking\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14452888\"]}");
	add("{\"term\":\"rankness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04987905\", \"05154833\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }