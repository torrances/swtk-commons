package org.swtk.commons.dict.wordnet.index.name.instance.p.a.r.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePARN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"parnahiba\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09408309\"]}");
	add("{\"term\":\"parnaiba\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09408309\"]}");
	add("{\"term\":\"parnassia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12822280\"]}");
	add("{\"term\":\"parnassus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09408479\"]}");
	add("{\"term\":\"parnell\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11243919\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }