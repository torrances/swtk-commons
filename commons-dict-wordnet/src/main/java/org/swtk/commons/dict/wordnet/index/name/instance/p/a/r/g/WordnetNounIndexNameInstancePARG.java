package org.swtk.commons.dict.wordnet.index.name.instance.p.a.r.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePARG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"parget\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15001917\"]}");
	add("{\"term\":\"pargeting\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00719941\", \"03896055\", \"15001917\"]}");
	add("{\"term\":\"pargetry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03896055\"]}");
	add("{\"term\":\"pargetting\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00719941\", \"03896055\", \"15001917\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }